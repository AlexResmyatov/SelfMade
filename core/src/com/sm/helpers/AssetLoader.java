package com.sm.helpers;

import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.TextureRegion;

public class AssetLoader {
	
	public static Texture img;
	public static Texture robot;
	public static Texture navigationButtons;
	public static TextureRegion concrete;
	
	public static TextureRegion buttonDown; 
	public static TextureRegion buttonLeft; 
	public static TextureRegion buttonRight; 
	public static TextureRegion buttonUp; 
	public static void loadImages(){
		navigationButtons = new Texture("navigationbuttons.png");
		buttonDown =  new TextureRegion(navigationButtons,0  ,0,128,128);
		buttonLeft =  new TextureRegion(navigationButtons,128,0,128,128);
		buttonRight = new TextureRegion(navigationButtons,256,0,128,128);
		buttonUp =    new TextureRegion(navigationButtons,384,0,128,128);
		robot = new Texture("robot.png");
		img = new Texture("concrete.jpg");
		concrete = new TextureRegion(img, 0,0,64,64);
	}
	
}
