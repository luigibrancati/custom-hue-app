package u6;

import java.util.Objects;
import u6.ComponentCallbacks2C5948c;

/* JADX INFO: renamed from: u6.v, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public final class C5976v implements ComponentCallbacks2C5948c.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C5952e f45225a;

    public C5976v(C5952e c5952e) {
        Objects.requireNonNull(c5952e);
        this.f45225a = c5952e;
    }

    @Override // u6.ComponentCallbacks2C5948c.a
    public final void a(boolean z10) {
        Boolean boolValueOf = Boolean.valueOf(z10);
        C5952e c5952e = this.f45225a;
        c5952e.f().sendMessage(c5952e.f().obtainMessage(1, boolValueOf));
    }
}
