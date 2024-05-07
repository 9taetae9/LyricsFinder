package com.taehyounkim.lyricsfinder.repository;

import com.taehyounkim.lyricsfinder.entity.Track;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TrackRepository extends JpaRepository<Track,String> {
}
