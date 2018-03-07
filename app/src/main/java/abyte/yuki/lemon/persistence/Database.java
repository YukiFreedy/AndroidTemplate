package abyte.yuki.lemon.persistence;

/**
 * Created by Yuki on 07-Mar-18. This template is free to use
 */

public class Database {

    private static final Database instance = new Database();

    private Database(){

    }

    public static Database getInstance() {
        return instance;
    }
}
