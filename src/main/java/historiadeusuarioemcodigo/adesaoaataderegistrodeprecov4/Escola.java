package historiadeusuarioemcodigo.adesaoaataderegistrodeprecov4;

public class Escola {

    private String nome;

    public Escola(String nome) {
        this.nome = nome;
    }

    public SolicitacaoDeAdesaoAAta solicitarAdesaoAAtaParaSed(
            AtaDeRegistroDePreco ataDeRegistroDePreco,
            SecretariaDeEducacao secretariaDeEducacao) {

        return new SolicitacaoDeAdesaoAAta(this, ataDeRegistroDePreco, secretariaDeEducacao);
    }
}
