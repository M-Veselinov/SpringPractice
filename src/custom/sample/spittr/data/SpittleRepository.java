package sample.spittr.data;

import sample.spittr.Spittle;

import java.util.List;

/**
 * <p> .</p>
 * <p>
 * <p>Copyright <a href="http://www.qnext.com">Qnext Inc.</a> 2002-2017</p>
 * Date: 7/28/2017<br>
 * Time: 3:30 PM<br>
 *
 * @author <A href="mailto:mariov@qnext.com">Mario Veselinov</A>
 */
public interface SpittleRepository {

    List<Spittle> findSpittles(long max, int count);

}
