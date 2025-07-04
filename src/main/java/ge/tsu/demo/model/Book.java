package ge.tsu.demo.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Book {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String title;
    private String author;
    private String genre;
    //private String imageUrl;



    public Book(String title, String author, String genre) {
        this.title = title;
        this.author = author;
        this.genre = genre;
       // this.imageUrl = imageUrl;
    }

    public Book() {

    }


    public Long getId() { return id; }

    public void setId(Long id) { this.id = id; }

    public String getTitle() { return title; }

    public void setTitle(String title) { this.title = title; }

    public String getAuthor() { return author; }

    public void setAuthor(String author) { this.author = author; }

    public String getGenre() { return genre; }

    public void setGenre(String genre) { this.genre = genre; }
//    public String getImageUrl() {return imageUrl;}
//
//    public void setImageUrl(String imageUrl) {this.imageUrl = imageUrl;}
}
