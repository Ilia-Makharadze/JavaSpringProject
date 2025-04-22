package ge.tsu.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.client.RestTemplate;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.ResponseEntity;
import org.springframework.http.HttpMethod;

import java.util.List;
import java.util.Map;

@Controller
public class BookController {

    @GetMapping("/")
    public String index(Model model) {
        List<Map<String, String>> books = List.of(
                Map.of("title", "Clean Code", "author", "Robert C. Martin"),
                Map.of("title", "Effective Java", "author", "Joshua Bloch"),
                Map.of("title", "The Pragmatic Programmer", "author", "Andy Hunt")
        );
        model.addAttribute("books", books);
        return "index";
    }

    @GetMapping("/search")
    public String searchBooks(Model model) {
        RestTemplate restTemplate = new RestTemplate();

        ResponseEntity<List<Map<String, String>>> response = restTemplate.exchange(
                "https://678e2d7ba64c82aeb11f5a99.mockapi.io/food/api/booksApi",
                HttpMethod.GET,
                null,
                new ParameterizedTypeReference<>() {}
        );

        List<Map<String, String>> books = response.getBody();
        model.addAttribute("books", books);
        return "index"; // იგივე HTML ტემპლეთი
    }
}
