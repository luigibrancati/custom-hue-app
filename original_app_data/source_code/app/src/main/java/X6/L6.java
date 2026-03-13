package X6;

import android.os.Bundle;
import java.util.Objects;
import v6.AbstractC6056k;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public final class L6 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ String f18403a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f18404b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Bundle f18405c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ M6 f18406d;

    public L6(M6 m62, String str, String str2, Bundle bundle) {
        this.f18403a = str;
        this.f18404b = str2;
        this.f18405c = bundle;
        Objects.requireNonNull(m62);
        this.f18406d = m62;
    }

    @Override // java.lang.Runnable
    public final void run() {
        R6 r62 = this.f18406d.f18417a;
        a7 a7VarN0 = r62.N0();
        long jA = r62.e().a();
        String str = this.f18403a;
        r62.i((I) AbstractC6056k.l(a7VarN0.R(str, this.f18404b, this.f18405c, "auto", jA, false, true)), str);
    }
}
