package K7;

import java.util.Collection;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public abstract class B {

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public class a extends AbstractC1062b {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ Iterator f7570c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ J7.o f7571d;

        public a(Iterator it, J7.o oVar) {
            this.f7570c = it;
            this.f7571d = oVar;
        }

        @Override // K7.AbstractC1062b
        public Object a() {
            while (this.f7570c.hasNext()) {
                Object next = this.f7570c.next();
                if (this.f7571d.apply(next)) {
                    return next;
                }
            }
            return b();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class b extends AbstractC1061a {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final Z f7572d = new b(new Object[0], 0);

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final Object[] f7573c;

        public b(Object[] objArr, int i10) {
            super(objArr.length, i10);
            this.f7573c = objArr;
        }

        @Override // K7.AbstractC1061a
        public Object a(int i10) {
            return this.f7573c[i10];
        }
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public enum c implements Iterator {
        INSTANCE;

        @Override // java.util.Iterator
        public boolean hasNext() {
            return false;
        }

        @Override // java.util.Iterator
        public Object next() {
            throw new NoSuchElementException();
        }

        @Override // java.util.Iterator
        public void remove() {
            AbstractC1069i.c(false);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class d extends Y {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Object f7574a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public boolean f7575b;

        public d(Object obj) {
            this.f7574a = obj;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return !this.f7575b;
        }

        @Override // java.util.Iterator
        public Object next() {
            if (this.f7575b) {
                throw new NoSuchElementException();
            }
            this.f7575b = true;
            return this.f7574a;
        }
    }

    public static boolean a(Collection collection, Iterator it) {
        J7.n.j(collection);
        J7.n.j(it);
        boolean zAdd = false;
        while (it.hasNext()) {
            zAdd |= collection.add(it.next());
        }
        return zAdd;
    }

    public static boolean b(Iterator it, J7.o oVar) {
        return o(it, oVar) != -1;
    }

    public static void c(Iterator it) {
        J7.n.j(it);
        while (it.hasNext()) {
            it.next();
            it.remove();
        }
    }

    public static boolean d(Iterator it, Object obj) {
        if (obj == null) {
            while (it.hasNext()) {
                if (it.next() == null) {
                    return true;
                }
            }
            return false;
        }
        while (it.hasNext()) {
            if (obj.equals(it.next())) {
                return true;
            }
        }
        return false;
    }

    public static boolean e(Iterator it, Iterator it2) {
        while (it.hasNext()) {
            if (!it2.hasNext() || !J7.j.a(it.next(), it2.next())) {
                return false;
            }
        }
        return !it2.hasNext();
    }

    public static Y f() {
        return g();
    }

    public static Z g() {
        return b.f7572d;
    }

    public static Iterator h() {
        return c.INSTANCE;
    }

    public static Y i(Iterator it, J7.o oVar) {
        J7.n.j(it);
        J7.n.j(oVar);
        return new a(it, oVar);
    }

    public static Object j(Iterator it, J7.o oVar) {
        J7.n.j(it);
        J7.n.j(oVar);
        while (it.hasNext()) {
            Object next = it.next();
            if (oVar.apply(next)) {
                return next;
            }
        }
        throw new NoSuchElementException();
    }

    public static Object k(Iterator it) {
        Object next;
        do {
            next = it.next();
        } while (it.hasNext());
        return next;
    }

    public static Object l(Iterator it, Object obj) {
        return it.hasNext() ? k(it) : obj;
    }

    public static Object m(Iterator it, Object obj) {
        return it.hasNext() ? it.next() : obj;
    }

    public static Object n(Iterator it) {
        Object next = it.next();
        if (!it.hasNext()) {
            return next;
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append("expected one element but was: <");
        sb2.append(next);
        for (int i10 = 0; i10 < 4 && it.hasNext(); i10++) {
            sb2.append(", ");
            sb2.append(it.next());
        }
        if (it.hasNext()) {
            sb2.append(", ...");
        }
        sb2.append('>');
        throw new IllegalArgumentException(sb2.toString());
    }

    public static int o(Iterator it, J7.o oVar) {
        J7.n.k(oVar, "predicate");
        int i10 = 0;
        while (it.hasNext()) {
            if (oVar.apply(it.next())) {
                return i10;
            }
            i10++;
        }
        return -1;
    }

    public static Object p(Iterator it) {
        if (!it.hasNext()) {
            return null;
        }
        Object next = it.next();
        it.remove();
        return next;
    }

    public static boolean q(Iterator it, Collection collection) {
        J7.n.j(collection);
        boolean z10 = false;
        while (it.hasNext()) {
            if (collection.contains(it.next())) {
                it.remove();
                z10 = true;
            }
        }
        return z10;
    }

    public static boolean r(Iterator it, J7.o oVar) {
        J7.n.j(oVar);
        boolean z10 = false;
        while (it.hasNext()) {
            if (oVar.apply(it.next())) {
                it.remove();
                z10 = true;
            }
        }
        return z10;
    }

    public static Y s(Object obj) {
        return new d(obj);
    }
}
