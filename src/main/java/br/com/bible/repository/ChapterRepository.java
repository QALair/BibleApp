package br.com.bible.repository;

import br.com.bible.model.Chapter;
import org.springframework.stereotype.Service;
import org.springframework.data.jpa.repository.JpaRepository;

@Service
public interface ChapterRepository extends JpaRepository<Chapter, Integer>{
}
