package com.adamlwilkins.game.States;

import com.badlogic.gdx.graphics.OrthographicCamera;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.math.Vector3;

/**
 * Created by adam on 7/11/16.
 */
public abstract class State {
    protected OrthographicCamera cam;       //create the camera
    protected Vector3 mouse;                //create the mouse input
    protected GameStateManager gsm;         //create the gamestate manager

    protected State(GameStateManager gsm){
        this.gsm = gsm;
        cam = new OrthographicCamera();
        mouse = new Vector3();

    }

    protected abstact void handleInput();   //abstract methods
    public abstract voide update(float dt);
    public abstract void render(SpriteBatch sb);
}
