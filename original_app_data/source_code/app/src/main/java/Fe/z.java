package Fe;

import java.io.IOException;
import java.io.OutputStream;
import kotlin.jvm.internal.AbstractC4862t;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public final class z implements H {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final OutputStream f4161a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final K f4162b;

    public z(OutputStream out, K timeout) {
        AbstractC4862t.e(out, "out");
        AbstractC4862t.e(timeout, "timeout");
        this.f4161a = out;
        this.f4162b = timeout;
    }

    @Override // Fe.H
    public void J(C0843e source, long j10) throws IOException {
        AbstractC4862t.e(source, "source");
        AbstractC0840b.b(source.size(), 0L, j10);
        while (j10 > 0) {
            this.f4162b.f();
            E e10 = source.f4108a;
            AbstractC4862t.b(e10);
            int iMin = (int) Math.min(j10, e10.f4067c - e10.f4066b);
            this.f4161a.write(e10.f4065a, e10.f4066b, iMin);
            e10.f4066b += iMin;
            long j11 = iMin;
            j10 -= j11;
            source.C0(source.size() - j11);
            if (e10.f4066b == e10.f4067c) {
                source.f4108a = e10.b();
                F.b(e10);
            }
        }
    }

    @Override // Fe.H, java.io.Closeable, java.lang.AutoCloseable, java.nio.channels.Channel
    public void close() throws IOException {
        this.f4161a.close();
    }

    @Override // Fe.H, java.io.Flushable
    public void flush() throws IOException {
        this.f4161a.flush();
    }

    @Override // Fe.H
    public K n() {
        return this.f4162b;
    }

    public String toString() {
        return "sink(" + this.f4161a + ')';
    }
}
