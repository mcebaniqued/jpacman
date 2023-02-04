package nl.tudelft.jpacman.level;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;

import nl.tudelft.jpacman.npc.ghost.GhostFactory;
import nl.tudelft.jpacman.sprite.PacManSprites;
import nl.tudelft.jpacman.npc.Ghost;
import nl.tudelft.jpacman.board.Direction;

public class GhostGetDirection {
    private static final PacManSprites SPRITE_STORE = new PacManSprites();
    private GhostFactory Factory = new GhostFactory(SPRITE_STORE);

    private Ghost Blinky = Factory.createBlinky();
    private Ghost Clyde = Factory.createClyde();
    private Ghost Inky = Factory.createInky();
    private Ghost Pinky = Factory.createPinky();

    @Test
    void testBlinkyGetDirectionIsEast(){ assertThat(Blinky.getDirection()).isEqualTo(Direction.EAST); }

    @Test
    void testClydeGetDirectionIsEast(){ assertThat(Clyde.getDirection()).isEqualTo(Direction.EAST); }

    @Test
    void testInkyGetDirectionIsEast(){ assertThat(Inky.getDirection()).isEqualTo(Direction.EAST); }

    @Test
    void testPinkyGetDirectionIsEast(){ assertThat(Pinky.getDirection()).isEqualTo(Direction.EAST); }
}
