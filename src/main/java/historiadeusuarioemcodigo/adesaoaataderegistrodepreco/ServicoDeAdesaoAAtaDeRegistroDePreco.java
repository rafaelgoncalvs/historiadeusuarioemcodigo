package historiadeusuarioemcodigo.adesaoaataderegistrodepreco;

import historiadeusuarioemcodigo.ataderegistrodepreco.AtaDeRegistroDePreco;
import historiadeusuarioemcodigo.ataderegistrodepreco.AtaDeRegistroDePrecoRepositorio;
import historiadeusuarioemcodigo.escola.Escola;
import historiadeusuarioemcodigo.escola.EscolaRepositorio;

public class ServicoDeAdesaoAAtaDeRegistroDePreco {

    private AdesaoAAtaDeRegistroDePrecoRepositorio adesaoAAtaDeRegistroDePrecoRepositorio;
    private AtaDeRegistroDePrecoRepositorio ataDeRegistroDePrecoRepositorio;
    private EscolaRepositorio escolaRepositorio;

    public ServicoDeAdesaoAAtaDeRegistroDePreco(AdesaoAAtaDeRegistroDePrecoRepositorio adesaoAAtaDeRegistroDePrecoRepositorio,
                                                AtaDeRegistroDePrecoRepositorio ataDeRegistroDePrecoRepositorio, EscolaRepositorio escolaRepositorio) {
        this.adesaoAAtaDeRegistroDePrecoRepositorio = adesaoAAtaDeRegistroDePrecoRepositorio;
        this.ataDeRegistroDePrecoRepositorio = ataDeRegistroDePrecoRepositorio;
        this.escolaRepositorio = escolaRepositorio;
    }

    public void aderir(ComandoDeAdesaoAAtaDeRegistroDePreco comandoDeAdesaoAAtaDeRegistroDePreco) {
        Escola escola = escolaRepositorio.obter(comandoDeAdesaoAAtaDeRegistroDePreco.escolaId);
        AtaDeRegistroDePreco ataDeRegistroDePreco = ataDeRegistroDePrecoRepositorio.obter(comandoDeAdesaoAAtaDeRegistroDePreco.ataDeRegistroDePrecoId);

        AdesaoAAtaDeRegistroDePreco adesaoAAtaDeRegistroDePreco = new AdesaoAAtaDeRegistroDePreco(escola, ataDeRegistroDePreco);

        adesaoAAtaDeRegistroDePrecoRepositorio.adicionar(adesaoAAtaDeRegistroDePreco);
    }
}
