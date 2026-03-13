package T9;

import java.util.concurrent.Executor;
import v6.AbstractC6055j;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f16262a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f16263b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Executor f16264c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final d f16265d;

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f16266a = 0;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public boolean f16267b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public Executor f16268c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public d f16269d;

        public b a() {
            return new b(this.f16266a, this.f16267b, this.f16268c, this.f16269d, null);
        }

        public a b(int i10, int... iArr) {
            this.f16266a = i10;
            if (iArr != null) {
                for (int i11 : iArr) {
                    this.f16266a = i11 | this.f16266a;
                }
            }
            return this;
        }

        public a c(d dVar) {
            this.f16269d = dVar;
            return this;
        }
    }

    public /* synthetic */ b(int i10, boolean z10, Executor executor, d dVar, e eVar) {
        this.f16262a = i10;
        this.f16263b = z10;
        this.f16264c = executor;
        this.f16265d = dVar;
    }

    public final int a() {
        return this.f16262a;
    }

    public final d b() {
        return this.f16265d;
    }

    public final Executor c() {
        return this.f16264c;
    }

    public final boolean d() {
        return this.f16263b;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return this.f16262a == bVar.f16262a && this.f16263b == bVar.f16263b && AbstractC6055j.a(this.f16264c, bVar.f16264c) && AbstractC6055j.a(this.f16265d, bVar.f16265d);
    }

    public int hashCode() {
        return AbstractC6055j.b(Integer.valueOf(this.f16262a), Boolean.valueOf(this.f16263b), this.f16264c, this.f16265d);
    }
}
