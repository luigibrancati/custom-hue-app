package com.google.android.gms.internal.measurement;

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
/* JADX INFO: renamed from: com.google.android.gms.internal.measurement.j6, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public final class EnumC3230j6 {
    public static final EnumC3230j6 zza;
    public static final EnumC3230j6 zzb;
    public static final EnumC3230j6 zzc;
    public static final EnumC3230j6 zzd;
    public static final EnumC3230j6 zze;
    public static final EnumC3230j6 zzf;
    public static final EnumC3230j6 zzg;
    public static final EnumC3230j6 zzh;
    public static final EnumC3230j6 zzi;
    public static final EnumC3230j6 zzj;
    public static final EnumC3230j6 zzk;
    public static final EnumC3230j6 zzl;
    public static final EnumC3230j6 zzm;
    public static final EnumC3230j6 zzn;
    public static final EnumC3230j6 zzo;
    public static final EnumC3230j6 zzp;
    public static final EnumC3230j6 zzq;
    public static final EnumC3230j6 zzr;
    private static final /* synthetic */ EnumC3230j6[] zzu;
    private final EnumC3239k6 zzs;
    private final int zzt;

    static {
        EnumC3230j6 enumC3230j6 = new EnumC3230j6("DOUBLE", 0, EnumC3239k6.DOUBLE, 1);
        zza = enumC3230j6;
        EnumC3230j6 enumC3230j62 = new EnumC3230j6("FLOAT", 1, EnumC3239k6.FLOAT, 5);
        zzb = enumC3230j62;
        EnumC3239k6 enumC3239k6 = EnumC3239k6.LONG;
        EnumC3230j6 enumC3230j63 = new EnumC3230j6("INT64", 2, enumC3239k6, 0);
        zzc = enumC3230j63;
        EnumC3230j6 enumC3230j64 = new EnumC3230j6("UINT64", 3, enumC3239k6, 0);
        zzd = enumC3230j64;
        EnumC3239k6 enumC3239k62 = EnumC3239k6.INT;
        EnumC3230j6 enumC3230j65 = new EnumC3230j6("INT32", 4, enumC3239k62, 0);
        zze = enumC3230j65;
        EnumC3230j6 enumC3230j66 = new EnumC3230j6("FIXED64", 5, enumC3239k6, 1);
        zzf = enumC3230j66;
        EnumC3230j6 enumC3230j67 = new EnumC3230j6("FIXED32", 6, enumC3239k62, 5);
        zzg = enumC3230j67;
        EnumC3230j6 enumC3230j68 = new EnumC3230j6("BOOL", 7, EnumC3239k6.BOOLEAN, 0);
        zzh = enumC3230j68;
        EnumC3230j6 enumC3230j69 = new EnumC3230j6("STRING", 8, EnumC3239k6.STRING, 2);
        zzi = enumC3230j69;
        EnumC3239k6 enumC3239k63 = EnumC3239k6.MESSAGE;
        EnumC3230j6 enumC3230j610 = new EnumC3230j6("GROUP", 9, enumC3239k63, 3);
        zzj = enumC3230j610;
        EnumC3230j6 enumC3230j611 = new EnumC3230j6("MESSAGE", 10, enumC3239k63, 2);
        zzk = enumC3230j611;
        EnumC3230j6 enumC3230j612 = new EnumC3230j6("BYTES", 11, EnumC3239k6.BYTE_STRING, 2);
        zzl = enumC3230j612;
        EnumC3230j6 enumC3230j613 = new EnumC3230j6("UINT32", 12, enumC3239k62, 0);
        zzm = enumC3230j613;
        EnumC3230j6 enumC3230j614 = new EnumC3230j6("ENUM", 13, EnumC3239k6.ENUM, 0);
        zzn = enumC3230j614;
        EnumC3230j6 enumC3230j615 = new EnumC3230j6("SFIXED32", 14, enumC3239k62, 5);
        zzo = enumC3230j615;
        EnumC3230j6 enumC3230j616 = new EnumC3230j6("SFIXED64", 15, enumC3239k6, 1);
        zzp = enumC3230j616;
        EnumC3230j6 enumC3230j617 = new EnumC3230j6("SINT32", 16, enumC3239k62, 0);
        zzq = enumC3230j617;
        EnumC3230j6 enumC3230j618 = new EnumC3230j6("SINT64", 17, enumC3239k6, 0);
        zzr = enumC3230j618;
        zzu = new EnumC3230j6[]{enumC3230j6, enumC3230j62, enumC3230j63, enumC3230j64, enumC3230j65, enumC3230j66, enumC3230j67, enumC3230j68, enumC3230j69, enumC3230j610, enumC3230j611, enumC3230j612, enumC3230j613, enumC3230j614, enumC3230j615, enumC3230j616, enumC3230j617, enumC3230j618};
    }

    public EnumC3230j6(String str, int i10, EnumC3239k6 enumC3239k6, int i11) {
        this.zzs = enumC3239k6;
        this.zzt = i11;
    }

    public static EnumC3230j6[] values() {
        return (EnumC3230j6[]) zzu.clone();
    }

    public final EnumC3239k6 a() {
        return this.zzs;
    }

    public final int b() {
        return this.zzt;
    }
}
