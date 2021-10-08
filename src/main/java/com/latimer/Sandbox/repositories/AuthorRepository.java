package com.latimer.Sandbox.repositories;

import org.springframework.data.repository.*;
import com.latimer.Sandbox.model.Author;

public interface AuthorRepository extends CrudRepository<Author, Long> {
}
