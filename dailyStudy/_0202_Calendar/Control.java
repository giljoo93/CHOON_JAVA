package dailyStudy._0202_Calendar;

import java.util.*;
import java.time.LocalDate;

public class Control {

    static Scanner input = new Scanner(System.in);

    
//  달력을 만드는 메서드
    public static void Loading(int[] datePositionInMonth, 
    						   int[] year, 
    						   int[] month, 
    						   int[] days, 
    						   int[] position) 
    {
    	
    	
        View.pushScreen();
        

        Model.setCalender(datePositionInMonth, 
        				  year, 
        				  month, 
        				  days, 
        				  position);
    
        
    }

//  오늘일자의 달력을 불러오는 메서드
    public static String callByToday (int[] datePositionInMonth, 
    								  int[] year, 
    								  int[] month, 
    								  int[] days, 
    								  int[] position,
    								  boolean[] holiday,
    								  String[] holidays) 
    {

        LocalDate today = LocalDate.now();
        
        int whereToday =0;
        
        int holdYear = Integer.parseInt(
				String.valueOf(today).substring(0, 4));
		int holdMonth = Integer.parseInt(
				String.valueOf(today).substring(5, 7));
		int holdDay = Integer.parseInt(
		 		String.valueOf(today).substring(8, 10));



        int tempYear;
        int tempMonth;
        for (int i = 0; i < year.length ; i++) {
            tempYear = year[i];
            tempMonth = month[i];
            if(tempYear == holdYear && tempMonth == holdMonth) {
             
            	
                whereToday = i;
                
            }
        }

        int todayYear = year[whereToday];
        int todayMonth = month[whereToday];
        int todayDays = days[whereToday];
        int todayPosition = position[whereToday];

        Model.setMonth(datePositionInMonth, todayPosition, todayDays);
        Model.findholiday(year, month, datePositionInMonth, holiday, holidays);
        View.pushScreen();
        View.calendarTop(todayYear, todayMonth);
        View.dateStructure(holiday, datePositionInMonth, holdDay);
        View.calendarBottom();


        return String.valueOf(holdYear) +""+ 
        	  (String.valueOf(holdMonth).length()==1 ? 
        			   "0"+String.valueOf(holdMonth) : String.valueOf(holdMonth)) +""+ 
        	  (String.valueOf(holdDay).length()==1 ?
        			  "0"+String.valueOf(holdDay) : String.valueOf(holdDay));
    }


//  원하는 달력을 호출하는 메서드

    public static String callBySelect (int[] datePositionInMonth, 
    								   int[] year, 
    								   int[] month, 
    								   int[] days, 
    								   int[] position, 
    								   int inputData,
    								   boolean[] holiday,
    								   String[] holidays) 
    {



        int today = inputData;

        

        int whereToday =0;
        int holdYear = Integer.parseInt(
				String.valueOf(today).substring(0, 4));
		int holdMonth = Integer.parseInt(
				String.valueOf(today).substring(4, 6));
		int holdDay = Integer.parseInt(
		 		String.valueOf(today).substring(6, 8));

 

        int tempYear;
        int tempMonth;
        for (int i = 0; i < year.length ; i++) {
            tempYear = year[i];
            tempMonth = month[i];
            if(tempYear == holdYear && tempMonth == holdMonth) {
                

                whereToday = i;
                
            }
        }

        int todayYear = year[whereToday];
        int todayMonth = month[whereToday];
        int todayDays = days[whereToday];
        int todayPosition = position[whereToday];

        Model.setMonth(datePositionInMonth, todayPosition, todayDays);
        View.pushScreen();
        View.calendarTop(todayYear, todayMonth);
        View.dateStructure(holiday, datePositionInMonth, holdDay);
        View.calendarBottom();
        
        return String.valueOf(holdYear) + ""+
          	  (String.valueOf(holdMonth).length()==1 ? 
          			   "0"+String.valueOf(holdMonth) : String.valueOf(holdMonth)) +""+ 
          	  (String.valueOf(holdDay).length()==1 ?
          			  "0"+String.valueOf(holdDay) : String.valueOf(holdDay));
        
    }

//  원하는 달력을 호출하는 메서드

    public static void movePage (int[] datePositionInMonth, 
    							 int year, 
    							 int month, 
    							 int days, 
    							 int position, 
    							 int holdDay,
    							 boolean[] holiday,
    							 String[] holidays) 
    {


        int todayYear = year;
        int todayMonth = month;
        int todayDays = days;
        int todayPosition = position;

        Model.setMonth(datePositionInMonth, todayPosition, todayDays);
        View.pushScreen();
        View.calendarTop(todayYear, todayMonth);
        View.dateStructure(holiday, datePositionInMonth, holdDay);
        View.calendarBottom();
        
        
    }
    
    
    
    public static int mainChoice (int[] datePositionInMonth, 
    							  int[] year, 
    							  int[] month, 
    							  int[] days, 
    							  int[] position, 
    							  int screen,
    							  boolean[] holiday,
    							  String[] holidays) 
    {

    	int index = Model.findArray(year, month, screen);
    	int holdDay = Integer.parseInt(
		 		String.valueOf(screen).substring(6, 8)
		 		);
    	
    	View.mainMenu();
    	
    	int userChoice = input.nextInt();
    	
    	if(String.valueOf(userChoice).length() == 8) {
//    		8자리 숫자를 그냥 입력했을때.
    		return Integer.parseInt(callBySelect(datePositionInMonth, 
    											 year, 
    											 month, 
    											 days, 
    											 position, 
    											 userChoice,
    											 holiday,
    											 holidays));
    	} else {
    	
    	
	    	switch (userChoice) {
	   
	    	case 1:
	    		index = index - 12;
	    		movePage(datePositionInMonth,
	    				 year[index],
	    			     month[index],
	    			     days[index], 
	    			     position[index], 
	    			     holdDay,
	    			     holiday,
	    				 holidays);
	    		
	    		return Integer.parseInt(String.valueOf(year[index]) + ""+
	    	          	  (String.valueOf(month[index]).length()==1 ? 
	    	          			   "0"+String.valueOf(month[index]) : String.valueOf(month[index])) +""+ 
	    	          	  (String.valueOf(holdDay).length()==1 ?
	    	          			  "0"+String.valueOf(holdDay) : String.valueOf(holdDay)));
	    		
	    	case 2:
	    		index = index + 12;
	    		movePage(datePositionInMonth, 
	    				 year[index], 
	    				 month[index], 
	    				 days[index], 
	    				 position[index], 
	    				 holdDay,
	    				 holiday,
	    				 holidays);
	    		
	    		return Integer.parseInt(String.valueOf(year[index]) + ""+
	  	          	  (String.valueOf(month[index]).length()==1 ? 
	  	          			   "0"+String.valueOf(month[index]) : String.valueOf(month[index])) +""+ 
	  	          	  (String.valueOf(holdDay).length()==1 ?
	  	          			  "0"+String.valueOf(holdDay) : String.valueOf(holdDay)));
	    		
	    	case 3:
	    		index = index - 1;
	    		movePage(datePositionInMonth, 
	    				 year[index], 
	    				 month[index], 
	    				 days[index], 
	    				 position[index], 
	    				 holdDay,
	    				 holiday,
	    				 holidays);
	    		
	    		return Integer.parseInt(String.valueOf(year[index]) + ""+
	  	          	  (String.valueOf(month[index]).length()==1 ? 
	  	          			   "0"+String.valueOf(month[index]) : String.valueOf(month[index])) +""+ 
	  	          	  (String.valueOf(holdDay).length()==1 ?
	  	          			  "0"+String.valueOf(holdDay) : String.valueOf(holdDay)));
	    		
	    	case 4:
	    		index = index + 1;
	    		movePage(datePositionInMonth, 
	    				 year[index], 
	    				 month[index], 
	    				 days[index], 
	    				 position[index], 
	    				 holdDay,
	    				 holiday,
	    				 holidays);
	    		
	    		return Integer.parseInt(String.valueOf(year[index]) + ""+
	  	          	  (String.valueOf(month[index]).length()==1 ? 
	  	          			   "0"+String.valueOf(month[index]) : String.valueOf(month[index])) +""+ 
	  	          	  (String.valueOf(holdDay).length()==1 ?
	  	          			  "0"+String.valueOf(holdDay) : String.valueOf(holdDay)));
	    		    		
	    	case 0:
	    		System.out.println("달력 프로그램을 종료합니다.");
	    		System.exit(0);
	    		
	    	
	    	}
    	}
    	return 0;
    }


}



