package com.google.firebase.datatransport;

import F8.b;
import Y5.j;
import Z5.a;
import android.content.Context;
import androidx.annotation.Keep;
import b6.u;
import com.google.firebase.components.ComponentRegistrar;
import com.google.firebase.datatransport.TransportRegistrar;
import j9.h;
import java.util.Arrays;
import java.util.List;
import o8.C5233c;
import o8.E;
import o8.InterfaceC5234d;
import o8.g;
import o8.q;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
@Keep
public class TransportRegistrar implements ComponentRegistrar {
    private static final String LIBRARY_NAME = "fire-transport";

    public static /* synthetic */ j a(InterfaceC5234d interfaceC5234d) {
        u.f((Context) interfaceC5234d.get(Context.class));
        return u.c().g(a.f20273g);
    }

    public static /* synthetic */ j b(InterfaceC5234d interfaceC5234d) {
        u.f((Context) interfaceC5234d.get(Context.class));
        return u.c().g(a.f20274h);
    }

    public static /* synthetic */ j c(InterfaceC5234d interfaceC5234d) {
        u.f((Context) interfaceC5234d.get(Context.class));
        return u.c().g(a.f20274h);
    }

    @Override // com.google.firebase.components.ComponentRegistrar
    public List<C5233c> getComponents() {
        return Arrays.asList(C5233c.c(j.class).h(LIBRARY_NAME).b(q.k(Context.class)).f(new g() { // from class: F8.c
            @Override // o8.g
            public final Object a(InterfaceC5234d interfaceC5234d) {
                return TransportRegistrar.c(interfaceC5234d);
            }
        }).d(), C5233c.e(E.a(F8.a.class, j.class)).b(q.k(Context.class)).f(new g() { // from class: F8.d
            @Override // o8.g
            public final Object a(InterfaceC5234d interfaceC5234d) {
                return TransportRegistrar.b(interfaceC5234d);
            }
        }).d(), C5233c.e(E.a(b.class, j.class)).b(q.k(Context.class)).f(new g() { // from class: F8.e
            @Override // o8.g
            public final Object a(InterfaceC5234d interfaceC5234d) {
                return TransportRegistrar.a(interfaceC5234d);
            }
        }).d(), h.b(LIBRARY_NAME, "19.0.0"));
    }
}
