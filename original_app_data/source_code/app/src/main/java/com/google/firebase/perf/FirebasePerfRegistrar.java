package com.google.firebase.perf;

import P8.h;
import W8.b;
import W8.e;
import Y5.j;
import Z8.a;
import a9.C2656a;
import androidx.annotation.Keep;
import com.google.firebase.components.ComponentRegistrar;
import com.google.firebase.perf.FirebasePerfRegistrar;
import h8.C4288f;
import h8.o;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.Executor;
import k9.z;
import n8.d;
import o8.C5233c;
import o8.E;
import o8.InterfaceC5234d;
import o8.g;
import o8.q;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
@Keep
public class FirebasePerfRegistrar implements ComponentRegistrar {
    private static final String EARLY_LIBRARY_NAME = "fire-perf-early";
    private static final String LIBRARY_NAME = "fire-perf";

    public static /* synthetic */ b b(E e10, InterfaceC5234d interfaceC5234d) {
        return new b((C4288f) interfaceC5234d.get(C4288f.class), (o) interfaceC5234d.e(o.class).get(), (Executor) interfaceC5234d.g(e10));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static e providesFirebasePerformance(InterfaceC5234d interfaceC5234d) {
        interfaceC5234d.get(b.class);
        return a.a().b(new C2656a((C4288f) interfaceC5234d.get(C4288f.class), (h) interfaceC5234d.get(h.class), interfaceC5234d.e(z.class), interfaceC5234d.e(j.class))).a().a();
    }

    @Override // com.google.firebase.components.ComponentRegistrar
    @Keep
    public List<C5233c> getComponents() {
        final E eA = E.a(d.class, Executor.class);
        return Arrays.asList(C5233c.c(e.class).h(LIBRARY_NAME).b(q.k(C4288f.class)).b(q.m(z.class)).b(q.k(h.class)).b(q.m(j.class)).b(q.k(b.class)).f(new g() { // from class: W8.c
            @Override // o8.g
            public final Object a(InterfaceC5234d interfaceC5234d) {
                return FirebasePerfRegistrar.providesFirebasePerformance(interfaceC5234d);
            }
        }).d(), C5233c.c(b.class).h(EARLY_LIBRARY_NAME).b(q.k(C4288f.class)).b(q.i(o.class)).b(q.l(eA)).e().f(new g() { // from class: W8.d
            @Override // o8.g
            public final Object a(InterfaceC5234d interfaceC5234d) {
                return FirebasePerfRegistrar.b(eA, interfaceC5234d);
            }
        }).d(), j9.h.b(LIBRARY_NAME, "22.0.4"));
    }
}
