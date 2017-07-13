package historiadeusuarioemcodigo.contratodaataderegistrodeprecorefatorado;

import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.core.Response;

@Path("contratosdasatasderegistrodepreco")
public class ContratoDaAtaDeRegistroDePrecoResource {

    private ServicoDeCriacaoDoContratoDaAtaDeRegistroDePreco servicoDeCriacaoDoContratoDaAtaDeRegistroDePreco;

    public ContratoDaAtaDeRegistroDePrecoResource(ServicoDeCriacaoDoContratoDaAtaDeRegistroDePreco servicoDeCriacaoDoContratoDaAtaDeRegistroDePreco) {
        this.servicoDeCriacaoDoContratoDaAtaDeRegistroDePreco = servicoDeCriacaoDoContratoDaAtaDeRegistroDePreco;
    }

    @POST
    public Response post(ContratoDaAtaDeRegistroDePrecoHttp contratoDaAtaDeRegistroDePrecoHttp) {
        ComandoDeCriacaoDaAtaDeRegistroDePreco comando = new ComandoDeCriacaoDaAtaDeRegistroDePreco();
        comando.ataDeRegistroDePrecoId = contratoDaAtaDeRegistroDePrecoHttp.ataDeRegistroDePrecoId;
        comando.escolaId = contratoDaAtaDeRegistroDePrecoHttp.escolaId;

        servicoDeCriacaoDoContratoDaAtaDeRegistroDePreco.criar(comando);

        return Response.ok().build();
    }
}
