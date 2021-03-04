package com.tts.weather.demo.controller;

import com.tts.weather.demo.model.Response;
import com.tts.weather.demo.service.WeatherService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.config.RepositoryNameSpaceHandler;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class WeatherController {

    @Autowired
    private WeatherService weatherService;

    @GetMapping("/weather")
    public String getIndex(Model model){
        Response response = weatherService.getForecast("71129");
        model.addAttribute("data", response);
        return "index";
    }
}
