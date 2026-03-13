package K9;

import com.google.android.gms.maps.model.LatLng;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final double f7776a;

    public b(double d10) {
        this.f7776a = d10;
    }

    public LatLng a(I9.b bVar) {
        double d10 = bVar.f5671a;
        double d11 = this.f7776a;
        return new LatLng(90.0d - Math.toDegrees(Math.atan(Math.exp(((-(0.5d - (bVar.f5672b / d11))) * 2.0d) * 3.141592653589793d)) * 2.0d), ((d10 / d11) - 0.5d) * 360.0d);
    }

    public a b(LatLng latLng) {
        double d10 = (latLng.f30351b / 360.0d) + 0.5d;
        double dSin = Math.sin(Math.toRadians(latLng.f30350a));
        double dLog = ((Math.log((dSin + 1.0d) / (1.0d - dSin)) * 0.5d) / (-6.283185307179586d)) + 0.5d;
        double d11 = this.f7776a;
        return new a(d10 * d11, dLog * d11);
    }
}
