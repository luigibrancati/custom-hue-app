package Fe;

import java.io.IOException;
import java.io.InputStream;
import kotlin.jvm.internal.AbstractC4862t;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public class r implements J {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final InputStream f4154a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final K f4155b;

    public r(InputStream input, K timeout) {
        AbstractC4862t.e(input, "input");
        AbstractC4862t.e(timeout, "timeout");
        this.f4154a = input;
        this.f4155b = timeout;
    }

    @Override // Fe.J
    public long V0(C0843e sink, long j10) throws IOException {
        AbstractC4862t.e(sink, "sink");
        if (j10 == 0) {
            return 0L;
        }
        if (j10 < 0) {
            throw new IllegalArgumentException(("byteCount < 0: " + j10).toString());
        }
        try {
            this.f4155b.f();
            E eW0 = sink.W0(1);
            int i10 = this.f4154a.read(eW0.f4065a, eW0.f4067c, (int) Math.min(j10, 8192 - eW0.f4067c));
            if (i10 != -1) {
                eW0.f4067c += i10;
                long j11 = i10;
                sink.C0(sink.size() + j11);
                return j11;
            }
            if (eW0.f4066b != eW0.f4067c) {
                return -1L;
            }
            sink.f4108a = eW0.b();
            F.b(eW0);
            return -1L;
        } catch (AssertionError e10) {
            if (v.d(e10)) {
                throw new IOException(e10);
            }
            throw e10;
        }
    }

    @Override // Fe.J, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        this.f4154a.close();
    }

    @Override // Fe.J
    public K n() {
        return this.f4155b;
    }

    public String toString() {
        return "source(" + this.f4154a + ')';
    }
}
