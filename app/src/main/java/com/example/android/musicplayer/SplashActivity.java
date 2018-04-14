package com.example.android.musicplayer;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

public class SplashActivity extends Activity {
	private static int SPLASH_TIME_OUT = 3000;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_splash);

		new Handler().postDelayed(new Runnable() {

			/*
			 * Showing splash screen with menuicon timer. This will be useful when you
			 * want to show case your app logo / company
			 */

			@Override
			public void run() {
				Intent i = new Intent(SplashActivity.this, NowPlayingActivity.class);
				startActivity(i);
				finish();
			}
		}, SPLASH_TIME_OUT);
	}
}
