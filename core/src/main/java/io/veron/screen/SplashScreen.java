package io.veron.screen;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Input;
import com.badlogic.gdx.Screen;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.g2d.Sprite;
import com.badlogic.gdx.math.Matrix4;
import io.veron.Veron;
import io.veron.screen.ui.FPSCounter;

/** First screen of the application. Displayed after the application is created. */
public class SplashScreen implements Screen {

    private final Sprite sprite;
    private final Veron veron;
    private FPSCounter counter = new FPSCounter();

    public SplashScreen(Sprite sprite, Veron veron) {
        this.sprite = sprite;
        this.veron = veron;
    }

    @Override
    public void show() {
        
    }

    @Override
    public void render(float delta) {
        Gdx.gl.glClearColor(1, 1, 1, 1);
        Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);

        if (Gdx.input.isKeyJustPressed(Input.Keys.ANY_KEY))
            this.nextScreen();

        this.veron.getSpriteBatch().begin();
        this.sprite.draw(this.veron.getSpriteBatch());
        this.counter.draw(this.veron.getSpriteBatch(), Gdx.graphics.getWidth() * 0.01f, Gdx.graphics.getHeight() - 5f);
        this.veron.getSpriteBatch().end();
    }

    @Override
    public void resize(int width, int height) {
        this.veron.renewSpriteBatch();
        this.sprite.setSize(Float.valueOf(String.valueOf(width)), Float.valueOf(String.valueOf(height)));
    }

    @Override
    public void pause() {

    }

    @Override
    public void resume() {

    }

    @Override
    public void hide() {

    }

    @Override
    public void dispose() {
        this.counter.dispose();
    }

    private void nextScreen() {
        this.veron.setScreen(new MenuScreen(this.veron));
    }
}