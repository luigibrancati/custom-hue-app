package androidx.lifecycle;

import android.os.Bundle;
import fc.AbstractC4040w;
import fc.C4029l;
import fc.C4034q;
import fc.InterfaceC4028k;
import i3.AbstractC4342c;
import i3.AbstractC4349j;
import i3.C4345f;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Map;
import kotlin.jvm.internal.AbstractC4862t;
import vc.InterfaceC6082a;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public final class H implements C4345f.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C4345f f23401a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f23402b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Bundle f23403c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final InterfaceC4028k f23404d;

    public H(C4345f savedStateRegistry, final Q viewModelStoreOwner) {
        AbstractC4862t.e(savedStateRegistry, "savedStateRegistry");
        AbstractC4862t.e(viewModelStoreOwner, "viewModelStoreOwner");
        this.f23401a = savedStateRegistry;
        this.f23404d = C4029l.b(new InterfaceC6082a() { // from class: androidx.lifecycle.G
            @Override // vc.InterfaceC6082a
            public final Object invoke() {
                return H.f(viewModelStoreOwner);
            }
        });
    }

    public static final I f(Q q10) {
        return F.e(q10);
    }

    @Override // i3.C4345f.b
    public Bundle a() {
        C4034q[] c4034qArr;
        Map mapI = gc.Q.i();
        if (mapI.isEmpty()) {
            c4034qArr = new C4034q[0];
        } else {
            ArrayList arrayList = new ArrayList(mapI.size());
            for (Map.Entry entry : mapI.entrySet()) {
                arrayList.add(AbstractC4040w.a((String) entry.getKey(), entry.getValue()));
            }
            c4034qArr = (C4034q[]) arrayList.toArray(new C4034q[0]);
        }
        Bundle bundleA = U0.c.a((C4034q[]) Arrays.copyOf(c4034qArr, c4034qArr.length));
        Bundle bundleA2 = AbstractC4349j.a(bundleA);
        Bundle bundle = this.f23403c;
        if (bundle != null) {
            AbstractC4349j.b(bundleA2, bundle);
        }
        for (Map.Entry entry2 : d().e().entrySet()) {
            String str = (String) entry2.getKey();
            Bundle bundleA3 = ((C) entry2.getValue()).a().a();
            if (!AbstractC4342c.f(AbstractC4342c.a(bundleA3))) {
                AbstractC4349j.c(bundleA2, str, bundleA3);
            }
        }
        this.f23402b = false;
        return bundleA;
    }

    public final Bundle c(String key) {
        C4034q[] c4034qArr;
        AbstractC4862t.e(key, "key");
        e();
        Bundle bundle = this.f23403c;
        if (bundle == null || !AbstractC4342c.b(AbstractC4342c.a(bundle), key)) {
            return null;
        }
        Bundle bundleD = AbstractC4342c.d(AbstractC4342c.a(bundle), key);
        if (bundleD == null) {
            Map mapI = gc.Q.i();
            if (mapI.isEmpty()) {
                c4034qArr = new C4034q[0];
            } else {
                ArrayList arrayList = new ArrayList(mapI.size());
                for (Map.Entry entry : mapI.entrySet()) {
                    arrayList.add(AbstractC4040w.a((String) entry.getKey(), entry.getValue()));
                }
                c4034qArr = (C4034q[]) arrayList.toArray(new C4034q[0]);
            }
            bundleD = U0.c.a((C4034q[]) Arrays.copyOf(c4034qArr, c4034qArr.length));
            AbstractC4349j.a(bundleD);
        }
        AbstractC4349j.e(AbstractC4349j.a(bundle), key);
        if (AbstractC4342c.f(AbstractC4342c.a(bundle))) {
            this.f23403c = null;
        }
        return bundleD;
    }

    public final I d() {
        return (I) this.f23404d.getValue();
    }

    public final void e() {
        C4034q[] c4034qArr;
        if (this.f23402b) {
            return;
        }
        Bundle bundleA = this.f23401a.a("androidx.lifecycle.internal.SavedStateHandlesProvider");
        Map mapI = gc.Q.i();
        if (mapI.isEmpty()) {
            c4034qArr = new C4034q[0];
        } else {
            ArrayList arrayList = new ArrayList(mapI.size());
            for (Map.Entry entry : mapI.entrySet()) {
                arrayList.add(AbstractC4040w.a((String) entry.getKey(), entry.getValue()));
            }
            c4034qArr = (C4034q[]) arrayList.toArray(new C4034q[0]);
        }
        Bundle bundleA2 = U0.c.a((C4034q[]) Arrays.copyOf(c4034qArr, c4034qArr.length));
        Bundle bundleA3 = AbstractC4349j.a(bundleA2);
        Bundle bundle = this.f23403c;
        if (bundle != null) {
            AbstractC4349j.b(bundleA3, bundle);
        }
        if (bundleA != null) {
            AbstractC4349j.b(bundleA3, bundleA);
        }
        this.f23403c = bundleA2;
        this.f23402b = true;
        d();
    }
}
