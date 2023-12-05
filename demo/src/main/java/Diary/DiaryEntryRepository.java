package Diary;

import org.springframework.data.jpa.repository.JpaRepository;

public interface DiaryEntryRepository extends JpaRepository<DiaryEntry, Long> {

}
