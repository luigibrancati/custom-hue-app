package S2;

import kotlin.jvm.internal.AbstractC4854k;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public final class b {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final a f15260f = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f15261a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final float f15262b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final float f15263c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final float f15264d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final long f15265e;

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class a {
        public /* synthetic */ a(AbstractC4854k abstractC4854k) {
            this();
        }

        public a() {
        }
    }

    public b() {
        this(0, 0.0f, 0.0f, 0.0f, 0L, 31, null);
    }

    public final long a() {
        return this.f15265e;
    }

    public final float b() {
        return this.f15262b;
    }

    public final int c() {
        return this.f15261a;
    }

    public final float d() {
        return this.f15263c;
    }

    public final float e() {
        return this.f15264d;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && b.class == obj.getClass()) {
            b bVar = (b) obj;
            return this.f15263c == bVar.f15263c && this.f15264d == bVar.f15264d && this.f15262b == bVar.f15262b && this.f15261a == bVar.f15261a && this.f15265e == bVar.f15265e;
        }
        return false;
    }

    public int hashCode() {
        return (((((((Float.hashCode(this.f15263c) * 31) + Float.hashCode(this.f15264d)) * 31) + Float.hashCode(this.f15262b)) * 31) + Integer.hashCode(this.f15261a)) * 31) + Long.hashCode(this.f15265e);
    }

    public String toString() {
        return "NavigationEvent(touchX=" + this.f15263c + ", touchY=" + this.f15264d + ", progress=" + this.f15262b + ", swipeEdge=" + this.f15261a + ", frameTimeMillis=" + this.f15265e + ')';
    }

    public b(int i10, float f10, float f11, float f12, long j10) {
        this.f15261a = i10;
        this.f15262b = f10;
        this.f15263c = f11;
        this.f15264d = f12;
        this.f15265e = j10;
    }

    public /* synthetic */ b(int i10, float f10, float f11, float f12, long j10, int i11, AbstractC4854k abstractC4854k) {
        this((i11 & 1) != 0 ? 2 : i10, (i11 & 2) != 0 ? 0.0f : f10, (i11 & 4) != 0 ? 0.0f : f11, (i11 & 8) != 0 ? 0.0f : f12, (i11 & 16) != 0 ? 0L : j10);
    }
}
