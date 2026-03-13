package androidx.camera.core;

import E.V;
import L.InterfaceC1134y0;
import O.n;
import androidx.camera.core.b;
import androidx.camera.core.c;
import java.lang.ref.WeakReference;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public final class c extends V {

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final Executor f21985v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final Object f21986w = new Object();

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public d f21987x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public b f21988y;

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static class b extends androidx.camera.core.b {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final WeakReference f21991d;

        public b(d dVar, c cVar) {
            super(dVar);
            this.f21991d = new WeakReference(cVar);
            a(new b.a() { // from class: E.X
                @Override // androidx.camera.core.b.a
                public final void a(androidx.camera.core.d dVar2) {
                    c.b.c(this.f2938a, dVar2);
                }
            });
        }

        public static /* synthetic */ void c(b bVar, d dVar) {
            final c cVar = (c) bVar.f21991d.get();
            if (cVar != null) {
                cVar.f21985v.execute(new Runnable() { // from class: E.Y
                    @Override // java.lang.Runnable
                    public final void run() {
                        cVar.w();
                    }
                });
            }
        }
    }

    public c(Executor executor) {
        this.f21985v = executor;
    }

    @Override // E.V
    public d d(InterfaceC1134y0 interfaceC1134y0) {
        return interfaceC1134y0.acquireLatestImage();
    }

    @Override // E.V
    public void f() {
        synchronized (this.f21986w) {
            try {
                d dVar = this.f21987x;
                if (dVar != null) {
                    dVar.close();
                    this.f21987x = null;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // E.V
    public void l(d dVar) {
        synchronized (this.f21986w) {
            try {
                if (!this.f2887u) {
                    dVar.close();
                    return;
                }
                if (this.f21988y == null) {
                    b bVar = new b(dVar, this);
                    this.f21988y = bVar;
                    n.j(e(bVar), new a(bVar), N.a.a());
                } else {
                    if (dVar.L0().getTimestamp() <= this.f21988y.L0().getTimestamp()) {
                        dVar.close();
                    } else {
                        d dVar2 = this.f21987x;
                        if (dVar2 != null) {
                            dVar2.close();
                        }
                        this.f21987x = dVar;
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void w() {
        synchronized (this.f21986w) {
            try {
                this.f21988y = null;
                d dVar = this.f21987x;
                if (dVar != null) {
                    this.f21987x = null;
                    l(dVar);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public class a implements O.c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ b f21989a;

        public a(b bVar) {
            this.f21989a = bVar;
        }

        @Override // O.c
        public void a(Throwable th) {
            this.f21989a.close();
        }

        @Override // O.c
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void onSuccess(Void r12) {
        }
    }
}
