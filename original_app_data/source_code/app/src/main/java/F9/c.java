package F9;

import L9.a;
import com.google.android.gms.maps.model.LatLng;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public class c extends F9.a {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final K9.b f3770e = new K9.b(1.0d);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f3771b = 100;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Collection f3772c = new LinkedHashSet();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final L9.a f3773d = new L9.a(0.0d, 1.0d, 0.0d, 1.0d);

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static class a implements a.b, E9.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final E9.b f3774a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final I9.b f3775b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final LatLng f3776c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public Set f3777d;

        @Override // L9.a.b
        public I9.b a() {
            return this.f3775b;
        }

        @Override // E9.a
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public Set b() {
            return this.f3777d;
        }

        public boolean equals(Object obj) {
            if (obj instanceof a) {
                return ((a) obj).f3774a.equals(this.f3774a);
            }
            return false;
        }

        @Override // E9.a
        public LatLng getPosition() {
            return this.f3776c;
        }

        @Override // E9.a
        public int getSize() {
            return 1;
        }

        public int hashCode() {
            return this.f3774a.hashCode();
        }

        public a(E9.b bVar) {
            this.f3774a = bVar;
            LatLng position = bVar.getPosition();
            this.f3776c = position;
            this.f3775b = c.f3770e.b(position);
            this.f3777d = Collections.singleton(bVar);
        }
    }

    @Override // F9.b
    public boolean b(E9.b bVar) {
        boolean zRemove;
        a aVar = new a(bVar);
        synchronized (this.f3773d) {
            try {
                zRemove = this.f3772c.remove(aVar);
                if (zRemove) {
                    this.f3773d.e(aVar);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return zRemove;
    }

    @Override // F9.b
    public void c() {
        synchronized (this.f3773d) {
            this.f3772c.clear();
            this.f3773d.b();
        }
    }

    @Override // F9.b
    public Set e(float f10) {
        double dPow = (((double) this.f3771b) / Math.pow(2.0d, (int) f10)) / 256.0d;
        HashSet hashSet = new HashSet();
        HashSet hashSet2 = new HashSet();
        HashMap map = new HashMap();
        HashMap map2 = new HashMap();
        synchronized (this.f3773d) {
            try {
                Iterator it = k(this.f3773d, f10).iterator();
                while (it.hasNext()) {
                    a aVar = (a) it.next();
                    if (!hashSet.contains(aVar)) {
                        Collection<a> collectionF = this.f3773d.f(i(aVar.a(), dPow));
                        if (collectionF.size() == 1) {
                            hashSet2.add(aVar);
                            hashSet.add(aVar);
                            map.put(aVar, Double.valueOf(0.0d));
                        } else {
                            h hVar = new h(aVar.f3774a.getPosition());
                            hashSet2.add(hVar);
                            for (a aVar2 : collectionF) {
                                Double d10 = (Double) map.get(aVar2);
                                Iterator it2 = it;
                                double dJ = j(aVar2.a(), aVar.a());
                                if (d10 == null) {
                                    map.put(aVar2, Double.valueOf(dJ));
                                    hVar.a(aVar2.f3774a);
                                    map2.put(aVar2, hVar);
                                } else if (d10.doubleValue() >= dJ) {
                                    ((h) map2.get(aVar2)).c(aVar2.f3774a);
                                    map.put(aVar2, Double.valueOf(dJ));
                                    hVar.a(aVar2.f3774a);
                                    map2.put(aVar2, hVar);
                                }
                                it = it2;
                            }
                            hashSet.addAll(collectionF);
                            it = it;
                        }
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return hashSet2;
    }

    @Override // F9.b
    public boolean f(E9.b bVar) {
        boolean zAdd;
        a aVar = new a(bVar);
        synchronized (this.f3773d) {
            try {
                zAdd = this.f3772c.add(aVar);
                if (zAdd) {
                    this.f3773d.a(aVar);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return zAdd;
    }

    @Override // F9.b
    public int g() {
        return this.f3771b;
    }

    public I9.a i(I9.b bVar, double d10) {
        double d11 = d10 / 2.0d;
        double d12 = bVar.f5671a;
        double d13 = bVar.f5672b;
        return new I9.a(d12 - d11, d12 + d11, d13 - d11, d13 + d11);
    }

    public double j(I9.b bVar, I9.b bVar2) {
        double d10 = bVar.f5671a;
        double d11 = bVar2.f5671a;
        double d12 = (d10 - d11) * (d10 - d11);
        double d13 = bVar.f5672b;
        double d14 = bVar2.f5672b;
        return d12 + ((d13 - d14) * (d13 - d14));
    }

    public Collection k(L9.a aVar, float f10) {
        return this.f3772c;
    }
}
