package androidx.lifecycle;

import android.os.Handler;
import androidx.lifecycle.AbstractC2754j;
import kotlin.jvm.internal.AbstractC4862t;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public class L {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C2759o f23413a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Handler f23414b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public a f23415c;

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class a implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final C2759o f23416a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final AbstractC2754j.a f23417b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public boolean f23418c;

        public a(C2759o registry, AbstractC2754j.a event) {
            AbstractC4862t.e(registry, "registry");
            AbstractC4862t.e(event, "event");
            this.f23416a = registry;
            this.f23417b = event;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (this.f23418c) {
                return;
            }
            this.f23416a.h(this.f23417b);
            this.f23418c = true;
        }
    }

    public L(InterfaceC2758n provider) {
        AbstractC4862t.e(provider, "provider");
        this.f23413a = new C2759o(provider);
        this.f23414b = new Handler();
    }

    public AbstractC2754j a() {
        return this.f23413a;
    }

    public void b() {
        f(AbstractC2754j.a.ON_START);
    }

    public void c() {
        f(AbstractC2754j.a.ON_CREATE);
    }

    public void d() {
        f(AbstractC2754j.a.ON_STOP);
        f(AbstractC2754j.a.ON_DESTROY);
    }

    public void e() {
        f(AbstractC2754j.a.ON_START);
    }

    public final void f(AbstractC2754j.a aVar) {
        a aVar2 = this.f23415c;
        if (aVar2 != null) {
            aVar2.run();
        }
        a aVar3 = new a(this.f23413a, aVar);
        this.f23415c = aVar3;
        Handler handler = this.f23414b;
        AbstractC4862t.b(aVar3);
        handler.postAtFrontOfQueue(aVar3);
    }
}
