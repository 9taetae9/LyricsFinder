package com.taehyounkim.lyricsfinder.dto;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;


@AllArgsConstructor
@Getter
@Setter
public class TrackDTO {
    private String id;
    private String name;
    private String albumName;
    private String artistName;
    private String previewUrl;

}
