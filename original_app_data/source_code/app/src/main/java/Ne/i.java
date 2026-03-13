package Ne;

import java.io.InputStream;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public abstract class i extends InputStream {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public volatile InputStream f10692a;

    public i(InputStream inputStream) {
        this.f10692a = inputStream;
    }

    @Override // java.io.InputStream
    public int read(byte[] bArr) {
        return read(bArr, 0, bArr.length);
    }

    @Override // java.io.InputStream
    public abstract int read(byte[] bArr, int i10, int i11);
}
