package com.newjava.razorpay.in_memory_db;

import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author Amandeep Singh on 2/28/22/02/2022
 */
@Data
public class FieldConfig {

    private boolean isPrimaryKey;
    private boolean isNonNull;
    private Class dataType;

    public FieldConfig(Class dataType) {
        this.dataType = dataType;
    }

    public FieldConfig(boolean isPrimaryKey, Class dataType) {
        this.isPrimaryKey = isPrimaryKey;
        this.dataType = dataType;
    }

}
