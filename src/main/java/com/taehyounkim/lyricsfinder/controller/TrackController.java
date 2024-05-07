package com.taehyounkim.lyricsfinder.controller;

import com.taehyounkim.lyricsfinder.dto.TrackDTO;
import com.taehyounkim.lyricsfinder.service.TrackService;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("/api/tracks")
public class TrackController {

    private final TrackService trackService;

    public TrackController(TrackService trackService) {
        this.trackService = trackService;
    }

    @PostMapping
    public TrackDTO saveTrack(@RequestBody TrackDTO trackDTO) {
        return trackService.saveTrack(trackDTO);
    }

    @GetMapping("/{id}")
    public TrackDTO getTrackById(@PathVariable String id) {
        return trackService.getTrackById(id);
    }

}
