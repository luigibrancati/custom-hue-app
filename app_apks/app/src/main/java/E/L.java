package E;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public final class L {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f2803a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f2804b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final List f2805c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long f2806d;

    public L(a aVar) {
        this.f2803a = Collections.unmodifiableList(aVar.f2807a);
        this.f2804b = Collections.unmodifiableList(aVar.f2808b);
        this.f2805c = Collections.unmodifiableList(aVar.f2809c);
        this.f2806d = aVar.f2810d;
    }

    public long a() {
        return this.f2806d;
    }

    public List b() {
        return this.f2804b;
    }

    public List c() {
        return this.f2803a;
    }

    public List d() {
        return this.f2805c;
    }

    public boolean e() {
        return this.f2806d > 0;
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final List f2807a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final List f2808b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final List f2809c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public long f2810d;

        public a(C0812s0 c0812s0, int i10) {
            this.f2807a = new ArrayList();
            this.f2808b = new ArrayList();
            this.f2809c = new ArrayList();
            this.f2810d = 5000L;
            a(c0812s0, i10);
        }

        public a a(C0812s0 c0812s0, int i10) {
            boolean z10 = false;
            X0.h.b(c0812s0 != null, "Point cannot be null.");
            if (i10 >= 1 && i10 <= 7) {
                z10 = true;
            }
            X0.h.b(z10, "Invalid metering mode " + i10);
            if ((i10 & 1) != 0) {
                this.f2807a.add(c0812s0);
            }
            if ((i10 & 2) != 0) {
                this.f2808b.add(c0812s0);
            }
            if ((i10 & 4) != 0) {
                this.f2809c.add(c0812s0);
            }
            return this;
        }

        public L b() {
            return new L(this);
        }

        public a c(int i10) {
            if ((i10 & 1) != 0) {
                this.f2807a.clear();
            }
            if ((i10 & 2) != 0) {
                this.f2808b.clear();
            }
            if ((i10 & 4) != 0) {
                this.f2809c.clear();
            }
            return this;
        }

        public a(L l10) {
            ArrayList arrayList = new ArrayList();
            this.f2807a = arrayList;
            ArrayList arrayList2 = new ArrayList();
            this.f2808b = arrayList2;
            ArrayList arrayList3 = new ArrayList();
            this.f2809c = arrayList3;
            this.f2810d = 5000L;
            arrayList.addAll(l10.c());
            arrayList2.addAll(l10.b());
            arrayList3.addAll(l10.d());
            this.f2810d = l10.a();
        }
    }
}
