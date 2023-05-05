package Iterator;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class Celular implements Iterable<Contato> {
    private List<Contato> contatos = new ArrayList<Contato>();

    public Celular(Contato... contatos) {
        this.contatos = Arrays.asList(contatos);
    }

    @Override
    public Iterator<Contato> iterator() {
        return contatos.iterator();
    }
}
