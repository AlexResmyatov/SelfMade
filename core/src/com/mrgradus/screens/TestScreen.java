package com.mrgradus.screens;

import java.util.HashMap;

import com.badlogic.gdx.Game;
import com.badlogic.gdx.Gdx;
import com.mrgradus.helpers.Camera;
import com.mrgradus.helpers.Click;
import com.mrgradus.helpers.InputListener;
import com.mrgradus.objects.ALevel;
import com.mrgradus.objects.TestLevel;
import com.mrgradus.objects.TestLevel2;

public class TestScreen implements IScreen{
	
	private HashMap<Integer,Click> touches;
	private Game game;
	private ALevel level;
	private InputListener inputListener;
	private Camera camera;
	public TestScreen(Game game) {
		this.game=game;
		inputListener = new InputListener();
		camera = new Camera();
		level = new TestLevel2(this);
		Gdx.input.setInputProcessor(inputListener);
	}
	
	@Override
	public void render(float delta) {
		touches = inputListener.getTouches();
		level.update(delta);
		camera.render(level.getAllObjects());
	}
	
	@Override
	public HashMap<Integer,Click> getTouches(){
		
		return touches;
	}
	
	@Override
	public void setLevel(ALevel level){
		this.level = level;
	}
	
	@Override
	public ALevel getLevel() {
		return level;
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
