package historiadeusuarioemcodigo.adesaoaataderegistrodeprecov4;

import java.time.LocalDateTime;

public class SolicitacaoDeAdesaoAAta {

    private LocalDateTime dataDaSolicitacao;
    private Escola escola;
    private AtaDeRegistroDePreco ataDeRegistroDePreco;
    private SecretariaDeEducacao secretariaDeEducacao;

    public SolicitacaoDeAdesaoAAta(Escola escola, AtaDeRegistroDePreco ataDeRegistroDePreco, SecretariaDeEducacao secretariaDeEducacao) {
        this.escola = escola;
        this.ataDeRegistroDePreco = ataDeRegistroDePreco;
        this.secretariaDeEducacao = secretariaDeEducacao;
        this.dataDaSolicitacao = LocalDateTime.now();
    }
}
