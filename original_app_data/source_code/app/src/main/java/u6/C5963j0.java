package u6;

import android.content.Intent;
import android.os.Bundle;
import android.os.Looper;
import b0.C2777a;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.Collections;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: renamed from: u6.j0, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public final class C5963j0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Map f45193a = Collections.synchronizedMap(new C2777a());

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f45194b = 0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Bundle f45195c;

    public final AbstractC5956g a(String str, Class cls) {
        return (AbstractC5956g) cls.cast(this.f45193a.get(str));
    }

    public final void b(String str, AbstractC5956g abstractC5956g) {
        Map map = this.f45193a;
        if (map.containsKey(str)) {
            StringBuilder sb2 = new StringBuilder(String.valueOf(str).length() + 59);
            sb2.append("LifecycleCallback with tag ");
            sb2.append(str);
            sb2.append(" already added to this fragment.");
            throw new IllegalArgumentException(sb2.toString());
        }
        map.put(str, abstractC5956g);
        if (this.f45194b > 0) {
            new J6.o(Looper.getMainLooper()).post(new RunnableC5961i0(this, abstractC5956g, str));
        }
    }

    public final void c(Bundle bundle) {
        this.f45194b = 1;
        this.f45195c = bundle;
        for (Map.Entry entry : this.f45193a.entrySet()) {
            ((AbstractC5956g) entry.getValue()).f(bundle != null ? bundle.getBundle((String) entry.getKey()) : null);
        }
    }

    public final void d() {
        this.f45194b = 2;
        Iterator it = this.f45193a.values().iterator();
        while (it.hasNext()) {
            ((AbstractC5956g) it.next()).j();
        }
    }

    public final void e() {
        this.f45194b = 3;
        Iterator it = this.f45193a.values().iterator();
        while (it.hasNext()) {
            ((AbstractC5956g) it.next()).h();
        }
    }

    public final void f(int i10, int i11, Intent intent) {
        Iterator it = this.f45193a.values().iterator();
        while (it.hasNext()) {
            ((AbstractC5956g) it.next()).e(i10, i11, intent);
        }
    }

    public final void g(Bundle bundle) {
        if (bundle == null) {
            return;
        }
        for (Map.Entry entry : this.f45193a.entrySet()) {
            Bundle bundle2 = new Bundle();
            ((AbstractC5956g) entry.getValue()).i(bundle2);
            bundle.putBundle((String) entry.getKey(), bundle2);
        }
    }

    public final void h() {
        this.f45194b = 4;
        Iterator it = this.f45193a.values().iterator();
        while (it.hasNext()) {
            ((AbstractC5956g) it.next()).k();
        }
    }

    public final void i() {
        this.f45194b = 5;
        Iterator it = this.f45193a.values().iterator();
        while (it.hasNext()) {
            ((AbstractC5956g) it.next()).g();
        }
    }

    public final void j(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        Iterator it = this.f45193a.values().iterator();
        while (it.hasNext()) {
            ((AbstractC5956g) it.next()).a(str, fileDescriptor, printWriter, strArr);
        }
    }

    public final /* synthetic */ int k() {
        return this.f45194b;
    }

    public final /* synthetic */ Bundle l() {
        return this.f45195c;
    }
}
