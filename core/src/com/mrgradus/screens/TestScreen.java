package com.mrgradus.screens;

import com.badlogic.gdx.Game;
import com.badlogic.gdx.Gdx;

public class TestScreen implements IScreen{

	Game game;
	
	public TestScreen(Game game) {
		this.game=game;
		
	}
	
	@Override
	public void show() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void render(float delta) {
		Gdx.app.log("TestScreen","render");
		
	}

	@Override
	public void resize(int width, int height) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void pause() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void resume() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void hide() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void dispose() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void setScreen(Game game) {
		// TODO Auto-generated method stub
		
	}

}
