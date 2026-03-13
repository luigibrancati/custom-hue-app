package com.google.firebase.crashlytics;

import com.google.firebase.components.ComponentRegistrar;
import h8.C4288f;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.ExecutorService;
import l8.InterfaceC4964a;
import n8.InterfaceC5149a;
import n8.b;
import n8.c;
import n9.InterfaceC5150a;
import o8.C5233c;
import o8.E;
import o8.InterfaceC5234d;
import o8.q;
import q8.h;
import q9.C5509b;
import q9.InterfaceC5510c;
import r8.InterfaceC5672a;
import r8.g;
import v8.i;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public class CrashlyticsRegistrar implements ComponentRegistrar {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final E f31594a = E.a(InterfaceC5149a.class, ExecutorService.class);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final E f31595b = E.a(b.class, ExecutorService.class);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final E f31596c = E.a(c.class, ExecutorService.class);

    static {
        C5509b.a(InterfaceC5510c.a.CRASHLYTICS);
    }

    public final h b(InterfaceC5234d interfaceC5234d) {
        i.f(false);
        long jCurrentTimeMillis = System.currentTimeMillis();
        h hVarF = h.f((C4288f) interfaceC5234d.get(C4288f.class), (P8.h) interfaceC5234d.get(P8.h.class), interfaceC5234d.h(InterfaceC5672a.class), interfaceC5234d.h(InterfaceC4964a.class), interfaceC5234d.h(InterfaceC5150a.class), (ExecutorService) interfaceC5234d.g(this.f31594a), (ExecutorService) interfaceC5234d.g(this.f31595b), (ExecutorService) interfaceC5234d.g(this.f31596c));
        long jCurrentTimeMillis2 = System.currentTimeMillis() - jCurrentTimeMillis;
        if (jCurrentTimeMillis2 > 16) {
            g.f().b("Initializing Crashlytics blocked main for " + jCurrentTimeMillis2 + " ms");
        }
        return hVarF;
    }

    @Override // com.google.firebase.components.ComponentRegistrar
    public List getComponents() {
        return Arrays.asList(C5233c.c(h.class).h("fire-cls").b(q.k(C4288f.class)).b(q.k(P8.h.class)).b(q.l(this.f31594a)).b(q.l(this.f31595b)).b(q.l(this.f31596c)).b(q.a(InterfaceC5672a.class)).b(q.a(InterfaceC4964a.class)).b(q.a(InterfaceC5150a.class)).f(new o8.g() { // from class: q8.f
            @Override // o8.g
            public final Object a(InterfaceC5234d interfaceC5234d) {
                return this.f43309a.b(interfaceC5234d);
            }
        }).e().d(), j9.h.b("fire-cls", "20.0.3"));
    }
}
