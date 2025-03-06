public class Address {
      
      private String country;
      private String city;
      private String HouseNo;


     Address(String country, String city, String HouseNo){

             this.country = country;
             this.city = city;
             this.HouseNo = HouseNo;

             }


    Address(Address other) {
        this.country = other.country;
        this.city = other.city;
        this.HouseNo = other.HouseNo;
    }



     public String getCountry() { 

     return country; 
     }
    

     public void setCountry (String country) {

     this.country = country; 
     }
    

     public String getCity() { 

     return city; 
     }
    

     public void setCity (String city) {

     this.city = city; 
     }
    


     public String getHouseNo() { 

     return HouseNo; 
     }
    

     public void setHouseNo (String HouseNo) {

     this.HouseNo = HouseNo; 
     }
    
}
