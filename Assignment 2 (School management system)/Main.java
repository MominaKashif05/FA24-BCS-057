public class Main {

	public static void main(String[] args) {

		Principal principal = new Principal("Mr. Shahid Bhatti", 50, 15);


		School school = new School("COMSATS Lahore", "LDA Avenue, Lahore", principal);


		Teacher teacher1 = new Teacher("Rimsha Anam", 60, "Professional Practices", 100);
		Teacher teacher2 = new Teacher("Ayesha Aziz", 40, "Functional English", 101);


		Classroom class1 = new Classroom("Semester 1", "G10", teacher1);
		Classroom class2 = new Classroom("Semester 2", "G11", teacher2);


		school.addClassroom(class1);
		school.addClassroom(class2);


		Student student1 = new Student ("Momina Kashif", 20, 57);
		Student student2 = new Student ("Cainoosh Khan", 20, 28);

		class1.addStudent(student1);
		class2.addStudent(student2);

		System.out.println (school.toString());

	}
}