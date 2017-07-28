package sample.spittr.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import sample.spittr.data.SpittleRepository;

/**
 * <p> .</p>
 * <p>
 * <p>Copyright <a href="http://www.qnext.com">Qnext Inc.</a> 2002-2017</p>
 * Date: 7/28/2017<br>
 * Time: 3:42 PM<br>
 *
 * @author <A href="mailto:mariov@qnext.com">Mario Veselinov</A>
 */
@Controller
@RequestMapping("/spittles")
public class SpittleController {

    private SpittleRepository spittleRepository;

    @Autowired
    public SpittleController(
            SpittleRepository spittleRepository) {
        this.spittleRepository = spittleRepository;
    }

    @RequestMapping(method=RequestMethod.GET)
    public String spittles(Model model) {
        model.addAttribute(
                spittleRepository.findSpittles(
                        Long.MAX_VALUE, 20));
        return "spittles";
    }

}