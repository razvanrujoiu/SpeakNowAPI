package com.razvan.SpeakNowAPI.repository;

import com.razvan.SpeakNowAPI.model.AudioRecord;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AudioRecordRepository extends JpaRepository<AudioRecord, Integer> {

    AudioRecord findAudioRecordByTitle(String title);
}
