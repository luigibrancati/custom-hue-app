package Fe;

import java.io.EOFException;
import java.io.IOException;
import java.util.zip.DataFormatException;
import java.util.zip.Inflater;
import kotlin.jvm.internal.AbstractC4862t;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public final class q implements J {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final InterfaceC0845g f4150a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Inflater f4151b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f4152c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f4153d;

    public q(InterfaceC0845g source, Inflater inflater) {
        AbstractC4862t.e(source, "source");
        AbstractC4862t.e(inflater, "inflater");
        this.f4150a = source;
        this.f4151b = inflater;
    }

    @Override // Fe.J
    public long V0(C0843e sink, long j10) throws IOException {
        AbstractC4862t.e(sink, "sink");
        do {
            long jA = a(sink, j10);
            if (jA > 0) {
                return jA;
            }
            if (this.f4151b.finished() || this.f4151b.needsDictionary()) {
                return -1L;
            }
        } while (!this.f4150a.z0());
        throw new EOFException("source exhausted prematurely");
    }

    public final long a(C0843e sink, long j10) throws IOException {
        AbstractC4862t.e(sink, "sink");
        if (j10 < 0) {
            throw new IllegalArgumentException(("byteCount < 0: " + j10).toString());
        }
        if (this.f4153d) {
            throw new IllegalStateException("closed");
        }
        if (j10 == 0) {
            return 0L;
        }
        try {
            E eW0 = sink.W0(1);
            int iMin = (int) Math.min(j10, 8192 - eW0.f4067c);
            b();
            int iInflate = this.f4151b.inflate(eW0.f4065a, eW0.f4067c, iMin);
            c();
            if (iInflate > 0) {
                eW0.f4067c += iInflate;
                long j11 = iInflate;
                sink.C0(sink.size() + j11);
                return j11;
            }
            if (eW0.f4066b == eW0.f4067c) {
                sink.f4108a = eW0.b();
                F.b(eW0);
            }
            return 0L;
        } catch (DataFormatException e10) {
            throw new IOException(e10);
        }
    }

    public final boolean b() {
        if (!this.f4151b.needsInput()) {
            return false;
        }
        if (this.f4150a.z0()) {
            return true;
        }
        E e10 = this.f4150a.e().f4108a;
        AbstractC4862t.b(e10);
        int i10 = e10.f4067c;
        int i11 = e10.f4066b;
        int i12 = i10 - i11;
        this.f4152c = i12;
        this.f4151b.setInput(e10.f4065a, i11, i12);
        return false;
    }

    public final void c() {
        int i10 = this.f4152c;
        if (i10 == 0) {
            return;
        }
        int remaining = i10 - this.f4151b.getRemaining();
        this.f4152c -= remaining;
        this.f4150a.skip(remaining);
    }

    @Override // Fe.J, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        if (this.f4153d) {
            return;
        }
        this.f4151b.end();
        this.f4153d = true;
        this.f4150a.close();
    }

    @Override // Fe.J
    public K n() {
        return this.f4150a.n();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public q(J source, Inflater inflater) {
        this(v.c(source), inflater);
        AbstractC4862t.e(source, "source");
        AbstractC4862t.e(inflater, "inflater");
    }
}
