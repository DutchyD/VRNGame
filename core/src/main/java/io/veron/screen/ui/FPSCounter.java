package io.veron.screen.ui;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.Color;
import com.badlogic.gdx.graphics.g2d.BitmapFont;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;

public class FPSCounter extends BitmapFont {

    public FPSCounter() {
        this.setColor(Color.ROYAL);
    }

    public void draw(SpriteBatch batch, float x, float y) {
        this.draw(batch, "FPS: " + Gdx.graphics.getFramesPerSecond(), x, y);
    }
}
