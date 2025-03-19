import static org.junit.jupiter.api.Assertions.*;

import org.example.PiedraPapelTijera;
import org.junit.jupiter.api.Test;

public class RulesTest {
    private final PiedraPapelTijera rock = PiedraPapelTijera.PIEDRA;
    private final PiedraPapelTijera paper = PiedraPapelTijera.PAPEL;
    private final PiedraPapelTijera scissors = PiedraPapelTijera.TIJERA;

    @Test
    void rockBeatsScissors() {
        assertEquals(rock, rock.vs(scissors));
    }

    @Test
    void rockLostWithPaper() {
        assertEquals(paper, rock.vs(paper));
    }

    @Test
    void paperBeatsRock() {
        assertEquals(paper, paper.vs(rock));
    }

    @Test
    void scissorsBeatsPaper() {
        assertEquals(scissors, scissors.vs(paper));
    }

    @Test tieWhenBothAreRock() {
        assertEquals(rock, rock.vs(rock))
    }

    @Test tieWhenBothArePaper() {
        assertEquals(paper, rock.vs(paper))
    }

    @Test tieWhenBothAreScissors() {
        assertEquals(scissors, scissors.vs(scissors));
    }
}
