package test1;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by jason on 2016/12/21.
 */
public class BaseTest {
    public ApplicationContext ctx = new ClassPathXmlApplicationContext("file:D:\\Documents\\IdeaProjects\\book\\src\\main\\webapp\\WEB-INF\\applicationContext.xml");


}
