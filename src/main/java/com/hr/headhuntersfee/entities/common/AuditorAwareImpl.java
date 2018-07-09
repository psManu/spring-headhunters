package com.hr.headhuntersfee.entities.common;

import org.springframework.data.domain.AuditorAware;

import java.util.Optional;


public class AuditorAwareImpl implements AuditorAware<Long> {

    @Override
    public Optional<Long> getCurrentAuditor() {
        return Optional.of(Long.valueOf(1));        // Hardcoded since no auth is used yet
    }
}