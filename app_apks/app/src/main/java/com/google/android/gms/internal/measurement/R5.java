package com.google.android.gms.internal.measurement;

import java.util.Iterator;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public final class R5 extends V5 {
    public R5() {
        super(null);
    }

    @Override // com.google.android.gms.internal.measurement.V5
    public final void a() {
        if (!b()) {
            if (c() > 0) {
                android.support.v4.media.session.a.a(((S5) d(0)).a());
                throw null;
            }
            Iterator it = e().iterator();
            if (it.hasNext()) {
                android.support.v4.media.session.a.a(((Map.Entry) it.next()).getKey());
                throw null;
            }
        }
        super.a();
    }
}
