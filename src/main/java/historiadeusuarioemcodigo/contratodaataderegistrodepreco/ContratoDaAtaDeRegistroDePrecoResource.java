package historiadeusuarioemcodigo.contratodaataderegistrodepreco;

import historiadeusuarioemcodigo.ataderegistrodepreco.AtaDeRegistroDePreco;
import historiadeusuarioemcodigo.ataderegistrodepreco.AtaDeRegistroDePrecoRepositorio;
import historiadeusuarioemcodigo.contratodaataderegistrodeprecorefatorado.ContratoDaAtaDeRegistroDePreco;
import historiadeusuarioemcodigo.contratodaataderegistrodeprecorefatorado.ContratoDaAtaDeRegistroDePrecoHttp;
import historiadeusuarioemcodigo.contratodaataderegistrodeprecorefatorado.ContratoDaAtaDeRegistroDePrecoRepositorio;
import historiadeusuarioemcodigo.escola.Escola;
import historiadeusuarioemcodigo.escola.EscolaRepositorio;

import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.core.Response;

@Path("contratosdasatasderegistrodepreco")
public class ContratoDaAtaDeRegistroDePrecoResource {

    private ContratoDaAtaDeRegistroDePrecoRepositorio contratoDaAtaDeRegistroDePrecoRepositorio;
    private EscolaRepositorio escolaRepositorio;
    private AtaDeRegistroDePrecoRepositorio ataDeRegistroDePrecoRepositorio;

    public ContratoDaAtaDeRegistroDePrecoResource(ContratoDaAtaDeRegistroDePrecoRepositorio contratoDaAtaDeRegistroDePrecoRepositorio, EscolaRepositorio escolaRepositorio, AtaDeRegistroDePrecoRepositorio ataDeRegistroDePrecoRepositorio) {
        this.contratoDaAtaDeRegistroDePrecoRepositorio = contratoDaAtaDeRegistroDePrecoRepositorio;
        this.escolaRepositorio = escolaRepositorio;
        this.ataDeRegistroDePrecoRepositorio = ataDeRegistroDePrecoRepositorio;
    }

    @POST
    public Response post(ContratoDaAtaDeRegistroDePrecoHttp contratoDaAtaDeRegistroDePrecoHttp) {
        Escola escola = escolaRepositorio.obter(contratoDaAtaDeRegistroDePrecoHttp.escolaId);
        AtaDeRegistroDePreco ataDeRegistroDePreco = ataDeRegistroDePrecoRepositorio.obter(contratoDaAtaDeRegistroDePrecoHttp.ataDeRegistroDePrecoId);

        ContratoDaAtaDeRegistroDePreco contratoDaAtaDeRegistroDePreco = new ContratoDaAtaDeRegistroDePreco(escola, ataDeRegistroDePreco);

        contratoDaAtaDeRegistroDePrecoRepositorio.adicioinar(contratoDaAtaDeRegistroDePreco);

        return Response.ok().build();
    }
}
