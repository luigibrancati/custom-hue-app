package com.google.firebase.analytics.connector.internal;

import L8.d;
import android.annotation.SuppressLint;
import android.content.Context;
import androidx.annotation.Keep;
import com.google.firebase.analytics.connector.internal.AnalyticsConnectorRegistrar;
import com.google.firebase.components.ComponentRegistrar;
import h8.C4288f;
import j9.h;
import java.util.Arrays;
import java.util.List;
import l8.C4965b;
import l8.InterfaceC4964a;
import o8.C5233c;
import o8.InterfaceC5234d;
import o8.g;
import o8.q;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
@Keep
public class AnalyticsConnectorRegistrar implements ComponentRegistrar {
    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ InterfaceC4964a lambda$getComponents$0(InterfaceC5234d interfaceC5234d) {
        return C4965b.h((C4288f) interfaceC5234d.get(C4288f.class), (Context) interfaceC5234d.get(Context.class), (d) interfaceC5234d.get(d.class));
    }

    @Override // com.google.firebase.components.ComponentRegistrar
    @Keep
    @SuppressLint({"MissingPermission"})
    public List<C5233c> getComponents() {
        return Arrays.asList(C5233c.c(InterfaceC4964a.class).b(q.k(C4288f.class)).b(q.k(Context.class)).b(q.k(d.class)).f(new g() { // from class: m8.a
            @Override // o8.g
            public final /* synthetic */ Object a(InterfaceC5234d interfaceC5234d) {
                return AnalyticsConnectorRegistrar.lambda$getComponents$0(interfaceC5234d);
            }
        }).e().d(), h.b("fire-analytics", "23.0.0"));
    }
}
