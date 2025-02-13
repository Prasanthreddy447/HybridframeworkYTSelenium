package THEORYKNOWLEDGEMAVEN;

import java.util.Date;

public class genartestamp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Date d = new Date();
		String time =d.toString();
		//System.out.println(time);
		String nospace=time.replace(" ", "_");
		//System.out.println(nospace);
		String nospacewith=nospace.replace(":","_");
		System.out.println(nospacewith);

	}

}
