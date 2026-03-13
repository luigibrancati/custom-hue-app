package X6;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import v6.AbstractC6056k;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public final class N6 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public com.google.android.gms.internal.measurement.Z2 f18450a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public List f18451b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public List f18452c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public long f18453d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ R6 f18454e;

    public /* synthetic */ N6(R6 r62, byte[] bArr) {
        Objects.requireNonNull(r62);
        this.f18454e = r62;
    }

    public static final long b(com.google.android.gms.internal.measurement.N2 n22) {
        return ((n22.I() / 1000) / 60) / 60;
    }

    public final boolean a(long j10, com.google.android.gms.internal.measurement.N2 n22) {
        AbstractC6056k.l(n22);
        if (this.f18452c == null) {
            this.f18452c = new ArrayList();
        }
        if (this.f18451b == null) {
            this.f18451b = new ArrayList();
        }
        if (!this.f18452c.isEmpty() && b((com.google.android.gms.internal.measurement.N2) this.f18452c.get(0)) != b(n22)) {
            return false;
        }
        long jA = this.f18453d + ((long) n22.a());
        R6 r62 = this.f18454e;
        if (!r62.B0().H(null, AbstractC2383f2.f18883e1)) {
            r62.B0();
            if (jA >= C2436m.o()) {
                return false;
            }
        } else if (!this.f18452c.isEmpty()) {
            r62.B0();
            if (jA >= C2436m.o()) {
                return false;
            }
        }
        this.f18453d = jA;
        this.f18452c.add(n22);
        this.f18451b.add(Long.valueOf(j10));
        int size = this.f18452c.size();
        r62.B0();
        return size < Math.max(1, ((Integer) AbstractC2383f2.f18899k.b(null)).intValue());
    }
}
