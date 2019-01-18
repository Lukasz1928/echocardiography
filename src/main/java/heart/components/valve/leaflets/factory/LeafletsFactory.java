package heart.components.valve.leaflets.factory;

import heart.components.valve.leaflets.LeafletsType;
import heart.components.valve.leaflets.leaflets.AorticValveLeaflets;
import heart.components.valve.leaflets.leaflets.MitralValveLeaflets;
import heart.components.valve.leaflets.leaflets.PulmonaryValveLeaflets;
import heart.components.valve.leaflets.leaflets.TricuspidValveLeaflets;

public class LeafletsFactory {

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
