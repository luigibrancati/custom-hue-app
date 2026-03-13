package ta;

import android.content.ContentResolver;
import android.location.LocationManager;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public class l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ContentResolver f44866a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final LocationManager f44867b;

    public l(ContentResolver contentResolver, LocationManager locationManager) {
        this.f44866a = contentResolver;
        this.f44867b = locationManager;
    }

    public boolean a() {
        return this.f44867b.isLocationEnabled();
    }
}
