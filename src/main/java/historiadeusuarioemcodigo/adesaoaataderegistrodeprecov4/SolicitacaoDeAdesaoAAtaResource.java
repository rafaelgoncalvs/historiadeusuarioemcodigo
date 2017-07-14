package historiadeusuarioemcodigo.adesaoaataderegistrodeprecov4;

import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.core.Response;

@Path("solicitacoesdeadesaoasatas")
public class SolicitacaoDeAdesaoAAtaResource {

    private ServicoDeSolicitacaoDeAdesaoAAta servicoDeSolicitacaoDeAdesaoAAta;

    public SolicitacaoDeAdesaoAAtaResource(ServicoDeSolicitacaoDeAdesaoAAta servicoDeSolicitacaoDeAdesaoAAta) {
        this.servicoDeSolicitacaoDeAdesaoAAta = servicoDeSolicitacaoDeAdesaoAAta;
    }

    @POST
    public Response post(SolicitacaoDeAdesaoAAtaHttp solicitacaoDeAdesaoAAtaHttp) {
        ComandoDeSolicitacaoDeAdesaoAAta comando = new ComandoDeSolicitacaoDeAdesaoAAta();
        comando.escolaId = solicitacaoDeAdesaoAAtaHttp.escolaId;
        comando.ataDeRegistroDePrecoId = solicitacaoDeAdesaoAAtaHttp.ataDeRegistroDePrecoId;

        servicoDeSolicitacaoDeAdesaoAAta.solicitarAdesao(comando);

        return Response.ok().build();
    }
}