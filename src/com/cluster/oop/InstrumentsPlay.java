package com.cluster.oop;

import java.util.Random;

public class InstrumentsPlay {
	public static void main(String[] args) {
		Instrument[] instrument = new Instrument[10];
		Random rand = new Random();
		int num_random;
		for (int i = 0; i < 10; i++) {
			num_random = rand.nextInt();
			if (num_random % 3 == 0)
				instrument[i] = new Flute();
			else if (num_random % 2 == 0)
				instrument[i] = new Guitar();
			else
				instrument[i] = new Piano();
			instrument[i].play();

		}
		for (int i = 0; i < 10; i++) {
			if (instrument[i] instanceof Piano)
				System.out.println("Piano is stored at index " + i);
			else if (instrument[i] instanceof Flute)
				System.out.println("Flute is stored at index " + i);
			else if (instrument[i] instanceof Guitar)
				System.out.println("Guitar is stored at index " + i);
		}
	}

}
