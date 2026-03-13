package com.braze.models.outgoing;

import com.braze.configuration.BrazeConfigurationProvider;
import com.braze.enums.DeviceKey;
import com.braze.support.BrazeLogger;
import kotlin.jvm.internal.AbstractC4862t;
import org.json.JSONObject;
import vc.InterfaceC6082a;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public final class g {
    public final void a(BrazeConfigurationProvider configurationProvider, JSONObject deviceExport, final DeviceKey exportKey, Object obj) {
        AbstractC4862t.e(configurationProvider, "configurationProvider");
        AbstractC4862t.e(deviceExport, "deviceExport");
        AbstractC4862t.e(exportKey, "exportKey");
        if (!configurationProvider.isDeviceObjectAllowlistEnabled() || configurationProvider.getDeviceObjectAllowlist().contains(exportKey)) {
            deviceExport.putOpt(exportKey.getKey(), obj);
        } else {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.f28627V, (Throwable) null, false, new InterfaceC6082a() { // from class: h5.i
                @Override // vc.InterfaceC6082a
                public final Object invoke() {
                    return com.braze.models.outgoing.g.a(exportKey);
                }
            }, 6, (Object) null);
        }
    }

    public static final String a(DeviceKey deviceKey) {
        return "Not adding device key <" + deviceKey + "> to export due to allowlist restrictions.";
    }
}
