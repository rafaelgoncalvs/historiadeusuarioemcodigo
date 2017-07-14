package historiadeusuarioemcodigo.adesaoaataderegistrodeprecov1;

public class AdesaoAAta {

    private Escola escola;
    private AtaDeRegistroDePreco ataDeRegistroDePreco;
    private SecretariaDeEducacao secretariaDeEducacao;
    private StatusDaAdesaoAAta status;

    public AdesaoAAta(Escola escola, AtaDeRegistroDePreco ataDeRegistroDePreco,
                      SecretariaDeEducacao secretariaDeEducacao) {
        this.escola = escola;
        this.ataDeRegistroDePreco = ataDeRegistroDePreco;
        this.secretariaDeEducacao = secretariaDeEducacao;
        this.status = StatusDaAdesaoAAta.AGUARDANDO_APROVACAO;
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
    public StatusDaAdesaoAAta getStatus() {
        return status;
    }
}
