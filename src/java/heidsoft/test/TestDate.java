import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * ʱ�䴦��Ƚ�
 *
 * @author heidsoft
 */
public class TestDate {

    public static void main(String[] args) {
        SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        Date date1 = new Date((long) 1407902056 * (long) 1000);
        Date date2 = new Date((long) 1407981217 * (long) 1000);
        Date date3 = new Date((long) 1409026689 * (long) 1000);

        System.out.println(formatter.format(date1));
        System.out.println(formatter.format(date2));
        System.out.println(formatter.format(date3));
    }
}
