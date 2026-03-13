package com.google.firebase.installations;

import M8.i;
import P8.g;
import P8.h;
import androidx.annotation.Keep;
import com.google.firebase.components.ComponentRegistrar;
import com.google.firebase.installations.FirebaseInstallationsRegistrar;
import h8.C4288f;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import n8.InterfaceC5149a;
import n8.b;
import o8.C5233c;
import o8.E;
import o8.InterfaceC5234d;
import o8.q;
import p8.y;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
@Keep
public class FirebaseInstallationsRegistrar implements ComponentRegistrar {
    private static final String LIBRARY_NAME = "fire-installations";

    public static /* synthetic */ h a(InterfaceC5234d interfaceC5234d) {
        return new g((C4288f) interfaceC5234d.get(C4288f.class), interfaceC5234d.e(i.class), (ExecutorService) interfaceC5234d.g(E.a(InterfaceC5149a.class, ExecutorService.class)), y.b((Executor) interfaceC5234d.g(E.a(b.class, Executor.class))));
    }

    @Override // com.google.firebase.components.ComponentRegistrar
    public List<C5233c> getComponents() {
        return Arrays.asList(C5233c.c(h.class).h(LIBRARY_NAME).b(q.k(C4288f.class)).b(q.i(i.class)).b(q.l(E.a(InterfaceC5149a.class, ExecutorService.class))).b(q.l(E.a(b.class, Executor.class))).f(new o8.g() { // from class: P8.j
            @Override // o8.g
            public final Object a(InterfaceC5234d interfaceC5234d) {
                return FirebaseInstallationsRegistrar.a(interfaceC5234d);
            }
        }).d(), M8.h.a(), j9.h.b(LIBRARY_NAME, "19.0.1"));
    }
}
