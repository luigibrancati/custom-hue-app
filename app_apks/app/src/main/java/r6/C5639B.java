package r6;

import android.os.Bundle;

/* JADX INFO: renamed from: r6.B, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public final class C5639B extends AbstractC5670z {
    public C5639B(int i10, int i11, Bundle bundle) {
        super(i10, i11, bundle);
    }

    @Override // r6.AbstractC5670z
    public final void a(Bundle bundle) {
        Bundle bundle2 = bundle.getBundle("data");
        if (bundle2 == null) {
            bundle2 = Bundle.EMPTY;
        }
        d(bundle2);
    }

    @Override // r6.AbstractC5670z
    public final boolean b() {
        return false;
    }
}
