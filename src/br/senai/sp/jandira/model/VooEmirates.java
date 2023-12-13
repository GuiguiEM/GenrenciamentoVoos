package br.senai.sp.jandira.model;

public class VooEmirates extends Voo {

    private int capacidadePassageiros;

    public VooEmirates(String numeroVoo, String origem, String destino, String dataPartida, String horaPartida, int capacidadePassageiros) {
        super(numeroVoo, origem, destino, dataPartida, horaPartida);
        this.capacidadePassageiros = capacidadePassageiros;
    }

    public int getCapacidadePassageiros() {
        return capacidadePassageiros;
    }
    @Override
    public String getNomeCompanhia() {
        return "Emirates";
    }

    @Override
    public void exibirDetalhes() {
        System.out.println("Número do Voo: " + getNumeroVoo());
        System.out.println("Origem: " + getOrigem());
        System.out.println("Destino: " + getDestino());
        System.out.println("Data de Partida: " + getDataPartida());
        System.out.println("Hora de Partida: " + getHoraPartida());
        System.out.println("Companhia Aérea: " + getNomeCompanhia());
        System.out.println("Capacidade de Passageiros: " + getCapacidadePassageiros());
    }

}