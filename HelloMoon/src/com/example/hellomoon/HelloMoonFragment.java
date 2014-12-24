package com.example.hellomoon;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.Button;

public class HelloMoonFragment extends Fragment {

	private Button mPlayButton;
	private Button mStopButton;
	private AudioPlayer mPlayer;
	
	@Override
	public void onCreate(Bundle savedInstanceState)
	{
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		//setRetainInstance(true);
	}
	@Override
	public View onCreateView(LayoutInflater inflater,
			@Nullable ViewGroup container, @Nullable Bundle savedInstanceState)
	{
		View v = inflater.inflate(R.layout.fragment_hello_moon, container, false);
		mPlayer = new AudioPlayer();
		mPlayButton = (Button) v.findViewById(R.id.hellomoon_playButton);
		mPlayButton.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v)
			{
				mPlayer.Play(getActivity());
			}
		});
		mStopButton = (Button) v.findViewById(R.id.hellomoon_stopButton);
		mStopButton.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v)
			{
				mPlayer.Stop();
			}
		});
		return v;
	}
	
	@Override
	public void onDestroy()
	{
		// TODO Auto-generated method stub
		super.onDestroy();
		mPlayer.Stop();
	}
}
