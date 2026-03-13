package org.apache.tika.utils;

import org.apache.tika.metadata.MachineMetadata;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public class SystemUtils {
    public static final boolean IS_OS_AIX;
    public static final boolean IS_OS_HP_UX;
    public static final boolean IS_OS_IRIX;
    public static final boolean IS_OS_LINUX;
    public static final boolean IS_OS_MAC;
    public static final boolean IS_OS_MAC_OSX;
    public static final boolean IS_OS_OS2;
    public static final boolean IS_OS_SOLARIS;
    public static final boolean IS_OS_SUN_OS;
    public static final boolean IS_OS_UNIX;
    public static final boolean IS_OS_VERSION_WSL;
    public static final boolean IS_OS_WINDOWS;
    private static final String OS_NAME_WINDOWS_PREFIX = "Windows";
    private static final String OS_VERSION_WSL = "WSL";
    public static final String OS_NAME = getSystemProperty("os.name");
    public static final String OS_VERSION = getSystemProperty("os.version");

    static {
        boolean oSMatchesName = getOSMatchesName(MachineMetadata.PLATFORM_AIX);
        IS_OS_AIX = oSMatchesName;
        boolean oSMatchesName2 = getOSMatchesName(MachineMetadata.PLATFORM_HPUX);
        IS_OS_HP_UX = oSMatchesName2;
        boolean oSMatchesName3 = getOSMatchesName("Irix");
        IS_OS_IRIX = oSMatchesName3;
        boolean z10 = true;
        boolean z11 = getOSMatchesName(MachineMetadata.PLATFORM_LINUX) || getOSMatchesName("LINUX");
        IS_OS_LINUX = z11;
        IS_OS_MAC = getOSMatchesName("Mac");
        boolean oSMatchesName4 = getOSMatchesName("Mac OS X");
        IS_OS_MAC_OSX = oSMatchesName4;
        IS_OS_OS2 = getOSMatchesName("OS/2");
        boolean oSMatchesName5 = getOSMatchesName(MachineMetadata.PLATFORM_SOLARIS);
        IS_OS_SOLARIS = oSMatchesName5;
        boolean oSMatchesName6 = getOSMatchesName("SunOS");
        IS_OS_SUN_OS = oSMatchesName6;
        if (!oSMatchesName && !oSMatchesName2 && !oSMatchesName3 && !z11 && !oSMatchesName4 && !oSMatchesName5 && !oSMatchesName6) {
            z10 = false;
        }
        IS_OS_UNIX = z10;
        IS_OS_WINDOWS = getOSMatchesName("Windows");
        IS_OS_VERSION_WSL = getOSContainsVersion(OS_VERSION_WSL);
    }

    public static boolean doesOSVersionContain(String str, String str2) {
        return str != null && str.contains(str2);
    }

    private static boolean getOSContainsVersion(String str) {
        return doesOSVersionContain(OS_VERSION, str);
    }

    private static boolean getOSMatchesName(String str) {
        return isOSNameMatch(OS_NAME, str);
    }

    private static String getSystemProperty(String str) {
        try {
            return System.getProperty(str);
        } catch (SecurityException unused) {
            return null;
        }
    }

    public static boolean isOSNameMatch(String str, String str2) {
        return str != null && str.startsWith(str2);
    }
}
