package x;

import E.C0821x;
import L.C1089b0;
import android.content.Context;
import android.media.CamcorderProfile;
import android.os.Build;
import android.util.Size;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public final class J0 implements L.G {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f46634a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Map f46635b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final InterfaceC6216e f46636c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final y.t f46637d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Context f46638e;

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public class a implements InterfaceC6216e {
        @Override // x.InterfaceC6216e
        public CamcorderProfile a(int i10, int i11) {
            return CamcorderProfile.get(i10, i11);
        }

        @Override // x.InterfaceC6216e
        public boolean b(int i10, int i11) {
            return CamcorderProfile.hasProfile(i10, i11);
        }
    }

    public J0(Context context, Object obj, Set set) {
        this(context, new a(), obj, set);
    }

    @Override // L.A0
    public void d(List list) throws C1089b0 {
        HashSet<String> hashSet;
        HashMap map = new HashMap();
        synchronized (this.f46634a) {
            hashSet = new HashSet(list);
            hashSet.removeAll(this.f46635b.keySet());
        }
        try {
            for (String str : hashSet) {
                map.put(str, i(str));
            }
            synchronized (this.f46634a) {
                try {
                    HashMap map2 = new HashMap();
                    Iterator it = list.iterator();
                    while (it.hasNext()) {
                        String str2 = (String) it.next();
                        if (this.f46635b.containsKey(str2)) {
                            map2.put(str2, (T1) this.f46635b.get(str2));
                        } else {
                            map2.put(str2, (T1) map.get(str2));
                        }
                    }
                    this.f46635b.clear();
                    this.f46635b.putAll(map2);
                } catch (Throwable th) {
                    throw th;
                }
            }
        } catch (C0821x | RuntimeException e10) {
            throw new C1089b0("Failed to create SupportedSurfaceCombination", e10);
        }
    }

    @Override // L.G
    public L.j1 e(int i10, String str, List list, Map map, boolean z10, boolean z11, boolean z12, boolean z13) {
        X0.h.b(!map.isEmpty(), "No new use cases to be bound.");
        T1 t12 = (T1) this.f46635b.get(str);
        X0.h.b(t12 != null, "No such camera id in supported combination list: " + str);
        return t12.K(i10, list, map, z10, z11, z12, z13);
    }

    @Override // L.G
    public L.h1 h(int i10, String str, int i11, Size size, L.f1 f1Var) {
        T1 t12 = (T1) this.f46635b.get(str);
        X0.h.b(t12 != null, "No such camera id in supported combination list: " + str);
        return t12.a0(i10, i11, size, f1Var);
    }

    public final T1 i(String str) {
        H.a kVar = H.a.f4784b;
        if (Build.VERSION.SDK_INT >= 35) {
            kVar = new w.k(this.f46638e, str, this.f46637d);
        }
        return new T1(this.f46638e, str, this.f46637d, this.f46636c, kVar);
    }

    public J0(Context context, InterfaceC6216e interfaceC6216e, Object obj, Set set) throws C0821x {
        this.f46634a = new Object();
        this.f46635b = new HashMap();
        X0.h.g(interfaceC6216e);
        this.f46636c = interfaceC6216e;
        this.f46638e = context;
        if (obj instanceof y.t) {
            this.f46637d = (y.t) obj;
        } else {
            this.f46637d = y.t.a(context);
        }
        try {
            d(new ArrayList(set));
        } catch (C1089b0 e10) {
            if (!(e10.getCause() instanceof C0821x)) {
                throw new C0821x(3, e10);
            }
            throw ((C0821x) e10.getCause());
        }
    }
}
