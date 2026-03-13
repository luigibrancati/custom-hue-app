package E1;

import D1.o;
import G1.M;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.Objects;
import org.apache.tika.utils.StringUtils;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public interface e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final ByteBuffer f3192a = ByteBuffer.allocateDirect(0).order(ByteOrder.nativeOrder());

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class a {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public static final a f3193e = new a(-1, -1, -1);

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f3194a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f3195b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final int f3196c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final int f3197d;

        public a(o oVar) {
            this(oVar.f1781H, oVar.f1780G, oVar.f1782I);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return this.f3194a == aVar.f3194a && this.f3195b == aVar.f3195b && this.f3196c == aVar.f3196c;
        }

        public int hashCode() {
            return Objects.hash(Integer.valueOf(this.f3194a), Integer.valueOf(this.f3195b), Integer.valueOf(this.f3196c));
        }

        public String toString() {
            return "AudioFormat[sampleRate=" + this.f3194a + ", channelCount=" + this.f3195b + ", encoding=" + this.f3196c + ']';
        }

        public a(int i10, int i11, int i12) {
            this.f3194a = i10;
            this.f3195b = i11;
            this.f3196c = i12;
            this.f3197d = M.D0(i12) ? M.l0(i12, i11) : -1;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class b extends Exception {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final a f3198a;

        public b(a aVar) {
            this("Unhandled input format:", aVar);
        }

        public b(String str, a aVar) {
            super(str + StringUtils.SPACE + aVar);
            this.f3198a = aVar;
        }
    }

    boolean b();

    boolean c();

    ByteBuffer d();

    a e(a aVar);

    void f(ByteBuffer byteBuffer);

    void flush();

    void g();

    void reset();
}
