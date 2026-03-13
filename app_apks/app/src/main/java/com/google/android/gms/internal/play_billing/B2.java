package com.google.android.gms.internal.play_billing;

import java.util.Collections;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public final class B2 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static volatile B2 f30000b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final B2 f30001c = new B2(true);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Map f30002a = Collections.EMPTY_MAP;

    public B2(boolean z10) {
    }

    public static B2 a() {
        B2 b22 = f30000b;
        if (b22 != null) {
            return b22;
        }
        synchronized (B2.class) {
            try {
                B2 b23 = f30000b;
                if (b23 != null) {
                    return b23;
                }
                C3615t3 c3615t3 = C3615t3.f30246c;
                B2 b2B = J2.b(B2.class);
                f30000b = b2B;
                return b2B;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final N2 b(InterfaceC3568l3 interfaceC3568l3, int i10) {
        android.support.v4.media.session.a.a(this.f30002a.get(new A2(interfaceC3568l3, i10)));
        return null;
    }
}
