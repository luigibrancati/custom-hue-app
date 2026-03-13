package org.apache.tika.metadata;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public interface MachineMetadata {
    public static final String MACHINE_ARM = "ARM";
    public static final String MACHINE_UNKNOWN = "Unknown";
    public static final String PLATFORM_ARM = "ARM";
    public static final String PREFIX = "machine:";
    public static final Property ARCHITECTURE_BITS = Property.internalClosedChoise("machine:architectureBits", "8", "16", "32", "64");
    public static final String PLATFORM_SYSV = "System V";
    public static final String PLATFORM_HPUX = "HP-UX";
    public static final String PLATFORM_NETBSD = "NetBSD";
    public static final String PLATFORM_LINUX = "Linux";
    public static final String PLATFORM_SOLARIS = "Solaris";
    public static final String PLATFORM_AIX = "AIX";
    public static final String PLATFORM_IRIX = "IRIX";
    public static final String PLATFORM_FREEBSD = "FreeBSD";
    public static final String PLATFORM_TRU64 = "Tru64";
    public static final String PLATFORM_EMBEDDED = "Embedded";
    public static final String PLATFORM_WINDOWS = "Windows";
    public static final Property PLATFORM = Property.internalClosedChoise("machine:platform", PLATFORM_SYSV, PLATFORM_HPUX, PLATFORM_NETBSD, PLATFORM_LINUX, PLATFORM_SOLARIS, PLATFORM_AIX, PLATFORM_IRIX, PLATFORM_FREEBSD, PLATFORM_TRU64, "ARM", PLATFORM_EMBEDDED, PLATFORM_WINDOWS);
    public static final String MACHINE_x86_32 = "x86-32";
    public static final String MACHINE_x86_64 = "x86-64";
    public static final String MACHINE_IA_64 = "IA-64";
    public static final String MACHINE_SPARC = "SPARC";
    public static final String MACHINE_M68K = "Motorola-68000";
    public static final String MACHINE_M88K = "Motorola-88000";
    public static final String MACHINE_MIPS = "MIPS";
    public static final String MACHINE_PPC = "PPC";
    public static final String MACHINE_S370 = "S370";
    public static final String MACHINE_S390 = "S390";
    public static final String MACHINE_VAX = "Vax";
    public static final String MACHINE_ALPHA = "Alpha";
    public static final String MACHINE_EFI = "EFI";
    public static final String MACHINE_M32R = "M32R";
    public static final String MACHINE_SH3 = "SH3";
    public static final String MACHINE_SH4 = "SH4";
    public static final String MACHINE_SH5 = "SH5";
    public static final Property MACHINE_TYPE = Property.internalClosedChoise("machine:machineType", MACHINE_x86_32, MACHINE_x86_64, MACHINE_IA_64, MACHINE_SPARC, MACHINE_M68K, MACHINE_M88K, MACHINE_MIPS, MACHINE_PPC, MACHINE_S370, MACHINE_S390, "ARM", MACHINE_VAX, MACHINE_ALPHA, MACHINE_EFI, MACHINE_M32R, MACHINE_SH3, MACHINE_SH4, MACHINE_SH5, "Unknown");
    public static final Property ENDIAN = Property.internalClosedChoise("machine:endian", Endian.LITTLE.name, Endian.BIG.name);

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class Endian {
        private final boolean msb;
        private final String name;
        public static final Endian LITTLE = new Endian("Little", false);
        public static final Endian BIG = new Endian("Big", true);

        private Endian(String str, boolean z10) {
            this.name = str;
            this.msb = z10;
        }

        public String getMSB() {
            return this.msb ? "MSB" : "LSB";
        }

        public String getName() {
            return this.name;
        }

        public boolean isMSB() {
            return this.msb;
        }
    }
}
