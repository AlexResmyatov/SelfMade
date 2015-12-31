package com.sm.helpers;

import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.TextureRegion;

public class AssetLoader {
	
	public static Texture img;
	public static Texture robot;
	public static TextureRegion concrete; 
	public static void loadImages(){
		robot = new Texture("robot.png");
		img = new Texture("concrete.jpg");
		concrete = new TextureRegion(img, 0,0,64,64);
	}
	
}
