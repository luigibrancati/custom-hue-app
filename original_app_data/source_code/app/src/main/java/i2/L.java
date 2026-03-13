package i2;

import D1.o;
import G1.AbstractC0853a;
import com.google.android.libraries.barhopper.RecognitionOptions;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public final class L implements InterfaceC4336p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f36879a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f36880b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f36881c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f36882d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f36883e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public r f36884f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public O f36885g;

    public L(int i10, int i11, String str) {
        this.f36879a = i10;
        this.f36880b = i11;
        this.f36881c = str;
    }

    @Override // i2.InterfaceC4336p
    public void a(long j10, long j11) {
        if (j10 == 0 || this.f36883e == 1) {
            this.f36883e = 1;
            this.f36882d = 0;
        }
    }

    public final void b(String str) {
        O oF = this.f36884f.f(RecognitionOptions.UPC_E, 4);
        this.f36885g = oF;
        oF.e(new o.b().W(str).y0(str).P());
        this.f36884f.n();
        this.f36884f.v(new M(-9223372036854775807L));
        this.f36883e = 1;
    }

    @Override // i2.InterfaceC4336p
    public void c(r rVar) {
        this.f36884f = rVar;
        b(this.f36881c);
    }

    public final void d(InterfaceC4337q interfaceC4337q) {
        int iA = ((O) AbstractC0853a.e(this.f36885g)).a(interfaceC4337q, RecognitionOptions.UPC_E, true);
        if (iA != -1) {
            this.f36882d += iA;
            return;
        }
        this.f36883e = 2;
        this.f36885g.d(0L, 1, this.f36882d, 0, null);
        this.f36882d = 0;
    }

    @Override // i2.InterfaceC4336p
    public int i(InterfaceC4337q interfaceC4337q, I i10) {
        int i11 = this.f36883e;
        if (i11 == 1) {
            d(interfaceC4337q);
            return 0;
        }
        if (i11 == 2) {
            return -1;
        }
        throw new IllegalStateException();
    }

    @Override // i2.InterfaceC4336p
    public boolean j(InterfaceC4337q interfaceC4337q) {
        AbstractC0853a.g((this.f36879a == -1 || this.f36880b == -1) ? false : true);
        G1.C c10 = new G1.C(this.f36880b);
        interfaceC4337q.s(c10.f(), 0, this.f36880b);
        return c10.T() == this.f36879a;
    }

    @Override // i2.InterfaceC4336p
    public void release() {
    }
}
