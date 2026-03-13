package X6;

/* JADX INFO: renamed from: X6.a5, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public enum EnumC2346a5 {
    GOOGLE_ANALYTICS(0),
    GOOGLE_SIGNAL(1),
    SGTM(2),
    SGTM_CLIENT(3),
    GOOGLE_SIGNAL_PENDING(4),
    UNKNOWN(99);

    private final int zzg;

    EnumC2346a5(int i10) {
        this.zzg = i10;
    }

    public static EnumC2346a5 a(int i10) {
        for (EnumC2346a5 enumC2346a5 : values()) {
            if (enumC2346a5.zzg == i10) {
                return enumC2346a5;
            }
        }
        return UNKNOWN;
    }

    public final int zza() {
        return this.zzg;
    }
}
