package C;

import D.h;
import E.AbstractC0807p0;
import E.C0803n0;
import E.InterfaceC0815u;
import F.a;
import L.C1089b0;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import x.T0;
import y.C6369e;
import y.t;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public class a implements F.a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final t f867b;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f866a = new Object();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Map f869d = new HashMap();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Set f870e = new HashSet();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public List f871f = new ArrayList();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f872g = 0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final List f868c = new ArrayList();

    public a(t tVar) {
        this.f867b = tVar;
        try {
            d(Arrays.asList(tVar.d()));
        } catch (C1089b0 | C6369e e10) {
            AbstractC0807p0.d("Camera2CameraCoordinator", "Failed to get concurrent camera ids", e10);
        }
    }

    @Override // F.a
    public void a(a.InterfaceC0051a interfaceC0051a) {
        synchronized (this.f866a) {
            this.f868c.add(interfaceC0051a);
        }
    }

    @Override // F.a
    public String b(String str) {
        synchronized (this.f866a) {
            try {
                if (!this.f869d.containsKey(str)) {
                    return null;
                }
                List<String> list = (List) this.f869d.get(str);
                if (list == null) {
                    return null;
                }
                for (String str2 : list) {
                    Iterator it = this.f871f.iterator();
                    while (it.hasNext()) {
                        if (str2.equals(h.a((InterfaceC0815u) it.next()).b())) {
                            return str2;
                        }
                    }
                }
                return null;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // F.a
    public int c() {
        int i10;
        synchronized (this.f866a) {
            i10 = this.f872g;
        }
        return i10;
    }

    @Override // L.A0
    public void d(List list) throws C1089b0 {
        HashMap map = new HashMap();
        HashSet hashSet = new HashSet();
        try {
            for (Set set : this.f867b.e()) {
                if (list.containsAll(set)) {
                    ArrayList arrayList = new ArrayList(set);
                    if (arrayList.size() >= 2) {
                        String str = (String) arrayList.get(0);
                        String str2 = (String) arrayList.get(1);
                        try {
                            if (T0.a(this.f867b, str) && T0.a(this.f867b, str2)) {
                                hashSet.add(new HashSet(Arrays.asList(str, str2)));
                                if (!map.containsKey(str)) {
                                    map.put(str, new ArrayList());
                                }
                                ((List) map.get(str)).add(str2);
                                if (!map.containsKey(str2)) {
                                    map.put(str2, new ArrayList());
                                }
                                ((List) map.get(str2)).add(str);
                            }
                        } catch (C0803n0 unused) {
                            AbstractC0807p0.a("Camera2CameraCoordinator", "Concurrent camera id pair: (" + str + ", " + str + ") is not backward compatible");
                        }
                    }
                }
            }
            synchronized (this.f866a) {
                this.f869d = map;
                this.f870e = hashSet;
                AbstractC0807p0.a("Camera2CameraCoordinator", "Updated concurrent camera map: " + this.f869d);
            }
        } catch (C6369e e10) {
            throw new C1089b0("Failed to retrieve concurrent camera id info.", e10);
        }
    }

    @Override // F.a
    public void g(int i10) {
        synchronized (this.f866a) {
            try {
                int i11 = this.f872g;
                if (i10 == i11) {
                    return;
                }
                this.f872g = i10;
                ArrayList arrayList = new ArrayList(this.f868c);
                if (i11 == 2 && i10 != 2) {
                    this.f871f.clear();
                }
                i(arrayList, i11, i10);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void i(List list, int i10, int i11) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            ((a.InterfaceC0051a) it.next()).a(i10, i11);
        }
    }

    @Override // F.a
    public void shutdown() {
        synchronized (this.f866a) {
            this.f868c.clear();
            this.f869d.clear();
            this.f871f.clear();
            this.f870e.clear();
            this.f872g = 0;
        }
    }
}
