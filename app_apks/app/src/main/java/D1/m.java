package D1;

import G1.AbstractC0853a;
import android.util.SparseBooleanArray;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public final class m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final SparseBooleanArray f1733a;

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final SparseBooleanArray f1734a = new SparseBooleanArray();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public boolean f1735b;

        public b a(int i10) {
            AbstractC0853a.g(!this.f1735b);
            this.f1734a.append(i10, true);
            return this;
        }

        public b b(m mVar) {
            for (int i10 = 0; i10 < mVar.c(); i10++) {
                a(mVar.b(i10));
            }
            return this;
        }

        public b c(int... iArr) {
            for (int i10 : iArr) {
                a(i10);
            }
            return this;
        }

        public b d(int i10, boolean z10) {
            return z10 ? a(i10) : this;
        }

        public m e() {
            AbstractC0853a.g(!this.f1735b);
            this.f1735b = true;
            return new m(this.f1734a);
        }
    }

    public boolean a(int i10) {
        return this.f1733a.get(i10);
    }

    public int b(int i10) {
        AbstractC0853a.c(i10, 0, c());
        return this.f1733a.keyAt(i10);
    }

    public int c() {
        return this.f1733a.size();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof m) {
            return this.f1733a.equals(((m) obj).f1733a);
        }
        return false;
    }

    public int hashCode() {
        return this.f1733a.hashCode();
    }

    public m(SparseBooleanArray sparseBooleanArray) {
        this.f1733a = sparseBooleanArray;
    }
}
