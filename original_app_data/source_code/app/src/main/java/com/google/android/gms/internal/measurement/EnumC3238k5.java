package com.google.android.gms.internal.measurement;

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
/* JADX INFO: renamed from: com.google.android.gms.internal.measurement.k5, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public final class EnumC3238k5 {
    public static final EnumC3238k5 zza;
    public static final EnumC3238k5 zzb;
    public static final EnumC3238k5 zzc;
    public static final EnumC3238k5 zzd;
    public static final EnumC3238k5 zze;
    public static final EnumC3238k5 zzf;
    public static final EnumC3238k5 zzg;
    public static final EnumC3238k5 zzh;
    public static final EnumC3238k5 zzi;
    public static final EnumC3238k5 zzj;
    private static final /* synthetic */ EnumC3238k5[] zzl;
    private final Class zzk;

    static {
        EnumC3238k5 enumC3238k5 = new EnumC3238k5("VOID", 0, Void.class, Void.class, null);
        zza = enumC3238k5;
        Class cls = Integer.TYPE;
        EnumC3238k5 enumC3238k52 = new EnumC3238k5("INT", 1, cls, Integer.class, 0);
        zzb = enumC3238k52;
        EnumC3238k5 enumC3238k53 = new EnumC3238k5("LONG", 2, Long.TYPE, Long.class, 0L);
        zzc = enumC3238k53;
        EnumC3238k5 enumC3238k54 = new EnumC3238k5("FLOAT", 3, Float.TYPE, Float.class, Float.valueOf(0.0f));
        zzd = enumC3238k54;
        EnumC3238k5 enumC3238k55 = new EnumC3238k5("DOUBLE", 4, Double.TYPE, Double.class, Double.valueOf(0.0d));
        zze = enumC3238k55;
        EnumC3238k5 enumC3238k56 = new EnumC3238k5("BOOLEAN", 5, Boolean.TYPE, Boolean.class, Boolean.FALSE);
        zzf = enumC3238k56;
        EnumC3238k5 enumC3238k57 = new EnumC3238k5("STRING", 6, String.class, String.class, "");
        zzg = enumC3238k57;
        EnumC3238k5 enumC3238k58 = new EnumC3238k5("BYTE_STRING", 7, E4.class, E4.class, E4.f29169b);
        zzh = enumC3238k58;
        EnumC3238k5 enumC3238k59 = new EnumC3238k5("ENUM", 8, cls, Integer.class, null);
        zzi = enumC3238k59;
        EnumC3238k5 enumC3238k510 = new EnumC3238k5("MESSAGE", 9, Object.class, Object.class, null);
        zzj = enumC3238k510;
        zzl = new EnumC3238k5[]{enumC3238k5, enumC3238k52, enumC3238k53, enumC3238k54, enumC3238k55, enumC3238k56, enumC3238k57, enumC3238k58, enumC3238k59, enumC3238k510};
    }

    public EnumC3238k5(String str, int i10, Class cls, Class cls2, Object obj) {
        this.zzk = cls2;
    }

    public static EnumC3238k5[] values() {
        return (EnumC3238k5[]) zzl.clone();
    }

    public final Class a() {
        return this.zzk;
    }
}
