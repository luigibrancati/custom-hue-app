package md;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import md.i;

/* JADX INFO: renamed from: md.g, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public class C5053g {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final C5053g f40319b = new C5053g(true);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Map f40320a;

    /* JADX INFO: renamed from: md.g$a */
    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Object f40321a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f40322b;

        public a(Object obj, int i10) {
            this.f40321a = obj;
            this.f40322b = i10;
        }

        public boolean equals(Object obj) {
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return this.f40321a == aVar.f40321a && this.f40322b == aVar.f40322b;
        }

        public int hashCode() {
            return (System.identityHashCode(this.f40321a) * 65535) + this.f40322b;
        }
    }

    public C5053g() {
        this.f40320a = new HashMap();
    }

    public static C5053g c() {
        return f40319b;
    }

    public static C5053g d() {
        return new C5053g();
    }

    public final void a(i.f fVar) {
        this.f40320a.put(new a(fVar.b(), fVar.d()), fVar);
    }

    public i.f b(p pVar, int i10) {
        return (i.f) this.f40320a.get(new a(pVar, i10));
    }

    public C5053g(boolean z10) {
        this.f40320a = Collections.EMPTY_MAP;
    }
}
