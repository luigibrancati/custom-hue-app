package com.braze.managers;

import android.content.Context;
import com.braze.enums.DataStoreKey;
import java.util.UUID;
import kotlin.jvm.internal.AbstractC4862t;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public final class y implements o0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final com.braze.storage.z0 f28026a;

    public y(Context context, String apiKey) {
        AbstractC4862t.e(context, "context");
        AbstractC4862t.e(apiKey, "apiKey");
        this.f28026a = new com.braze.storage.z0(context, apiKey);
    }

    public final String a() {
        com.braze.storage.z0 z0Var = this.f28026a;
        DataStoreKey dataStoreKey = DataStoreKey.DEVICE_ID;
        String string = z0Var.readString(dataStoreKey, null);
        if (string == null) {
            com.braze.storage.z0 z0Var2 = this.f28026a;
            DataStoreKey dataStoreKey2 = DataStoreKey.LEGACY_DEVICE_ID;
            string = z0Var2.readString(dataStoreKey2, null);
            this.f28026a.clearData(dataStoreKey2);
        }
        com.braze.storage.z0 z0Var3 = this.f28026a;
        DataStoreKey dataStoreKey3 = DataStoreKey.PERSISTENT_DEVICE_ID;
        if ((z0Var3.contains(dataStoreKey3) ? !AbstractC4862t.a(this.f28026a.readString(dataStoreKey3, null), String.valueOf(722989291)) : false) || string == null) {
            string = UUID.randomUUID().toString();
            AbstractC4862t.d(string, "toString(...)");
        }
        this.f28026a.writeData(dataStoreKey, string);
        this.f28026a.writeData(dataStoreKey3, String.valueOf(722989291));
        return string;
    }
}
