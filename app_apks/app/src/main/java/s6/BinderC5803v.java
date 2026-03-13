package s6;

import java.util.Arrays;

/* JADX INFO: renamed from: s6.v, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public final class BinderC5803v extends AbstractBinderC5802u {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final byte[] f44175b;

    public BinderC5803v(byte[] bArr) {
        super(Arrays.copyOfRange(bArr, 0, 25));
        this.f44175b = bArr;
    }

    @Override // s6.AbstractBinderC5802u
    public final byte[] K() {
        return this.f44175b;
    }
}
