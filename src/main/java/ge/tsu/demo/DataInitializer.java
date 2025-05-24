package ge.tsu.demo;

import ge.tsu.demo.model.Book;
import ge.tsu.demo.model.User;
import ge.tsu.demo.repository.BookRepository;
import ge.tsu.demo.repository.UserRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class DataInitializer {

    @Bean
    CommandLineRunner initDatabase(BookRepository bookRepo, UserRepository userRepo) {
        return args -> {
            if (bookRepo.count() == 0) {
                bookRepo.save(new Book("To Kill a Mockingbird", "Harper Lee", "Fiction"));
                bookRepo.save(new Book("1984", "George Orwell", "Dystopian"));
                bookRepo.save(new Book("Moby-Dick", "Herman Melville", "Adventure"));
                bookRepo.save(new Book("Pride and Prejudice", "Jane Austen", "Romance"));
                bookRepo.save(new Book("The Great Gatsby", "F. Scott Fitzgerald", "Classic"));
                bookRepo.save(new Book("War and Peace", "Leo Tolstoy", "Historical Fiction"));
                bookRepo.save(new Book("The Catcher in the Rye", "J.D. Salinger", "Fiction"));
                bookRepo.save(new Book("Crime and Punishment", "Fyodor Dostoevsky", "Psychological Fiction"));
                bookRepo.save(new Book("The Hobbit", "J.R.R. Tolkien", "Fantasy"));
                bookRepo.save(new Book("Brave New World", "Aldous Huxley", "Dystopian"));
                bookRepo.save(new Book("1984", "George Orwell", "Dystopian"));
                bookRepo.save(new Book("To Kill a Mockingbird", "Harper Lee", "Classic"));
                bookRepo.save(new Book("The Great Gatsby", "F. Scott Fitzgerald", "Classic"));
                bookRepo.save(new Book("Moby Dick", "Herman Melville", "Adventure"));
                bookRepo.save(new Book("Pride and Prejudice", "Jane Austen", "Romance"));
                bookRepo.save(new Book("The Catcher in the Rye", "J.D. Salinger", "Classic"));
                bookRepo.save(new Book("Jane Eyre", "Charlotte Brontë", "Romance"));
                bookRepo.save(new Book("The Hobbit", "J.R.R. Tolkien", "Fantasy"));
                bookRepo.save(new Book("Fahrenheit 451", "Ray Bradbury", "Dystopian"));
                bookRepo.save(new Book("Crime and Punishment", "Fyodor Dostoevsky", "Philosophical"));
                bookRepo.save(new Book("Wuthering Heights", "Emily Brontë", "Classic"));
                bookRepo.save(new Book("War and Peace", "Leo Tolstoy", "Historical"));
                bookRepo.save(new Book("The Odyssey", "Homer", "Epic"));
                bookRepo.save(new Book("The Iliad", "Homer", "Epic"));
                bookRepo.save(new Book("Don Quixote", "Miguel de Cervantes", "Adventure"));
                bookRepo.save(new Book("The Lord of the Rings", "J.R.R. Tolkien", "Fantasy"));
                bookRepo.save(new Book("Frankenstein", "Mary Shelley", "Gothic"));
                bookRepo.save(new Book("Dracula", "Bram Stoker", "Horror"));
                bookRepo.save(new Book("The Brothers Karamazov", "Fyodor Dostoevsky", "Philosophical"));
                bookRepo.save(new Book("Great Expectations", "Charles Dickens", "Classic"));
                bookRepo.save(new Book("The Picture of Dorian Gray", "Oscar Wilde", "Philosophical"));
                bookRepo.save(new Book("Anna Karenina", "Leo Tolstoy", "Romance"));
                bookRepo.save(new Book("Les Misérables", "Victor Hugo", "Historical"));
                bookRepo.save(new Book("The Count of Monte Cristo", "Alexandre Dumas", "Adventure"));
                bookRepo.save(new Book("The Alchemist", "Paulo Coelho", "Philosophical"));
                bookRepo.save(new Book("A Tale of Two Cities", "Charles Dickens", "Historical"));
                bookRepo.save(new Book("One Hundred Years of Solitude", "Gabriel García Márquez", "Magical Realism"));
                bookRepo.save(new Book("Catch-22", "Joseph Heller", "Satire"));
                bookRepo.save(new Book("Slaughterhouse-Five", "Kurt Vonnegut", "Science Fiction"));
                bookRepo.save(new Book("Beloved", "Toni Morrison", "Historical"));
                bookRepo.save(new Book("Lolita", "Vladimir Nabokov", "Controversial"));
                bookRepo.save(new Book("The Stranger", "Albert Camus", "Philosophical"));
                bookRepo.save(new Book("The Trial", "Franz Kafka", "Absurdist"));
                bookRepo.save(new Book("The Sun Also Rises", "Ernest Hemingway", "Modernist"));
                bookRepo.save(new Book("The Sound and the Fury", "William Faulkner", "Southern Gothic"));
                bookRepo.save(new Book("Of Mice and Men", "John Steinbeck", "Classic"));
                bookRepo.save(new Book("East of Eden", "John Steinbeck", "Classic"));
                bookRepo.save(new Book("Ulysses", "James Joyce", "Modernist"));
                bookRepo.save(new Book("The Metamorphosis", "Franz Kafka", "Absurdist"));
                bookRepo.save(new Book("Heart of Darkness", "Joseph Conrad", "Psychological"));
                bookRepo.save(new Book("The Old Man and the Sea", "Ernest Hemingway", "Classic"));
                bookRepo.save(new Book("On the Road", "Jack Kerouac", "Beat"));
                bookRepo.save(new Book("The Bell Jar", "Sylvia Plath", "Semi-Autobiographical"));
                bookRepo.save(new Book("Rebecca", "Daphne du Maurier", "Gothic"));
                bookRepo.save(new Book("A Clockwork Orange", "Anthony Burgess", "Dystopian"));
                bookRepo.save(new Book("Lord of the Flies", "William Golding", "Allegorical"));
                bookRepo.save(new Book("Invisible Man", "Ralph Ellison", "African American Literature"));
                bookRepo.save(new Book("Midnight's Children", "Salman Rushdie", "Magical Realism"));
                bookRepo.save(new Book("The Kite Runner", "Khaled Hosseini", "Contemporary Fiction"));

                System.out.println("Sample books have been added to the database.");
            }

            if (userRepo.count() == 0) {
                userRepo.save(new User("user1", "user1@example.com"));
                userRepo.save(new User("user2", "user2@example.com"));
                System.out.println("Sample users have been added to the database.");
            }
        };
    }
}
