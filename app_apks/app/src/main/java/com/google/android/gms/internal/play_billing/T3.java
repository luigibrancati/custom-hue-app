package com.google.android.gms.internal.play_billing;

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
public final class T3 {
    public static final T3 zza;
    public static final T3 zzb;
    public static final T3 zzc;
    public static final T3 zzd;
    public static final T3 zze;
    public static final T3 zzf;
    public static final T3 zzg;
    public static final T3 zzh;
    public static final T3 zzi;
    public static final T3 zzj;
    public static final T3 zzk;
    public static final T3 zzl;
    public static final T3 zzm;
    public static final T3 zzn;
    public static final T3 zzo;
    public static final T3 zzp;
    public static final T3 zzq;
    public static final T3 zzr;
    private static final /* synthetic */ T3[] zzs;
    private final U3 zzt;

    static {
        T3 t32 = new T3("DOUBLE", 0, U3.DOUBLE, 1);
        zza = t32;
        T3 t33 = new T3("FLOAT", 1, U3.FLOAT, 5);
        zzb = t33;
        U3 u32 = U3.LONG;
        T3 t34 = new T3("INT64", 2, u32, 0);
        zzc = t34;
        T3 t35 = new T3("UINT64", 3, u32, 0);
        zzd = t35;
        U3 u33 = U3.INT;
        T3 t36 = new T3("INT32", 4, u33, 0);
        zze = t36;
        T3 t37 = new T3("FIXED64", 5, u32, 1);
        zzf = t37;
        T3 t38 = new T3("FIXED32", 6, u33, 5);
        zzg = t38;
        T3 t39 = new T3("BOOL", 7, U3.BOOLEAN, 0);
        zzh = t39;
        T3 t310 = new T3("STRING", 8, U3.STRING, 2);
        zzi = t310;
        U3 u34 = U3.MESSAGE;
        T3 t311 = new T3("GROUP", 9, u34, 3);
        zzj = t311;
        T3 t312 = new T3("MESSAGE", 10, u34, 2);
        zzk = t312;
        T3 t313 = new T3("BYTES", 11, U3.BYTE_STRING, 2);
        zzl = t313;
        T3 t314 = new T3("UINT32", 12, u33, 0);
        zzm = t314;
        T3 t315 = new T3("ENUM", 13, U3.ENUM, 0);
        zzn = t315;
        T3 t316 = new T3("SFIXED32", 14, u33, 5);
        zzo = t316;
        T3 t317 = new T3("SFIXED64", 15, u32, 1);
        zzp = t317;
        T3 t318 = new T3("SINT32", 16, u33, 0);
        zzq = t318;
        T3 t319 = new T3("SINT64", 17, u32, 0);
        zzr = t319;
        zzs = new T3[]{t32, t33, t34, t35, t36, t37, t38, t39, t310, t311, t312, t313, t314, t315, t316, t317, t318, t319};
    }

    public T3(String str, int i10, U3 u32, int i11) {
        this.zzt = u32;
    }

    public static T3[] values() {
        return (T3[]) zzs.clone();
    }

    public final U3 a() {
        return this.zzt;
    }
}
