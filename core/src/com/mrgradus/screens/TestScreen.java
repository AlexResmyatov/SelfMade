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
	private float delta;
	private HashMap<Integer,Click> touches;
	private Game game;
	private ALevel level;
	private InputListener inputListener;
	private Camera camera;
	public TestScreen(Game game, ALevel level) {

		this.game=game;
		camera = new Camera();
		inputListener = new InputListener(camera);
		
		level = new TestLevel2(this);
		Gdx.input.setInputProcessor(inputListener);
	}
	public TestScreen(Game game) {
		this.game=game;
		camera = new Camera();
		inputListener = new InputListener(camera);
		Gdx.input.setInputProcessor(inputListener);
		level = new TestLevel2(this);
		
	}
	
	@Override
	public void render(float delta) {
		this.delta=delta;
		touches = inputListener.getTouches();
		level.update(delta);
		camera.render(level.getAllObjects());
	}
	
	@Override
	public float getDelta(){
		return delta;
	}
	
	@Override
	public HashMap<Integer,Click> getTouches(){
		return touches;
	}
	@Override
	public Camera getCamera(){
		return camera;
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
		Gdx.app.log(null, "dispose");
		inputListener.dispose();
		camera.dispose();
		level.dispose();
		
		
	}
	@Override
	public Game getGame(){
		return game;
	}
	@Override
	public void setScreen(Game game, IScreen screen) {
		game.setScreen(screen);
		
	}

	

}
