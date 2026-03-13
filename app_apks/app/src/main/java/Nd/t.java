package Nd;

import gc.C4179C;
import gc.C4205s;
import gc.C4206t;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import kotlin.jvm.internal.AbstractC4860q;
import kotlin.jvm.internal.AbstractC4862t;
import wc.InterfaceC6184a;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public class t extends r {

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class a implements Iterable, InterfaceC6184a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ h f10667a;

        public a(h hVar) {
            this.f10667a = hVar;
        }

        @Override // java.lang.Iterable
        public Iterator iterator() {
            return this.f10667a.iterator();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final /* synthetic */ class b extends AbstractC4860q implements vc.l {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final b f10668a = new b();

        public b() {
            super(1, h.class, "iterator", "iterator()Ljava/util/Iterator;", 0);
        }

        @Override // vc.l
        /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
        public final Iterator invoke(h p02) {
            AbstractC4862t.e(p02, "p0");
            return p02.iterator();
        }
    }

    public static h A(h hVar) {
        AbstractC4862t.e(hVar, "<this>");
        h hVarZ = z(hVar, new vc.l() { // from class: Nd.s
            @Override // vc.l
            public final Object invoke(Object obj) {
                return Boolean.valueOf(t.B(obj));
            }
        });
        AbstractC4862t.c(hVarZ, "null cannot be cast to non-null type kotlin.sequences.Sequence<T of kotlin.sequences.SequencesKt___SequencesKt.filterNotNull>");
        return hVarZ;
    }

    public static final boolean B(Object obj) {
        return obj == null;
    }

    public static Object C(h hVar) {
        AbstractC4862t.e(hVar, "<this>");
        Iterator it = hVar.iterator();
        if (it.hasNext()) {
            return it.next();
        }
        return null;
    }

    public static h D(h hVar, vc.l transform) {
        AbstractC4862t.e(hVar, "<this>");
        AbstractC4862t.e(transform, "transform");
        return new f(hVar, transform, b.f10668a);
    }

    public static final Appendable E(h hVar, Appendable buffer, CharSequence separator, CharSequence prefix, CharSequence postfix, int i10, CharSequence truncated, vc.l lVar) throws IOException {
        AbstractC4862t.e(hVar, "<this>");
        AbstractC4862t.e(buffer, "buffer");
        AbstractC4862t.e(separator, "separator");
        AbstractC4862t.e(prefix, "prefix");
        AbstractC4862t.e(postfix, "postfix");
        AbstractC4862t.e(truncated, "truncated");
        buffer.append(prefix);
        int i11 = 0;
        for (Object obj : hVar) {
            i11++;
            if (i11 > 1) {
                buffer.append(separator);
            }
            if (i10 >= 0 && i11 > i10) {
                break;
            }
            Od.r.a(buffer, obj, lVar);
        }
        if (i10 >= 0 && i11 > i10) {
            buffer.append(truncated);
        }
        buffer.append(postfix);
        return buffer;
    }

    public static final String F(h hVar, CharSequence separator, CharSequence prefix, CharSequence postfix, int i10, CharSequence truncated, vc.l lVar) {
        AbstractC4862t.e(hVar, "<this>");
        AbstractC4862t.e(separator, "separator");
        AbstractC4862t.e(prefix, "prefix");
        AbstractC4862t.e(postfix, "postfix");
        AbstractC4862t.e(truncated, "truncated");
        return ((StringBuilder) E(hVar, new StringBuilder(), separator, prefix, postfix, i10, truncated, lVar)).toString();
    }

    public static /* synthetic */ String G(h hVar, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i10, CharSequence charSequence4, vc.l lVar, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            charSequence = ", ";
        }
        if ((i11 & 2) != 0) {
            charSequence2 = "";
        }
        if ((i11 & 4) != 0) {
            charSequence3 = "";
        }
        if ((i11 & 8) != 0) {
            i10 = -1;
        }
        if ((i11 & 16) != 0) {
            charSequence4 = "...";
        }
        if ((i11 & 32) != 0) {
            lVar = null;
        }
        CharSequence charSequence5 = charSequence4;
        vc.l lVar2 = lVar;
        return F(hVar, charSequence, charSequence2, charSequence3, i10, charSequence5, lVar2);
    }

    public static Object H(h hVar) {
        AbstractC4862t.e(hVar, "<this>");
        Iterator it = hVar.iterator();
        if (!it.hasNext()) {
            throw new NoSuchElementException("Sequence is empty.");
        }
        Object next = it.next();
        while (it.hasNext()) {
            next = it.next();
        }
        return next;
    }

    public static h I(h hVar, vc.l transform) {
        AbstractC4862t.e(hVar, "<this>");
        AbstractC4862t.e(transform, "transform");
        return new v(hVar, transform);
    }

    public static h J(h hVar, vc.l transform) {
        AbstractC4862t.e(hVar, "<this>");
        AbstractC4862t.e(transform, "transform");
        return A(new v(hVar, transform));
    }

    public static h K(h hVar, Iterable elements) {
        AbstractC4862t.e(hVar, "<this>");
        AbstractC4862t.e(elements, "elements");
        return q.j(q.t(hVar, C4179C.X(elements)));
    }

    public static h L(h hVar, Object obj) {
        AbstractC4862t.e(hVar, "<this>");
        return q.j(q.t(hVar, q.s(obj)));
    }

    public static h M(h hVar, vc.l predicate) {
        AbstractC4862t.e(hVar, "<this>");
        AbstractC4862t.e(predicate, "predicate");
        return new u(hVar, predicate);
    }

    public static final Collection N(h hVar, Collection destination) {
        AbstractC4862t.e(hVar, "<this>");
        AbstractC4862t.e(destination, "destination");
        Iterator it = hVar.iterator();
        while (it.hasNext()) {
            destination.add(it.next());
        }
        return destination;
    }

    public static List O(h hVar) {
        AbstractC4862t.e(hVar, "<this>");
        Iterator it = hVar.iterator();
        if (!it.hasNext()) {
            return C4206t.k();
        }
        Object next = it.next();
        if (!it.hasNext()) {
            return C4205s.d(next);
        }
        ArrayList arrayList = new ArrayList();
        arrayList.add(next);
        while (it.hasNext()) {
            arrayList.add(it.next());
        }
        return arrayList;
    }

    public static List P(h hVar) {
        AbstractC4862t.e(hVar, "<this>");
        return (List) N(hVar, new ArrayList());
    }

    public static Iterable v(h hVar) {
        AbstractC4862t.e(hVar, "<this>");
        return new a(hVar);
    }

    public static int w(h hVar) {
        AbstractC4862t.e(hVar, "<this>");
        Iterator it = hVar.iterator();
        int i10 = 0;
        while (it.hasNext()) {
            it.next();
            i10++;
            if (i10 < 0) {
                C4206t.t();
            }
        }
        return i10;
    }

    public static h x(h hVar, int i10) {
        AbstractC4862t.e(hVar, "<this>");
        if (i10 >= 0) {
            return i10 == 0 ? hVar : hVar instanceof c ? ((c) hVar).a(i10) : new Nd.b(hVar, i10);
        }
        throw new IllegalArgumentException(("Requested element count " + i10 + " is less than zero.").toString());
    }

    public static h y(h hVar, vc.l predicate) {
        AbstractC4862t.e(hVar, "<this>");
        AbstractC4862t.e(predicate, "predicate");
        return new e(hVar, true, predicate);
    }

    public static h z(h hVar, vc.l predicate) {
        AbstractC4862t.e(hVar, "<this>");
        AbstractC4862t.e(predicate, "predicate");
        return new e(hVar, false, predicate);
    }
}
