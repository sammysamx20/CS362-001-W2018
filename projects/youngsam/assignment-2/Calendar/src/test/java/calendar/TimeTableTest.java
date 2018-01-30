package calendar;
/**
 *  This class provides a basic set of test cases for the
 *  TimeTable class.
 */
import java.util.Calendar;
import java.util.Collections;
import java.util.GregorianCalendar;
import java.util.LinkedList;
import java.util.List;


import org.junit.Test;

import static org.junit.Assert.*;

public class TimeTableTest {

	 @Test
	  public void test01()  throws Throwable  {
		 TimeTable time = new TimeTable();
	 }
	 @Test
	  public void test02()  throws Throwable  {
		 int thisYear = 2018;
		 int thisMonth = 11;
		 int thisDay = 21;
		 
		GregorianCalendar today = new GregorianCalendar(thisYear, thisMonth, thisDay);
		 CalDay calday = new CalDay(today);
		 int thisYear1 = 2018;
		 int thisMonth1 = 11;
		 int thisDay1 = 24;
		 
		GregorianCalendar next = new GregorianCalendar(thisYear1, thisMonth1, thisDay1);
		 CalDay calday1 = new CalDay(next);
		 int startHour=21;
		 int startMinute=30;
		 int startDay=13;
		 int startMonth=01;
		 int startYear=2018;
		 String title="Birthday Party";
		 String description="This is my birthday party.";
		 
		
		 Appt appt = new Appt(startHour,
		          startMinute ,
		          startDay ,
		          startMonth ,
		          startYear ,
		          title,
		         description);	 
		 TimeTable time = new TimeTable();
		 LinkedList<Appt> listAppts = new LinkedList<Appt>();
		 time.getApptRange(listAppts,today,next);
	 }

	 @Test
	  public void test03()  throws Throwable  {
		 int thisYear = 2018;
		 int thisMonth = 11;
		 int thisDay = 21;
		 
		GregorianCalendar today = new GregorianCalendar(thisYear, thisMonth, thisDay);
		 CalDay calday = new CalDay(today);
		 int thisYear1 = 2018;
		 int thisMonth1 = 11;
		 int thisDay1 = 24;
		 
		GregorianCalendar next = new GregorianCalendar(thisYear1, thisMonth1, thisDay1);
		 CalDay calday1 = new CalDay(next);
		 int startHour=21;
		 int startMinute=30;
		 int startDay=13;
		 int startMonth=01;
		 int startYear=2018;
		 String title="Birthday Party";
		 String description="This is my birthday party.";
		  
		 Appt appt = new Appt(startHour,
		          startMinute ,
		          startDay ,
		          startMonth ,
		          startYear ,
		          title,
		         description);	 
		 TimeTable time = new TimeTable();
		 int[] recur = {3,4,5};
		 appt.setRecurrence(recur, Appt.RECUR_BY_WEEKLY, 1, Appt.RECUR_NUMBER_FOREVER);
		 Appt appt2 = new Appt(startHour,
				    startMinute ,
				    thisDay ,
				    3,
				    thisYear ,
				    title,
				    description);
				appt2.setRecurrence(recur, Appt.RECUR_BY_MONTHLY, 1, 20);
		 
				LinkedList<Appt> listAppts = new LinkedList<Appt>();
				listAppts.add(appt);
				listAppts.add(appt);
				listAppts.add(appt2);
				listAppts.add(appt2);
				listAppts.add(null);
				
				time.deleteAppt(listAppts, null);
				time.deleteAppt(null, appt);
				time.deleteAppt(listAppts, appt2);
				time.deleteAppt(null,null);
				System.out.println(time.deleteAppt(listAppts,null));
	 }
	 @Test
	  public void test04()  throws Throwable  {
		 int thisYear = 2018;
		 int thisMonth = 11;
		 int thisDay = 21;
		 
		GregorianCalendar today = new GregorianCalendar(thisYear, thisMonth, thisDay);
		 CalDay calday = new CalDay(today);
		 int thisYear1 = 2018;
		 int thisMonth1 = 11;
		 int thisDay1 = 24;
		 
		GregorianCalendar next = new GregorianCalendar(thisYear1, thisMonth1, thisDay1);
		 CalDay calday1 = new CalDay(next);
		 int startHour=21;
		 int startMinute=30;
		 int startDay=13;
		 int startMonth=01;
		 int startYear=2018;
		 String title="Birthday Party";
		 String description="This is my birthday party.";
		 //Construct a new Appointment object with the initial data	 
		 Appt appt = new Appt(startHour,
		          startMinute ,
		          startDay ,
		          startMonth ,
		          startYear ,
		          title,
		         description);	 
		 TimeTable time = new TimeTable();
		 int[] recur = {3,4,5};
		 appt.setRecurrence(recur, Appt.RECUR_BY_WEEKLY, 1, Appt.RECUR_NUMBER_FOREVER);
		 Appt appt2 = new Appt(startHour,
				    startMinute ,
				    thisDay ,
				    3,
				    thisYear ,
				    title,
				    description);
				appt2.setRecurrence(recur, Appt.RECUR_BY_MONTHLY, 1, 20);
		 
				LinkedList<Appt> listAppts = new LinkedList<Appt>();
				listAppts.add(appt);
				listAppts.add(appt);
				listAppts.add(appt2);
				listAppts.add(appt2);
				int[] a= {3,1,2,0};
				LinkedList<Appt> temp = time.permute(listAppts, a);
				assertEquals(temp.getFirst().getStartMonth(), listAppts.getFirst().getStartMonth());
	 }
	 @Test
	  public void test05()  throws Throwable  {
		 int thisYear = 2018;
		 int thisMonth = 1;
		 int thisDay = 29;
		 
		GregorianCalendar today = new GregorianCalendar(thisYear, thisMonth, thisDay);
		 CalDay calday = new CalDay(today);
		 int thisYear1 = 2018;
		 int thisMonth1 = 5;
		 int thisDay1 = 29;
		 
		GregorianCalendar next = new GregorianCalendar(thisYear1, thisMonth1, thisDay1);
		 CalDay calday1 = new CalDay(next);
		 int startHour=21;
		 int startMinute=30;
		
		 String title="Birthday Party";
		 String description="This is my birthday party.";
		 //Construct a new Appointment object with the initial data	 
		 Appt appt = new Appt(startHour,
		          startMinute ,
		          thisDay ,
		          4 ,
		          thisYear ,
		          title,
		         description);	 
		 TimeTable time = new TimeTable();
		 int[] recur = {2,3,4};
		 appt.setRecurrence(recur, Appt.RECUR_BY_WEEKLY, 1, Appt.RECUR_NUMBER_FOREVER);
		 Appt appt2 = new Appt(startHour,
		          startMinute ,
		          thisDay ,
		          3 ,
		          thisYear ,
		          title,
		         description);
				appt2.setRecurrence(recur, Appt.RECUR_BY_MONTHLY, 1, 20);
				
								//appt4.setRecurrence(recur, Appt.RECUR_BY_MONTHLY, 1, 20);
				LinkedList<Appt> listAppts = new LinkedList<Appt>();
				listAppts.add(appt);
			  	listAppts.add(appt2);
		
		
	 }
	 @Test
	  public void test06()  throws Throwable  {
		 boolean diagnose = true;

			/** Collection of all of the appointments for the calendar day */		
			LinkedList<Appt> listAppts = new LinkedList<Appt>();
			System.out.println("Calendar Main: \n" );
			
			
	     	/** the month the user is currently viewing **/
	     	int thisMonth;
	    	
	    	/** the year the user is currently viewing **/
	    	 int thisYear;
	    	
	    	/** todays date **/
	    	int thisDay;
	    	
			//get todays date
	    	Calendar rightnow = Calendar.getInstance();
	    	//current month/year/date is today
	    	thisMonth = rightnow.get(Calendar.MONTH)+1;
			thisYear = rightnow.get(Calendar.YEAR);
			thisDay = rightnow.get(Calendar.DAY_OF_MONTH);
			
			 int startHour=15;
			 int startMinute=30;
			 int startDay=thisDay+1;  	
			 int startMonth=thisMonth; 	
			 int startYear=thisYear; 	
			 String title="Birthday Party";
			 String description="This is my birthday party.";
			 //Construct a new Appointment object with the initial data	 
	         Appt appt = new Appt(startHour,
	                  startMinute ,
	                  startDay ,
	                  startMonth ,
	                  startYear ,
	                  title,
	                 description);
	          if(diagnose){
	          	System.out.println(appt.toString());
	          } 
	         
	         listAppts.add(appt);
	          
	      // create another appointment
	         startHour=14;
			 startMinute=30;
			 startDay=thisDay;  	
			 startMonth=thisMonth; 	
			 startYear=thisYear; 	
			 title="Class";
			 description="Rescheduled class.";
			 //Construct a new Appointment object with the initial data	 
	         appt = new Appt(startHour,
	                  startMinute ,
	                  startDay ,
	                  startMonth ,
	                  startYear ,
	                  title,
	                 description);
	        
	         if(diagnose){
	         	System.out.println(appt.toString());
	         }
	         listAppts.add(appt);
	         // create another appointment
	         startHour=13;
			 startMinute=30;
			 startDay=thisDay;		
			 startMonth=thisMonth;	
			 startYear=thisYear;	
			 title="Meeting Today";
			 description="Meeting with the students.";
			 //Construct a new Appointment object with the initial data	 
	         appt = new Appt(startHour,
	                  startMinute ,
	                  startDay ,
	                  startMonth ,
	                  startYear ,
	                  title,
	                 description);
	         
	         if(diagnose){
	         	System.out.println(appt.toString());
	         }
	         listAppts.add(appt);
	         // create another appointment
	         startHour=16;
			 startMinute=30;
			 startDay=thisDay+1;		
			 startMonth=thisMonth+1;	
			 startYear=thisYear;	
			 title="Visit";
			 description="Visiting my parents!";
			 //Construct a new Appointment object with the initial data	 
	         appt = new Appt(startHour,
	                  startMinute ,
	                  startDay ,
	                  startMonth ,
	                  startYear ,
	                  title,
	                 description);
	         int[] recurDaysArr={2,3,4};
	         appt.setRecurrence( recurDaysArr, Appt.RECUR_BY_WEEKLY, 2, Appt.RECUR_NUMBER_FOREVER);
	        
	         if(diagnose){
	         	System.out.println(appt.toString());
	         }
	         listAppts.add(appt);
	 		if(diagnose){
				System.out.println("The Appointments are not sorted!");
	         	System.out.println(listAppts.toString());
		
	            Collections.sort(listAppts);
				System.out.println("The Appointments are sorted!");
	         	System.out.println(listAppts.toString());
	            
	 		
	 		}



	         
			
			GregorianCalendar today = new GregorianCalendar(thisYear,thisMonth,thisDay);
			GregorianCalendar tomorrow = (GregorianCalendar)today.clone();
			tomorrow.add(Calendar.DAY_OF_MONTH,1);
			String todatDate=today.get(Calendar.MONTH)+ "/"+ today.get(Calendar.DAY_OF_MONTH)+"/"+today.get(Calendar.YEAR);
			String tomorrowDate=tomorrow.get(Calendar.MONTH)+ "/"+ tomorrow.get(Calendar.DAY_OF_MONTH)+"/"+tomorrow.get(Calendar.YEAR);

			if(diagnose){
				System.out.println("today is:" + todatDate);
				System.out.println("tomorrow is:" + tomorrowDate);
			}
			
			TimeTable time=new TimeTable();
	        //Create a linked list of calendar days to return
	        LinkedList<CalDay> calDays = new LinkedList<CalDay>();

			
	 		
			if (diagnose) {
		

				System.out.println("The number of appointments between "+ todatDate +" and " + tomorrowDate);
				calDays = new LinkedList<CalDay>();
				calDays = time.getApptRange(listAppts, today, tomorrow);
				for (int i = 0; i < calDays.size(); i++)
					System.out.println(calDays.get(i).toString());
				
			}
			
	 }
	 

	 	 @Test
	 	  public void test07()  throws Throwable  {
	 		 int startHour = 8;
	 		 int startMinute = 20;
	 		 int startDay = 4;
	 		 int startMonth = 1;
	 		 int startYear = 2018;
	 		 String title="Graduation party";
	 		 String description="This is my graduation party";
	 		 
	 		 int startHour2 = 10;
	 		 int startMinute2 = 20;
	 		 int startDay2 = 4;
	 		 int startMonth2 = 1;
	 		 int startYear2 = 2018;
	 		 String title3="Pizza party";
	 		 String description3="This is my pizza party";
	 		 
	 		 
	 		 
	 		 int startHour4 = 11;
	 		 int startMinute4 = 30;
	 		 int startDay4 = 8;
	 		 int startMonth4 = 2;
	 		 int startYear4 = 2018;
	 		 String title4="Dinner party";
	 		 String description4="This is my dinner party";
	 		 
	 		 LinkedList<Appt> listAppts = new LinkedList<Appt>();
	 		 Appt appt = new Appt(startHour, startMinute, startDay, startMonth, startYear, title, description);
	 		 Appt appt2 = new Appt(startHour2, startMinute2, startDay2, startMonth2, startYear2, title, description);

	 		 Appt appt4 = new Appt(startHour4, startMinute4, startDay4, startMonth4, startYear4, title4, description4);
	 		 
	 		 listAppts.add(appt);
	 		 listAppts.add(appt2);
	 		 
	 		 int thisYear = 2018;
	 		 int thisMonth = 1;
	 		 int thisDay = 29;
	 		 
	 		 int nextYear = 2018;
	 		 int nextMonth = 2;
	 		 int nextDay = 10;
	 		 

	 		 
	 		 
	 		 GregorianCalendar today = new GregorianCalendar(thisYear, thisMonth, thisDay);
	 		 GregorianCalendar today2 = new GregorianCalendar(thisYear, thisMonth, thisDay);
	 		 GregorianCalendar tomorrow = new GregorianCalendar(nextYear, nextMonth, nextDay); 
	 		 TimeTable time = new TimeTable();
	 		 LinkedList<CalDay> calDays = new LinkedList<CalDay>();
	 		 assertNotEquals("Second date specified is not before the first date specified.", time.getApptRange(listAppts, today, tomorrow));
	 		 int pv[] = {1, 0};
	 		 time.permute(listAppts, pv);
	 		 time.deleteAppt(listAppts, appt2);
	 		 try{
	 			 assertNotEquals(calDays, time.getApptRange(listAppts, today, today2));
	 			// time.getApptRange(listAppts, today, today2);
	 		 }catch(DateOutOfRangeException name){
	 			 //assertEquals( Second date specified is not  before the first date specified., name); can't test the exception for some reason
	 			 
	 			 
	 		 }
	 		TimeTable nullTable = new TimeTable();
	 		assertEquals(null, nullTable.deleteAppt(listAppts, null));
	 		
	 	 }
	 	 @Test
	 	  public void test08()  throws Throwable  {
	 		 LinkedList<Appt> listAppts = new LinkedList<Appt>();
	 	     	/** the month the user is currently viewing **/
	 	     	int thisMonth;
	 	    	
	 	    	/** the year the user is currently viewing **/
	 	    	 int thisYear;
	 	    	
	 	    	/** todays date **/
	 	    	int thisDay;
	 	    	
	 			//get todays date
	 	    	Calendar rightnow = Calendar.getInstance();
	 	    	//current month/year/date is today
	 	    	thisMonth = rightnow.get(Calendar.MONTH)+1;
	 			thisYear = rightnow.get(Calendar.YEAR);
	 			thisDay = rightnow.get(Calendar.DAY_OF_MONTH);
	 			
	 			 int startHour=15;
	 			 int startMinute=30;
	 			 int startDay=thisDay+1;  	
	 			 int startMonth=thisMonth; 	
	 			 int startYear=thisYear; 	
	 			 String title="Birthday Party";
	 			 String description="This is my birthday party.";
	 			 //Construct a new Appointment object with the initial data	 
	 	         Appt appt = new Appt(startHour,
	 	                  startMinute ,
	 	                  startDay ,
	 	                  startMonth ,
	 	                  startYear ,
	 	                  title,
	 	                 description);
	 	         listAppts.add(appt);
	 	         // create another appointment
	 	         startHour=14;
	 			 startMinute=30;
	 			 startDay=thisDay;  	
	 			 startMonth=thisMonth; 	
	 			 startYear=thisYear; 	
	 			 title="Class";
	 			 description="Rescheduled class.";
	 			 //Construct a new Appointment object with the initial data	 
	 	         appt = new Appt(startHour,
	 	                  startMinute ,
	 	                  startDay ,
	 	                  startMonth ,
	 	                  startYear ,
	 	                  title,
	 	                 description);
	 	         listAppts.add(appt);
	 	         // create another appointment
	 	         startHour=13;
	 			 startMinute=30;
	 			 startDay=thisDay;		
	 			 startMonth=thisMonth;	
	 			 startYear=thisYear;	
	 			 title="Meeting";
	 			 description="Work meeting.";
	 			 //Construct a new Appointment object with the initial data	 
	 	         appt = new Appt(startHour,
	 	                  startMinute ,
	 	                  startDay ,
	 	                  startMonth ,
	 	                  startYear ,
	 	                  title,
	 	                 description); 
	 	         listAppts.add(appt);
	 	     	GregorianCalendar today = new GregorianCalendar(thisYear,thisMonth,thisDay);
	 			GregorianCalendar tomorrow = (GregorianCalendar)today.clone();
	 			tomorrow.add(Calendar.DAY_OF_MONTH,1);
	 			TimeTable time=new TimeTable();
	 	        //Create a linked list of calendar days to return
	 	        LinkedList<CalDay> calDays = new LinkedList<CalDay>();
	 	        assertEquals(null, time.deleteAppt(listAppts, listAppts.get(1)));
	 			//LinkedList<Appt> listDeletedAppts=time.deleteAppt(listAppts, listAppts.get(2));

	 	 }
	 	 
	 	 @Test
	 	  public void test09()  throws Throwable  {
	          // create another appointment
	          int startHour=16;
	 		 int startMinute=30;
	 		 int startDay=15;		
	 		 int startMonth=8;	
	 		 int startYear=2018;	
	 		 String title="visiting";
	 		 String description="Visiting!";
	          Appt appt = new Appt(startHour,
	                  startMinute ,
	                  startDay ,
	                  startMonth ,
	                  startYear ,
	                  title,
	                 description);
	         int[] recurDaysArr={2,3,4};
	         appt.setRecurrence( recurDaysArr, Appt.RECUR_BY_WEEKLY, 2, Appt.RECUR_NUMBER_FOREVER);	
	 		LinkedList<Appt> listAppts = new LinkedList<Appt>();
	         listAppts.add(appt);
	         TimeTable time=new TimeTable();
	         GregorianCalendar today = new GregorianCalendar(2018, 8, 16);
	         GregorianCalendar tomorrow = new GregorianCalendar(2018, 8, 17);
	        assertNotEquals(null,time.getApptRange(listAppts, today, tomorrow));
	  
	 	 }
	 	@Test
		  public void test10()  throws Throwable  {
			LinkedList<Appt> listAppts1 = new LinkedList<Appt>();
			LinkedList<Appt> listAppts2 = new LinkedList<Appt>();

			int startHour=15;
			int startMinute=30;
			int startDay=16;
			int startMonth=01;
			int startYear=2018;
			String title="Birthday Party";
			String description="This is my birthday party.";
			//Construct a new Appointment object with the initial data
			Appt appt = new Appt(startHour,
					startMinute ,
					startDay ,
					startMonth ,
					startYear ,
					title,
					description);

			int[] recurArray={2,3,4};
			appt.setRecurrence( recurArray, Appt.RECUR_BY_MONTHLY, 2, Appt.RECUR_NUMBER_FOREVER);
			listAppts1.add(appt);

			startHour = 15;
			startMinute=30;
			startDay=17;
			startMonth=01;
			startYear=2018;
			title="Movingt";
			description="moving house.";
			
			Appt appt2 = new Appt(startHour,
					startMinute ,
					startDay ,
					startMonth ,
					startYear ,
					title,
					description);
			appt2.setRecurrence( recurArray, Appt.RECUR_BY_YEARLY, 2, Appt.RECUR_NUMBER_FOREVER);
			listAppts1.add(appt2);

			int[] temp = {1,0};

			TimeTable time = new TimeTable();
			GregorianCalendar firstDay = new GregorianCalendar(2018,8,18);
			GregorianCalendar lastDay = (GregorianCalendar)firstDay.clone();
			lastDay.add(Calendar.DAY_OF_MONTH,5);
			LinkedList<CalDay> calDays = new LinkedList<CalDay>();
			calDays = time.getApptRange(listAppts1, firstDay, lastDay);

			listAppts1 = time.permute(listAppts1,temp);

			
		 }
	}
	 
	