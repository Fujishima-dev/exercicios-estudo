package Study;     
import java.text.SimpleDateFormat;
import java.time.Instant;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;
import java.util.TimeZone;
	

      public class Sec11DateFormat {
	       public static void main(String[] args) {
	    
	       Locale.setDefault(Locale.US);
	       Scanner sc = new Scanner(System.in);
	       
	       Date x1 = new Date();
	       
	       SimpleDateFormat sdf1 = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
	       
	       System.out.println("Time now: " + sdf1.format(x1)); 
	       
	       SimpleDateFormat sdf2 = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
	       sdf2.setTimeZone(TimeZone.getTimeZone("GMT"));
	       
	       System.out.println("Time now at GMT: " + sdf2.format(x1));
	       
	       Date d = new Date();
	       
	       Calendar cal = Calendar.getInstance();
	       cal.setTime(d);
	       cal.add(Calendar.HOUR_OF_DAY, 10);
	       d = cal.getTime();
	       
	       int minute = cal.get(Calendar.MINUTE);
	      
	       System.out.println(d);
	       System.out.println(minute); 
	       
	       

	       }
	
 }
