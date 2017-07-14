package historiadeusuarioemcodigo.adesaoaataderegistrodeprecov2;

import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.core.Response;

@Path("solicitacoesdeadesaoasatas")
public class SolicitacaoDeAdesaoAAtaResource {

	private EscolaRepositorio escolaRepositorio;
	private AtaDeRegistroDePrecoRepositorio ataDeRegistroDePrecoRepositorio;
	private SolicitacaoDeAdesaoAAtaRepositorio solicitacaoDeAdesaoAAtaRepositorio;
	private SecretariaDeEducacaoRepositorio secretariaDeEducacaoRepositorio;

	public SolicitacaoDeAdesaoAAtaResource(EscolaRepositorio escolaRepositorio, AtaDeRegistroDePrecoRepositorio ataDeRegistroDePrecoRepositorio, SolicitacaoDeAdesaoAAtaRepositorio solicitacaoDeAdesaoAAtaRepositorio, SecretariaDeEducacaoRepositorio secretariaDeEducacaoRepositorio) {
		this.escolaRepositorio = escolaRepositorio;
		this.ataDeRegistroDePrecoRepositorio = ataDeRegistroDePrecoRepositorio;
		this.solicitacaoDeAdesaoAAtaRepositorio = solicitacaoDeAdesaoAAtaRepositorio;
		this.secretariaDeEducacaoRepositorio = secretariaDeEducacaoRepositorio;
	}

	@POST
    public Response post(SolicitacaoDeAdesaoAAtaHttp solicitacaoDeAdesaoAAtaHttp) {
		Integer escolaId = solicitacaoDeAdesaoAAtaHttp.escolaId;
		Escola escola = escolaRepositorio.obter(escolaId);
		SecretariaDeEducacao secretariaDeEducacao = secretariaDeEducacaoRepositorio.obter(escolaId);
		Integer ataDeRegistroDePrecoId = solicitacaoDeAdesaoAAtaHttp.ataDeRegistroDePrecoId;
		AtaDeRegistroDePreco ataDeRegistroDePreco = ataDeRegistroDePrecoRepositorio.obter(ataDeRegistroDePrecoId);

		SolicitacaoDeAdesaoAAta solicitacaoDeAdesaoAAta = new SolicitacaoDeAdesaoAAta(escola, ataDeRegistroDePreco,
				secretariaDeEducacao);

		solicitacaoDeAdesaoAAtaRepositorio.adicionar(solicitacaoDeAdesaoAAta);
        return Response.ok().build();
    }
}