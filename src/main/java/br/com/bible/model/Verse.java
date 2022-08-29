package br.com.bible.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Data
@Entity
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "VERSE")
public class Verse {
    @Id
    @Column(name = "ID")
    int id;
    String text;
    int chapterid;
    int bookid;
    int translationid;
}
