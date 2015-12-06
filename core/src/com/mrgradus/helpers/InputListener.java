package com.mrgradus.helpers;

import java.util.HashMap;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.InputProcessor;

public class InputListener implements InputProcessor {

	HashMap<Integer,Click> touches;
	
	public InputListener() {
		touches = new HashMap<Integer,Click>();
	}
	
	@Override
	public boolean touchDown(int screenX, int screenY, int pointer, int button) {
//		Gdx.app.log("touchDown", "x "+screenX+" y "+screenY +" ¹ "+pointer);
//		touches.put(pointer, new Click((int)((float)screenX/((float)Gdx.graphics.getWidth()/1280.f)),
//										(int)((float)(Gdx.graphics.getHeight()-screenY)/((float)Gdx.graphics.getWidth()/1280.f)),
//										pointer));
//		Gdx.app.log("touchDown", touches.get(pointer).getX()+" "+touches.get(pointer).getY());
		touches.put(pointer, new Click(screenX,screenY,pointer));
		return true;
	}

	@Override
	public boolean touchUp(int screenX, int screenY, int pointer, int button) {
		//Gdx.app.log("touchUp", "x "+screenX+" y "+screenY +" ¹ "+pointer);
		touches.remove(pointer);
		return true;
	}

	@Override
	public boolean touchDragged(int screenX, int screenY, int pointer) {
//		touches.get(pointer).setX((int)((float)screenX/((float)Gdx.graphics.getWidth()/1280.f)));
//		touches.get(pointer).setY((int)((float)(Gdx.graphics.getHeight()-screenY)/((float)Gdx.graphics.getWidth()/1280.f)));
		touches.get(pointer).setX(screenX);
		touches.get(pointer).setY(screenY);
		//Gdx.app.log("touchDragged", "x "+screenX+" y "+screenY+" p "+ pointer);
		return true;
	}
	
	public HashMap<Integer,Click> getTouches(){
		return (HashMap<Integer,Click>)touches.clone();
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
