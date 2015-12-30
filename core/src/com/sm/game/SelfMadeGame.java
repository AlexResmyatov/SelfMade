package com.sm.game;

import com.badlogic.gdx.Game;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.sm.helpers.AssetLoader;
import com.sm.screens.MenuScreen;
import com.sm.screens.TestScreen;

public class SelfMadeGame extends Game {
	SpriteBatch batch;
	Texture img;
	
	@Override
	public void create () {
		AssetLoader.loadImages();
		this.setScreen(new MenuScreen(this));
	}

	@Override
	public void render () {
		super.render();
	}
}
