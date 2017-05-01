package test1;


import com.jasonpiao.dao.daoop.BookInfoOpImpl;

import com.jasonpiao.model.BookInfo;

import org.junit.Test;

import java.io.IOException;
import java.util.List;

/**
 * Created by jason on 2016/12/21.
 */
public class TestBookinfoOpImpl extends BaseTest {
    @Test
    public void testdao() throws IOException {
        BookInfoOpImpl bookInfoOpImpl =( BookInfoOpImpl)ctx.getBean("bookInfoOpImpl");
        List<BookInfo> bookInfoList= bookInfoOpImpl.messageList();
        for(BookInfo bookInfo:bookInfoList)
        {
            System.out.println(bookInfo);
        }
    }
    @Test
    public void testinsert() throws IOException {
        BookInfoOpImpl bookInfoOpImpl =( BookInfoOpImpl)ctx.getBean("bookInfoOpImpl");
        BookInfo bookInfo=new BookInfo();
        bookInfo.setAll("鲁宾孙漂流记","人",5,"好书");
        bookInfoOpImpl.insertBookInfo(bookInfo);
        testdao();
    }

    @Test
    public void testselect ()
    {
        BookInfoOpImpl bookInfoOpImpl =( BookInfoOpImpl)ctx.getBean("bookInfoOpImpl");

       BookInfo bookInfo= bookInfoOpImpl.selectBookByName("计算机组成原理");

       System.out.println(bookInfo);

    }
    @Test
    public void testUpdate() throws IOException {
        BookInfoOpImpl bookInfoOpImpl =( BookInfoOpImpl)ctx.getBean("bookInfoOpImpl");
        BookInfo bookInfo=new BookInfo();
        bookInfo.setAll("鲁宾孙漂流记","好人",5,"好书");
        bookInfoOpImpl.updateBookInfo(bookInfo);
        testdao();
    }
    @Test
    public void testDelete() throws IOException {
        BookInfoOpImpl bookInfoOpImpl =( BookInfoOpImpl)ctx.getBean("bookInfoOpImpl");
        bookInfoOpImpl.deleteBookInfoByName("鲁宾孙漂流记");
        testdao();
    }


}
