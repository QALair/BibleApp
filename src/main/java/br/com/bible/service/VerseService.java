package br.com.bible.service;

import br.com.bible.model.Verse;
import br.com.bible.repository.VerseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class VerseService {

    @Autowired
    private VerseRepository repository;

    public List<Verse> fetchVerseList(){
        return (List<Verse>) repository.findAll();
    }

    public Optional<Verse> fetchVerseById(Verse verse, Integer id){
        return repository.findById(id);
    }

}
