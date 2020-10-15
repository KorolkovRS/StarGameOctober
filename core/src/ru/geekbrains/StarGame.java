package ru.geekbrains;

import com.badlogic.gdx.ApplicationAdapter;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.math.Vector2;

public class StarGame extends ApplicationAdapter {
	SpriteBatch batch;
	Texture img;
	float point = 0f;
	
	@Override
	public void create () {
		batch = new SpriteBatch();
		img = new Texture("badlogic.jpg");

		Vector2 v1 = new Vector2(2, 1);
		Vector2 v2 = new Vector2(2, 2);
		v1.add(v2);
		System.out.printf("v1.add(v2) = (%s, %s)", v1.x, v1.y).println();

		v1.set(6, 7);
		v2.set(5, 1);
		v1.sub(v2);
		System.out.printf("v1.sub(v2) = (%s, %s)", v1.x, v1.y).println();
		System.out.printf("v1.len() = %s", v1.len()).println();

		v1.scl(2);
		System.out.printf("v1.len() = %s", v1.len()).println();

		v1.scl(0.1f);
		System.out.printf("v1.len() = %s", v1.len()).println();

		v1.setLength(3);
		System.out.printf("v1.len() = %s", v1.len()).println();

		v1.nor();
		System.out.printf("v1.len() = %s", v1.len()).println();

		v1.set(1, 1);
		System.out.printf("v1.len() = %s", v1.len()).println();
		v2.set(-1, 1);
		System.out.printf("v2.len() = %s", v2.len()).println();
		v1.nor();
		v2.nor();
		System.out.println(Math.acos(v1.dot(v2)));
		v2.setZero();

	}

	@Override
	public void render () {
		Gdx.gl.glClearColor(0.2f, 0.6f, 0.4f, 1);
		Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);
		batch.begin();
		batch.setColor(0.2f, 0.3f, 0.4f, 1f);
		batch.draw(img, 100, 100);
		batch.setColor(0.9f, 0.3f, 0.4f, 0.5f);
		batch.draw(img, 330, 330, 100, 100);
		batch.draw(img, point, point);
		batch.end();
		point += 1;
	}
	
	@Override
	public void dispose () {
		batch.dispose();
		img.dispose();
	}
}
