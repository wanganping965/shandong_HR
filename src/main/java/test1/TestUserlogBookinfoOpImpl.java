package test1;



import com.jasonpiao.dao.daoop.UserlogBookInfoOpImpl;
import com.jasonpiao.model.UserlogBookInfo;
import org.junit.Test;

import java.io.IOException;
import java.sql.Time;
import java.sql.Timestamp;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.sql.Date;
import java.util.List;

/**
 * Created by jason on 2016/12/21.
 */
public class TestUserlogBookinfoOpImpl extends BaseTest {
    @Test
    public void testdao() throws IOException {
        UserlogBookInfoOpImpl userlogBookInfoOpImpl =(UserlogBookInfoOpImpl)ctx.getBean("userlogBookInfoOpImpl");
        List<UserlogBookInfo> userlogBookInfoList= userlogBookInfoOpImpl.messageList();
        for(UserlogBookInfo userlogBookInfo:userlogBookInfoList)
        {
            System.out.println(userlogBookInfo);
        }


    }
    @Test
    public void testinsert() throws IOException {
        UserlogBookInfoOpImpl userlogBookInfoOpImpl =(UserlogBookInfoOpImpl)ctx.getBean("userlogBookInfoOpImpl");
        UserlogBookInfo userlogBookInfo=new UserlogBookInfo();
        userlogBookInfo.setAll("jason","计算机组成原理",Date.valueOf("2012-02-08"),Date.valueOf("2013-02-08"),0,null);
        userlogBookInfoOpImpl.insertUserlogBookInfo(userlogBookInfo);
        testdao();
    }

    @Test
    public void testselect ()
    {
        UserlogBookInfoOpImpl userlogBookInfoOpImpl =(UserlogBookInfoOpImpl)ctx.getBean("userlogBookInfoOpImpl");
        List<UserlogBookInfo> userlogBookInfoList= userlogBookInfoOpImpl.selectUserlogBookInfoById("朴成");
        for(UserlogBookInfo userlogBookInfo:userlogBookInfoList)
        {
            System.out.println(userlogBookInfo);
        }
    }
    @Test
    public void testUpdate() throws IOException {
        UserlogBookInfoOpImpl userlogBookInfoOpImpl =(UserlogBookInfoOpImpl)ctx.getBean("userlogBookInfoOpImpl");
        UserlogBookInfo userlogBookInfo=new UserlogBookInfo();

        userlogBookInfo.setAll("jason","计算机组成原理",Date.valueOf("2012-02-08"),Date.valueOf("2013-02-08"),0,Date.valueOf("2014-02-08"));
        userlogBookInfoOpImpl.updateUserlogBookInfo(userlogBookInfo);
        testdao();
    }
    @Test
    public void testDelete() throws IOException {
        UserlogBookInfoOpImpl userlogBookInfoOpImpl =(UserlogBookInfoOpImpl)ctx.getBean("userlogBookInfoOpImpl");
        UserlogBookInfo userlogBookInfo=new UserlogBookInfo();
        userlogBookInfo.setAll("jason","计算机组成原理",Date.valueOf("2012-02-08"),Date.valueOf("2013-02-08"),0,Date.valueOf("2014-02-08"));
        userlogBookInfoOpImpl.deleteUserlogBookInfo(userlogBookInfo);
        testdao();
    }

    @Test
    public void testTime()
    {
        Date date=new Date(System.currentTimeMillis());
        System.out.println(date);
        String[] s=date.toString().split("-");
        int year,month,day;
        year=Integer.valueOf(s[0]);
        month=Integer.valueOf(s[1]);
        day=Integer.valueOf(s[2]);
        if(month+1>12)
        {
            year++;
            month=1;
        }
        else
        {
            month++;
        }
        day=28;
        String f="";
        f=String.valueOf(year)+"-"+String.valueOf(month)+"-"+String.valueOf(day);
        System.out.println(f);
    }
}
