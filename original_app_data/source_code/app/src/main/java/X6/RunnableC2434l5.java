package X6;

import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.internal.measurement.InterfaceC3304s0;
import java.util.List;
import java.util.Objects;
import v6.AbstractC6056k;

/* JADX INFO: renamed from: X6.l5, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public final class RunnableC2434l5 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ String f19085a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f19086b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ c7 f19087c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ boolean f19088d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ InterfaceC3304s0 f19089e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ U5 f19090f;

    public RunnableC2434l5(U5 u52, String str, String str2, c7 c7Var, boolean z10, InterfaceC3304s0 interfaceC3304s0) {
        this.f19085a = str;
        this.f19086b = str2;
        this.f19087c = c7Var;
        this.f19088d = z10;
        this.f19089e = interfaceC3304s0;
        Objects.requireNonNull(u52);
        this.f19090f = u52;
    }

    @Override // java.lang.Runnable
    public final void run() throws Throwable {
        Bundle bundle;
        RemoteException e10;
        Bundle bundle2 = new Bundle();
        try {
            U5 u52 = this.f19090f;
            InterfaceC2407i2 interfaceC2407i2N = u52.N();
            if (interfaceC2407i2N == null) {
                C2416j3 c2416j3 = u52.f18400a;
                c2416j3.a().o().c("Failed to get user properties; not connected to service", this.f19085a, this.f19086b);
                c2416j3.C().f0(this.f19089e, bundle2);
                return;
            }
            c7 c7Var = this.f19087c;
            AbstractC6056k.l(c7Var);
            List<W6> listL3 = interfaceC2407i2N.l3(this.f19085a, this.f19086b, this.f19088d, c7Var);
            String[] strArr = a7.f18699i;
            bundle = new Bundle();
            if (listL3 != null) {
                for (W6 w62 : listL3) {
                    String str = w62.f18643e;
                    if (str != null) {
                        bundle.putString(w62.f18640b, str);
                    } else {
                        Long l10 = w62.f18642d;
                        if (l10 != null) {
                            bundle.putLong(w62.f18640b, l10.longValue());
                        } else {
                            Double d10 = w62.f18645g;
                            if (d10 != null) {
                                bundle.putDouble(w62.f18640b, d10.doubleValue());
                            }
                        }
                    }
                }
            }
            try {
                try {
                    u52.J();
                    C2416j3 c2416j32 = u52.f18400a;
                    c2416j32.C().f0(this.f19089e, bundle);
                } catch (Throwable th) {
                    th = th;
                    bundle2 = bundle;
                    U5 u53 = this.f19090f;
                    u53.f18400a.C().f0(this.f19089e, bundle2);
                    throw th;
                }
            } catch (RemoteException e11) {
                e10 = e11;
                this.f19090f.f18400a.a().o().c("Failed to get user properties; remote exception", this.f19085a, e10);
                U5 u54 = this.f19090f;
                u54.f18400a.C().f0(this.f19089e, bundle);
            }
        } catch (RemoteException e12) {
            bundle = bundle2;
            e10 = e12;
        } catch (Throwable th2) {
            th = th2;
            U5 u532 = this.f19090f;
            u532.f18400a.C().f0(this.f19089e, bundle2);
            throw th;
        }
    }
}
