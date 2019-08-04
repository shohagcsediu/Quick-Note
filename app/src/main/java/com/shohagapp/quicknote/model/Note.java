package com.shohagapp.quicknote.model;

public class Note {
    private String mTitle;
    private String mDescription;

    public Note(String mTitle, String mDescription) {
        this.mTitle = mTitle;
        this.mDescription = mDescription;
    }

    public String getmTitle() {
        return mTitle;
    }

    public void setmTitle(String mTitle) {
        this.mTitle = mTitle;
    }

    public String getmDescription() {
        return mDescription;
    }

    public void setmDescription(String mDescription) {
        this.mDescription = mDescription;
    }
}
