package va;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public abstract class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Map f45906a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Map f45907b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Map f45908c;

    static {
        HashMap map = new HashMap();
        map.put("1811", "Alert Notification Service");
        map.put("180F", "Battery Service");
        map.put("1810", "Blood Pressure");
        map.put("181B", "Body Composition");
        map.put("181E", "Bond Management");
        map.put("181F", "Continuous Glucose Monitoring");
        map.put("1805", "Current Time Service");
        map.put("1818", "Cycling Power");
        map.put("1816", "Cycling Speed and Cadence");
        map.put("180A", "Device Information");
        map.put("181A", "Environmental Sensing");
        map.put("1800", "Generic Access");
        map.put("1801", "Generic Attribute");
        map.put("1808", "Glucose");
        map.put("1809", "Health Thermometer");
        map.put("180D", "Heart Rate");
        map.put("1812", "Human Interface Device");
        map.put("1802", "Immediate Alert");
        map.put("1803", "Link Loss");
        map.put("1819", "Location and Navigation");
        map.put("1820", "Internet Protocol Support");
        map.put("1807", "Next DST Change Service");
        map.put("180E", "Phone Alert Status Service");
        map.put("1806", "Reference Time Update Service");
        map.put("1814", "Running Speed and Cadence");
        map.put("1813", "Scan Parameters");
        map.put("1804", "Tx Power");
        map.put("181C", "User Data");
        map.put("181D", "Weight Scale");
        map.put("1815", "Automation IO");
        map.put("1802", "Immediate Alert Service 1.1");
        f45906a = Collections.unmodifiableMap(map);
        HashMap map2 = new HashMap();
        map2.put("2A7E", "Aerobic Heart Rate Lower Limit");
        map2.put("2A84", "Aerobic Heart Rate Upper Limit");
        map2.put("2A7F", "Aerobic Threshold");
        map2.put("2A80", "Age");
        map2.put("2A43", "Alert Category ID");
        map2.put("2A42", "Alert Category ID Bit Mask");
        map2.put("2A06", "Alert Level");
        map2.put("2A44", "Alert Notification Control Point");
        map2.put("2A3F", "Alert Status");
        map2.put("2A81", "Anaerobic Heart Rate Lower Limit");
        map2.put("2A82", "Anaerobic Heart Rate Upper Limit");
        map2.put("2A83", "Anaerobic Threshold");
        map2.put("2A73", "Apparent Wind Direction");
        map2.put("2A72", "Apparent Wind Speed");
        map2.put("2A01", "Appearance");
        map2.put("2AA3", "Barometric Pressure Trend");
        map2.put("2A19", "Battery Level");
        map2.put("2A49", "Blood Pressure Feature");
        map2.put("2A35", "Blood Pressure Measurement");
        map2.put("2A9B", "Body Composition Feature");
        map2.put("2A9C", "Body Composition Measurement");
        map2.put("2A38", "Body Sensor Location");
        map2.put("2AA4", "Bond Management Control Point");
        map2.put("2AA5", "Bond Management Feature");
        map2.put("2A22", "Boot Keyboard Input Report");
        map2.put("2A32", "Boot Keyboard Output Report");
        map2.put("2A33", "Boot Mouse Input Report");
        map2.put("2AA6", "Central Address Resolution");
        map2.put("2AA8", "CGM Feature");
        map2.put("2AA7", "CGM Measurement");
        map2.put("2AAB", "CGM Session Run Time");
        map2.put("2AAA", "CGM Session Start Time");
        map2.put("2AAC", "CGM Specific Ops Control Point");
        map2.put("2AA9", "CGM Status");
        map2.put("2A5C", "CSC Feature");
        map2.put("2A5B", "CSC Measurement");
        map2.put("2A2B", "Current Time");
        map2.put("2A66", "Cycling Power Control Point");
        map2.put("2A65", "Cycling Power Feature");
        map2.put("2A63", "Cycling Power Measurement");
        map2.put("2A64", "Cycling Power Vector");
        map2.put("2A99", "Database Change Increment");
        map2.put("2A85", "Date of Birth");
        map2.put("2A86", "Date of Threshold Assessment ");
        map2.put("2A08", "Date Time");
        map2.put("2A0A", "Day Date Time");
        map2.put("2A09", "Day of Week");
        map2.put("2A7D", "Descriptor Value Changed");
        map2.put("2A00", "Device Name");
        map2.put("2A7B", "Dew Point");
        map2.put("2A0D", "DST Offset");
        map2.put("2A6C", "Elevation");
        map2.put("2A87", "Email Address");
        map2.put("2A0C", "Exact Time 256");
        map2.put("2A88", "Fat Burn Heart Rate Lower Limit");
        map2.put("2A89", "Fat Burn Heart Rate Upper Limit");
        map2.put("2A26", "Firmware Revision String");
        map2.put("2A8A", "First Name");
        map2.put("2A8B", "Five Zone Heart Rate Limits");
        map2.put("2A8C", "Gender");
        map2.put("2A51", "Glucose Feature");
        map2.put("2A18", "Glucose Measurement");
        map2.put("2A34", "Glucose Measurement Context");
        map2.put("2A74", "Gust Factor");
        map2.put("2A27", "Hardware Revision String");
        map2.put("2A39", "Heart Rate Control Point");
        map2.put("2A8D", "Heart Rate Max");
        map2.put("2A37", "Heart Rate Measurement");
        map2.put("2A7A", "Heat Index");
        map2.put("2A8E", "Height");
        map2.put("2A4C", "HID Control Point");
        map2.put("2A4A", "HID Information");
        map2.put("2A8F", "Hip Circumference");
        map2.put("2A6F", "Humidity");
        map2.put("2A2A", "IEEE 11073-20601 Regulatory Certification Data List");
        map2.put("2A36", "Intermediate Cuff Pressure");
        map2.put("2A1E", "Intermediate Temperature");
        map2.put("2A77", "Irradiance");
        map2.put("2AA2", "Language");
        map2.put("2A90", "Last Name");
        map2.put("2A6B", "LN Control Point");
        map2.put("2A6A", "LN Feature");
        map2.put("2A0F", "Local Time Information");
        map2.put("2A67", "Location and Speed");
        map2.put("2A2C", "Magnetic Declination");
        map2.put("2AA0", "Magnetic Flux Density - 2D");
        map2.put("2AA1", "Magnetic Flux Density - 3D");
        map2.put("2A29", "Manufacturer Name String");
        map2.put("2A91", "Maximum Recommended Heart Rate");
        map2.put("2A21", "Measurement Interval");
        map2.put("2A24", "Model Number String");
        map2.put("2A68", "Navigation");
        map2.put("2A46", "New Alert");
        map2.put("2A04", "Peripheral Preferred Connection Parameters");
        map2.put("2A02", "Peripheral Privacy Flag");
        map2.put("2A50", "PnP ID");
        map2.put("2A75", "Pollen Concentration");
        map2.put("2A69", "Position Quality");
        map2.put("2A6D", "Pressure");
        map2.put("2A4E", "Protocol Mode");
        map2.put("2A78", "Rainfall");
        map2.put("2A03", "Reconnection Address");
        map2.put("2A52", "Record Access Control Point");
        map2.put("2A14", "Reference Time Information");
        map2.put("2A4D", "Report");
        map2.put("2A4B", "Report Map");
        map2.put("2A92", "Resting Heart Rate");
        map2.put("2A40", "Ringer Control Point");
        map2.put("2A41", "Ringer Setting");
        map2.put("2A54", "RSC Feature");
        map2.put("2A53", "RSC Measurement");
        map2.put("2A55", "SC Control Point");
        map2.put("2A4F", "Scan Interval Window");
        map2.put("2A31", "Scan Refresh");
        map2.put("2A5D", "Sensor Location");
        map2.put("2A25", "Serial Number String");
        map2.put("2A05", "Service Changed");
        map2.put("2A28", "Software Revision String");
        map2.put("2A93", "Sport Type for Aerobic and Anaerobic Thresholds");
        map2.put("2A47", "Supported New Alert Category");
        map2.put("2A48", "Supported Unread Alert Category");
        map2.put("2A23", "System ID");
        map2.put("2A6E", "Temperature");
        map2.put("2A1C", "Temperature Measurement");
        map2.put("2A1D", "Temperature Type");
        map2.put("2A94", "Three Zone Heart Rate Limits");
        map2.put("2A12", "Time Accuracy");
        map2.put("2A13", "Time Source");
        map2.put("2A16", "Time Update Control Point");
        map2.put("2A17", "Time Update State");
        map2.put("2A11", "Time with DST");
        map2.put("2A0E", "Time Zone");
        map2.put("2A71", "True Wind Direction");
        map2.put("2A70", "True Wind Speed");
        map2.put("2A95", "Two Zone Heart Rate Limit");
        map2.put("2A07", "Tx Power Level");
        map2.put("2A45", "Unread Alert Status");
        map2.put("2A9F", "User Control Point");
        map2.put("2A9A", "User Index");
        map2.put("2A76", "UV Index");
        map2.put("2A96", "VO2 Max");
        map2.put("2A97", "Waist Circumference");
        map2.put("2A98", "Weight");
        map2.put("2A9D", "Weight Measurement");
        map2.put("2A9E", "Weight Scale Feature");
        map2.put("2A79", "Wind Chill");
        map2.put("2A5A", "Aggregate");
        map2.put("2A58", "Analog");
        map2.put("2A56", "Digital");
        f45907b = Collections.unmodifiableMap(map2);
        HashMap map3 = new HashMap();
        map3.put("2900", "Characteristic Extended Properties");
        map3.put("2901", "Characteristic User Description");
        map3.put("2902", "Client Characteristic Configuration");
        map3.put("2903", "Server Characteristic Configuration");
        map3.put("2904", "Characteristic Presentation Format");
        map3.put("2905", "Characteristic Aggregate Format");
        map3.put("2906", "Valid Range");
        map3.put("2907", "External Report Reference");
        map3.put("2908", "Report Reference");
        map3.put("290B", "Environmental Sensing Configuration");
        map3.put("290C", "Environmental Sensing Measurement");
        map3.put("290D", "Environmental Sensing Trigger Setting");
        map3.put("2909", "Number of Digitals");
        map3.put("290A", "Value Trigger Setting");
        map3.put("290E", "Time Trigger Setting");
        f45908c = Collections.unmodifiableMap(map3);
    }

    public static String a(UUID uuid) {
        String strD = d(uuid);
        if (strD != null) {
            return (String) f45907b.get(strD);
        }
        return null;
    }

    public static String b(UUID uuid) {
        String strD = d(uuid);
        if (strD != null) {
            return (String) f45908c.get(strD);
        }
        return null;
    }

    public static String c(UUID uuid) {
        String strD = d(uuid);
        if (strD != null) {
            return (String) f45906a.get(strD);
        }
        return null;
    }

    public static String d(UUID uuid) {
        String upperCase = uuid.toString().toUpperCase();
        if (e(upperCase)) {
            return upperCase.substring(4, 8);
        }
        return null;
    }

    public static boolean e(String str) {
        return str.startsWith("0000") && str.endsWith("-0000-1000-8000-00805F9B34FB");
    }
}
