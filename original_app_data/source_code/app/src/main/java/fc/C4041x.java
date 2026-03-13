package fc;

import kotlin.jvm.internal.AbstractC4854k;
import kotlin.jvm.internal.AbstractC4862t;
import org.apache.tika.fork.ForkServer;

/* JADX INFO: renamed from: fc.x, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public final class C4041x implements Comparable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final a f34288b = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final byte f34289a;

    /* JADX INFO: renamed from: fc.x$a */
    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class a {
        public /* synthetic */ a(AbstractC4854k abstractC4854k) {
            this();
        }

        public a() {
        }
    }

    public /* synthetic */ C4041x(byte b10) {
        this.f34289a = b10;
    }

    public static final /* synthetic */ C4041x a(byte b10) {
        return new C4041x(b10);
    }

    public static boolean j(byte b10, Object obj) {
        return (obj instanceof C4041x) && b10 == ((C4041x) obj).s();
    }

    public static int p(byte b10) {
        return Byte.hashCode(b10);
    }

    public static String q(byte b10) {
        return String.valueOf(b10 & ForkServer.ERROR);
    }

    @Override // java.lang.Comparable
    public /* bridge */ /* synthetic */ int compareTo(Object obj) {
        return AbstractC4862t.f(s() & ForkServer.ERROR, ((C4041x) obj).s() & ForkServer.ERROR);
    }

    public boolean equals(Object obj) {
        return j(this.f34289a, obj);
    }

    public int hashCode() {
        return p(this.f34289a);
    }

    public final /* synthetic */ byte s() {
        return this.f34289a;
    }

    public String toString() {
        return q(this.f34289a);
    }

    public static byte b(byte b10) {
        return b10;
    }
}
