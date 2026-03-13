package Fe;

import fc.C4015H;
import java.io.Closeable;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.jvm.internal.AbstractC4862t;

/* JADX INFO: renamed from: Fe.i, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC0847i implements Closeable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f4122a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f4123b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f4124c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final ReentrantLock f4125d = N.b();

    /* JADX INFO: renamed from: Fe.i$a */
    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class a implements J {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final AbstractC0847i f4126a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public long f4127b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public boolean f4128c;

        public a(AbstractC0847i fileHandle, long j10) {
            AbstractC4862t.e(fileHandle, "fileHandle");
            this.f4126a = fileHandle;
            this.f4127b = j10;
        }

        @Override // Fe.J
        public long V0(C0843e sink, long j10) {
            AbstractC4862t.e(sink, "sink");
            if (this.f4128c) {
                throw new IllegalStateException("closed");
            }
            long j11 = this.f4126a.j(this.f4127b, sink, j10);
            if (j11 != -1) {
                this.f4127b += j11;
            }
            return j11;
        }

        @Override // Fe.J, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            if (this.f4128c) {
                return;
            }
            this.f4128c = true;
            ReentrantLock reentrantLockF = this.f4126a.f();
            reentrantLockF.lock();
            try {
                AbstractC0847i abstractC0847i = this.f4126a;
                abstractC0847i.f4124c--;
                if (this.f4126a.f4124c == 0 && this.f4126a.f4123b) {
                    C4015H c4015h = C4015H.f34254a;
                    reentrantLockF.unlock();
                    this.f4126a.g();
                }
            } finally {
                reentrantLockF.unlock();
            }
        }

        @Override // Fe.J
        public K n() {
            return K.f4081e;
        }
    }

    public AbstractC0847i(boolean z10) {
        this.f4122a = z10;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        ReentrantLock reentrantLock = this.f4125d;
        reentrantLock.lock();
        try {
            if (this.f4123b) {
                return;
            }
            this.f4123b = true;
            if (this.f4124c != 0) {
                return;
            }
            C4015H c4015h = C4015H.f34254a;
            reentrantLock.unlock();
            g();
        } finally {
            reentrantLock.unlock();
        }
    }

    public final ReentrantLock f() {
        return this.f4125d;
    }

    public abstract void g();

    public abstract int h(long j10, byte[] bArr, int i10, int i11);

    public abstract long i();

    public final long j(long j10, C0843e c0843e, long j11) {
        if (j11 < 0) {
            throw new IllegalArgumentException(("byteCount < 0: " + j11).toString());
        }
        long j12 = j11 + j10;
        long j13 = j10;
        while (true) {
            if (j13 >= j12) {
                break;
            }
            E eW0 = c0843e.W0(1);
            int iH = h(j13, eW0.f4065a, eW0.f4067c, (int) Math.min(j12 - j13, 8192 - r7));
            if (iH == -1) {
                if (eW0.f4066b == eW0.f4067c) {
                    c0843e.f4108a = eW0.b();
                    F.b(eW0);
                }
                if (j10 == j13) {
                    return -1L;
                }
            } else {
                eW0.f4067c += iH;
                long j14 = iH;
                j13 += j14;
                c0843e.C0(c0843e.size() + j14);
            }
        }
        return j13 - j10;
    }

    public final J k(long j10) {
        ReentrantLock reentrantLock = this.f4125d;
        reentrantLock.lock();
        try {
            if (this.f4123b) {
                throw new IllegalStateException("closed");
            }
            this.f4124c++;
            reentrantLock.unlock();
            return new a(this, j10);
        } catch (Throwable th) {
            reentrantLock.unlock();
            throw th;
        }
    }

    public final long size() {
        ReentrantLock reentrantLock = this.f4125d;
        reentrantLock.lock();
        try {
            if (this.f4123b) {
                throw new IllegalStateException("closed");
            }
            C4015H c4015h = C4015H.f34254a;
            reentrantLock.unlock();
            return i();
        } catch (Throwable th) {
            reentrantLock.unlock();
            throw th;
        }
    }
}
