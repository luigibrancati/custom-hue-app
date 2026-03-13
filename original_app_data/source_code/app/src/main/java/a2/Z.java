package a2;

import D1.InterfaceC0749g;
import G1.AbstractC0853a;
import a2.b0;
import e2.C3926a;
import e2.b;
import i2.O;
import java.io.EOFException;
import java.nio.ByteBuffer;
import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public class Z {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final e2.b f20681a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f20682b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final G1.C f20683c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public a f20684d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public a f20685e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public a f20686f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public long f20687g;

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class a implements b.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public long f20688a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public long f20689b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public C3926a f20690c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public a f20691d;

        public a(long j10, int i10) {
            d(j10, i10);
        }

        @Override // e2.b.a
        public C3926a a() {
            return (C3926a) AbstractC0853a.e(this.f20690c);
        }

        public a b() {
            this.f20690c = null;
            a aVar = this.f20691d;
            this.f20691d = null;
            return aVar;
        }

        public void c(C3926a c3926a, a aVar) {
            this.f20690c = c3926a;
            this.f20691d = aVar;
        }

        public void d(long j10, int i10) {
            AbstractC0853a.g(this.f20690c == null);
            this.f20688a = j10;
            this.f20689b = j10 + ((long) i10);
        }

        public int e(long j10) {
            return ((int) (j10 - this.f20688a)) + this.f20690c.f33574b;
        }

        @Override // e2.b.a
        public b.a next() {
            a aVar = this.f20691d;
            if (aVar == null || aVar.f20690c == null) {
                return null;
            }
            return aVar;
        }
    }

    public Z(e2.b bVar) {
        this.f20681a = bVar;
        int iE = bVar.e();
        this.f20682b = iE;
        this.f20683c = new G1.C(32);
        a aVar = new a(0L, iE);
        this.f20684d = aVar;
        this.f20685e = aVar;
        this.f20686f = aVar;
    }

    public static a d(a aVar, long j10) {
        while (j10 >= aVar.f20689b) {
            aVar = aVar.f20691d;
        }
        return aVar;
    }

    public static a i(a aVar, long j10, ByteBuffer byteBuffer, int i10) {
        a aVarD = d(aVar, j10);
        while (i10 > 0) {
            int iMin = Math.min(i10, (int) (aVarD.f20689b - j10));
            byteBuffer.put(aVarD.f20690c.f33573a, aVarD.e(j10), iMin);
            i10 -= iMin;
            j10 += (long) iMin;
            if (j10 == aVarD.f20689b) {
                aVarD = aVarD.f20691d;
            }
        }
        return aVarD;
    }

    public static a j(a aVar, long j10, byte[] bArr, int i10) {
        a aVarD = d(aVar, j10);
        int i11 = i10;
        while (i11 > 0) {
            int iMin = Math.min(i11, (int) (aVarD.f20689b - j10));
            System.arraycopy(aVarD.f20690c.f33573a, aVarD.e(j10), bArr, i10 - i11, iMin);
            i11 -= iMin;
            j10 += (long) iMin;
            if (j10 == aVarD.f20689b) {
                aVarD = aVarD.f20691d;
            }
        }
        return aVarD;
    }

    public static a k(a aVar, J1.f fVar, b0.b bVar, G1.C c10) {
        long j10 = bVar.f20733b;
        int iT = 1;
        c10.W(1);
        a aVarJ = j(aVar, j10, c10.f(), 1);
        long j11 = j10 + 1;
        byte b10 = c10.f()[0];
        boolean z10 = (b10 & 128) != 0;
        int i10 = b10 & 127;
        J1.c cVar = fVar.f5877c;
        byte[] bArr = cVar.f5864a;
        if (bArr == null) {
            cVar.f5864a = new byte[16];
        } else {
            Arrays.fill(bArr, (byte) 0);
        }
        a aVarJ2 = j(aVarJ, j11, cVar.f5864a, i10);
        long j12 = j11 + ((long) i10);
        if (z10) {
            c10.W(2);
            aVarJ2 = j(aVarJ2, j12, c10.f(), 2);
            j12 += 2;
            iT = c10.T();
        }
        int i11 = iT;
        int[] iArr = cVar.f5867d;
        if (iArr == null || iArr.length < i11) {
            iArr = new int[i11];
        }
        int[] iArr2 = iArr;
        int[] iArr3 = cVar.f5868e;
        if (iArr3 == null || iArr3.length < i11) {
            iArr3 = new int[i11];
        }
        int[] iArr4 = iArr3;
        if (z10) {
            int i12 = i11 * 6;
            c10.W(i12);
            aVarJ2 = j(aVarJ2, j12, c10.f(), i12);
            j12 += (long) i12;
            c10.a0(0);
            for (int i13 = 0; i13 < i11; i13++) {
                iArr2[i13] = c10.T();
                iArr4[i13] = c10.P();
            }
        } else {
            iArr2[0] = 0;
            iArr4[0] = bVar.f20732a - ((int) (j12 - bVar.f20733b));
        }
        O.a aVar2 = (O.a) G1.M.i(bVar.f20734c);
        cVar.c(i11, iArr2, iArr4, aVar2.f36889b, cVar.f5864a, aVar2.f36888a, aVar2.f36890c, aVar2.f36891d);
        long j13 = bVar.f20733b;
        int i14 = (int) (j12 - j13);
        bVar.f20733b = j13 + ((long) i14);
        bVar.f20732a -= i14;
        return aVarJ2;
    }

    public static a l(a aVar, J1.f fVar, b0.b bVar, G1.C c10) {
        if (fVar.F()) {
            aVar = k(aVar, fVar, bVar, c10);
        }
        if (!fVar.v()) {
            fVar.D(bVar.f20732a);
            return i(aVar, bVar.f20733b, fVar.f5878d, bVar.f20732a);
        }
        c10.W(4);
        a aVarJ = j(aVar, bVar.f20733b, c10.f(), 4);
        int iP = c10.P();
        bVar.f20733b += 4;
        bVar.f20732a -= 4;
        fVar.D(iP);
        a aVarI = i(aVarJ, bVar.f20733b, fVar.f5878d, iP);
        bVar.f20733b += (long) iP;
        int i10 = bVar.f20732a - iP;
        bVar.f20732a = i10;
        fVar.H(i10);
        return i(aVarI, bVar.f20733b, fVar.f5881g, bVar.f20732a);
    }

    public final void a(a aVar) {
        if (aVar.f20690c == null) {
            return;
        }
        this.f20681a.c(aVar);
        aVar.b();
    }

    public void b(long j10) {
        a aVar;
        if (j10 == -1) {
            return;
        }
        while (true) {
            aVar = this.f20684d;
            if (j10 < aVar.f20689b) {
                break;
            }
            this.f20681a.b(aVar.f20690c);
            this.f20684d = this.f20684d.b();
        }
        if (this.f20685e.f20688a < aVar.f20688a) {
            this.f20685e = aVar;
        }
    }

    public void c(long j10) {
        AbstractC0853a.a(j10 <= this.f20687g);
        this.f20687g = j10;
        if (j10 != 0) {
            a aVar = this.f20684d;
            if (j10 != aVar.f20688a) {
                while (this.f20687g > aVar.f20689b) {
                    aVar = aVar.f20691d;
                }
                a aVar2 = (a) AbstractC0853a.e(aVar.f20691d);
                a(aVar2);
                a aVar3 = new a(aVar.f20689b, this.f20682b);
                aVar.f20691d = aVar3;
                if (this.f20687g == aVar.f20689b) {
                    aVar = aVar3;
                }
                this.f20686f = aVar;
                if (this.f20685e == aVar2) {
                    this.f20685e = aVar3;
                    return;
                }
                return;
            }
        }
        a(this.f20684d);
        a aVar4 = new a(this.f20687g, this.f20682b);
        this.f20684d = aVar4;
        this.f20685e = aVar4;
        this.f20686f = aVar4;
    }

    public long e() {
        return this.f20687g;
    }

    public void f(J1.f fVar, b0.b bVar) {
        l(this.f20685e, fVar, bVar, this.f20683c);
    }

    public final void g(int i10) {
        long j10 = this.f20687g + ((long) i10);
        this.f20687g = j10;
        a aVar = this.f20686f;
        if (j10 == aVar.f20689b) {
            this.f20686f = aVar.f20691d;
        }
    }

    public final int h(int i10) {
        a aVar = this.f20686f;
        if (aVar.f20690c == null) {
            aVar.c(this.f20681a.a(), new a(this.f20686f.f20689b, this.f20682b));
        }
        return Math.min(i10, (int) (this.f20686f.f20689b - this.f20687g));
    }

    public void m(J1.f fVar, b0.b bVar) {
        this.f20685e = l(this.f20685e, fVar, bVar, this.f20683c);
    }

    public void n() {
        a(this.f20684d);
        this.f20684d.d(0L, this.f20682b);
        a aVar = this.f20684d;
        this.f20685e = aVar;
        this.f20686f = aVar;
        this.f20687g = 0L;
        this.f20681a.d();
    }

    public void o() {
        this.f20685e = this.f20684d;
    }

    public int p(InterfaceC0749g interfaceC0749g, int i10, boolean z10) throws EOFException {
        int iH = h(i10);
        a aVar = this.f20686f;
        int i11 = interfaceC0749g.read(aVar.f20690c.f33573a, aVar.e(this.f20687g), iH);
        if (i11 != -1) {
            g(i11);
            return i11;
        }
        if (z10) {
            return -1;
        }
        throw new EOFException();
    }

    public void q(G1.C c10, int i10) {
        while (i10 > 0) {
            int iH = h(i10);
            a aVar = this.f20686f;
            c10.q(aVar.f20690c.f33573a, aVar.e(this.f20687g), iH);
            i10 -= iH;
            g(iH);
        }
    }
}
