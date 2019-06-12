package com.lopez.bootcamp.service;

import com.lopez.bootcamp.entity.Stylist;
import com.lopez.bootcamp.repository.StylistRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor(onConstructor = @__(@Autowired))
public class StylistServiceImpl implements StylistManagmentService {

    private final StylistRepository stylistRepository;

    @Override
    public Stylist findStylistByEmail(String stylist) {
        return stylistRepository.findStylistByStylistEmail(stylist);
    }

}

