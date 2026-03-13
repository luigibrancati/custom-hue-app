package d;

import fc.C4015H;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Executor;
import kotlin.jvm.internal.AbstractC4862t;
import vc.InterfaceC6082a;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public final class y {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Executor f32775a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final InterfaceC6082a f32776b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object f32777c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f32778d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f32779e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f32780f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final List f32781g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final Runnable f32782h;

    public y(Executor executor, InterfaceC6082a reportFullyDrawn) {
        AbstractC4862t.e(executor, "executor");
        AbstractC4862t.e(reportFullyDrawn, "reportFullyDrawn");
        this.f32775a = executor;
        this.f32776b = reportFullyDrawn;
        this.f32777c = new Object();
        this.f32781g = new ArrayList();
        this.f32782h = new Runnable() { // from class: d.x
            @Override // java.lang.Runnable
            public final void run() {
                y.d(this.f32774a);
            }
        };
    }

    public static final void d(y yVar) {
        synchronized (yVar.f32777c) {
            try {
                yVar.f32779e = false;
                if (yVar.f32778d == 0 && !yVar.f32780f) {
                    yVar.f32776b.invoke();
                    yVar.b();
                }
                C4015H c4015h = C4015H.f34254a;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void b() {
        synchronized (this.f32777c) {
            try {
                this.f32780f = true;
                Iterator it = this.f32781g.iterator();
                while (it.hasNext()) {
                    ((InterfaceC6082a) it.next()).invoke();
                }
                this.f32781g.clear();
                C4015H c4015h = C4015H.f34254a;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final boolean c() {
        boolean z10;
        synchronized (this.f32777c) {
            z10 = this.f32780f;
        }
        return z10;
    }
}
