package e9;

import com.google.firebase.perf.network.FirebasePerfOkHttpClient;
import com.google.firebase.perf.util.l;
import h9.k;
import java.io.IOException;
import pe.C;
import pe.C5464A;
import pe.InterfaceC5469e;
import pe.InterfaceC5470f;
import pe.v;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public class g implements InterfaceC5470f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final InterfaceC5470f f33863a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final c9.h f33864b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final l f33865c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long f33866d;

    public g(InterfaceC5470f interfaceC5470f, k kVar, l lVar, long j10) {
        this.f33863a = interfaceC5470f;
        this.f33864b = c9.h.c(kVar);
        this.f33866d = j10;
        this.f33865c = lVar;
    }

    @Override // pe.InterfaceC5470f
    public void a(InterfaceC5469e interfaceC5469e, IOException iOException) {
        C5464A c5464aD = interfaceC5469e.d();
        if (c5464aD != null) {
            v vVarK = c5464aD.k();
            if (vVarK != null) {
                this.f33864b.v(vVarK.s().toString());
            }
            if (c5464aD.i() != null) {
                this.f33864b.j(c5464aD.i());
            }
        }
        this.f33864b.n(this.f33866d);
        this.f33864b.t(this.f33865c.c());
        h.d(this.f33864b);
        this.f33863a.a(interfaceC5469e, iOException);
    }

    @Override // pe.InterfaceC5470f
    public void b(InterfaceC5469e interfaceC5469e, C c10) {
        FirebasePerfOkHttpClient.a(c10, this.f33864b, this.f33866d, this.f33865c.c());
        this.f33863a.b(interfaceC5469e, c10);
    }
}
