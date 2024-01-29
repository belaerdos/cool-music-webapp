package com.erdos.coolmusic.repositories;

import com.erdos.coolmusic.models.CoolMusic;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface CoolMusicRepository extends JpaRepository<CoolMusic, Long> {}
