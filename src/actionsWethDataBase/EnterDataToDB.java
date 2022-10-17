package actionsWethDataBase;

import playerStructure.Currencies;
import playerStructure.Items;
import playerStructure.Player;
import playerStructure.Progresses;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;

public class EnterDataToDB {
    public static void enter(List<Player> lst, Connection con) throws SQLException {
        for (Player p: lst) {
            TestConnection.enterToDataBase(Requests.insert_player(p.getPlayerId(), p.getNickname()), con);
            for (Currencies c: p.getCurrencies()) {
                TestConnection.enterToDataBase(Requests.insert_currencies(c), con);
            }
            for (Items i: p.getItems()) {
                TestConnection.enterToDataBase(Requests.insert_items(i), con);
            }
            for (Progresses pr: p.getProgresses()) {
                TestConnection.enterToDataBase(Requests.insert_progresses(pr), con);
            }
            System.out.println(p);
        }
    }
}
