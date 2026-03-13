package n4;

import android.content.ComponentCallbacks2;
import android.content.Context;
import android.content.res.Configuration;
import fc.C4015H;
import h4.InterfaceC4273c;
import java.lang.ref.WeakReference;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.jvm.internal.AbstractC4854k;
import kotlin.jvm.internal.AbstractC4862t;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public final class m implements ComponentCallbacks2, InterfaceC4273c.b {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final a f40568f = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f40569a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final WeakReference f40570b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final InterfaceC4273c f40571c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public volatile boolean f40572d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final AtomicBoolean f40573e;

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class a {
        public /* synthetic */ a(AbstractC4854k abstractC4854k) {
            this();
        }

        public a() {
        }
    }

    public m(Y3.e imageLoader, Context context, boolean z10) {
        AbstractC4862t.e(imageLoader, "imageLoader");
        AbstractC4862t.e(context, "context");
        this.f40569a = context;
        this.f40570b = new WeakReference(imageLoader);
        InterfaceC4273c.a aVar = InterfaceC4273c.f36248a;
        imageLoader.h();
        InterfaceC4273c interfaceC4273cA = aVar.a(context, z10, this, null);
        this.f40571c = interfaceC4273cA;
        this.f40572d = interfaceC4273cA.a();
        this.f40573e = new AtomicBoolean(false);
        context.registerComponentCallbacks(this);
    }

    @Override // h4.InterfaceC4273c.b
    public void a(boolean z10) {
        Y3.e eVar = (Y3.e) this.f40570b.get();
        if (eVar == null) {
            c();
        } else {
            this.f40572d = z10;
            eVar.h();
        }
    }

    public final boolean b() {
        return this.f40572d;
    }

    public final void c() {
        if (this.f40573e.getAndSet(true)) {
            return;
        }
        this.f40569a.unregisterComponentCallbacks(this);
        this.f40571c.shutdown();
    }

    @Override // android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration newConfig) {
        AbstractC4862t.e(newConfig, "newConfig");
        if (((Y3.e) this.f40570b.get()) == null) {
            c();
        }
    }

    @Override // android.content.ComponentCallbacks
    public void onLowMemory() {
        onTrimMemory(80);
    }

    @Override // android.content.ComponentCallbacks2
    public void onTrimMemory(int i10) {
        C4015H c4015h;
        Y3.e eVar = (Y3.e) this.f40570b.get();
        if (eVar == null) {
            c4015h = null;
        } else {
            eVar.l(i10);
            c4015h = C4015H.f34254a;
        }
        if (c4015h == null) {
            c();
        }
    }
}
