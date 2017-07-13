package historiadeusuarioemcodigo.contratodaataderegistrodeprecorefatorado;

import historiadeusuarioemcodigo.ataderegistrodepreco.AtaDeRegistroDePreco;
import historiadeusuarioemcodigo.escola.Escola;

public class ContratoDaAtaDeRegistroDePreco {

    private final Escola escola;
    private final AtaDeRegistroDePreco ataDeRegistroDePreco;

    public ContratoDaAtaDeRegistroDePreco(Escola escola, AtaDeRegistroDePreco ataDeRegistroDePreco) {
        this.escola = escola;
        this.ataDeRegistroDePreco = ataDeRegistroDePreco;
    }
}
