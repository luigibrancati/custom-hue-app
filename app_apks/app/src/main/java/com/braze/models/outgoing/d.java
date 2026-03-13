package com.braze.models.outgoing;

import Od.C;
import Od.F;
import com.braze.support.BrazeLogger;
import kotlin.jvm.internal.AbstractC4862t;
import vc.InterfaceC6082a;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public final class d {
    public static final String b() {
        return "The leading character in the key string may not be '$'. Not adding property.";
    }

    public final boolean a(String key) {
        AbstractC4862t.e(key, "key");
        if (F.k0(key)) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.f28628W, (Throwable) null, false, new InterfaceC6082a() { // from class: h5.f
                @Override // vc.InterfaceC6082a
                public final Object invoke() {
                    return com.braze.models.outgoing.d.a();
                }
            }, 6, (Object) null);
            return false;
        }
        if (!C.P(key, "$", false, 2, null)) {
            return true;
        }
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.f28628W, (Throwable) null, false, new InterfaceC6082a() { // from class: h5.g
            @Override // vc.InterfaceC6082a
            public final Object invoke() {
                return com.braze.models.outgoing.d.b();
            }
        }, 6, (Object) null);
        return false;
    }

    public static final String a() {
        return "The BrazeProperties key cannot be null or contain only whitespaces. Not adding property.";
    }
}
