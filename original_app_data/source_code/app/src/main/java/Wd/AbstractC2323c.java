package Wd;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.jvm.internal.AbstractC4862t;

/* JADX INFO: renamed from: Wd.c, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC2323c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f17919a = AtomicReferenceFieldUpdater.newUpdater(AbstractC2323c.class, Object.class, "_next$volatile");

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f17920b = AtomicReferenceFieldUpdater.newUpdater(AbstractC2323c.class, Object.class, "_prev$volatile");
    private volatile /* synthetic */ Object _next$volatile;
    private volatile /* synthetic */ Object _prev$volatile;

    public AbstractC2323c(AbstractC2323c abstractC2323c) {
        this._prev$volatile = abstractC2323c;
    }

    public final void c() {
        f17920b.set(this, null);
    }

    public final AbstractC2323c d() {
        AbstractC2323c abstractC2323cH = h();
        while (abstractC2323cH != null && abstractC2323cH.k()) {
            abstractC2323cH = (AbstractC2323c) f17920b.get(abstractC2323cH);
        }
        return abstractC2323cH;
    }

    public final AbstractC2323c e() {
        AbstractC2323c abstractC2323cF;
        AbstractC2323c abstractC2323cF2 = f();
        AbstractC4862t.b(abstractC2323cF2);
        while (abstractC2323cF2.k() && (abstractC2323cF = abstractC2323cF2.f()) != null) {
            abstractC2323cF2 = abstractC2323cF;
        }
        return abstractC2323cF2;
    }

    public final AbstractC2323c f() {
        Object objG = g();
        if (objG == AbstractC2322b.f17918a) {
            return null;
        }
        return (AbstractC2323c) objG;
    }

    public final Object g() {
        return f17919a.get(this);
    }

    public final AbstractC2323c h() {
        return (AbstractC2323c) f17920b.get(this);
    }

    public abstract boolean k();

    public final boolean l() {
        return f() == null;
    }

    public final boolean m() {
        return B0.b.a(f17919a, this, null, AbstractC2322b.f17918a);
    }

    public final void n() {
        Object obj;
        if (l()) {
            return;
        }
        while (true) {
            AbstractC2323c abstractC2323cD = d();
            AbstractC2323c abstractC2323cE = e();
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f17920b;
            do {
                obj = atomicReferenceFieldUpdater.get(abstractC2323cE);
            } while (!B0.b.a(atomicReferenceFieldUpdater, abstractC2323cE, obj, ((AbstractC2323c) obj) == null ? null : abstractC2323cD));
            if (abstractC2323cD != null) {
                f17919a.set(abstractC2323cD, abstractC2323cE);
            }
            if (!abstractC2323cE.k() || abstractC2323cE.l()) {
                if (abstractC2323cD == null || !abstractC2323cD.k()) {
                    return;
                }
            }
        }
    }

    public final boolean o(AbstractC2323c abstractC2323c) {
        return B0.b.a(f17919a, this, null, abstractC2323c);
    }
}
