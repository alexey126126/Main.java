import actionsWethDataBase.*;
import jsonReader.ParsingJson;
import playerStructure.Player;
import utils.Util;

import java.io.IOException;
import java.sql.*;
import java.util.List;


public class Main {



    public static void main(String[] args) throws IOException, ClassNotFoundException, SQLException {

        Data d = new Data();
        Util.delete_all_table(d);
        Util.create_all_table(d);
        List<Player> lst = ParsingJson.parsing("C:\\Users\\Alex\\Desktop\\task\\task 1\\players.json");
        EnterDataToDB.enter(lst, d.getConnection());
        System.out.println(lst);
        EnterDataToList.uppLoad(d);
    }

}
