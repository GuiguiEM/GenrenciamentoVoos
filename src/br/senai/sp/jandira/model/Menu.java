package br.senai.sp.jandira.model;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Menu{

    private List<Voo> voos = new ArrayList<>();

    public void Menu() {

        voos.add(new VooEmirates("2394", "Guarulhos", "Japão", "04-04-2023", "16h44", 170));
        voos.add(new VooDelta("1048", "Bela Vista", "África do Sul", "24-01-2023", "13h00", 200));
        voos.add(new VooAzul("4728", "Bauru", "Londres", "27-12-2023", "07h30", 310));

        Scanner teclado = new Scanner(System.in);
        boolean sair = true;

        while (sair) {
            System.out.println("---------- Qual Serviço você deseja utilizar?  ----------");
            System.out.println("Menu:");
            System.out.println("1 - Todos os Voos");
            System.out.println("2 - Destinos dos Voos");
            System.out.println("3 - Data de partida");
            System.out.println("5 - Sair");
            System.out.println("----------------------------------------------------------");
            int userOption = teclado.nextInt();
            teclado.nextLine();

            switch (userOption) {
                case 1:
                    listarVoos();
                    break;
                case 2:
                    listarDestinos();
                    break;
                case 3:
                    listarDatas();
                    break;
                case 5:
                    System.out.println("Aguardamos o seu retorno!!");
                    sair = false;
                    break;
            }
        }
    }

    private void listarVoos() {
        System.out.println("Lista de Horários de Voos:");
        System.out.println("");
        for (Voo voo : voos) {
            System.out.println("Companhia Aérea: " + voo.getNomeCompanhia());
            System.out.println("Numéro do Voo: " + voo.getNumeroVoo());
            System.out.println("Local de Partida: " + voo.getOrigem());
            System.out.println("Destino do Voo: " + voo.getDestino());
            System.out.println("Data da Viagem: " + voo.getDataPartida());
            System.out.println("Hora do Voo: " + voo.getHoraPartida());
            System.out.println();
        }
    }

    private void listarDestinos() {
        System.out.println("Lista de Destinos: ");
        System.out.println("");
        for (Voo voo : voos) {
            System.out.println("Companhia Aérea: " + voo.getNomeCompanhia());
            System.out.println("Local de partida: " + voo.getOrigem());
            System.out.println("Destino: " + voo.getDestino());
            System.out.println();
        }
    }

    private void listarDatas() {
        System.out.println("Data dos voos: ");
        for (Voo voo : voos) {
            System.out.println("Destino: " + voo.getDestino());
            System.out.println("Data Voo: " + voo.getDataPartida());
            System.out.println("Horário Voo: " + voo.getHoraPartida());
            System.out.println();
        }
    }

}