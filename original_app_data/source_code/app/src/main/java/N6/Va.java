package N6;

import java.io.UnsupportedEncodingException;
import v6.AbstractC6056k;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public final class Va implements Ha {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C1262b8 f10108a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public C1290da f10109b = new C1290da();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f10110c;

    public Va(C1262b8 c1262b8, int i10) {
        this.f10108a = c1262b8;
        C1317fb.a();
        this.f10110c = i10;
    }

    public static Ha e(C1262b8 c1262b8) {
        return new Va(c1262b8, 0);
    }

    public static Ha f(C1262b8 c1262b8, int i10) {
        return new Va(c1262b8, 1);
    }

    @Override // N6.Ha
    public final byte[] a(int i10, boolean z10) {
        this.f10109b.f(Boolean.valueOf(1 == (i10 ^ 1)));
        this.f10109b.e(Boolean.FALSE);
        this.f10108a.j(this.f10109b.m());
        try {
            C1317fb.a();
            if (i10 == 0) {
                return new J8.d().j(S6.f10047a).k(true).i().b(this.f10108a.k()).getBytes("utf-8");
            }
            C1288d8 c1288d8K = this.f10108a.k();
            U1 u12 = new U1();
            S6.f10047a.a(u12);
            return u12.b().a(c1288d8K);
        } catch (UnsupportedEncodingException e10) {
            throw new UnsupportedOperationException("Failed to covert logging to UTF-8 byte array", e10);
        }
    }

    @Override // N6.Ha
    public final Ha b(EnumC1249a8 enumC1249a8) {
        this.f10108a.f(enumC1249a8);
        return this;
    }

    @Override // N6.Ha
    public final String c() {
        C1316fa c1316faG = this.f10108a.k().g();
        return (c1316faG == null || A.c(c1316faG.k())) ? "NA" : (String) AbstractC6056k.l(c1316faG.k());
    }

    @Override // N6.Ha
    public final Ha d(C1290da c1290da) {
        this.f10109b = c1290da;
        return this;
    }

    @Override // N6.Ha
    public final int zza() {
        return this.f10110c;
    }
}
