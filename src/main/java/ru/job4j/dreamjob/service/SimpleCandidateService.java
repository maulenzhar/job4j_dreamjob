package ru.job4j.dreamjob.service;

import net.jcip.annotations.ThreadSafe;
import org.springframework.stereotype.Service;
import ru.job4j.dreamjob.model.Candidate;
import ru.job4j.dreamjob.repository.CandidateRepository;
import ru.job4j.dreamjob.repository.MemoryCandidateRepository;

import java.util.Collection;
import java.util.Optional;

@Service
@ThreadSafe
public class SimpleCandidateService implements CandidateService {

    private CandidateRepository vacancyRepository = new MemoryCandidateRepository();

    public SimpleCandidateService(CandidateRepository vacancyRepository) {
        this.vacancyRepository = vacancyRepository;
    }

    private SimpleCandidateService() { }

    @Override
    public Candidate save(Candidate candidate) {
        return vacancyRepository.save(candidate);
    }

    @Override
    public boolean deleteById(int id) {
        return vacancyRepository.deleteById(id);
    }

    @Override
    public boolean update(Candidate candidate) {
        return vacancyRepository.update(candidate);
    }

    @Override
    public Optional<Candidate> findById(int id) {
        return vacancyRepository.findById(id);
    }

    @Override
    public Collection<Candidate> findAll() {
        return vacancyRepository.findAll();
    }
}
