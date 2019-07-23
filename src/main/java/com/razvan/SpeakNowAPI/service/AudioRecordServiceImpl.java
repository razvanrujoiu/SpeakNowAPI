package com.razvan.SpeakNowAPI.service;

import com.razvan.SpeakNowAPI.model.AudioRecord;
import com.razvan.SpeakNowAPI.repository.AudioRecordRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class AudioRecordServiceImpl implements AudioRecordService {

    private AudioRecordRepository audioRecordRepository;

    @Autowired
    public void setAudioRecordRepository(AudioRecordRepository audioRecordRepository) {
        this.audioRecordRepository = audioRecordRepository;
    }

    @Override
    public List<AudioRecord> listAllAudioRecords() {
        return this.audioRecordRepository.findAll();
    }

    @Override
    public AudioRecord getAudioRecordById(Integer id) {
        return this.audioRecordRepository.findById(id).get();
    }

    @Override
    public AudioRecord getAudioRecordByTitle(String title) {
        return this.audioRecordRepository.findAudioRecordByTitle(title);
    }

    @Override
    public AudioRecord saveAudioRecord(AudioRecord audioRecord) {
        return this.audioRecordRepository.save(audioRecord);
    }

    @Override
    public void deleteAudioRecord(Integer id) {
        this.audioRecordRepository.deleteById(id);
    }
}
