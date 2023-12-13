package br.senai.sp.jandira.model;

public class Voo {

    private String numeroVoo;
    private String origemVoo;
    private String destino;
    private String dataPartida;
    private String horaPartida;

    public Voo(String numeroVoo, String origem, String destino, String dataPartida, String horaPartida) {
        this.numeroVoo = numeroVoo;
        this.origemVoo = origem;
        this.destino = destino;
        this.dataPartida = dataPartida;
        this.horaPartida = horaPartida;
    }

    public String getNumeroVoo() {
        return numeroVoo;
    }

    public String getOrigem() {
        return origemVoo;
    }

    public String getDestino() {
        return destino;
    }

    public String getDataPartida() {
        return dataPartida;
    }

    public String getHoraPartida() {
        return horaPartida;
    }

    public String getNomeCompanhia() {
        return null;
    }

    public void exibirDetalhes() {

    }

}