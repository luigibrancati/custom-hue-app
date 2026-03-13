package M;

import androidx.lifecycle.AbstractC2763t;
import fc.C4015H;
import kotlin.jvm.internal.AbstractC4862t;
import s.InterfaceC5702a;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public abstract class q extends androidx.lifecycle.u {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f8872b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final InterfaceC5702a f8873c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public AbstractC2763t f8874d;

    public q(Object obj, InterfaceC5702a mapFunction) {
        AbstractC4862t.e(mapFunction, "mapFunction");
        this.f8872b = obj;
        this.f8873c = mapFunction;
    }

    public static final void h(final q qVar, AbstractC2763t abstractC2763t) {
        final vc.l lVar = new vc.l() { // from class: M.o
            @Override // vc.l
            public final Object invoke(Object obj) {
                return q.i(this.f8870a, obj);
            }
        };
        super.b(abstractC2763t, new androidx.lifecycle.x() { // from class: M.p
            @Override // androidx.lifecycle.x
            public final void b(Object obj) {
                q.j(lVar, obj);
            }
        });
    }

    public static final C4015H i(q qVar, Object obj) {
        qVar.setValue(qVar.f8873c.apply(obj));
        return C4015H.f34254a;
    }

    public static final void j(vc.l lVar, Object obj) {
        lVar.invoke(obj);
    }

    public final void g(final AbstractC2763t liveDataSource) {
        AbstractC4862t.e(liveDataSource, "liveDataSource");
        AbstractC2763t abstractC2763t = this.f8874d;
        if (abstractC2763t != null) {
            AbstractC4862t.b(abstractC2763t);
            super.c(abstractC2763t);
        }
        this.f8874d = liveDataSource;
        x.e(new Runnable() { // from class: M.n
            @Override // java.lang.Runnable
            public final void run() {
                q.h(this.f8868a, liveDataSource);
            }
        });
    }

    @Override // androidx.lifecycle.AbstractC2763t
    public Object getValue() {
        AbstractC2763t abstractC2763t = this.f8874d;
        return abstractC2763t == null ? this.f8872b : this.f8873c.apply(abstractC2763t.getValue());
    }
}
