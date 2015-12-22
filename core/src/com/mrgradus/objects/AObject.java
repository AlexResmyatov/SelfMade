package com.mrgradus.objects;

import java.util.ArrayList;
import java.util.List;

import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.mrgradus.helpers.Click;
import com.mrgradus.screens.IScreen;

public abstract class AObject {

	int x=0;
	int y=0;
	int width=0;
	int height=0;
	List<String> propertys = new ArrayList<String>();;
//	public Texture img;
//	public IScreen screen;
	
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
		return propertys;
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
	
	public abstract void update(IScreen screen);
	
	public abstract void render(SpriteBatch batch,int x,int y,float scale);
	
	public abstract void dispose();
	
	public String toString(){
		return "TestObject2 "+x+" "+y;
	}
}
