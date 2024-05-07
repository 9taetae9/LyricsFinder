package com.taehyounkim.lyricsfinder.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name="tracks")
@Getter
@Setter
public class Track {
    @Id
    private String id;
    private String name;
    private String albumName;
    private String artistName;
    private String previewUrl;

}
