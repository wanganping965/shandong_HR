package com.jasonpiao.controller;

import com.jasonpiao.dao.daoop.UserlogOpImpl;
import com.jasonpiao.model.BookInfo;
import com.jasonpiao.model.Userlog;
import com.jasonpiao.model.UserlogBookInfo;
import com.jasonpiao.service.UserbookService;
import com.jasonpiao.service.impl.BookServiceImpl;
import com.jasonpiao.service.impl.UserServiceImpl;
import com.jasonpiao.service.impl.UserbookServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Created by jason on 2016/12/21.
 */
@Controller
@SessionAttributes("sessionUser")
@RequestMapping("/user")
public class UserController {
    private UserServiceImpl userServiceImpl;
    @Autowired
    public void setUserServiceImpl(@Qualifier("userServiceImpl") UserServiceImpl userServiceImpl) {
        this.userServiceImpl = userServiceImpl;
    }
    private BookServiceImpl bookServiceImpl;
    @Autowired
    public void setBookServiceImpl(@Qualifier("bookServiceImpl") BookServiceImpl bookServiceImpl) {
        this.bookServiceImpl = bookServiceImpl;
    }
    private UserbookServiceImpl userbookServiceImpl;
    @Autowired
    public void setUserbookServiceImpl(@Qualifier("userbookServiceImpl") UserbookServiceImpl userbookServiceImpl) {
        this.userbookServiceImpl = userbookServiceImpl;
    }


    //http://localhost:8080/user/login
    @RequestMapping(value="/login", method= RequestMethod.GET)
    public String gotoLogin(Model model) {
        return "login";
    }

    //http://localhost:8080/user/check
    @RequestMapping(value="/check", method= RequestMethod.POST)
    public String checkUser( Userlog userlog, Model model) {
        if(userServiceImpl.checkThisUser(userlog))
        {
            if(curuserlog==null)
            {
                curuserlog=userlog;
                model.addAttribute("sessionUser",userlog);
            }

            List<BookInfo> bookInfoList=bookServiceImpl.getAllBook();
            model.addAttribute("bookInfoList",bookInfoList);
            List<UserlogBookInfo> userlogBookInfoList=userbookServiceImpl.getUserBookById(curuserlog.getId());
            model.addAttribute("userlogBookInfoList",userlogBookInfoList);
            return "book_overview";
         }
        return "login_error";
    }
    //http://localhost:8080/user/overview
    @RequestMapping(value="/overview", method= RequestMethod.GET)
    public String bookoverview(  Model model)
    {
        List<BookInfo> bookInfoList=bookServiceImpl.getAllBook();
        model.addAttribute("bookInfoList",bookInfoList);
        List<UserlogBookInfo> userlogBookInfoList=userbookServiceImpl.getUserBookById(curuserlog.getId());
        model.addAttribute("userlogBookInfoList",userlogBookInfoList);
        return "book_overview";
    }

    //http://localhost:8080/user/enrol
    @RequestMapping(value="/enrol", method= RequestMethod.GET)
    public String UserEnrol(Model model) {
        return "user_enrol";
    }

    //http://localhost:8080/user/borrow
    @RequestMapping(value="/borrow", method= RequestMethod.POST)
    public String borrowBook(BookInfo bookInfo,Model model)
    {
       if( userbookServiceImpl.doBorrow(curuserlog.getId(),bookInfo.getBookname()))
       {
           return "redirect:/user/showbook";
       }
       else
       {
           return "borrow_error";
       }
    }
    //http://localhost:8080/user/renew
    @RequestMapping(value="/renew", method= RequestMethod.POST)
    public String renewBook(String bookname_,Model model)
    {
        if(userbookServiceImpl.doRenew(curuserlog.getId(),bookname_))
        {
            return "redirect:/user/showbook";
        }
       return "renew_error";
    }

    //http://localhost:8080/user/showbook
    @RequestMapping(value="/showbook", method= RequestMethod.GET)
    public String show(Model model)
    {
        List<UserlogBookInfo> userlogBookInfoList=userbookServiceImpl.getUserBookById(curuserlog.getId());
        model.addAttribute("userlogBookInfoList",userlogBookInfoList);

        return "user_book";
    }

    //http://localhost:8080/user/returnbook
    @RequestMapping(value="/returnbook", method= RequestMethod.POST)
    public String returnABook( String bookname, Model model) {
        if(userbookServiceImpl.doReturn(curuserlog.getId(),bookname))
        {
            return "redirect:/user/showbook";
        }
        return "return_error";
    }

    //http://localhost:8080/user/enrolcheck
    @RequestMapping(value="/enrolcheck", method= RequestMethod.POST)
    public String userEnrolCheck( Userlog userlog, Model model) {
        if(userServiceImpl.checkWhetherCanEnroll(userlog))
        {
            userServiceImpl.saveThisUser(userlog);
            return "redirect:/user/login";
        }
        return "user_enrol_error";
    }
    //http://localhost:8080/user/logout
    @RequestMapping(value="/logout", method= RequestMethod.GET)
    public String userlogOut( Model model) {
        curuserlog=null;
        return "login";
    }
    //http://localhost:8080/user/admin
    @RequestMapping(value="/admin", method= RequestMethod.GET)
    public String toAdminLogin( Model model)
    {
        return "admin_login";
    }
    //http://localhost:8080/user/admincheck
    @RequestMapping(value="/admincheck", method= RequestMethod.POST)
    public String checkadmin( Userlog userlog, Model model) {
       if(userServiceImpl.checkAdmin(userlog))
       {
           List<BookInfo> bookInfoList=bookServiceImpl.getAllBook();
           model.addAttribute("bookInfoList",bookInfoList);
           return "admin_index";
       }
        return "login_error";
    }
    @RequestMapping(value="/toaddBook", method= RequestMethod.GET)
    public String toaddBook(  Model model) {

        return "add_book";
    }
    @RequestMapping(value="/toAdminIndex", method= RequestMethod.GET)
    public String toAdminIndex(  Model model) {
        List<BookInfo> bookInfoList=bookServiceImpl.getAllBook();
        model.addAttribute("bookInfoList",bookInfoList);
        return "admin_index";
    }
    @RequestMapping(value="/addBook", method= RequestMethod.POST)
    public String addBook( BookInfo bookInfo, Model model) {

        if(bookServiceImpl.addABook(bookInfo))
        {
            List<BookInfo> bookInfoList=bookServiceImpl.getAllBook();
            model.addAttribute("bookInfoList",bookInfoList);
            return "admin_index";
        }
        return "add_book_error";
    }
    @RequestMapping(value="/todeleteBook", method= RequestMethod.GET)
    public String todeleteBook(  Model model) {
        List<BookInfo> bookInfoList=bookServiceImpl.getAllBook();
        model.addAttribute("bookInfoList",bookInfoList);
        return "delete_book";
    }
    @RequestMapping(value="/deleteBook", method= RequestMethod.POST)
    public String deleteBook( BookInfo bookInfo, Model model) {

        if(bookServiceImpl.deleteABook(bookInfo.getBookname()))
        {
            List<BookInfo> bookInfoList=bookServiceImpl.getAllBook();
            model.addAttribute("bookInfoList",bookInfoList);
            return "admin_index";
        }
        return "delete_error";
    }
    @RequestMapping(value="/toupdateBook", method= RequestMethod.GET)
    public String toupdateBook(  Model model) {
        List<BookInfo> bookInfoList=bookServiceImpl.getAllBook();
        model.addAttribute("bookInfoList",bookInfoList);
        return "update_book";
    }
    @RequestMapping(value="/updateBook", method= RequestMethod.POST)
    public String updateBook( BookInfo bookInfo, Model model) {

        if(bookServiceImpl.updateABook(bookInfo))
        {
            List<BookInfo> bookInfoList=bookServiceImpl.getAllBook();
            model.addAttribute("bookInfoList",bookInfoList);
            return "admin_index";
        }
        return "update_error";
    }
    static Userlog curuserlog;

}
