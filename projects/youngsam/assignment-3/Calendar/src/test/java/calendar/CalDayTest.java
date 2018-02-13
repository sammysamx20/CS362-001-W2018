package calendar;
/**
 *  This class provides a basic set of test cases for the
 *  CalDay class.
 */
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.LinkedList;

import org.junit.Test;

import static org.junit.Assert.*;

public class CalDayTest {

	 @Test
	  public void test01()  throws Throwable  {
	

	 }
	 @Test
	  public void test02()  throws Throwable  {
		 
	 }
//add more unit tests as you needed	
	 @Test
	  public void test03()  throws Throwable  {
		 CalDay calday = new CalDay();
	 }
	 @Test
	  public void test04()  throws Throwable  {
		 int thisYear = 2018;
		 int thisMonth = 11;
		 int thisDay = 21;
		 
		GregorianCalendar today = new GregorianCalendar(thisYear, thisMonth, thisDay);
		 CalDay calday = new CalDay(today);
	 }
	 @Test
	  public void test05()  throws Throwable  {
		 int thisYear = 2018;
		 int thisMonth = 11;
		 int thisDay = 21;
		 
		GregorianCalendar today = new GregorianCalendar(thisYear, thisMonth, thisDay);
		 CalDay calday = new CalDay(today);
		 int startHour=21;
		 int startMinute=30;
		 int startDay=15;
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
		 calday.addAppt(appt);
	 }
	 @Test
	  public void test06()  throws Throwable  {
	 int thisYear = 2018;
	 int thisMonth = 11;
	 int thisDay = 21;
	 
	GregorianCalendar today = new GregorianCalendar(thisYear, thisMonth, thisDay);
	 CalDay calday = new CalDay(today);
	 calday.isValid();
}
	 @Test
	  public void test07()  throws Throwable  {
	 int thisYear = 2018;
	 int thisMonth = 11;
	 int thisDay = 21;
	 
	GregorianCalendar today = new GregorianCalendar(thisYear, thisMonth, thisDay);
	 CalDay calday = new CalDay(today);
	 calday.iterator();
} 
	 @Test
	  public void test08()  throws Throwable  {
	 int thisYear = 2018;
	 int thisMonth = 11;
	 int thisDay = 21;
	 
	GregorianCalendar today = new GregorianCalendar(thisYear, thisMonth, thisDay);
	 CalDay calday = new CalDay(today);
	 calday.getSizeAppts();
	 assertEquals(0,calday.getSizeAppts());
	 assertNotEquals(1,calday.getSizeAppts());
}
	 @Test
	  public void test09()  throws Throwable  {
	 int thisYear = 2018;
	 int thisMonth = 11;
	 int thisDay = 21;
	GregorianCalendar today = new GregorianCalendar(thisYear, thisMonth, thisDay);
	 CalDay calday = new CalDay(today);
	 calday.getDay();
	 calday.getMonth();
	 calday.getYear();
	 calday.toString();
}
	 @Test
	  public void test10()  throws Throwable  {
		 GregorianCalendar list = new GregorianCalendar(2018, 7, 27);
		 CalDay calday = new CalDay(list);

		 Appt hi = new Appt(15, 1,27, 7,2018,
				 "Unidds", "fdsa");
		 calday.addAppt(hi);
		 Appt d = new Appt(16, 1,27,7,2018,
				 "the","fire");
		 calday.addAppt(d);

		 LinkedList<Appt> list1 = calday.getAppts();
		 assertTrue(list1.contains(hi));
		 assertTrue(list1.contains(d));

	
		 Appt s = new Appt(18, 1,27,7,2018,
				 "ds","Sfdas");

		 calday.addAppt(s);
		assertTrue(calday.getAppts().get(0).equals(s));


	 }
	 @Test
		public void test11()	throws Throwable   {
			GregorianCalendar today = new GregorianCalendar(2018, 8, 15);
			CalDay calday = new CalDay(today);

			calday.iterator();
			assertNotEquals(0,calday.iterator());

			CalDay calday2 = new CalDay();

			assertEquals(null, calday2.iterator());

		}
	 }