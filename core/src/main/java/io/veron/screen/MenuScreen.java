package io.veron.screen;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Screen;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import io.veron.Veron;
import io.veron.screen.ui.FPSCounter;

public class MenuScreen implements Screen {

    private FPSCounter counter = new FPSCounter();
    private final Veron veron;

    public MenuScreen(Veron veron) {
        System.out.println("Menu Screen created");
        this.veron = veron;
    }

    @Override
    public void show() {

    }

    @Override
    public void render(float delta) {
        Gdx.gl.glClearColor(1,1,1,1);
        Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);

        this.veron.getSpriteBatch().begin();
        this.counter.draw(this.veron.getSpriteBatch(), Gdx.graphics.getWidth() * 0.01f, Gdx.graphics.getHeight() - 5f);
        this.veron.getSpriteBatch().end();
    }

    @Override
    public void resize(int width, int height) {

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

    }
}
