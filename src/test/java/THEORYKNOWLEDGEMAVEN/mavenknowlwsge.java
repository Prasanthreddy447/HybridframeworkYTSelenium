package THEORYKNOWLEDGEMAVEN;

public class mavenknowlwsge {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//1 way(drawback no reports no scrrenshot) through eclipse
		//first click on project and run as maven test
		//check whether project has maven sure fire plugin
		//while installing eclipse only we will get maven in eclipse(help -->avail software -->already installed -->check maven
		//while running in maven we should keep test cases name as loginTest,registerTest...
		//Test keyword should be there in test case
		//now right click and run a maven test
		//now maven only running test cases going to pom xml and identifing test cases
		//no testng file will run on context so no reporting and no screenshot
		//in pom.xml we will have structure why becuase we are creating prject with maven-archetype-version
		
		//2 way through eclipse
		//add maven surefire plugin to pom.xml which contains tesng.xml file in it
		//add testname as test at end in testng.xml file
		//then run that project run as maven test it automacally invoke pom.xml and testng.xml file
		//reports and screenshot will be coming
		
		//3 way through command prompt
		 //close eclipse and open the project location and see pom exist 
		//and through cmd run the command mvn test
		//to run this we need mvn in local machine
		//download maven and environment varaibles and path  add maven_Homen and bin folder
		
		
		
		//above three ways we are doing manually.
		
		//to rectify we need go for jenkins which automates u r script whenever u need.
		//u can set time when to run u r code
		
		
		
		
		/*
		 what is use maven in selenium?
		 
		 maven is used for adding dependencies automatically
		 when we add dependencies in POM then it jar files automatically downloaded
		 
		 maven provides standard structure project
		 
		 maven automates build process, which is compiling the code and running the tests automatically
		 
		 we can integrae the ci/cd tools like jenkins
		 
		 
		 */
		
		

	}

}
