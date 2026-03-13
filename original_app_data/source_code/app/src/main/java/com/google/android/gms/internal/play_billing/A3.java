package com.google.android.gms.internal.play_billing;

import java.util.Iterator;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public final class A3 extends F3 {
    public A3() {
        super(null);
    }

    @Override // com.google.android.gms.internal.play_billing.F3
    public final void a() {
        if (!j()) {
            if (c() > 0) {
                android.support.v4.media.session.a.a(((B3) g(0)).a());
                throw null;
            }
            Iterator it = d().iterator();
            if (it.hasNext()) {
                android.support.v4.media.session.a.a(((Map.Entry) it.next()).getKey());
                throw null;
            }
        }
        super.a();
    }
}
