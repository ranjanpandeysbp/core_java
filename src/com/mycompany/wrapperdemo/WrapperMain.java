package com.mycompany.wrapperdemo;

public class WrapperMain {
    public static void main(String[] args)
    {
        //Examples of Wrapper classes
        Integer num = 10;
        Integer num2 = new Integer(12345);
        Double salary = 23454.34;
        Double salary2 = new Double(23454.34);
        //Double salary2 = new Double("23454.34");//How this is allowed?
        Float a = 2345.3f;//same as 2345.3F
        Float a2 = new Float(2345.3f);
        Long ln = 235672l;//same as 235672L;
        Long ln2 = new Long(235672l);
        Character c = 'A';
        Character c2 = new Character('A');
        Boolean b = new Boolean(true);

        String roll = "1234";
        Integer r = Integer.parseInt(roll);
        r = Integer.valueOf(roll);
        Double d = Double.parseDouble(roll);
        System.out.println(r);
        System.out.println(d);

        int x = 55;
        Integer y = x;  //Autoboxing
        System.out.println(x);
        System.out.println(y);

        Double d1 = 28.79;
        double z = d1;  //Unboxing
        System.out.println(d1);
        System.out.println(z);
    }
}
