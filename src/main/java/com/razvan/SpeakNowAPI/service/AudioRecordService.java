package com.razvan.SpeakNowAPI.service;

import com.razvan.SpeakNowAPI.model.AudioRecord;

import java.util.List;

public interface AudioRecordService {

    List<AudioRecord> listAllAudioRecords();

    AudioRecord getAudioRecordById(Integer id);

    AudioRecord getAudioRecordByTitle(String title);

    AudioRecord saveAudioRecord(AudioRecord audioRecord);

    void deleteAudioRecord(Integer id);

}
