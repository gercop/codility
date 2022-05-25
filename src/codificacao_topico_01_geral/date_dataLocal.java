package codificacao_topico_01_geral;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.Calendar;
import java.util.Date;

public class date_dataLocal {

	public static void main(String[] args) {
		System.out.println(LocalDate.now()); //LocalDate is the newest class added in java 8
		System.out.println( new SimpleDateFormat("yyyy-MM-dd").format(new Date()) );
		System.out.println( new Date(System.currentTimeMillis()) );		
		System.out.println( Calendar.getInstance().getTime() );
		
		

	}

}
