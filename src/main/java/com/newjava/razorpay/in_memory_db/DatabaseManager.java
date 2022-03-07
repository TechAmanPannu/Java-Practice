package com.newjava.razorpay.in_memory_db;

import lombok.Data;

/**
 * @author Amandeep Singh on 2/28/22/02/2022
 */

@Data
public class DatabaseManager {

    private static class DatabaseManageInitializer  {
        private final static DatabaseManager databaseManager = new DatabaseManager();
    }

    private Database database;

    private DatabaseManager() {
    }

    public static  DatabaseManager of(){
       return DatabaseManageInitializer.databaseManager;
    }


    public  Database createDatabase(String dbName) {
        this.database  = new Database(dbName);
        return this.database;
    }

}
