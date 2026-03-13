package Fe;

import java.io.InterruptedIOException;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.AbstractC4854k;
import kotlin.jvm.internal.AbstractC4862t;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public class K {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final b f4080d = new b(null);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final K f4081e = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f4082a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public long f4083b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public long f4084c;

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class b {
        public /* synthetic */ b(AbstractC4854k abstractC4854k) {
            this();
        }

        public b() {
        }
    }

    public K a() {
        this.f4082a = false;
        return this;
    }

    public K b() {
        this.f4084c = 0L;
        return this;
    }

    public long c() {
        if (this.f4082a) {
            return this.f4083b;
        }
        throw new IllegalStateException("No deadline");
    }

    public K d(long j10) {
        this.f4082a = true;
        this.f4083b = j10;
        return this;
    }

    public boolean e() {
        return this.f4082a;
    }

    public void f() throws InterruptedIOException {
        if (Thread.currentThread().isInterrupted()) {
            throw new InterruptedIOException("interrupted");
        }
        if (this.f4082a && this.f4083b - System.nanoTime() <= 0) {
            throw new InterruptedIOException("deadline reached");
        }
    }

    public K g(long j10, TimeUnit unit) {
        AbstractC4862t.e(unit, "unit");
        if (j10 >= 0) {
            this.f4084c = unit.toNanos(j10);
            return this;
        }
        throw new IllegalArgumentException(("timeout < 0: " + j10).toString());
    }

    public long h() {
        return this.f4084c;
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class a extends K {
        @Override // Fe.K
        public K g(long j10, TimeUnit unit) {
            AbstractC4862t.e(unit, "unit");
            return this;
        }

        @Override // Fe.K
        public void f() {
        }

        @Override // Fe.K
        public K d(long j10) {
            return this;
        }
    }
}
