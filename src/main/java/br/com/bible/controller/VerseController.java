package br.com.bible.controller;

import br.com.bible.model.Verse;
import br.com.bible.repository.VerseRepository;
import br.com.bible.service.VerseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class VerseController {
    @Autowired
    private VerseService verseService;
    @Autowired
    private VerseRepository verseRepository;

    @RequestMapping(value="/verse/{bookno}/{chapterno}/{verseno}")
    public String verse(
            @PathVariable String bookno,
            @PathVariable String chapterno,
            @PathVariable String verseno){
        return String.valueOf(verseRepository.findTextById(Integer.valueOf(bookno),Integer.valueOf(chapterno),Integer.valueOf(verseno)));
    }
}
