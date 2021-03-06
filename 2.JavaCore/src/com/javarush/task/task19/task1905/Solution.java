package com.javarush.task.task19.task1905;

import java.util.HashMap;
import java.util.Map;

/* 
Закрепляем адаптер
*/

public class Solution {
    public static Map<String,String> countries = new HashMap<String,String>();

    static {
        countries.put("UA", "Ukraine");
        countries.put("RU", "Russia");
        countries.put("CA", "Canada");
    }

    public static void main(String[] args) {

        /*DataAdapter da = new DataAdapter();
        //da.getCompany();
        System.out.println(da.getContactFirstName());
        System.out.println(da.getContactLastName());
        System.out.println(da.getCountryCode());
        System.out.println(da.getDialString());*/

    }

    public static class DataAdapter implements RowItem{

        private Customer customer;
        private Contact contact;


        public DataAdapter(Customer customer, Contact contact) {
            this.contact = contact;
            this.customer = customer;
        }

        public DataAdapter() {

        }

        @Override
        public String getCountryCode() {
            String res = "";
            for (Map.Entry<String, String> pair : countries.entrySet()) {
                if (pair.getValue().equals(customer.getCountryName())) {
                    res = pair.getKey();
                }
            }
            return res;
        }

        @Override
        public String getCompany() {
            return customer.getCompanyName();
        }

        @Override
        public String getContactFirstName() {
            return contact.getName().split(", ")[1];
            //return "Ivanov, Ivan".split(", ")[1];
        }

        @Override
        public String getContactLastName() {
            return contact.getName().split(", ")[0];
            //return "Ivanov, Ivan".split(", ")[0];
        }

        @Override
        public String getDialString() {
            return "callto://+" + contact.getPhoneNumber().replaceAll("\\D", "");
            //return "callto://+" + "+38(050)123-45-67".replaceAll("\\D", "");
        }
    }

    public static interface RowItem {
        String getCountryCode();        //For example: UA
        String getCompany();            //For example: JavaRush Ltd.
        String getContactFirstName();   //For example: Ivan
        String getContactLastName();    //For example: Ivanov
        String getDialString();         //For example: callto://+380501234567
    }

    public static interface Customer {
        String getCompanyName();        //For example: JavaRush Ltd.
        String getCountryName();        //For example: Ukraine
    }

    public static interface Contact {
        String getName();               //For example: Ivanov, Ivan
        String getPhoneNumber();        //For example: +38(050)123-45-67 or +3(805)0123-4567 or +380(50)123-4567 or ...
    }
}