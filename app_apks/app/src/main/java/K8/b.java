package K8;

import java.io.OutputStream;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public final class b extends OutputStream {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public long f7754a = 0;

    public long a() {
        return this.f7754a;
    }

    @Override // java.io.OutputStream
    public void write(int i10) {
        this.f7754a++;
    }

    @Override // java.io.OutputStream
    public void write(byte[] bArr) {
        this.f7754a += (long) bArr.length;
    }

    @Override // java.io.OutputStream
    public void write(byte[] bArr, int i10, int i11) {
        int i12;
        if (i10 >= 0 && i10 <= bArr.length && i11 >= 0 && (i12 = i10 + i11) <= bArr.length && i12 >= 0) {
            this.f7754a += (long) i11;
            return;
        }
        throw new IndexOutOfBoundsException();
    }
}
