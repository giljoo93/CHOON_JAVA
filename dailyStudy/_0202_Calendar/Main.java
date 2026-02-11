package dailyStudy._0202_Calendar;

import java.io.IOException;

public class Main {

	public static void main(String[] args)throws IOException {


		Model user = new Model();
		
				Control.Loading(user.datePositionInMonth, 
								user.year, 
								user.month, 
								user.days, 
								user.position);

				user.holidayReader();
				
			user.screen =
			
				Integer.parseInt(

					Control.callByToday(user.datePositionInMonth, 
										user.year, 
										user.month, 
										user.days, 
										user.position,
										user.holiday,
										user.holidays)

													);
		
		while(true) {
			
			
			user.screen = Control.mainChoice(user.datePositionInMonth, 
											 user.year, 
											 user.month, 
											 user.days, 
											 user.position, 
											 user.screen,
											 user.holiday,
						    				 user.holidays);
			
		}
				
	}

}
