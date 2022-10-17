package mapper;

import playerStructure.Currencies;
import playerStructure.Items;
import playerStructure.Player;
import playerStructure.Progresses;

import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class ToMap {

    public static Map<Integer, List<Items>> toMapItems(List<Player> players){
        Map<Integer, List<Items>> map = new TreeMap<>();
        for (Player p: players) {
            map.put(p.getPlayerId(), p.getItems());
        }
        return map;
    }
    public static Map<Integer, List<Currencies>> toMapCurrencies(List<Player> players){
        Map<Integer, List<Currencies>> map = new TreeMap<>();
        for (Player p: players) {
            map.put(p.getPlayerId(), p.getCurrencies());
        }
        return map;
    }
    public static Map<Integer, List<Progresses>> toMapProgresses(List<Player> players){
        Map<Integer, List<Progresses>> map = new TreeMap<>();
        for (Player p: players) {
            map.put(p.getPlayerId(), p.getProgresses());
        }
        return map;
    }
    public static Map<Integer, String> toMapPlayer(List<Player> players){
        Map<Integer, String> map = new TreeMap<>();
        for (Player p: players) {
            map.put(p.getPlayerId(), p.getNickname());
        }
        return map;
    }
}
