package controllers.application;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

/**
 *
 * @author skuarch
 */
@Controller
public class Login  {
    
    private static final Logger logger = Logger.getLogger(Login.class);
    
    //==========================================================================
    @RequestMapping("/login")
    public ModelAndView login(){    
        
        String message = "chiales";
        return new ModelAndView("application/login","message",message);
        
    } // end login
    
} // end class
