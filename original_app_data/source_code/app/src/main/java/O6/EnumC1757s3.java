package O6;

/* JADX INFO: renamed from: O6.s3, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public enum EnumC1757s3 implements InterfaceC1677h {
    UNKNOWN_FORMAT(0),
    NV16(1),
    NV21(2),
    YV12(3),
    YUV_420_888(7),
    JPEG(8),
    BITMAP(4),
    CM_SAMPLE_BUFFER_REF(5),
    UI_IMAGE(6),
    CV_PIXEL_BUFFER_REF(9);

    private final int zzl;

    EnumC1757s3(int i10) {
        this.zzl = i10;
    }

    @Override // O6.InterfaceC1677h
    public final int zza() {
        return this.zzl;
    }
}
