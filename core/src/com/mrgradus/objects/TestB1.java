package com.mrgradus.objects;

import java.util.ArrayList;
import java.util.List;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.mrgradus.helpers.Click;
import com.mrgradus.screens.IScreen;
import com.mrgradus.screens.TestScreen;

public class TestB1 implements IObject {
	
	int x=300;
	int y=0;
	int width=100;
	int height=100;
	List<String> propertys;
	SpriteBatch batch;
	private Texture img;
	private IScreen screen;
	public TestB1(IScreen screen,int y) {
		this.screen = screen;
//		this.y=y;
		batch = new SpriteBatch();
		img = new Texture("badlogic.jpg");
//		img = new Texture("a.png");
		propertys = new ArrayList<String>();
		propertys.add(Propertys.PR_IMPASSABLE);
	}
	@Override
	public void update(float delta) {
		if(onClick()){
//			x+=10;
//			screen.getCamera().setCamX(screen.getCamera().getCamX()+5);
			TestScreen screen1=new TestScreen(screen.getGame());
			screen.setScreen(screen.getGame(), screen1);
			//screen.getCamera().setScale(screen.getCamera().getScale()+0.002f);
			//Gdx.app.log(null, this.toString());
		}
		x=(int)screen.getCamera().getCamX();
		y=(int)screen.getCamera().getCamY();
	}

	@Override
	public void render(SpriteBatch batch,int x,int y,int width, int height) {
		batch.draw(img, x, y, width, height);

	}
	
	private boolean onClick(){
		for(Click click: screen.getTouches().values()){
			if(click.getX()>x && click.getX()<x+width && 
					click.getY()>y && click.getY()<y+height) 
				return true;
		}
		return false;
	}
	
	@Override
	public List<String> getPropertys(){
		return propertys;
	}
	@Override
	public int getX(){
		return x;
	}
	@Override
	public int getY(){
		return y;
	}
	@Override
	public int getWidth(){
		return width;
	}
	@Override
	public int getHeight(){
		return height;
	}
	
	
	public String toString(){
		return "TestObject2 "+x+" "+y;
	}
	
	@Override
	public void dispose(){
		img.dispose();
		screen.getLevel().getAllObjects().remove(this);
	}
}
