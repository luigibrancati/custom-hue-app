package X6;

import android.os.Bundle;
import android.text.TextUtils;
import java.util.Objects;

/* JADX INFO: renamed from: X6.u4, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public final class C2504u4 implements Z6 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ R4 f19243a;

    public C2504u4(R4 r42) {
        Objects.requireNonNull(r42);
        this.f19243a = r42;
    }

    @Override // X6.Z6
    public final void a(String str, String str2, Bundle bundle) {
        if (TextUtils.isEmpty(str)) {
            this.f19243a.p("auto", "_err", bundle);
        } else {
            this.f19243a.w("auto", "_err", bundle, str);
        }
    }
}
