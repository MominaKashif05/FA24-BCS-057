public class Classroom {

	private String className;
	private String classCode;
	private Teacher teacher;
	private Student[] students;
	private int studentCount = 0;


	public Classroom (String className, String classCode, Teacher teacher) {

		this.className = className;
		this.classCode = classCode;
		this.teacher = teacher;
		this.students = new Student[5]; 
	}


	public void addStudent (Student s) {

		if (studentCount < students.length) {

			students [studentCount++] = s;
		}

	}


	@Override
	public String toString() {

	String printDetails = "Class Name: " + className + ", Code: " + classCode + "\n"
			      + "Teacher: " + teacher.toString() + "\n"
                              + "Students:\n";


        for (int i = 0; i < studentCount; i++) {

            printDetails += "  " + students[i].toString() + "\n";
        }

        return printDetails;
    }
}