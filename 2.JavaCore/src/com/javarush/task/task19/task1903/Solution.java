package com.javarush.task.task19.task1903;

/* 
1. Класс Solution должен содержать public static поле countries типа Map.
2. В статическом блоке класса Solution инициализируй поле countries тестовыми данными согласно заданию.
3. Класс IncomeDataAdapter должен реализовывать интерфейсы Customer и Contact.
4. Класс IncomeDataAdapter должен содержать приватное поле data типа IncomeData.
5. Класс IncomeDataAdapter должен содержать конструктор с параметром IncomeData.
6. В классе IncomeDataAdapter реализуй методы интерфейсов Customer и Contact используя подсказки в виде комментариев в интерфейсах.
*/

import java.util.HashMap;
import java.util.Map;

public class Solution {
    public static Map<String, String> countries = new HashMap<String, String>();
    static{
        countries.put("UA", "Ukraine");
        countries.put("RU", "Russia");
        countries.put("CA", "Canada");
    }

    public static void main(String[] args) {

    }

    public static class IncomeDataAdapter implements Customer, Contact{
        private IncomeData data;
        IncomeDataAdapter(IncomeData data){
            this.data = data;
        }
        @Override
        public String getCompanyName(){
            return data.getCompany();
        }
        @Override
        public String getCountryName(){
            return countries.get(data.getCountryCode());
        }
        @Override
        public String getName(){
            return data.getContactLastName()+", "+data.getContactFirstName();
        }
        @Override
        public String getPhoneNumber(){
            String  countryCode = '+'+String.valueOf(data.getCountryPhoneCode()),
                    phoneNumber = String.valueOf(data.getPhoneNumber());
            StringBuffer stringBufferPhoneNumber = new StringBuffer(phoneNumber.subSequence(0,phoneNumber.length()));
            while (stringBufferPhoneNumber.length()<10){
                stringBufferPhoneNumber.insert(0,'0');
            }
            stringBufferPhoneNumber = stringBufferPhoneNumber.insert(0,'(');
            stringBufferPhoneNumber = stringBufferPhoneNumber.insert(4,')');
            stringBufferPhoneNumber = stringBufferPhoneNumber.insert(8,'-');
            stringBufferPhoneNumber = stringBufferPhoneNumber.insert(11,'-');
            phoneNumber = stringBufferPhoneNumber.toString();

            return countryCode + phoneNumber;
        }
    }
    public static interface IncomeData {
        String getCountryCode();        //example UA
        String getCompany();            //example JavaRush Ltd.
        String getContactFirstName();   //example Ivan
        String getContactLastName();    //example Ivanov
        int getCountryPhoneCode();      //example 38
        int getPhoneNumber();           //example 501234567
    }

    public static interface Customer {
        String getCompanyName();        //example JavaRush Ltd.
        String getCountryName();        //example Ukraine
    }

    public static interface Contact {
        String getName();               //example Ivanov, Ivan
        String getPhoneNumber();        //example +38(050)123-45-67
    }
}