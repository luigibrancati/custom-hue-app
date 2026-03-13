package com.google.mlkit.vision.barcode.internal;

import N6.AbstractC1487t0;
import R9.C2106d;
import R9.C2111i;
import X9.i;
import com.google.firebase.components.ComponentRegistrar;
import java.util.List;
import o8.C5233c;
import o8.InterfaceC5234d;
import o8.g;
import o8.q;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public class BarcodeRegistrar implements ComponentRegistrar {
    @Override // com.google.firebase.components.ComponentRegistrar
    public final List getComponents() {
        return AbstractC1487t0.l(C5233c.c(i.class).b(q.k(C2111i.class)).f(new g() { // from class: X9.c
            @Override // o8.g
            public final Object a(InterfaceC5234d interfaceC5234d) {
                return new i((C2111i) interfaceC5234d.get(C2111i.class));
            }
        }).d(), C5233c.c(X9.g.class).b(q.k(i.class)).b(q.k(C2106d.class)).b(q.k(C2111i.class)).f(new g() { // from class: X9.d
            @Override // o8.g
            public final Object a(InterfaceC5234d interfaceC5234d) {
                return new g((i) interfaceC5234d.get(i.class), (C2106d) interfaceC5234d.get(C2106d.class), (C2111i) interfaceC5234d.get(C2111i.class));
            }
        }).d());
    }
}
