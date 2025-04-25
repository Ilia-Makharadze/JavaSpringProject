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
                bookRepo.save(new Book("title 1", "author 1", "genre 1"));
                bookRepo.save(new Book("title 2", "author 2", "genre 2"));
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
