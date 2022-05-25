package com.project.figaro.api;

import com.project.figaro.api.request.BarberRequest;
import com.project.figaro.application.CreateBarberImpl;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RequiredArgsConstructor
@RestController
public class FigaroController {
    private final CreateBarberImpl createBarberImpl;

    @RequestMapping("/")
    @ResponseBody
    public String hello() {
        return "Ta funfando!";
    }

    @GetMapping(path = "/create-barber")
    public boolean home(BarberRequest request) {
        var response = createBarberImpl.execute(request);
        System.out.println(response);
        return response;
    }

    @GetMapping("/home")
    public String home(ModelMap model) {
        var nome = "Alyssom";
        model.addAttribute("nome", nome);
        return "home";
    }

}
