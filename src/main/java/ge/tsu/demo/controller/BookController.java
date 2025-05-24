package ge.tsu.demo.controller;

import ge.tsu.demo.model.Book;
import ge.tsu.demo.repository.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ModelAttribute;

@Controller
public class BookController {

    @Autowired
    private BookRepository bookRepository;

    // Get request to show the list of books
    @GetMapping({"/", "/home"})
    public String index(Model model) {
        model.addAttribute("books", bookRepository.findAll());
        model.addAttribute("book", new Book());
        return "index";
    }

    // Get request to show the search page
    @GetMapping("/search")
    public String searchBooks(Model model) {
        model.addAttribute("books", bookRepository.findAll());
        return "index";
    }

    // Get request to show the Add Book form
    @GetMapping("/addBookForm")
    public String addBookForm(Model model) {
        model.addAttribute("book", new Book());  // create a new book object for the form
        return "addBook";
    }

    // POST request to add a new book
    @PostMapping("/addBook")
    public String addBook(@ModelAttribute("book") Book book) {
        bookRepository.save(book);
        return "redirect:/home"; // redirect to home page after adding the book
    }
}
