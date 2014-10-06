package com.example.group_project.classes;

import android.app.Application;
import android.util.Log;

import com.parse.Parse;
import com.parse.ParseObject;

public class ViralDigestApplication extends Application {
	public static final String DEBUG_TAG = "ViralDigest";
	public static final String APPLICATION_ID = "hhuaN7zikcMpGLHalsjlwc39cb6a95KGDEVzS1xL";
	public static final String CLIENT_KEY = "u6M3lWVqLXApB0bxMhJLYZSJpfrasQWtyiKdZY1V";
	
	
	@Override
    public void onCreate() {
        super.onCreate();

    Parse.initialize(this, APPLICATION_ID, CLIENT_KEY);
  }		

}
