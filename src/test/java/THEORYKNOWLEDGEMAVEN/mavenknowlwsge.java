package THEORYKNOWLEDGEMAVEN;

public class mavenknowlwsge {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//1 way(drawback no reports no scrrenshot) through eclipse
		//first click on project and run as maven test
		//check whether project has maven sure fire plugin
		//while installing eclipse only we will get maven in eclipse
		//while running in maven we should keep test cases name as loginTest,registerTest...
		//Test keyword should be there in test case
		//now right click and run a maven test
		//now maven only running test cases going to pom xml and identifing test cases
		//no testng file will run on context so no reporting and no screenshot
		
		//2 way through eclipse
		//add maven surefire plugin to pom.xml which contains tesng.xml file in it
		//add testname as test at end in testng.xml file
		//then run that project run as maven test it automacally invoke pom.xml and testng.xml file
		//reports and screenshot will be coming
		
		//3 way through command prompt
		 //close eclipse and open the project location and see pom exist 
		//and through cmd run the command mvn test
		//to run this we need mvn in local machine
		//download maven and environment varaibles add maven_Home
		
		
		
		//above three ways we are doing manually.
		
		//to rectify we need go for jenkins which automates u r script whenever u need.
		
		
		
		

	}

}
