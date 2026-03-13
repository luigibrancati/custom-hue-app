package Nd;

import gc.C4204q;
import java.util.Iterator;
import java.util.NoSuchElementException;
import kotlin.jvm.internal.AbstractC4862t;
import vc.InterfaceC6082a;
import wc.InterfaceC6184a;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public class q extends l {

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class a implements h {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Iterator f10663a;

        public a(Iterator it) {
            this.f10663a = it;
        }

        @Override // Nd.h
        public Iterator iterator() {
            return this.f10663a;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class b implements h {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Object f10664a;

        public b(Object obj) {
            this.f10664a = obj;
        }

        @Override // Nd.h
        public Iterator iterator() {
            return new c(this.f10664a);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class c implements Iterator, InterfaceC6184a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public boolean f10665a = true;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Object f10666b;

        public c(Object obj) {
            this.f10666b = obj;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f10665a;
        }

        @Override // java.util.Iterator
        public Object next() {
            if (!this.f10665a) {
                throw new NoSuchElementException();
            }
            this.f10665a = false;
            return this.f10666b;
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    public static h g(Iterator it) {
        AbstractC4862t.e(it, "<this>");
        return h(new a(it));
    }

    public static h h(h hVar) {
        AbstractC4862t.e(hVar, "<this>");
        return hVar instanceof Nd.a ? hVar : new Nd.a(hVar);
    }

    public static h i() {
        return d.f10636a;
    }

    public static final h j(h hVar) {
        AbstractC4862t.e(hVar, "<this>");
        return k(hVar, new vc.l() { // from class: Nd.o
            @Override // vc.l
            public final Object invoke(Object obj) {
                return q.l((h) obj);
            }
        });
    }

    public static final h k(h hVar, vc.l lVar) {
        return hVar instanceof v ? ((v) hVar).d(lVar) : new f(hVar, new vc.l() { // from class: Nd.p
            @Override // vc.l
            public final Object invoke(Object obj) {
                return q.m(obj);
            }
        }, lVar);
    }

    public static final Iterator l(h it) {
        AbstractC4862t.e(it, "it");
        return it.iterator();
    }

    public static h n(final Object obj, vc.l nextFunction) {
        AbstractC4862t.e(nextFunction, "nextFunction");
        return obj == null ? d.f10636a : new g(new InterfaceC6082a() { // from class: Nd.m
            @Override // vc.InterfaceC6082a
            public final Object invoke() {
                return q.r(obj);
            }
        }, nextFunction);
    }

    public static h o(final InterfaceC6082a nextFunction) {
        AbstractC4862t.e(nextFunction, "nextFunction");
        return h(new g(nextFunction, new vc.l() { // from class: Nd.n
            @Override // vc.l
            public final Object invoke(Object obj) {
                return q.q(nextFunction, obj);
            }
        }));
    }

    public static h p(InterfaceC6082a seedFunction, vc.l nextFunction) {
        AbstractC4862t.e(seedFunction, "seedFunction");
        AbstractC4862t.e(nextFunction, "nextFunction");
        return new g(seedFunction, nextFunction);
    }

    public static final Object q(InterfaceC6082a interfaceC6082a, Object it) {
        AbstractC4862t.e(it, "it");
        return interfaceC6082a.invoke();
    }

    public static final h s(Object obj) {
        return new b(obj);
    }

    public static final h t(Object... elements) {
        AbstractC4862t.e(elements, "elements");
        return C4204q.J(elements);
    }

    public static final Object m(Object obj) {
        return obj;
    }

    public static final Object r(Object obj) {
        return obj;
    }
}
