package m1;

import android.os.SystemClock;
import android.view.Choreographer;
import b0.J;
import java.util.ArrayList;

/* JADX INFO: renamed from: m1.a, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public class C5002a {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final ThreadLocal f40104g = new ThreadLocal();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public c f40108d;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final J f40105a = new J();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ArrayList f40106b = new ArrayList();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final C0525a f40107c = new C0525a();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public long f40109e = 0;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f40110f = false;

    /* JADX INFO: renamed from: m1.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public class C0525a {
        public C0525a() {
        }

        public void a() {
            C5002a.this.f40109e = SystemClock.uptimeMillis();
            C5002a c5002a = C5002a.this;
            c5002a.c(c5002a.f40109e);
            if (C5002a.this.f40106b.size() > 0) {
                C5002a.this.e().a();
            }
        }
    }

    /* JADX INFO: renamed from: m1.a$b */
    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public interface b {
        boolean a(long j10);
    }

    /* JADX INFO: renamed from: m1.a$c */
    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static abstract class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final C0525a f40112a;

        public c(C0525a c0525a) {
            this.f40112a = c0525a;
        }

        public abstract void a();
    }

    /* JADX INFO: renamed from: m1.a$d */
    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static class d extends c {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Choreographer f40113b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final Choreographer.FrameCallback f40114c;

        /* JADX INFO: renamed from: m1.a$d$a, reason: collision with other inner class name */
        /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
        public class ChoreographerFrameCallbackC0526a implements Choreographer.FrameCallback {
            public ChoreographerFrameCallbackC0526a() {
            }

            @Override // android.view.Choreographer.FrameCallback
            public void doFrame(long j10) {
                d.this.f40112a.a();
            }
        }

        public d(C0525a c0525a) {
            super(c0525a);
            this.f40113b = Choreographer.getInstance();
            this.f40114c = new ChoreographerFrameCallbackC0526a();
        }

        @Override // m1.C5002a.c
        public void a() {
            this.f40113b.postFrameCallback(this.f40114c);
        }
    }

    public static C5002a d() {
        ThreadLocal threadLocal = f40104g;
        if (threadLocal.get() == null) {
            threadLocal.set(new C5002a());
        }
        return (C5002a) threadLocal.get();
    }

    public void a(b bVar, long j10) {
        if (this.f40106b.size() == 0) {
            e().a();
        }
        if (!this.f40106b.contains(bVar)) {
            this.f40106b.add(bVar);
        }
        if (j10 > 0) {
            this.f40105a.put(bVar, Long.valueOf(SystemClock.uptimeMillis() + j10));
        }
    }

    public final void b() {
        if (this.f40110f) {
            for (int size = this.f40106b.size() - 1; size >= 0; size--) {
                if (this.f40106b.get(size) == null) {
                    this.f40106b.remove(size);
                }
            }
            this.f40110f = false;
        }
    }

    public void c(long j10) {
        long jUptimeMillis = SystemClock.uptimeMillis();
        for (int i10 = 0; i10 < this.f40106b.size(); i10++) {
            b bVar = (b) this.f40106b.get(i10);
            if (bVar != null && f(bVar, jUptimeMillis)) {
                bVar.a(j10);
            }
        }
        b();
    }

    public c e() {
        if (this.f40108d == null) {
            this.f40108d = new d(this.f40107c);
        }
        return this.f40108d;
    }

    public final boolean f(b bVar, long j10) {
        Long l10 = (Long) this.f40105a.get(bVar);
        if (l10 == null) {
            return true;
        }
        if (l10.longValue() >= j10) {
            return false;
        }
        this.f40105a.remove(bVar);
        return true;
    }

    public void g(b bVar) {
        this.f40105a.remove(bVar);
        int iIndexOf = this.f40106b.indexOf(bVar);
        if (iIndexOf >= 0) {
            this.f40106b.set(iIndexOf, null);
            this.f40110f = true;
        }
    }
}
