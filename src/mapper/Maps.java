package mapper;

import playerStructure.Currencies;
import playerStructure.Items;
import playerStructure.Player;
import playerStructure.Progresses;

import java.util.List;
import java.util.Map;

public class Maps {
    private Map<Integer, String> playerMap;
    private Map<Integer, List<Currencies>> currenciesMap;
    private Map<Integer, List<Progresses>> progressesMap;
    private Map<Integer, List<Items>> itemsMap;

    public Maps(List<Player> players) {
        this.playerMap = ToMap.toMapPlayer(players);
        this.currenciesMap = ToMap.toMapCurrencies(players);
        this.itemsMap = ToMap.toMapItems(players);
        this.progressesMap = ToMap.toMapProgresses(players);
    }

    public Maps(Map<Integer, String> playerMap, Map<Integer, List<Currencies>> currenciesMap, Map<Integer, List<Progresses>> progressesMap, Map<Integer, List<Items>> itemsMap) {
        this.playerMap = playerMap;
        this.currenciesMap = currenciesMap;
        this.progressesMap = progressesMap;
        this.itemsMap = itemsMap;
    }

    public Map<Integer, String> getPlayerMap() {
        return playerMap;
    }

    public void setPlayerMap(Map<Integer, String> playerMap) {
        this.playerMap = playerMap;
    }

    public Map<Integer, List<Currencies>> getCurrenciesMap() {
        return currenciesMap;
    }

    public void setCurrenciesMap(Map<Integer, List<Currencies>> currenciesMap) {
        this.currenciesMap = currenciesMap;
    }

    public Map<Integer, List<Progresses>> getProgressesMap() {
        return progressesMap;
    }

    public void setProgressesMap(Map<Integer, List<Progresses>> progressesMap) {
        this.progressesMap = progressesMap;
    }

    public Map<Integer, List<Items>> getItemsMap() {
        return itemsMap;
    }

    public void setItemsMap(Map<Integer, List<Items>> itemsMap) {
        this.itemsMap = itemsMap;
    }
}
