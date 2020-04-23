package ley.anvil.api.energy.common;

import ley.anvil.api.energy.CommonType;
import ley.anvil.api.energy.IEnergy;
import ley.anvil.api.energy.IEnergyType;

public interface IElectrical extends IEnergy {

    int getVoltage();

    long insertCharge(long charge, int voltage);

    int getMaxVoltage();

    @Override
    default IEnergyType getType() {
        return CommonType.ELECTRIC;
    }
}
