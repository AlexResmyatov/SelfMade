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
	static float scale;
	final float GAME_WIDTH=1280.f;
	private HashMap<Integer,Click> touches;
	private Game game;
	private ALevel level;
	private InputListener inputListener;
	private Camera camera;
	public TestScreen(Game game) {
		scale=Gdx.graphics.getWidth()/GAME_WIDTH;
		Gdx.app.log(null,scale+"");
		this.game=game;
		inputListener = new InputListener();
		camera = new Camera(this);
		level = new TestLevel2(this);
		Gdx.input.setInputProcessor(inputListener);
	}
	
	@Override
	public void render(float delta) {
		
		touches = inputListener.getTouches();
		transformTouches(touches);
		level.update(delta);
		camera.render();
	}
	
	@Override
	public HashMap<Integer,Click> getTouches(){
		return touches;
	}
	public void transformTouches(HashMap<Integer,Click> touches){
		for(Click click: touches.values()){
			click.setX((int)((float)click.getX()/scale));
			click.setY((int)((float)(Gdx.graphics.getHeight()-click.getY()) / scale));
		}
	}
	@Override
	public float getScale() {
		return scale;
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
		// TODO Auto-generated method stub
		
	}

	@Override
	public void setScreen(Game game) {
		// TODO Auto-generated method stub
		
	}

	

}
