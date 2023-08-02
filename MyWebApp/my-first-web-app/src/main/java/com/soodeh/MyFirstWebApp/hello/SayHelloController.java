package com.soodeh.MyFirstWebApp.hello;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class SayHelloController {
    //"say hello"

    @RequestMapping("say-hello")
    @ResponseBody
    public String sayHello(){
        return "hi";
    }
    @RequestMapping("say-hello-html")

    public String sayHelloHtml(){
        StringBuffer sb=new StringBuffer();
        sb.append("<html>");
        sb.append("<head>");
        sb.append("<title> My first html page</title>");
        sb.append("</head>");
        sb.append("<body>");
        sb.append("My first html page");
        sb.append("</body>");
        sb.append("</html>");

        return sb.toString();

    }
    //JSP- most popular
    @RequestMapping("say-hello-jsp")

    public String sayHelloJSP(){
        System.out.println("test");
        return "sayHello";
    }


}
