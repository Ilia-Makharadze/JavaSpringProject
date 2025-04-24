package ge.tsu.demo;

import ge.tsu.demo.model.Book;
import ge.tsu.demo.repository.BookRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class DataInitializer {

    @Bean
    CommandLineRunner initDatabase(BookRepository repository) {
        return args -> {
            if (repository.count() == 0) {
                repository.save(new Book("title 1", "author 1", "genre 1"));
                repository.save(new Book("title 2", "author 2", "genre 2"));
                System.out.println("Sample books have been added to the database.");
            }
        };
    }
}
