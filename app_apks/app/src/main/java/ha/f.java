package ha;

import R6.AbstractC2076k;
import R6.C2077l;
import R6.C2078m;
import R6.InterfaceC2068c;
import R6.q;
import android.app.Activity;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.content.IntentSender;
import android.location.Location;
import android.location.LocationManager;
import android.location.OnNmeaMessageListener;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import android.util.SparseArray;
import b7.InterfaceC2873g;
import b7.InterfaceC2874h;
import com.google.android.gms.location.LocationRequest;
import com.google.android.gms.location.LocationResult;
import com.google.android.gms.location.LocationServices;
import io.flutter.plugin.common.EventChannel;
import io.flutter.plugin.common.MethodChannel;
import io.flutter.plugin.common.PluginRegistry;
import java.util.HashMap;
import t6.C5844b;
import t6.C5849g;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public class f implements PluginRegistry.RequestPermissionsResultListener, PluginRegistry.ActivityResultListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Activity f36389a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public InterfaceC2068c f36390b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public q f36391c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public LocationRequest f36392d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public C2077l f36393e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public AbstractC2076k f36394f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public OnNmeaMessageListener f36395g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public Double f36396h;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public EventChannel.EventSink f36401m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public MethodChannel.Result f36402n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public MethodChannel.Result f36403o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public MethodChannel.Result f36404p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final LocationManager f36405q;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public long f36397i = 5000;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public long f36398j = 5000 / 2;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public Integer f36399k = 100;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public float f36400l = 0.0f;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public SparseArray f36406r = new a();

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public class a extends SparseArray {
        public a() {
            put(0, 105);
            put(1, 104);
            put(2, 102);
            put(3, 100);
            put(4, 100);
            put(5, 104);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public class b extends AbstractC2076k {
        public b() {
        }

        @Override // R6.AbstractC2076k
        public void b(LocationResult locationResult) {
            super.b(locationResult);
            Location locationD = locationResult.d();
            HashMap map = new HashMap();
            map.put("latitude", Double.valueOf(locationD.getLatitude()));
            map.put("longitude", Double.valueOf(locationD.getLongitude()));
            map.put("accuracy", Double.valueOf(locationD.getAccuracy()));
            map.put("verticalAccuracy", Double.valueOf(locationD.getVerticalAccuracyMeters()));
            map.put("headingAccuracy", Double.valueOf(locationD.getBearingAccuracyDegrees()));
            map.put("elapsedRealtimeUncertaintyNanos", Double.valueOf(locationD.getElapsedRealtimeUncertaintyNanos()));
            map.put("provider", locationD.getProvider());
            if (locationD.getExtras() != null) {
                map.put("satelliteNumber", Integer.valueOf(locationD.getExtras().getInt("satellites")));
            }
            map.put("elapsedRealtimeNanos", Double.valueOf(locationD.getElapsedRealtimeNanos()));
            if (locationD.isFromMockProvider()) {
                map.put("isMock", Double.valueOf(1.0d));
            }
            if (f.this.f36396h != null) {
                map.put("altitude", f.this.f36396h);
            } else {
                map.put("altitude", Double.valueOf(locationD.getAltitude()));
            }
            map.put("speed", Double.valueOf(locationD.getSpeed()));
            map.put("speed_accuracy", Double.valueOf(locationD.getSpeedAccuracyMetersPerSecond()));
            map.put("heading", Double.valueOf(locationD.getBearing()));
            map.put("time", Double.valueOf(locationD.getTime()));
            MethodChannel.Result result = f.this.f36404p;
            if (result != null) {
                result.success(map);
                f.this.f36404p = null;
            }
            f fVar = f.this;
            EventChannel.EventSink eventSink = fVar.f36401m;
            if (eventSink != null) {
                eventSink.success(map);
                return;
            }
            InterfaceC2068c interfaceC2068c = fVar.f36390b;
            if (interfaceC2068c != null) {
                interfaceC2068c.d(fVar.f36394f);
            }
        }
    }

    public f(Context context, Activity activity) {
        this.f36389a = activity;
        this.f36405q = (LocationManager) context.getSystemService("location");
    }

    public static /* synthetic */ void a(f fVar, C2078m c2078m) {
        fVar.f36405q.addNmeaListener(fVar.f36395g, (Handler) null);
        InterfaceC2068c interfaceC2068c = fVar.f36390b;
        if (interfaceC2068c != null) {
            interfaceC2068c.f(fVar.f36392d, fVar.f36394f, Looper.myLooper());
        }
    }

    public static /* synthetic */ void b(f fVar, Exception exc) {
        fVar.getClass();
        if (!(exc instanceof C5849g)) {
            if (((C5844b) exc).b() != 8502) {
                fVar.o("UNEXPECTED_ERROR", exc.getMessage(), null);
                return;
            } else {
                fVar.f36405q.addNmeaListener(fVar.f36395g, (Handler) null);
                fVar.f36390b.f(fVar.f36392d, fVar.f36394f, Looper.myLooper());
                return;
            }
        }
        C5849g c5849g = (C5849g) exc;
        if (c5849g.b() == 6) {
            try {
                c5849g.c(fVar.f36389a, 1);
            } catch (IntentSender.SendIntentException unused) {
                Log.i("FlutterLocation", "PendingIntent unable to execute request.");
            }
        }
    }

    public static /* synthetic */ void c(f fVar, String str, long j10) {
        fVar.getClass();
        if (str.startsWith("$")) {
            String[] strArrSplit = str.split(",");
            if (!strArrSplit[0].startsWith("$GPGGA") || strArrSplit.length <= 9 || strArrSplit[9].isEmpty()) {
                return;
            }
            fVar.f36396h = Double.valueOf(Double.parseDouble(strArrSplit[9]));
        }
    }

    public static /* synthetic */ void d(f fVar, MethodChannel.Result result, Exception exc) {
        fVar.getClass();
        if (!(exc instanceof C5849g)) {
            result.error("SERVICE_STATUS_ERROR", "Unexpected error type received", null);
            return;
        }
        C5849g c5849g = (C5849g) exc;
        int iB = c5849g.b();
        if (iB != 6) {
            if (iB != 8502) {
                return;
            }
            result.error("SERVICE_STATUS_DISABLED", "Failed to get location. Location services disabled", null);
        } else {
            try {
                c5849g.c(fVar.f36389a, 4097);
            } catch (IntentSender.SendIntentException unused) {
                result.error("SERVICE_STATUS_ERROR", "Could not resolve location request", null);
            }
        }
    }

    public final void f() {
        C2077l.a aVar = new C2077l.a();
        aVar.a(this.f36392d);
        this.f36393e = aVar.b();
    }

    public void g(Integer num, Long l10, Long l11, Float f10) {
        this.f36399k = num;
        this.f36397i = l10.longValue();
        this.f36398j = l11.longValue();
        this.f36400l = f10.floatValue();
        j();
        k();
        f();
        r();
    }

    public boolean h() {
        Activity activity = this.f36389a;
        if (activity != null) {
            return L0.a.a(activity, "android.permission.ACCESS_FINE_LOCATION") == 0;
        }
        this.f36402n.error("MISSING_ACTIVITY", "You should not checkPermissions activation outside of an activity.", null);
        throw new ActivityNotFoundException();
    }

    public boolean i() {
        return this.f36405q.isLocationEnabled();
    }

    public final void j() {
        AbstractC2076k abstractC2076k = this.f36394f;
        if (abstractC2076k != null) {
            this.f36390b.d(abstractC2076k);
            this.f36394f = null;
        }
        this.f36394f = new b();
        this.f36395g = new OnNmeaMessageListener() { // from class: ha.d
            @Override // android.location.OnNmeaMessageListener
            public final void onNmeaMessage(String str, long j10) {
                f.c(this.f36386a, str, j10);
            }
        };
    }

    public final void k() {
        LocationRequest locationRequestD = LocationRequest.d();
        this.f36392d = locationRequestD;
        locationRequestD.A(this.f36397i);
        this.f36392d.z(this.f36398j);
        this.f36392d.B(this.f36399k.intValue());
        this.f36392d.E(this.f36400l);
    }

    public boolean l(int i10, String[] strArr, int[] iArr) {
        if (i10 != 34 || strArr.length != 1 || !strArr[0].equals("android.permission.ACCESS_FINE_LOCATION")) {
            return false;
        }
        if (iArr[0] == 0) {
            if (this.f36404p != null || this.f36401m != null) {
                r();
            }
            MethodChannel.Result result = this.f36402n;
            if (result != null) {
                result.success(1);
                this.f36402n = null;
            }
        } else if (q()) {
            o("PERMISSION_DENIED", "Location permission denied", null);
            MethodChannel.Result result2 = this.f36402n;
            if (result2 != null) {
                result2.success(0);
                this.f36402n = null;
            }
        } else {
            o("PERMISSION_DENIED_NEVER_ASK", "Location permission denied forever - please open app settings", null);
            MethodChannel.Result result3 = this.f36402n;
            if (result3 != null) {
                result3.success(2);
                this.f36402n = null;
            }
        }
        return true;
    }

    public void m() {
        if (this.f36389a == null) {
            this.f36402n.error("MISSING_ACTIVITY", "You should not requestPermissions activation outside of an activity.", null);
            throw new ActivityNotFoundException();
        }
        if (h()) {
            this.f36402n.success(1);
        } else {
            androidx.core.app.a.v(this.f36389a, new String[]{"android.permission.ACCESS_FINE_LOCATION"}, 34);
        }
    }

    public void n(final MethodChannel.Result result) {
        if (this.f36389a == null) {
            result.error("MISSING_ACTIVITY", "You should not requestService activation outside of an activity.", null);
            throw new ActivityNotFoundException();
        }
        try {
            if (i()) {
                result.success(1);
            } else {
                this.f36403o = result;
                this.f36391c.h(this.f36393e).d(this.f36389a, new InterfaceC2873g() { // from class: ha.e
                    @Override // b7.InterfaceC2873g
                    public final void c(Exception exc) {
                        f.d(this.f36387a, result, exc);
                    }
                });
            }
        } catch (Exception unused) {
            result.error("SERVICE_STATUS_ERROR", "Location service status couldn't be determined", null);
        }
    }

    public final void o(String str, String str2, Object obj) {
        MethodChannel.Result result = this.f36404p;
        if (result != null) {
            result.error(str, str2, obj);
            this.f36404p = null;
        }
        EventChannel.EventSink eventSink = this.f36401m;
        if (eventSink != null) {
            eventSink.error(str, str2, obj);
            this.f36401m = null;
        }
    }

    @Override // io.flutter.plugin.common.PluginRegistry.ActivityResultListener
    public boolean onActivityResult(int i10, int i11, Intent intent) {
        MethodChannel.Result result;
        if (i10 != 1) {
            if (i10 != 4097 || (result = this.f36403o) == null) {
                return false;
            }
            if (i11 == -1) {
                result.success(1);
            } else {
                result.success(0);
            }
            this.f36403o = null;
            return true;
        }
        MethodChannel.Result result2 = this.f36402n;
        if (result2 == null) {
            return false;
        }
        if (i11 == -1) {
            r();
            return true;
        }
        result2.error("SERVICE_STATUS_DISABLED", "Failed to get location. Location services disabled", null);
        this.f36402n = null;
        return true;
    }

    @Override // io.flutter.plugin.common.PluginRegistry.RequestPermissionsResultListener
    public boolean onRequestPermissionsResult(int i10, String[] strArr, int[] iArr) {
        return l(i10, strArr, iArr);
    }

    public void p(Activity activity) {
        this.f36389a = activity;
        if (activity != null) {
            this.f36390b = LocationServices.a(activity);
            this.f36391c = LocationServices.e(activity);
            j();
            k();
            f();
            return;
        }
        InterfaceC2068c interfaceC2068c = this.f36390b;
        if (interfaceC2068c != null) {
            interfaceC2068c.d(this.f36394f);
        }
        this.f36390b = null;
        this.f36391c = null;
        LocationManager locationManager = this.f36405q;
        if (locationManager != null) {
            locationManager.removeNmeaListener(this.f36395g);
            this.f36395g = null;
        }
    }

    public boolean q() {
        Activity activity = this.f36389a;
        if (activity == null) {
            return false;
        }
        return androidx.core.app.a.y(activity, "android.permission.ACCESS_FINE_LOCATION");
    }

    public void r() {
        if (this.f36389a != null) {
            this.f36391c.h(this.f36393e).g(this.f36389a, new InterfaceC2874h() { // from class: ha.b
                @Override // b7.InterfaceC2874h
                public final void onSuccess(Object obj) {
                    f.a(this.f36384a, (C2078m) obj);
                }
            }).d(this.f36389a, new InterfaceC2873g() { // from class: ha.c
                @Override // b7.InterfaceC2873g
                public final void c(Exception exc) {
                    f.b(this.f36385a, exc);
                }
            });
        } else {
            this.f36402n.error("MISSING_ACTIVITY", "You should not requestLocation activation outside of an activity.", null);
            throw new ActivityNotFoundException();
        }
    }
}
