package com.newjava.data_model.in_memory_db;

import lombok.Data;

import java.util.HashMap;
import java.util.Map;

/**
 * @author Amandeep Singh on 2/28/22/02/2022
 */


@Data
public class Database {

    private String name;
    private Map<String, Table> tables;

    private Database() {

    }

    public Database(String name) {
        this.name = name;
    }


    public Table createTable(String name, Schema schema) {
        if(name == null || name.isEmpty() || schema == null) {
            return null;
        }
        if(tables == null || tables.isEmpty()) {
            this.tables = new HashMap<>();
        }
        Table table = new Table(name,schema);
        tables.put(name, table);
        return table;
    }
}
