package io.veron;

import com.badlogic.gdx.Game;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Screen;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.Sprite;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import io.veron.screen.SplashScreen;

/** {@link com.badlogic.gdx.ApplicationListener} implementation shared by all platforms. */
public class Veron extends Game {

    private SpriteBatch batch;

    @Override
    public void create() {

        this.batch = new SpriteBatch();

        Texture texture = new Texture(Gdx.files.internal("SplashScreen.png"));
        Sprite sprite = new Sprite(texture);
        sprite.setSize(1280.0f, 720.0f);

        this.setScreen(new SplashScreen(sprite, this));
    }

    @Override
    public void render() {
        super.render();
    }

    public SpriteBatch getSpriteBatch() {
        return this.batch;
    }

    public void renewSpriteBatch() {
        this.batch.dispose();
        this.batch = new SpriteBatch();
    }
}