package com.me.mygdxgame;


import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.scenes.scene2d.ui.Image;


	public class Bienvenida extends Image {
		public Bienvenida()
		{
			super(new Texture("data/inicio.png"));
	        this.addListener(new InputBienvenida(this));
	}
		
}

