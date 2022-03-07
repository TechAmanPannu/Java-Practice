package com.newjava.razorpay.in_memory_db;

/**
 * @author Amandeep Singh on 2/28/22/02/2022
 */
public class Driver {

    public static void main(String arg[]) {

        Database database = DatabaseManager.of()
                .createDatabase("test");
        System.out.println("Database "+database);
        Schema schema = new Schema();
        schema.addProperty("id", new FieldConfig(true, String.class));
        schema.addProperty("firstName", new FieldConfig(String.class));
        schema.addProperty("email", new FieldConfig(String.class));
        Table table = database.createTable("User", schema);
        System.out.println(table.getSchema().getAllFields());

        Row row = new Row();
        row.addValue("id", "aman1234");
        row.addValue("firstName", "Amandeep Singh");
        row.addValue("email", "amandeeep@gmail.com");
        table.addRow(row);
        table.addRow(row);
        System.out.println(table.getSchema());
    }
}
