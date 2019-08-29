import java.text.DateFormatSymbols;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class DataTime {
    public static void main(String[] args) throws ParseException {

        int day = 5, month = 8, year=2015;
        Calendar c = Calendar.getInstance();
        String input_date= day+"/"+month+"/"+year;
        SimpleDateFormat format1=new SimpleDateFormat("dd/MM/yyyy");
        Date date=format1.parse(input_date);
        c.setTime(date);
        int dayOfWeek = c.get(Calendar.DAY_OF_WEEK);
        DateFormatSymbols dfs = new DateFormatSymbols();
        System.out.println("Weekday: " + dfs.getWeekdays()[dayOfWeek]);
    }
}
