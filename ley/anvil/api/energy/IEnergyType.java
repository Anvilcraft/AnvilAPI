package ley.anvil.api.energy;

public interface IEnergyType {

    String getID();

    default boolean equals(IEnergyType o) {
        return getID().equals(o.getID());
    }

    default Class<? extends IEnergy> getInterface() {
        return IEnergy.class;
    }
    
}
