package com.adamlwilkins.game.desktop;

import com.badlogic.gdx.backends.lwjgl.LwjglApplication;
import com.badlogic.gdx.backends.lwjgl.LwjglApplicationConfiguration;
import com.adamlwilkins.game.FlappyPixel;

public class DesktopLauncher {
	public static void main (String[] arg) {
		LwjglApplicationConfiguration config = new LwjglApplicationConfiguration();

		config.width = FlappyPixel.WIDTH;		//sets the width/height/title of the game to the core
		config.height = FlappyPixel.HEIGHT;
		config.title = FlappyPixel.TITLE;

		new LwjglApplication(new FlappyPixel(), config);
	}
}
