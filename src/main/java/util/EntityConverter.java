package main.java.util;

import java.lang.reflect.Field;
import java.util.ArrayList;

public class EntityConverter {
        public static <T> String[][] convertArrayListToTwoDArray(ArrayList<T> entities) {
            if (entities == null || entities.isEmpty()) {
                return new String[0][0];
            }

            // Get the class of the entity (assuming all entities are of the same type)
            Class<?> entityClass = entities.get(0).getClass();

            // Get the fields of the entity class
            Field[] fields = entityClass.getDeclaredFields();
            int numRows = entities.size();
            int numCols = fields.length;

            // Create a two-dimensional array to hold the data
            String[][] result = new String[numRows][numCols];

            // Fill in the data from the entities
            for (int i = 0; i < numRows; i++) {
                for (int j = 0; j < numCols; j++) {
                    fields[j].setAccessible(true);
                    try {
                        Object value = fields[j].get(entities.get(i));
                        result[i][j] = (value != null) ? value.toString() : null;
                    } catch (IllegalAccessException e) {
                        e.printStackTrace(); // Handle or log the exception as needed
                    }
                }
            }

            return result;
        }
}
