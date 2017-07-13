package historiadeusuarioemcodigo.adesaoaataderegistrodeprecorefatorado;

import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.core.Response;

@Path("adesoesasatasderegistrodepreco")
public class AdesaoAAtaDeRegistroDePrecoResource {

    private ServicoDeAdesaoAAtaDeRegistroDePreco servicoDeAdesaoAAtaDeRegistroDePreco;

    public AdesaoAAtaDeRegistroDePrecoResource(ServicoDeAdesaoAAtaDeRegistroDePreco servicoDeAdesaoAAtaDeRegistroDePreco) {
        this.servicoDeAdesaoAAtaDeRegistroDePreco = servicoDeAdesaoAAtaDeRegistroDePreco;
    }

    @POST
    public Response post(AdesaoAAtaDeRegistroDePrecoHttp adesaoAAtaDeRegistroDePrecoHttp) {
        ComandoDeAdesaoAAtaDeRegistroDePreco comando = new ComandoDeAdesaoAAtaDeRegistroDePreco();
        comando.ataDeRegistroDePrecoId = adesaoAAtaDeRegistroDePrecoHttp.ataDeRegistroDePrecoId;
        comando.escolaId = adesaoAAtaDeRegistroDePrecoHttp.escolaId;

        servicoDeAdesaoAAtaDeRegistroDePreco.aderir(comando);

        return Response.ok().build();
    }
}
