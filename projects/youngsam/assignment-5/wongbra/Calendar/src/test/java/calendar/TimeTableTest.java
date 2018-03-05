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
		 boolean tester = true;

					
			LinkedList<Appt> listAppts = new LinkedList<Appt>();
			System.out.println("Calendar Main: \n" );
			
	     	int thisMonth;
	    	
	    	 int thisYear;
	    
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
	          if(tester){
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
	        
	         if(tester){
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
	         
	         if(tester){
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
	        
	         if(tester){
	         	System.out.println(appt.toString());
	         }
	         listAppts.add(appt);
	 		if(tester){
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

			if(tester){
				System.out.println("today is:" + todatDate);
				System.out.println("tomorrow is:" + tomorrowDate);
			}
			
			TimeTable time=new TimeTable();
	        //Create a linked list of calendar days to return
	        LinkedList<CalDay> calDays = new LinkedList<CalDay>();

			
	 		
			if (tester) {
		

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
	 	        assertNotEquals(null, time.deleteAppt(listAppts, listAppts.get(1)));
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
		@Test

		public void test11()  throws Throwable  {
			
			 int startHour1 = 8;
			 int startMinute1 = 20;
			 int startDay1 = 4;
			 int startMonth1 = 1;
			 int startYear1 = 2018;
			 String title1="Graduation party";
			 String description1="This is my graduation party";
			
			LinkedList<Appt> listAppts = new LinkedList<Appt>();
			
			Appt appt1 = new Appt(startHour1, startMinute1, startDay1, startMonth1, startYear1, title1, description1);
			listAppts.add(appt1);
			TimeTable timeTable=new TimeTable();
			int[] recurringDaysArr = null;
			appt1.setRecurrence(recurringDaysArr, 2, 3, 9);
			listAppts.add(appt1);

			int[] recurringDaysArr2 = {1, 2, 3}; 
			appt1.setRecurrence(recurringDaysArr2, 2, 2, -2);
			listAppts.add(appt1);
			int[] recurringDays3 = new int[0];
			appt1.setRecurrence(recurringDays3, 3, 3, 3);

			 int startHour2 = 9;
			 int startMinute2 = 12;
			 int startDay2 = 4;
			 int startMonth2 = 1;
			 int startYear2 = 2018;
			 String title2="Birthday party";
			 String description2="This is my birthday party";
			
			Appt appt2 = new Appt(startHour2, startMinute2, startDay2, startMonth2, startYear2, title2, description2);
			assertNull(timeTable.deleteAppt(listAppts,appt2));

		}
		public void test12()	throws Throwable   {
			GregorianCalendar inc50west = new GregorianCalendar(2018, 7, 27);
			CalDay calday = new CalDay(inc50west);

			calday.iterator();

			CalDay calday2 = new CalDay();

			assertEquals(null, calday2.iterator());

		}
		 @Test
			public void test13()  throws Throwable  {
				GregorianCalendar today = new GregorianCalendar(2018, 8, 17);
				CalDay calday = new CalDay(today);

				String today1 = calday.toString();

				assertTrue(today1.contains("8/17/2018"));

				Appt appt = new Appt(16, 1,27, 7,2018,
						"stuff", "stuff games");

				calday.addAppt(appt);
				calday.addAppt(appt);
				calday.addAppt(appt);

				assertTrue(calday.toString().contains("stuff"));
				assertTrue(calday.toString().contains("stuff games"));
			
				assertFalse(calday.toString().contains("hi"));
				CalDay calday2 = new CalDay();
				assertTrue(calday2.toString().matches(""));

			}
			@Test	
			  public void test14()  throws Throwable  {
				LinkedList<Appt> listAppts = new LinkedList<Appt>();
				int thisMonth;
		    	 int thisYear;
		    	int thisDay;
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
				 String title="fdasf";
				 String description="Thfds.";
				 //Construct a new Appointment object with the initial data	 
		         Appt appt = new Appt(startHour,
		                  startMinute ,
		                  startDay ,
		                  startMonth ,
		                  startYear ,
		                  title,
		                 description);
						 appt.setRecurrence( null, Appt.RECUR_BY_WEEKLY, 1, Appt.RECUR_NUMBER_FOREVER);
		         listAppts.add(appt);
		          
		      // create another appointment
		         startHour=17;
				 startMinute=30;
				 startDay=thisDay;  	
				 startMonth=thisMonth; 	
				 startYear=thisYear; 	
				 title="ugh";
				 description="Rafdasfd.";
				 //Construct a new Appointment object with the initial data	 
		         appt = new Appt(startHour,
		                  startMinute ,
		                  startDay ,
		                  startMonth ,
		                  startYear ,
		                  title,
		                 description);
				int[] recurDaysArr={4,7,8};
		         appt.setRecurrence( recurDaysArr, Appt.RECUR_BY_YEARLY, 1, Appt.RECUR_NUMBER_NEVER);
		         listAppts.add(appt);
		         // create another appointment
		         startHour=15;
				 startMinute=30;
				 startDay=thisDay;		
				 startMonth=thisMonth;	
				 startYear=thisYear;	
				 title="Madfsadf";
				 description="afdsaf.";
				 //Construct a new Appointment object with the initial data	 
		         appt = new Appt(startHour,
		                  startMinute ,
		                  startDay ,
		                  startMonth ,
		                  startYear ,
		                  title,
		                 description);
				int[] recurDaysArr1={4,7,8};
		         appt.setRecurrence( recurDaysArr1, Appt.RECUR_BY_MONTHLY, 1, Appt.RECUR_NUMBER_FOREVER);
		         listAppts.add(appt);
		         // create another appointment
		         startHour=16;
				 startMinute=30;
				 startDay=thisDay+1;		
				 startMonth=thisMonth+1;	
				 startYear=thisYear;	
				 title="fdsa";
				 description="fdsadafd!";
				 //Construct a new Appointment object with the initial data	 
		         appt = new Appt(startHour,
		                  startMinute ,
		                  startDay ,
		                  startMonth ,
		                  startYear ,
		                  title,
		                 description);
		         int[] recurDaysArr2={2,3,4};
		         appt.setRecurrence( recurDaysArr2, Appt.RECUR_BY_WEEKLY, 2, Appt.RECUR_NUMBER_FOREVER);
		         listAppts.add(appt);
				 GregorianCalendar today = new GregorianCalendar(thisYear,thisMonth,thisDay);
				GregorianCalendar tomorrow = (GregorianCalendar)today.clone();
				tomorrow.add(Calendar.DAY_OF_MONTH,+2);
				TimeTable timeTable=new TimeTable();
		      
		        LinkedList<CalDay> calDays = new LinkedList<CalDay>();
			
				calDays = timeTable.getApptRange(listAppts, today, tomorrow);
				int[] temper = listAppts.get(0).getRecurDays();
				LinkedList<Appt> te = calDays.get(0).getAppts();
				LinkedList<Appt> te1 = calDays.get(1).getAppts();
		
			}
			 @Test	
			  public void test15()  throws Throwable  {
				LinkedList<Appt> listAppts = new LinkedList<Appt>();
				int thisMonth;
		    	 int thisYear;
		    	int thisDay;
				Calendar rightnow = Calendar.getInstance();
		    	
		    	thisMonth = rightnow.get(Calendar.MONTH)+1;
				thisYear = rightnow.get(Calendar.YEAR);
				thisDay = rightnow.get(Calendar.DAY_OF_MONTH);
				
				 int startHour=11;
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
		         listAppts.add(appt);
				 GregorianCalendar today = new GregorianCalendar(thisYear,thisMonth,thisDay);
				GregorianCalendar tomorrow = (GregorianCalendar)today.clone();
				tomorrow.add(Calendar.DAY_OF_MONTH,+1);
				TimeTable timeTable=new TimeTable();
		        //Create a linked list of calendar days to return
		        LinkedList<CalDay> calDays = new LinkedList<CalDay>();
				//calDays = new LinkedList<CalDay>();
				calDays = timeTable.getApptRange(listAppts, today, tomorrow);
				assertEquals(4, listAppts.size());
				LinkedList<Appt> listDeletedAppts=timeTable.deleteAppt(listAppts, listAppts.get(2));
				
				startHour=20;
				 startMinute=30;
				 startDay=thisDay+1;		
				 startMonth=thisMonth+1;	
				 startYear=thisYear;	
				 title="Visit";
				 description="Visiting my parents!";
				Appt appt1 = new Appt(startHour,
		                  startMinute ,
		                  startDay ,
		                  startMonth ,
		                  startYear ,
		                  title,
		                 description);
				LinkedList<Appt> listDeletedAppts1=timeTable.deleteAppt(listAppts, appt1);
				LinkedList<Appt> listDeletedAppts2=timeTable.deleteAppt(listDeletedAppts1, appt1);
				
				assertEquals(4, listAppts.size());
				//assertEquals(null, listDeletedAppts.size());
				assertNull(listDeletedAppts1);
				assertNull(listDeletedAppts2);
			 }
			 @Test
			  public void test16()  throws Throwable  {
				GregorianCalendar today = new GregorianCalendar(2018, 1, 28);
				GregorianCalendar nextMonth = new GregorianCalendar(2018, 2, 28);
				
				LinkedList<Appt> listAppts = new LinkedList<Appt>();

				LinkedList<CalDay> calDays = new LinkedList<CalDay>();
				TimeTable timeTable=new TimeTable();

				calDays = timeTable.getApptRange(listAppts, today, nextMonth);
				assertEquals("\t --- 1/28/2018 --- \n --- -------- Appointments ------------ --- \n\n", calDays.get(0).toString());

				Appt appt = new Appt(16, 30, 1, 2, 2018, "Birthday Party", "This is my birthday party.");
				int []intArr = {0,3};
				appt.setRecurrence(intArr, Appt.RECUR_BY_WEEKLY, 1, Appt.RECUR_NUMBER_FOREVER);
				listAppts.add(appt);
				calDays = timeTable.getApptRange(listAppts, today, nextMonth);

				assertNotEquals(" --- 2/6/2018 ---  --- -------- Appointments ------------ ---",
					calDays.get(6).toString());

			 }
			 
			 
}