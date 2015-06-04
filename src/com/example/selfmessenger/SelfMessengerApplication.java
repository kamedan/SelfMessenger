package com.example.selfmessenger;

import com.parse.Parse;
import com.parse.ParseException;
import com.parse.ParseObject;

import android.app.Application;

public class SelfMessengerApplication extends Application {
	
	@Override
	public void onCreate(){
		super.onCreate();
		Parse.enableLocalDatastore(this);
		 
		Parse.initialize(this, "gCQEwUQcbzom0MX16jl5uxs0XML9SQZi7qgXUj9M", "0a9fZ9SF9EkWOfb7qW2EkVPTb3VR8ir5G4UlwoTn");
		
		
		

}
}