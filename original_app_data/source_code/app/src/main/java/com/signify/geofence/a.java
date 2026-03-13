package com.signify.geofence;

import R6.C2074i;
import R6.InterfaceC2068c;
import R6.InterfaceC2069d;
import R6.InterfaceC2072g;
import android.app.Activity;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.location.Location;
import b7.InterfaceC2873g;
import b7.InterfaceC2874h;
import com.google.android.gms.location.LocationServices;
import com.google.android.gms.tasks.Task;
import com.signify.geofence.c;
import fc.C4015H;
import gc.C4205s;
import io.flutter.plugin.common.MethodChannel;
import java.util.Iterator;
import kotlin.jvm.internal.AbstractC4854k;
import kotlin.jvm.internal.AbstractC4862t;
import vc.l;
import za.k;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public final class a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final C0387a f32459b = new C0387a(null);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final String f32460c = "callback_handle";

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final int f32461d = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f32462a;

    /* JADX INFO: renamed from: com.signify.geofence.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class C0387a {
        public /* synthetic */ C0387a(AbstractC4854k abstractC4854k) {
            this();
        }

        public final String a() {
            return a.f32460c;
        }

        public C0387a() {
        }
    }

    public a(Context context) {
        AbstractC4862t.e(context, "context");
        this.f32462a = context;
    }

    public static final C4015H n(a aVar, long j10, k kVar, MethodChannel.Result result, Void r82) {
        Context context = aVar.f32462a;
        c.Companion aVar2 = c.INSTANCE;
        context.getSharedPreferences(aVar2.d(), 0).edit().putLong(aVar2.c(), j10).apply();
        new b(aVar.f32462a).e(kVar);
        if (result != null) {
            result.success(0);
        }
        return C4015H.f34254a;
    }

    public static final void o(l lVar, Object obj) {
        lVar.invoke(obj);
    }

    public static final void p(MethodChannel.Result result, Exception it) {
        AbstractC4862t.e(it, "it");
        if (result != null) {
            result.error("", it.getMessage(), null);
        }
    }

    public static final C4015H s(MethodChannel.Result result, Void r12) {
        result.success(0);
        return C4015H.f34254a;
    }

    public static final void t(l lVar, Object obj) {
        lVar.invoke(obj);
    }

    public static final void u(MethodChannel.Result result, Exception it) {
        AbstractC4862t.e(it, "it");
        result.error("", it.getMessage(), null);
    }

    public static final C4015H x(MethodChannel.Result result, k kVar, Location location) {
        if (location == null) {
            result.error("LOCATION_UNAVAILABLE", "Could not retrieve last known location", null);
            return C4015H.f34254a;
        }
        float[] fArr = new float[1];
        Location.distanceBetween(location.getLatitude(), location.getLongitude(), kVar.a(), kVar.b(), fArr);
        result.success(Boolean.valueOf(((double) fArr[0]) <= kVar.c()));
        return C4015H.f34254a;
    }

    public static final void y(l lVar, Object obj) {
        lVar.invoke(obj);
    }

    public static final void z(MethodChannel.Result result, Exception it) {
        AbstractC4862t.e(it, "it");
        result.error("LOCATION_ERROR", it.getMessage(), null);
    }

    public final InterfaceC2069d k(k kVar) {
        InterfaceC2069d interfaceC2069dA = new InterfaceC2069d.a().d(kVar.d()).b(kVar.a(), kVar.b(), (float) kVar.c()).c(-1L).e(3).a();
        AbstractC4862t.d(interfaceC2069dA, "build(...)");
        return interfaceC2069dA;
    }

    public final void l(final long j10, String regionId, double d10, double d11, double d12, final MethodChannel.Result result) {
        AbstractC4862t.e(regionId, "regionId");
        final k kVar = new k(regionId, d10, d11, d12);
        if (this.f32462a.checkSelfPermission("android.permission.ACCESS_FINE_LOCATION") == -1) {
            if (result != null) {
                result.error("'createGeofence' requires the ACCESS_FINE_LOCATION permission.", null, null);
                return;
            }
            return;
        }
        InterfaceC2072g interfaceC2072gV = v(this.f32462a);
        InterfaceC2069d interfaceC2069dK = k(kVar);
        C2074i.a aVar = new C2074i.a();
        aVar.c(f32461d);
        aVar.a(interfaceC2069dK);
        C2074i c2074iB = aVar.b();
        AbstractC4862t.d(c2074iB, "build(...)");
        Task taskG = interfaceC2072gV.g(c2074iB, q(j10, this.f32462a));
        final l lVar = new l() { // from class: za.d
            @Override // vc.l
            public final Object invoke(Object obj) {
                return com.signify.geofence.a.n(this.f48844a, j10, kVar, result, (Void) obj);
            }
        };
        taskG.h(new InterfaceC2874h() { // from class: za.e
            @Override // b7.InterfaceC2874h
            public final void onSuccess(Object obj) {
                com.signify.geofence.a.o(lVar, obj);
            }
        });
        taskG.e(new InterfaceC2873g() { // from class: za.f
            @Override // b7.InterfaceC2873g
            public final void c(Exception exc) {
                com.signify.geofence.a.p(result, exc);
            }
        });
    }

    public final PendingIntent q(long j10, Context context) {
        Intent intentPutExtra = new Intent(context, (Class<?>) GeofenceTransitionsIntentService.class).putExtra(f32460c, j10);
        AbstractC4862t.d(intentPutExtra, "putExtra(...)");
        PendingIntent foregroundService = PendingIntent.getForegroundService(context, 0, intentPutExtra, 167772160);
        AbstractC4862t.d(foregroundService, "getForegroundService(...)");
        return foregroundService;
    }

    public final void r(String regionId, final MethodChannel.Result result) {
        AbstractC4862t.e(regionId, "regionId");
        AbstractC4862t.e(result, "result");
        new b(this.f32462a).b(regionId);
        Task taskA = v(this.f32462a).a(C4205s.d(regionId));
        final l lVar = new l() { // from class: za.a
            @Override // vc.l
            public final Object invoke(Object obj) {
                return com.signify.geofence.a.s(result, (Void) obj);
            }
        };
        taskA.h(new InterfaceC2874h() { // from class: za.b
            @Override // b7.InterfaceC2874h
            public final void onSuccess(Object obj) {
                com.signify.geofence.a.t(lVar, obj);
            }
        });
        taskA.e(new InterfaceC2873g() { // from class: za.c
            @Override // b7.InterfaceC2873g
            public final void c(Exception exc) {
                com.signify.geofence.a.u(result, exc);
            }
        });
    }

    public final InterfaceC2072g v(Context context) {
        InterfaceC2072g interfaceC2072gC = context instanceof Activity ? LocationServices.c((Activity) context) : LocationServices.d(context);
        AbstractC4862t.b(interfaceC2072gC);
        return interfaceC2072gC;
    }

    public final void w(String regionId, final MethodChannel.Result result) {
        Object next;
        AbstractC4862t.e(regionId, "regionId");
        AbstractC4862t.e(result, "result");
        Iterator it = new b(this.f32462a).d().iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            } else {
                next = it.next();
                if (AbstractC4862t.a(((k) next).d(), regionId)) {
                    break;
                }
            }
        }
        final k kVar = (k) next;
        if (kVar == null) {
            result.error("UNKNOWN_REGION", "No geofence found for regionId: " + regionId, null);
            return;
        }
        InterfaceC2068c interfaceC2068cB = LocationServices.b(this.f32462a);
        AbstractC4862t.d(interfaceC2068cB, "getFusedLocationProviderClient(...)");
        if (this.f32462a.checkSelfPermission("android.permission.ACCESS_FINE_LOCATION") == -1) {
            result.error("PERMISSION_DENIED", "Location permission denied", null);
            return;
        }
        Task taskI = interfaceC2068cB.i();
        final l lVar = new l() { // from class: za.g
            @Override // vc.l
            public final Object invoke(Object obj) {
                return com.signify.geofence.a.x(result, kVar, (Location) obj);
            }
        };
        taskI.h(new InterfaceC2874h() { // from class: za.h
            @Override // b7.InterfaceC2874h
            public final void onSuccess(Object obj) {
                com.signify.geofence.a.y(lVar, obj);
            }
        }).e(new InterfaceC2873g() { // from class: za.i
            @Override // b7.InterfaceC2873g
            public final void c(Exception exc) {
                com.signify.geofence.a.z(result, exc);
            }
        });
    }
}
