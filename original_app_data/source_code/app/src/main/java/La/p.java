package La;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Map;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public class p implements n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f8660a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f8661b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f8662c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final LinkedList f8663d = new LinkedList();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Set f8664e = new HashSet();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Set f8665f = new HashSet();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Map f8666g = new HashMap();

    public p(String str, int i10, int i11) {
        this.f8660a = str;
        this.f8661b = i10;
        this.f8662c = i11;
    }

    @Override // La.n
    public synchronized void c() {
        try {
            Iterator it = this.f8664e.iterator();
            while (it.hasNext()) {
                ((m) it.next()).f();
            }
            Iterator it2 = this.f8665f.iterator();
            while (it2.hasNext()) {
                ((m) it2.next()).f();
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // La.n
    public synchronized void d(k kVar) {
        this.f8663d.add(kVar);
        Iterator it = new HashSet(this.f8664e).iterator();
        while (it.hasNext()) {
            j((m) it.next());
        }
    }

    public m f(String str, int i10) {
        return new m(str, i10);
    }

    public final synchronized k g(m mVar) {
        k kVar;
        m mVar2;
        try {
            ListIterator listIterator = this.f8663d.listIterator();
            do {
                if (!listIterator.hasNext()) {
                    return null;
                }
                kVar = (k) listIterator.next();
                mVar2 = kVar.a() != null ? (m) this.f8666g.get(kVar.a()) : null;
                if (mVar2 == null) {
                    break;
                }
            } while (mVar2 != mVar);
            listIterator.remove();
            return kVar;
        } catch (Throwable th) {
            throw th;
        }
    }

    /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
    public final synchronized void h(m mVar) {
        try {
            HashSet hashSet = new HashSet(this.f8664e);
            this.f8665f.remove(mVar);
            this.f8664e.add(mVar);
            if (!mVar.b() && mVar.d() != null) {
                this.f8666g.remove(mVar.d());
            }
            j(mVar);
            Iterator it = hashSet.iterator();
            while (it.hasNext()) {
                j((m) it.next());
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public final synchronized void j(m mVar) {
        try {
            k kVarG = g(mVar);
            if (kVarG != null) {
                this.f8665f.add(mVar);
                this.f8664e.remove(mVar);
                if (kVarG.a() != null) {
                    this.f8666g.put(kVarG.a(), mVar);
                }
                mVar.e(kVarG);
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // La.n
    public synchronized void start() {
        for (int i10 = 0; i10 < this.f8661b; i10++) {
            final m mVarF = f(this.f8660a + i10, this.f8662c);
            mVarF.g(new Runnable() { // from class: La.o
                @Override // java.lang.Runnable
                public final void run() {
                    this.f8658a.h(mVarF);
                }
            });
            this.f8664e.add(mVarF);
        }
    }
}
