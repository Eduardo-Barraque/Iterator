package Iterator;

import java.util.Iterator;

public class Chip {
    public static Integer contarTotalContatosCelular(Celular celular) {
        int quantidade = 0;
        for (Iterator a = celular.iterator(); a.hasNext(); ) {
            quantidade++;
            a.next();
        }
        return quantidade;
    }
}
