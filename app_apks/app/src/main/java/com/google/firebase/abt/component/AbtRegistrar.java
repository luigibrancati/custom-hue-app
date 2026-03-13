package com.google.firebase.abt.component;

import android.content.Context;
import androidx.annotation.Keep;
import com.google.firebase.abt.component.AbtRegistrar;
import com.google.firebase.components.ComponentRegistrar;
import j8.C4747a;
import j9.h;
import java.util.Arrays;
import java.util.List;
import l8.InterfaceC4964a;
import o8.C5233c;
import o8.InterfaceC5234d;
import o8.g;
import o8.q;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
@Keep
public class AbtRegistrar implements ComponentRegistrar {
    private static final String LIBRARY_NAME = "fire-abt";

    public static /* synthetic */ C4747a a(InterfaceC5234d interfaceC5234d) {
        return new C4747a((Context) interfaceC5234d.get(Context.class), interfaceC5234d.e(InterfaceC4964a.class));
    }

    @Override // com.google.firebase.components.ComponentRegistrar
    public List<C5233c> getComponents() {
        return Arrays.asList(C5233c.c(C4747a.class).h(LIBRARY_NAME).b(q.k(Context.class)).b(q.i(InterfaceC4964a.class)).f(new g() { // from class: j8.b
            @Override // o8.g
            public final Object a(InterfaceC5234d interfaceC5234d) {
                return AbtRegistrar.a(interfaceC5234d);
            }
        }).d(), h.b(LIBRARY_NAME, "21.1.1"));
    }
}
