package sample.spittr;

import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;

import java.util.Date;

/**
 * <p> .</p>
 * <p>
 * <p>Copyright <a href="http://www.qnext.com">Qnext Inc.</a> 2002-2017</p>
 * Date: 7/28/2017<br>
 * Time: 3:29 PM<br>
 *
 * @author <A href="mailto:mariov@qnext.com">Mario Veselinov</A>
 */
public class Spittle {
    private final Long id;
    private final String message;
    private final Date time;
    private Double latitude;
    private Double longitude;
    public Spittle(String message, Date time) {
        this(message, time, null, null);
    }
    public Spittle(
            String message, Date time, Double longitude, Double latitude) {
        this.id = null;
        this.message = message;
        this.time = time;
        this.longitude = longitude;
        this.latitude = latitude;
    }
    public long getId() {
        return id;
    }
    public String getMessage() {
        return message;
    }
    public Date getTime() {
        return time;
    }

    public Double getLongitude() {
        return longitude;
    }
    public Double getLatitude() {
        return latitude;
    }
    @Override
    public boolean equals(Object that) {
        return EqualsBuilder.reflectionEquals(this, that, true, "time".getClass());
    }
    @Override
    public int hashCode() {
        return HashCodeBuilder.reflectionHashCode(0, 5 ,this);
    }
}