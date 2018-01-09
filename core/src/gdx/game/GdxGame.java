package gdx.game;

import com.badlogic.gdx.ApplicationAdapter;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Input;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.graphics.g2d.Sprite;

public class GdxGame extends ApplicationAdapter {

    SpriteBatch batch;
    Sprite sprguy, sprWleft, sprWright, sprWup, sprWdown;
    Texture Txstand, TxWdown, TxWright, TxWleft, TxWup;

    @Override
    public void create() {
        batch = new SpriteBatch();
        
        Txstand = new Texture("guystanding.png");
        TxWdown = new Texture("walkingdown.png");
        TxWright = new Texture("walkingright.png");
        TxWleft = new Texture("walkingleft.png");
        TxWup = new Texture("walkingup.png");
        sprguy = new Sprite(Txstand);
        sprWleft = new Sprite(TxWleft);
        sprWright = new Sprite(TxWright);
        sprWup = new Sprite(TxWup);
        sprWdown = new Sprite(TxWdown);
    }

    @Override
    public void render() {
        Gdx.gl.glClearColor(1, 1, 1, 0);
        Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);
        batch.begin();
        batch.draw(sprguy, sprguy.getX(), sprguy.getY());
        batch.end();
        if (Gdx.input.isKeyPressed(Input.Keys.LEFT)) {
            sprguy.setX(sprguy.getX() - 100 * Gdx.graphics.getDeltaTime());
            sprguy.setTexture(TxWleft);
        }
        if (Gdx.input.isKeyPressed(Input.Keys.RIGHT)) {
            sprguy.setX(sprguy.getX() + 100 * Gdx.graphics.getDeltaTime());
            sprguy.setTexture(TxWright);
        }
        if (Gdx.input.isKeyPressed(Input.Keys.UP)) {
            sprguy.setY(sprguy.getY() + 100 * Gdx.graphics.getDeltaTime());
            sprguy.setTexture(TxWup);
        }
        if (Gdx.input.isKeyPressed(Input.Keys.DOWN)) {
            sprguy.setY(sprguy.getY() - 100 * Gdx.graphics.getDeltaTime());
            sprguy.setTexture(TxWdown);
        }
    }

    @Override
    public void dispose() {
        batch.dispose();
        Txstand.dispose();
        TxWleft.dispose();
        TxWright.dispose();
        TxWup.dispose();
        TxWdown.dispose();
    }
}
