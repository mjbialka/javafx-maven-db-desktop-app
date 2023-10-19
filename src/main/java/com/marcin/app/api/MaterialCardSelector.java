package com.marcin.app.api;

import java.util.HashMap;
import java.util.Map;

public class MaterialCardSelector {
    static String series1315and1317 = "Seria 1315-1317 nowe.xlsx";
    static String series1380 = "Seria 1380 nowe.xlsx";
    static String series1440 = "Seria 1440 nowe.xlsx";
    static String series1450 = "Seria 1450 nowe.xlsx";
    static String series1460 = "Seria 1460 nowe.xlsx";
    static String series1470 = "Seria 1470 nowe.xlsx";
    static String series1480 = "Seria 1480 nowe.xlsx";
    static String series1490 = "Seria 1490 nowe.xlsx";

    public static String getExcelFilePath(String searchHeater) {
        String basePath = "C:\\GUI\\ElpeDataBase\\src\\main\\resources\\Karty materiałowowe GKP\\";

        Map<String, String> sheetMappings = new HashMap<>();

        sheetMappings.put("1315.100", series1315and1317);
        sheetMappings.put("1317.000", series1315and1317);

        sheetMappings.put("1380.000", series1380);
        sheetMappings.put("1381.000", series1380);
        sheetMappings.put("1382.000", series1380);
        sheetMappings.put("1383.000", series1380);
        sheetMappings.put("1384.000", series1380);
        sheetMappings.put("1386.000", series1380);
        sheetMappings.put("1387.000", series1380);

        sheetMappings.put("1440.000", series1440);
        sheetMappings.put("1441.000", series1440);
        sheetMappings.put("1442.000", series1440);
        sheetMappings.put("1443.000", series1440);
        sheetMappings.put("1444.000", series1440);
        sheetMappings.put("1446.000", series1440);
        sheetMappings.put("1447.000", series1440);

        sheetMappings.put("1450.000", series1450);
        sheetMappings.put("1451.000", series1450);
        sheetMappings.put("1452.000", series1450);
        sheetMappings.put("1453.000", series1450);
        sheetMappings.put("1454.000", series1450);
        sheetMappings.put("1456.000", series1450);
        sheetMappings.put("1457.000", series1450);

        sheetMappings.put("1460.000", series1460);
        sheetMappings.put("1461.000", series1460);
        sheetMappings.put("1462.000", series1460);
        sheetMappings.put("1463.000", series1460);
        sheetMappings.put("1464.000", series1460);
        sheetMappings.put("1466.000", series1460);
        sheetMappings.put("1467.000", series1460);

        sheetMappings.put("1470.000", series1470);
        sheetMappings.put("1471.000", series1470);
        sheetMappings.put("1472.000", series1470);
        sheetMappings.put("1473.000", series1470);
        sheetMappings.put("1474.000", series1470);
        sheetMappings.put("1476.000", series1470);
        sheetMappings.put("1477.000", series1470);

        sheetMappings.put("1480.000", series1480);
        sheetMappings.put("1481.000", series1480);
        sheetMappings.put("1482.000", series1480);
        sheetMappings.put("1483.000", series1480);
        sheetMappings.put("1484.000", series1480);
        sheetMappings.put("1486.000", series1480);
        sheetMappings.put("1487.000", series1480);


        sheetMappings.put("1490.000", series1490);
        sheetMappings.put("1491.000", series1490);
        sheetMappings.put("1492.000", series1490);
        sheetMappings.put("1493.000", series1490);
        sheetMappings.put("1494.000", series1490);
        sheetMappings.put("1496.000", series1490);
        sheetMappings.put("1497.000", series1490);


        if (sheetMappings.containsKey(searchHeater)) {
            String sheetName = sheetMappings.get(searchHeater);
            return basePath + sheetName;
        } else {

            return "";
        }
    }
}
