import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("/admin")
public class AdminController {

    @Autowired
    private BookService bookService;

    @PostMapping("/add")
    public String addBook(@RequestBody Book book) {
        bookService.addBook(book);
        return "Book added successfully!";
    }

    @PostMapping("/remove/{id}")
    public String removeBook(@PathVariable Long id) {
        bookService.removeBook(id);
        return "Book removed successfully!";
    }

    @PostMapping("/update/{id}")
    public String updateBookQuantity(@PathVariable Long id, @RequestParam int quantity) {
        bookService.updateBookQuantity(id, quantity);
        return "Book quantity updated!";
    }

    @GetMapping("/books")
    public List<Book> viewBooks() {
        return bookService.getAllBooks();
    }
}
