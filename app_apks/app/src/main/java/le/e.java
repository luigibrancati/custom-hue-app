package le;

import android.content.ComponentName;
import android.content.Context;
import android.net.Uri;
import java.lang.ref.WeakReference;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;
import ne.AbstractC5177b;
import ne.C5176a;
import u.AbstractC5888c;
import u.AbstractServiceConnectionC5890e;
import u.C5887b;
import u.C5889d;
import u.C5891f;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final WeakReference f40098a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final AtomicReference f40099b = new AtomicReference();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final CountDownLatch f40100c = new CountDownLatch(1);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public AbstractServiceConnectionC5890e f40101d;

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public class a extends AbstractServiceConnectionC5890e {
        public a() {
        }

        @Override // u.AbstractServiceConnectionC5890e
        public void a(ComponentName componentName, AbstractC5888c abstractC5888c) {
            C5176a.a("CustomTabsService is connected", new Object[0]);
            abstractC5888c.g(0L);
            c(abstractC5888c);
        }

        public final void c(AbstractC5888c abstractC5888c) {
            e.this.f40099b.set(abstractC5888c);
            e.this.f40100c.countDown();
        }

        @Override // android.content.ServiceConnection
        public void onServiceDisconnected(ComponentName componentName) {
            C5176a.a("CustomTabsService is disconnected", new Object[0]);
            c(null);
        }
    }

    public e(Context context) {
        this.f40098a = new WeakReference(context);
    }

    public synchronized void c(String str) {
        try {
            if (this.f40101d != null) {
                return;
            }
            this.f40101d = new a();
            Context context = (Context) this.f40098a.get();
            if (context == null || !AbstractC5888c.a(context, str, this.f40101d)) {
                C5176a.f("Unable to bind custom tabs service", new Object[0]);
                this.f40100c.countDown();
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public C5891f d(C5887b c5887b, Uri... uriArr) {
        AbstractC5888c abstractC5888cG = g();
        if (abstractC5888cG == null) {
            return null;
        }
        C5891f c5891fE = abstractC5888cG.e(c5887b);
        if (c5891fE == null) {
            C5176a.h("Failed to create custom tabs session through custom tabs client", new Object[0]);
            return null;
        }
        if (uriArr != null && uriArr.length > 0) {
            c5891fE.f(uriArr[0], null, AbstractC5177b.f(uriArr, 1));
        }
        return c5891fE;
    }

    public C5889d.e e(Uri... uriArr) {
        return new C5889d.e(d(null, uriArr));
    }

    public synchronized void f() {
        try {
            if (this.f40101d == null) {
                return;
            }
            Context context = (Context) this.f40098a.get();
            if (context != null) {
                context.unbindService(this.f40101d);
            }
            this.f40099b.set(null);
            C5176a.a("CustomTabsService is disconnected", new Object[0]);
        } catch (Throwable th) {
            throw th;
        }
    }

    public AbstractC5888c g() {
        try {
            this.f40100c.await(1L, TimeUnit.SECONDS);
        } catch (InterruptedException unused) {
            C5176a.f("Interrupted while waiting for browser connection", new Object[0]);
            this.f40100c.countDown();
        }
        return (AbstractC5888c) this.f40099b.get();
    }
}
