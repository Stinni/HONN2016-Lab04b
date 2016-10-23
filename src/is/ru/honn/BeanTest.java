package is.ru.honn;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by KristinnHeiðar on 23.10.2016.
 */
public class BeanTest
{
    public static void main(String[] args)
    {
        ApplicationContext context= new
                ClassPathXmlApplicationContext("/spring-config.xml");
        Person p = (Person) context.getBean("person");
        System.out.println(p);
    }
}
