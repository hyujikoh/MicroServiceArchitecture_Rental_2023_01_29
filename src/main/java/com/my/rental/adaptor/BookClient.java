package com.my.rental.adaptor;

import com.my.rental.web.rest.dto.BookInfoDTO;
import org.springframework.cloud.openfeign.FeignAutoConfiguration;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(name = "book", configuration = {FeignAutoConfiguration.class})
public interface BookClient {
    @GetMapping("/api/books/bookInfo/{bookId}")
    ResponseEntity<BookInfoDTO> findBookInfo(@PathVariable("bookId") Long bookid);
}
