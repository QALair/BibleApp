package br.com.bible.repository;

import br.com.bible.model.Book;
import org.springframework.stereotype.Service;
import org.springframework.data.jpa.repository.JpaRepository;

@Service
public interface BookRepository extends JpaRepository<Book, Integer>{
}
