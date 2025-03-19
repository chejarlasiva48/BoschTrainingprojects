import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService userService;

    @Autowired
    private BookService bookService;

    @PostMapping("/register")
    public String register(@RequestParam String username, @RequestParam String password) {
        userService.createUser(username, password, "ROLE_USER");
        return "User registered successfully!";
    }

    @PostMapping("/login")
    public String login(@RequestParam String username, @RequestParam String password) {
        // Handle login logic (authentication)
        return "User logged in!";
    }

    @GetMapping("/books")
    public List<Book> viewBooks() {
        return bookService.getAllBooks();
    }

    @PostMapping("/buy/{id}")
    public String buyBook(@PathVariable Long id, @RequestParam int quantity) {
        // Handle buying logic (create order)
        return "Book purchased!";
    }
}
