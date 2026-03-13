package Uc;

import fc.C4026i;
import kotlin.jvm.internal.AbstractC4854k;
import kotlin.jvm.internal.AbstractC4862t;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public final class w {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final a f16951d = new a(null);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final w f16952e = new w(G.STRICT, null, null, 6, null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final G f16953a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final C4026i f16954b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final G f16955c;

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class a {
        public /* synthetic */ a(AbstractC4854k abstractC4854k) {
            this();
        }

        public final w a() {
            return w.f16952e;
        }

        public a() {
        }
    }

    public w(G reportLevelBefore, C4026i c4026i, G reportLevelAfter) {
        AbstractC4862t.e(reportLevelBefore, "reportLevelBefore");
        AbstractC4862t.e(reportLevelAfter, "reportLevelAfter");
        this.f16953a = reportLevelBefore;
        this.f16954b = c4026i;
        this.f16955c = reportLevelAfter;
    }

    public final G b() {
        return this.f16955c;
    }

    public final G c() {
        return this.f16953a;
    }

    public final C4026i d() {
        return this.f16954b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof w)) {
            return false;
        }
        w wVar = (w) obj;
        return this.f16953a == wVar.f16953a && AbstractC4862t.a(this.f16954b, wVar.f16954b) && this.f16955c == wVar.f16955c;
    }

    public int hashCode() {
        int iHashCode = this.f16953a.hashCode() * 31;
        C4026i c4026i = this.f16954b;
        return ((iHashCode + (c4026i == null ? 0 : c4026i.hashCode())) * 31) + this.f16955c.hashCode();
    }

    public String toString() {
        return "JavaNullabilityAnnotationsStatus(reportLevelBefore=" + this.f16953a + ", sinceVersion=" + this.f16954b + ", reportLevelAfter=" + this.f16955c + ')';
    }

    public /* synthetic */ w(G g10, C4026i c4026i, G g11, int i10, AbstractC4854k abstractC4854k) {
        this(g10, (i10 & 2) != 0 ? new C4026i(1, 0) : c4026i, (i10 & 4) != 0 ? g10 : g11);
    }
}
