package utils;

import actionsWethDataBase.Data;
import actionsWethDataBase.Requests;
import actionsWethDataBase.TestConnection;

import java.sql.SQLException;

public class Util {
    public static void delete_all_table(Data d) {
        TestConnection.deleteTable(Requests.drop("playerdtb.player"), d.getConnection());
        TestConnection.deleteTable(Requests.drop("playerdtb.items"), d.getConnection());
        TestConnection.deleteTable(Requests.drop("playerdtb.currencies"), d.getConnection());
        TestConnection.deleteTable(Requests.drop("playerdtb.progresses"), d.getConnection());
    }

    public static void create_all_table(Data d) throws SQLException {
        TestConnection.makeTable(Requests.create_player(), d.getConnection());
        TestConnection.makeTable(Requests.create_items(), d.getConnection());
        TestConnection.makeTable(Requests.create_currencies(), d.getConnection());
        TestConnection.makeTable(Requests.create_progresses(), d.getConnection());
    }
}
