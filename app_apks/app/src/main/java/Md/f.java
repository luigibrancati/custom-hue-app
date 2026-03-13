package Md;

import gc.C4204q;
import gc.U;
import java.util.AbstractSet;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.NoSuchElementException;
import java.util.Set;
import kotlin.jvm.internal.AbstractC4846c;
import kotlin.jvm.internal.AbstractC4854k;
import kotlin.jvm.internal.AbstractC4862t;
import kotlin.jvm.internal.T;
import wc.InterfaceC6184a;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public final class f extends AbstractSet {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final b f9471c = new b(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Object f9472a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f9473b;

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class a implements Iterator, InterfaceC6184a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Iterator f9474a;

        public a(Object[] array) {
            AbstractC4862t.e(array, "array");
            this.f9474a = AbstractC4846c.a(array);
        }

        @Override // java.util.Iterator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Void remove() {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f9474a.hasNext();
        }

        @Override // java.util.Iterator
        public Object next() {
            return this.f9474a.next();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class b {
        public /* synthetic */ b(AbstractC4854k abstractC4854k) {
            this();
        }

        public final f a() {
            return new f(null);
        }

        public final f b(Collection set) {
            AbstractC4862t.e(set, "set");
            f fVar = new f(null);
            fVar.addAll(set);
            return fVar;
        }

        public b() {
        }
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class c implements Iterator, InterfaceC6184a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Object f9475a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public boolean f9476b = true;

        public c(Object obj) {
            this.f9475a = obj;
        }

        @Override // java.util.Iterator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Void remove() {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f9476b;
        }

        @Override // java.util.Iterator
        public Object next() {
            if (!this.f9476b) {
                throw new NoSuchElementException();
            }
            this.f9476b = false;
            return this.f9475a;
        }
    }

    public /* synthetic */ f(AbstractC4854k abstractC4854k) {
        this();
    }

    public static final f c() {
        return f9471c.a();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean add(Object obj) {
        Object obj2;
        if (size() == 0) {
            this.f9472a = obj;
        } else if (size() == 1) {
            if (AbstractC4862t.a(this.f9472a, obj)) {
                return false;
            }
            this.f9472a = new Object[]{this.f9472a, obj};
        } else if (size() < 5) {
            Object obj3 = this.f9472a;
            AbstractC4862t.c(obj3, "null cannot be cast to non-null type kotlin.Array<T of org.jetbrains.kotlin.utils.SmartSet>");
            Object[] objArr = (Object[]) obj3;
            if (C4204q.P(objArr, obj)) {
                return false;
            }
            if (size() == 4) {
                LinkedHashSet linkedHashSetE = U.e(Arrays.copyOf(objArr, objArr.length));
                linkedHashSetE.add(obj);
                obj2 = linkedHashSetE;
            } else {
                Object[] objArrCopyOf = Arrays.copyOf(objArr, size() + 1);
                AbstractC4862t.d(objArrCopyOf, "copyOf(this, newSize)");
                objArrCopyOf[objArrCopyOf.length - 1] = obj;
                obj2 = objArrCopyOf;
            }
            this.f9472a = obj2;
        } else {
            Object obj4 = this.f9472a;
            AbstractC4862t.c(obj4, "null cannot be cast to non-null type kotlin.collections.MutableSet<T of org.jetbrains.kotlin.utils.SmartSet>");
            if (!T.e(obj4).add(obj)) {
                return false;
            }
        }
        e(size() + 1);
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public void clear() {
        this.f9472a = null;
        e(0);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean contains(Object obj) {
        if (size() == 0) {
            return false;
        }
        if (size() == 1) {
            return AbstractC4862t.a(this.f9472a, obj);
        }
        if (size() < 5) {
            Object obj2 = this.f9472a;
            AbstractC4862t.c(obj2, "null cannot be cast to non-null type kotlin.Array<T of org.jetbrains.kotlin.utils.SmartSet>");
            return C4204q.P((Object[]) obj2, obj);
        }
        Object obj3 = this.f9472a;
        AbstractC4862t.c(obj3, "null cannot be cast to non-null type kotlin.collections.Set<T of org.jetbrains.kotlin.utils.SmartSet>");
        return ((Set) obj3).contains(obj);
    }

    public int d() {
        return this.f9473b;
    }

    public void e(int i10) {
        this.f9473b = i10;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public Iterator iterator() {
        if (size() == 0) {
            return Collections.EMPTY_SET.iterator();
        }
        if (size() == 1) {
            return new c(this.f9472a);
        }
        if (size() < 5) {
            Object obj = this.f9472a;
            AbstractC4862t.c(obj, "null cannot be cast to non-null type kotlin.Array<T of org.jetbrains.kotlin.utils.SmartSet>");
            return new a((Object[]) obj);
        }
        Object obj2 = this.f9472a;
        AbstractC4862t.c(obj2, "null cannot be cast to non-null type kotlin.collections.MutableSet<T of org.jetbrains.kotlin.utils.SmartSet>");
        return T.e(obj2).iterator();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final /* bridge */ int size() {
        return d();
    }

    public f() {
    }
}
