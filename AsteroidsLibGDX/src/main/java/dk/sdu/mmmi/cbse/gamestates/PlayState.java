package dk.sdu.mmmi.cbse.gamestates;

import com.badlogic.gdx.graphics.glutils.ShapeRenderer;
import dk.sdu.mmmi.cbse.entities.Player;
import dk.sdu.mmmi.cbse.managers.GameKeys;
import dk.sdu.mmmi.cbse.managers.GameStateManager;
import dk.sdu.mmmi.cbse.entities.Enemy;

public class PlayState extends GameState {
	
	private ShapeRenderer sr;
        
        private ShapeRenderer srEnemy;
	
	private Player player;
        
        private Enemy enemy;
	
	public PlayState(GameStateManager gsm) {
		super(gsm);
	}
	
	public void init() {
		
		sr = new ShapeRenderer();
		
		player = new Player();
                
                srEnemy = new ShapeRenderer();
                
                enemy = new Enemy();
		
	}
	
	public void update(float dt) {
		
		handleInput();
		
		player.update(dt);
                enemy.update(dt);
		
	}
	
	public void draw() {
		player.draw(sr);
                enemy.draw(srEnemy);
	}
	
	public void handleInput() {
		player.setLeft(GameKeys.isDown(GameKeys.LEFT));
		player.setRight(GameKeys.isDown(GameKeys.RIGHT));
		player.setUp(GameKeys.isDown(GameKeys.UP));
	}
	
	public void dispose() {}
	
}









