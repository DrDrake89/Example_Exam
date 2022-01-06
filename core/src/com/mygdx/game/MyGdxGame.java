package com.mygdx.game;

import com.badlogic.gdx.ApplicationAdapter;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.graphics.g2d.TextureRegion;
import com.badlogic.gdx.utils.ScreenUtils;

import java.awt.geom.Arc2D;

public class MyGdxGame extends ApplicationAdapter {
	SpriteBatch batch;
	Texture img;
	public static Texture sheet;
	public static TextureRegion background,protagonista;
	public static float totalScreenWidth,totalScreenHeight;
	public float PositionX;
	public float PositionY;

	@Override
	public void create () {

		totalScreenWidth = Gdx.graphics.getWidth();
		totalScreenHeight = Gdx.graphics.getHeight();

		PositionX = totalScreenHeight/2;
		PositionY = totalScreenWidth/2;

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
		float TotalSteps = 0;
		ScreenUtils.clear(1, 0, 0, 1);
		batch.begin();
		//batch.draw(img, 0, 0);
		batch.disableBlending();
		batch.draw(background, 0, 0, Gdx.graphics.getWidth(), Gdx.graphics.getHeight());
		batch.enableBlending();
		batch.draw(protagonista,PositionY,PositionX);

		/*while(PositionY<totalScreenWidth){
			for(TotalSteps = PositionY; TotalSteps<= totalScreenWidth; TotalSteps++){
				System.out.println(TotalSteps);
				PositionY = PositionY+TotalSteps;
			}
		}*/

		batch.end();
	}
	
	@Override
	public void dispose () {
		batch.dispose();
		img.dispose();
	}
}
