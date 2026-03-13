package com.google.firebase.remoteconfig;

import P8.h;
import android.content.Context;
import androidx.annotation.Keep;
import com.google.firebase.components.ComponentRegistrar;
import com.google.firebase.remoteconfig.RemoteConfigRegistrar;
import h8.C4288f;
import j8.C4747a;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.ScheduledExecutorService;
import k9.z;
import l8.InterfaceC4964a;
import n8.b;
import n9.InterfaceC5150a;
import o8.C5233c;
import o8.E;
import o8.InterfaceC5234d;
import o8.g;
import o8.q;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
@Keep
public class RemoteConfigRegistrar implements ComponentRegistrar {
    private static final String LIBRARY_NAME = "fire-rc";

    public static /* synthetic */ z a(E e10, InterfaceC5234d interfaceC5234d) {
        return new z((Context) interfaceC5234d.get(Context.class), (ScheduledExecutorService) interfaceC5234d.g(e10), (C4288f) interfaceC5234d.get(C4288f.class), (h) interfaceC5234d.get(h.class), ((C4747a) interfaceC5234d.get(C4747a.class)).b("frc"), interfaceC5234d.e(InterfaceC4964a.class));
    }

    @Override // com.google.firebase.components.ComponentRegistrar
    public List<C5233c> getComponents() {
        final E eA = E.a(b.class, ScheduledExecutorService.class);
        return Arrays.asList(C5233c.d(z.class, InterfaceC5150a.class).h(LIBRARY_NAME).b(q.k(Context.class)).b(q.l(eA)).b(q.k(C4288f.class)).b(q.k(h.class)).b(q.k(C4747a.class)).b(q.i(InterfaceC4964a.class)).f(new g() { // from class: k9.A
            @Override // o8.g
            public final Object a(InterfaceC5234d interfaceC5234d) {
                return RemoteConfigRegistrar.a(eA, interfaceC5234d);
            }
        }).e().d(), j9.h.b(LIBRARY_NAME, "23.0.1"));
    }
}
