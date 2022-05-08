package com.mycompany.exceptiondemo.exceptionassignment;

public class BusinessLayer {
    public String validateVotingAge(int age) throws BusinessException {
        if(age<18)
        {
            BusinessException be = new BusinessException("VOTING_INVALID","Voting age should be greater than 18");
            throw be;
        }
        else
        return "Welcome to Vote";
    }
    public String validateMarriageableAge(int age) throws BusinessException {
        if(age<21)
        {
            BusinessException be = new BusinessException("MARRIAGE_INVALID","Marriage age should be greater than 21");
            throw be;
        }
        else
            return "Welcome to Marry";
        }
}
