package L;

import B0.c;
import E.AbstractC0807p0;
import E.C0803n0;
import E.C0821x;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public class W implements A0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f7957a = new Object();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Map f7958b = new LinkedHashMap();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Set f7959c = new HashSet();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public O7.e f7960d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public c.a f7961e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public H f7962f;

    public static /* synthetic */ void i(W w10, J j10) {
        synchronized (w10.f7957a) {
            try {
                w10.f7959c.remove(j10);
                if (w10.f7959c.isEmpty()) {
                    X0.h.g(w10.f7961e);
                    w10.f7961e.c(null);
                    w10.f7961e = null;
                    w10.f7960d = null;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public static /* synthetic */ Object j(W w10, c.a aVar) {
        synchronized (w10.f7957a) {
            w10.f7961e = aVar;
        }
        return "CameraRepository-deinit";
    }

    @Override // L.A0
    public void d(List list) throws C1089b0 {
        HashSet<String> hashSet;
        HashMap map = new HashMap();
        synchronized (this.f7957a) {
            hashSet = new HashSet(list);
            hashSet.removeAll(this.f7958b.keySet());
        }
        try {
            for (String str : hashSet) {
                map.put(str, this.f7962f.b(str));
            }
            synchronized (this.f7957a) {
                try {
                    HashSet hashSet2 = new HashSet(this.f7958b.keySet());
                    hashSet2.removeAll(list);
                    ArrayList<J> arrayList = new ArrayList();
                    Iterator it = hashSet2.iterator();
                    while (it.hasNext()) {
                        arrayList.add((J) this.f7958b.get((String) it.next()));
                    }
                    LinkedHashMap linkedHashMap = new LinkedHashMap();
                    Iterator it2 = list.iterator();
                    while (it2.hasNext()) {
                        String str2 = (String) it2.next();
                        if (this.f7958b.containsKey(str2)) {
                            linkedHashMap.put(str2, (J) this.f7958b.get(str2));
                        } else {
                            linkedHashMap.put(str2, (J) map.get(str2));
                        }
                    }
                    this.f7958b.clear();
                    this.f7958b.putAll(linkedHashMap);
                    for (J j10 : arrayList) {
                        if (j10 != null) {
                            j10.o();
                        }
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        } catch (C0821x e10) {
            throw new C1089b0("Failed to create CameraInternal", e10);
        }
    }

    public O7.e k() {
        synchronized (this.f7957a) {
            try {
                if (this.f7958b.isEmpty()) {
                    O7.e eVarP = this.f7960d;
                    if (eVarP == null) {
                        eVarP = O.n.p(null);
                    }
                    return eVarP;
                }
                O7.e eVarA = this.f7960d;
                if (eVarA == null) {
                    eVarA = B0.c.a(new c.InterfaceC0018c() { // from class: L.U
                        @Override // B0.c.InterfaceC0018c
                        public final Object a(c.a aVar) {
                            return W.j(this.f7944a, aVar);
                        }
                    });
                    this.f7960d = eVarA;
                }
                this.f7959c.addAll(this.f7958b.values());
                for (final J j10 : this.f7958b.values()) {
                    j10.release().b(new Runnable() { // from class: L.V
                        @Override // java.lang.Runnable
                        public final void run() {
                            W.i(this.f7951a, j10);
                        }
                    }, N.a.a());
                }
                this.f7958b.clear();
                return eVarA;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public J l(String str) {
        J j10;
        synchronized (this.f7957a) {
            try {
                j10 = (J) this.f7958b.get(str);
                if (j10 == null) {
                    throw new IllegalArgumentException("Invalid camera: " + str);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return j10;
    }

    public LinkedHashSet m() {
        LinkedHashSet linkedHashSet;
        synchronized (this.f7957a) {
            linkedHashSet = new LinkedHashSet(this.f7958b.values());
        }
        return linkedHashSet;
    }

    public void n(H h10) {
        this.f7962f = h10;
        synchronized (this.f7957a) {
            try {
                for (String str : h10.d()) {
                    AbstractC0807p0.a("CameraRepository", "Added camera: " + str);
                    J j10 = (J) this.f7958b.put(str, h10.b(str));
                    if (j10 != null) {
                        j10.release();
                    }
                }
            } catch (C0821x e10) {
                throw new C0803n0(e10);
            }
        }
    }
}
