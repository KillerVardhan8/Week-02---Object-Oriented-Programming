import java.util.*;

class Book{
    private String title;
    private int publicationYear;

    public Book(String title, int publicationYear) {
        this.title = title;
        this.publicationYear = publicationYear;
    }

    public void displayDetails(){
        System.out.println("Book name : "+title);
        System.out.println("Publication Year : "+publicationYear);
    }
}

class Author extends Book{
    private String name;
    private String bio;

    public Author(String title, int publicationYear, String name, String bio) {
        super(title, publicationYear);
        this.name = name;
        this.bio = bio;
    }

    @Override
    public void displayDetails() {
        super.displayDetails();
        System.out.println("Author Name : "+name);
        System.out.println("Bio : "+bio);
    }
}
public class LibraryManagementSystem {
    public static void main(String[] args) {
        Author author1=new Author("Atomic Habits",2013,"James Clear","Entrepreneur");

        author1.displayDetails();
    }
}
