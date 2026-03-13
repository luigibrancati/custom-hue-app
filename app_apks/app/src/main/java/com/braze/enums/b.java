package com.braze.enums;

import com.braze.support.BrazeLogger;
import java.util.Map;
import kotlin.jvm.internal.AbstractC4862t;
import vc.InterfaceC6082a;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public final class b {
    public static final String b(String str) {
        return "DataStoreKey not found for key: " + str;
    }

    public final DataStoreKey a(final String key) {
        AbstractC4862t.e(key, "key");
        DataStoreKey dataStoreKey = (DataStoreKey) ((Map) DataStoreKey.keyMap$delegate.getValue()).get(key);
        if (dataStoreKey == null) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.f28628W, (Throwable) null, false, new InterfaceC6082a() { // from class: Y4.f
                @Override // vc.InterfaceC6082a
                public final Object invoke() {
                    return com.braze.enums.b.b(key);
                }
            }, 6, (Object) null);
        }
        return dataStoreKey;
    }
}
