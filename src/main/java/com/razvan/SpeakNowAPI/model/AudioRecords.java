package com.razvan.SpeakNowAPI.model;

import java.util.List;

public class AudioRecords {
    public List<AudioRecord> audioRecords;

    public AudioRecords() {
    }

    public AudioRecords(List<AudioRecord> audioRecords) {
        this.audioRecords = audioRecords;
    }

    public List<AudioRecord> getAudioRecords() {
        return audioRecords;
    }

    public void setAudioRecords(List<AudioRecord> audioRecords) {
        this.audioRecords = audioRecords;
    }
}
