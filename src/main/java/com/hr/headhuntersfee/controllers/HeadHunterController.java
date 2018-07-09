package com.hr.headhuntersfee.controllers;

import com.hr.headhuntersfee.dto.HeadHunterDto;
import com.hr.headhuntersfee.dto.OutboundMapper;
import com.hr.headhuntersfee.services.HeadHunterService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/api")
public class HeadHunterController {

    @Autowired
    private HeadHunterService headHunterService;

    @RequestMapping(value = "/headhunters", method = RequestMethod.GET, produces = {MediaType.APPLICATION_JSON_VALUE})
    public ResponseEntity<List<HeadHunterDto>> getAll(){

        List<HeadHunterDto> result = headHunterService.get()
                .stream()
                .map(h -> OutboundMapper.mapHeadHunterDto(h))
                .collect(Collectors.toList());

        return new ResponseEntity<>(result, HttpStatus.OK);
    }

}
