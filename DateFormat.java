package TutorialQuaranta;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;


/*
 * JAVA 40 - LAVORARE CON DATE E ORE
 * 
 * data,ora, data e ora
 * formattare date
 * 
 */



public class DateFormat {
		public static void main(String[]args) {
			
			
			//ORA E ORA
			LocalDateTime x = LocalDateTime.now();    
			System.out.println(x);
			
			//DATA 
			LocalDate z = LocalDate.now();
			System.out.println(z);
			
			//FORMATTAZIONE DATA
			DateTimeFormatter formattazione = DateTimeFormatter.ofPattern("EEEE,dd-MMMM-yyyy");
			System.out.println(z.format(formattazione));
			
			//EE ---> giorni scritti a metà				 EEEE----> giorni scritti per intero
			//MM ---> mesi scritti a metà				 MMMM----> mesi scritti per intero
			
			//ORA
			LocalTime y = LocalTime.now();
			System.out.print(y);
			
			
			
			
		}

}
