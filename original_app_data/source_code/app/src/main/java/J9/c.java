package J9;

import L9.a;
import com.google.android.gms.maps.model.LatLng;
import kotlin.jvm.internal.AbstractC4854k;
import kotlin.jvm.internal.AbstractC4862t;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public final class c implements a.b {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final a f6364d = new a(null);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final K9.b f6365e = new K9.b(1.0d);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final LatLng f6366a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final I9.b f6367b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final double f6368c;

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class a {
        public /* synthetic */ a(AbstractC4854k abstractC4854k) {
            this();
        }

        public a() {
        }
    }

    public c(LatLng latLng, I9.b point, double d10) {
        AbstractC4862t.e(latLng, "latLng");
        AbstractC4862t.e(point, "point");
        this.f6366a = latLng;
        this.f6367b = point;
        this.f6368c = d10;
    }

    @Override // L9.a.b
    public I9.b a() {
        return this.f6367b;
    }

    public final double b() {
        return this.f6368c;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return AbstractC4862t.a(this.f6366a, cVar.f6366a) && AbstractC4862t.a(this.f6367b, cVar.f6367b) && Double.compare(this.f6368c, cVar.f6368c) == 0;
    }

    public int hashCode() {
        return (((this.f6366a.hashCode() * 31) + this.f6367b.hashCode()) * 31) + Double.hashCode(this.f6368c);
    }

    public String toString() {
        return "WeightedLatLng(latLng=" + this.f6366a + ", point=" + this.f6367b + ", intensity=" + this.f6368c + ")";
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public c(LatLng latLng, double d10) {
        AbstractC4862t.e(latLng, "latLng");
        K9.a aVarB = f6365e.b(latLng);
        AbstractC4862t.d(aVarB, "toPoint(...)");
        this(latLng, aVarB, d10 < 0.0d ? 1.0d : d10);
    }
}
