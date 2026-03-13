package fc;

import kotlin.jvm.internal.AbstractC4854k;

/* JADX INFO: renamed from: fc.B, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public final class C4009B implements Comparable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final a f34243b = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f34244a;

    /* JADX INFO: renamed from: fc.B$a */
    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class a {
        public /* synthetic */ a(AbstractC4854k abstractC4854k) {
            this();
        }

        public a() {
        }
    }

    public /* synthetic */ C4009B(long j10) {
        this.f34244a = j10;
    }

    public static final /* synthetic */ C4009B a(long j10) {
        return new C4009B(j10);
    }

    public static boolean j(long j10, Object obj) {
        return (obj instanceof C4009B) && j10 == ((C4009B) obj).s();
    }

    public static int p(long j10) {
        return Long.hashCode(j10);
    }

    public static String q(long j10) {
        return AbstractC4017J.d(j10, 10);
    }

    @Override // java.lang.Comparable
    public /* bridge */ /* synthetic */ int compareTo(Object obj) {
        return AbstractC4017J.b(s(), ((C4009B) obj).s());
    }

    public boolean equals(Object obj) {
        return j(this.f34244a, obj);
    }

    public int hashCode() {
        return p(this.f34244a);
    }

    public final /* synthetic */ long s() {
        return this.f34244a;
    }

    public String toString() {
        return q(this.f34244a);
    }

    public static long b(long j10) {
        return j10;
    }
}
