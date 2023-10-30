package com.ps.patterns.factory;

import com.ps.patterns.factory.constants.MilkShakeType;

class VanillaMilkShake implements MilkShake {

    String name;

    public VanillaMilkShake() {
        this.name = MilkShakeType.VanillaMilkShake.name();
    }
}
