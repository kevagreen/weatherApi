package com.tts.api.controller;


import com.tts.api.EngineRepository.EngineRepository;
import com.tts.api.model.Engine;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RequestMapping("/engine")
@RestController
public class EngineController {
     private EngineRepository engineRepository;

    public EngineController(EngineRepository engineRepository){
        this.engineRepository = engineRepository;
    }


    @PostMapping("/api/addengine")
    public Engine addEngine(Engine engine){
        return engineRepository.save(engine);

    }

    @GetMapping("/api/allengines")
    public List<Engine> getAllEngines(){
        return (List<Engine>) engineRepository.findAll();
    }

    @GetMapping("/{id}")
    public Optional<Engine> getEngine(@PathVariable Long id){
        return engineRepository.findAllById(id);
    }




}
