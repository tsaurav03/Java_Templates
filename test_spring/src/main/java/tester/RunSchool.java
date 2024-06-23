package tester;

import dependency.CricketCoach;
import dependency.EnglishTeacher;
import dependent.PublicSchool;
import dependent.School;

public class RunSchool {

	public static void main(String[] args) {
		PublicSchool mySchool = new PublicSchool(new EnglishTeacher());
		mySchool.manageAcademics();
		// create dependency  for coach 
		mySchool.setSportsCoach(new CricketCoach());
		mySchool.organizeSportsEvent();
	}

}
