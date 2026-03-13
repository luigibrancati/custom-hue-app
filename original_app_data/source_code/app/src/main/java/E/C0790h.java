package E;

import E.z0;
import android.graphics.Rect;
import android.util.Size;

/* JADX INFO: renamed from: E.h, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public final class C0790h extends z0.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Size f2984a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Rect f2985b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f2986c;

    /* JADX INFO: renamed from: E.h$b */
    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class b extends z0.a.AbstractC0044a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public Size f2987a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public Rect f2988b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public Integer f2989c;

        @Override // E.z0.a.AbstractC0044a
        public z0.a a() {
            String str = "";
            if (this.f2987a == null) {
                str = " resolution";
            }
            if (this.f2988b == null) {
                str = str + " cropRect";
            }
            if (this.f2989c == null) {
                str = str + " rotationDegrees";
            }
            if (str.isEmpty()) {
                return new C0790h(this.f2987a, this.f2988b, this.f2989c.intValue());
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        @Override // E.z0.a.AbstractC0044a
        public z0.a.AbstractC0044a b(Rect rect) {
            if (rect == null) {
                throw new NullPointerException("Null cropRect");
            }
            this.f2988b = rect;
            return this;
        }

        @Override // E.z0.a.AbstractC0044a
        public z0.a.AbstractC0044a c(int i10) {
            this.f2989c = Integer.valueOf(i10);
            return this;
        }

        public z0.a.AbstractC0044a d(Size size) {
            if (size == null) {
                throw new NullPointerException("Null resolution");
            }
            this.f2987a = size;
            return this;
        }
    }

    @Override // E.z0.a
    public Rect a() {
        return this.f2985b;
    }

    @Override // E.z0.a
    public Size b() {
        return this.f2984a;
    }

    @Override // E.z0.a
    public int c() {
        return this.f2986c;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof z0.a) {
            z0.a aVar = (z0.a) obj;
            if (this.f2984a.equals(aVar.b()) && this.f2985b.equals(aVar.a()) && this.f2986c == aVar.c()) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return this.f2986c ^ ((((this.f2984a.hashCode() ^ 1000003) * 1000003) ^ this.f2985b.hashCode()) * 1000003);
    }

    public String toString() {
        return "ResolutionInfoInternal{resolution=" + this.f2984a + ", cropRect=" + this.f2985b + ", rotationDegrees=" + this.f2986c + "}";
    }

    public C0790h(Size size, Rect rect, int i10) {
        this.f2984a = size;
        this.f2985b = rect;
        this.f2986c = i10;
    }
}
