package com.mrgradus.game.desktop;

import com.badlogic.gdx.backends.lwjgl.LwjglApplication;
import com.badlogic.gdx.backends.lwjgl.LwjglApplicationConfiguration;
import com.mrgradus.game.SelfMadeGame;

public class DesktopLauncher {
	public static void main (String[] arg) {
		LwjglApplicationConfiguration config = new LwjglApplicationConfiguration();
		config.height=700;
		config.width=1300;
		new LwjglApplication(new SelfMadeGame(), config);
	}
}
