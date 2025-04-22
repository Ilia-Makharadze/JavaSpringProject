package ge.tsu.demo;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

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
}
