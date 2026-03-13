package O4;

import com.google.android.gms.internal.play_billing.AbstractC3541h0;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: O4.w, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public final class C1620w {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final AbstractC3541h0 f11175a;

    /* JADX INFO: renamed from: O4.w$a */
    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public AbstractC3541h0 f11176a;

        public /* synthetic */ a(I0 i02) {
        }

        public C1620w a() {
            if (this.f11176a != null) {
                return new C1620w(this, null);
            }
            throw new IllegalArgumentException("Product list must be set to a non empty list.");
        }

        public a b(List list) {
            if (list == null || list.isEmpty()) {
                throw new IllegalArgumentException("Product list cannot be empty.");
            }
            HashSet hashSet = new HashSet();
            Iterator it = list.iterator();
            while (it.hasNext()) {
                b bVar = (b) it.next();
                if (!"play_pass_subs".equals(bVar.c())) {
                    hashSet.add(bVar.c());
                }
            }
            if (hashSet.size() > 1) {
                throw new IllegalArgumentException("All products should be of the same product type.");
            }
            this.f11176a = AbstractC3541h0.r(list);
            return this;
        }
    }

    /* JADX INFO: renamed from: O4.w$b */
    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f11177a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f11178b;

        /* JADX INFO: renamed from: O4.w$b$a */
        /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
        public static class a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public String f11179a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public String f11180b;

            public /* synthetic */ a(I0 i02) {
            }

            public b a() {
                if ("first_party".equals(this.f11180b)) {
                    throw new IllegalArgumentException("Serialized doc id must be provided for first party products.");
                }
                if (this.f11179a == null) {
                    throw new IllegalArgumentException("Product id must be provided.");
                }
                if (this.f11180b != null) {
                    return new b(this, null);
                }
                throw new IllegalArgumentException("Product type must be provided.");
            }

            public a b(String str) {
                this.f11179a = str;
                return this;
            }

            public a c(String str) {
                this.f11180b = str;
                return this;
            }
        }

        public /* synthetic */ b(a aVar, I0 i02) {
            this.f11177a = aVar.f11179a;
            this.f11178b = aVar.f11180b;
        }

        public static a a() {
            return new a(null);
        }

        public final String b() {
            return this.f11177a;
        }

        public final String c() {
            return this.f11178b;
        }
    }

    public /* synthetic */ C1620w(a aVar, I0 i02) {
        this.f11175a = aVar.f11176a;
    }

    public static a a() {
        return new a(null);
    }

    public final AbstractC3541h0 b() {
        return this.f11175a;
    }

    public final String c() {
        return ((b) this.f11175a.get(0)).c();
    }
}
