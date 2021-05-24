package task4;

import java.util.LinkedList;
import java.util.List;




public class CarUnit
{
	private static List<String> checks; 
	  private static int checksMade = 0; 
	  private static int passedChecks = 0;
	  private static int failedChecks = 0;
	  
	  
	  
	  private static void addToReport(String txt) {
		    if (checks == null) {
		      checks = new LinkedList<String>();
		    }
		    checks.add(String.format("%04d: %s", checksMade++, txt));
		  }
	  
	  public static void checkStringEquals(String A, String B) {
		    if (A == B) {
		      addToReport(String.format("Passed:-  %s == %s", A, B));
		      passedChecks++;
		    } else {
		      addToReport(String.format("Failed:-  %s == %s", A, B));
		      failedChecks++;
		    }
		  }
	  
	  public static void checkStringNotEquals(String A, String B) {
		    if (A != B) {
		      addToReport(String.format("Passed:-  %s == %s", A, B));
		      passedChecks++;
		    } else {
		      addToReport(String.format("Failed:-  %s == %s", A, B));
		      failedChecks++;
		    }
		  }
	  
	  public static void checkEquals(double A, double B) {
		    if (A == B) {
		      addToReport(String.format("Passed:-  %.2f == %.2f", A, B));
		      passedChecks++;
		    } else {
		      addToReport(String.format("Failed:-  %.2f == %.2f", A, B));
		      failedChecks++;
		    }
		  }
	  
	  
	  public static void checkNotEquals(double A, double B) {
		    if (A != B) {
		      addToReport(String.format("Passed:-  %.2f != %.2f", A, B));
		      passedChecks++;
		    } else {
		      addToReport(String.format("Failed:-  %.2f != %.2f", A, B));
		      failedChecks++;
		    }
		  }
	  
	  
	  public static void checkIsTrue(boolean Taxed) {
		    if (Taxed) {
		      addToReport(String.format("Passed:-  Boolean == %b", Taxed));
		      passedChecks++;
		      return;
		    } else {
		      addToReport(String.format("Failed:-  Boolean == %b", Taxed));
		      failedChecks++;
		      return;
		    }
			
		  }
	  
	  public static void checkIsFalse(boolean Taxed) {
		    if (Taxed) {
		      addToReport(String.format("Failed:-  Boolean == %b", Taxed));
		      failedChecks++;
		      return;
		    } else {
		      addToReport(String.format("Passed:-  Boolean == %b", Taxed));
		      passedChecks++;
		      return;
		    }
			
		  }
	  
	  
	  
	  public static void report() {
		    System.out.printf("%d checks passed\n", passedChecks);
		    System.out.printf("%d checks failed\n", failedChecks);
		    System.out.println();
		    
		    for (String check : checks) {
		      System.out.println(check);
		    }
		  }

}
