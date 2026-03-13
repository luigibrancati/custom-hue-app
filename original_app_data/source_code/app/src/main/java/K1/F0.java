package K1;

import G1.AbstractC0853a;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public final class F0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f6848a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final float f6849b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f6850c;

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public long f6851a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public float f6852b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public long f6853c;

        public F0 d() {
            return new F0(this);
        }

        public b e(long j10) {
            AbstractC0853a.a(j10 >= 0 || j10 == -9223372036854775807L);
            this.f6853c = j10;
            return this;
        }

        public b f(long j10) {
            this.f6851a = j10;
            return this;
        }

        public b g(float f10) {
            AbstractC0853a.a(f10 > 0.0f || f10 == -3.4028235E38f);
            this.f6852b = f10;
            return this;
        }

        public b() {
            this.f6851a = -9223372036854775807L;
            this.f6852b = -3.4028235E38f;
            this.f6853c = -9223372036854775807L;
        }

        public b(F0 f02) {
            this.f6851a = f02.f6848a;
            this.f6852b = f02.f6849b;
            this.f6853c = f02.f6850c;
        }
    }

    public b a() {
        return new b();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof F0)) {
            return false;
        }
        F0 f02 = (F0) obj;
        return this.f6848a == f02.f6848a && this.f6849b == f02.f6849b && this.f6850c == f02.f6850c;
    }

    public int hashCode() {
        return Objects.hash(Long.valueOf(this.f6848a), Float.valueOf(this.f6849b), Long.valueOf(this.f6850c));
    }

    public F0(b bVar) {
        this.f6848a = bVar.f6851a;
        this.f6849b = bVar.f6852b;
        this.f6850c = bVar.f6853c;
    }
}
