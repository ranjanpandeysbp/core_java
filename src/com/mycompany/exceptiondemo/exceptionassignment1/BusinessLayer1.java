package com.mycompany.exceptiondemo.exceptionassignment1;

public class BusinessLayer1 {
    public String validateVotingAge(int age) throws BusinessException1 {
        if(age<18)
        {
            BusinessException1 be = new BusinessException1("VOTING_INVALID","Voting age should be greater than 18");
            throw be;
        }
        else
        return "Welcome to Vote";
    }
    public String validateMarriageableAge(int age) throws BusinessException1 {
        if(age<21)
        {
            BusinessException1 be = new BusinessException1("MARRIAGE_INVALID","Marriage age should be greater than 21");
            throw be;
        }
        else
            return "Welcome to Marry";
        }
}
