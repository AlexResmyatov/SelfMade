package com.sm.levels;

import java.util.ArrayList;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.files.FileHandle;
import com.sm.objects.AObject;
import com.sm.objects.Concrete;
import com.sm.objects.MainCharacter;
import com.sm.screens.IScreen;

public class FirstLevel extends ALevel {
	
	FileHandle map;
	
	public FirstLevel(IScreen screen){
		this.screen=screen;
		objects = new ArrayList<AObject>();
//		map = Gdx.files.internal("firstlevel.txt");
//		String tmap = map.readString();
//		Gdx.app.log("map",tmap);
		for(int i=0; i<100;i++){
			for(int j=0; j<100; j++){
				objects.add(new Concrete(i*64, j*64));
			}
		}
		objects.add(new MainCharacter(this));
	}

	@Override
	public void update(float delta) {
		for(int i=0;i<objects.size();i++){
			objects.get(i).update(screen);
		}
	}
}
