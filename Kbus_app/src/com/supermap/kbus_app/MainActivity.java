package com.supermap.kbus_app;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import org.apache.cordova.*;

public class MainActivity extends CordovaActivity{

	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		//setContentView(R.layout.activity_main);
		super.init();
        // Set by <content src="index.html" /> in config.xml
        loadUrl(launchUrl);

	}

}
