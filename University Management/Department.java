public class Department {

    private final String name;
    private Person incharge;
    private Lab[] labs = new Lab[5];



    public Department(String name, Person incharge) {

        this.name = name;
        this.incharge = incharge;

        for (int i = 0; i < labs.length; i++) {

            labs[i] = new Lab("Lab " + (i + 1), new Person("Staff" + (i + 1), "Manager"));
        }
    }



    public void showDepartmentDetails() {

        System.out.println("Name: " + name);
        incharge.showPersonDetails();

        for (int i = 0; i < labs.length; i++) {
            labs[i].showLabDetails();  // Assuming Lab has showLabDetails()
        }
    }



    public void setIncharge(Person incharge) {
        
	this.incharge = incharge;
    }


    public String getName() {
        
	return name;
    }

    public Person getIncharge() {
        
	return incharge;
    }
}
