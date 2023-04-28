package Collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class Game {
    ArrayList<String> players;

    private static int WIN_COUNT = 3;


    public Game() {
        players = new ArrayList<>();
    }

    public void initPlayers() {
        players.add("Alex Ogar");
        players.add("Marina Ogar");
        players.add("Anna Ogar");
        players.add("Misha Ogar");
        players.add("Lesha Ogar");
        players.add("Robert Nabaldyan");
        players.add("Vika Nabaldyan");
        players.add("Gamlet Gyardjyan");
        players.add("Aik Gyardjyan");
    }

    public void getWinners() {
        Collections.shuffle(players);
        ArrayList<String> listWinners = new ArrayList<>();
        for (int i = 0; i < WIN_COUNT; i++) {
            listWinners.add(players.get(i));
        }
        for (String winner : listWinners) {
            System.out.println("Winner: ".concat(winner));
        }
    }
}
