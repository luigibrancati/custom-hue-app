package P;

import E.AbstractC0807p0;
import E.C0781c0;
import fc.C4015H;
import kotlin.jvm.internal.AbstractC4854k;
import kotlin.jvm.internal.AbstractC4862t;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public final class k implements C0781c0.i {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final a f12520e = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C0781c0.i f12521a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f12522b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f12523c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public C0781c0.j f12524d;

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class a {
        public /* synthetic */ a(AbstractC4854k abstractC4854k) {
            this();
        }

        public final k a(C0781c0.i iVar) {
            return new k(iVar, null);
        }

        public a() {
        }
    }

    public /* synthetic */ k(C0781c0.i iVar, AbstractC4854k abstractC4854k) {
        this(iVar);
    }

    public static final void c(k kVar) {
        synchronized (kVar.f12522b) {
            try {
                if (kVar.f12524d == null) {
                    AbstractC0807p0.l("ScreenFlashWrapper", "apply: pendingListener is null!");
                }
                kVar.e();
                C4015H c4015h = C4015H.f34254a;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public static final k g(C0781c0.i iVar) {
        return f12520e.a(iVar);
    }

    @Override // E.C0781c0.i
    public void a(long j10, C0781c0.j screenFlashListener) {
        AbstractC4862t.e(screenFlashListener, "screenFlashListener");
        synchronized (this.f12522b) {
            this.f12523c = true;
            this.f12524d = screenFlashListener;
            C4015H c4015h = C4015H.f34254a;
        }
        C0781c0.i iVar = this.f12521a;
        if (iVar != null) {
            iVar.a(j10, new C0781c0.j() { // from class: P.j
                @Override // E.C0781c0.j
                public final void a() {
                    k.c(this.f12519a);
                }
            });
        } else {
            AbstractC0807p0.c("ScreenFlashWrapper", "apply: screenFlash is null!");
            e();
        }
    }

    @Override // E.C0781c0.i
    public void clear() {
        d();
    }

    public final void d() {
        synchronized (this.f12522b) {
            try {
                if (this.f12523c) {
                    C0781c0.i iVar = this.f12521a;
                    if (iVar != null) {
                        iVar.clear();
                    } else {
                        AbstractC0807p0.c("ScreenFlashWrapper", "completePendingScreenFlashClear: screenFlash is null!");
                    }
                } else {
                    AbstractC0807p0.l("ScreenFlashWrapper", "completePendingScreenFlashClear: none pending!");
                }
                this.f12523c = false;
                C4015H c4015h = C4015H.f34254a;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void e() {
        synchronized (this.f12522b) {
            try {
                C0781c0.j jVar = this.f12524d;
                if (jVar != null) {
                    jVar.a();
                }
                this.f12524d = null;
                C4015H c4015h = C4015H.f34254a;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void f() {
        e();
        d();
    }

    public k(C0781c0.i iVar) {
        this.f12521a = iVar;
        this.f12522b = new Object();
    }
}
