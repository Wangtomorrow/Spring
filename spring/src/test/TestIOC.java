package test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import pojo.Category;
import pojo.Product;

public class TestIOC {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext(new String[]{"applicationContext.xml"});
        Category c =(Category) context.getBean("c");
        System.out.println(c.getName());

        Product product = (Product) context.getBean("p");
        System.out.println(product.getCategory().getName());
        System.out.println(product.getName());
    }
}
