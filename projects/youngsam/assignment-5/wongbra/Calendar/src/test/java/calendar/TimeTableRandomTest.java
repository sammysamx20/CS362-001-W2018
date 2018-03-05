package calendar;

import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.LinkedList;
import java.util.Random;

import org.junit.Test;


import static org.junit.Assert.*;



/**
 * Random Test Generator  for TimeTable class.
 */

public class TimeTableRandomTest {
	private static final long TestTimeout = 60 * 500 * 1; /* Timeout at 30 seconds */
	private static final int NUM_TESTS=100;
   
    public static String RandomSelectMethod(Random random){
        String[] methodArray = new String[] {"deleteAppt","getApptRange"};// The list of the of methods to be tested in the Appt class

    	int n = random.nextInt(methodArray.length);// get a random number between 0 (inclusive) and  methodArray.length (exclusive)
    	            
        return methodArray[n] ; // return the method name 
        }
	/**
	 * Return a randomly selected appointments to recur Weekly,Monthly, or Yearly !.
	 */
    public static int RandomSelectRecur(Random random){
        int[] RecurArray = new int[] {Appt.RECUR_BY_WEEKLY,Appt.RECUR_BY_MONTHLY,Appt.RECUR_BY_YEARLY};// The list of the of setting appointments to recur Weekly,Monthly, or Yearly

    	int n = random.nextInt(RecurArray.length);// get a random number between 0 (inclusive) and  RecurArray.length (exclusive)
        return RecurArray[n] ; // return the value of the  appointments to recur 
        }	
	/**
	 * Return a randomly selected appointments to recur forever or Never recur  !.
	 */
    public static int RandomSelectRecurForEverNever(Random random){
        int[] RecurArray = new int[] {Appt.RECUR_NUMBER_FOREVER,Appt.RECUR_NUMBER_NEVER};// The list of the of setting appointments to recur RECUR_NUMBER_FOREVER, or RECUR_NUMBER_NEVER

    	int n = random.nextInt(RecurArray.length);// get a random number between 0 (inclusive) and  RecurArray.length (exclusive)
        return RecurArray[n] ; // return appointments to recur forever or Never recur 
        }	
    /**
     * Generate Random Tests that tests TimeTable Class.
     */
	 @Test
	  public void radnomtest()  throws Throwable  {
		 
		 long startTime = Calendar.getInstance().getTimeInMillis();
		 long elapsed = Calendar.getInstance().getTimeInMillis() - startTime;

		 
		 System.out.println("Start testing...");
		 
		try{ 
			for (int iteration = 0; elapsed < TestTimeout; iteration++) {
				long randomseed =System.currentTimeMillis(); //10
	//			System.out.println(" Seed:"+randomseed );
				Random random = new Random(randomseed);
			
				
				int startHour = ValuesGenerator.getRandomIntBetween(random, -20, 100); //Randomizes input for the start hour to include values out of bounds
				int startMinute = ValuesGenerator.getRandomIntBetween(random, -20, 150);
				int startDay = ValuesGenerator.getRandomIntBetween(random, -20, 70);
				 int startMonth=ValuesGenerator.getRandomIntBetween(random, 1, 11);
				 int startYear=ValuesGenerator.RandInt(random);
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
				 int startHour1 = ValuesGenerator.RandInt(random); //Randomizes input for the start hour to include values out of bounds
					int startMinute1 = ValuesGenerator.RandInt(random);
					int startDay1 = ValuesGenerator.RandInt(random);
					 int startMonth1=ValuesGenerator.getRandomIntBetween(random, 1, 11);
					 int startYear1=ValuesGenerator.RandInt(random);
					 String title1="Birthday Party";
					 String description1="This is my birthday party.";
					 //Construct a new Appointment object with the initial data	 
					 Appt appt1 = new Appt(startHour1,
					          startMinute1 ,
					          startDay1 ,
					          startMonth1 ,
					          startYear1 ,
					          title1,
					         description1);
					 Appt appt2 = new Appt(17,
					          30 ,
					          16 ,
					          4 ,
					          2018 ,
					          "hello",
					         "world");
					 for (int i = 0; i < NUM_TESTS; i++) {
							String methodName = TimeTableRandomTest.RandomSelectMethod(random);
							   if (methodName.equals("deleteAppt")){
								   String newTitle=(String) ValuesGenerator.getString(random);
								   appt.setTitle(newTitle);	
									 int thisDay=ValuesGenerator.RandInt(random);
									 int thisMonth=ValuesGenerator.getRandomIntBetween(random, 1, 11);
									 int thisYear=ValuesGenerator.RandInt(random);
									 GregorianCalendar today = new GregorianCalendar(thisYear, thisMonth, thisDay);
									 CalDay calday = new CalDay(today);
									 calday.addAppt(appt);
									 calday.addAppt(appt1);
									 TimeTable timetable = new TimeTable();
									 LinkedList<Appt> listAppts = new LinkedList<Appt>();
									 listAppts.add(appt);
									 listAppts.add(appt1);
									 listAppts.add(appt);
									 listAppts.add(appt2);
									 timetable.deleteAppt(listAppts, appt2);
									 timetable.deleteAppt(listAppts, appt);
									 timetable.deleteAppt(listAppts, appt1);
									 timetable.deleteAppt(listAppts, null);
									 timetable.deleteAppt(null, appt);
									 assertEquals(null, timetable.deleteAppt(null, appt));
									 

								}
							   else if (methodName.equals("getApptRange")){
								   String newTitle=(String) ValuesGenerator.getString(random);
								   appt.setTitle(newTitle);	
									 int thisDay=ValuesGenerator.RandInt(random);
									 int thisMonth=ValuesGenerator.getRandomIntBetween(random, 1, 11);
									 int thisYear=ValuesGenerator.RandInt(random);
									 int nextDay=ValuesGenerator.RandInt(random);
									 GregorianCalendar today = new GregorianCalendar(thisYear, thisMonth, thisDay);
									 GregorianCalendar tomorrow = new GregorianCalendar(thisYear, thisMonth, thisDay+3);
									 CalDay calday = new CalDay(today);
									 calday.addAppt(appt);
									 calday.addAppt(appt1);
									 TimeTable timetable = new TimeTable();
									 LinkedList<Appt> listAppts = new LinkedList<Appt>();
									 listAppts.add(appt1);
									 listAppts.add(appt);
									 listAppts.add(appt1);
									 listAppts.add(appt);
							
									timetable.getApptRange(listAppts, today, tomorrow);
							   }
							   }
							  
					 elapsed = (Calendar.getInstance().getTimeInMillis() - startTime);
				        if((iteration%10000)==0 && iteration!=0 )
				              System.out.println("elapsed time: "+ elapsed + " of "+TestTimeout);
			}
			
		}catch(NullPointerException e){
		 
		 
	 }



		System.out.println("Done testing...");
	 
		 
	 }


	
}
