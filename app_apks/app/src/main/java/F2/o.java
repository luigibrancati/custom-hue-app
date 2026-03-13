package F2;

import D1.w;
import F2.s;
import G1.AbstractC0853a;
import G1.C;
import G1.InterfaceC0864l;
import G1.M;
import com.google.android.libraries.barhopper.RecognitionOptions;
import i2.E;
import i2.I;
import i2.InterfaceC4336p;
import i2.InterfaceC4337q;
import i2.O;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public class o implements InterfaceC4336p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final s f3669a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final D1.o f3671c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final List f3672d;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public O f3675g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f3676h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f3677i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public long[] f3678j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public long f3679k;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final d f3670b = new d();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public byte[] f3674f = M.f4267f;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final C f3673e = new C();

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static class b implements Comparable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final long f3680a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final byte[] f3681b;

        @Override // java.lang.Comparable
        /* JADX INFO: renamed from: j, reason: merged with bridge method [inline-methods] */
        public int compareTo(b bVar) {
            return Long.compare(this.f3680a, bVar.f3680a);
        }

        public b(long j10, byte[] bArr) {
            this.f3680a = j10;
            this.f3681b = bArr;
        }
    }

    public o(s sVar, D1.o oVar) {
        this.f3669a = sVar;
        this.f3671c = oVar != null ? oVar.b().y0("application/x-media3-cues").U(oVar.f1805o).Y(sVar.b()).P() : null;
        this.f3672d = new ArrayList();
        this.f3677i = 0;
        this.f3678j = M.f4268g;
        this.f3679k = -9223372036854775807L;
    }

    public static /* synthetic */ void b(o oVar, e eVar) {
        oVar.getClass();
        b bVar = new b(eVar.f3660b, oVar.f3670b.a(eVar.f3659a, eVar.f3661c));
        oVar.f3672d.add(bVar);
        long j10 = oVar.f3679k;
        if (j10 == -9223372036854775807L || eVar.f3662d >= j10) {
            oVar.l(bVar);
        }
    }

    @Override // i2.InterfaceC4336p
    public void a(long j10, long j11) {
        int i10 = this.f3677i;
        AbstractC0853a.g((i10 == 0 || i10 == 5) ? false : true);
        this.f3679k = j11;
        if (this.f3677i == 2) {
            this.f3677i = 1;
        }
        if (this.f3677i == 4) {
            this.f3677i = 3;
        }
    }

    @Override // i2.InterfaceC4336p
    public void c(i2.r rVar) {
        AbstractC0853a.g(this.f3677i == 0);
        O oF = rVar.f(0, 3);
        this.f3675g = oF;
        D1.o oVar = this.f3671c;
        if (oVar != null) {
            oF.e(oVar);
            rVar.n();
            rVar.v(new E(new long[]{0}, new long[]{0}, -9223372036854775807L));
        }
        this.f3677i = 1;
    }

    public final void d() throws w {
        try {
            long j10 = this.f3679k;
            this.f3669a.c(this.f3674f, 0, this.f3676h, j10 != -9223372036854775807L ? s.b.c(j10) : s.b.b(), new InterfaceC0864l() { // from class: F2.n
                @Override // G1.InterfaceC0864l
                public final void accept(Object obj) {
                    o.b(this.f3668a, (e) obj);
                }
            });
            Collections.sort(this.f3672d);
            this.f3678j = new long[this.f3672d.size()];
            for (int i10 = 0; i10 < this.f3672d.size(); i10++) {
                this.f3678j[i10] = ((b) this.f3672d.get(i10)).f3680a;
            }
            this.f3674f = M.f4267f;
        } catch (RuntimeException e10) {
            throw w.a("SubtitleParser failed.", e10);
        }
    }

    public final boolean e(InterfaceC4337q interfaceC4337q) {
        byte[] bArr = this.f3674f;
        if (bArr.length == this.f3676h) {
            this.f3674f = Arrays.copyOf(bArr, bArr.length + RecognitionOptions.UPC_E);
        }
        byte[] bArr2 = this.f3674f;
        int i10 = this.f3676h;
        int i11 = interfaceC4337q.read(bArr2, i10, bArr2.length - i10);
        if (i11 != -1) {
            this.f3676h += i11;
        }
        long length = interfaceC4337q.getLength();
        return (length != -1 && ((long) this.f3676h) == length) || i11 == -1;
    }

    public final boolean g(InterfaceC4337q interfaceC4337q) {
        return interfaceC4337q.a((interfaceC4337q.getLength() > (-1L) ? 1 : (interfaceC4337q.getLength() == (-1L) ? 0 : -1)) != 0 ? N7.g.e(interfaceC4337q.getLength()) : RecognitionOptions.UPC_E) == -1;
    }

    public final void h() {
        long j10 = this.f3679k;
        for (int iH = j10 == -9223372036854775807L ? 0 : M.h(this.f3678j, j10, true, true); iH < this.f3672d.size(); iH++) {
            l((b) this.f3672d.get(iH));
        }
    }

    @Override // i2.InterfaceC4336p
    public int i(InterfaceC4337q interfaceC4337q, I i10) throws w {
        int i11 = this.f3677i;
        AbstractC0853a.g((i11 == 0 || i11 == 5) ? false : true);
        if (this.f3677i == 1) {
            int iE = interfaceC4337q.getLength() != -1 ? N7.g.e(interfaceC4337q.getLength()) : RecognitionOptions.UPC_E;
            if (iE > this.f3674f.length) {
                this.f3674f = new byte[iE];
            }
            this.f3676h = 0;
            this.f3677i = 2;
        }
        if (this.f3677i == 2 && e(interfaceC4337q)) {
            d();
            this.f3677i = 4;
        }
        if (this.f3677i == 3 && g(interfaceC4337q)) {
            h();
            this.f3677i = 4;
        }
        return this.f3677i == 4 ? -1 : 0;
    }

    @Override // i2.InterfaceC4336p
    public boolean j(InterfaceC4337q interfaceC4337q) {
        return true;
    }

    public final void l(b bVar) {
        AbstractC0853a.i(this.f3675g);
        int length = bVar.f3681b.length;
        this.f3673e.X(bVar.f3681b);
        this.f3675g.b(this.f3673e, length);
        this.f3675g.d(bVar.f3680a, 1, length, 0, null);
    }

    @Override // i2.InterfaceC4336p
    public void release() {
        if (this.f3677i == 5) {
            return;
        }
        this.f3669a.reset();
        this.f3677i = 5;
    }
}
