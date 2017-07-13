package historiadeusuarioemcodigo.adesaoaataderegistrodepreco;

import historiadeusuarioemcodigo.ataderegistrodepreco.AtaDeRegistroDePreco;
import historiadeusuarioemcodigo.ataderegistrodepreco.AtaDeRegistroDePrecoRepositorio;
import historiadeusuarioemcodigo.escola.Escola;
import historiadeusuarioemcodigo.escola.EscolaRepositorio;

import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.core.Response;

@Path("adesoesasatasderegistrodepreco")
public class AdesaoAAtaDeRegistroDePrecoResource {

	private EscolaRepositorio escolaRepositorio;
	private AtaDeRegistroDePrecoRepositorio ataDeRegistroDePrecoRepositorio;
	private AdesaoAAtaDeRegistroDePrecoRepositorio adesaoAAtaDeRegistroDePrecoRepositorio;

	public AdesaoAAtaDeRegistroDePrecoResource(EscolaRepositorio escolaRepositorio,
											   AtaDeRegistroDePrecoRepositorio ataDeRegistroDePrecoRepositorio,
											   AdesaoAAtaDeRegistroDePrecoRepositorio adesaoAAtaDeRegistroDePrecoRepositorio) {
		this.escolaRepositorio = escolaRepositorio;
		this.ataDeRegistroDePrecoRepositorio = ataDeRegistroDePrecoRepositorio;
		this.adesaoAAtaDeRegistroDePrecoRepositorio = adesaoAAtaDeRegistroDePrecoRepositorio;
	}

	@POST
    public Response post(AdesaoAAtaDeRegistroDePrecoHttp adesaoAAtaDeRegistroDePrecoHttp) {
		Integer escolaId = adesaoAAtaDeRegistroDePrecoHttp.escolaId;
		Escola escola = escolaRepositorio.obter(escolaId);
		Integer ataDeRegistroDePrecoId = adesaoAAtaDeRegistroDePrecoHttp.ataDeRegistroDePrecoId;
		AtaDeRegistroDePreco ataDeRegistroDePreco = ataDeRegistroDePrecoRepositorio.obter(ataDeRegistroDePrecoId);

		AdesaoAAtaDeRegistroDePreco adesaoAAtaDeRegistroDePreco = new AdesaoAAtaDeRegistroDePreco(escola, ataDeRegistroDePreco);

		adesaoAAtaDeRegistroDePrecoRepositorio.adicionar(adesaoAAtaDeRegistroDePreco);

        return Response.ok().build();
    }
}

