package com.hr.headhuntersfee.services;

import com.hr.headhuntersfee.entities.HeadHunter;

import java.util.List;

public interface HeadHunterService {

    HeadHunter create(HeadHunter headHunter);

    List<HeadHunter> get();
}
