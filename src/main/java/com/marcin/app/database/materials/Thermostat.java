package com.marcin.app.database.materials;

import java.util.HashMap;
import java.util.Map;

public class Thermostat {
    static String thermostat_230V_analog = "68";
    static String thermostat_230V_bimetal = "50";
    static String thermostat_400V_analog = "69";
    static String thermostat_230V_ip44 = "01";
    static String thermostat_230V_ip20 = "02";
    static String thermostat_230V_windows300mm = "76";
    static String thermostat_230V_windows600mm = "75";
    static String thermostat_400V_windows300mm = "72";
    static String thermostat_400V_windows600mm = "73";
    static String thermostat_230V_windows180mm = "63";
    static String thermostat_400V_windows180mm = "64";
    static String thermostat_230V_wifi = "48";
    static String thermostat_400V_wifi = "49";

    public static String findMatchedThermostat(String thermostatModelNumber) {
        Map<String, String> thermostatMap = new HashMap<>();
        thermostatMap.put(thermostat_230V_analog, "termostat analogowy 230V");
        thermostatMap.put(thermostat_230V_bimetal, "termostat bimetaliczny 230V");
        thermostatMap.put(thermostat_400V_analog, "termostat analogowy 400V");
        thermostatMap.put(thermostat_230V_ip44, "termostat ip44 230V");
        thermostatMap.put(thermostat_230V_ip20, "termostat (wtyczka anglik) ip20 230V");
        thermostatMap.put(thermostat_230V_windows300mm, "termostat windows 300mm 230V");
        thermostatMap.put(thermostat_230V_windows600mm, "termostat windows 600mm 230V");
        thermostatMap.put(thermostat_400V_windows300mm, "termostat windows 300mm 400V");
        thermostatMap.put(thermostat_400V_windows600mm, "termostat windows 600mm 400V");
        thermostatMap.put(thermostat_230V_windows180mm, "termostat windows 180mm 230V");
        thermostatMap.put(thermostat_400V_windows180mm, "termostat windows 180mm 400V");
        thermostatMap.put(thermostat_230V_wifi, "termostat wifi 230V");
        thermostatMap.put(thermostat_400V_wifi, "termostat wifi 400V");

        return thermostatMap.get(thermostatModelNumber);
    }
}
