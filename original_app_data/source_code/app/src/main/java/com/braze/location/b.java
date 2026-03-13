package com.braze.location;

import android.content.Context;
import com.braze.configuration.BrazeConfigurationProvider;
import java.util.EnumSet;
import kotlin.jvm.internal.AbstractC4862t;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public final class b {
    public b(Context context, EnumSet allowedProviders, BrazeConfigurationProvider appConfigurationProvider) {
        AbstractC4862t.e(context, "context");
        AbstractC4862t.e(allowedProviders, "allowedProviders");
        AbstractC4862t.e(appConfigurationProvider, "appConfigurationProvider");
        try {
            Object objNewInstance = Class.forName("com.braze.location.BrazeInternalLocationApi").getDeclaredConstructor(null).newInstance(null);
            AbstractC4862t.c(objNewInstance, "null cannot be cast to non-null type com.braze.location.IBrazeLocationApi");
            android.support.v4.media.session.a.a(objNewInstance);
        } catch (Exception unused) {
        }
    }
}
