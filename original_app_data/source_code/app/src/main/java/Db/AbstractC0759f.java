package Db;

import Db.InterfaceC0758e;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;

/* JADX INFO: renamed from: Db.f, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC0759f {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f2465b;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public long f2464a = 1;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public List f2466c = new ArrayList();

    /* JADX INFO: renamed from: Db.f$b */
    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class b implements InterfaceC0758e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f2467a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final List f2468b;

        public final boolean a(b bVar) {
            return this.f2467a == bVar.f2467a && this.f2468b.equals(bVar.f2468b);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof b) && a((b) obj);
        }

        public int hashCode() {
            int i10 = this.f2467a + 177573;
            return i10 + (i10 << 5) + this.f2468b.hashCode();
        }

        public String toString() {
            return "Channels{count=" + this.f2467a + ", objectCodingIdentifiers=" + this.f2468b + "}";
        }

        public b(AbstractC0759f abstractC0759f) {
            this.f2467a = abstractC0759f.f2465b;
            this.f2468b = AbstractC0759f.g(true, abstractC0759f.f2466c);
        }
    }

    public AbstractC0759f() {
        if (!(this instanceof InterfaceC0758e.a)) {
            throw new UnsupportedOperationException("Use: new Channels.Builder()");
        }
    }

    public static List g(boolean z10, List list) {
        int size = list.size();
        if (size == 0) {
            return Collections.EMPTY_LIST;
        }
        if (size == 1) {
            return Collections.singletonList(list.get(0));
        }
        if (z10) {
            return Collections.unmodifiableList(new ArrayList(list));
        }
        if (list instanceof ArrayList) {
            ((ArrayList) list).trimToSize();
        }
        return Collections.unmodifiableList(list);
    }

    public final InterfaceC0758e.a d(Iterable iterable) {
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            String str = (String) it.next();
            List list = this.f2466c;
            Objects.requireNonNull(str, "objectCodingIdentifiers element");
            list.add(str);
        }
        return (InterfaceC0758e.a) this;
    }

    public InterfaceC0758e e() {
        if (this.f2464a == 0) {
            return new b();
        }
        throw new IllegalStateException(h());
    }

    public InterfaceC0758e.a f(int i10) {
        this.f2465b = i10;
        this.f2464a &= -2;
        return (InterfaceC0758e.a) this;
    }

    public final String h() {
        ArrayList arrayList = new ArrayList();
        if ((this.f2464a & 1) != 0) {
            arrayList.add("count");
        }
        return "Cannot build Channels, some of required attributes are not set " + arrayList;
    }

    public InterfaceC0758e.a i(Iterable iterable) {
        this.f2466c.clear();
        return d(iterable);
    }
}
