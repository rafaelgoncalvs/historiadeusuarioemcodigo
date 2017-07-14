package historiadeusuarioemcodigo.adesaoaataderegistrodeprecov4;

public class ServicoDeSolicitacaoDeAdesaoAAta {

    private EscolaRepositorio escolaRepositorio;
    private AtaDeRegistroDePrecoRepositorio ataDeRegistroDePrecoRepositorio;
    private SolicitacaoDeAdesaoAAtaRepositorio solicitacaoDeAdesaoAAtaRepositorio;
    private SecretariaDeEducacaoRepositorio secretariaDeEducacaoRepositorio;

    public ServicoDeSolicitacaoDeAdesaoAAta(EscolaRepositorio escolaRepositorio, AtaDeRegistroDePrecoRepositorio ataDeRegistroDePrecoRepositorio, SolicitacaoDeAdesaoAAtaRepositorio solicitacaoDeAdesaoAAtaRepositorio, SecretariaDeEducacaoRepositorio secretariaDeEducacaoRepositorio) {
        this.escolaRepositorio = escolaRepositorio;
        this.ataDeRegistroDePrecoRepositorio = ataDeRegistroDePrecoRepositorio;
        this.solicitacaoDeAdesaoAAtaRepositorio = solicitacaoDeAdesaoAAtaRepositorio;
        this.secretariaDeEducacaoRepositorio = secretariaDeEducacaoRepositorio;
    }

    public void solicitarAdesao(ComandoDeSolicitacaoDeAdesaoAAta comandoDeSolicitacaoDeAdesaoAAta) {
        Integer escolaId = comandoDeSolicitacaoDeAdesaoAAta.escolaId;
        Escola escola = escolaRepositorio.obter(escolaId);
        SecretariaDeEducacao secretariaDeEducacao = secretariaDeEducacaoRepositorio.obter(escolaId);
        Integer ataDeRegistroDePrecoId = comandoDeSolicitacaoDeAdesaoAAta.ataDeRegistroDePrecoId;
        AtaDeRegistroDePreco ataDeRegistroDePreco = ataDeRegistroDePrecoRepositorio.obter(ataDeRegistroDePrecoId);

        SolicitacaoDeAdesaoAAta solicitacaoDeAdesaoAAta = escola.solicitarAdesaoAAtaParaSed(ataDeRegistroDePreco,
                secretariaDeEducacao);

        solicitacaoDeAdesaoAAtaRepositorio.adicionar(solicitacaoDeAdesaoAAta);
    }
}
