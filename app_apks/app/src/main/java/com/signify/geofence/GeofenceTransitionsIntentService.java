package com.signify.geofence;

import R6.AbstractC2070e;
import R6.C2073h;
import R6.InterfaceC2069d;
import Rd.AbstractC2130h;
import Rd.AbstractC2132i;
import Rd.C2123d0;
import Rd.M;
import android.app.IntentService;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.res.AssetManager;
import com.google.android.libraries.barhopper.RecognitionOptions;
import fc.AbstractC4036s;
import fc.AbstractC4040w;
import fc.C4015H;
import fc.C4035r;
import gc.C4205s;
import gc.C4206t;
import gc.C4207u;
import gc.Q;
import io.flutter.embedding.engine.FlutterEngine;
import io.flutter.embedding.engine.dart.DartExecutor;
import io.flutter.embedding.engine.loader.FlutterLoader;
import io.flutter.plugin.common.MethodChannel;
import io.flutter.view.FlutterCallbackInformation;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC4854k;
import kotlin.jvm.internal.AbstractC4862t;
import lc.C4994k;
import lc.InterfaceC4988e;
import mc.C5045b;
import mc.C5046c;
import nc.h;
import nc.m;
import za.j;
import za.p;
import za.t;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010 \n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010$\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u0000 \u001f2\u00020\u0001:\u0001/B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0005\u0010\u0003J\u000f\u0010\u0006\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0006\u0010\u0003J\u0019\u0010\t\u001a\u00020\u00042\b\u0010\b\u001a\u0004\u0018\u00010\u0007H\u0014¢\u0006\u0004\b\t\u0010\nJ\u001b\u0010\f\u001a\u0004\u0018\u00010\u000b2\b\u0010\b\u001a\u0004\u0018\u00010\u0007H\u0007¢\u0006\u0004\b\f\u0010\rJ\u0019\u0010\u000e\u001a\u00020\u00042\b\u0010\b\u001a\u0004\u0018\u00010\u0007H\u0002¢\u0006\u0004\b\u000e\u0010\nJ\u001f\u0010\u0013\u001a\u00020\u00042\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u0011H\u0002¢\u0006\u0004\b\u0013\u0010\u0014J-\u0010\u0019\u001a\u00020\u00042\u0006\u0010\u0010\u001a\u00020\u000f2\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00110\u00152\u0006\u0010\u0018\u001a\u00020\u0017H\u0002¢\u0006\u0004\b\u0019\u0010\u001aJ+\u0010\u001f\u001a\u00020\u00042\u0006\u0010\u001b\u001a\u00020\u00112\u0012\u0010\u001e\u001a\u000e\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u001d0\u001cH\u0002¢\u0006\u0004\b\u001f\u0010 J\u000f\u0010\"\u001a\u00020!H\u0002¢\u0006\u0004\b\"\u0010#J\u0019\u0010$\u001a\u00020\u00042\b\u0010\b\u001a\u0004\u0018\u00010\u0007H\u0002¢\u0006\u0004\b$\u0010\nJ\u0019\u0010&\u001a\u00020%2\b\u0010\b\u001a\u0004\u0018\u00010\u0007H\u0002¢\u0006\u0004\b&\u0010'J\u0019\u0010(\u001a\u00020%2\b\u0010\b\u001a\u0004\u0018\u00010\u0007H\u0002¢\u0006\u0004\b(\u0010'J\u001b\u0010+\u001a\u00020\u0004*\u00020)2\u0006\u0010*\u001a\u00020\u0011H\u0002¢\u0006\u0004\b+\u0010,J\u000f\u0010-\u001a\u00020\u0004H\u0002¢\u0006\u0004\b-\u0010\u0003R\u0018\u00101\u001a\u0004\u0018\u00010.8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b/\u00100R\u0018\u00105\u001a\u0004\u0018\u0001028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b3\u00104R\u0018\u0010*\u001a\u00020\u0017*\u00020\u00178BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b6\u00107¨\u00068"}, d2 = {"Lcom/signify/geofence/GeofenceTransitionsIntentService;", "Landroid/app/IntentService;", "<init>", "()V", "Lfc/H;", "onCreate", "onDestroy", "Landroid/content/Intent;", "intent", "onHandleIntent", "(Landroid/content/Intent;)V", "LR6/h;", "d", "(Landroid/content/Intent;)LR6/h;", "g", "", "callbackHandle", "", "errorDescription", "h", "(JLjava/lang/String;)V", "", "regionIds", "", "transitionType", "i", "(JLjava/util/List;I)V", "methodName", "", "", "arguments", "c", "(Ljava/lang/String;Ljava/util/Map;)V", "Landroid/content/SharedPreferences;", "m", "()Landroid/content/SharedPreferences;", "f", "", "k", "(Landroid/content/Intent;)Z", "j", "Landroid/content/Context;", "title", "n", "(Landroid/content/Context;Ljava/lang/String;)V", "l", "Lio/flutter/plugin/common/MethodChannel;", "a", "Lio/flutter/plugin/common/MethodChannel;", "backgroundChannel", "Lio/flutter/embedding/engine/FlutterEngine;", "b", "Lio/flutter/embedding/engine/FlutterEngine;", "backgroundFlutterEngine", "e", "(I)I", "geofence_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class GeofenceTransitionsIntentService extends IntentService {

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static p f32440d;

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    public MethodChannel backgroundChannel;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    public FlutterEngine backgroundFlutterEngine;

    /* JADX INFO: renamed from: com.signify.geofence.GeofenceTransitionsIntentService$a, reason: from kotlin metadata */
    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class Companion {
        public /* synthetic */ Companion(AbstractC4854k abstractC4854k) {
            this();
        }

        public final void a(p callback) {
            AbstractC4862t.e(callback, "callback");
            GeofenceTransitionsIntentService.f32440d = callback;
        }

        public Companion() {
        }
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class b extends m implements vc.p {

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public Object f32443j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public Object f32444k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public Object f32445l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public int f32446m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public /* synthetic */ Object f32447n;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        public final /* synthetic */ String f32449p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        public final /* synthetic */ Map f32450q;

        /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
        public static final class a extends m implements vc.p {

            /* JADX INFO: renamed from: j, reason: collision with root package name */
            public int f32451j;

            /* JADX INFO: renamed from: k, reason: collision with root package name */
            public final /* synthetic */ GeofenceTransitionsIntentService f32452k;

            /* JADX INFO: renamed from: l, reason: collision with root package name */
            public final /* synthetic */ String f32453l;

            /* JADX INFO: renamed from: m, reason: collision with root package name */
            public final /* synthetic */ Map f32454m;

            /* JADX INFO: renamed from: n, reason: collision with root package name */
            public final /* synthetic */ InterfaceC4988e f32455n;

            /* JADX INFO: renamed from: com.signify.geofence.GeofenceTransitionsIntentService$b$a$a, reason: collision with other inner class name */
            /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
            public static final class C0386a implements MethodChannel.Result {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final /* synthetic */ InterfaceC4988e f32456a;

                public C0386a(InterfaceC4988e interfaceC4988e) {
                    this.f32456a = interfaceC4988e;
                }

                @Override // io.flutter.plugin.common.MethodChannel.Result
                public void error(String errorCode, String str, Object obj) {
                    AbstractC4862t.e(errorCode, "errorCode");
                    InterfaceC4988e interfaceC4988e = this.f32456a;
                    C4035r.a aVar = C4035r.f34274b;
                    interfaceC4988e.resumeWith(C4035r.b(C4015H.f34254a));
                }

                @Override // io.flutter.plugin.common.MethodChannel.Result
                public void notImplemented() {
                    InterfaceC4988e interfaceC4988e = this.f32456a;
                    C4035r.a aVar = C4035r.f34274b;
                    interfaceC4988e.resumeWith(C4035r.b(C4015H.f34254a));
                }

                @Override // io.flutter.plugin.common.MethodChannel.Result
                public void success(Object obj) {
                    InterfaceC4988e interfaceC4988e = this.f32456a;
                    C4035r.a aVar = C4035r.f34274b;
                    interfaceC4988e.resumeWith(C4035r.b(C4015H.f34254a));
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(GeofenceTransitionsIntentService geofenceTransitionsIntentService, String str, Map map, InterfaceC4988e interfaceC4988e, InterfaceC4988e interfaceC4988e2) {
                super(2, interfaceC4988e2);
                this.f32452k = geofenceTransitionsIntentService;
                this.f32453l = str;
                this.f32454m = map;
                this.f32455n = interfaceC4988e;
            }

            @Override // nc.AbstractC5157a
            public final InterfaceC4988e create(Object obj, InterfaceC4988e interfaceC4988e) {
                return new a(this.f32452k, this.f32453l, this.f32454m, this.f32455n, interfaceC4988e);
            }

            @Override // vc.p
            public final Object invoke(M m10, InterfaceC4988e interfaceC4988e) {
                return ((a) create(m10, interfaceC4988e)).invokeSuspend(C4015H.f34254a);
            }

            @Override // nc.AbstractC5157a
            public final Object invokeSuspend(Object obj) throws Throwable {
                C5046c.f();
                if (this.f32451j != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC4036s.b(obj);
                MethodChannel methodChannel = this.f32452k.backgroundChannel;
                AbstractC4862t.b(methodChannel);
                methodChannel.invokeMethod(this.f32453l, this.f32454m, new C0386a(this.f32455n));
                return C4015H.f34254a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(String str, Map map, InterfaceC4988e interfaceC4988e) {
            super(2, interfaceC4988e);
            this.f32449p = str;
            this.f32450q = map;
        }

        @Override // nc.AbstractC5157a
        public final InterfaceC4988e create(Object obj, InterfaceC4988e interfaceC4988e) {
            b bVar = GeofenceTransitionsIntentService.this.new b(this.f32449p, this.f32450q, interfaceC4988e);
            bVar.f32447n = obj;
            return bVar;
        }

        @Override // vc.p
        public final Object invoke(M m10, InterfaceC4988e interfaceC4988e) {
            return ((b) create(m10, interfaceC4988e)).invokeSuspend(C4015H.f34254a);
        }

        @Override // nc.AbstractC5157a
        public final Object invokeSuspend(Object obj) throws Throwable {
            M m10 = (M) this.f32447n;
            Object objF = C5046c.f();
            int i10 = this.f32446m;
            if (i10 == 0) {
                AbstractC4036s.b(obj);
                GeofenceTransitionsIntentService geofenceTransitionsIntentService = GeofenceTransitionsIntentService.this;
                String str = this.f32449p;
                Map map = this.f32450q;
                this.f32447n = m10;
                this.f32443j = geofenceTransitionsIntentService;
                this.f32444k = str;
                this.f32445l = map;
                this.f32446m = 1;
                C4994k c4994k = new C4994k(C5045b.c(this));
                AbstractC2132i.d(m10, C2123d0.c(), null, new a(geofenceTransitionsIntentService, str, map, c4994k, null), 2, null);
                Object objA = c4994k.a();
                if (objA == C5046c.f()) {
                    h.c(this);
                }
                if (objA == objF) {
                    return objF;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC4036s.b(obj);
            }
            return C4015H.f34254a;
        }
    }

    public GeofenceTransitionsIntentService() {
        super("GeofenceTransitionsIntentService");
    }

    public final void c(String methodName, Map arguments) {
        AbstractC2130h.b(null, new b(methodName, arguments, null), 1, null);
    }

    public final C2073h d(Intent intent) {
        if (intent != null) {
            return C2073h.a(intent);
        }
        return null;
    }

    public final int e(int i10) {
        if (i10 == 1) {
            return t.f48874a;
        }
        if (i10 != 2) {
            return 0;
        }
        return t.f48875b;
    }

    public final void f(Intent intent) {
        if (intent != null) {
            String stringExtra = intent.getStringExtra("regionId");
            AbstractC4862t.b(stringExtra);
            int intExtra = intent.getIntExtra("transitionType", 2);
            long j10 = m().getLong(c.INSTANCE.c(), 0L);
            if (j10 == 0) {
                return;
            }
            i(j10, C4205s.d(stringExtra), intExtra);
        }
    }

    public final void g(Intent intent) {
        String stringExtra;
        long j10 = m().getLong(c.INSTANCE.c(), 0L);
        if (j10 == 0) {
            return;
        }
        if (intent == null || (stringExtra = intent.getStringExtra("error")) == null) {
            stringExtra = "";
        }
        h(j10, stringExtra);
    }

    public final void h(long callbackHandle, String errorDescription) {
        c("geofenceError", Q.l(AbstractC4040w.a("appCallbackHandle", Long.valueOf(callbackHandle)), AbstractC4040w.a("errorDescription", errorDescription)));
    }

    public final void i(long callbackHandle, List regionIds, int transitionType) {
        String string = getString(e(transitionType));
        AbstractC4862t.d(string, "getString(...)");
        n(this, string);
        c("geofence", Q.l(AbstractC4040w.a("appCallbackHandle", Long.valueOf(callbackHandle)), AbstractC4040w.a("regionIds", regionIds), AbstractC4040w.a("transition", Integer.valueOf(transitionType))));
    }

    public final boolean j(Intent intent) {
        if (intent != null) {
            return intent.hasExtra("error");
        }
        return false;
    }

    public final boolean k(Intent intent) {
        if (intent != null) {
            return intent.hasExtra("fake");
        }
        return false;
    }

    public final void l() {
        j jVar = new j();
        startForeground(jVar.e(), j.d(jVar, this, 0, 2, null), RecognitionOptions.PDF417);
    }

    public final SharedPreferences m() {
        SharedPreferences sharedPreferences = getSharedPreferences(c.INSTANCE.d(), 0);
        AbstractC4862t.d(sharedPreferences, "getSharedPreferences(...)");
        return sharedPreferences;
    }

    public final void n(Context context, String str) {
        new j().g(str, context);
    }

    @Override // android.app.IntentService, android.app.Service
    public void onCreate() {
        FlutterCallbackInformation flutterCallbackInformationLookupCallbackInformation;
        super.onCreate();
        l();
        FlutterLoader flutterLoader = new FlutterLoader();
        flutterLoader.startInitialization(getApplicationContext());
        flutterLoader.ensureInitializationComplete(getApplicationContext(), new String[0]);
        if (this.backgroundFlutterEngine == null) {
            p pVar = null;
            try {
                flutterCallbackInformationLookupCallbackInformation = FlutterCallbackInformation.lookupCallbackInformation(m().getLong(c.INSTANCE.b(), 0L));
            } catch (IllegalStateException unused) {
                flutterCallbackInformationLookupCallbackInformation = null;
            }
            if (flutterCallbackInformationLookupCallbackInformation != null) {
                this.backgroundFlutterEngine = new FlutterEngine(getApplicationContext());
                p pVar2 = f32440d;
                if (pVar2 == null) {
                    AbstractC4862t.p("pluginRegistrantCallback");
                } else {
                    pVar = pVar2;
                }
                FlutterEngine flutterEngine = this.backgroundFlutterEngine;
                AbstractC4862t.b(flutterEngine);
                pVar.registerWith(flutterEngine);
                AssetManager assets = getApplicationContext().getAssets();
                String strFindAppBundlePath = flutterLoader.findAppBundlePath();
                AbstractC4862t.b(strFindAppBundlePath);
                DartExecutor.DartCallback dartCallback = new DartExecutor.DartCallback(assets, strFindAppBundlePath, flutterCallbackInformationLookupCallbackInformation);
                FlutterEngine flutterEngine2 = this.backgroundFlutterEngine;
                AbstractC4862t.b(flutterEngine2);
                flutterEngine2.getDartExecutor().executeDartCallback(dartCallback);
                FlutterEngine flutterEngine3 = this.backgroundFlutterEngine;
                AbstractC4862t.b(flutterEngine3);
                this.backgroundChannel = new MethodChannel(flutterEngine3.getDartExecutor().getBinaryMessenger(), "com.signify.geofence.callback");
            }
        }
    }

    @Override // android.app.IntentService, android.app.Service
    public void onDestroy() {
        super.onDestroy();
        FlutterEngine flutterEngine = this.backgroundFlutterEngine;
        if (flutterEngine != null) {
            flutterEngine.destroy();
        }
    }

    @Override // android.app.IntentService
    public void onHandleIntent(Intent intent) {
        if (k(intent)) {
            if (j(intent)) {
                g(intent);
                return;
            } else {
                f(intent);
                return;
            }
        }
        AbstractC4862t.b(intent);
        long longExtra = intent.getLongExtra(a.f32459b.a(), 0L);
        if (longExtra == 0) {
            return;
        }
        C2073h c2073hD = d(intent);
        if (c2073hD == null || c2073hD.e()) {
            String strA = AbstractC2070e.a(c2073hD != null ? c2073hD.b() : Integer.MIN_VALUE);
            AbstractC4862t.d(strA, "getStatusCodeString(...)");
            h(longExtra, strA);
            return;
        }
        List listD = c2073hD.d();
        if (listD == null) {
            listD = C4206t.k();
        }
        if (listD.isEmpty()) {
            h(longExtra, "Empty geofence event");
            return;
        }
        int iC = c2073hD.c();
        if (1 != iC && 2 != iC) {
            h(longExtra, "Unsupported transition type " + iC);
            return;
        }
        ArrayList arrayList = new ArrayList(C4207u.v(listD, 10));
        Iterator it = listD.iterator();
        while (it.hasNext()) {
            arrayList.add(((InterfaceC2069d) it.next()).c());
        }
        i(longExtra, arrayList, iC);
    }
}
