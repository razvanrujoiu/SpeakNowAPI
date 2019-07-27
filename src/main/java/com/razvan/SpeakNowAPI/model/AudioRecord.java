package com.razvan.SpeakNowAPI.model;

import javax.persistence.*;

@Entity
@Table(name = "AUDIO_RECORDS")
public class AudioRecord {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "ID", updatable = false, nullable = false)
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

    public AudioRecord(String title, byte[] content) {
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
