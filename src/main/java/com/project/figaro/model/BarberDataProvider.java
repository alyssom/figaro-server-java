package com.project.figaro.model;

import com.project.figaro.api.request.BarberRequest;
import org.springframework.stereotype.Component;

@Component
public class BarberDataProvider {
    public boolean createBarber(BarberRequest request) {
        return true;
    }
}
