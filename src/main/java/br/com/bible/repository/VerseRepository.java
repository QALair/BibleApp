package br.com.bible.repository;

import br.com.bible.model.Verse;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

@Repository
public interface VerseRepository extends JpaRepository<Verse, Integer> {
    @Query(value = "SELECT TEXT FROM VERSE V WHERE V.BOOKID = :BOOKID AND V.CHAPTERID = :CHAPTERID AND V.ID = :ID",
            nativeQuery = true)
    List<String> findTextById(
            @Param("BOOKID") Integer bookID,
            @Param("CHAPTERID") Integer chapterID,
            @Param("ID") Integer ID);
}
