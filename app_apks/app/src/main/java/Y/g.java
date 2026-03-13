package Y;

import L.L0;
import L.M0;
import L.R0;
import L.s1;
import L.t1;
import P.q;
import java.util.UUID;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public class g implements s1.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final M0 f19545a;

    public g() {
        this(M0.g0());
    }

    @Override // E.K
    public L0 a() {
        return this.f19545a;
    }

    @Override // L.s1.b
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public h b() {
        return new h(R0.f0(this.f19545a));
    }

    public g d(t1.b bVar) {
        a().H(s1.f8181G, bVar);
        return this;
    }

    public g e(Class cls) {
        a().H(q.f12542N, cls);
        if (a().c(q.f12541M, null) == null) {
            f(cls.getCanonicalName() + "-" + UUID.randomUUID());
        }
        return this;
    }

    public g f(String str) {
        a().H(q.f12541M, str);
        return this;
    }

    public g(M0 m02) {
        this.f19545a = m02;
        Class cls = (Class) m02.c(q.f12542N, null);
        if (cls == null || cls.equals(f.class)) {
            d(t1.b.STREAM_SHARING);
            e(f.class);
            return;
        }
        throw new IllegalArgumentException("Invalid target class configuration for " + this + ": " + cls);
    }
}
