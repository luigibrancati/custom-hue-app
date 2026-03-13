package y1;

import androidx.lifecycle.N;
import androidx.lifecycle.O;
import androidx.lifecycle.P;
import kotlin.jvm.internal.AbstractC4862t;
import z1.f;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final P f48337a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final O.c f48338b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final AbstractC6382a f48339c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final z1.d f48340d;

    public d(P store, O.c factory, AbstractC6382a defaultExtras) {
        AbstractC4862t.e(store, "store");
        AbstractC4862t.e(factory, "factory");
        AbstractC4862t.e(defaultExtras, "defaultExtras");
        this.f48337a = store;
        this.f48338b = factory;
        this.f48339c = defaultExtras;
        this.f48340d = new z1.d();
    }

    public static /* synthetic */ N e(d dVar, Cc.d dVar2, String str, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            str = f.f48702a.c(dVar2);
        }
        return dVar.d(dVar2, str);
    }

    public final N d(Cc.d modelClass, String key) {
        N nB;
        AbstractC4862t.e(modelClass, "modelClass");
        AbstractC4862t.e(key, "key");
        synchronized (this.f48340d) {
            try {
                nB = this.f48337a.b(key);
                if (modelClass.e(nB)) {
                    if (this.f48338b instanceof O.e) {
                        O.e eVar = (O.e) this.f48338b;
                        AbstractC4862t.b(nB);
                        eVar.d(nB);
                    }
                    AbstractC4862t.c(nB, "null cannot be cast to non-null type T of androidx.lifecycle.viewmodel.ViewModelProviderImpl.getViewModel");
                } else {
                    C6383b c6383b = new C6383b(this.f48339c);
                    c6383b.c(O.f23421c, key);
                    nB = e.a(this.f48338b, modelClass, c6383b);
                    this.f48337a.d(key, nB);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return nB;
    }
}
