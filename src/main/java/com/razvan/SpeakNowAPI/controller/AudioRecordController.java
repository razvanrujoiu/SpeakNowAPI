package com.razvan.SpeakNowAPI.controller;

import com.razvan.SpeakNowAPI.model.AudioRecord;
import com.razvan.SpeakNowAPI.service.AudioRecordServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/audioRecords")
public class AudioRecordController {

    @Autowired
    AudioRecordServiceImpl audioRecordService;

    @GetMapping("/{id}")
    @ResponseBody
    public AudioRecord getAudioRecord(@PathVariable Integer id) {
        return audioRecordService.getAudioRecordById(id);
    }

    @GetMapping("/title")
    @ResponseBody
    public AudioRecord getAudioRecordByTitle(@RequestParam(value = "title") String title) {
        return audioRecordService.getAudioRecordByTitle(title);
    }

    @GetMapping("/all")
    public List<AudioRecord> getAllAudioRecors() {
        return audioRecordService.listAllAudioRecords();
    }

    @PostMapping("/addAudioRecord")
    String addAudioRecord(@RequestBody AudioRecord audioRecord) {
        AudioRecord savedAudioRecord = audioRecordService.saveAudioRecord(audioRecord);
        return "SUCCESS";
    }

    @DeleteMapping("/{id}")
    String deleteAudioRecord(@PathVariable Integer id) {
        audioRecordService.deleteAudioRecord(id);
        return "SUCCESS";
    }


}
