package fc;

import kotlin.jvm.internal.AbstractC4854k;
import kotlin.jvm.internal.AbstractC4862t;

/* JADX INFO: renamed from: fc.E, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public final class C4012E implements Comparable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final a f34249b = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final short f34250a;

    /* JADX INFO: renamed from: fc.E$a */
    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class a {
        public /* synthetic */ a(AbstractC4854k abstractC4854k) {
            this();
        }

        public a() {
        }
    }

    public /* synthetic */ C4012E(short s10) {
        this.f34250a = s10;
    }

    public static final /* synthetic */ C4012E a(short s10) {
        return new C4012E(s10);
    }

    public static boolean j(short s10, Object obj) {
        return (obj instanceof C4012E) && s10 == ((C4012E) obj).u();
    }

    public static final boolean p(short s10, short s11) {
        return s10 == s11;
    }

    public static int q(short s10) {
        return Short.hashCode(s10);
    }

    public static String s(short s10) {
        return String.valueOf(s10 & 65535);
    }

    @Override // java.lang.Comparable
    public /* bridge */ /* synthetic */ int compareTo(Object obj) {
        return AbstractC4862t.f(u() & 65535, ((C4012E) obj).u() & 65535);
    }

    public boolean equals(Object obj) {
        return j(this.f34250a, obj);
    }

    public int hashCode() {
        return q(this.f34250a);
    }

    public String toString() {
        return s(this.f34250a);
    }

    public final /* synthetic */ short u() {
        return this.f34250a;
    }

    public static short b(short s10) {
        return s10;
    }
}
