package zc;

import io.flutter.embedding.android.KeyboardMap;
import java.io.Serializable;
import kotlin.jvm.internal.AbstractC4854k;
import pc.AbstractC5458b;

/* JADX INFO: renamed from: zc.c, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC6558c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a f48885a = new a(null);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final AbstractC6558c f48886b = AbstractC5458b.f42540a.b();

    /* JADX INFO: renamed from: zc.c$a */
    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class a extends AbstractC6558c implements Serializable {
        public /* synthetic */ a(AbstractC4854k abstractC4854k) {
            this();
        }

        @Override // zc.AbstractC6558c
        public int b(int i10) {
            return AbstractC6558c.f48886b.b(i10);
        }

        @Override // zc.AbstractC6558c
        public int c() {
            return AbstractC6558c.f48886b.c();
        }

        @Override // zc.AbstractC6558c
        public int d(int i10) {
            return AbstractC6558c.f48886b.d(i10);
        }

        @Override // zc.AbstractC6558c
        public int e(int i10, int i11) {
            return AbstractC6558c.f48886b.e(i10, i11);
        }

        @Override // zc.AbstractC6558c
        public long f() {
            return AbstractC6558c.f48886b.f();
        }

        @Override // zc.AbstractC6558c
        public long g(long j10, long j11) {
            return AbstractC6558c.f48886b.g(j10, j11);
        }

        public a() {
        }
    }

    public abstract int b(int i10);

    public int c() {
        return b(32);
    }

    public int d(int i10) {
        return e(0, i10);
    }

    public int e(int i10, int i11) {
        int iC;
        int i12;
        int iB;
        AbstractC6559d.c(i10, i11);
        int i13 = i11 - i10;
        if (i13 > 0 || i13 == Integer.MIN_VALUE) {
            if (((-i13) & i13) == i13) {
                iB = b(AbstractC6559d.e(i13));
            } else {
                do {
                    iC = c() >>> 1;
                    i12 = iC % i13;
                } while ((iC - i12) + (i13 - 1) < 0);
                iB = i12;
            }
            return i10 + iB;
        }
        while (true) {
            int iC2 = c();
            if (i10 <= iC2 && iC2 < i11) {
                return iC2;
            }
        }
    }

    public long f() {
        return (((long) c()) << 32) + ((long) c());
    }

    public long g(long j10, long j11) {
        long jF;
        long j12;
        long jB;
        int iC;
        AbstractC6559d.d(j10, j11);
        long j13 = j11 - j10;
        if (j13 > 0) {
            if (((-j13) & j13) == j13) {
                int i10 = (int) j13;
                int i11 = (int) (j13 >>> 32);
                if (i10 != 0) {
                    iC = b(AbstractC6559d.e(i10));
                } else if (i11 == 1) {
                    iC = c();
                } else {
                    jB = (((long) b(AbstractC6559d.e(i11))) << 32) + (((long) c()) & KeyboardMap.kValueMask);
                }
                jB = ((long) iC) & KeyboardMap.kValueMask;
            } else {
                do {
                    jF = f() >>> 1;
                    j12 = jF % j13;
                } while ((jF - j12) + (j13 - 1) < 0);
                jB = j12;
            }
            return j10 + jB;
        }
        while (true) {
            long jF2 = f();
            if (j10 <= jF2 && jF2 < j11) {
                return jF2;
            }
        }
    }
}
