package com.google.mlkit.vision.common.internal;

import O6.N5;
import com.google.firebase.components.ComponentRegistrar;
import com.google.mlkit.vision.common.internal.a;
import java.util.List;
import o8.C5233c;
import o8.InterfaceC5234d;
import o8.g;
import o8.q;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public class VisionCommonRegistrar implements ComponentRegistrar {
    @Override // com.google.firebase.components.ComponentRegistrar
    public final List getComponents() {
        return N5.n(C5233c.c(a.class).b(q.o(a.C0376a.class)).f(new g() { // from class: Z9.i
            @Override // o8.g
            public final Object a(InterfaceC5234d interfaceC5234d) {
                return new com.google.mlkit.vision.common.internal.a(interfaceC5234d.c(a.C0376a.class));
            }
        }).d());
    }
}
