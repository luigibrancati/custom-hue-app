package W8;

import P8.h;
import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.util.Log;
import b9.C2898a;
import com.google.firebase.perf.config.RemoteConfigManager;
import com.google.firebase.perf.session.SessionManager;
import h8.C4288f;
import h9.k;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public class e {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final C2898a f17854i = C2898a.e();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Map f17855a = new ConcurrentHashMap();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Y8.a f17856b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final com.google.firebase.perf.util.f f17857c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Boolean f17858d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final C4288f f17859e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final O8.b f17860f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final h f17861g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final O8.b f17862h;

    public e(C4288f c4288f, O8.b bVar, h hVar, O8.b bVar2, RemoteConfigManager remoteConfigManager, Y8.a aVar, SessionManager sessionManager) {
        this.f17858d = null;
        this.f17859e = c4288f;
        this.f17860f = bVar;
        this.f17861g = hVar;
        this.f17862h = bVar2;
        if (c4288f == null) {
            this.f17858d = Boolean.FALSE;
            this.f17856b = aVar;
            this.f17857c = new com.google.firebase.perf.util.f(new Bundle());
            return;
        }
        k.k().r(c4288f, hVar, bVar2);
        Context contextM = c4288f.m();
        com.google.firebase.perf.util.f fVarA = a(contextM);
        this.f17857c = fVarA;
        remoteConfigManager.setFirebaseRemoteConfigProvider(bVar);
        this.f17856b = aVar;
        aVar.P(fVarA);
        aVar.O(contextM);
        sessionManager.setApplicationContext(contextM);
        this.f17858d = aVar.j();
        C2898a c2898a = f17854i;
        if (c2898a.h() && d()) {
            c2898a.f(String.format("Firebase Performance Monitoring is successfully initialized! In a minute, visit the Firebase console to view your data: %s", b9.b.b(c4288f.r().g(), contextM.getPackageName())));
        }
    }

    public static com.google.firebase.perf.util.f a(Context context) {
        Bundle bundle;
        try {
            bundle = context.getPackageManager().getApplicationInfo(context.getPackageName(), 128).metaData;
        } catch (PackageManager.NameNotFoundException | NullPointerException e10) {
            Log.d("isEnabled", "No perf enable meta data found " + e10.getMessage());
            bundle = null;
        }
        return bundle != null ? new com.google.firebase.perf.util.f(bundle) : new com.google.firebase.perf.util.f();
    }

    public static e c() {
        return (e) C4288f.o().k(e.class);
    }

    public Map b() {
        return new HashMap(this.f17855a);
    }

    public boolean d() {
        Boolean bool = this.f17858d;
        return bool != null ? bool.booleanValue() : C4288f.o().x();
    }
}
