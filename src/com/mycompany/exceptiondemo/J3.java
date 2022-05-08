package com.mycompany.exceptiondemo;

public class J3 extends Exception {
    static final Float VOTING_AGE = 18.0F;
    static final Float MARRIAGE_AGE = 21.0F;
    public static void checkVotingAge(Float age) throws J3
    {
        if (age < VOTING_AGE) {
            J3 j3 = new J3();
            throw j3;
        } else {
            System.out.println("As you are more than " + VOTING_AGE + " yrs, you can vote");
        }
    }
    public static void checkMarriageableAge(Float age) throws J3
    {
        if(age<MARRIAGE_AGE)
        {
            J3 j3 = new J3();
            throw j3;
        }
        else
        {
            System.out.println("As you are more than "+MARRIAGE_AGE+" yrs, you can marry");
        }
    }
}
