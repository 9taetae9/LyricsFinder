package com.taehyounkim.lyricsfinder.service;

import com.taehyounkim.lyricsfinder.dto.TrackDTO;
import com.taehyounkim.lyricsfinder.entity.Track;
import com.taehyounkim.lyricsfinder.repository.TrackRepository;
import org.springframework.stereotype.Service;

@Service
public class TrackService {
    private final TrackRepository trackRepository;

    public TrackService(TrackRepository trackRepository){
        this.trackRepository = trackRepository;
    }

    public TrackDTO saveTrack(TrackDTO trackDTO){
        Track track = new Track();
        track.setId(trackDTO.getId());
        track.setName(trackDTO.getName());
        track.setAlbumName(trackDTO.getAlbumName());
        track.setArtistName(trackDTO.getArtistName());
        track.setPreviewUrl(trackDTO.getPreviewUrl());
        trackRepository.save(track);
        return trackDTO;
    }

    public TrackDTO getTrackById(String id) {
        return trackRepository.findById(id)
                .map(track -> new TrackDTO(track.getId(), track.getName(), track.getAlbumName(), track.getArtistName(), track.getPreviewUrl()))
                .orElseThrow(() -> new RuntimeException("Track not found"));
    }
}
