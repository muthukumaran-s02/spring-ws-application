package hello;

import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class HelloController {

    @Autowired
    HttpServletRequest request;

    @RequestMapping("/")
    public String index() throws Exception{
        System.out.println("Controller instance " + this.hashCode()); 
        Thread.sleep(1000);

        System.out.println("Request id" + request.getParameter("name"));
        System.out.println("Request "+ request.getClass() + "/" + request.hashCode());
        return "Greetings from Spring Boot!";
    }

}
