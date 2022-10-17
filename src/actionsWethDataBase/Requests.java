package actionsWethDataBase;

import playerStructure.Currencies;
import playerStructure.Items;
import playerStructure.Progresses;

public class Requests {
    public static String drop(String tableName) {
        return "DROP TABLE "+tableName;
    }
    public static String insert_player(int playerId, String name) {
        return "INSERT playerdtb.player(player_id,nickname) VALUES(" + playerId + ",'" + name + "'" + ")";
    }
    public static String insert_currencies(Currencies i) {
        return "INSERT playerdtb.currencies(id,player_id,resource_id,name,count) VALUES(" + i.getId() + ", " + i.getPlayerId() + ", " + i.getResourceId() + ", '" + i.getName() + "', " + i.getCount() + ")";
    }
    public static String insert_progresses(Progresses t) {
        return "INSERT playerdtb.progresses(id,player_id,resource_id,score,max_score) VALUES(" + t.getId() + ", " + t.getPlayerId() + ", " + t.getResourceId() + ", " + t.getScore() + ", " + t.getMaxScore() + ")";
    }
    public static String insert_items(Items g) {
        return "INSERT playerdtb.items(id,player_id,resoutce_id,count,level) VALUES(" + g.getId() + ", " + g.getPlayerId() + ", " + g.getResourceId() + ", " + g.getCount() + ", " + g.getLevel() + ")";
    }

    public static String create_currencies() {
        return "CREATE TABLE playerdtb.currencies (" +
                "  id int NOT NULL," +
                "  player_id int NOT NULL," +
                "  resource_id int NOT NULL," +
                "  count int DEFAULT NULL," +
                "  name varchar(45) DEFAULT NULL," +
                "  PRIMARY KEY (id)" +
                ") ";
    }

    public static String create_player() {
        return "CREATE TABLE playerdtb.player (" +
                "  player_id int NOT NULL," +
                "  nickname varchar(45) DEFAULT NULL," +
                "  PRIMARY KEY (player_id)" +
                ")";
    }

    public static String create_items() {
        return "CREATE TABLE playerdtb.items (" +
                "  id int NOT NULL," +
                "  player_id int NOT NULL," +
                "  resoutce_id int NOT NULL," +
                "  count int DEFAULT NULL," +
                "  level int DEFAULT NULL," +
                "  PRIMARY KEY (id)" +
                ")";
    }

    public static String create_progresses() {
        return "CREATE TABLE playerdtb.progresses (" +
                "  id int NOT NULL," +
                "  player_id int NOT NULL," +
                "  resource_id int NOT NULL," +
                "  score int DEFAULT NULL," +
                "  max_score int DEFAULT NULL," +
                "  PRIMARY KEY (id)" +
                ")";
    }

    public static String query_progresses(String val) {
        return "SELECT * FROM playerdtb.progresses WHERE player_id=" + val;
    }
    public static String query_items(String val) {
        return "SELECT * FROM playerdtb.items WHERE player_id=" + val;
    }
    public static String query_currencies(String val) {
        return "SELECT * FROM playerdtb.currencies WHERE player_id=" + val;
    }
    public static String query_player() {
        return "SELECT * FROM playerdtb.player";
    }



}
