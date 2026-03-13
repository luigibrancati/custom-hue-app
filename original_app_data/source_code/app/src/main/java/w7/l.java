package w7;

import android.app.PendingIntent;
import android.os.Bundle;
import b7.C2878l;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public final class l extends k {
    public l(m mVar, C2878l c2878l, String str) {
        super(mVar, new x7.f("OnRequestInstallCallback"), c2878l);
    }

    @Override // w7.k, x7.e
    public final void Z(Bundle bundle) {
        super.Z(bundle);
        this.f46317b.e(new C6162e((PendingIntent) bundle.get("confirmation_intent"), bundle.getBoolean("is_review_no_op")));
    }
}
