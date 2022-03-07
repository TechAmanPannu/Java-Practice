package com.newjava.razorpay.in_memory_db;

import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.HashMap;
import java.util.Set;

/**
 * @author Amandeep Singh on 2/28/22/02/2022
 */

@Data
public class Schema extends HashMap<String, FieldConfig> {


    public void addProperty(String fieldName, FieldConfig fieldConfig) {
        if(fieldName == null || fieldName.isEmpty() || fieldConfig == null) {
            return;
        }
        this.put(fieldName, fieldConfig);
    }

    public Set<String> getAllFields() {
        return this.keySet();
    }

    public String getPrimaryKey() {
        for(String property : this.keySet()) {
            if(this.get(property) == null) { continue; }
            if(this.get(property).isPrimaryKey()) {
                return property;
            }
        }
        return null;
    }

}
