package heart.valve.leaflets;

import heart.valve.leaflets.leaflets.AorticValveLeaflets;
import heart.valve.leaflets.leaflets.MitralValveLeaflets;
import heart.valve.leaflets.leaflets.PulmonaryValveLeaflets;
import heart.valve.leaflets.leaflets.TriscupidValveLeaflets;

public class LeafletsFactory {

    public static LeafletsType getLeaflets(String valve, String type) throws NoSuchValveException {
        if(valve.equalsIgnoreCase("aortic")) {
            return AorticValveLeaflets.valueOf(type.toUpperCase());
        }
        if(valve.equalsIgnoreCase("mitral")) {
            return MitralValveLeaflets.valueOf(type.toUpperCase());
        }
        if(valve.equalsIgnoreCase("pulmonary")) {
            return PulmonaryValveLeaflets.valueOf(type.toUpperCase());
        }
        if(valve.equalsIgnoreCase("triscupid")) {
            return TriscupidValveLeaflets.valueOf(type.toUpperCase());
        }
        throw new NoSuchValveException();
    }
}
