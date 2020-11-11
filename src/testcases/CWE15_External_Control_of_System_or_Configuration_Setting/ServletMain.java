package testcases.CWE15_External_Control_of_System_or_Configuration_Setting;

import javax.servlet.http.*;

public class ServletMain extends HttpServlet {

	private static final long serialVersionUID = 1L; /* needed since Servlets are serializable */
	
	

	public void doPost(HttpServletRequest request, HttpServletResponse response) {
		doGet(request, response);
	}

	public void doGet(HttpServletRequest request, HttpServletResponse response) {
		doGetCWE1(request, response);
		doGetCWE2(request, response);
		doGetCWE3(request, response);
		doGetCWE4(request, response);
		doGetCWE5(request, response);
		doGetCWE6(request, response);
		doGetCWE7(request, response);
		doGetCWE8(request, response);
		doGetCWE9(request, response);
	}
	
	private static void doGetCWE1(HttpServletRequest request, HttpServletResponse response) {
		try {
			/* BEGIN-AUTOGENERATED-SERVLET-TESTS-1 */
			(new testcases.CWE15_External_Control_of_System_or_Configuration_Setting.CWE15_External_Control_of_System_or_Configuration_Setting__getQueryString_Servlet_41()).runTest(request, response);
			(new testcases.CWE15_External_Control_of_System_or_Configuration_Setting.CWE15_External_Control_of_System_or_Configuration_Setting__getParameter_Servlet_21()).runTest(request, response);
			(new testcases.CWE15_External_Control_of_System_or_Configuration_Setting.CWE15_External_Control_of_System_or_Configuration_Setting__getParameter_Servlet_10()).runTest(request, response);
			(new testcases.CWE15_External_Control_of_System_or_Configuration_Setting.CWE15_External_Control_of_System_or_Configuration_Setting__getCookies_Servlet_42()).runTest(request, response);
			(new testcases.CWE15_External_Control_of_System_or_Configuration_Setting.CWE15_External_Control_of_System_or_Configuration_Setting__getParameter_Servlet_52a()).runTest(request, response);
			(new testcases.CWE15_External_Control_of_System_or_Configuration_Setting.CWE15_External_Control_of_System_or_Configuration_Setting__getParameter_Servlet_12()).runTest(request, response);
			(new testcases.CWE15_External_Control_of_System_or_Configuration_Setting.CWE15_External_Control_of_System_or_Configuration_Setting__getQueryString_Servlet_04()).runTest(request, response);
			(new testcases.CWE15_External_Control_of_System_or_Configuration_Setting.CWE15_External_Control_of_System_or_Configuration_Setting__getQueryString_Servlet_08()).runTest(request, response);
			(new testcases.CWE15_External_Control_of_System_or_Configuration_Setting.CWE15_External_Control_of_System_or_Configuration_Setting__getParameter_Servlet_74a()).runTest(request, response);
			(new testcases.CWE15_External_Control_of_System_or_Configuration_Setting.CWE15_External_Control_of_System_or_Configuration_Setting__getCookies_Servlet_81a()).runTest(request, response);
			(new testcases.CWE15_External_Control_of_System_or_Configuration_Setting.CWE15_External_Control_of_System_or_Configuration_Setting__getCookies_Servlet_08()).runTest(request, response);
			(new testcases.CWE15_External_Control_of_System_or_Configuration_Setting.CWE15_External_Control_of_System_or_Configuration_Setting__getQueryString_Servlet_52a()).runTest(request, response);
			(new testcases.CWE15_External_Control_of_System_or_Configuration_Setting.CWE15_External_Control_of_System_or_Configuration_Setting__getQueryString_Servlet_16()).runTest(request, response);
			(new testcases.CWE15_External_Control_of_System_or_Configuration_Setting.CWE15_External_Control_of_System_or_Configuration_Setting__getParameter_Servlet_61a()).runTest(request, response);
			(new testcases.CWE15_External_Control_of_System_or_Configuration_Setting.CWE15_External_Control_of_System_or_Configuration_Setting__getQueryString_Servlet_17()).runTest(request, response);
			(new testcases.CWE15_External_Control_of_System_or_Configuration_Setting.CWE15_External_Control_of_System_or_Configuration_Setting__getCookies_Servlet_05()).runTest(request, response);
			(new testcases.CWE15_External_Control_of_System_or_Configuration_Setting.CWE15_External_Control_of_System_or_Configuration_Setting__getCookies_Servlet_10()).runTest(request, response);
			(new testcases.CWE15_External_Control_of_System_or_Configuration_Setting.CWE15_External_Control_of_System_or_Configuration_Setting__getQueryString_Servlet_53a()).runTest(request, response);
			(new testcases.CWE15_External_Control_of_System_or_Configuration_Setting.CWE15_External_Control_of_System_or_Configuration_Setting__getQueryString_Servlet_02()).runTest(request, response);
			(new testcases.CWE15_External_Control_of_System_or_Configuration_Setting.CWE15_External_Control_of_System_or_Configuration_Setting__getQueryString_Servlet_31()).runTest(request, response);
			(new testcases.CWE15_External_Control_of_System_or_Configuration_Setting.CWE15_External_Control_of_System_or_Configuration_Setting__getQueryString_Servlet_01()).runTest(request, response);
			(new testcases.CWE15_External_Control_of_System_or_Configuration_Setting.CWE15_External_Control_of_System_or_Configuration_Setting__getQueryString_Servlet_15()).runTest(request, response);
			(new testcases.CWE15_External_Control_of_System_or_Configuration_Setting.CWE15_External_Control_of_System_or_Configuration_Setting__getCookies_Servlet_68a()).runTest(request, response);
			(new testcases.CWE15_External_Control_of_System_or_Configuration_Setting.CWE15_External_Control_of_System_or_Configuration_Setting__getQueryString_Servlet_14()).runTest(request, response);
			(new testcases.CWE15_External_Control_of_System_or_Configuration_Setting.CWE15_External_Control_of_System_or_Configuration_Setting__getQueryString_Servlet_07()).runTest(request, response);
			(new testcases.CWE15_External_Control_of_System_or_Configuration_Setting.CWE15_External_Control_of_System_or_Configuration_Setting__getQueryString_Servlet_12()).runTest(request, response);
			(new testcases.CWE15_External_Control_of_System_or_Configuration_Setting.CWE15_External_Control_of_System_or_Configuration_Setting__getParameter_Servlet_16()).runTest(request, response);
			(new testcases.CWE15_External_Control_of_System_or_Configuration_Setting.CWE15_External_Control_of_System_or_Configuration_Setting__getParameter_Servlet_53a()).runTest(request, response);
			(new testcases.CWE15_External_Control_of_System_or_Configuration_Setting.CWE15_External_Control_of_System_or_Configuration_Setting__getQueryString_Servlet_68a()).runTest(request, response);
			(new testcases.CWE15_External_Control_of_System_or_Configuration_Setting.CWE15_External_Control_of_System_or_Configuration_Setting__getParameter_Servlet_54a()).runTest(request, response);
			(new testcases.CWE15_External_Control_of_System_or_Configuration_Setting.CWE15_External_Control_of_System_or_Configuration_Setting__getCookies_Servlet_03()).runTest(request, response);
			(new testcases.CWE15_External_Control_of_System_or_Configuration_Setting.CWE15_External_Control_of_System_or_Configuration_Setting__getQueryString_Servlet_42()).runTest(request, response);
			(new testcases.CWE15_External_Control_of_System_or_Configuration_Setting.CWE15_External_Control_of_System_or_Configuration_Setting__getCookies_Servlet_06()).runTest(request, response);
			(new testcases.CWE15_External_Control_of_System_or_Configuration_Setting.CWE15_External_Control_of_System_or_Configuration_Setting__getCookies_Servlet_21()).runTest(request, response);
			(new testcases.CWE15_External_Control_of_System_or_Configuration_Setting.CWE15_External_Control_of_System_or_Configuration_Setting__getCookies_Servlet_02()).runTest(request, response);
			(new testcases.CWE15_External_Control_of_System_or_Configuration_Setting.CWE15_External_Control_of_System_or_Configuration_Setting__getParameter_Servlet_72a()).runTest(request, response);
			(new testcases.CWE15_External_Control_of_System_or_Configuration_Setting.CWE15_External_Control_of_System_or_Configuration_Setting__getCookies_Servlet_12()).runTest(request, response);
			(new testcases.CWE15_External_Control_of_System_or_Configuration_Setting.CWE15_External_Control_of_System_or_Configuration_Setting__getCookies_Servlet_52a()).runTest(request, response);
			(new testcases.CWE15_External_Control_of_System_or_Configuration_Setting.CWE15_External_Control_of_System_or_Configuration_Setting__getQueryString_Servlet_75a()).runTest(request, response);
			(new testcases.CWE15_External_Control_of_System_or_Configuration_Setting.CWE15_External_Control_of_System_or_Configuration_Setting__getParameter_Servlet_51a()).runTest(request, response);
			(new testcases.CWE15_External_Control_of_System_or_Configuration_Setting.CWE15_External_Control_of_System_or_Configuration_Setting__getParameter_Servlet_08()).runTest(request, response);
			(new testcases.CWE15_External_Control_of_System_or_Configuration_Setting.CWE15_External_Control_of_System_or_Configuration_Setting__getQueryString_Servlet_67a()).runTest(request, response);
			(new testcases.CWE15_External_Control_of_System_or_Configuration_Setting.CWE15_External_Control_of_System_or_Configuration_Setting__getCookies_Servlet_41()).runTest(request, response);
			(new testcases.CWE15_External_Control_of_System_or_Configuration_Setting.CWE15_External_Control_of_System_or_Configuration_Setting__getCookies_Servlet_67a()).runTest(request, response);
			(new testcases.CWE15_External_Control_of_System_or_Configuration_Setting.CWE15_External_Control_of_System_or_Configuration_Setting__getParameter_Servlet_14()).runTest(request, response);
			(new testcases.CWE15_External_Control_of_System_or_Configuration_Setting.CWE15_External_Control_of_System_or_Configuration_Setting__getParameter_Servlet_15()).runTest(request, response);
			(new testcases.CWE15_External_Control_of_System_or_Configuration_Setting.CWE15_External_Control_of_System_or_Configuration_Setting__getQueryString_Servlet_09()).runTest(request, response);
			(new testcases.CWE15_External_Control_of_System_or_Configuration_Setting.CWE15_External_Control_of_System_or_Configuration_Setting__getCookies_Servlet_17()).runTest(request, response);
			(new testcases.CWE15_External_Control_of_System_or_Configuration_Setting.CWE15_External_Control_of_System_or_Configuration_Setting__getCookies_Servlet_61a()).runTest(request, response);
			(new testcases.CWE15_External_Control_of_System_or_Configuration_Setting.CWE15_External_Control_of_System_or_Configuration_Setting__getCookies_Servlet_53a()).runTest(request, response);
			(new testcases.CWE15_External_Control_of_System_or_Configuration_Setting.CWE15_External_Control_of_System_or_Configuration_Setting__getQueryString_Servlet_11()).runTest(request, response);
			(new testcases.CWE15_External_Control_of_System_or_Configuration_Setting.CWE15_External_Control_of_System_or_Configuration_Setting__getQueryString_Servlet_74a()).runTest(request, response);
			(new testcases.CWE15_External_Control_of_System_or_Configuration_Setting.CWE15_External_Control_of_System_or_Configuration_Setting__getCookies_Servlet_01()).runTest(request, response);
			(new testcases.CWE15_External_Control_of_System_or_Configuration_Setting.CWE15_External_Control_of_System_or_Configuration_Setting__getQueryString_Servlet_45()).runTest(request, response);
			(new testcases.CWE15_External_Control_of_System_or_Configuration_Setting.CWE15_External_Control_of_System_or_Configuration_Setting__getQueryString_Servlet_73a()).runTest(request, response);
			(new testcases.CWE15_External_Control_of_System_or_Configuration_Setting.CWE15_External_Control_of_System_or_Configuration_Setting__getQueryString_Servlet_54a()).runTest(request, response);
			(new testcases.CWE15_External_Control_of_System_or_Configuration_Setting.CWE15_External_Control_of_System_or_Configuration_Setting__getQueryString_Servlet_10()).runTest(request, response);
			(new testcases.CWE15_External_Control_of_System_or_Configuration_Setting.CWE15_External_Control_of_System_or_Configuration_Setting__getCookies_Servlet_73a()).runTest(request, response);
			(new testcases.CWE15_External_Control_of_System_or_Configuration_Setting.CWE15_External_Control_of_System_or_Configuration_Setting__getQueryString_Servlet_71a()).runTest(request, response);
			(new testcases.CWE15_External_Control_of_System_or_Configuration_Setting.CWE15_External_Control_of_System_or_Configuration_Setting__getParameter_Servlet_01()).runTest(request, response);
			(new testcases.CWE15_External_Control_of_System_or_Configuration_Setting.CWE15_External_Control_of_System_or_Configuration_Setting__getCookies_Servlet_74a()).runTest(request, response);
			(new testcases.CWE15_External_Control_of_System_or_Configuration_Setting.CWE15_External_Control_of_System_or_Configuration_Setting__getCookies_Servlet_66a()).runTest(request, response);
			(new testcases.CWE15_External_Control_of_System_or_Configuration_Setting.CWE15_External_Control_of_System_or_Configuration_Setting__getCookies_Servlet_45()).runTest(request, response);
			(new testcases.CWE15_External_Control_of_System_or_Configuration_Setting.CWE15_External_Control_of_System_or_Configuration_Setting__getParameter_Servlet_31()).runTest(request, response);
			(new testcases.CWE15_External_Control_of_System_or_Configuration_Setting.CWE15_External_Control_of_System_or_Configuration_Setting__getParameter_Servlet_13()).runTest(request, response);
			(new testcases.CWE15_External_Control_of_System_or_Configuration_Setting.CWE15_External_Control_of_System_or_Configuration_Setting__getQueryString_Servlet_66a()).runTest(request, response);
			(new testcases.CWE15_External_Control_of_System_or_Configuration_Setting.CWE15_External_Control_of_System_or_Configuration_Setting__getParameter_Servlet_73a()).runTest(request, response);
			(new testcases.CWE15_External_Control_of_System_or_Configuration_Setting.CWE15_External_Control_of_System_or_Configuration_Setting__getQueryString_Servlet_22a()).runTest(request, response);
			(new testcases.CWE15_External_Control_of_System_or_Configuration_Setting.CWE15_External_Control_of_System_or_Configuration_Setting__getParameter_Servlet_22a()).runTest(request, response);
			(new testcases.CWE15_External_Control_of_System_or_Configuration_Setting.CWE15_External_Control_of_System_or_Configuration_Setting__getCookies_Servlet_16()).runTest(request, response);
			(new testcases.CWE15_External_Control_of_System_or_Configuration_Setting.CWE15_External_Control_of_System_or_Configuration_Setting__getCookies_Servlet_09()).runTest(request, response);
			(new testcases.CWE15_External_Control_of_System_or_Configuration_Setting.CWE15_External_Control_of_System_or_Configuration_Setting__getParameter_Servlet_09()).runTest(request, response);
			(new testcases.CWE15_External_Control_of_System_or_Configuration_Setting.CWE15_External_Control_of_System_or_Configuration_Setting__getParameter_Servlet_06()).runTest(request, response);
			(new testcases.CWE15_External_Control_of_System_or_Configuration_Setting.CWE15_External_Control_of_System_or_Configuration_Setting__getParameter_Servlet_41()).runTest(request, response);
			(new testcases.CWE15_External_Control_of_System_or_Configuration_Setting.CWE15_External_Control_of_System_or_Configuration_Setting__getCookies_Servlet_72a()).runTest(request, response);
			(new testcases.CWE15_External_Control_of_System_or_Configuration_Setting.CWE15_External_Control_of_System_or_Configuration_Setting__getCookies_Servlet_75a()).runTest(request, response);
			(new testcases.CWE15_External_Control_of_System_or_Configuration_Setting.CWE15_External_Control_of_System_or_Configuration_Setting__getQueryString_Servlet_21()).runTest(request, response);
			(new testcases.CWE15_External_Control_of_System_or_Configuration_Setting.CWE15_External_Control_of_System_or_Configuration_Setting__getCookies_Servlet_22a()).runTest(request, response);
			(new testcases.CWE15_External_Control_of_System_or_Configuration_Setting.CWE15_External_Control_of_System_or_Configuration_Setting__getParameter_Servlet_17()).runTest(request, response);
			(new testcases.CWE15_External_Control_of_System_or_Configuration_Setting.CWE15_External_Control_of_System_or_Configuration_Setting__getCookies_Servlet_07()).runTest(request, response);
			(new testcases.CWE15_External_Control_of_System_or_Configuration_Setting.CWE15_External_Control_of_System_or_Configuration_Setting__getCookies_Servlet_54a()).runTest(request, response);
			(new testcases.CWE15_External_Control_of_System_or_Configuration_Setting.CWE15_External_Control_of_System_or_Configuration_Setting__getQueryString_Servlet_72a()).runTest(request, response);
			(new testcases.CWE15_External_Control_of_System_or_Configuration_Setting.CWE15_External_Control_of_System_or_Configuration_Setting__getQueryString_Servlet_81a()).runTest(request, response);
			(new testcases.CWE15_External_Control_of_System_or_Configuration_Setting.CWE15_External_Control_of_System_or_Configuration_Setting__getParameter_Servlet_02()).runTest(request, response);
			(new testcases.CWE15_External_Control_of_System_or_Configuration_Setting.CWE15_External_Control_of_System_or_Configuration_Setting__getParameter_Servlet_03()).runTest(request, response);
			(new testcases.CWE15_External_Control_of_System_or_Configuration_Setting.CWE15_External_Control_of_System_or_Configuration_Setting__getParameter_Servlet_04()).runTest(request, response);
			(new testcases.CWE15_External_Control_of_System_or_Configuration_Setting.CWE15_External_Control_of_System_or_Configuration_Setting__getParameter_Servlet_81a()).runTest(request, response);
			(new testcases.CWE15_External_Control_of_System_or_Configuration_Setting.CWE15_External_Control_of_System_or_Configuration_Setting__getQueryString_Servlet_03()).runTest(request, response);
			(new testcases.CWE15_External_Control_of_System_or_Configuration_Setting.CWE15_External_Control_of_System_or_Configuration_Setting__getQueryString_Servlet_05()).runTest(request, response);
			(new testcases.CWE15_External_Control_of_System_or_Configuration_Setting.CWE15_External_Control_of_System_or_Configuration_Setting__getParameter_Servlet_66a()).runTest(request, response);
			(new testcases.CWE15_External_Control_of_System_or_Configuration_Setting.CWE15_External_Control_of_System_or_Configuration_Setting__getParameter_Servlet_67a()).runTest(request, response);
			(new testcases.CWE15_External_Control_of_System_or_Configuration_Setting.CWE15_External_Control_of_System_or_Configuration_Setting__getParameter_Servlet_71a()).runTest(request, response);
			(new testcases.CWE15_External_Control_of_System_or_Configuration_Setting.CWE15_External_Control_of_System_or_Configuration_Setting__getParameter_Servlet_07()).runTest(request, response);
			(new testcases.CWE15_External_Control_of_System_or_Configuration_Setting.CWE15_External_Control_of_System_or_Configuration_Setting__getParameter_Servlet_68a()).runTest(request, response);
			(new testcases.CWE15_External_Control_of_System_or_Configuration_Setting.CWE15_External_Control_of_System_or_Configuration_Setting__getQueryString_Servlet_06()).runTest(request, response);
			(new testcases.CWE15_External_Control_of_System_or_Configuration_Setting.CWE15_External_Control_of_System_or_Configuration_Setting__getQueryString_Servlet_51a()).runTest(request, response);
			(new testcases.CWE15_External_Control_of_System_or_Configuration_Setting.CWE15_External_Control_of_System_or_Configuration_Setting__getCookies_Servlet_71a()).runTest(request, response);
			(new testcases.CWE15_External_Control_of_System_or_Configuration_Setting.CWE15_External_Control_of_System_or_Configuration_Setting__getParameter_Servlet_05()).runTest(request, response);
			(new testcases.CWE15_External_Control_of_System_or_Configuration_Setting.CWE15_External_Control_of_System_or_Configuration_Setting__getParameter_Servlet_11()).runTest(request, response);
			(new testcases.CWE15_External_Control_of_System_or_Configuration_Setting.CWE15_External_Control_of_System_or_Configuration_Setting__getCookies_Servlet_11()).runTest(request, response);
			(new testcases.CWE15_External_Control_of_System_or_Configuration_Setting.CWE15_External_Control_of_System_or_Configuration_Setting__getCookies_Servlet_31()).runTest(request, response);
			(new testcases.CWE15_External_Control_of_System_or_Configuration_Setting.CWE15_External_Control_of_System_or_Configuration_Setting__getCookies_Servlet_04()).runTest(request, response);
			(new testcases.CWE15_External_Control_of_System_or_Configuration_Setting.CWE15_External_Control_of_System_or_Configuration_Setting__getParameter_Servlet_45()).runTest(request, response);
			(new testcases.CWE15_External_Control_of_System_or_Configuration_Setting.CWE15_External_Control_of_System_or_Configuration_Setting__getQueryString_Servlet_61a()).runTest(request, response);
			(new testcases.CWE15_External_Control_of_System_or_Configuration_Setting.CWE15_External_Control_of_System_or_Configuration_Setting__getQueryString_Servlet_13()).runTest(request, response);
			(new testcases.CWE15_External_Control_of_System_or_Configuration_Setting.CWE15_External_Control_of_System_or_Configuration_Setting__getCookies_Servlet_15()).runTest(request, response);
			(new testcases.CWE15_External_Control_of_System_or_Configuration_Setting.CWE15_External_Control_of_System_or_Configuration_Setting__getParameter_Servlet_42()).runTest(request, response);
			(new testcases.CWE15_External_Control_of_System_or_Configuration_Setting.CWE15_External_Control_of_System_or_Configuration_Setting__getCookies_Servlet_51a()).runTest(request, response);
			(new testcases.CWE15_External_Control_of_System_or_Configuration_Setting.CWE15_External_Control_of_System_or_Configuration_Setting__getCookies_Servlet_13()).runTest(request, response);
			(new testcases.CWE15_External_Control_of_System_or_Configuration_Setting.CWE15_External_Control_of_System_or_Configuration_Setting__getParameter_Servlet_75a()).runTest(request, response);
			(new testcases.CWE15_External_Control_of_System_or_Configuration_Setting.CWE15_External_Control_of_System_or_Configuration_Setting__getCookies_Servlet_14()).runTest(request, response);
			/* END-AUTOGENERATED-SERVLET-TESTS-1 */
		} catch (Throwable t) {

			/* this will only happen on an IOException or something (the runTest for the test cases will catch any exceptions from the test cases).  So, we just abort
			 * and write to the console (since we can't write to the response without possibly throwing another exception)
			 */
			
			System.out.println(
					" Caught thowable from doGetCWE1 ");

			System.out.println(" Throwable's message = " + t.getMessage());
			
			System.out.println("Stack trace below");

			StackTraceElement stes[] = t.getStackTrace();

			for (StackTraceElement ste : stes) {
				System.out.println("  " + ste.toString());
			} 
		}
	}
		
	private static void doGetCWE2(HttpServletRequest request, HttpServletResponse response) {
		try {
			/* BEGIN-AUTOGENERATED-SERVLET-TESTS-2 */

			/* END-AUTOGENERATED-SERVLET-TESTS-2 */
		} catch (Throwable t) {

			/* this will only happen on an IOException or something (the runTest for the test cases will catch any exceptions from the test cases).  So, we just abort
			 * and write to the console (since we can't write to the response without possibly throwing another exception)
			 */
			
			System.out.println(
					" Caught thowable from doGetCWE2 ");

			System.out.println(" Throwable's message = " + t.getMessage());
			
			System.out.println("Stack trace below");

			StackTraceElement stes[] = t.getStackTrace();

			for (StackTraceElement ste : stes) {
				System.out.println("  " + ste.toString());
			} 
		}
	}
		
	private static void doGetCWE3(HttpServletRequest request, HttpServletResponse response) {
		try {
			/* BEGIN-AUTOGENERATED-SERVLET-TESTS-3 */

			/* END-AUTOGENERATED-SERVLET-TESTS-3 */
		} catch (Throwable t) {

			/* this will only happen on an IOException or something (the runTest for the test cases will catch any exceptions from the test cases).  So, we just abort
			 * and write to the console (since we can't write to the response without possibly throwing another exception)
			 */
			
			System.out.println(
					" Caught thowable from doGetCWE3 ");

			System.out.println(" Throwable's message = " + t.getMessage());
			
			System.out.println("Stack trace below");

			StackTraceElement stes[] = t.getStackTrace();

			for (StackTraceElement ste : stes) {
				System.out.println("  " + ste.toString());
			} 
		}
	}

	private static void doGetCWE4(HttpServletRequest request, HttpServletResponse response) {
		try {
			/* BEGIN-AUTOGENERATED-SERVLET-TESTS-4 */

			/* END-AUTOGENERATED-SERVLET-TESTS-4 */
		} catch (Throwable t) {

			/* this will only happen on an IOException or something (the runTest for the test cases will catch any exceptions from the test cases).  So, we just abort
			 * and write to the console (since we can't write to the response without possibly throwing another exception)
			 */
			
			System.out.println(
					" Caught thowable from doGetCWE4 ");

			System.out.println(" Throwable's message = " + t.getMessage());
			
			System.out.println("Stack trace below");

			StackTraceElement stes[] = t.getStackTrace();

			for (StackTraceElement ste : stes) {
				System.out.println("  " + ste.toString());
			} 
		}
	}
		
	private static void doGetCWE5(HttpServletRequest request, HttpServletResponse response) {
		try {
			/* BEGIN-AUTOGENERATED-SERVLET-TESTS-5 */

			/* END-AUTOGENERATED-SERVLET-TESTS-5 */
		} catch (Throwable t) {

			/* this will only happen on an IOException or something (the runTest for the test cases will catch any exceptions from the test cases).  So, we just abort
			 * and write to the console (since we can't write to the response without possibly throwing another exception)
			 */
			
			System.out.println(
					" Caught thowable from doGetCWE5 ");

			System.out.println(" Throwable's message = " + t.getMessage());
			
			System.out.println("Stack trace below");

			StackTraceElement stes[] = t.getStackTrace();

			for (StackTraceElement ste : stes) {

				System.out.println("  " + ste.toString());
			} 
		}
	}		
		
	private static void doGetCWE6(HttpServletRequest request, HttpServletResponse response) {
		try {
			/* BEGIN-AUTOGENERATED-SERVLET-TESTS-6 */

			/* END-AUTOGENERATED-SERVLET-TESTS-6 */
		} catch (Throwable t) {

			/* this will only happen on an IOException or something (the runTest for the test cases will catch any exceptions from the test cases).  So, we just abort
			 * and write to the console (since we can't write to the response without possibly throwing another exception)
			 */
			
			System.out.println(
					" Caught thowable from doGetCWE6 ");

			System.out.println(" Throwable's message = " + t.getMessage());
			
			System.out.println("Stack trace below");

			StackTraceElement stes[] = t.getStackTrace();

			for (StackTraceElement ste : stes) {
				System.out.println("  " + ste.toString());
			} 
		}
	}

	private static void doGetCWE7(HttpServletRequest request, HttpServletResponse response) {
		try {
			/* BEGIN-AUTOGENERATED-SERVLET-TESTS-7 */

			/* END-AUTOGENERATED-SERVLET-TESTS-7 */
		} catch (Throwable t) {

			/* this will only happen on an IOException or something (the runTest for the test cases will catch any exceptions from the test cases).  So, we just abort
			 * and write to the console (since we can't write to the response without possibly throwing another exception)
			 */
			
			System.out.println(
					" Caught thowable from doGetCWE7 ");

			System.out.println(" Throwable's message = " + t.getMessage());
			
			System.out.println("Stack trace below");

			StackTraceElement stes[] = t.getStackTrace();

			for (StackTraceElement ste : stes) {
				System.out.println("  " + ste.toString());
			} 
		}
	}		
	
	private static void doGetCWE8(HttpServletRequest request, HttpServletResponse response) {
		try {
			/* BEGIN-AUTOGENERATED-SERVLET-TESTS-8 */

			/* END-AUTOGENERATED-SERVLET-TESTS-8 */
		} catch (Throwable t) {

			/* this will only happen on an IOException or something (the runTest for the test cases will catch any exceptions from the test cases).  So, we just abort
			 * and write to the console (since we can't write to the response without possibly throwing another exception)
			 */
			
			System.out.println(
					" Caught thowable from doGetCWE8 ");

			System.out.println(" Throwable's message = " + t.getMessage());
			
			System.out.println("Stack trace below");

			StackTraceElement stes[] = t.getStackTrace();

			for (StackTraceElement ste : stes) {
				System.out.println("  " + ste.toString());
			} 
		}
	}	
	
	private static void doGetCWE9(HttpServletRequest request, HttpServletResponse response) {
		try {
			/* BEGIN-AUTOGENERATED-SERVLET-TESTS-9 */

			/* END-AUTOGENERATED-SERVLET-TESTS-9 */
		} catch (Throwable t) {

			/* this will only happen on an IOException or something (the runTest for the test cases will catch any exceptions from the test cases).  So, we just abort
			 * and write to the console (since we can't write to the response without possibly throwing another exception)
			 */
			
			System.out.println(
					" Caught thowable from doGetCWE9 ");

			System.out.println(" Throwable's message = " + t.getMessage());
			
			System.out.println("Stack trace below");

			StackTraceElement stes[] = t.getStackTrace();

			for (StackTraceElement ste : stes) {
				System.out.println("  " + ste.toString());
			} 
		}
	}		
}
