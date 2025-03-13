public class Lab {


	private String name;
	private Person staff;
	PC computers[] = new PC [50];



	Lab (String name, Person staff) {

		this.name = name;
		this.staff = staff;
		

		for (int i=0; i<computers.length; i++) {

			computers[i] = new PC(i);
		}


	}

// display function 

	public void showLabDetails () {

		System.out.println( "Name: " + name);
		staff.showPersonDetails();

		for (int i=0; i<computers.length; i++) {

			System.out.println (computers[i]);
		}
	}



//setters

     public void setName (String name) {

           this.name = name;
     }


     public void setStaff (Person staff) {

           this.staff = staff;
     }



//getters 

    public String getName () {

          return name;
    }


    public Person getStaff () {

          return staff;
    }

}
