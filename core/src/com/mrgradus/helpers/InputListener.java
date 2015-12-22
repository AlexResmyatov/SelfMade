package com.mrgradus.helpers;

import java.util.HashMap;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.InputProcessor;

public class InputListener implements InputProcessor {

	HashMap<Integer,Click> touches;
	HashMap<Integer,Click> oldTouches;
	Camera camera;
	public InputListener(Camera camera) {
		this.camera=camera;
		touches = new HashMap<Integer,Click>();
		oldTouches = new HashMap<Integer,Click>();
	}
	
	@Override
	public boolean touchDown(int screenX, int screenY, int pointer, int button) {
		touches.put(pointer, new Click(pointer));
		oldTouches.put(pointer, new Click(screenX, screenY, pointer));
		return true;
	}

	@Override
	public boolean touchUp(int screenX, int screenY, int pointer, int button) {
		touches.remove(pointer);
		oldTouches.remove(pointer);
		return true;
	}

	@Override
	public boolean touchDragged(int screenX, int screenY, int pointer) {
		if(oldTouches.values().size()!=0){
			oldTouches.get(pointer).setX(screenX);
			oldTouches.get(pointer).setY(screenY);	
		}
		return true;
	}
	
	public HashMap<Integer,Click> getTouches(){
		if(oldTouches.values().size()!=0){
			for(Click click: oldTouches.values()){
				touches.get(click.getPointer()).setX((int)((click.getX())/camera.getScale()+camera.getCamX()));
				touches.get(click.getPointer()).setY((int)((Gdx.graphics.getHeight()-click.getY())/camera.getScale()+camera.getCamY()));
			}
		}

		return (HashMap<Integer,Click>)touches.clone();
	}
	
	public void dispose(){
		touches.clear();
		oldTouches.clear();
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	@Override
	public boolean keyDown(int keycode) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean keyUp(int keycode) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean keyTyped(char character) {
		// TODO Auto-generated method stub
		return false;
	}



	@Override
	public boolean mouseMoved(int screenX, int screenY) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean scrolled(int amount) {
		// TODO Auto-generated method stub
		return false;
	}

}
