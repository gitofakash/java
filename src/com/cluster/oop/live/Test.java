package com.cluster.oop.live;

import com.cluster.oop.music.Playable;
import com.cluster.oop.music.string.Veena;
import com.cluster.oop.music.wind.Saxophone;

public class Test {
	public static void main(String[] args) {
		Veena v=new Veena();
		v.play();// Create an instance of Veena and call play() method
		Saxophone sax=new Saxophone();
		sax.play(); //Create an instance of saxophone and call play() method
		
		Playable playable=new Veena();//Place the above instances in a variable of type Playable and then call play()
		playable.play();
		playable=new Saxophone();
		playable.play();

	}
}
