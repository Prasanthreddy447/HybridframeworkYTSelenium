
public class Jenkinsknowledge {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Jenkins nothing but it is automating tool to run u r scripts by creating job
		//we need install jenkins war file
		//go to file location and open cmd prompt and run the command java -jar jenkins.war
		//for first time we need to copy password (right click edit copy)
		//we need go to localhost:8080 (localhost means our current machine ip address)
		//we can run the jenkins differnt port also for that we use command java -jar jenkins.war --httpport portnumber
		//then install plugins
		//now goto manage jenkins and tools and add javahome path and maven homepath
		//1)Create job using freestyle project
		//new item--> use custom workspace(general)-->in directory(path of project)
		//build steps -->invoke top level maven --> version(MAVEN_HOME)-->Goals(test)--> save
		//now build now the job
		//job will excute the project
		//no testng report because we need install plugin
		
		//insall plugin -->manage jenkins--> plugins-->availbale plugins-->testng
		//we need click on configure of job and in post action build we need add testng
		//now testng results tab will be coming and we can view the results
		//testng tab comes in build versions
		
		//in configure we build peridically that means automatically job will trigger if we give command
		
		
		//jenkins want run the job at midnight but my laptop will be in shut down then my project location will not be there so jenkins cannot run the job
		//that is reason we are going for github i.e cloud
		
		
	}

}
