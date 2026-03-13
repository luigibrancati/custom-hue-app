package com.braze.managers;

import com.braze.configuration.BrazeConfigurationProvider;
import com.braze.enums.LocationProviderName;
import com.braze.support.BrazeLogger;
import java.util.EnumSet;
import kotlin.jvm.internal.AbstractC4862t;
import kotlin.jvm.internal.L;
import vc.InterfaceC6082a;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public final class o {
    public final EnumSet a(BrazeConfigurationProvider appConfigurationProvider) {
        AbstractC4862t.e(appConfigurationProvider, "appConfigurationProvider");
        final L l10 = new L();
        l10.f39776a = EnumSet.of(LocationProviderName.PASSIVE, LocationProviderName.NETWORK);
        if (!appConfigurationProvider.getCustomLocationProviderNames().isEmpty()) {
            l10.f39776a = appConfigurationProvider.getCustomLocationProviderNames();
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.f28627V, (Throwable) null, false, new InterfaceC6082a() { // from class: c5.s2
                @Override // vc.InterfaceC6082a
                public final Object invoke() {
                    return com.braze.managers.o.a(l10);
                }
            }, 6, (Object) null);
        }
        Object element = l10.f39776a;
        AbstractC4862t.d(element, "element");
        return (EnumSet) element;
    }

    public static final String a(L l10) {
        return "Using location providers: " + l10.f39776a;
    }
}
