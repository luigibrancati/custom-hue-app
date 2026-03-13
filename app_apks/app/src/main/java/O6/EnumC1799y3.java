package O6;

/* JADX INFO: renamed from: O6.y3, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public enum EnumC1799y3 implements InterfaceC1677h {
    SOURCE_UNKNOWN(0),
    BITMAP(1),
    BYTEARRAY(2),
    BYTEBUFFER(3),
    FILEPATH(4),
    ANDROID_MEDIA_IMAGE(5);

    private final int zzh;

    EnumC1799y3(int i10) {
        this.zzh = i10;
    }

    @Override // O6.InterfaceC1677h
    public final int zza() {
        return this.zzh;
    }
}
