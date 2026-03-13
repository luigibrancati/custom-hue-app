package X6;

import android.os.Bundle;
import android.text.TextUtils;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public final class M6 implements Z6 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ R6 f18417a;

    public M6(R6 r62) {
        Objects.requireNonNull(r62);
        this.f18417a = r62;
    }

    @Override // X6.Z6
    public final void a(String str, String str2, Bundle bundle) {
        if (!TextUtils.isEmpty(str)) {
            this.f18417a.b().t(new L6(this, str, str2, bundle));
            return;
        }
        R6 r62 = this.f18417a;
        if (r62.x0() != null) {
            r62.x0().a().o().b("AppId not known when logging event", str2);
        }
    }
}
