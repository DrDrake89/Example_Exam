package com.mygdx.game;

import com.badlogic.gdx.ApplicationAdapter;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.graphics.g2d.TextureRegion;
import com.badlogic.gdx.utils.ScreenUtils;

public class MyGdxGame extends ApplicationAdapter {
	SpriteBatch batch;
	Texture img;
	public static Texture sheet;
	public static TextureRegion background,protagonista;

	@Override
	public void create () {

		sheet = new Texture(Gdx.files.internal("Pictures.png"));
		sheet.setFilter(Texture.TextureFilter.Nearest, Texture.TextureFilter.Nearest);

		background = new TextureRegion(sheet, 1, 296, 795, 273);
		background.flip(false,false);

		protagonista = new TextureRegion(sheet, 181, 130, 141, 123);
		protagonista.flip(false, true);


		batch = new SpriteBatch();
		img = new Texture("badlogic.jpg");
	}

	@Override
	public void render () {
		ScreenUtils.clear(1, 0, 0, 1);
		batch.begin();
		//batch.draw(img, 0, 0);
		batch.disableBlending();
		batch.draw(background, 0, 0, Gdx.graphics.getWidth(), Gdx.graphics.getHeight());
		batch.enableBlending();
		batch.draw(protagonista,Gdx.graphics.getWidth()/2,Gdx.graphics.getHeight()/2);
		batch.end();
	}
	
	@Override
	public void dispose () {
		batch.dispose();
		img.dispose();
	}
}
