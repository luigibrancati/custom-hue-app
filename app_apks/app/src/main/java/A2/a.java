package A2;

import D1.w;
import G1.AbstractC0853a;
import i2.InterfaceC4337q;
import java.util.ArrayDeque;
import org.apache.tika.fork.ForkServer;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public final class a implements c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final byte[] f8a = new byte[8];

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ArrayDeque f9b = new ArrayDeque();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final g f10c = new g();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public A2.b f11d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f12e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f13f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public long f14g;

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f15a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final long f16b;

        public b(int i10, long j10) {
            this.f15a = i10;
            this.f16b = j10;
        }
    }

    public static String f(InterfaceC4337q interfaceC4337q, int i10) {
        if (i10 == 0) {
            return "";
        }
        byte[] bArr = new byte[i10];
        interfaceC4337q.readFully(bArr, 0, i10);
        while (i10 > 0 && bArr[i10 - 1] == 0) {
            i10--;
        }
        return new String(bArr, 0, i10);
    }

    @Override // A2.c
    public boolean a(InterfaceC4337q interfaceC4337q) throws w {
        AbstractC0853a.i(this.f11d);
        while (true) {
            b bVar = (b) this.f9b.peek();
            if (bVar != null && interfaceC4337q.getPosition() >= bVar.f16b) {
                this.f11d.a(((b) this.f9b.pop()).f15a);
                return true;
            }
            if (this.f12e == 0) {
                long jD = this.f10c.d(interfaceC4337q, true, false, 4);
                if (jD == -2) {
                    jD = c(interfaceC4337q);
                }
                if (jD == -1) {
                    return false;
                }
                this.f13f = (int) jD;
                this.f12e = 1;
            }
            if (this.f12e == 1) {
                this.f14g = this.f10c.d(interfaceC4337q, false, true, 8);
                this.f12e = 2;
            }
            int iE = this.f11d.e(this.f13f);
            if (iE != 0) {
                if (iE == 1) {
                    long position = interfaceC4337q.getPosition();
                    this.f9b.push(new b(this.f13f, this.f14g + position));
                    this.f11d.h(this.f13f, position, this.f14g);
                    this.f12e = 0;
                    return true;
                }
                if (iE == 2) {
                    long j10 = this.f14g;
                    if (j10 <= 8) {
                        this.f11d.d(this.f13f, e(interfaceC4337q, (int) j10));
                        this.f12e = 0;
                        return true;
                    }
                    throw w.a("Invalid integer size: " + this.f14g, null);
                }
                if (iE == 3) {
                    long j11 = this.f14g;
                    if (j11 <= 2147483647L) {
                        this.f11d.g(this.f13f, f(interfaceC4337q, (int) j11));
                        this.f12e = 0;
                        return true;
                    }
                    throw w.a("String element size: " + this.f14g, null);
                }
                if (iE == 4) {
                    this.f11d.b(this.f13f, (int) this.f14g, interfaceC4337q);
                    this.f12e = 0;
                    return true;
                }
                if (iE != 5) {
                    throw w.a("Invalid element type " + iE, null);
                }
                long j12 = this.f14g;
                if (j12 == 4 || j12 == 8) {
                    this.f11d.c(this.f13f, d(interfaceC4337q, (int) j12));
                    this.f12e = 0;
                    return true;
                }
                throw w.a("Invalid float size: " + this.f14g, null);
            }
            interfaceC4337q.q((int) this.f14g);
            this.f12e = 0;
        }
    }

    @Override // A2.c
    public void b(A2.b bVar) {
        this.f11d = bVar;
    }

    public final long c(InterfaceC4337q interfaceC4337q) {
        interfaceC4337q.i();
        while (true) {
            interfaceC4337q.s(this.f8a, 0, 4);
            int iC = g.c(this.f8a[0]);
            if (iC != -1 && iC <= 4) {
                int iA = (int) g.a(this.f8a, iC, false);
                if (this.f11d.f(iA)) {
                    interfaceC4337q.q(iC);
                    return iA;
                }
            }
            interfaceC4337q.q(1);
        }
    }

    public final double d(InterfaceC4337q interfaceC4337q, int i10) {
        return i10 == 4 ? Float.intBitsToFloat((int) r1) : Double.longBitsToDouble(e(interfaceC4337q, i10));
    }

    public final long e(InterfaceC4337q interfaceC4337q, int i10) {
        interfaceC4337q.readFully(this.f8a, 0, i10);
        long j10 = 0;
        for (int i11 = 0; i11 < i10; i11++) {
            j10 = (j10 << 8) | ((long) (this.f8a[i11] & ForkServer.ERROR));
        }
        return j10;
    }

    @Override // A2.c
    public void reset() {
        this.f12e = 0;
        this.f9b.clear();
        this.f10c.e();
    }
}
