package com.example.yuka;

import com.parse.ParseClassName;
import com.parse.ParseFile;
import com.parse.ParseObject;
import com.parse.ParseUser;

@ParseClassName("Post")

public class Post extends ParseObject {
    public static final String KEY_DESCRIPTION = "description";
    public static final String KEY_IMAGE = "image";
    public static final String KEY_USER = "user";
    public static final String KEY_EVENT = "event";

    //for the description
    public String getDescription(){
        return getString(KEY_DESCRIPTION);
    }
    public void setDescription(String description){
        put(KEY_DESCRIPTION, description);
    }

    //for the image
    public ParseFile getImage(){
        return getParseFile(KEY_IMAGE);
    }
    public void setImage(ParseFile parseFile){
        put(KEY_IMAGE, parseFile);
    }

    //For the user
    public ParseUser getUser(){
        return getParseUser(KEY_USER);
    }
    public void setUser(ParseUser parseUser){
        put(KEY_USER, parseUser);
    }

    public String getEvent(){
        return getString(KEY_EVENT);
    }
    public void setEvent(String event){
        put(KEY_EVENT, event);
    }
}




