package E6;

import android.os.Bundle;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public final class e implements i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Bundle f3327a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ a f3328b;

    public e(a aVar, Bundle bundle) {
        this.f3327a = bundle;
        Objects.requireNonNull(aVar);
        this.f3328b = aVar;
    }

    @Override // E6.i
    public final int a() {
        return 1;
    }

    @Override // E6.i
    public final void b(b bVar) {
        this.f3328b.k().J(this.f3327a);
    }
}
