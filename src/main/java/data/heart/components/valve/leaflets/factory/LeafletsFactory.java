package data.heart.components.valve.leaflets.factory;

import data.heart.components.valve.leaflets.LeafletsType;
import data.heart.components.valve.leaflets.leaflets.AorticValveLeaflets;
import data.heart.components.valve.leaflets.leaflets.MitralValveLeaflets;
import data.heart.components.valve.leaflets.leaflets.PulmonaryValveLeaflets;
import data.heart.components.valve.leaflets.leaflets.TricuspidValveLeaflets;

public class LeafletsFactory {

    private LeafletsFactory() {
        //there's no reason to instantiate this class
    }

    public static LeafletsType getLeaflets(String valve, String type) throws NoSuchValveException, NoSuchLeafletsTypeException {
        if(valve == null) {
            throw new NoSuchValveException();
        }
        if(type == null) {
            throw new NoSuchLeafletsTypeException();
        }
        try {
            if(valve.equalsIgnoreCase("aortic")) {
                return AorticValveLeaflets.valueOf(type.toUpperCase());
            }
            if(valve.equalsIgnoreCase("mitral")) {
                return MitralValveLeaflets.valueOf(type.toUpperCase());
            }
            if(valve.equalsIgnoreCase("pulmonary")) {
                return PulmonaryValveLeaflets.valueOf(type.toUpperCase());
            }
            if(valve.equalsIgnoreCase("tricuspid")) {
                return TricuspidValveLeaflets.valueOf(type.toUpperCase());
            }
        }
        catch(IllegalArgumentException e) {
            throw new NoSuchLeafletsTypeException();
        }
        throw new NoSuchValveException();
    }
}
