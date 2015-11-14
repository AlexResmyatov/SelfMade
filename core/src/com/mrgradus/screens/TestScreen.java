package com.mrgradus.screens;

import java.util.Map;

import com.badlogic.gdx.Game;
import com.badlogic.gdx.Gdx;
import com.mrgradus.helpers.Click;
import com.mrgradus.helpers.InputListener;
import com.mrgradus.objects.ILevel;
import com.mrgradus.objects.TestLevel;

public class TestScreen implements IScreen{
	
	private Map<Integer ,Click> touches;
	private Game game;
	private ILevel level;
	
	public TestScreen(Game game) {
		this.game=game;
		level = new TestLevel(this);
		Gdx.input.setInputProcessor(new InputListener());
	}
	
	@Override
	public void render(float delta) {
		level.update(delta);
	}
	
	@Override
	public Map<Integer, Click> getTouches(){
		return touches;
	}
	
	@Override
	public void setLevel(ILevel level){
		
	}
	
	@Override
	public void show() {
		// TODO Auto-generated method stub
		
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
