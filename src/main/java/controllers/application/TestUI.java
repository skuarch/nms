package controllers.application;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

/**
 *
 * @author skuarch
 */
@Controller
public class TestUI {
    
    //==========================================================================
    @RequestMapping(value = "/testui", method = RequestMethod.GET)
    public ModelAndView testUI(){
    
        return new ModelAndView("application/testui");
        
        
    } // end testUI
    
    
} // end class