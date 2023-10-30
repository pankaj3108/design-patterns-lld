package com.ps.patterns.factory;

import com.ps.patterns.factory.constants.MilkShakeType;

public class PSCafe {

    public static void main(String[] args) {

        MilkShakeFactory milkShakeFactory = new MilkShakeFactory();

        OreoMilkShake oreoMilkShake = (OreoMilkShake) milkShakeFactory.prepareMilkShake(MilkShakeType.OreoMilkShake);


    }
}
