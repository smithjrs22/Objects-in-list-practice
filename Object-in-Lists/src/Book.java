public class Book {
    private String title;
    private int numPages;
    private int publicationYear;

    public Book (String title, int numPages, int publicationYear){
        this.title = title;
        this.numPages = numPages;
        this.publicationYear = publicationYear;
    }

    public void getEverything(){
        System.out.println(title); 
        System.out.println(numPages); 
        System.out.println(publicationYear);  

    }
    
    public String getName(){
        return title;
    }
    



}
