import javax.xml.crypto.Data;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.SimpleTimeZone;

public class DateDemo {
    public static void main(String args[]){
        Date date=new Date();
        System.out.println(date.toString());

        Date dnow = new Date();
        SimpleDateFormat ft= new SimpleDateFormat("E yyyy.MM.dd 'at' hh:mm:ss a zzz");
        System.out.print("Current Data"+ ft.format(dnow));
    }
}
