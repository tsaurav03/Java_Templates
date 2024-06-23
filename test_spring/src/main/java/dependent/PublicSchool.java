package dependent;

import dependency.Coach;
import dependency.CricketCoach;
import dependency.MathsTeacher;
import dependency.Teacher;

public class PublicSchool implements School {
	private Teacher subjectTeacher;// = new MathsTeacher();
	private Coach sportsCoach;
	// ctor based D.I (Dependency injection)
	// D.I = making the dependencies available to dependent

	public PublicSchool(Teacher teacher) {
		this.subjectTeacher = teacher;
		System.out.println("In constructor - " + getClass());
	}

	@Override
	public void manageAcademics() {
		System.out.println("Managing academics here -");
		subjectTeacher.teach();
	}

	@Override
	public void organizeSportsEvent() {
		System.out.println(" Managing sports here-");
        sportsCoach.getDailyWorkout();
	}

	public void setSportsCoach(Coach sportsCoach) {
		System.out.println("in Setter : coach");
		this.sportsCoach = sportsCoach;
	}

	

}
