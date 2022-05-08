package com.mycompany.exceptiondemo;

public class J2 extends Exception {

    public static void validate(Float age) throws J3 {
        try{
            J3.checkVotingAge(age);
        }
        catch (J3 j3)
        {
            System.out.println("As you are less than "+J3.VOTING_AGE+" yrs, you can't vote");
        }
        catch (Exception e)
        {
            System.out.println("Something wrong occurred"+e);
        }
        J3.checkMarriageableAge(age);
    }
}
