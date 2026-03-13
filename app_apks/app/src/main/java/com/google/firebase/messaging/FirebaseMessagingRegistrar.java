package com.google.firebase.messaging;

import androidx.annotation.Keep;
import com.google.firebase.components.ComponentRegistrar;
import h8.C4288f;
import java.util.Arrays;
import java.util.List;
import o8.C5233c;
import o8.InterfaceC5234d;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
@Keep
public class FirebaseMessagingRegistrar implements ComponentRegistrar {
    private static final String LIBRARY_NAME = "fire-fcm";

    public static /* synthetic */ FirebaseMessaging a(o8.E e10, InterfaceC5234d interfaceC5234d) {
        C4288f c4288f = (C4288f) interfaceC5234d.get(C4288f.class);
        android.support.v4.media.session.a.a(interfaceC5234d.get(N8.a.class));
        return new FirebaseMessaging(c4288f, null, interfaceC5234d.e(j9.i.class), interfaceC5234d.e(M8.j.class), (P8.h) interfaceC5234d.get(P8.h.class), interfaceC5234d.b(e10), (L8.d) interfaceC5234d.get(L8.d.class));
    }

    @Override // com.google.firebase.components.ComponentRegistrar
    @Keep
    public List<C5233c> getComponents() {
        final o8.E eA = o8.E.a(F8.b.class, Y5.j.class);
        return Arrays.asList(C5233c.c(FirebaseMessaging.class).h(LIBRARY_NAME).b(o8.q.k(C4288f.class)).b(o8.q.h(N8.a.class)).b(o8.q.i(j9.i.class)).b(o8.q.i(M8.j.class)).b(o8.q.k(P8.h.class)).b(o8.q.j(eA)).b(o8.q.k(L8.d.class)).f(new o8.g() { // from class: com.google.firebase.messaging.E
            @Override // o8.g
            public final Object a(InterfaceC5234d interfaceC5234d) {
                return FirebaseMessagingRegistrar.a(eA, interfaceC5234d);
            }
        }).c().d(), j9.h.b(LIBRARY_NAME, "25.0.1"));
    }
}
