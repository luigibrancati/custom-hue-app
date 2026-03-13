package Fe;

import java.io.EOFException;
import java.io.IOException;
import java.util.zip.CRC32;
import java.util.zip.Inflater;
import kotlin.jvm.internal.AbstractC4862t;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public final class p implements J {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public byte f4145a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final D f4146b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Inflater f4147c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final q f4148d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final CRC32 f4149e;

    public p(J source) {
        AbstractC4862t.e(source, "source");
        D d10 = new D(source);
        this.f4146b = d10;
        Inflater inflater = new Inflater(true);
        this.f4147c = inflater;
        this.f4148d = new q((InterfaceC0845g) d10, inflater);
        this.f4149e = new CRC32();
    }

    @Override // Fe.J
    public long V0(C0843e sink, long j10) throws IOException {
        p pVar;
        AbstractC4862t.e(sink, "sink");
        if (j10 < 0) {
            throw new IllegalArgumentException(("byteCount < 0: " + j10).toString());
        }
        if (j10 == 0) {
            return 0L;
        }
        if (this.f4145a == 0) {
            b();
            this.f4145a = (byte) 1;
        }
        if (this.f4145a == 1) {
            long size = sink.size();
            long jV0 = this.f4148d.V0(sink, j10);
            if (jV0 != -1) {
                d(sink, size, jV0);
                return jV0;
            }
            pVar = this;
            pVar.f4145a = (byte) 2;
        } else {
            pVar = this;
        }
        if (pVar.f4145a == 2) {
            pVar.c();
            pVar.f4145a = (byte) 3;
            if (!pVar.f4146b.z0()) {
                throw new IOException("gzip finished without exhausting source");
            }
        }
        return -1L;
    }

    public final void a(String str, int i10, int i11) throws IOException {
        if (i11 == i10) {
            return;
        }
        throw new IOException(str + ": actual 0x" + Od.F.t0(AbstractC0840b.j(i11), 8, '0') + " != expected 0x" + Od.F.t0(AbstractC0840b.j(i10), 8, '0'));
    }

    public final void b() throws IOException {
        this.f4146b.j0(10L);
        byte bQ = this.f4146b.f4061b.q(3L);
        boolean z10 = ((bQ >> 1) & 1) == 1;
        if (z10) {
            d(this.f4146b.f4061b, 0L, 10L);
        }
        a("ID1ID2", 8075, this.f4146b.readShort());
        this.f4146b.skip(8L);
        if (((bQ >> 2) & 1) == 1) {
            this.f4146b.j0(2L);
            if (z10) {
                d(this.f4146b.f4061b, 0L, 2L);
            }
            long jD0 = this.f4146b.f4061b.d0() & 65535;
            this.f4146b.j0(jD0);
            if (z10) {
                d(this.f4146b.f4061b, 0L, jD0);
            }
            this.f4146b.skip(jD0);
        }
        if (((bQ >> 3) & 1) == 1) {
            long jA = this.f4146b.a((byte) 0);
            if (jA == -1) {
                throw new EOFException();
            }
            if (z10) {
                d(this.f4146b.f4061b, 0L, jA + 1);
            }
            this.f4146b.skip(jA + 1);
        }
        if (((bQ >> 4) & 1) == 1) {
            long jA2 = this.f4146b.a((byte) 0);
            if (jA2 == -1) {
                throw new EOFException();
            }
            if (z10) {
                d(this.f4146b.f4061b, 0L, jA2 + 1);
            }
            this.f4146b.skip(jA2 + 1);
        }
        if (z10) {
            a("FHCRC", this.f4146b.d0(), (short) this.f4149e.getValue());
            this.f4149e.reset();
        }
    }

    public final void c() throws IOException {
        a("CRC", this.f4146b.P0(), (int) this.f4149e.getValue());
        a("ISIZE", this.f4146b.P0(), (int) this.f4147c.getBytesWritten());
    }

    @Override // Fe.J, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.f4148d.close();
    }

    public final void d(C0843e c0843e, long j10, long j11) {
        E e10 = c0843e.f4108a;
        AbstractC4862t.b(e10);
        while (true) {
            int i10 = e10.f4067c;
            int i11 = e10.f4066b;
            if (j10 < i10 - i11) {
                break;
            }
            j10 -= (long) (i10 - i11);
            e10 = e10.f4070f;
            AbstractC4862t.b(e10);
        }
        while (j11 > 0) {
            int i12 = (int) (((long) e10.f4066b) + j10);
            int iMin = (int) Math.min(e10.f4067c - i12, j11);
            this.f4149e.update(e10.f4065a, i12, iMin);
            j11 -= (long) iMin;
            e10 = e10.f4070f;
            AbstractC4862t.b(e10);
            j10 = 0;
        }
    }

    @Override // Fe.J
    public K n() {
        return this.f4146b.n();
    }
}
