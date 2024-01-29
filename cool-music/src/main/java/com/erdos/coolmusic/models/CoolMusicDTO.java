package com.erdos.coolmusic.models;

import lombok.*;

@AllArgsConstructor
@Data
@Getter
@Setter
public class CoolMusicDTO {
    private String title;
    private String artist;
    private String link;
}
