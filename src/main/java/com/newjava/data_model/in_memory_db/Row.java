package com.newjava.data_model.in_memory_db;

import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.HashMap;
import java.util.Map;

/**
 * @author Amandeep Singh on 2/28/22/02/2022
 */

@Data
@NoArgsConstructor
public class Row {
    private Map<String, Object> fields;
    private long createdAt;

    public void addValue(String fieldName, Object value) {
        if(fieldName == null || fieldName.isEmpty() || value == null) {
            return;
        }
        if(fields == null || fields.isEmpty()) {
            this.fields = new HashMap<>();
        }
        this.fields.put(fieldName, value);
    }

    public Object getValue(String fieldName) {
        if(fieldName == null || fieldName.isEmpty()) {
            return null;
        }
        if(fields == null || fields.isEmpty()) {
            return null;
        }

        return fields.get(fieldName);
    }
}
