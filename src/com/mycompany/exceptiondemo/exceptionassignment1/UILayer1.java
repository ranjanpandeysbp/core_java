package com.mycompany.exceptiondemo.exceptionassignment1;

public class UILayer1 {

    BusinessLayer1 bl = null;

    public UILayer1() {
        bl = new BusinessLayer1();
    }

    public String validateVotingAge(int age) throws BusinessException1 {
        return bl.validateVotingAge(age);
    }

    public String validateMarriageAge(int age) throws BusinessException1 {
        return bl.validateMarriageableAge(age);
    }
}
