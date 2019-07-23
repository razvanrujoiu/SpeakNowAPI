package com.razvan.SpeakNowAPI.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "AUDIO_RECORDS")
public class AudioRecord {

    @Column(name = "ID")
    @Id
    Integer id;

    @Column(name = "TITLE")
    String title;

    @Column(name = "CONTENT")
    byte[] content;

    public AudioRecord() {
    }

    public AudioRecord(Integer id, String title, byte[] content) {
        this.id = id;
        this.title = title;
        this.content = content;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public byte[] getContent() {
        return content;
    }

    public void setContent(byte[] content) {
        this.content = content;
    }
}
