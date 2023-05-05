package Iterator;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ChipTest {
    @Test
    void deveContarTotalContatosChip() {
        Celular celular = new Celular(
                new Contato("Eduardo", "24999888777"),
                new Contato("Gabriel", "24998877665"),
                new Contato("Ariana", "24987654321"),
                new Contato("Jefferson","24912345678")
        );
        assertEquals(4, Chip.contarTotalContatosCelular(celular));
    }
}
