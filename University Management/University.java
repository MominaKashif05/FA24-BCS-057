public class University {

	private final String name = "COMSATS";
	private final String address = "Lahore";
	private Person director;
	private Department[] departments = new Department [10];



	public University (Person director) {

		this.director = director;
		

		for (int i=0; i<departments.length; i++) {

			departments[i] = new Department ("Department " + (i+1), new Person ("Staff " + (i+1), "Incharge"));
		}
	}


	public void setDirector (Person director) {

		this.director = director;
	}


    public String getName () {

          return name;
    }


    public String getAddress() {

          return address;
    }

    public Person getDirector() {

          return director;
    }





}