package b0;

import c0.AbstractC2926a;
import gc.C4179C;
import gc.C4202o;
import java.util.Collection;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.Set;
import kotlin.jvm.internal.AbstractC4854k;
import kotlin.jvm.internal.AbstractC4862t;
import wc.InterfaceC6185b;
import wc.InterfaceC6188e;

/* JADX INFO: renamed from: b0.b, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public final class C2778b implements Collection, Set, InterfaceC6185b, InterfaceC6188e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int[] f24882a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Object[] f24883b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f24884c;

    /* JADX INFO: renamed from: b0.b$a */
    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public final class a extends AbstractC2785i {
        public a() {
            super(C2778b.this.h());
        }

        @Override // b0.AbstractC2785i
        public Object a(int i10) {
            return C2778b.this.r(i10);
        }

        @Override // b0.AbstractC2785i
        public void b(int i10) {
            C2778b.this.k(i10);
        }
    }

    public C2778b() {
        this(0, 1, null);
    }

    @Override // java.util.Collection, java.util.Set
    public boolean add(Object obj) {
        int i10;
        int iC;
        int iH = h();
        if (obj == null) {
            iC = AbstractC2780d.d(this);
            i10 = 0;
        } else {
            int iHashCode = obj.hashCode();
            i10 = iHashCode;
            iC = AbstractC2780d.c(this, obj, iHashCode);
        }
        if (iC >= 0) {
            return false;
        }
        int i11 = ~iC;
        if (iH >= e().length) {
            int i12 = 8;
            if (iH >= 8) {
                i12 = (iH >> 1) + iH;
            } else if (iH < 4) {
                i12 = 4;
            }
            int[] iArrE = e();
            Object[] objArrD = d();
            AbstractC2780d.a(this, i12);
            if (iH != h()) {
                throw new ConcurrentModificationException();
            }
            if (!(e().length == 0)) {
                C4202o.p(iArrE, e(), 0, 0, iArrE.length, 6, null);
                C4202o.r(objArrD, d(), 0, 0, objArrD.length, 6, null);
            }
        }
        if (i11 < iH) {
            int i13 = i11 + 1;
            C4202o.k(e(), e(), i13, i11, iH);
            C4202o.m(d(), d(), i13, i11, iH);
        }
        if (iH != h() || i11 >= e().length) {
            throw new ConcurrentModificationException();
        }
        e()[i11] = i10;
        d()[i11] = obj;
        p(h() + 1);
        return true;
    }

    @Override // java.util.Collection, java.util.Set
    public boolean addAll(Collection elements) {
        AbstractC4862t.e(elements, "elements");
        c(h() + elements.size());
        Iterator it = elements.iterator();
        boolean zAdd = false;
        while (it.hasNext()) {
            zAdd |= add(it.next());
        }
        return zAdd;
    }

    public final void c(int i10) {
        int iH = h();
        if (e().length < i10) {
            int[] iArrE = e();
            Object[] objArrD = d();
            AbstractC2780d.a(this, i10);
            if (h() > 0) {
                C4202o.p(iArrE, e(), 0, 0, h(), 6, null);
                C4202o.r(objArrD, d(), 0, 0, h(), 6, null);
            }
        }
        if (h() != iH) {
            throw new ConcurrentModificationException();
        }
    }

    @Override // java.util.Collection, java.util.Set
    public void clear() {
        if (h() != 0) {
            n(AbstractC2926a.f25519a);
            l(AbstractC2926a.f25521c);
            p(0);
        }
        if (h() != 0) {
            throw new ConcurrentModificationException();
        }
    }

    @Override // java.util.Collection, java.util.Set
    public boolean contains(Object obj) {
        return indexOf(obj) >= 0;
    }

    @Override // java.util.Collection, java.util.Set
    public boolean containsAll(Collection elements) {
        AbstractC4862t.e(elements, "elements");
        Iterator it = elements.iterator();
        while (it.hasNext()) {
            if (!contains(it.next())) {
                return false;
            }
        }
        return true;
    }

    public final Object[] d() {
        return this.f24883b;
    }

    public final int[] e() {
        return this.f24882a;
    }

    @Override // java.util.Collection, java.util.Set
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Set) || size() != ((Set) obj).size()) {
            return false;
        }
        try {
            int iH = h();
            for (int i10 = 0; i10 < iH; i10++) {
                if (!((Set) obj).contains(r(i10))) {
                    return false;
                }
            }
            return true;
        } catch (ClassCastException | NullPointerException unused) {
            return false;
        }
    }

    public int f() {
        return this.f24884c;
    }

    public final int h() {
        return this.f24884c;
    }

    @Override // java.util.Collection, java.util.Set
    public int hashCode() {
        int[] iArrE = e();
        int iH = h();
        int i10 = 0;
        for (int i11 = 0; i11 < iH; i11++) {
            i10 += iArrE[i11];
        }
        return i10;
    }

    public final int indexOf(Object obj) {
        return obj == null ? AbstractC2780d.d(this) : AbstractC2780d.c(this, obj, obj.hashCode());
    }

    @Override // java.util.Collection, java.util.Set
    public boolean isEmpty() {
        return h() <= 0;
    }

    @Override // java.util.Collection, java.lang.Iterable, java.util.Set
    public Iterator iterator() {
        return new a();
    }

    public final Object k(int i10) {
        int i11;
        Object[] objArr;
        int iH = h();
        Object obj = d()[i10];
        if (iH <= 1) {
            clear();
            return obj;
        }
        int i12 = iH - 1;
        if (e().length <= 8 || h() >= e().length / 3) {
            if (i10 < i12) {
                int i13 = i10 + 1;
                C4202o.k(e(), e(), i10, i13, iH);
                C4202o.m(d(), d(), i10, i13, iH);
            }
            d()[i12] = null;
        } else {
            int iH2 = h() > 8 ? h() + (h() >> 1) : 8;
            int[] iArrE = e();
            Object[] objArrD = d();
            AbstractC2780d.a(this, iH2);
            if (i10 > 0) {
                C4202o.p(iArrE, e(), 0, 0, i10, 6, null);
                objArr = objArrD;
                C4202o.r(objArr, d(), 0, 0, i10, 6, null);
                i11 = i10;
            } else {
                i11 = i10;
                objArr = objArrD;
            }
            if (i11 < i12) {
                int i14 = i11 + 1;
                C4202o.k(iArrE, e(), i11, i14, iH);
                C4202o.m(objArr, d(), i11, i14, iH);
            }
        }
        if (iH != h()) {
            throw new ConcurrentModificationException();
        }
        p(i12);
        return obj;
    }

    public final void l(Object[] objArr) {
        AbstractC4862t.e(objArr, "<set-?>");
        this.f24883b = objArr;
    }

    public final void n(int[] iArr) {
        AbstractC4862t.e(iArr, "<set-?>");
        this.f24882a = iArr;
    }

    public final void p(int i10) {
        this.f24884c = i10;
    }

    public final Object r(int i10) {
        return d()[i10];
    }

    @Override // java.util.Collection, java.util.Set
    public boolean remove(Object obj) {
        int iIndexOf = indexOf(obj);
        if (iIndexOf < 0) {
            return false;
        }
        k(iIndexOf);
        return true;
    }

    @Override // java.util.Collection, java.util.Set
    public boolean removeAll(Collection elements) {
        AbstractC4862t.e(elements, "elements");
        Iterator it = elements.iterator();
        boolean zRemove = false;
        while (it.hasNext()) {
            zRemove |= remove(it.next());
        }
        return zRemove;
    }

    @Override // java.util.Collection, java.util.Set
    public boolean retainAll(Collection elements) {
        AbstractC4862t.e(elements, "elements");
        boolean z10 = false;
        for (int iH = h() - 1; -1 < iH; iH--) {
            if (!C4179C.Y(elements, d()[iH])) {
                k(iH);
                z10 = true;
            }
        }
        return z10;
    }

    @Override // java.util.Collection, java.util.Set
    public final /* bridge */ int size() {
        return f();
    }

    @Override // java.util.Collection, java.util.Set
    public final Object[] toArray() {
        return C4202o.u(this.f24883b, 0, this.f24884c);
    }

    public String toString() {
        if (isEmpty()) {
            return "{}";
        }
        StringBuilder sb2 = new StringBuilder(h() * 14);
        sb2.append('{');
        int iH = h();
        for (int i10 = 0; i10 < iH; i10++) {
            if (i10 > 0) {
                sb2.append(", ");
            }
            Object objR = r(i10);
            if (objR != this) {
                sb2.append(objR);
            } else {
                sb2.append("(this Set)");
            }
        }
        sb2.append('}');
        String string = sb2.toString();
        AbstractC4862t.d(string, "toString(...)");
        return string;
    }

    public C2778b(int i10) {
        this.f24882a = AbstractC2926a.f25519a;
        this.f24883b = AbstractC2926a.f25521c;
        if (i10 > 0) {
            AbstractC2780d.a(this, i10);
        }
    }

    @Override // java.util.Collection, java.util.Set
    public final Object[] toArray(Object[] array) {
        AbstractC4862t.e(array, "array");
        Object[] objArrA = AbstractC2779c.a(array, this.f24884c);
        C4202o.m(this.f24883b, objArrA, 0, 0, this.f24884c);
        AbstractC4862t.b(objArrA);
        return objArrA;
    }

    public /* synthetic */ C2778b(int i10, int i11, AbstractC4854k abstractC4854k) {
        this((i11 & 1) != 0 ? 0 : i10);
    }
}
