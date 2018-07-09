package com.hr.headhuntersfee.dto;

import java.util.List;

public class RecruitDto {

    public Long id;
    public String firstName;
    public String lastName;

    public List<RecruitGroupDto> groups;
}

class RecruitGroupDto {

    List<RecruitDto> recruits;
}