package Diary;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DiaryEntryService {

    @Autowired
    private DiaryEntryRepository repository;

    public List<DiaryEntry> findAll() {
        return repository.findAll();
    }

    public DiaryEntry save(DiaryEntry entry) {
        return repository.save(entry);
    }

    public DiaryEntry findById(Long id) {
        return repository.findById(id).orElse(null);
    }

    public void deleteById(Long id) {
        repository.deleteById(id);
    }
}
