package nl.tudelft.jpacman.level;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;

import nl.tudelft.jpacman.npc.ghost.GhostFactory;
import nl.tudelft.jpacman.sprite.PacManSprites;
import nl.tudelft.jpacman.npc.Ghost;

public class GhostHasSquareTest {
    private static final PacManSprites SPRITE_STORE = new PacManSprites();
    private GhostFactory Factory = new GhostFactory(SPRITE_STORE);

    private Ghost Blinky = Factory.createBlinky();
    private Ghost Clyde = Factory.createClyde();
    private Ghost Inky = Factory.createInky();
    private Ghost Pinky = Factory.createPinky();

    @Test
    void testBlinkyHasSquareIsFalse(){ assertThat(Blinky.hasSquare()).isEqualTo(false); }

    @Test
    void testClydeHasSquareIsFalse(){ assertThat(Clyde.hasSquare()).isEqualTo(false); }

    @Test
    void testInkyHasSquareIsFalse(){ assertThat(Inky.hasSquare()).isEqualTo(false); }

    @Test
    void testPinkyHasSquareIsFalse(){ assertThat(Pinky.hasSquare()).isEqualTo(false); }
}
