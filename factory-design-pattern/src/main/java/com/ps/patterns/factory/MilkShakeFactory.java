package com.ps.patterns.factory;

import com.ps.patterns.factory.constants.MilkShakeType;

import java.util.HashMap;
import java.util.Map;

class MilkShakeFactory {

    private Map<MilkShakeType, MilkShake> milkShakeMenu;

    public MilkShakeFactory() {
        this.milkShakeMenu = new HashMap<MilkShakeType, MilkShake>();
        buildMilkShakeMenu();
    }

    public void buildMilkShakeMenu() {

        milkShakeMenu.put(MilkShakeType.OreoMilkShake, new OreoMilkShake());
        milkShakeMenu.put(MilkShakeType.ButterSkotchMilkShake, new ButterSkotchMilkShake());
        milkShakeMenu.put(MilkShakeType.VanillaMilkShake, new VanillaMilkShake());

    }

    public MilkShake prepareMilkShake(MilkShakeType milkShakeType) {

        if(milkShakeType == null || !milkShakeMenu.containsKey(milkShakeType))
            return null;

        System.out.println(milkShakeType.name() + " prepared!");

        return milkShakeMenu.get(milkShakeType);

    }
}
