package T9;

import v6.AbstractC6055j;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final b f16270a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final float f16271b;

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final b f16272a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public float f16273b;

        public a(b bVar) {
            this.f16272a = bVar;
        }

        public d a() {
            return new d(this.f16272a, this.f16273b, null);
        }

        public a b(float f10) {
            this.f16273b = f10;
            return this;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public interface b {
        boolean a(float f10);
    }

    public /* synthetic */ d(b bVar, float f10, f fVar) {
        this.f16270a = bVar;
        this.f16271b = f10;
    }

    public final float a() {
        return this.f16271b;
    }

    public final b b() {
        return this.f16270a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        return AbstractC6055j.a(this.f16270a, dVar.f16270a) && this.f16271b == dVar.f16271b;
    }

    public int hashCode() {
        return AbstractC6055j.b(this.f16270a, Float.valueOf(this.f16271b));
    }
}
