package sale_backend.sale_backend.util;

import java.util.Calendar;
import java.util.Date;

public class DateOperation {
    public static Date increaseDateByDay(Integer inc, Date tarix) {
        Calendar cal = Calendar.getInstance();
        cal.setTime(tarix);
        cal.add(Calendar.DATE, inc);
        Date date = cal.getTime();
        return date;
    }
}
