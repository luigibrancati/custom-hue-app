package Fe;

import java.nio.ByteBuffer;
import kotlin.jvm.internal.AbstractC4862t;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public final class C implements InterfaceC0844f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final H f4057a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final C0843e f4058b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f4059c;

    public C(H sink) {
        AbstractC4862t.e(sink, "sink");
        this.f4057a = sink;
        this.f4058b = new C0843e();
    }

    @Override // Fe.InterfaceC0844f
    public InterfaceC0844f B(int i10) {
        if (this.f4059c) {
            throw new IllegalStateException("closed");
        }
        this.f4058b.B(i10);
        return M();
    }

    @Override // Fe.InterfaceC0844f
    public InterfaceC0844f I0(long j10) {
        if (this.f4059c) {
            throw new IllegalStateException("closed");
        }
        this.f4058b.I0(j10);
        return M();
    }

    @Override // Fe.H
    public void J(C0843e source, long j10) {
        AbstractC4862t.e(source, "source");
        if (this.f4059c) {
            throw new IllegalStateException("closed");
        }
        this.f4058b.J(source, j10);
        M();
    }

    @Override // Fe.InterfaceC0844f
    public InterfaceC0844f M() {
        if (this.f4059c) {
            throw new IllegalStateException("closed");
        }
        long jI = this.f4058b.i();
        if (jI > 0) {
            this.f4057a.J(this.f4058b, jI);
        }
        return this;
    }

    @Override // Fe.InterfaceC0844f
    public InterfaceC0844f T(String string) {
        AbstractC4862t.e(string, "string");
        if (this.f4059c) {
            throw new IllegalStateException("closed");
        }
        this.f4058b.T(string);
        return M();
    }

    @Override // Fe.InterfaceC0844f
    public InterfaceC0844f U(C0846h byteString) {
        AbstractC4862t.e(byteString, "byteString");
        if (this.f4059c) {
            throw new IllegalStateException("closed");
        }
        this.f4058b.U(byteString);
        return M();
    }

    @Override // Fe.InterfaceC0844f
    public InterfaceC0844f W(String string, int i10, int i11) {
        AbstractC4862t.e(string, "string");
        if (this.f4059c) {
            throw new IllegalStateException("closed");
        }
        this.f4058b.W(string, i10, i11);
        return M();
    }

    @Override // Fe.H, java.io.Closeable, java.lang.AutoCloseable, java.nio.channels.Channel
    public void close() throws Throwable {
        if (this.f4059c) {
            return;
        }
        try {
            if (this.f4058b.size() > 0) {
                H h10 = this.f4057a;
                C0843e c0843e = this.f4058b;
                h10.J(c0843e, c0843e.size());
            }
            th = null;
        } catch (Throwable th) {
            th = th;
        }
        try {
            this.f4057a.close();
        } catch (Throwable th2) {
            if (th == null) {
                th = th2;
            }
        }
        this.f4059c = true;
        if (th != null) {
            throw th;
        }
    }

    @Override // Fe.InterfaceC0844f
    public C0843e e() {
        return this.f4058b;
    }

    @Override // Fe.InterfaceC0844f, Fe.H, java.io.Flushable
    public void flush() {
        if (this.f4059c) {
            throw new IllegalStateException("closed");
        }
        if (this.f4058b.size() > 0) {
            H h10 = this.f4057a;
            C0843e c0843e = this.f4058b;
            h10.J(c0843e, c0843e.size());
        }
        this.f4057a.flush();
    }

    @Override // java.nio.channels.Channel
    public boolean isOpen() {
        return !this.f4059c;
    }

    @Override // Fe.InterfaceC0844f
    public InterfaceC0844f l0(long j10) {
        if (this.f4059c) {
            throw new IllegalStateException("closed");
        }
        this.f4058b.l0(j10);
        return M();
    }

    @Override // Fe.H
    public K n() {
        return this.f4057a.n();
    }

    public String toString() {
        return "buffer(" + this.f4057a + ')';
    }

    @Override // java.nio.channels.WritableByteChannel
    public int write(ByteBuffer source) {
        AbstractC4862t.e(source, "source");
        if (this.f4059c) {
            throw new IllegalStateException("closed");
        }
        int iWrite = this.f4058b.write(source);
        M();
        return iWrite;
    }

    @Override // Fe.InterfaceC0844f
    public InterfaceC0844f writeByte(int i10) {
        if (this.f4059c) {
            throw new IllegalStateException("closed");
        }
        this.f4058b.writeByte(i10);
        return M();
    }

    @Override // Fe.InterfaceC0844f
    public InterfaceC0844f writeInt(int i10) {
        if (this.f4059c) {
            throw new IllegalStateException("closed");
        }
        this.f4058b.writeInt(i10);
        return M();
    }

    @Override // Fe.InterfaceC0844f
    public InterfaceC0844f writeShort(int i10) {
        if (this.f4059c) {
            throw new IllegalStateException("closed");
        }
        this.f4058b.writeShort(i10);
        return M();
    }

    @Override // Fe.InterfaceC0844f
    public InterfaceC0844f write(byte[] source) {
        AbstractC4862t.e(source, "source");
        if (!this.f4059c) {
            this.f4058b.write(source);
            return M();
        }
        throw new IllegalStateException("closed");
    }

    @Override // Fe.InterfaceC0844f
    public InterfaceC0844f write(byte[] source, int i10, int i11) {
        AbstractC4862t.e(source, "source");
        if (!this.f4059c) {
            this.f4058b.write(source, i10, i11);
            return M();
        }
        throw new IllegalStateException("closed");
    }
}
