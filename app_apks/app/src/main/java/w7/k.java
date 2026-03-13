package w7;

import android.os.Bundle;
import b7.C2878l;
import com.google.android.play.core.review.internal.zzg;
import x7.q;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public abstract class k extends zzg {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final x7.f f46316a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final C2878l f46317b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ m f46318c;

    public k(m mVar, x7.f fVar, C2878l c2878l) {
        this.f46318c = mVar;
        this.f46316a = fVar;
        this.f46317b = c2878l;
    }

    @Override // x7.e
    public void Z(Bundle bundle) {
        q qVar = this.f46318c.f46320a;
        if (qVar != null) {
            qVar.u(this.f46317b);
        }
        this.f46316a.c("onGetLaunchReviewFlowInfo", new Object[0]);
    }
}
