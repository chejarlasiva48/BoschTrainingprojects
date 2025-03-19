import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookService {

    @Autowired
    private BookRepository bookRepository;

    public List<Book> getAllBooks() {
        return bookRepository.findAll();
    }

    public Book addBook(Book book) {
        return bookRepository.save(book);
    }

    public Book removeBook(Long bookId) {
        Book book = bookRepository.findById(bookId).orElseThrow();
        bookRepository.delete(book);
        return book;
    }

    public Book updateBookQuantity(Long bookId, int quantity) {
        Book book = bookRepository.findById(bookId).orElseThrow();
        book.setQuantity(book.getQuantity() + quantity);
        return bookRepository.save(book);
    }
}
