package D4;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AbstractC4862t;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String f2268a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public String f2269b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final List f2270c = new ArrayList();

    public final boolean a(F4.e plugin, a amplitude) {
        boolean zAdd;
        AbstractC4862t.e(plugin, "plugin");
        AbstractC4862t.e(amplitude, "amplitude");
        synchronized (this.f2270c) {
            plugin.e(amplitude);
            zAdd = this.f2270c.add(plugin);
        }
        return zAdd;
    }

    public final String b() {
        return this.f2269b;
    }

    public final String c() {
        return this.f2268a;
    }

    public final void d(String str) {
        this.f2269b = str;
        Iterator it = this.f2270c.iterator();
        while (it.hasNext()) {
            ((F4.e) it.next()).h(str);
        }
    }

    public final void e(String str) {
        this.f2268a = str;
        Iterator it = this.f2270c.iterator();
        while (it.hasNext()) {
            ((F4.e) it.next()).i(str);
        }
    }
}
