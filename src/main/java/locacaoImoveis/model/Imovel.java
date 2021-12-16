package locacaoImoveis.model;

public class Imovel {

    private String nomeImovel;
    private boolean disponibilidade;
    private String tipoImovel;
    private String cidade;
    private double aluguelPorDia;
    private String locatario;

    public String getNomeImovel() {
        return nomeImovel;
    }

    public void setNomeImovel(String nomeImovel) {
        this.nomeImovel = nomeImovel;
    }

    public boolean isDisponibilidade() {
        return disponibilidade;
    }

    public void setDisponibilidade(boolean disponibilidade) {
        this.disponibilidade = disponibilidade;
    }

    public String getTipoImovel() {
        return tipoImovel;
    }

    public void setTipoImovel(String tipoImovel) {
        this.tipoImovel = tipoImovel;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public double getAluguelPorDia() {
        return aluguelPorDia;
    }

    public void setAluguelPorDia(double aluguelPorDia) {
        this.aluguelPorDia = aluguelPorDia;
    }
}
