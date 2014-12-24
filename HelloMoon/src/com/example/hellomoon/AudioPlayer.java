package com.example.hellomoon;

import android.content.Context;
import android.media.MediaPlayer;
import android.media.MediaPlayer.OnCompletionListener;
import android.util.Log;

public class AudioPlayer {
	private MediaPlayer mMediaPlayer;
	
	public void Stop()
	{
		if (mMediaPlayer != null)
		{
			mMediaPlayer.release();
			Log.i("ABC","Stop");
			mMediaPlayer = null;
		}
	}
	public void Play(Context context)
	{
		Stop();
		mMediaPlayer = MediaPlayer.create(context, R.raw.one_small_step);
		mMediaPlayer.setOnCompletionListener(new OnCompletionListener() {
			
			@Override
			public void onCompletion(MediaPlayer mp)
			{
				Stop();
			}
		});
		mMediaPlayer.start();
	}
}
