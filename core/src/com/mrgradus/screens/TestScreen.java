package com.mrgradus.screens;

import java.util.List;
import java.util.Map;

import com.badlogic.gdx.Game;
import com.badlogic.gdx.Gdx;
import com.mrgradus.helpers.Click;
import com.mrgradus.helpers.InputListener;
import com.mrgradus.objects.ILevel;
import com.mrgradus.objects.TestLevel;

public class TestScreen implements IScreen{
	
	private List<Click> touches;
	private Game game;
	private ILevel level;
	private InputListener inputListener;
	public TestScreen(Game game) {
		this.game=game;
		inputListener = new InputListener();
		level = new TestLevel(this);
		Gdx.input.setInputProcessor(inputListener);
	}
	
	@Override
	public void render(float delta) {
		touches = inputListener.getTouches();
		level.update(delta);
	}
	
	@Override
	public List<Click> getTouches(){
		
		return touches;
	}
	
	@Override
	public void setLevel(ILevel level){
		this.level = level;
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
