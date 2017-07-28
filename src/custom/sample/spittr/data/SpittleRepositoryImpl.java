package sample.spittr.data;

import org.springframework.stereotype.Component;
import sample.spittr.Spittle;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * <p> .</p>
 * <p>
 * <p>Copyright <a href="http://www.qnext.com">Qnext Inc.</a> 2002-2017</p>
 * Date: 7/28/2017<br>
 * Time: 5:39 PM<br>
 *
 * @author <A href="mailto:mariov@qnext.com">Mario Veselinov</A>
 */
@Component
public class SpittleRepositoryImpl implements SpittleRepository {
    public List<Spittle> findSpittles(long max, int count) {
        List<Spittle> spittles = new ArrayList<Spittle>();
        for (int i=0; i < count; i++) {
            spittles.add(new Spittle("Spittle " + i, new Date()));
        }
        return spittles;
    }
}
