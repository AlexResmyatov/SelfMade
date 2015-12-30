package com.sm.levels;

import java.util.ArrayList;

import com.sm.objects.AObject;
import com.sm.objects.BackGround;
import com.sm.objects.buttons.BStart;
import com.sm.screens.IScreen;

public class MainMenuLevel extends ALevel {

	
	public  MainMenuLevel(IScreen screen) {
		objects = new ArrayList<AObject>();
		this.screen = screen;
		objects.add(new BackGround());
		objects.add(new BStart());
	}
	
	
	public void update(float delta) {
		
		for(int i=0;i<objects.size();i++){
			objects.get(i).update(screen);
		}
		
	}
}
