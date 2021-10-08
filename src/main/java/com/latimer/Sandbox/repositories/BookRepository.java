package com.latimer.Sandbox.repositories;

import org.springframework.data.repository.*;
import com.latimer.Sandbox.model.Book;

public interface BookRepository extends CrudRepository<Book, Long> {
}
