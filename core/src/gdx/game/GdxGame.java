package gdx.game;

import com.badlogic.gdx.ApplicationAdapter;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Input;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.graphics.g2d.Sprite;
//edit test
public class GdxGame extends ApplicationAdapter {

    SpriteBatch batch;
    Sprite sprguy, sprWleft, sprWright, sprWup, sprWdown, sprWLU, sprWRU, sprWLD, sprWRD;
    Texture Txstand, TxWdown, TxWright, TxWleft, TxWup, TxWLU, TxWRU, TxWLD, TxWRD;

    @Override
    public void create() {
        batch = new SpriteBatch();
        
        Txstand = new Texture("guystanding.png");
        TxWdown = new Texture("walkingdown.png");
        TxWright = new Texture("walkingright.png");
        TxWleft = new Texture("walkingleft.png");
        TxWup = new Texture("walkingup.png");
        TxWLU = new Texture("walkingLU.png");
        TxWRU = new Texture("walkingRU.png");
        TxWLD = new Texture("walkingLD.png");
        TxWRD = new Texture("walkingRD.png");
        sprguy = new Sprite(Txstand);
        sprWleft = new Sprite(TxWleft);
        sprWright = new Sprite(TxWright);
        sprWup = new Sprite(TxWup);
        sprWdown = new Sprite(TxWdown);
        sprWLU = new Sprite(TxWLU);
        sprWRU = new Sprite(TxWRU);
        sprWLD = new Sprite(TxWLD);
        sprWRD = new Sprite(TxWRD);
    }

    @Override
    public void render() {
        Gdx.gl.glClearColor(1, 1, 1, 0);
        Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);
        batch.begin();
        batch.draw(sprguy, sprguy.getX(), sprguy.getY());
        batch.end();
        if (Gdx.input.isKeyPressed(Input.Keys.A)) {
            sprguy.setX(sprguy.getX() - 200 * Gdx.graphics.getDeltaTime());
            sprguy.setTexture(TxWleft);
        }
        if (Gdx.input.isKeyPressed(Input.Keys.D)) {
            sprguy.setX(sprguy.getX() + 200 * Gdx.graphics.getDeltaTime());
            sprguy.setTexture(TxWright);
        }
        if (Gdx.input.isKeyPressed(Input.Keys.W)) {
            sprguy.setY(sprguy.getY() + 200 * Gdx.graphics.getDeltaTime());
            sprguy.setTexture(TxWup);
        }
        if (Gdx.input.isKeyPressed(Input.Keys.S)) {
            sprguy.setY(sprguy.getY() - 200 * Gdx.graphics.getDeltaTime());
            sprguy.setTexture(TxWdown);
        }
        if (Gdx.input.isKeyPressed(Input.Keys.S)&&Gdx.input.isKeyPressed(Input.Keys.A)) {
            sprguy.setY(sprguy.getY() - 60 * Gdx.graphics.getDeltaTime());
            sprguy.setX(sprguy.getX() - 60 * Gdx.graphics.getDeltaTime());
            sprguy.setTexture(TxWLD);
        }
        if (Gdx.input.isKeyPressed(Input.Keys.S)&&Gdx.input.isKeyPressed(Input.Keys.D)) {
            sprguy.setY(sprguy.getY() - 60 * Gdx.graphics.getDeltaTime());
            sprguy.setX(sprguy.getX() + 60 * Gdx.graphics.getDeltaTime());
            sprguy.setTexture(TxWRD);
        }
        if (Gdx.input.isKeyPressed(Input.Keys.W)&&Gdx.input.isKeyPressed(Input.Keys.A)) {
            sprguy.setY(sprguy.getY() + 60 * Gdx.graphics.getDeltaTime());
            sprguy.setX(sprguy.getX() - 60 * Gdx.graphics.getDeltaTime());
            sprguy.setTexture(TxWLU);
        }
        if (Gdx.input.isKeyPressed(Input.Keys.W)&&Gdx.input.isKeyPressed(Input.Keys.D)) {
            sprguy.setY(sprguy.getY() + 60 * Gdx.graphics.getDeltaTime());
            sprguy.setX(sprguy.getX() + 60 * Gdx.graphics.getDeltaTime());
            sprguy.setTexture(TxWRU);
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
        TxWLD.dispose();
        TxWRD.dispose();
        TxWLU.dispose();
        TxWRU.dispose();
    }
}
