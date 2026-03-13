package md;

import java.io.OutputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.Stack;
import md.AbstractC5050d;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public class t extends AbstractC5050d {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final int[] f40360h;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f40361b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final AbstractC5050d f40362c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final AbstractC5050d f40363d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f40364e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f40365f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f40366g;

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Stack f40367a;

        public b() {
            this.f40367a = new Stack();
        }

        public final AbstractC5050d b(AbstractC5050d abstractC5050d, AbstractC5050d abstractC5050d2) {
            c(abstractC5050d);
            c(abstractC5050d2);
            AbstractC5050d tVar = (AbstractC5050d) this.f40367a.pop();
            while (!this.f40367a.isEmpty()) {
                tVar = new t((AbstractC5050d) this.f40367a.pop(), tVar);
            }
            return tVar;
        }

        public final void c(AbstractC5050d abstractC5050d) {
            if (abstractC5050d.r()) {
                e(abstractC5050d);
                return;
            }
            if (abstractC5050d instanceof t) {
                t tVar = (t) abstractC5050d;
                c(tVar.f40362c);
                c(tVar.f40363d);
            } else {
                String strValueOf = String.valueOf(abstractC5050d.getClass());
                StringBuilder sb2 = new StringBuilder(strValueOf.length() + 49);
                sb2.append("Has a new type of ByteString been created? Found ");
                sb2.append(strValueOf);
                throw new IllegalArgumentException(sb2.toString());
            }
        }

        public final int d(int i10) {
            int iBinarySearch = Arrays.binarySearch(t.f40360h, i10);
            return iBinarySearch < 0 ? (-(iBinarySearch + 1)) - 1 : iBinarySearch;
        }

        public final void e(AbstractC5050d abstractC5050d) {
            int iD = d(abstractC5050d.size());
            int i10 = t.f40360h[iD + 1];
            if (this.f40367a.isEmpty() || ((AbstractC5050d) this.f40367a.peek()).size() >= i10) {
                this.f40367a.push(abstractC5050d);
                return;
            }
            int i11 = t.f40360h[iD];
            AbstractC5050d tVar = (AbstractC5050d) this.f40367a.pop();
            while (true) {
                if (this.f40367a.isEmpty() || ((AbstractC5050d) this.f40367a.peek()).size() >= i11) {
                    break;
                } else {
                    tVar = new t((AbstractC5050d) this.f40367a.pop(), tVar);
                }
            }
            t tVar2 = new t(tVar, abstractC5050d);
            while (!this.f40367a.isEmpty()) {
                if (((AbstractC5050d) this.f40367a.peek()).size() >= t.f40360h[d(tVar2.size()) + 1]) {
                    break;
                } else {
                    tVar2 = new t((AbstractC5050d) this.f40367a.pop(), tVar2);
                }
            }
            this.f40367a.push(tVar2);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static class c implements Iterator {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Stack f40368a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public o f40369b;

        public final o a(AbstractC5050d abstractC5050d) {
            while (abstractC5050d instanceof t) {
                t tVar = (t) abstractC5050d;
                this.f40368a.push(tVar);
                abstractC5050d = tVar.f40362c;
            }
            return (o) abstractC5050d;
        }

        public final o b() {
            while (!this.f40368a.isEmpty()) {
                o oVarA = a(((t) this.f40368a.pop()).f40363d);
                if (!oVarA.isEmpty()) {
                    return oVarA;
                }
            }
            return null;
        }

        @Override // java.util.Iterator
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public o next() {
            o oVar = this.f40369b;
            if (oVar == null) {
                throw new NoSuchElementException();
            }
            this.f40369b = b();
            return oVar;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f40369b != null;
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException();
        }

        public c(AbstractC5050d abstractC5050d) {
            this.f40368a = new Stack();
            this.f40369b = a(abstractC5050d);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public class d implements AbstractC5050d.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final c f40370a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public AbstractC5050d.a f40371b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f40372c;

        @Override // java.util.Iterator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Byte next() {
            return Byte.valueOf(nextByte());
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f40372c > 0;
        }

        @Override // md.AbstractC5050d.a
        public byte nextByte() {
            if (!this.f40371b.hasNext()) {
                this.f40371b = this.f40370a.next().iterator();
            }
            this.f40372c--;
            return this.f40371b.nextByte();
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException();
        }

        public d() {
            c cVar = new c(t.this);
            this.f40370a = cVar;
            this.f40371b = cVar.next().iterator();
            this.f40372c = t.this.size();
        }
    }

    static {
        ArrayList arrayList = new ArrayList();
        int i10 = 1;
        int i11 = 1;
        while (i10 > 0) {
            arrayList.add(Integer.valueOf(i10));
            int i12 = i11 + i10;
            i11 = i10;
            i10 = i12;
        }
        arrayList.add(Integer.MAX_VALUE);
        f40360h = new int[arrayList.size()];
        int i13 = 0;
        while (true) {
            int[] iArr = f40360h;
            if (i13 >= iArr.length) {
                return;
            }
            iArr[i13] = ((Integer) arrayList.get(i13)).intValue();
            i13++;
        }
    }

    public static AbstractC5050d L(AbstractC5050d abstractC5050d, AbstractC5050d abstractC5050d2) {
        t tVar = abstractC5050d instanceof t ? (t) abstractC5050d : null;
        if (abstractC5050d2.size() == 0) {
            return abstractC5050d;
        }
        if (abstractC5050d.size() == 0) {
            return abstractC5050d2;
        }
        int size = abstractC5050d.size() + abstractC5050d2.size();
        if (size < 128) {
            return M(abstractC5050d, abstractC5050d2);
        }
        if (tVar != null && tVar.f40363d.size() + abstractC5050d2.size() < 128) {
            return new t(tVar.f40362c, M(tVar.f40363d, abstractC5050d2));
        }
        if (tVar == null || tVar.f40362c.p() <= tVar.f40363d.p() || tVar.p() <= abstractC5050d2.p()) {
            return size >= f40360h[Math.max(abstractC5050d.p(), abstractC5050d2.p()) + 1] ? new t(abstractC5050d, abstractC5050d2) : new b().b(abstractC5050d, abstractC5050d2);
        }
        return new t(tVar.f40362c, new t(tVar.f40363d, abstractC5050d2));
    }

    public static o M(AbstractC5050d abstractC5050d, AbstractC5050d abstractC5050d2) {
        int size = abstractC5050d.size();
        int size2 = abstractC5050d2.size();
        byte[] bArr = new byte[size + size2];
        abstractC5050d.l(bArr, 0, 0, size);
        abstractC5050d2.l(bArr, 0, size, size2);
        return new o(bArr);
    }

    @Override // md.AbstractC5050d
    public void E(OutputStream outputStream, int i10, int i11) {
        int i12 = i10 + i11;
        int i13 = this.f40364e;
        if (i12 <= i13) {
            this.f40362c.E(outputStream, i10, i11);
        } else {
            if (i10 >= i13) {
                this.f40363d.E(outputStream, i10 - i13, i11);
                return;
            }
            int i14 = i13 - i10;
            this.f40362c.E(outputStream, i10, i14);
            this.f40363d.E(outputStream, 0, i11 - i14);
        }
    }

    public final boolean N(AbstractC5050d abstractC5050d) {
        c cVar = new c(this);
        o oVar = (o) cVar.next();
        c cVar2 = new c(abstractC5050d);
        o oVar2 = (o) cVar2.next();
        int i10 = 0;
        int i11 = 0;
        int i12 = 0;
        while (true) {
            int size = oVar.size() - i10;
            int size2 = oVar2.size() - i11;
            int iMin = Math.min(size, size2);
            if (!(i10 == 0 ? oVar.H(oVar2, i11, iMin) : oVar2.H(oVar, i10, iMin))) {
                return false;
            }
            i12 += iMin;
            int i13 = this.f40361b;
            if (i12 >= i13) {
                if (i12 == i13) {
                    return true;
                }
                throw new IllegalStateException();
            }
            if (iMin == size) {
                oVar = (o) cVar.next();
                i10 = 0;
            } else {
                i10 += iMin;
            }
            if (iMin == size2) {
                oVar2 = (o) cVar2.next();
                i11 = 0;
            } else {
                i11 += iMin;
            }
        }
    }

    @Override // java.lang.Iterable
    /* JADX INFO: renamed from: O, reason: merged with bridge method [inline-methods] */
    public AbstractC5050d.a iterator() {
        return new d();
    }

    public boolean equals(Object obj) {
        int iX;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AbstractC5050d)) {
            return false;
        }
        AbstractC5050d abstractC5050d = (AbstractC5050d) obj;
        if (this.f40361b != abstractC5050d.size()) {
            return false;
        }
        if (this.f40361b == 0) {
            return true;
        }
        if (this.f40366g == 0 || (iX = abstractC5050d.x()) == 0 || this.f40366g == iX) {
            return N(abstractC5050d);
        }
        return false;
    }

    public int hashCode() {
        int iV = this.f40366g;
        if (iV == 0) {
            int i10 = this.f40361b;
            iV = v(i10, 0, i10);
            if (iV == 0) {
                iV = 1;
            }
            this.f40366g = iV;
        }
        return iV;
    }

    @Override // md.AbstractC5050d
    public void n(byte[] bArr, int i10, int i11, int i12) {
        int i13 = i10 + i12;
        int i14 = this.f40364e;
        if (i13 <= i14) {
            this.f40362c.n(bArr, i10, i11, i12);
        } else {
            if (i10 >= i14) {
                this.f40363d.n(bArr, i10 - i14, i11, i12);
                return;
            }
            int i15 = i14 - i10;
            this.f40362c.n(bArr, i10, i11, i15);
            this.f40363d.n(bArr, 0, i11 + i15, i12 - i15);
        }
    }

    @Override // md.AbstractC5050d
    public int p() {
        return this.f40365f;
    }

    @Override // md.AbstractC5050d
    public boolean r() {
        return this.f40361b >= f40360h[this.f40365f];
    }

    @Override // md.AbstractC5050d
    public boolean s() {
        int iW = this.f40362c.w(0, 0, this.f40364e);
        AbstractC5050d abstractC5050d = this.f40363d;
        return abstractC5050d.w(iW, 0, abstractC5050d.size()) == 0;
    }

    @Override // md.AbstractC5050d
    public int size() {
        return this.f40361b;
    }

    @Override // md.AbstractC5050d
    public int v(int i10, int i11, int i12) {
        int i13 = i11 + i12;
        int i14 = this.f40364e;
        if (i13 <= i14) {
            return this.f40362c.v(i10, i11, i12);
        }
        if (i11 >= i14) {
            return this.f40363d.v(i10, i11 - i14, i12);
        }
        int i15 = i14 - i11;
        return this.f40363d.v(this.f40362c.v(i10, i11, i15), 0, i12 - i15);
    }

    @Override // md.AbstractC5050d
    public int w(int i10, int i11, int i12) {
        int i13 = i11 + i12;
        int i14 = this.f40364e;
        if (i13 <= i14) {
            return this.f40362c.w(i10, i11, i12);
        }
        if (i11 >= i14) {
            return this.f40363d.w(i10, i11 - i14, i12);
        }
        int i15 = i14 - i11;
        return this.f40363d.w(this.f40362c.w(i10, i11, i15), 0, i12 - i15);
    }

    @Override // md.AbstractC5050d
    public int x() {
        return this.f40366g;
    }

    @Override // md.AbstractC5050d
    public String z(String str) {
        return new String(y(), str);
    }

    public t(AbstractC5050d abstractC5050d, AbstractC5050d abstractC5050d2) {
        this.f40366g = 0;
        this.f40362c = abstractC5050d;
        this.f40363d = abstractC5050d2;
        int size = abstractC5050d.size();
        this.f40364e = size;
        this.f40361b = size + abstractC5050d2.size();
        this.f40365f = Math.max(abstractC5050d.p(), abstractC5050d2.p()) + 1;
    }
}
