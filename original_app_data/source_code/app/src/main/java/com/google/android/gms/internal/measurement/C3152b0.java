package com.google.android.gms.internal.measurement;

import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Callable;

/* JADX INFO: renamed from: com.google.android.gms.internal.measurement.b0, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public final class C3152b0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C3305s1 f29414a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public T1 f29415b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final C3160c f29416c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final T7 f29417d;

    public C3152b0() {
        C3305s1 c3305s1 = new C3305s1();
        this.f29414a = c3305s1;
        this.f29415b = c3305s1.f29600b.c();
        this.f29416c = new C3160c();
        this.f29417d = new T7();
        c3305s1.f29602d.a("internal.registerCallback", new Callable() { // from class: com.google.android.gms.internal.measurement.B
            @Override // java.util.concurrent.Callable
            public final /* synthetic */ Object call() {
                return this.f29143a.g();
            }
        });
        c3305s1.f29602d.a("internal.eventLogger", new Callable() { // from class: com.google.android.gms.internal.measurement.a
            @Override // java.util.concurrent.Callable
            public final /* synthetic */ Object call() {
                return new W3(this.f29405a.f29416c);
            }
        });
    }

    public final void a(String str, Callable callable) {
        this.f29414a.f29602d.a(str, callable);
    }

    public final boolean b(C3151b c3151b) throws C3338w0 {
        try {
            C3160c c3160c = this.f29416c;
            c3160c.b(c3151b);
            this.f29414a.f29601c.e("runtime.counter", new C3214i(Double.valueOf(0.0d)));
            this.f29417d.b(this.f29415b.c(), c3160c);
            if (c()) {
                return true;
            }
            return d();
        } catch (Throwable th) {
            throw new C3338w0(th);
        }
    }

    public final boolean c() {
        C3160c c3160c = this.f29416c;
        return !c3160c.c().equals(c3160c.a());
    }

    public final boolean d() {
        return !this.f29416c.f().isEmpty();
    }

    public final C3160c e() {
        return this.f29416c;
    }

    public final void f(C3349x3 c3349x3) {
        AbstractC3223j abstractC3223j;
        try {
            C3305s1 c3305s1 = this.f29414a;
            this.f29415b = c3305s1.f29600b.c();
            if (c3305s1.a(this.f29415b, (B3[]) c3349x3.D().toArray(new B3[0])) instanceof C3205h) {
                throw new IllegalStateException("Program loading failed");
            }
            for (C3325u3 c3325u3 : c3349x3.E().D()) {
                List listE = c3325u3.E();
                String strD = c3325u3.D();
                Iterator it = listE.iterator();
                while (it.hasNext()) {
                    InterfaceC3277p interfaceC3277pA = c3305s1.a(this.f29415b, (B3) it.next());
                    if (!(interfaceC3277pA instanceof C3250m)) {
                        throw new IllegalArgumentException("Invalid rule definition");
                    }
                    T1 t12 = this.f29415b;
                    if (t12.d(strD)) {
                        InterfaceC3277p interfaceC3277pH = t12.h(strD);
                        if (!(interfaceC3277pH instanceof AbstractC3223j)) {
                            throw new IllegalStateException("Invalid function name: ".concat(String.valueOf(strD)));
                        }
                        abstractC3223j = (AbstractC3223j) interfaceC3277pH;
                    } else {
                        abstractC3223j = null;
                    }
                    if (abstractC3223j == null) {
                        throw new IllegalStateException("Rule function is undefined: ".concat(String.valueOf(strD)));
                    }
                    abstractC3223j.a(this.f29415b, Collections.singletonList(interfaceC3277pA));
                }
            }
        } catch (Throwable th) {
            throw new C3338w0(th);
        }
    }

    public final /* synthetic */ AbstractC3223j g() {
        return new P7(this.f29417d);
    }
}
