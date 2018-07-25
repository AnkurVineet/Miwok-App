package com.example.android.miwok;

public class Word {
    private static final int NO_IMAGE = -1;
    private String mMiwokTranslation;
    private String mEnglishTranslation;
    private int mImageResourceId = NO_IMAGE;
    private int mAudioId;

    public Word(String miwokTranslation, String englishTranslation, int audioId) {
        mMiwokTranslation = miwokTranslation;
        mEnglishTranslation = englishTranslation;
        mAudioId = audioId;
    }

    public Word(String miwokTranslation, String englishTranslation, int imageResourceId, int audioId) {
        mMiwokTranslation = miwokTranslation;
        mEnglishTranslation = englishTranslation;
        mImageResourceId = imageResourceId;
        mAudioId = audioId;
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

    public int getAudioId() { return mAudioId; }
}
