package com.razvan.SpeakNowAPI.controller;

import com.razvan.SpeakNowAPI.model.AudioRecord;
import com.razvan.SpeakNowAPI.model.AudioRecords;
import com.razvan.SpeakNowAPI.service.AudioRecordServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.util.Date;
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

    @GetMapping("/allRecords")
    public AudioRecords getAudioRecords() {
        return new AudioRecords(audioRecordService.listAllAudioRecords());
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

    @PostMapping("/addIvan")
    String addIvan() throws IOException {
        String fileName = "ivan.wav";
        File file = new File(fileName);
        byte[] fileBytes = Files.readAllBytes(file.toPath());
        AudioRecord audioRecord = new AudioRecord("Ivan.wav",fileBytes, new Date(System.currentTimeMillis()));
        audioRecordService.saveAudioRecord(audioRecord);
        return "SUCCESS";
    }


}
