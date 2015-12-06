package com.mrgradus.screens;

import java.util.HashMap;

import com.badlogic.gdx.Game;
import com.badlogic.gdx.Screen;
import com.mrgradus.helpers.Click;
import com.mrgradus.objects.ALevel;

public interface IScreen extends Screen{
	
	public void setScreen(Game game);
	
	public void setLevel(ALevel level);
	
	public ALevel getLevel();
	
	public HashMap<Integer, Click> getTouches();
	
	public float getScale();
}
