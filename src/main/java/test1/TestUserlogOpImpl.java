package test1;

import com.jasonpiao.dao.daoop.UserlogOpImpl;
import com.jasonpiao.model.Userlog;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import org.junit.Test;

import java.io.IOException;
import java.sql.Date;
import java.util.List;

/**
 * Created by jason on 2016/12/13.
 */


public class TestUserlogOpImpl extends BaseTest {

    @Test
    public void testdao() throws IOException {
        UserlogOpImpl userlogOpImpl =(UserlogOpImpl)ctx.getBean("userlogOpImpl");
        List<Userlog> userlogList= userlogOpImpl.messageList();
        for(Userlog userLog:userlogList)
        {
            System.out.println(userLog.getId()+" "+userLog.getPswd());

        }
    }
    @Test
    public void testinsert() throws IOException {
        UserlogOpImpl userlogOpImpl =(UserlogOpImpl)ctx.getBean("userlogOpImpl");
        Userlog userlog=new Userlog();
        userlog.setId("哈哈");
        userlog.setPswd("213");
        userlogOpImpl.insertUserLog(userlog);
        List<Userlog> userlogList= userlogOpImpl.messageList();
        for(Userlog userLog:userlogList)
        {
            System.out.println(userLog.getId()+" "+userLog.getPswd());

        }
    }

    @Test
    public void testselect()
    {
        UserlogOpImpl userlogOpImpl =(UserlogOpImpl)ctx.getBean("userlogOpImpl");

        Userlog userlog=  userlogOpImpl.selectUserById("朴");

         System.out.println(userlog.getId()+" "+userlog.getPswd());

    }
    @Test
    public void testUpdate()
    {

        UserlogOpImpl userlogOpImpl =(UserlogOpImpl)ctx.getBean("userlogOpImpl");
        Userlog userlog=new Userlog();
        userlog.setId("哈哈");
        userlog.setPswd("222");
        userlogOpImpl.updateUserInfo(userlog);
        List<Userlog> userlogList= userlogOpImpl.messageList();
        for(Userlog userLog:userlogList)
        {
            System.out.println(userLog.getId()+" "+userLog.getPswd());

        }
    }
    @Test
    public void testDelete()
    {
        UserlogOpImpl userlogOpImpl =(UserlogOpImpl)ctx.getBean("userlogOpImpl");
        userlogOpImpl.deleteUserInfoById("朴成这");
        List<Userlog> userlogList= userlogOpImpl.messageList();
        for(Userlog userLog:userlogList)
        {
            System.out.println(userLog.getId()+" "+userLog.getPswd());

        }
    }


}
