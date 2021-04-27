package homeWork;

public class Main {

	public static void main(String[] args) {

		Course course1 = new Course("yazılım geliştirici geliştirme kampı(JAVA + REACT)", "Engin Demiroğ", 27);

		Course course2 = new Course("Programlamaya giriş için temel kurs", "Engin Demiroğ", 0);

		Course[] courses = { course1, course2 };

		for (Course course : courses) {
			System.out.println("Course  : " + course.name);
			System.out.println("Teacher : " + course.teacherName);
			System.out.println("progress percentage:" + course.percentageProgress + "\n" + "\n");

		}

		Card card1 = new Card(17645,"Ali");
		
		
		
		
		
		
		User user1 = new User("Ali");
		
		UserManager userManager = new UserManager();

		
		userManager.payWithCard(card1);
		userManager.logOut(user1);
		
	}

}
