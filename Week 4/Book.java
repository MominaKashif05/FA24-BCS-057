public class Book {


    private String title;
    private String issn;
    private String edition;
    private Date publicationDate;
    private Person author;



    public Book(String title, String issn, String edition, Date publicationDate, Person author) {

        this.title = title;
        this.issn = issn;
        this.edition = edition;
        this.publicationDate = publicationDate;
        this.author = author;
    }



    public Book(Book other) {

        this.title = other.title;
        this.issn = other.issn;
        this.publicationDate = new Date(other.publicationDate);
        this.author = new Person(other.author);
    }




    public String getTitle() {

     return title; 
    }

    public void setTitle (String title) { 
          this.title = title; 
    }
    


    public String getIssn() { 
      return issn; 
    }
    
   public void setIssn (String issn) { 
         this.issn = issn; 
   }
    


   public String getEdition() {

     return edition; 
    }

    public void setEdition (String edition) { 
          this.edition = edition; 
    }




    public Person getAuthor() {

     return author; 
    }

    public void setAuthor(Person author) { 
          this.author = author; 
    }



   
    public Date getPublicationDate() {

     return publicationDate; 
    }

    public void setPublicationDate (Date publicationDate) { 
          this.publicationDate = publicationDate; 
    }


    public void showBookDetails() {
        System.out.println("Title: " + title + ", ISSN: " + issn);
        publicationDate.showDate();
        author.showPersonDetails();
    }


}