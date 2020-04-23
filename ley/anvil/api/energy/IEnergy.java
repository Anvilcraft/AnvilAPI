package ley.anvil.api.energy;

import net.minecraft.util.EnumFacing;
import net.minecraftforge.energy.IEnergyStorage;

import javax.annotation.Nullable;

public interface IEnergy /*Forge Specific*/extends IEnergyStorage {

    IEnergyType getType();

    default IEnergyType[] getTypes() {
        return new IEnergyType[] {getType()};
    }

    long getCapacity();

    long getStored();

    void setStored(long energy);

    long getOutputPower(IEnergyType type);

    long getInputPower(IEnergyType type);

    long insertEnergy(long energy, IEnergyType type, boolean simulate);

    long extractEnergy(long energy, IEnergyType type, boolean simulate);

    boolean canInput(IEnergyType type);

    boolean canOutput(IEnergyType type);

    @Deprecated
    default long getOutputPower(IEnergyType type, @Nullable EnumFacing to) {return getOutputPower(type);}
    @Deprecated
    default long getInputPower(IEnergyType type, @Nullable EnumFacing to) {return getInputPower(type);}
    @Deprecated
    default long insertEnergy(long energy, IEnergyType type, @Nullable EnumFacing from, boolean simulate) {return insertEnergy(energy,type, simulate);}
    @Deprecated
    default long extractEnergy(long energy, IEnergyType type, @Nullable EnumFacing from, boolean simulate) {return extractEnergy(energy, type, simulate);}
    @Deprecated
    default boolean canInput(IEnergyType type, @Nullable EnumFacing from) {return canInput(type);}
    @Deprecated
    default boolean canOutput(IEnergyType type, @Nullable EnumFacing to) {return canOutput(type);}

    //Forge Specific

    @Override
    default int receiveEnergy(int maxReceive, boolean simulate) {
        return (int) insertEnergy(maxReceive, CommonType.FLUX, simulate);
    }

    @Override
    default int extractEnergy(int maxExtract, boolean simulate) {
        return (int) extractEnergy(maxExtract, CommonType.FLUX, simulate);
    }

    @Override
    default int getEnergyStored() {
        return (int) getStored();
    }

    @Override
    default int getMaxEnergyStored() {
        return (int) getCapacity();
    }

    @Override
    default boolean canExtract() {
        return canOutput(CommonType.FLUX);
    }

    @Override
    default boolean canReceive() {
        return canInput(CommonType.FLUX);
    }
}
