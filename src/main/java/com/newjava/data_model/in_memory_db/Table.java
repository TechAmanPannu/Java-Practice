package com.newjava.data_model.in_memory_db;

import lombok.Data;

import java.util.HashMap;
import java.util.Map;

/**
 * @author Amandeep Singh on 2/28/22/02/2022
 */

@Data

public class Table {

    private String name;
    private Schema schema;
    private Map<Object, Row> rows;

    public Table(String name, Schema schema) {
        validate(schema);
        this.name = name;
        this.schema = schema;
    }

    public Row addRow(Row row) {
        String primaryKey =  this.schema.getPrimaryKey();
        if(primaryKey == null) {
            throw new IllegalArgumentException("Schema does not have primary key");
        }
        if(this.rows == null || this.rows.isEmpty()) {
            this.rows = new HashMap<>();
        }
        Object primaryValue = row.getValue(primaryKey);
        if(primaryValue == null) {
            throw new IllegalArgumentException("Invalid primary key value");
        }
        row.setCreatedAt(System.currentTimeMillis());
        this.rows.put(primaryValue, row);
        return row;
    }

    private void validate(Schema schema) {
        if(schema.getPrimaryKey() == null) {
            throw new IllegalArgumentException("Schema does not have primary key");
        }
    }



}
