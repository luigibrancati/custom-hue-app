package i4;

import fc.AbstractC4040w;
import gc.Q;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.AbstractC4854k;
import kotlin.jvm.internal.AbstractC4862t;
import wc.InterfaceC6184a;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public final class m implements Iterable, InterfaceC6184a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final b f37184b = new b(null);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final m f37185c = new m();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Map f37186a;

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class b {
        public /* synthetic */ b(AbstractC4854k abstractC4854k) {
            this();
        }

        public b() {
        }
    }

    public /* synthetic */ m(Map map, AbstractC4854k abstractC4854k) {
        this(map);
    }

    public final Map d() {
        if (isEmpty()) {
            return Q.i();
        }
        Map map = this.f37186a;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Iterator it = map.entrySet().iterator();
        if (!it.hasNext()) {
            return linkedHashMap;
        }
        android.support.v4.media.session.a.a(((Map.Entry) it.next()).getValue());
        throw null;
    }

    public final a e() {
        return new a(this);
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            return (obj instanceof m) && AbstractC4862t.a(this.f37186a, ((m) obj).f37186a);
        }
        return true;
    }

    public int hashCode() {
        return this.f37186a.hashCode();
    }

    public final boolean isEmpty() {
        return this.f37186a.isEmpty();
    }

    @Override // java.lang.Iterable
    public Iterator iterator() {
        Map map = this.f37186a;
        ArrayList arrayList = new ArrayList(map.size());
        for (Map.Entry entry : map.entrySet()) {
            String str = (String) entry.getKey();
            android.support.v4.media.session.a.a(entry.getValue());
            arrayList.add(AbstractC4040w.a(str, null));
        }
        return arrayList.iterator();
    }

    public String toString() {
        return "Parameters(map=" + this.f37186a + ')';
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Map f37187a;

        public a() {
            this.f37187a = new LinkedHashMap();
        }

        public final m a() {
            return new m(Q.u(this.f37187a), null);
        }

        public a(m parameters) {
            AbstractC4862t.e(parameters, "parameters");
            this.f37187a = Q.w(parameters.f37186a);
        }
    }

    public m(Map map) {
        this.f37186a = map;
    }

    public m() {
        this(Q.i());
    }
}
