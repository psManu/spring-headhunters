package com.hr.headhuntersfee.dto;

import com.hr.headhuntersfee.entities.HeadHunter;

public class OutboundMapper {

    public static HeadHunterDto mapHeadHunterDto(HeadHunter headHunter)
    {
        HeadHunterDto dto = new HeadHunterDto();
        dto.id = headHunter.getId();
        dto.firstName = headHunter.getFirstName();
        dto.lastName = headHunter.getLastName();
        return dto;
    }
}
