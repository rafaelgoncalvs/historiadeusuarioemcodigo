package historiadeusuarioemcodigo.adesaoaataderegistrodeprecov2;

public class SolicitacaoDeAdesaoAAta {

    private Escola escola;
    private AtaDeRegistroDePreco ataDeRegistroDePreco;
    private SecretariaDeEducacao secretariaDeEducacao;

    public SolicitacaoDeAdesaoAAta(Escola escola, AtaDeRegistroDePreco ataDeRegistroDePreco,
                                   SecretariaDeEducacao secretariaDeEducacao) {
        this.escola = escola;
        this.ataDeRegistroDePreco = ataDeRegistroDePreco;
        this.secretariaDeEducacao = secretariaDeEducacao;
    }

    public Escola getEscola() {
        return escola;
    }
    public AtaDeRegistroDePreco getAtaDeRegistroDePreco() {
        return ataDeRegistroDePreco;
    }
    public SecretariaDeEducacao getSecretariaDeEducacao() {
        return secretariaDeEducacao;
    }
}
