package com.me.mygdxgame;

import com.badlogic.gdx.scenes.scene2d.InputEvent;
import com.badlogic.gdx.scenes.scene2d.InputListener;


public class InputBienvenida extends InputListener {
	Bienvenida b;
	InputBienvenida(Bienvenida param)
	{
		super();
		b=param;
	}
	public boolean touchDown(InputEvent event, float x, float y, int pointer, int button){
		
		b.setVisible(false);
		
		return true;
	}
}


