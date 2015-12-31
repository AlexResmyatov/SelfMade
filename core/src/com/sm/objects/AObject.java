package com.sm.objects;

import java.util.ArrayList;
import java.util.List;

import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.sm.helpers.Click;
import com.sm.screens.IScreen;

public abstract class AObject {

	protected int x;
	protected int y;
	protected int width=64;
	protected int height=64;
	List<String> properties = new ArrayList<String>();;

	public abstract void update(IScreen screen);
	public abstract void render(SpriteBatch batch,int x,int y,float scale);
	public abstract void dispose();
	

	public boolean checkProperties(String checkableProperty) {
		for (String property:properties)
			if(property == checkableProperty) return true;
		return false;
	}
	
	public boolean checkProperties(List<String> properties) {
		for (String checkableProperty:properties){
			if(checkProperties(checkableProperty)==false) return false;
		}
		return true;
	}
	
	public boolean onClick(IScreen screen){
		if(screen!=null){
			for(Click click: screen.getTouches().values()){
				if(click.getX()>x && click.getX()<x+width && 
						click.getY()>y && click.getY()<y+height) 
					return true;
			}
		}
		return false;
	}
	
	public int getX(){
		return x;
	}
	
	public int getY(){
		return y;
	}
	
	public int getWidth(){
		return width;
	}
	
	public int getHeight(){
		return height;
	}
	
	public List<String> getPropertys(){
		return properties;
	}
	
	
	
	
	public String toString(){
		return "null "+x+" "+y;
	}
}
