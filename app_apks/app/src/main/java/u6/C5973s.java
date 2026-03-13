package u6;

import b7.C2878l;
import com.google.android.gms.common.api.Status;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.WeakHashMap;
import t6.C5844b;

/* JADX INFO: renamed from: u6.s, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public final class C5973s {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Map f45220a = Collections.synchronizedMap(new WeakHashMap());

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Map f45221b = Collections.synchronizedMap(new WeakHashMap());

    public final void a(C2878l c2878l, boolean z10) {
        this.f45221b.put(c2878l, Boolean.valueOf(z10));
        c2878l.a().b(new C5957g0(this, c2878l));
    }

    public final boolean b() {
        return (this.f45220a.isEmpty() && this.f45221b.isEmpty()) ? false : true;
    }

    public final void c() {
        f(false, C5952e.f45152p);
    }

    public final void d(int i10, String str) {
        StringBuilder sb2 = new StringBuilder("The connection to Google Play services was lost");
        if (i10 == 1) {
            sb2.append(" due to service disconnection.");
        } else if (i10 == 3) {
            sb2.append(" due to dead object exception.");
        }
        if (str != null) {
            sb2.append(" Last reason for disconnect: ");
            sb2.append(str);
        }
        f(true, new Status(20, sb2.toString()));
    }

    public final /* synthetic */ Map e() {
        return this.f45221b;
    }

    public final void f(boolean z10, Status status) {
        HashMap map;
        HashMap map2;
        Map map3 = this.f45220a;
        synchronized (map3) {
            map = new HashMap(map3);
        }
        Map map4 = this.f45221b;
        synchronized (map4) {
            map2 = new HashMap(map4);
        }
        for (Map.Entry entry : map.entrySet()) {
            if (z10 || ((Boolean) entry.getValue()).booleanValue()) {
                android.support.v4.media.session.a.a(entry.getKey());
                throw null;
            }
        }
        for (Map.Entry entry2 : map2.entrySet()) {
            if (z10 || ((Boolean) entry2.getValue()).booleanValue()) {
                ((C2878l) entry2.getKey()).d(new C5844b(status));
            }
        }
    }
}
