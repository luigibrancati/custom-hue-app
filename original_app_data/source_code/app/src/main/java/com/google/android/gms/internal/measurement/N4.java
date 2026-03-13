package com.google.android.gms.internal.measurement;

import java.util.Collections;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public final class N4 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static volatile N4 f29286b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final N4 f29287c = new N4(true);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Map f29288a = Collections.EMPTY_MAP;

    public N4(boolean z10) {
    }

    public static N4 a() {
        N4 n42 = f29286b;
        if (n42 != null) {
            return n42;
        }
        synchronized (N4.class) {
            try {
                N4 n43 = f29286b;
                if (n43 != null) {
                    return n43;
                }
                K5 k52 = K5.f29253c;
                N4 n4B = U4.b(N4.class);
                f29286b = n4B;
                return n4B;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final Z4 b(C5 c52, int i10) {
        android.support.v4.media.session.a.a(this.f29288a.get(new M4(c52, i10)));
        return null;
    }
}
