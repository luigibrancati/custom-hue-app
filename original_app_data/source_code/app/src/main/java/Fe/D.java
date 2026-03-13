package Fe;

import Od.C1821a;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import kotlin.jvm.internal.AbstractC4862t;
import org.apache.tika.fork.ForkServer;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public final class D implements InterfaceC0845g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final J f4060a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final C0843e f4061b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f4062c;

    public D(J source) {
        AbstractC4862t.e(source, "source");
        this.f4060a = source;
        this.f4061b = new C0843e();
    }

    @Override // Fe.InterfaceC0845g
    public long B0() throws EOFException {
        byte bQ;
        j0(1L);
        long j10 = 0;
        while (true) {
            long j11 = j10 + 1;
            if (!p(j11)) {
                break;
            }
            bQ = this.f4061b.q(j10);
            if ((bQ < 48 || bQ > 57) && !(j10 == 0 && bQ == 45)) {
                break;
            }
            j10 = j11;
        }
        if (j10 == 0) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("Expected a digit or '-' but was 0x");
            String string = Integer.toString(bQ, C1821a.a(16));
            AbstractC4862t.d(string, "toString(...)");
            sb2.append(string);
            throw new NumberFormatException(sb2.toString());
        }
        return this.f4061b.B0();
    }

    @Override // Fe.InterfaceC0845g
    public String O(long j10) throws EOFException {
        if (j10 < 0) {
            throw new IllegalArgumentException(("limit < 0: " + j10).toString());
        }
        long j11 = j10 == Long.MAX_VALUE ? Long.MAX_VALUE : j10 + 1;
        long jB = b((byte) 10, 0L, j11);
        if (jB != -1) {
            return Ge.a.b(this.f4061b, jB);
        }
        if (j11 < Long.MAX_VALUE && p(j11) && this.f4061b.q(j11 - 1) == 13 && p(j11 + 1) && this.f4061b.q(j11) == 10) {
            return Ge.a.b(this.f4061b, j11);
        }
        C0843e c0843e = new C0843e();
        C0843e c0843e2 = this.f4061b;
        c0843e2.m(c0843e, 0L, Math.min(32, c0843e2.size()));
        throw new EOFException("\\n not found: limit=" + Math.min(this.f4061b.size(), j10) + " content=" + c0843e.K().x() + (char) 8230);
    }

    @Override // Fe.InterfaceC0845g
    public int P0() throws EOFException {
        j0(4L);
        return this.f4061b.P0();
    }

    @Override // Fe.J
    public long V0(C0843e sink, long j10) {
        AbstractC4862t.e(sink, "sink");
        if (j10 < 0) {
            throw new IllegalArgumentException(("byteCount < 0: " + j10).toString());
        }
        if (this.f4062c) {
            throw new IllegalStateException("closed");
        }
        if (this.f4061b.size() == 0) {
            if (j10 == 0) {
                return 0L;
            }
            if (this.f4060a.V0(this.f4061b, 8192L) == -1) {
                return -1L;
            }
        }
        return this.f4061b.V0(sink, Math.min(j10, this.f4061b.size()));
    }

    @Override // Fe.InterfaceC0845g
    public String Z() {
        return O(Long.MAX_VALUE);
    }

    @Override // Fe.InterfaceC0845g
    public long Z0() throws EOFException {
        byte bQ;
        j0(1L);
        int i10 = 0;
        while (true) {
            int i11 = i10 + 1;
            if (!p(i11)) {
                break;
            }
            bQ = this.f4061b.q(i10);
            if ((bQ < 48 || bQ > 57) && ((bQ < 97 || bQ > 102) && (bQ < 65 || bQ > 70))) {
                break;
            }
            i10 = i11;
        }
        if (i10 == 0) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("Expected leading [0-9a-fA-F] character but was 0x");
            String string = Integer.toString(bQ, C1821a.a(16));
            AbstractC4862t.d(string, "toString(...)");
            sb2.append(string);
            throw new NumberFormatException(sb2.toString());
        }
        return this.f4061b.Z0();
    }

    public long a(byte b10) {
        return b(b10, 0L, Long.MAX_VALUE);
    }

    public long b(byte b10, long j10, long j11) {
        if (this.f4062c) {
            throw new IllegalStateException("closed");
        }
        if (0 > j10 || j10 > j11) {
            throw new IllegalArgumentException(("fromIndex=" + j10 + " toIndex=" + j11).toString());
        }
        long jMax = j10;
        while (jMax < j11) {
            byte b11 = b10;
            long j12 = j11;
            long jU = this.f4061b.u(b11, jMax, j12);
            if (jU != -1) {
                return jU;
            }
            long size = this.f4061b.size();
            if (size >= j12 || this.f4060a.V0(this.f4061b, 8192L) == -1) {
                break;
            }
            jMax = Math.max(jMax, size);
            b10 = b11;
            j11 = j12;
        }
        return -1L;
    }

    @Override // Fe.InterfaceC0845g
    public byte[] b0(long j10) throws EOFException {
        j0(j10);
        return this.f4061b.b0(j10);
    }

    @Override // Fe.InterfaceC0845g
    public InputStream b1() {
        return new a();
    }

    @Override // Fe.J, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws EOFException {
        if (this.f4062c) {
            return;
        }
        this.f4062c = true;
        this.f4060a.close();
        this.f4061b.a();
    }

    @Override // Fe.InterfaceC0845g
    public short d0() throws EOFException {
        j0(2L);
        return this.f4061b.d0();
    }

    @Override // Fe.InterfaceC0845g
    public C0843e e() {
        return this.f4061b;
    }

    @Override // Fe.InterfaceC0845g
    public long e0() throws EOFException {
        j0(8L);
        return this.f4061b.e0();
    }

    @Override // Fe.InterfaceC0845g
    public long f0(H sink) {
        AbstractC4862t.e(sink, "sink");
        long j10 = 0;
        while (this.f4060a.V0(this.f4061b, 8192L) != -1) {
            long jI = this.f4061b.i();
            if (jI > 0) {
                j10 += jI;
                sink.J(this.f4061b, jI);
            }
        }
        if (this.f4061b.size() <= 0) {
            return j10;
        }
        long size = j10 + this.f4061b.size();
        C0843e c0843e = this.f4061b;
        sink.J(c0843e, c0843e.size());
        return size;
    }

    @Override // java.nio.channels.Channel
    public boolean isOpen() {
        return !this.f4062c;
    }

    @Override // Fe.InterfaceC0845g
    public void j0(long j10) throws EOFException {
        if (!p(j10)) {
            throw new EOFException();
        }
    }

    @Override // Fe.J
    public K n() {
        return this.f4060a.n();
    }

    @Override // Fe.InterfaceC0845g
    public String o0(long j10) throws EOFException {
        j0(j10);
        return this.f4061b.o0(j10);
    }

    @Override // Fe.InterfaceC0845g
    public boolean p(long j10) {
        if (j10 < 0) {
            throw new IllegalArgumentException(("byteCount < 0: " + j10).toString());
        }
        if (this.f4062c) {
            throw new IllegalStateException("closed");
        }
        while (this.f4061b.size() < j10) {
            if (this.f4060a.V0(this.f4061b, 8192L) == -1) {
                return false;
            }
        }
        return true;
    }

    @Override // Fe.InterfaceC0845g
    public InterfaceC0845g peek() {
        return v.c(new B(this));
    }

    @Override // Fe.InterfaceC0845g
    public C0846h q0(long j10) throws EOFException {
        j0(j10);
        return this.f4061b.q0(j10);
    }

    @Override // java.nio.channels.ReadableByteChannel
    public int read(ByteBuffer sink) {
        AbstractC4862t.e(sink, "sink");
        if (this.f4061b.size() == 0 && this.f4060a.V0(this.f4061b, 8192L) == -1) {
            return -1;
        }
        return this.f4061b.read(sink);
    }

    @Override // Fe.InterfaceC0845g
    public byte readByte() throws EOFException {
        j0(1L);
        return this.f4061b.readByte();
    }

    @Override // Fe.InterfaceC0845g
    public int readInt() throws EOFException {
        j0(4L);
        return this.f4061b.readInt();
    }

    @Override // Fe.InterfaceC0845g
    public short readShort() throws EOFException {
        j0(2L);
        return this.f4061b.readShort();
    }

    @Override // Fe.InterfaceC0845g
    public void skip(long j10) throws EOFException {
        if (this.f4062c) {
            throw new IllegalStateException("closed");
        }
        while (j10 > 0) {
            if (this.f4061b.size() == 0 && this.f4060a.V0(this.f4061b, 8192L) == -1) {
                throw new EOFException();
            }
            long jMin = Math.min(j10, this.f4061b.size());
            this.f4061b.skip(jMin);
            j10 -= jMin;
        }
    }

    public String toString() {
        return "buffer(" + this.f4060a + ')';
    }

    @Override // Fe.InterfaceC0845g
    public boolean z0() {
        if (this.f4062c) {
            throw new IllegalStateException("closed");
        }
        return this.f4061b.z0() && this.f4060a.V0(this.f4061b, 8192L) == -1;
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class a extends InputStream {
        public a() {
        }

        @Override // java.io.InputStream
        public int available() throws IOException {
            D d10 = D.this;
            if (d10.f4062c) {
                throw new IOException("closed");
            }
            return (int) Math.min(d10.f4061b.size(), Integer.MAX_VALUE);
        }

        @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
        public void close() throws EOFException {
            D.this.close();
        }

        @Override // java.io.InputStream
        public int read() throws IOException {
            D d10 = D.this;
            if (d10.f4062c) {
                throw new IOException("closed");
            }
            if (d10.f4061b.size() == 0) {
                D d11 = D.this;
                if (d11.f4060a.V0(d11.f4061b, 8192L) == -1) {
                    return -1;
                }
            }
            return D.this.f4061b.readByte() & ForkServer.ERROR;
        }

        public String toString() {
            return D.this + ".inputStream()";
        }

        @Override // java.io.InputStream
        public int read(byte[] data, int i10, int i11) throws IOException {
            AbstractC4862t.e(data, "data");
            if (!D.this.f4062c) {
                AbstractC0840b.b(data.length, i10, i11);
                if (D.this.f4061b.size() == 0) {
                    D d10 = D.this;
                    if (d10.f4060a.V0(d10.f4061b, 8192L) == -1) {
                        return -1;
                    }
                }
                return D.this.f4061b.read(data, i10, i11);
            }
            throw new IOException("closed");
        }
    }
}
