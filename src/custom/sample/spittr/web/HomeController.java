package sample.spittr.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * <p> .</p>
 * <p>
 * <p>Copyright <a href="http://www.qnext.com">Qnext Inc.</a> 2002-2017</p>
 * Date: 7/28/2017<br>
 * Time: 2:45 PM<br>
 *
 * @author <A href="mailto:mariov@qnext.com">Mario Veselinov</A>
 */
@Controller
@RequestMapping(value="/")
public class HomeController {

    @RequestMapping(method=RequestMethod.GET)
    public String home() {
        return "home";
    }

}