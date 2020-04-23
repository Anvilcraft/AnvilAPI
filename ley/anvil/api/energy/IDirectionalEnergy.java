package ley.anvil.api.energy;

import net.minecraft.util.EnumFacing;

public interface IDirectionalEnergy<T extends IEnergy> {

    T getEnergy(EnumFacing side);

}
