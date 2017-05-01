package com.jasonpiao.controller;

import com.jasonpiao.model.Userlog;
import com.jasonpiao.service.impl.BookServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Created by jason on 2016/12/21.
 */
@Controller

@RequestMapping("/book")
public class BookController {
    private BookServiceImpl bookServiceImpl;
@Autowired
    public void setBookServiceImpl(@Qualifier("bookServiceImpl") BookServiceImpl bookServiceImpl) {
        this.bookServiceImpl = bookServiceImpl;
    }

    //http://localhost:8080/book/view
    @RequestMapping(value="/view", method= RequestMethod.GET)//只处理由get方法发过来的请求
    public String viewBook(Userlog sessionUser,Model model) {


        return "book_overview";
    }

//    @RequestMapping(value="/view", method= RequestMethod.GET)
//    public ModelAndView getdata() {
//
//        List<BookInfo> list = bookServiceImpl.getAllBook();
//
//        //return back to index.jsp
//        ModelAndView model = new ModelAndView("index");
//        model.addObject("lists", list);
//
//        return model;
//
//    }
}
