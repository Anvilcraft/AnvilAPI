package ley.anvil.api.energy;

import ley.anvil.api.energy.common.IElectrical;
import ley.anvil.api.energy.common.IHeat;
import ley.anvil.api.energy.common.IRotational;

public enum CommonType implements IEnergyType {
    FLUX {
        @Override
        public String getID() {
            return "flux";
        }
    },
    ELECTRIC {
        @Override
        public String getID() {
            return "electric";
        }

        @Override
        public Class<? extends IEnergy> getInterface() {
            return IElectrical.class;
        }
    },
    HEAT {
        @Override
        public String getID() {
            return "heat";
        }

        @Override
        public Class<? extends IEnergy> getInterface() {
            return IHeat.class;
        }
    },
    ROTATION {
        @Override
        public String getID() {
            return "rotation";
        }

        @Override
        public Class<? extends IEnergy> getInterface() {
            return IRotational.class;
        }
    },
    MANA {
        @Override
        public String getID() {
            return "mana";
        }
    };





}
