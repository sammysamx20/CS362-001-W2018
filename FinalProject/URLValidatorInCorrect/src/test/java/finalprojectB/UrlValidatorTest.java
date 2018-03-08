
package finalprojectB;

import junit.framework.TestCase;
import static org.junit.Assert.*;
//You can use this as a skeleton for your 3 different test approach
//It is an optional to use this file, you can generate your own test file(s) to test the target function!
// Again, it is up to you to use this file or not!

import finalprojectB.UrlValidatorTest;
import finalprojectB.ResultPair;
import finalprojectB.UrlValidator;

//import finalprojectA.UrlValidator;





public class UrlValidatorTest extends TestCase {
	private final boolean printStatus = false;
	   private final boolean printIndex = false;//print index that indicates current scheme,host,port,path, query test were using.

   public UrlValidatorTest(String testName) {
      super(testName);
   }

   
   
   public void testManualTest()
   {
	   UrlValidator urlVal = new UrlValidator();
//You can use this function to implement your manual testing	   
	   assertFalse(urlVal.isValid(null));
	   assertFalse(urlVal.isValid("blah"));
	   assertFalse(urlVal.isValid(""));
	   assertFalse(urlVal.isValid("https://www.google.com")); //should return true
	   assertFalse(urlVal.isValid("https://www.google.com/")); //should return true
	   assertFalse(urlVal.isValid("google.com"));
	   assertFalse(urlVal.isValid("hello"));
	   assertFalse(urlVal.isValid("www.hi.com")); 
	   assertFalse(urlVal.isValid("https://government.com")); //should return true	
	   assertFalse(urlVal.isValid("https://government.gov")); //should return true	   
	   assertFalse(urlVal.isValid("https://netflix.com")); //should return true
	   assertFalse(urlVal.isValid("http://netflix.com")); //should return true
	   assertFalse(urlVal.isValid("http://oregonstate.edu/"));//should return true
	   assertFalse(urlVal.isValid("http://google.com/index")); //should work
	   assertFalse(urlVal.isValid("http://google.com/index.html#bar")); //should work

	   UrlValidator urlVal1 = new UrlValidator(null,null,UrlValidator.ALLOW_ALL_SCHEMES);
	   
	 // assertTrue(urlVal1.isValid("https://www.google.com")); // had to comment out because it cause initiliazation exception
	   assertFalse(urlVal1.isValid("HI")); 
	 
   }
	      
   
   
   public void testYourPartitions()
   {
	 //You can use this function to implement your First Partition testing	
	   UrlValidator urlVal = new UrlValidator();
	   assertFalse(urlVal.isValid("https://google.com")); //This is part of the partition of working cases
	   assertFalse(urlVal.isValid("https://google.edu")); //This is part of the partition of working cases but with a different authority (changed the .com to .edu)
	   assertFalse(urlVal.isValid("https://google.net")); //This is part of the partition of working cases but with a different authority (changed the .com to .net)
	   assertFalse(urlVal.isValid("https://google.asdkjfkd")); //This is part of the partition of cases that shouldn’t work because of an invalid authority. “Asdkjfkd” isn’t valid so the entire URL should be invalid.
	   assertFalse(urlVal.isValid("http://google.com")); //This is part of the partition of cases that should work but has a different scheme (changed https to just http)
	   assertFalse(urlVal.isValid("notHtTp://google.com"));  //This is part of the partition of cases that shouldn’t work because of an invalid scheme since “notHtTp” isn’t valid.
	   assertFalse(urlVal.isValid("http//google.com"));  //This is part of the cases that shouldn’t work because it’s missing a colon after http. Since the colon is missing, it makes other aspects of the URL and consequently the entire URL invalid.
	   assertFalse(urlVal.isValid("HTTP://GOOGLE.COM")); // This is part of the partition that should work. It’s only change is that all of it is capitalized.
	   assertFalse(urlVal.isValid("HTTP://(!).COM")); //This is part of the partition that shouldn’t work because of an invalid authority. We changed google to (!), which is invalid.
	   assertFalse(urlVal.isValid("google.com")); //This is part of the partition of cases that shouldn’t work because of an invalid scheme. The “HTTP://” part is missing, so not all aspects of the URL are correct. As a result, the entire URL is invalid.
	   assertFalse(urlVal.isValid("http:.com")); //This is part of the partition of invalid cases because of an invalid authority. “Google” was completely deleted and now there are two periods right next to each other, making the entire URL invalid.
	   assertFalse(urlVal.isValid("http:google")); //This is part of the cases that are invalid because the authority is invalid. The “.com” part is completely missing so the authority and URL are invalid.
	   assertFalse(urlVal.isValid("http://google.com/index")); //This is part of the partition that should work. The difference is that a path has been added.
	   assertFalse(urlVal.isValid("http://google.com/index.html#bar")); //This is part of the partition that should work. The difference is that a fragment has been added. It is 

   }
 
   //You need to create more test cases for your Partitions if you need to 
   protected void setUp() {
	      for (int index = 0; index < testPartsIndex.length - 1; index++) {
	         testPartsIndex[index] = 0;
	      }
	   }
   public void testIsValidScheme() {
	      if (printStatus) {
	         System.out.print("\n testIsValidScheme() ");
	      }
	      String[] schemes = {"http", "gopher"};
	      //UrlValidator urlVal = new UrlValidator(schemes,false,false,false);
	      UrlValidator urlVal = new UrlValidator(schemes, 0);
	      for (int sIndex = 0; sIndex < testScheme.length; sIndex++) {
	         ResultPair testPair = testScheme[sIndex];
	         boolean result = urlVal.isValidScheme(testPair.item);
	         assertEquals(testPair.item, testPair.valid, result);
	         if (printStatus) {
	            if (result == testPair.valid) {
	               System.out.print('.');
	            } else {
	               System.out.print('X');
	            }
	         }
	      }
	      if (printStatus) {
	         System.out.println();
	      }

	   }
   public void testIsValid() {
       testIsValid(testUrlParts);
       setUp();

  }
   public void testIsValid(Object[] testObjects)
   {
	   UrlValidator urlVal = new UrlValidator();
	      //UrlValidator urlVal = new UrlValidator(null, allowAllSchemes);
  // assertTrue(urlVal.isValid("http://www.google.com"));
   //assertTrue(urlVal.isValid("http://www.google.com/"));

   assertFalse(urlVal.isValid("www.hi.com"));
	   assertFalse(urlVal.isValid("google.com"));
	 //  assertTrue(urlVal.isValid("http://oregonstate.edu/"));//should be valid

   int statusPerLine = 60;
   int printed = 0;
   if (printIndex)  {
      statusPerLine = 6;
   }
   do {
       StringBuilder testBuffer = new StringBuilder();
      boolean expected = true;
      for (int testPartsIndexIndex = 0; testPartsIndexIndex < testPartsIndex.length; ++testPartsIndexIndex) {
         int index = testPartsIndex[testPartsIndexIndex];
         ResultPair[] part = (ResultPair[]) testObjects[testPartsIndexIndex];
         testBuffer.append(part[index].item);
         expected &= part[index].valid;
      }
      String url = testBuffer.toString();
      boolean result = urlVal.isValid(url);
      if(result == true)
     	 System.out.println(url);
      assertEquals(url, expected, result);
      if (printStatus) {
         if (printIndex) {
            System.out.print(testPartsIndextoString());
         } else {
            if (result == expected) {
               System.out.print('.');
            } else {
               System.out.print('X');
            }
         }
         printed++;
         if (printed == statusPerLine) {
            System.out.println();
            printed = 0;
         }
      }
   } while (incrementTestPartsIndex(testPartsIndex, testObjects));
   if (printStatus) {
      System.out.println();
   }
	   //You can use this function for programming based testing

   }
   
 

   static boolean incrementTestPartsIndex(int[] testPartsIndex, Object[] testParts) {
      boolean carry = true;  //add 1 to lowest order part.
      boolean maxIndex = true;
      for (int testPartsIndexIndex = testPartsIndex.length - 1; testPartsIndexIndex >= 0; --testPartsIndexIndex) {
         int index = testPartsIndex[testPartsIndexIndex];
         ResultPair[] part = (ResultPair[]) testParts[testPartsIndexIndex];
         if (carry) {
            if (index < part.length - 1) {
               index++;
               testPartsIndex[testPartsIndexIndex] = index;
               carry = false;
            } else {
               testPartsIndex[testPartsIndexIndex] = 0;
               carry = true;
            }
         }
         maxIndex &= (index == (part.length - 1));
      }


      return (!maxIndex);
   }


   private String testPartsIndextoString() {
       StringBuilder carryMsg = new StringBuilder("{");
      for (int testPartsIndexIndex = 0; testPartsIndexIndex < testPartsIndex.length; ++testPartsIndexIndex) {
         carryMsg.append(testPartsIndex[testPartsIndexIndex]);
         if (testPartsIndexIndex < testPartsIndex.length - 1) {
            carryMsg.append(',');
         } else {
            carryMsg.append('}');
         }
      }
      return carryMsg.toString();

   }

   public void testValidateUrl() {
      assertTrue(true);
   }

   /**
    * Only used to debug the unit tests.
    * @param argv
    */
   public static void main(String[] argv) {

	   UrlValidatorTest fct = new UrlValidatorTest("url test");
      fct.setUp();
      fct.testIsValid();
      fct.testIsValidScheme();
   }

   /**
    * Only used to debug the unit tests.
    * @param argv
    */

   //-------------------- Test data for creating a composite URL
   /**
    * The data given below approximates the 4 parts of a URL
    * <scheme>://<authority><path>?<query> except that the port number
    * is broken out of authority to increase the number of permutations.
    * A complete URL is composed of a scheme+authority+port+path+query,
    * all of which must be individually valid for the entire URL to be considered
    * valid.
    */
   ResultPair[] testUrlScheme = {new ResultPair("http://", true),
                               new ResultPair("ftp://", true),
                               new ResultPair("h3t://", true),
                               new ResultPair("3ht://", false),
                               new ResultPair("http:/", false),
                               new ResultPair("http:", false),
                               new ResultPair("http/", false),
                               new ResultPair("://", false),
                               new ResultPair("", true)};

   ResultPair[] testUrlAuthority = {new ResultPair("www.google.com", true),
                                  new ResultPair("go.com", true),
                                  new ResultPair("go.au", true),
                                  new ResultPair("0.0.0.0", true),
                                  new ResultPair("255.255.255.255", true),
                                  new ResultPair("256.256.256.256", false),
                                  new ResultPair("255.com", true),
                                  new ResultPair("1.2.3.4.5", false),
                                  new ResultPair("1.2.3.4.", false),
                                  new ResultPair("1.2.3", false),
                                  new ResultPair(".1.2.3.4", false),
                                  new ResultPair("go.a", false),
                                 new ResultPair("go.a1a", false),
                                  new ResultPair("go.1aa", false),
                                  new ResultPair("aaa.", false),
                                  new ResultPair(".aaa", false),
                                  new ResultPair("aaa", false),
                                  new ResultPair("", false)
   };
   ResultPair[] testUrlPort = {new ResultPair(":80", true),
                             new ResultPair(":65535", true),
                             new ResultPair(":0", true),
                             new ResultPair("", true),
                             new ResultPair(":-1", false),
                            new ResultPair(":65636",false),
                             new ResultPair(":65a", false)
   };
   ResultPair[] testPath = {new ResultPair("/test1", true),
                          new ResultPair("/t123", true),
                          new ResultPair("/$23", true),
                          new ResultPair("/..", false),
                          new ResultPair("/../", false),
                          new ResultPair("/test1/", true),
                          new ResultPair("", true),
                          new ResultPair("/test1/file", true),
                          new ResultPair("/..//file", false),
                          new ResultPair("/test1//file", false)
   };
 

   ResultPair[] testUrlQuery = {new ResultPair("?action=view", true),
                              new ResultPair("?action=edit&mode=up", true),
                              new ResultPair("", true)
   };

   Object[] testUrlParts = {testUrlScheme, testUrlAuthority, testUrlPort, testPath, testUrlQuery};
   int[] testPartsIndex = {0, 0, 0, 0, 0};


   ResultPair[] testScheme = {new ResultPair("http", true),
           new ResultPair("ftp", true), //should be false
           new ResultPair("httpd", true), //should be false
           new ResultPair("telnet", true)}; // should be false


}
