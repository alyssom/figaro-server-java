package com.project.figaro.application;

import com.project.figaro.api.request.BarberRequest;
import com.project.figaro.model.BarberDataProvider;
import org.springframework.stereotype.Component;

@Component
public class CreateBarberImpl {
    private final BarberDataProvider barberDataProvider;

    public CreateBarberImpl(BarberDataProvider barberDataProvider) {
        this.barberDataProvider = barberDataProvider;
    }

    public boolean execute(BarberRequest request){
        return barberDataProvider.createBarber(request);
    }
}
