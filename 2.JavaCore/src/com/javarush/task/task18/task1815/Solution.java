package com.javarush.task.task18.task1815;

import java.util.List;

/* 
Таблица
*/

public class Solution {
    public class TableInterfaceWrapper implements TableInterface {

        private TableInterface TI;

        public TableInterfaceWrapper(TableInterface TI) {
            this.TI = TI;
        }

        @Override
        public void setModel(List rows) {
            System.out.println(rows.size());
            this.TI.setModel(rows);
        }

        @Override
        public String getHeaderText() {
            return this.TI.getHeaderText().toUpperCase();
        }

        @Override
        public void setHeaderText(String newHeaderText) {
            this.TI.setHeaderText(newHeaderText);
        }
    }

    public interface TableInterface {
        void setModel(List rows);

        String getHeaderText();

        void setHeaderText(String newHeaderText);
    }

    public static void main(String[] args) {
    }
}