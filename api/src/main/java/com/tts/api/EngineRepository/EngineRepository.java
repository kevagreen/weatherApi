package com.tts.api.EngineRepository;

import com.tts.api.model.Engine;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface EngineRepository extends CrudRepository <Engine, Long> {
    Optional<Engine> findAllById(Long id);
}
