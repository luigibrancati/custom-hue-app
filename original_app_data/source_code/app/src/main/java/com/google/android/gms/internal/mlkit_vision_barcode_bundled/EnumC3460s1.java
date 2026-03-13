package com.google.android.gms.internal.mlkit_vision_barcode_bundled;

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
/* JADX INFO: renamed from: com.google.android.gms.internal.mlkit_vision_barcode_bundled.s1, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public final class EnumC3460s1 {
    public static final EnumC3460s1 zza;
    public static final EnumC3460s1 zzb;
    public static final EnumC3460s1 zzc;
    public static final EnumC3460s1 zzd;
    public static final EnumC3460s1 zze;
    public static final EnumC3460s1 zzf;
    public static final EnumC3460s1 zzg;
    public static final EnumC3460s1 zzh;
    public static final EnumC3460s1 zzi;
    public static final EnumC3460s1 zzj;
    private static final /* synthetic */ EnumC3460s1[] zzk;
    private final Class zzl;

    static {
        EnumC3460s1 enumC3460s1 = new EnumC3460s1("VOID", 0, Void.class, Void.class, null);
        zza = enumC3460s1;
        Class cls = Integer.TYPE;
        EnumC3460s1 enumC3460s12 = new EnumC3460s1("INT", 1, cls, Integer.class, 0);
        zzb = enumC3460s12;
        EnumC3460s1 enumC3460s13 = new EnumC3460s1("LONG", 2, Long.TYPE, Long.class, 0L);
        zzc = enumC3460s13;
        EnumC3460s1 enumC3460s14 = new EnumC3460s1("FLOAT", 3, Float.TYPE, Float.class, Float.valueOf(0.0f));
        zzd = enumC3460s14;
        EnumC3460s1 enumC3460s15 = new EnumC3460s1("DOUBLE", 4, Double.TYPE, Double.class, Double.valueOf(0.0d));
        zze = enumC3460s15;
        EnumC3460s1 enumC3460s16 = new EnumC3460s1("BOOLEAN", 5, Boolean.TYPE, Boolean.class, Boolean.FALSE);
        zzf = enumC3460s16;
        EnumC3460s1 enumC3460s17 = new EnumC3460s1("STRING", 6, String.class, String.class, "");
        zzg = enumC3460s17;
        EnumC3460s1 enumC3460s18 = new EnumC3460s1("BYTE_STRING", 7, G0.class, G0.class, G0.f29754b);
        zzh = enumC3460s18;
        EnumC3460s1 enumC3460s19 = new EnumC3460s1("ENUM", 8, cls, Integer.class, null);
        zzi = enumC3460s19;
        EnumC3460s1 enumC3460s110 = new EnumC3460s1("MESSAGE", 9, Object.class, Object.class, null);
        zzj = enumC3460s110;
        zzk = new EnumC3460s1[]{enumC3460s1, enumC3460s12, enumC3460s13, enumC3460s14, enumC3460s15, enumC3460s16, enumC3460s17, enumC3460s18, enumC3460s19, enumC3460s110};
    }

    public EnumC3460s1(String str, int i10, Class cls, Class cls2, Object obj) {
        this.zzl = cls2;
    }

    public static EnumC3460s1[] values() {
        return (EnumC3460s1[]) zzk.clone();
    }

    public final Class a() {
        return this.zzl;
    }
}
