package com.njit.parstagram;

import android.app.Application;

import com.parse.Parse;
import com.parse.ParseObject;

public class ParseApplication extends Application {

    // Initializes Parse SDK as soon as the application is created
    @Override
    public void onCreate() {
        super.onCreate();

        // Register your parse models
        ParseObject.registerSubclass(Post.class);

        Parse.initialize(new Parse.Configuration.Builder(this)
                .applicationId("nk9FXSUfGaghebDjh5rORHSyvyMTyUjylENdeAIn")
                .clientKey("uD3TZeKzRLlvekBsYoksWUUClpd9CoTai1ehKeJd")
                .server("https://parseapi.back4app.com")
                .build()
        );
    }
}
