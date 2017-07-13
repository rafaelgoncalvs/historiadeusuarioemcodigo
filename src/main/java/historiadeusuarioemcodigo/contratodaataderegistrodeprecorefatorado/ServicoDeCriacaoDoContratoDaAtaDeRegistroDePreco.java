package historiadeusuarioemcodigo.contratodaataderegistrodeprecorefatorado;

import historiadeusuarioemcodigo.ataderegistrodepreco.AtaDeRegistroDePreco;
import historiadeusuarioemcodigo.ataderegistrodepreco.AtaDeRegistroDePrecoRepositorio;
import historiadeusuarioemcodigo.escola.Escola;
import historiadeusuarioemcodigo.escola.EscolaRepositorio;

public class ServicoDeCriacaoDoContratoDaAtaDeRegistroDePreco {

    private ContratoDaAtaDeRegistroDePrecoRepositorio contratoDaAtaDeRegistroDePrecoRepositorio;
    private EscolaRepositorio escolaRepositorio;
    private AtaDeRegistroDePrecoRepositorio ataDeRegistroDePrecoRepositorio;

    public ServicoDeCriacaoDoContratoDaAtaDeRegistroDePreco(ContratoDaAtaDeRegistroDePrecoRepositorio contratoDaAtaDeRegistroDePrecoRepositorio, EscolaRepositorio escolaRepositorio, AtaDeRegistroDePrecoRepositorio ataDeRegistroDePrecoRepositorio) {
        this.contratoDaAtaDeRegistroDePrecoRepositorio = contratoDaAtaDeRegistroDePrecoRepositorio;
        this.escolaRepositorio = escolaRepositorio;
        this.ataDeRegistroDePrecoRepositorio = ataDeRegistroDePrecoRepositorio;
    }

    public void criar(ComandoDeCriacaoDaAtaDeRegistroDePreco comando) {
        Escola escola = escolaRepositorio.obter(comando.escolaId);
        AtaDeRegistroDePreco ataDeRegistroDePreco = ataDeRegistroDePrecoRepositorio.obter(comando.ataDeRegistroDePrecoId);

        ContratoDaAtaDeRegistroDePreco contratoDaAtaDeRegistroDePreco = new ContratoDaAtaDeRegistroDePreco(escola, ataDeRegistroDePreco);

        contratoDaAtaDeRegistroDePrecoRepositorio.adicioinar(contratoDaAtaDeRegistroDePreco);
    }
}
