package com.mrgradus.screens;

import java.util.HashMap;

import com.badlogic.gdx.Game;
import com.badlogic.gdx.Screen;
import com.mrgradus.helpers.Click;
import com.mrgradus.objects.ILevel;

public interface IScreen extends Screen{
	
	public void setScreen(Game game);
	
	public void setLevel(ILevel level);
	
	public ILevel getLevel();
	
	public HashMap<Integer, Click> getTouches();
}
