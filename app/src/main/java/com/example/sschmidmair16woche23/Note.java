package com.example.sschmidmair16woche23;

public class Note {
    private boolean wichtig;
    private String date;
    private String text;

    public Note(boolean wichtig, String date, String text) {
        this.wichtig = wichtig;
        this.date = date;
        this.text = text;
    }

    @Override
    public String toString() {
        return "Custom{" +
                "wichtig=" + wichtig +
                ", date='" + date + '\'' +
                ", text='" + text + '\'' +
                '}';
    }

    public boolean isWichtig() {
        return wichtig;
    }

    public void setWichtig(boolean wichtig) {
        this.wichtig = wichtig;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }
}
