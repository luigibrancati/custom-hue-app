package com.google.android.gms.internal.measurement;

import java.io.IOException;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public abstract class X4 extends AbstractC3273o4 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final AbstractC3148a5 f29386a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public AbstractC3148a5 f29387b;

    public X4(AbstractC3148a5 abstractC3148a5) {
        this.f29386a = abstractC3148a5;
        if (abstractC3148a5.k()) {
            throw new IllegalArgumentException("Default instance must be immutable.");
        }
        this.f29387b = abstractC3148a5.m();
    }

    public static void r(Object obj, Object obj2) {
        K5.a().b(obj.getClass()).d(obj, obj2);
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC3273o4
    public final /* bridge */ /* synthetic */ AbstractC3273o4 o(byte[] bArr, int i10, int i11) throws C3229j5 {
        N4 n42 = N4.f29286b;
        K5 k52 = K5.f29253c;
        y(bArr, 0, i11, N4.f29287c);
        return this;
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC3273o4
    public final /* bridge */ /* synthetic */ AbstractC3273o4 p(byte[] bArr, int i10, int i11, N4 n42) throws C3229j5 {
        y(bArr, 0, i11, n42);
        return this;
    }

    public final void s() {
        if (this.f29387b.k()) {
            return;
        }
        t();
    }

    public void t() {
        AbstractC3148a5 abstractC3148a5M = this.f29386a.m();
        r(abstractC3148a5M, this.f29387b);
        this.f29387b = abstractC3148a5M;
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC3273o4
    /* JADX INFO: renamed from: u, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public final X4 n() {
        X4 x42 = (X4) this.f29386a.C(5, null, null);
        x42.f29387b = M0();
        return x42;
    }

    @Override // com.google.android.gms.internal.measurement.B5
    /* JADX INFO: renamed from: v, reason: merged with bridge method [inline-methods] */
    public AbstractC3148a5 M0() {
        if (!this.f29387b.k()) {
            return this.f29387b;
        }
        this.f29387b.o();
        return this.f29387b;
    }

    public final AbstractC3148a5 w() {
        AbstractC3148a5 abstractC3148a5M0 = M0();
        if (abstractC3148a5M0.h()) {
            return abstractC3148a5M0;
        }
        throw new X5(abstractC3148a5M0);
    }

    public final X4 x(AbstractC3148a5 abstractC3148a5) {
        if (!this.f29386a.equals(abstractC3148a5)) {
            if (!this.f29387b.k()) {
                t();
            }
            r(this.f29387b, abstractC3148a5);
        }
        return this;
    }

    public final X4 y(byte[] bArr, int i10, int i11, N4 n42) throws C3229j5 {
        if (!this.f29387b.k()) {
            t();
        }
        try {
            K5.a().b(this.f29387b.getClass()).f(this.f29387b, bArr, 0, i11, new C3317t4(n42));
            return this;
        } catch (C3229j5 e10) {
            throw e10;
        } catch (IOException e11) {
            throw new RuntimeException("Reading from byte array should not throw IOException.", e11);
        } catch (IndexOutOfBoundsException unused) {
            throw new C3229j5("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
        }
    }
}
