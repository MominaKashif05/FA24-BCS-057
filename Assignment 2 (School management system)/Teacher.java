class Teacher extends Person {

	private String subject;
	private int teacherID;


	public Teacher(String name, int age, String subject, int teacherID) {

		super(name, age);
		this.subject = subject;
		this.teacherID = teacherID;
	}


	@Override
	public String toString() {
		return super.toString() + ", Subject: " + this.subject + ", ID: " + this.teacherID;
	}


	@Override
	public boolean equals (Object obj) {

		if (this == obj) return true;

		if (obj instanceof Teacher) {

			Teacher other = (Teacher) obj;
			
				return this.teacherID == other.teacherID;
		}

		return false;

	}
}