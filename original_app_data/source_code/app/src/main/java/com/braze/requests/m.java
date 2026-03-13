package com.braze.requests;

import com.braze.support.BrazeLogger;
import kotlin.jvm.internal.AbstractC4862t;
import vc.InterfaceC6082a;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public final class m {
    public static final String b(String str) {
        return "No RequestEndpointDestination found for name: " + str;
    }

    public final n a(final String name) {
        AbstractC4862t.e(name, "name");
        try {
            return n.valueOf(name);
        } catch (Exception e10) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.f28625E, (Throwable) e10, false, new InterfaceC6082a() { // from class: n5.L
                @Override // vc.InterfaceC6082a
                public final Object invoke() {
                    return com.braze.requests.m.b(name);
                }
            }, 4, (Object) null);
            return null;
        }
    }
}
