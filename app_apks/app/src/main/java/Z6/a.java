package Z6;

import android.accounts.Account;
import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.common.internal.a;
import p6.C5399a;
import s6.C5783b;
import t6.AbstractC5847e;
import v6.AbstractC6056k;
import v6.C6043A;
import v6.C6048c;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public class a extends com.google.android.gms.common.internal.c implements Y6.e {

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    public static final /* synthetic */ int f20291O = 0;

    /* JADX INFO: renamed from: K, reason: collision with root package name */
    public final boolean f20292K;

    /* JADX INFO: renamed from: L, reason: collision with root package name */
    public final C6048c f20293L;

    /* JADX INFO: renamed from: M, reason: collision with root package name */
    public final Bundle f20294M;

    /* JADX INFO: renamed from: N, reason: collision with root package name */
    public final Integer f20295N;

    public a(Context context, Looper looper, boolean z10, C6048c c6048c, Bundle bundle, AbstractC5847e.a aVar, AbstractC5847e.b bVar) {
        super(context, looper, 44, c6048c, aVar, bVar);
        this.f20292K = true;
        this.f20293L = c6048c;
        this.f20294M = bundle;
        this.f20295N = c6048c.h();
    }

    public static Bundle m0(C6048c c6048c) {
        c6048c.g();
        Integer numH = c6048c.h();
        Bundle bundle = new Bundle();
        bundle.putParcelable("com.google.android.gms.signin.internal.clientRequestedAccount", c6048c.a());
        if (numH != null) {
            bundle.putInt("com.google.android.gms.common.internal.ClientSettings.sessionId", numH.intValue());
        }
        bundle.putBoolean("com.google.android.gms.signin.internal.offlineAccessRequested", false);
        bundle.putBoolean("com.google.android.gms.signin.internal.idTokenRequested", false);
        bundle.putString("com.google.android.gms.signin.internal.serverClientId", null);
        bundle.putBoolean("com.google.android.gms.signin.internal.usePromptModeForAuthCode", true);
        bundle.putBoolean("com.google.android.gms.signin.internal.forceCodeForRefreshToken", false);
        bundle.putString("com.google.android.gms.signin.internal.hostedDomain", null);
        bundle.putString("com.google.android.gms.signin.internal.logSessionId", null);
        bundle.putBoolean("com.google.android.gms.signin.internal.waitForAccessTokenRefresh", false);
        return bundle;
    }

    @Override // com.google.android.gms.common.internal.a
    public final String D() {
        return "com.google.android.gms.signin.internal.ISignInService";
    }

    @Override // com.google.android.gms.common.internal.a
    public final String E() {
        return "com.google.android.gms.signin.service.START";
    }

    @Override // Y6.e
    public final void f() {
        d(new a.d(this));
    }

    @Override // Y6.e
    public final void g(d dVar) {
        AbstractC6056k.m(dVar, "Expecting a valid ISignInCallbacks");
        try {
            Account accountB = this.f20293L.b();
            ((e) C()).I6(new h(1, new C6043A(accountB, ((Integer) AbstractC6056k.l(this.f20295N)).intValue(), "<<default account>>".equals(accountB.name) ? C5399a.a(x()).b() : null)), dVar);
        } catch (RemoteException e10) {
            Log.w("SignInClientImpl", "Remote service probably died when signIn is called");
            try {
                dVar.b5(new j(1, new C5783b(8, null), null));
            } catch (RemoteException unused) {
                Log.wtf("SignInClientImpl", "ISignInCallbacks#onSignInComplete should be executed from the same process, unexpected RemoteException.", e10);
            }
        }
    }

    @Override // com.google.android.gms.common.internal.a, t6.C5843a.f
    public final boolean h() {
        return this.f20292K;
    }

    @Override // com.google.android.gms.common.internal.a, t6.C5843a.f
    public final int m() {
        return 12451000;
    }

    @Override // com.google.android.gms.common.internal.a
    public final /* synthetic */ IInterface r(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.signin.internal.ISignInService");
        return iInterfaceQueryLocalInterface instanceof e ? (e) iInterfaceQueryLocalInterface : new e(iBinder);
    }

    @Override // com.google.android.gms.common.internal.a
    public final Bundle z() {
        C6048c c6048c = this.f20293L;
        if (!x().getPackageName().equals(c6048c.d())) {
            this.f20294M.putString("com.google.android.gms.signin.internal.realClientPackageName", c6048c.d());
        }
        return this.f20294M;
    }
}
