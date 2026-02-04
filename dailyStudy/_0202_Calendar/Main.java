package dailyStudy._0202_Calendar;

public class Main {

	public static void main(String[] args) {

		int[] year = new int[200];
		int[] month = new int[200];
		int[] days = new int[200];
		int[] position = new int[200];
		int[] datePositionInMonth = new int[42];
		
		
		year[0] = 1960;
		month[0] = 1;
		days[0] = 31;
		position[0] = 6;

	
		

		Control.Loading(datePositionInMonth, year, month, days, position);
		Control.callByToday(datePositionInMonth, year, month, days, position);

		
	

		
		

		
	}

}
