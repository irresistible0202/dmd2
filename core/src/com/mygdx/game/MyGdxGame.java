package com.mygdx.game;

import com.badlogic.gdx.ApplicationAdapter;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;

public class MyGdxGame extends ApplicationAdapter {
	SpriteBatch batch;
	Fon bg;
	player pl;

	@Override
	public void create () {
		batch = new SpriteBatch();
		bg = new Fon();
		pl = new player();

	}

	@Override
	public void render () {
		update();
		Gdx.gl.glClearColor(0, 1, 0, 1);
		Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);
		batch.begin();
		bg.render(batch);
		pl.render(batch);
		batch.end();
	}

	public void update(){
		bg.update();
		pl.update();

	}
	
	@Override
	public void dispose () {
		batch.dispose();
	}
}
