package r6;

import android.os.Bundle;

/* JADX INFO: renamed from: r6.y, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public final class C5669y extends AbstractC5670z {
    public C5669y(int i10, int i11, Bundle bundle) {
        super(i10, i11, bundle);
    }

    @Override // r6.AbstractC5670z
    public final void a(Bundle bundle) {
        if (bundle.getBoolean("ack", false)) {
            d(null);
        } else {
            c(new C5638A(4, "Invalid response to one way request", null));
        }
    }

    @Override // r6.AbstractC5670z
    public final boolean b() {
        return true;
    }
}
