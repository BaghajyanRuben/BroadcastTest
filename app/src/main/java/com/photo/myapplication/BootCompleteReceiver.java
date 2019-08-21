package com.photo.myapplication;

import android.app.PendingIntent;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.widget.Toast;

import org.w3c.dom.Text;

public class BootCompliteReciver extends BroadcastReceiver {
	@Override
	public void onReceive(Context context, Intent intent) {

		Toast.makeText(context, "Device Boot complete", Toast.LENGTH_LONG).show();

		Intent openIntent = new Intent(context, MainActivity.class);

		openIntent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);


		context.startActivity(openIntent);
//		PendingIntent pendingIntent = PendingIntent.getActivity(context, 0,
//				openIntent, 0);

	}
}
