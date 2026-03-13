package u6;

import android.util.Log;
import com.google.android.gms.common.internal.IAccountAccessor;
import com.google.android.gms.common.internal.a;
import java.util.Objects;
import java.util.Set;
import s6.C5783b;
import t6.C5843a;

/* JADX INFO: renamed from: u6.D, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public final class C5922D implements a.c, InterfaceC5939V {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C5843a.f f45097a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final C5946b f45098b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public IAccountAccessor f45099c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Set f45100d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f45101e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ C5952e f45102f;

    public C5922D(C5952e c5952e, C5843a.f fVar, C5946b c5946b) {
        Objects.requireNonNull(c5952e);
        this.f45102f = c5952e;
        this.f45099c = null;
        this.f45100d = null;
        this.f45101e = false;
        this.f45097a = fVar;
        this.f45098b = c5946b;
    }

    @Override // u6.InterfaceC5939V
    public final void R(int i10) {
        C5919A c5919a = (C5919A) this.f45102f.c().get(this.f45098b);
        if (c5919a != null) {
            if (c5919a.b()) {
                c5919a.p(new C5783b(17));
            } else {
                c5919a.X(i10);
            }
        }
    }

    @Override // u6.InterfaceC5939V
    public final void S(C5783b c5783b) {
        C5919A c5919a = (C5919A) this.f45102f.c().get(this.f45098b);
        if (c5919a != null) {
            c5919a.p(c5783b);
        }
    }

    @Override // u6.InterfaceC5939V
    public final void T(IAccountAccessor iAccountAccessor, Set set) {
        if (iAccountAccessor == null || set == null) {
            Log.wtf("GoogleApiManager", "Received null response from onSignInSuccess", new Exception());
            S(new C5783b(4));
        } else {
            this.f45099c = iAccountAccessor;
            this.f45100d = set;
            b();
        }
    }

    @Override // com.google.android.gms.common.internal.a.c
    public final void a(C5783b c5783b) {
        this.f45102f.f().post(new RunnableC5921C(this, c5783b));
    }

    public final /* synthetic */ C5843a.f c() {
        return this.f45097a;
    }

    public final /* synthetic */ C5946b d() {
        return this.f45098b;
    }

    public final /* synthetic */ void e(boolean z10) {
        this.f45101e = true;
    }

    /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
    public final void b() {
        IAccountAccessor iAccountAccessor;
        if (!this.f45101e || (iAccountAccessor = this.f45099c) == null) {
            return;
        }
        this.f45097a.j(iAccountAccessor, this.f45100d);
    }
}
