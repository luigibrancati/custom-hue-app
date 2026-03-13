package Qd;

import Od.C;
import fc.C4009B;
import java.io.Serializable;
import kotlin.jvm.internal.AbstractC4854k;
import kotlin.jvm.internal.AbstractC4862t;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public final class a implements Comparable, Serializable {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final C0175a f14278c = new C0175a(null);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final a f14279d = new a(0, 0);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f14280a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f14281b;

    /* JADX INFO: renamed from: Qd.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class C0175a {
        public /* synthetic */ C0175a(AbstractC4854k abstractC4854k) {
            this();
        }

        public final a a(long j10, long j11) {
            return (j10 == 0 && j11 == 0) ? b() : new a(j10, j11, null);
        }

        public final a b() {
            return a.f14279d;
        }

        public final a c(String uuidString) {
            AbstractC4862t.e(uuidString, "uuidString");
            int length = uuidString.length();
            if (length == 32) {
                return b.b(uuidString);
            }
            if (length == 36) {
                return b.c(uuidString);
            }
            throw new IllegalArgumentException("Expected either a 36-char string in the standard hex-and-dash UUID format or a 32-char hexadecimal string, but was \"" + c.g(uuidString, 64) + "\" of length " + uuidString.length());
        }

        public C0175a() {
        }
    }

    public /* synthetic */ a(long j10, long j11, AbstractC4854k abstractC4854k) {
        this(j10, j11);
    }

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public int compareTo(a other) {
        AbstractC4862t.e(other, "other");
        long j10 = this.f14280a;
        return j10 != other.f14280a ? Long.compareUnsigned(C4009B.b(j10), C4009B.b(other.f14280a)) : Long.compareUnsigned(C4009B.b(this.f14281b), C4009B.b(other.f14281b));
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return this.f14280a == aVar.f14280a && this.f14281b == aVar.f14281b;
    }

    public int hashCode() {
        return Long.hashCode(this.f14280a ^ this.f14281b);
    }

    public final String j() {
        byte[] bArr = new byte[36];
        b.a(this.f14280a, bArr, 0, 0, 4);
        bArr[8] = 45;
        b.a(this.f14280a, bArr, 9, 4, 6);
        bArr[13] = 45;
        b.a(this.f14280a, bArr, 14, 6, 8);
        bArr[18] = 45;
        b.a(this.f14281b, bArr, 19, 0, 2);
        bArr[23] = 45;
        b.a(this.f14281b, bArr, 24, 2, 8);
        return C.A(bArr);
    }

    public String toString() {
        return j();
    }

    public a(long j10, long j11) {
        this.f14280a = j10;
        this.f14281b = j11;
    }
}
