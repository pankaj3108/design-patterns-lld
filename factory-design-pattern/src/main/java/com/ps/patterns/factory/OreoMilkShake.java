package com.ps.patterns.factory;

import com.ps.patterns.factory.constants.MilkShakeType;

class OreoMilkShake implements MilkShake {

    String name;

    public OreoMilkShake() {
        this.name = MilkShakeType.OreoMilkShake.name();
    }
}
