package ley.anvil.api.energy.common;

import ley.anvil.api.energy.CommonType;
import ley.anvil.api.energy.IEnergy;
import ley.anvil.api.energy.IEnergyType;

public interface IHeat extends IEnergy {

    int getTemperature();

    void addTemperature(int temp);

    void removeTemperature(int temp);

    @Override
    default IEnergyType getType() {
        return CommonType.HEAT;
    }
}
