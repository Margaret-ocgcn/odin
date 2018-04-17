package com.odin.frigg.com.odin.frigg.web;

import com.odin.frigg.com.odin.frigg.web.common.BaseController;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@EnableAutoConfiguration
public class LoginController extends BaseController {
    @RequestMapping("/hello")
    public String index() {
//		ApplicationContext context = new AnnotationConfigApplicationContext(BeanConfiguration.class);
        // Dict dict = (Dict) context.getBean("dict");
        // System.out.println(dict.getValue("test"));
        System.out.println(getValue("test"));
        return "Hello World";
    }
}
