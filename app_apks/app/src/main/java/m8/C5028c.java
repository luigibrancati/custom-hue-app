package m8;

import K7.AbstractC1085z;
import W6.a;
import X6.T3;
import android.os.Bundle;
import java.util.Objects;

/* JADX INFO: renamed from: m8.c, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public final class C5028c implements a.InterfaceC0241a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C5029d f40208a;

    public C5028c(C5029d c5029d) {
        Objects.requireNonNull(c5029d);
        this.f40208a = c5029d;
    }

    @Override // X6.X3
    public final void a(String str, String str2, Bundle bundle, long j10) {
        C5029d c5029d = this.f40208a;
        if (c5029d.f40209a.contains(str2)) {
            Bundle bundle2 = new Bundle();
            AbstractC1085z abstractC1085z = AbstractC5027b.f40202a;
            String strA = T3.a(str2);
            if (strA != null) {
                str2 = strA;
            }
            bundle2.putString("events", str2);
            c5029d.a().a(2, bundle2);
        }
    }
}
