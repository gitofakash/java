package com.cluster.oop.music.wind;

import com.cluster.oop.music.Playable;

public class Saxophone implements Playable {

	@Override
	public void play() {
		System.out.println("Saxophone is playing ");
	}

}
