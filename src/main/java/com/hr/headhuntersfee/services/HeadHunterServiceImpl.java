package com.hr.headhuntersfee.services;

import com.hr.headhuntersfee.entities.HeadHunter;
import com.hr.headhuntersfee.repository.HeadHunterRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class HeadHunterServiceImpl implements HeadHunterService {

    @Autowired
    private HeadHunterRepository repository;

    @Override
    public HeadHunter create(HeadHunter headHunter) {
        repository.save(headHunter);
        return headHunter;
    }

    @Override
    public List<HeadHunter> get() {
        return repository.findAll();
    }
}
