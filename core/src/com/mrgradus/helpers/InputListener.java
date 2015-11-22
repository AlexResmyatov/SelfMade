package com.mrgradus.helpers;

import java.util.ArrayList;
import java.util.List;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.InputProcessor;

public class InputListener implements InputProcessor {

	ArrayList<Click> touches;
	
	public InputListener() {
		touches = new ArrayList<Click>();
	}
	
	@Override
	public boolean touchDown(int screenX, int screenY, int pointer, int button) {
		Gdx.app.log("touchDown", "x "+screenX+" y "+screenY +" ¹ "+pointer);
		touches.add(pointer, new Click(screenX,screenY,pointer));
		return true;
	}

	@Override
	public boolean touchUp(int screenX, int screenY, int pointer, int button) {
		Gdx.app.log("touchUp", "x "+screenX+" y "+screenY +" ¹ "+pointer);
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
	
	public List<Click> getTouches(){
		return (ArrayList)touches.clone();
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
