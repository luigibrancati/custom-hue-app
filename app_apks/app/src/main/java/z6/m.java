package z6;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import s6.C5785d;
import u6.InterfaceC5950d;
import u6.InterfaceC5964k;
import v6.C6048c;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public final class m extends com.google.android.gms.common.internal.c {
    public m(Context context, Looper looper, C6048c c6048c, InterfaceC5950d interfaceC5950d, InterfaceC5964k interfaceC5964k) {
        super(context, looper, 308, c6048c, interfaceC5950d, interfaceC5964k);
    }

    @Override // com.google.android.gms.common.internal.a
    public final String D() {
        return "com.google.android.gms.common.moduleinstall.internal.IModuleInstallService";
    }

    @Override // com.google.android.gms.common.internal.a
    public final String E() {
        return "com.google.android.gms.chimera.container.moduleinstall.ModuleInstallService.START";
    }

    @Override // com.google.android.gms.common.internal.a
    public final boolean H() {
        return true;
    }

    @Override // com.google.android.gms.common.internal.a
    public final boolean S() {
        return true;
    }

    @Override // com.google.android.gms.common.internal.a, t6.C5843a.f
    public final int m() {
        return 17895000;
    }

    @Override // com.google.android.gms.common.internal.a
    public final /* synthetic */ IInterface r(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.moduleinstall.internal.IModuleInstallService");
        return iInterfaceQueryLocalInterface instanceof C6522e ? (C6522e) iInterfaceQueryLocalInterface : new C6522e(iBinder);
    }

    @Override // com.google.android.gms.common.internal.a
    public final C5785d[] u() {
        return H6.f.f5327b;
    }
}
