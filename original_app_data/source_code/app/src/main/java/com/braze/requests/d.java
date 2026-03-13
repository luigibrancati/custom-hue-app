package com.braze.requests;

import com.braze.support.BrazeLogger;
import vc.InterfaceC6082a;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public abstract class d {
    public static void a(final Object obj, InterfaceC6082a interfaceC6082a) {
        try {
            interfaceC6082a.invoke();
        } catch (Exception e10) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, obj, BrazeLogger.Priority.f28625E, (Throwable) e10, false, new InterfaceC6082a() { // from class: n5.o
                @Override // vc.InterfaceC6082a
                public final Object invoke() {
                    return com.braze.requests.d.a(obj);
                }
            }, 4, (Object) null);
        }
    }

    public static final String a(Object obj) {
        return "Encountered exception while parsing server response for " + obj;
    }
}
