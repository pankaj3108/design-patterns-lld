package com.ps.patterns.factory;

import com.ps.patterns.factory.constants.MilkShakeType;

class ButterSkotchMilkShake implements MilkShake {

    String name;

    public ButterSkotchMilkShake() {
        this.name = MilkShakeType.ButterSkotchMilkShake.name();
    }
}
