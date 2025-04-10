public class School {

	private String name;
	private String address;
	private Principal principal;
	private Classroom[] classrooms;
	private int classCount = 0;


	public School(String name, String address, Principal principal) {

		this.name = name;
		this.address = address;
		this.principal = principal;
		this.classrooms = new Classroom[10]; 
	}



	public void addClassroom (Classroom c) {

		if (classCount < classrooms.length) {

			classrooms [classCount++] = c;
		}
	}


	@Override
	public String toString() {

		String display = "School: " + name + ", Address: " + address + "\n"
			        + "Principal: " + principal.toString() + "\n"
                                + "Classes:\n";

		for (int i = 0; i < classCount; i++) {
			
			display += classrooms[i].toString() + "\n";
		}

		return display;
	}

}
