package com.erdos.coolmusic.services;

import com.erdos.coolmusic.models.CoolMusic;
import com.erdos.coolmusic.models.CoolMusicDTO;

import java.util.List;

public interface CoolMusicService {
    CoolMusicDTO createCoolMusicDTO(CoolMusic coolMusic);
    List<CoolMusicDTO> getAllCoolMusicDTO();
    CoolMusicDTO addCoolMusic(CoolMusicDTO coolMusicDTO);
}
