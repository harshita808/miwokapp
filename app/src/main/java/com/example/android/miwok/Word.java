package com.example.android.miwok;

public class Word {

    private String mDefaultTranslation;

    private String mMiwokTranslation;

    private int mAudioResourceId;

    private int mImageresourceId=NO_IMAGE_PROVIDED;

    private static final int NO_IMAGE_PROVIDED=-1;

    public Word(String defaultTranslation, String miwokTranslation,int audioResourceId){
        mDefaultTranslation=defaultTranslation;
        mMiwokTranslation=miwokTranslation;
        mAudioResourceId = audioResourceId;
    }

    //imageResourceId is the drawable resource id for the image associated with the word
    public Word(String defaultTranslation, String miwokTranslation,int imageResourceId,  int audioResourceId){
        mDefaultTranslation=defaultTranslation;
        mMiwokTranslation=miwokTranslation;
        mImageresourceId=imageResourceId;
        mAudioResourceId = audioResourceId;
    }

    public Word(String s, String s1) {
    }

    public String getDefaultTranslation(){
        return mDefaultTranslation;
    }

    public String getMiwokTranslation(){
        return mMiwokTranslation;
    }

    public int getImageResourceId(){
     return mImageresourceId;
    };

    //returns whether or not there is an image for this word.
public boolean hasImage(){
    return mImageresourceId!=NO_IMAGE_PROVIDED;
}

    /**
     * Return the audio resource ID of the word.
     */
    public int getAudioResourceId() {
        return mAudioResourceId;
    }


}
