package com.example.yuka;

import android.app.Application;

import com.parse.Parse;
import com.parse.ParseObject;

public class ParseApplication extends Application {

    @Override
    public void onCreate() {
        super.onCreate();

        ParseObject.registerSubclass(com.example.yuka.Post.class);

        Parse.initialize(new Parse.Configuration.Builder(this)
                .applicationId("jamd-yuka")
                .clientKey("yukajamd123")
                .server("https://jamd-yuka.herokuapp.com/parse").build());
    }
}
