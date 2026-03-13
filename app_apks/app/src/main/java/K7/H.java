package K7;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public abstract class H {

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public class a extends e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ int f7586a;

        public a(int i10) {
            this.f7586a = i10;
        }

        @Override // K7.H.e
        public Map c() {
            return N.c(this.f7586a);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public class b extends e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Comparator f7587a;

        public b(Comparator comparator) {
            this.f7587a = comparator;
        }

        @Override // K7.H.e
        public Map c() {
            return new TreeMap(this.f7587a);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class c implements J7.t, Serializable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f7588a;

        public c(int i10) {
            this.f7588a = AbstractC1069i.b(i10, "expectedValuesPerKey");
        }

        @Override // J7.t
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public List get() {
            return new ArrayList(this.f7588a);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static abstract class d extends H {
        public d() {
            super(null);
        }

        public abstract C e();
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static abstract class e {

        /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
        public class a extends d {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final /* synthetic */ int f7589a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ e f7590b;

            public a(e eVar, int i10) {
                this.f7589a = i10;
                this.f7590b = eVar;
            }

            @Override // K7.H.d
            public C e() {
                return I.b(this.f7590b.c(), new c(this.f7589a));
            }
        }

        public d a() {
            return b(2);
        }

        public d b(int i10) {
            AbstractC1069i.b(i10, "expectedValuesPerKey");
            return new a(this, i10);
        }

        public abstract Map c();
    }

    public /* synthetic */ H(a aVar) {
        this();
    }

    public static e a() {
        return b(8);
    }

    public static e b(int i10) {
        AbstractC1069i.b(i10, "expectedKeys");
        return new a(i10);
    }

    public static e c() {
        return d(M.d());
    }

    public static e d(Comparator comparator) {
        J7.n.j(comparator);
        return new b(comparator);
    }

    public H() {
    }
}
