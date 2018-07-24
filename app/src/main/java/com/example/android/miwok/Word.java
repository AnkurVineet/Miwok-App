package com.example.android.miwok;

public class Word {
    private String mMiwokTranslation;
    private String mEnglishTranslation;
    private int mImageResourceId = NO_IMAGE;
    private static final int NO_IMAGE = -1;

    public Word(String miwokTranslation, String englishTranslation) {
        mMiwokTranslation = miwokTranslation;
        mEnglishTranslation = englishTranslation;
    }

    public Word(String miwokTranslation, String englishTranslation, int imageResourceId){
        mMiwokTranslation = miwokTranslation;
        mEnglishTranslation = englishTranslation;
        mImageResourceId = imageResourceId;
    }

    public String getdefaultTranslation() {
        return mEnglishTranslation;
    }

    public String getMiwokTranslation() {
        return mMiwokTranslation;
    }

    public int getImageResourceId() {
        return mImageResourceId;
    }
}
