class Student extends Person {

	private int rollNumber;


	public Student(String name, int age, int rollNumber) {

		super(name, age);
		this.rollNumber = rollNumber;
	}


	@Override
	public String toString() {

		return super.toString() + ", Roll No: " + this.rollNumber;
	}

	
	@Override
	public boolean equals (Object obj) {

		if (this == obj) return true;

		if (obj instanceof Student) {

			Student other = (Student) obj;

			return this.rollNumber == other.rollNumber;
		}

		return false;
	}
}