package com.sm.helpers;

import java.util.List;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.g2d.BitmapFont;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.sm.objects.AObject;

public class Camera {
	private float scale;
	private final float GAME_WIDTH=1280.f;
	private float camX;
	private float camY;
	SpriteBatch batch;
	
	public Camera(){
		scale=Gdx.graphics.getWidth()/GAME_WIDTH;
		camX=0f;
		camY=0f;
		batch = new SpriteBatch();
		
	}
	
	public void render(List<AObject> objects){
		
		Gdx.gl.glClearColor(0, 1, 0, 1);
		Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);
		batch.begin();
		
		
		for(AObject object: objects){
			object.render(batch,(int)(((float)object.getX()-camX)*scale),(int)(((float)object.getY()-camY)*scale),scale);
		}
		batch.end();
		
	}
	
	public float getCamX(){
		return camX;
	}
	public float getCamY(){
		return camY;
	}
	public void setCamX(float x){
		this.camX=x;
	}
	public void setCamY(float y){
		this.camY=y;
	}
	public float getScale(){
		return scale;
	}
	public void setScale(float s){
		this.scale=s;
	}
	public void dispose(){
		Gdx.app.log("Camera","Dispose");
		batch.dispose();
	}
}
