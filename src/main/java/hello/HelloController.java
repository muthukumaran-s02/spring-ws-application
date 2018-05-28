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
        final long processingTime = 1000  * 1; //1 sec
        //System.out.println("Controller instance " + this.hashCode()); 

        long currentSystemTime = System.currentTimeMillis();
        while(currentSystemTime + processingTime  > System.currentTimeMillis());
        //System.out.println("Request id" + request.getParameter("name"));
        //System.out.println("Request "+ request.getClass() + "/" + request.hashCode());
        return "Greetings from Spring Boot!";
    }

}
