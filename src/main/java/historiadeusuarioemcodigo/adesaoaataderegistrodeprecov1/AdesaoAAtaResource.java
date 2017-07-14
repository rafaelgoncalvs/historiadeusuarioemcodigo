package historiadeusuarioemcodigo.adesaoaataderegistrodeprecov1;

import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.core.Response;

@Path("adesoesasatas")
public class AdesaoAAtaResource {

	private EscolaRepositorio escolaRepositorio;
	private AtaDeRegistroDePrecoRepositorio ataDeRegistroDePrecoRepositorio;
	private AdesaoAAtaRepositorio adesaoAAtaRepositorio;
	private SecretariaDeEducacaoRepositorio secretariaDeEducacaoRepositorio;

	public AdesaoAAtaResource(EscolaRepositorio escolaRepositorio, AtaDeRegistroDePrecoRepositorio ataDeRegistroDePrecoRepositorio, AdesaoAAtaRepositorio adesaoAAtaRepositorio, SecretariaDeEducacaoRepositorio secretariaDeEducacaoRepositorio) {
		this.escolaRepositorio = escolaRepositorio;
		this.ataDeRegistroDePrecoRepositorio = ataDeRegistroDePrecoRepositorio;
		this.adesaoAAtaRepositorio = adesaoAAtaRepositorio;
		this.secretariaDeEducacaoRepositorio = secretariaDeEducacaoRepositorio;
	}

	@POST
    public Response post(AdesaoAAtaHttp adesaoAAtaHttp) {
		Integer escolaId = adesaoAAtaHttp.escolaId;
		Escola escola = escolaRepositorio.obter(escolaId);
		SecretariaDeEducacao secretariaDeEducacao = secretariaDeEducacaoRepositorio.obter(escolaId);
		Integer ataDeRegistroDePrecoId = adesaoAAtaHttp.ataDeRegistroDePrecoId;
		AtaDeRegistroDePreco ataDeRegistroDePreco = ataDeRegistroDePrecoRepositorio.obter(ataDeRegistroDePrecoId);

		AdesaoAAta adesaoAAta = new AdesaoAAta(escola, ataDeRegistroDePreco, secretariaDeEducacao);

		adesaoAAtaRepositorio.adicionar(adesaoAAta);
        return Response.ok().build();
    }
}