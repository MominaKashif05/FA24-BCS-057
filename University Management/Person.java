public class Person {


      private String name;
      private String role;
      


//Default parameterised constructor

      Person (String name, String role) {

             this.name = name;
             this.role = role;

      }



//Print person details

    public void showPersonDetails() {

             System.out.println ("Name: " + name + ", Role: " + role);
           
    }


//setters

     public void setName (String name) {

           this.name = name;
     }


     public void setRole (String role) {

           this.role = role;
     }


//getters 

    public String getName () {

          return name;
    }


    public String getRole () {

          return role;
    }



}