package com.google.android.gms.internal.play_billing;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field 'zzb' uses external variables
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
public final class W2 {
    public static final W2 zza;
    public static final W2 zzb;
    public static final W2 zzc;
    public static final W2 zzd;
    public static final W2 zze;
    public static final W2 zzf;
    public static final W2 zzg;
    public static final W2 zzh;
    public static final W2 zzi;
    public static final W2 zzj;
    private static final /* synthetic */ W2[] zzk;
    private final Class zzl;

    static {
        W2 w22 = new W2("VOID", 0, Void.class, Void.class, null);
        zza = w22;
        Class cls = Integer.TYPE;
        W2 w23 = new W2("INT", 1, cls, Integer.class, 0);
        zzb = w23;
        W2 w24 = new W2("LONG", 2, Long.TYPE, Long.class, 0L);
        zzc = w24;
        W2 w25 = new W2("FLOAT", 3, Float.TYPE, Float.class, Float.valueOf(0.0f));
        zzd = w25;
        W2 w26 = new W2("DOUBLE", 4, Double.TYPE, Double.class, Double.valueOf(0.0d));
        zze = w26;
        W2 w27 = new W2("BOOLEAN", 5, Boolean.TYPE, Boolean.class, Boolean.FALSE);
        zzf = w27;
        W2 w28 = new W2("STRING", 6, String.class, String.class, "");
        zzg = w28;
        W2 w29 = new W2("BYTE_STRING", 7, AbstractC3597q2.class, AbstractC3597q2.class, AbstractC3597q2.f30229b);
        zzh = w29;
        W2 w210 = new W2("ENUM", 8, cls, Integer.class, null);
        zzi = w210;
        W2 w211 = new W2("MESSAGE", 9, Object.class, Object.class, null);
        zzj = w211;
        zzk = new W2[]{w22, w23, w24, w25, w26, w27, w28, w29, w210, w211};
    }

    public W2(String str, int i10, Class cls, Class cls2, Object obj) {
        this.zzl = cls2;
    }

    public static W2[] values() {
        return (W2[]) zzk.clone();
    }

    public final Class a() {
        return this.zzl;
    }
}
