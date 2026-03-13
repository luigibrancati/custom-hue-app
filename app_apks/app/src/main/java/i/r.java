package i;

import android.content.Context;
import android.location.Location;
import android.location.LocationManager;
import android.util.Log;
import java.util.Calendar;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public class r {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static r f36760d;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f36761a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final LocationManager f36762b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final a f36763c = new a();

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public boolean f36764a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public long f36765b;
    }

    public r(Context context, LocationManager locationManager) {
        this.f36761a = context;
        this.f36762b = locationManager;
    }

    public static r a(Context context) {
        if (f36760d == null) {
            Context applicationContext = context.getApplicationContext();
            f36760d = new r(applicationContext, (LocationManager) applicationContext.getSystemService("location"));
        }
        return f36760d;
    }

    public final Location b() {
        Location locationC = L0.f.b(this.f36761a, "android.permission.ACCESS_COARSE_LOCATION") == 0 ? c("network") : null;
        Location locationC2 = L0.f.b(this.f36761a, "android.permission.ACCESS_FINE_LOCATION") == 0 ? c("gps") : null;
        return (locationC2 == null || locationC == null) ? locationC2 != null ? locationC2 : locationC : locationC2.getTime() > locationC.getTime() ? locationC2 : locationC;
    }

    public final Location c(String str) {
        try {
            if (this.f36762b.isProviderEnabled(str)) {
                return this.f36762b.getLastKnownLocation(str);
            }
            return null;
        } catch (Exception e10) {
            Log.d("TwilightManager", "Failed to get last known location", e10);
            return null;
        }
    }

    public boolean d() {
        a aVar = this.f36763c;
        if (e()) {
            return aVar.f36764a;
        }
        Location locationB = b();
        if (locationB != null) {
            f(locationB);
            return aVar.f36764a;
        }
        Log.i("TwilightManager", "Could not get last known location. This is probably because the app does not have any location permissions. Falling back to hardcoded sunrise/sunset values.");
        int i10 = Calendar.getInstance().get(11);
        return i10 < 6 || i10 >= 22;
    }

    public final boolean e() {
        return this.f36763c.f36765b > System.currentTimeMillis();
    }

    public final void f(Location location) {
        long j10;
        a aVar = this.f36763c;
        long jCurrentTimeMillis = System.currentTimeMillis();
        q qVarB = q.b();
        qVarB.a(jCurrentTimeMillis - 86400000, location.getLatitude(), location.getLongitude());
        qVarB.a(jCurrentTimeMillis, location.getLatitude(), location.getLongitude());
        boolean z10 = qVarB.f36759c == 1;
        long j11 = qVarB.f36758b;
        long j12 = qVarB.f36757a;
        qVarB.a(jCurrentTimeMillis + 86400000, location.getLatitude(), location.getLongitude());
        long j13 = qVarB.f36758b;
        if (j11 == -1 || j12 == -1) {
            j10 = jCurrentTimeMillis + 43200000;
        } else {
            if (jCurrentTimeMillis > j12) {
                j11 = j13;
            } else if (jCurrentTimeMillis > j11) {
                j11 = j12;
            }
            j10 = j11 + 60000;
        }
        aVar.f36764a = z10;
        aVar.f36765b = j10;
    }
}
