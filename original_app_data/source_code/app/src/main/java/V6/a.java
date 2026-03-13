package V6;

import X6.C2416j3;
import X6.R4;
import android.os.Bundle;
import java.util.List;
import java.util.Map;
import v6.AbstractC6056k;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public final class a extends c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C2416j3 f17268a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final R4 f17269b;

    public a(C2416j3 c2416j3) {
        super(null);
        AbstractC6056k.l(c2416j3);
        this.f17268a = c2416j3;
        this.f17269b = c2416j3.B();
    }

    @Override // X6.S4
    public final void a(String str, String str2, Bundle bundle) {
        this.f17269b.p(str, str2, bundle);
    }

    @Override // X6.S4
    public final void b(Bundle bundle) {
        this.f17269b.M(bundle);
    }

    @Override // X6.S4
    public final void c(String str) {
        C2416j3 c2416j3 = this.f17268a;
        c2416j3.M().j(str, c2416j3.e().c());
    }

    @Override // X6.S4
    public final void d(String str) {
        C2416j3 c2416j3 = this.f17268a;
        c2416j3.M().i(str, c2416j3.e().c());
    }

    @Override // X6.S4
    public final int e(String str) {
        this.f17269b.L(str);
        return 25;
    }

    @Override // X6.S4
    public final String f() {
        return this.f17269b.Q();
    }

    @Override // X6.S4
    public final String g() {
        return this.f17269b.R();
    }

    @Override // X6.S4
    public final String h() {
        return this.f17269b.S();
    }

    @Override // X6.S4
    public final Map i(String str, String str2, boolean z10) {
        return this.f17269b.C(str, str2, z10);
    }

    @Override // X6.S4
    public final long j() {
        return this.f17268a.C().p0();
    }

    @Override // X6.S4
    public final String k() {
        return this.f17269b.D();
    }

    @Override // X6.S4
    public final void l(String str, String str2, Bundle bundle) {
        this.f17268a.B().O(str, str2, bundle);
    }

    @Override // X6.S4
    public final List m(String str, String str2) {
        return this.f17269b.P(str, str2);
    }
}
