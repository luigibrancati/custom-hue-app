package com.google.android.gms.internal.mlkit_vision_barcode_bundled;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field 'zzc' uses external variables
	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:451)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByRegister(EnumVisitor.java:395)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:324)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:262)
	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:151)
	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:100)
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public final class D2 {
    public static final D2 zza;
    public static final D2 zzb;
    public static final D2 zzc;
    public static final D2 zzd;
    public static final D2 zze;
    public static final D2 zzf;
    public static final D2 zzg;
    public static final D2 zzh;
    public static final D2 zzi;
    public static final D2 zzj;
    public static final D2 zzk;
    public static final D2 zzl;
    public static final D2 zzm;
    public static final D2 zzn;
    public static final D2 zzo;
    public static final D2 zzp;
    public static final D2 zzq;
    public static final D2 zzr;
    private static final /* synthetic */ D2[] zzs;
    private final E2 zzt;

    static {
        D2 d22 = new D2("DOUBLE", 0, E2.DOUBLE, 1);
        zza = d22;
        D2 d23 = new D2("FLOAT", 1, E2.FLOAT, 5);
        zzb = d23;
        E2 e22 = E2.LONG;
        D2 d24 = new D2("INT64", 2, e22, 0);
        zzc = d24;
        D2 d25 = new D2("UINT64", 3, e22, 0);
        zzd = d25;
        E2 e23 = E2.INT;
        D2 d26 = new D2("INT32", 4, e23, 0);
        zze = d26;
        D2 d27 = new D2("FIXED64", 5, e22, 1);
        zzf = d27;
        D2 d28 = new D2("FIXED32", 6, e23, 5);
        zzg = d28;
        D2 d29 = new D2("BOOL", 7, E2.BOOLEAN, 0);
        zzh = d29;
        D2 d210 = new D2("STRING", 8, E2.STRING, 2);
        zzi = d210;
        E2 e24 = E2.MESSAGE;
        D2 d211 = new D2("GROUP", 9, e24, 3);
        zzj = d211;
        D2 d212 = new D2("MESSAGE", 10, e24, 2);
        zzk = d212;
        D2 d213 = new D2("BYTES", 11, E2.BYTE_STRING, 2);
        zzl = d213;
        D2 d214 = new D2("UINT32", 12, e23, 0);
        zzm = d214;
        D2 d215 = new D2("ENUM", 13, E2.ENUM, 0);
        zzn = d215;
        D2 d216 = new D2("SFIXED32", 14, e23, 5);
        zzo = d216;
        D2 d217 = new D2("SFIXED64", 15, e22, 1);
        zzp = d217;
        D2 d218 = new D2("SINT32", 16, e23, 0);
        zzq = d218;
        D2 d219 = new D2("SINT64", 17, e22, 0);
        zzr = d219;
        zzs = new D2[]{d22, d23, d24, d25, d26, d27, d28, d29, d210, d211, d212, d213, d214, d215, d216, d217, d218, d219};
    }

    public D2(String str, int i10, E2 e22, int i11) {
        this.zzt = e22;
    }

    public static D2[] values() {
        return (D2[]) zzs.clone();
    }

    public final E2 a() {
        return this.zzt;
    }
}
