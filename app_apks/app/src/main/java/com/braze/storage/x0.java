package com.braze.storage;

import com.braze.enums.DataStoreKey;
import com.braze.support.BrazeLogger;
import i1.C4319d;
import k1.AbstractC4785h;
import k1.AbstractC4788k;
import k1.C4781d;
import kotlin.jvm.internal.AbstractC4862t;
import vc.InterfaceC6082a;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public final class x0 {
    public final AbstractC4785h a(C4319d sharedPrefs, AbstractC4785h currentData) {
        String str = "";
        AbstractC4862t.e(sharedPrefs, "sharedPrefs");
        AbstractC4862t.e(currentData, "currentData");
        DataStoreKey dataStoreKey = DataStoreKey.LEGACY_DEVICE_ID;
        if (currentData.b(AbstractC4788k.g(dataStoreKey.getKey()))) {
            return currentData;
        }
        try {
            C4781d c4781dD = currentData.d();
            String strD = sharedPrefs.d(DataStoreKey.DEVICE_ID.getKey(), "");
            if (strD != null) {
                str = strD;
            }
            c4781dD.l(AbstractC4788k.g(dataStoreKey.getKey()), str);
            return c4781dD;
        } catch (Exception e10) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.f28625E, (Throwable) e10, false, new InterfaceC6082a() { // from class: r5.z3
                @Override // vc.InterfaceC6082a
                public final Object invoke() {
                    return com.braze.storage.x0.a();
                }
            }, 4, (Object) null);
            return currentData;
        }
    }

    public static final String a() {
        return "Failed to migrate legacy device id to DataStore.";
    }
}
