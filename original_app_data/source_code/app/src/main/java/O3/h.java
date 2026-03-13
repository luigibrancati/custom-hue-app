package O3;

import I3.AbstractC0890u;
import android.content.Context;
import fc.C4015H;
import gc.C4179C;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import kotlin.jvm.internal.AbstractC4862t;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public abstract class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final S3.b f10920a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Context f10921b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object f10922c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final LinkedHashSet f10923d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Object f10924e;

    public h(Context context, S3.b taskExecutor) {
        AbstractC4862t.e(context, "context");
        AbstractC4862t.e(taskExecutor, "taskExecutor");
        this.f10920a = taskExecutor;
        Context applicationContext = context.getApplicationContext();
        AbstractC4862t.d(applicationContext, "getApplicationContext(...)");
        this.f10921b = applicationContext;
        this.f10922c = new Object();
        this.f10923d = new LinkedHashSet();
    }

    public static final void b(List list, h hVar) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            ((M3.a) it.next()).a(hVar.f10924e);
        }
    }

    public final void c(M3.a listener) {
        AbstractC4862t.e(listener, "listener");
        synchronized (this.f10922c) {
            try {
                if (this.f10923d.add(listener)) {
                    if (this.f10923d.size() == 1) {
                        this.f10924e = e();
                        AbstractC0890u.e().a(i.f10925a, getClass().getSimpleName() + ": initial state = " + this.f10924e);
                        h();
                    }
                    listener.a(this.f10924e);
                }
                C4015H c4015h = C4015H.f34254a;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final Context d() {
        return this.f10921b;
    }

    public abstract Object e();

    public final void f(M3.a listener) {
        AbstractC4862t.e(listener, "listener");
        synchronized (this.f10922c) {
            try {
                if (this.f10923d.remove(listener) && this.f10923d.isEmpty()) {
                    i();
                }
                C4015H c4015h = C4015H.f34254a;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void g(Object obj) {
        synchronized (this.f10922c) {
            Object obj2 = this.f10924e;
            if (obj2 == null || !AbstractC4862t.a(obj2, obj)) {
                this.f10924e = obj;
                final List listV0 = C4179C.V0(this.f10923d);
                this.f10920a.a().execute(new Runnable() { // from class: O3.g
                    @Override // java.lang.Runnable
                    public final void run() {
                        h.b(listV0, this);
                    }
                });
                C4015H c4015h = C4015H.f34254a;
            }
        }
    }

    public abstract void h();

    public abstract void i();
}
