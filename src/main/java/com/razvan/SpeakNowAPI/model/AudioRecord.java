package com.razvan.SpeakNowAPI.model;

import javax.persistence.*;
import java.util.Date;

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

    @Column(name = "DATE")
    Date date;


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

    public AudioRecord(String title, byte[] content, Date date) {
        this.title = title;
        this.content = content;
        this.date = date;
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

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }
}
