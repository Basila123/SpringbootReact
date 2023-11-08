package CG.code.bookStore.controller;

import CG.code.bookStore.dto.BookDTO;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;
@RestController
@RequestMapping("api/v1/books")
public class BookController {
    // @GetMapping("api/v1/books") directly we can pass or
    @GetMapping()
    public ResponseEntity<List<BookDTO>> getBooks(){
        BookDTO book=BookDTO.builder()
                .title("My first title")
                .build();
        List<BookDTO> books=new ArrayList<>();
        books.add(book);
        return  ResponseEntity.ok(books);
         //       .
    }
}
