package n0;

import kotlin.jvm.internal.AbstractC4854k;

/* JADX INFO: renamed from: n0.f, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public final class C5068f {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final a f40484e = new a(null);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final C5068f f40485f = new C5068f(0.0f, 0.0f, 0.0f, 0.0f);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final float f40486a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final float f40487b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final float f40488c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final float f40489d;

    /* JADX INFO: renamed from: n0.f$a */
    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class a {
        public /* synthetic */ a(AbstractC4854k abstractC4854k) {
            this();
        }

        public final C5068f a() {
            return C5068f.f40485f;
        }

        public a() {
        }
    }

    public C5068f(float f10, float f11, float f12, float f13) {
        this.f40486a = f10;
        this.f40487b = f11;
        this.f40488c = f12;
        this.f40489d = f13;
    }

    public final float b() {
        return this.f40489d;
    }

    public final float c() {
        return this.f40486a;
    }

    public final float d() {
        return this.f40488c;
    }

    public final float e() {
        return this.f40487b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C5068f)) {
            return false;
        }
        C5068f c5068f = (C5068f) obj;
        return Float.compare(this.f40486a, c5068f.f40486a) == 0 && Float.compare(this.f40487b, c5068f.f40487b) == 0 && Float.compare(this.f40488c, c5068f.f40488c) == 0 && Float.compare(this.f40489d, c5068f.f40489d) == 0;
    }

    public int hashCode() {
        return (((((Float.hashCode(this.f40486a) * 31) + Float.hashCode(this.f40487b)) * 31) + Float.hashCode(this.f40488c)) * 31) + Float.hashCode(this.f40489d);
    }

    public String toString() {
        return "Rect.fromLTRB(" + AbstractC5063a.a(this.f40486a, 1) + ", " + AbstractC5063a.a(this.f40487b, 1) + ", " + AbstractC5063a.a(this.f40488c, 1) + ", " + AbstractC5063a.a(this.f40489d, 1) + ')';
    }
}
