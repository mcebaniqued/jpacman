package nl.tudelft.jpacman.level;

import nl.tudelft.jpacman.board.Board;
import nl.tudelft.jpacman.board.Square;
import nl.tudelft.jpacman.npc.Ghost;

import static org.mockito.Mockito.mock;

import org.assertj.core.util.Lists;
import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;

public class LevelIsInProgress {
    private Level level;
    private Ghost ghost = mock(Ghost.class);
    private Board board = mock(Board.class);
    private Square square1 = mock(Square.class);
    private Square square2 = mock(Square.class);
    private final CollisionMap collisions = mock(CollisionMap.class);

    @Test
    void testLevelIsInProgressIsFalse(){
        level = new Level(board, Lists.newArrayList(ghost), Lists.newArrayList(square1, square2), collisions);
        assertThat(level.isInProgress()).isEqualTo(false);
    }
}
