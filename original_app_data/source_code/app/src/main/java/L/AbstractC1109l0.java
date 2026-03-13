package L;

import B0.c;
import E.AbstractC0807p0;
import android.util.Log;
import android.util.Size;
import java.util.concurrent.atomic.AtomicInteger;
import org.apache.tika.utils.StringUtils;

/* JADX INFO: renamed from: L.l0, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1109l0 {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final Size f8112k = new Size(0, 0);

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final boolean f8113l = AbstractC0807p0.f("DeferrableSurface");

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final AtomicInteger f8114m = new AtomicInteger(0);

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final AtomicInteger f8115n = new AtomicInteger(0);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f8116a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f8117b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f8118c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public c.a f8119d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final O7.e f8120e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public c.a f8121f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final O7.e f8122g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final Size f8123h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final int f8124i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public Class f8125j;

    /* JADX INFO: renamed from: L.l0$a */
    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class a extends Exception {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public AbstractC1109l0 f8126a;

        public a(String str, AbstractC1109l0 abstractC1109l0) {
            super(str);
            this.f8126a = abstractC1109l0;
        }

        public AbstractC1109l0 a() {
            return this.f8126a;
        }
    }

    /* JADX INFO: renamed from: L.l0$b */
    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class b extends Exception {
        public b(String str) {
            super(str);
        }
    }

    public AbstractC1109l0() {
        this(f8112k, 0);
    }

    public static /* synthetic */ Object a(AbstractC1109l0 abstractC1109l0, c.a aVar) {
        synchronized (abstractC1109l0.f8116a) {
            abstractC1109l0.f8119d = aVar;
        }
        return "DeferrableSurface-termination(" + abstractC1109l0 + ")";
    }

    public static /* synthetic */ Object b(AbstractC1109l0 abstractC1109l0, c.a aVar) {
        synchronized (abstractC1109l0.f8116a) {
            abstractC1109l0.f8121f = aVar;
        }
        return "DeferrableSurface-close(" + abstractC1109l0 + ")";
    }

    public static /* synthetic */ void c(AbstractC1109l0 abstractC1109l0, String str) {
        abstractC1109l0.getClass();
        try {
            abstractC1109l0.f8120e.get();
            abstractC1109l0.n("Surface terminated", f8115n.decrementAndGet(), f8114m.get());
        } catch (Exception e10) {
            AbstractC0807p0.c("DeferrableSurface", "Unexpected surface termination for " + abstractC1109l0 + "\nStack Trace:\n" + str);
            synchronized (abstractC1109l0.f8116a) {
                throw new IllegalArgumentException(String.format("DeferrableSurface %s [closed: %b, use_count: %s] terminated with unexpected exception.", abstractC1109l0, Boolean.valueOf(abstractC1109l0.f8118c), Integer.valueOf(abstractC1109l0.f8117b)), e10);
            }
        }
    }

    public void d() {
        c.a aVar;
        synchronized (this.f8116a) {
            try {
                if (this.f8118c) {
                    aVar = null;
                } else {
                    this.f8118c = true;
                    this.f8121f.c(null);
                    if (this.f8117b == 0) {
                        aVar = this.f8119d;
                        this.f8119d = null;
                    } else {
                        aVar = null;
                    }
                    if (AbstractC0807p0.f("DeferrableSurface")) {
                        AbstractC0807p0.a("DeferrableSurface", "surface closed,  useCount=" + this.f8117b + " closed=true " + this);
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (aVar != null) {
            aVar.c(null);
        }
    }

    public void e() {
        c.a aVar;
        synchronized (this.f8116a) {
            try {
                int i10 = this.f8117b;
                if (i10 == 0) {
                    throw new IllegalStateException("Decrementing use count occurs more times than incrementing");
                }
                int i11 = i10 - 1;
                this.f8117b = i11;
                if (i11 == 0 && this.f8118c) {
                    aVar = this.f8119d;
                    this.f8119d = null;
                } else {
                    aVar = null;
                }
                if (AbstractC0807p0.f("DeferrableSurface")) {
                    AbstractC0807p0.a("DeferrableSurface", "use count-1,  useCount=" + this.f8117b + " closed=" + this.f8118c + StringUtils.SPACE + this);
                    if (this.f8117b == 0) {
                        n("Surface no longer in use", f8115n.get(), f8114m.decrementAndGet());
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (aVar != null) {
            aVar.c(null);
        }
    }

    public O7.e f() {
        return O.n.s(this.f8122g);
    }

    public Class g() {
        return this.f8125j;
    }

    public Size h() {
        return this.f8123h;
    }

    public int i() {
        return this.f8124i;
    }

    public final O7.e j() {
        synchronized (this.f8116a) {
            try {
                if (this.f8118c) {
                    return O.n.n(new a("DeferrableSurface already closed.", this));
                }
                return o();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public O7.e k() {
        return O.n.s(this.f8120e);
    }

    public void l() {
        synchronized (this.f8116a) {
            try {
                int i10 = this.f8117b;
                if (i10 == 0 && this.f8118c) {
                    throw new a("Cannot begin use on a closed surface.", this);
                }
                this.f8117b = i10 + 1;
                if (AbstractC0807p0.f("DeferrableSurface")) {
                    if (this.f8117b == 1) {
                        n("New surface in use", f8115n.get(), f8114m.incrementAndGet());
                    }
                    AbstractC0807p0.a("DeferrableSurface", "use count+1, useCount=" + this.f8117b + StringUtils.SPACE + this);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public boolean m() {
        boolean z10;
        synchronized (this.f8116a) {
            z10 = this.f8118c;
        }
        return z10;
    }

    public final void n(String str, int i10, int i11) {
        if (!f8113l && AbstractC0807p0.f("DeferrableSurface")) {
            AbstractC0807p0.a("DeferrableSurface", "DeferrableSurface usage statistics may be inaccurate since debug logging was not enabled at static initialization time. App restart may be required to enable accurate usage statistics.");
        }
        AbstractC0807p0.a("DeferrableSurface", str + "[total_surfaces=" + i10 + ", used_surfaces=" + i11 + "](" + this + "}");
    }

    public abstract O7.e o();

    public void p(Class cls) {
        this.f8125j = cls;
    }

    public AbstractC1109l0(Size size, int i10) {
        this.f8116a = new Object();
        this.f8117b = 0;
        this.f8118c = false;
        this.f8123h = size;
        this.f8124i = i10;
        O7.e eVarA = B0.c.a(new c.InterfaceC0018c() { // from class: L.i0
            @Override // B0.c.InterfaceC0018c
            public final Object a(c.a aVar) {
                return AbstractC1109l0.a(this.f8089a, aVar);
            }
        });
        this.f8120e = eVarA;
        this.f8122g = B0.c.a(new c.InterfaceC0018c() { // from class: L.j0
            @Override // B0.c.InterfaceC0018c
            public final Object a(c.a aVar) {
                return AbstractC1109l0.b(this.f8091a, aVar);
            }
        });
        if (AbstractC0807p0.f("DeferrableSurface")) {
            n("Surface created", f8115n.incrementAndGet(), f8114m.get());
            final String stackTraceString = Log.getStackTraceString(new Exception());
            eVarA.b(new Runnable() { // from class: L.k0
                @Override // java.lang.Runnable
                public final void run() {
                    AbstractC1109l0.c(this.f8107a, stackTraceString);
                }
            }, N.a.a());
        }
    }
}
