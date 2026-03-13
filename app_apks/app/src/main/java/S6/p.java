package S6;

import T6.InterfaceC2231d;
import T6.L;
import android.os.Bundle;
import android.os.RemoteException;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.gms.dynamic.ObjectWrapper;
import v6.AbstractC6056k;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public final class p implements E6.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ViewGroup f15404a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final InterfaceC2231d f15405b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public View f15406c;

    public p(ViewGroup viewGroup, InterfaceC2231d interfaceC2231d) {
        this.f15405b = (InterfaceC2231d) AbstractC6056k.l(interfaceC2231d);
        this.f15404a = (ViewGroup) AbstractC6056k.l(viewGroup);
    }

    @Override // E6.b
    public final void A() {
        try {
            this.f15405b.A();
        } catch (RemoteException e10) {
            throw new U6.B(e10);
        }
    }

    @Override // E6.b
    public final void J(Bundle bundle) {
        try {
            Bundle bundle2 = new Bundle();
            L.b(bundle, bundle2);
            InterfaceC2231d interfaceC2231d = this.f15405b;
            interfaceC2231d.J(bundle2);
            L.b(bundle2, bundle);
            this.f15406c = (View) ObjectWrapper.unwrap(interfaceC2231d.getView());
            ViewGroup viewGroup = this.f15404a;
            viewGroup.removeAllViews();
            viewGroup.addView(this.f15406c);
        } catch (RemoteException e10) {
            throw new U6.B(e10);
        }
    }

    @Override // E6.b
    public final void S() {
        try {
            this.f15405b.S();
        } catch (RemoteException e10) {
            throw new U6.B(e10);
        }
    }

    @Override // E6.b
    public final void Y() {
        try {
            this.f15405b.Y();
        } catch (RemoteException e10) {
            throw new U6.B(e10);
        }
    }

    public final void a(g gVar) {
        try {
            this.f15405b.h6(new o(this, gVar));
        } catch (RemoteException e10) {
            throw new U6.B(e10);
        }
    }

    @Override // E6.b
    public final void onResume() {
        try {
            this.f15405b.onResume();
        } catch (RemoteException e10) {
            throw new U6.B(e10);
        }
    }

    @Override // E6.b
    public final void onSaveInstanceState(Bundle bundle) {
        try {
            Bundle bundle2 = new Bundle();
            L.b(bundle, bundle2);
            this.f15405b.onSaveInstanceState(bundle2);
            L.b(bundle2, bundle);
        } catch (RemoteException e10) {
            throw new U6.B(e10);
        }
    }

    @Override // E6.b
    public final void v() {
        try {
            this.f15405b.v();
        } catch (RemoteException e10) {
            throw new U6.B(e10);
        }
    }
}
