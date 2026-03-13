package Cc;

import fc.C4032o;
import kotlin.jvm.internal.AbstractC4854k;
import kotlin.jvm.internal.AbstractC4862t;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public final class r {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final a f1238c = new a(null);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final r f1239d = new r(null, null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final s f1240a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final p f1241b;

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class a {
        public /* synthetic */ a(AbstractC4854k abstractC4854k) {
            this();
        }

        public final r a(p type) {
            AbstractC4862t.e(type, "type");
            return new r(s.IN, type);
        }

        public final r b(p type) {
            AbstractC4862t.e(type, "type");
            return new r(s.OUT, type);
        }

        public final r c() {
            return r.f1239d;
        }

        public final r d(p type) {
            AbstractC4862t.e(type, "type");
            return new r(s.INVARIANT, type);
        }

        public a() {
        }
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final /* synthetic */ class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f1242a;

        static {
            int[] iArr = new int[s.values().length];
            try {
                iArr[s.INVARIANT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[s.IN.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[s.OUT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f1242a = iArr;
        }
    }

    public r(s sVar, p pVar) {
        String str;
        this.f1240a = sVar;
        this.f1241b = pVar;
        if ((sVar == null) == (pVar == null)) {
            return;
        }
        if (sVar == null) {
            str = "Star projection must have no type specified.";
        } else {
            str = "The projection variance " + sVar + " requires type to be specified.";
        }
        throw new IllegalArgumentException(str.toString());
    }

    public final s a() {
        return this.f1240a;
    }

    public final p b() {
        return this.f1241b;
    }

    public final p c() {
        return this.f1241b;
    }

    public final s d() {
        return this.f1240a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof r)) {
            return false;
        }
        r rVar = (r) obj;
        return this.f1240a == rVar.f1240a && AbstractC4862t.a(this.f1241b, rVar.f1241b);
    }

    public int hashCode() {
        s sVar = this.f1240a;
        int iHashCode = (sVar == null ? 0 : sVar.hashCode()) * 31;
        p pVar = this.f1241b;
        return iHashCode + (pVar != null ? pVar.hashCode() : 0);
    }

    public String toString() {
        s sVar = this.f1240a;
        int i10 = sVar == null ? -1 : b.f1242a[sVar.ordinal()];
        if (i10 == -1) {
            return "*";
        }
        if (i10 == 1) {
            return String.valueOf(this.f1241b);
        }
        if (i10 == 2) {
            return "in " + this.f1241b;
        }
        if (i10 != 3) {
            throw new C4032o();
        }
        return "out " + this.f1241b;
    }
}
