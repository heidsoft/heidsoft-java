package heidsoft.date;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

/**
 * <code>TestCalendar</code>
 *
 * @description: 测试日历类
 * @version:0.0.1
 * @author:liubin(wind.b.liu@leaptocloud.com)
 * @date:2016/4/15 16:27
 */
public class TestCalendar {
    public static final String DEFAULT_FORMAT = "yyyy-MM-dd HH:mm:ss";
    public static void main(String[] args) {

        SimpleDateFormat format = new SimpleDateFormat(DEFAULT_FORMAT);
        Calendar calendar = Calendar.getInstance();
        calendar.add(Calendar.MONTH, 0);
        calendar.set(Calendar.DAY_OF_MONTH,1);
        String first = format.format(calendar.getTime());
        System.out.println("===============first:"+first);

        Calendar ca = Calendar.getInstance();
        ca.set(Calendar.DAY_OF_MONTH, ca.getActualMaximum(Calendar.DAY_OF_MONTH));
        String last = format.format(ca.getTime());
        System.out.println("===============last:"+last);

        System.out.println("===============current:"+format.format(new Date()));
    }
}
