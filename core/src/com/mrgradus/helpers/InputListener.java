package com.mrgradus.helpers;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.InputProcessor;

public class InputListener implements InputProcessor {

	Map<Integer, Click> touches;
	
	public InputListener() {
		touches = new HashMap<Integer ,Click>();
	}
	
	@Override
	public boolean touchDown(int screenX, int screenY, int pointer, int button) {
		Gdx.app.log("touchDown", "x-"+screenX+" y-"+screenY +" �-"+pointer);
		touches.put(pointer, new Click(screenX,screenY,pointer));
		return true;
	}

	@Override
	public boolean touchUp(int screenX, int screenY, int pointer, int button) {
		Gdx.app.log("touchUp", "x-"+screenX+" y-"+screenY +" �-"+pointer);
		touches.remove(pointer);
		return true;
	}

	@Override
	public boolean touchDragged(int screenX, int screenY, int pointer) {
		touches.get(pointer).setX(screenX);
		touches.get(pointer).setY(screenY);
		
		Gdx.app.log("touchDragged", "x "+screenX+" y "+screenY+" p "+ pointer);
		return true;
	}
	
	public Map<Integer, Click> getTouches(){
		final Map<Integer, Click> map = new HashMap<Integer, Click>();
		map.putAll(touches);
		return map;
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
