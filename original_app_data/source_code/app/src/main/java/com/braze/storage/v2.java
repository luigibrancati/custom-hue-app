package com.braze.storage;

import android.content.Context;
import com.braze.enums.DataStoreKey;
import com.braze.support.BrazeLogger;
import kotlin.jvm.internal.AbstractC4862t;
import vc.InterfaceC6082a;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public final class v2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final u2 f28596a;

    public v2(Context context) {
        AbstractC4862t.e(context, "context");
        this.f28596a = new u2(context);
    }

    public final boolean a() {
        return AbstractC4862t.a(this.f28596a.readBoolean(DataStoreKey.SDK_ENABLEMENT, Boolean.FALSE), Boolean.TRUE);
    }

    public final void b(final boolean z10) {
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.f28626I, (Throwable) null, false, new InterfaceC6082a() { // from class: r5.q3
            @Override // vc.InterfaceC6082a
            public final Object invoke() {
                return com.braze.storage.v2.a(z10);
            }
        }, 6, (Object) null);
        this.f28596a.writeData(DataStoreKey.SDK_ENABLEMENT, Boolean.valueOf(z10));
    }

    public static final String a(boolean z10) {
        return "Setting Braze SDK disabled to: " + z10;
    }
}
