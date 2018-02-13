package calendar;
/**
 *  This class provides a basic set of test cases for the
 *  Appt class.
 */
import org.junit.Test;


import static org.junit.Assert.*;
public class ApptTest {
    /**
     * Test that the gets methods work as expected.
     */
	 @Test
	  public void test01()  throws Throwable  {
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
	// assertions
		 assertTrue(appt.getValid());
		 assertEquals(21, appt.getStartHour());
		 assertEquals(30, appt.getStartMinute());
		 assertEquals(15, appt.getStartDay());
		 assertEquals(01, appt.getStartMonth());
		 assertEquals(2018, appt.getStartYear());
		 assertEquals("Birthday Party", appt.getTitle());
		 assertEquals("This is my birthday party.", appt.getDescription());         		
	 }

	 
//add more unit tests as you needed
	@Test
	public void isvalidTest() throws Throwable {
		
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
		 appt.setStartHour(11);
	
	}
	@Test
	public void isvalidTest1() throws Throwable {
		
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
		 
		 appt.setStartMinute(60);
	}
	@Test
	public void isvalidTest2() throws Throwable {
		
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
		 
		 appt.setStartDay(-12);
	}
	@Test


	
	
	public void isvalidTest4() throws Throwable {
		
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
	
	}
	@Test
	public void setTitleTest() throws Throwable {
		
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
	
		 appt.setTitle(null);
	}
	@Test
	public void setDescriptionTest() throws Throwable {
		
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
	
		 appt.setDescription(null);
	}
	@Test
	public void toStringTest() throws Throwable {
		
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
	
		 appt.toString();
	}
	
	@Test
	public void getRecurTest() throws Throwable {
		
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
		 
		 System.out.println(appt.getRecurNumber());
	}
	@Test
	public void getRecurByTest() throws Throwable {
		
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
		 
		 System.out.println(appt.getRecurBy());
	}
	@Test
	public void getRecurDays() throws Throwable {
		
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
		 
		 System.out.println(appt.getRecurDays());
	}

	@Test
	public void isrecurringTest() throws Throwable {
		
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
		 
		 System.out.println(appt.isRecurring());
	}
	@Test
	public void gerecurincrementTest() throws Throwable {
		
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
		 
		 System.out.println(appt.getRecurIncrement());
	}
	@Test
	  public void test03()  throws Throwable  {
		 int startHour=16;
		 int startMinute=30;
		 int startDay=15;		
		 int startMonth=8;	
		 int startYear=2018;	
		 String title="hm";
		 String description="visit";
         Appt appt = new Appt(startHour,
                 startMinute ,
                 startDay ,
                 startMonth ,
                 startYear ,
                 title,
                description);
        int[] recurDaysArr=null;
        assertEquals(0, appt.getRecurDays().length);
        assertEquals(0, appt.getRecurIncrement());
        
        appt.setRecurrence( recurDaysArr, Appt.RECUR_BY_WEEKLY, 2, Appt.RECUR_NUMBER_FOREVER);	
        assertEquals(0, appt.getRecurDays().length);
        assertEquals(1, appt.getRecurBy());
        assertEquals(2, appt.getRecurIncrement());
        assertEquals(1000, appt.getRecurNumber());
        assertNotEquals(2, appt.getRecurDays().length);
        assertNotEquals(4, appt.getRecurBy());
        assertNotEquals(6, appt.getRecurIncrement());
        assertNotEquals(100, appt.getRecurNumber());
        int[] recurDaysArr2= {3, 4};
        appt.setRecurrence( recurDaysArr2, 1, 1, 1);	
        assertNotEquals(0, appt.getRecurDays().length);
      
        assertEquals(1, appt.getRecurBy());
        assertEquals(1, appt.getRecurIncrement());
        assertEquals(1, appt.getRecurNumber());
	}

	@Test
	public void test04()  throws Throwable {
		int startHour = 12;
		int startMinute = 30;
		int startDay = 15;
		int startMonth = 01;
		int startYear = 2018;
		String title = "yay";
		String description = "This is fun.";
		//Construct a new Appointment object with the initial data
		Appt appt = new Appt(startHour,
				startMinute,
				startDay,
				startMonth,
				startYear,
				title,
				description);
		// assertions
		assertFalse(appt.getValid());

		assertEquals(null, appt.toString());
		assertFalse(appt.isRecurring());
		assertEquals(2, appt.getRecurBy());
		assertEquals(0, appt.getRecurIncrement());
		appt.compareTo(appt);
	}
	public void test05()  throws Throwable {
		int startHour = 12;
		int startMinute = 30;
		int startDay = 15;
		int startMonth = 01;
		int startYear = 2018;
		String title = "yay";
		String description = "This is fun.";
		//Construct a new Appointment object with the initial data
		Appt appt = new Appt(startHour,
				startMinute,
				startDay,
				startMonth,
				startYear,
				title,
				description);
		int startHour1 = 343;
		int startMinute1 = 1234;
		int startDay1 = 134;
		int startMonth1 = 01;
		int startYear1 = 2018;
		Appt appt1 = new Appt(startHour,
				startMinute,
				startDay,
				startMonth,
				startYear,
				title,
				description);
	
	appt.compareTo(appt1);
	}
	@Test
	public void test06()  throws Throwable {
		int startHour = 16;
		int startMinute = 30;
		int startDay = 16;
		int startMonth = 01;
		int startYear = 2018;
		String title = "Birthday Party";
		String description = "This is my birthday party.";
		//Construct a new Appointment object with the initial data
		Appt appt = new Appt(startHour,
				startMinute,
				startDay,
				startMonth,
				startYear,
				title,
				description);
		// assertions
		assertTrue(appt.getValid());

		assertEquals("\t1/2018/2018 at 4:30pm ,Birthday Party, This is my birthday party.\n", appt.toString());
	}
	 @Test
	  public void test07() throws Throwable {
		  int startHour=15;
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
		  
		  appt.setStartHour(-1);
		  assertFalse(appt.getValid());
		  

		  appt.setStartMinute(-1);
		  assertFalse(appt.getValid());
		  appt.setStartMonth(11);
		  assertFalse(appt.getValid());
		  
		  appt.setStartYear(-1);
		  assertFalse(appt.getValid());
		  appt.setStartYear(2018);
		  assertFalse(appt.getValid());
		  appt.setStartDay(12);
		  assertFalse(appt.getValid());
	  }
	 @Test
		public void test08() throws Throwable {
		  int startHour = 0;
		  int startMinute = 0;
		  int startDay = 27;
		  int startMonth = 7;
		  int startYear = 2018;
		  String title = "boo";
		  String description = "yay";
		  Appt appt = new Appt(startHour, startMinute, startDay, startMonth, startYear, title, description);
		  assertEquals(0, appt.getRecurDays().length);
		  Appt appt2 = new Appt(startHour, startMinute, startDay, startMonth, startYear, title, description);
		  int[] recurDaysArr=null;
		  appt.setRecurrence(recurDaysArr, appt.RECUR_BY_YEARLY, 2, 4);
	
		  assertEquals(0, appt.getRecurDays().length);

	  }
	 @Test
	  public void test09() throws Throwable {
		  int startHour = 15;
		  int startMinute = 0;
		  int startDay = 27;
		  int startMonth = 7;
		  int startYear = 2018;
		  String title = "kool";
		  String description = "toop";

		  // Construct a new Appointment object with the initial data
		  Appt appt = new Appt(startHour, startMinute, startDay, startMonth, startYear, title, description);
		  Appt appt2 = new Appt(startHour+5, startMinute+5, startDay-5, startMonth, startYear, title, description);

		  assertEquals(0, appt.compareTo(appt));
		  assertEquals(-5, appt.compareTo(appt2));
		  assertNotEquals(appt.compareTo(appt), appt.compareTo(appt2));
	  }
	 @Test
	  public void test10() throws Throwable {
		  int startHour=-1;
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


	  	  assertFalse(appt.testIsValid());
		  appt.setStartHour(24);
		  assertFalse(appt.testIsValid());
		  appt.setStartHour(15);
		  assertTrue(appt.testIsValid());
		  appt.setStartHour(23);
		  assertTrue(appt.testIsValid());
		  appt.setStartMinute(-1);
		  assertFalse(appt.testIsValid());
		  appt.setStartMinute(60);
		  assertFalse(appt.testIsValid());
		  appt.setStartMinute(0);
		  assertTrue(appt.testIsValid());
		  appt.setStartMinute(59);
		  assertTrue(appt.testIsValid());
		  int NumDaysInMonth= CalendarUtil.NumDaysInMonth(startYear,startMonth-1);		
		  appt.setStartDay(0);
		  assertFalse(appt.testIsValid());
		  appt.setStartDay(40);
		  assertFalse(appt.testIsValid());
		  appt.setStartDay(1);
		  assertTrue(appt.testIsValid());
		  appt.setStartDay(NumDaysInMonth);
		  assertTrue(appt.testIsValid());
		  appt.setStartMonth(1);
		  assertTrue(appt.testIsValid());
		  appt.setStartMonth(12);
		  assertTrue(appt.testIsValid());

		}

	 @Test
	  public void test11() throws Throwable {
		  int startHour=1;
		  int startMinute=30;
		  int startDay=15;
		  int startMonth=01;
		  int startYear=2018;
		  String title="lmao";
		  String description="ayyy.";
		
		  Appt appt = new Appt(startHour,
				  startMinute ,
				  startDay ,
				  startMonth ,
				  startYear ,
				  title,
				  description);

		  appt.setStartHour(-1);
		  assertFalse(appt.getValid());
		  appt.setStartHour(16);
		  assertTrue(appt.getValid());

		  appt.setStartMinute(-1);
		  assertFalse(appt.getValid());
		  appt.setStartMinute(30);
		  assertTrue(appt.getValid());

		  appt.setStartYear(1);
		  assertTrue(appt.getValid());

	  }
	
}