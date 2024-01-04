package ru.job4j.dreamjob.service;

import ru.job4j.dreamjob.model.Candidate;
import ru.job4j.dreamjob.repository.CandidateRepository;
import ru.job4j.dreamjob.repository.MemoryCandidateRepository;

import java.util.Collection;
import java.util.Optional;

public class SimpleCandidateService implements CandidateService {

    private static final SimpleCandidateService INSTANCE = new SimpleCandidateService();

    private final CandidateRepository vacancyRepository = MemoryCandidateRepository.getInstance();

    private SimpleCandidateService() { }

    public static SimpleCandidateService getInstance() {
        return INSTANCE;
    }

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
