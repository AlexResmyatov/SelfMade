package com.sm.screens;

import java.util.HashMap;

import com.badlogic.gdx.Game;
import com.badlogic.gdx.Gdx;
import com.sm.helpers.Camera;
import com.sm.helpers.Click;
import com.sm.helpers.InputListener;
import com.sm.levels.ALevel;
import com.sm.levels.MainMenuLevel;
import com.sm.objects.TestLevel2;

public class MenuScreen implements IScreen{
	private float delta;
	private HashMap<Integer,Click> touches;
	private Game game;
	private ALevel level;
	private InputListener inputListener;
	private Camera camera;
	public MenuScreen(Game game) {
		this.game=game;
		camera = new Camera();
		inputListener = new InputListener(camera);
		Gdx.input.setInputProcessor(inputListener);
		level = new MainMenuLevel(this);
		
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
	public void dispose() {
		Gdx.app.log("TestScreen", "dispose");
		inputListener.dispose();
		camera.dispose();
		level.dispose();
		
		
	}
	@Override
	public Game getGame(){
		return game;
	}
	@Override
	public void setScreen( IScreen screen) {
		game.setScreen(screen);
		
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



	

}
