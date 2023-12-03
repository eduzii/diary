package Diary;

import jakarta.persistence.*;

import java.time.LocalDate;

@Entity
public class DiaryEntry {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String title;
    private LocalDate date;
    @Lob
    private String content;

    // standard getters and setters
}
