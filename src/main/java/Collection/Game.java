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
        players.add("Daria Ogar");
        players.add("Bogdan Budoshin");
        players.add("Fedor Ogar");
        players.add("Kiril Nabaldyan");
        players.add("Leon Nabaldyan");
        players.add("Gamlet Gyardjyan");
        players.add("Aik Gyardjyan");
        Collections.sort(players);
    }

    public ArrayList<String> getListPlayers() {
        Collections.sort(players);
        return players;
    }

    public ArrayList<String> getWinners() {
        Collections.shuffle(players);
        ArrayList<String> listWinners = new ArrayList<>();
        for (int i = 0; i < WIN_COUNT; i++) {
            listWinners.add(players.get(i));
        }
        return listWinners;
    }

    public boolean add(String player) {
        int index = Collections.binarySearch(players, player);
        if (index >= 0) {
            return false;
        }
        players.add(-index - 1, player);
        return true;
    }

    @Override
    public String toString() {
        return "Full list players: ".concat(String.valueOf(players));
    }
}
