public class Person {

    private String name;
    private Address address;
    private String role;


    public Person(String name, Address address) {
        this.name = name;
        this.address = address;
    }


    public Person(Person other) {
        this.name = other.name;
        this.address = new Address(other.address);
    }




    public String getName() { 
    return name; 
    }


    public void setName(String name) {  
    this.name = name; 
    }





    public String getRole() { 
    return role; 
    }


    public void setRole(String role) {  
    this.role = role; 
    }



}

      