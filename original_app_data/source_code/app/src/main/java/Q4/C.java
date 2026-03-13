package Q4;

import java.io.IOException;
import java.io.InputStream;
import kotlin.jvm.internal.AbstractC4862t;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public final class C extends InputStream {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final InputStream f13759a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f13760b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public long f13761c;

    public C(InputStream inputStream, long j10) {
        AbstractC4862t.e(inputStream, "inputStream");
        this.f13759a = inputStream;
        this.f13760b = j10;
    }

    @Override // java.io.InputStream
    public int read() throws IOException {
        if (this.f13761c >= this.f13760b) {
            return -1;
        }
        int i10 = this.f13759a.read();
        if (i10 != -1) {
            this.f13761c++;
        }
        return i10;
    }

    @Override // java.io.InputStream
    public int read(byte[] b10, int i10, int i11) throws IOException {
        AbstractC4862t.e(b10, "b");
        long j10 = this.f13761c;
        long j11 = this.f13760b;
        if (j10 >= j11) {
            return -1;
        }
        int i12 = this.f13759a.read(b10, i10, (int) Math.min(i11, j11 - j10));
        if (i12 != -1) {
            this.f13761c += (long) i12;
        }
        return i12;
    }
}
