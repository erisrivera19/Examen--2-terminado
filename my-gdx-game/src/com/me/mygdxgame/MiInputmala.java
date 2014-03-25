package com.me.mygdxgame;

import com.badlogic.gdx.scenes.scene2d.InputEvent;
import com.badlogic.gdx.scenes.scene2d.InputListener;

public class MiInputmala extends InputListener{
	
	pelotitamala t;
	Fin adios;
	MiInputmala(pelotitamala param,Fin p)
	{
		super();
		t= param;
		adios = p;
	}
	public boolean touchDown(InputEvent event, float x, float y, int pointer, int button)
	{
		if(!Pausa.pausar){
		adios.setVisible(true);}
		return true;
	}
}
