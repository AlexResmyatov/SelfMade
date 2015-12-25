package com.sm.screens;

import java.util.HashMap;

import com.badlogic.gdx.Game;
import com.badlogic.gdx.Screen;
import com.sm.helpers.Camera;
import com.sm.helpers.Click;
import com.sm.objects.ALevel;

public interface IScreen extends Screen{
	
	public void setScreen(IScreen screen);
	
	public void setLevel(ALevel level);
	
	public ALevel getLevel();
	
	public Game getGame();
	
	public HashMap<Integer, Click> getTouches();
	
	public Camera getCamera();
	
	public float getDelta();
//	public float getScale();
}
