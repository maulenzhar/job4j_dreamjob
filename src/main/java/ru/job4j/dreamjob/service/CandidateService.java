package ru.job4j.dreamjob.service;

import ru.job4j.dreamjob.dto.FileDto;
import ru.job4j.dreamjob.model.Candidate;

import java.util.Collection;
import java.util.Optional;

public interface CandidateService {
    Candidate save(Candidate vacancy, FileDto image);

    boolean deleteById(int id);

    boolean update(Candidate vacancy, FileDto image);

    Optional<Candidate> findById(int id);

    Collection<Candidate> findAll();
}
