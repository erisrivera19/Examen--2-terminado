package com.me.mygdxgame;

import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.scenes.scene2d.ui.Image;

public class Pelotita extends Image{
	public Pelotita(int x, int y) {
		super(new Texture("data/pelotita.png"));
		this.addListener(new MiInput(this));
		if (getX()>100)
		remove();
		
		setX(x);
		setY(y);
	
	}
	public void act(float delta)
	{
		setX(getX()+1);
		 if (getX()>500)
		 {
			 setX(0);
		 }
		 if(getY()>200)
			{
			setY(0);}
}
}
