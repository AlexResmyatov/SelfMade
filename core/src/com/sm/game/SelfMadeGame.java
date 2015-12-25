package com.sm.game;

import com.badlogic.gdx.Game;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.sm.screens.TestScreen;

public class SelfMadeGame extends Game {
	SpriteBatch batch;
	Texture img;
	
	@Override
	public void create () {
		this.setScreen(new TestScreen(this));
	}

	@Override
	public void render () {
		super.render();
	}
}
