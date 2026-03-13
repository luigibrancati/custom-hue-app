package com.google.mlkit.common.internal;

import M6.AbstractC1215f;
import Q9.c;
import R9.C2103a;
import R9.C2104b;
import R9.C2106d;
import R9.C2111i;
import R9.C2112j;
import R9.m;
import S9.a;
import com.google.firebase.components.ComponentRegistrar;
import java.util.List;
import o8.C5233c;
import o8.InterfaceC5234d;
import o8.g;
import o8.q;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public class CommonComponentRegistrar implements ComponentRegistrar {
    @Override // com.google.firebase.components.ComponentRegistrar
    public final List getComponents() {
        return AbstractC1215f.n(m.f14994b, C5233c.c(a.class).b(q.k(C2111i.class)).f(new g() { // from class: O9.a
            @Override // o8.g
            public final Object a(InterfaceC5234d interfaceC5234d) {
                return new S9.a((C2111i) interfaceC5234d.get(C2111i.class));
            }
        }).d(), C5233c.c(C2112j.class).f(new g() { // from class: O9.b
            @Override // o8.g
            public final Object a(InterfaceC5234d interfaceC5234d) {
                return new C2112j();
            }
        }).d(), C5233c.c(c.class).b(q.o(c.a.class)).f(new g() { // from class: O9.c
            @Override // o8.g
            public final Object a(InterfaceC5234d interfaceC5234d) {
                return new Q9.c(interfaceC5234d.c(c.a.class));
            }
        }).d(), C5233c.c(C2106d.class).b(q.m(C2112j.class)).f(new g() { // from class: O9.d
            @Override // o8.g
            public final Object a(InterfaceC5234d interfaceC5234d) {
                return new C2106d(interfaceC5234d.e(C2112j.class));
            }
        }).d(), C5233c.c(C2103a.class).f(new g() { // from class: O9.e
            @Override // o8.g
            public final Object a(InterfaceC5234d interfaceC5234d) {
                return C2103a.a();
            }
        }).d(), C5233c.c(C2104b.class).b(q.k(C2103a.class)).f(new g() { // from class: O9.f
            @Override // o8.g
            public final Object a(InterfaceC5234d interfaceC5234d) {
                return new C2104b((C2103a) interfaceC5234d.get(C2103a.class));
            }
        }).d(), C5233c.c(P9.a.class).b(q.k(C2111i.class)).f(new g() { // from class: O9.g
            @Override // o8.g
            public final Object a(InterfaceC5234d interfaceC5234d) {
                return new P9.a((C2111i) interfaceC5234d.get(C2111i.class));
            }
        }).d(), C5233c.m(c.a.class).b(q.m(P9.a.class)).f(new g() { // from class: O9.h
            @Override // o8.g
            public final Object a(InterfaceC5234d interfaceC5234d) {
                return new c.a(Q9.a.class, interfaceC5234d.e(P9.a.class));
            }
        }).d());
    }
}
