package org.example.Collection;

public class Main {
    public static void main(String[] args) {
        Game game = new Game();
        game.initPlayers();
        System.out.println("List full players: " + game.getListPlayers());
        System.out.println("\nPlayes added: " + game.add("Elena Muraveva"));
        System.out.println("\nList full winners: " + game.getWinners());
        System.out.println("\nList full players: " + game.getListPlayers());
    }
}
