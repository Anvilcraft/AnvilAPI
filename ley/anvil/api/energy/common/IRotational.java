package ley.anvil.api.energy.common;

import ley.anvil.api.energy.CommonType;
import ley.anvil.api.energy.IEnergy;
import ley.anvil.api.energy.IEnergyType;

public interface IRotational extends IEnergy {

    int getTorque();

    int getSpeed();

    void applyTorque(int torque);

    void applySpeed(int speed);

    EnumDirection getDirection();

    @Override
    default IEnergyType getType() {
        return CommonType.ROTATION;
    }
}
