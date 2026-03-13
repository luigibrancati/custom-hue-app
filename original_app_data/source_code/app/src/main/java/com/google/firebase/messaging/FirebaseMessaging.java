package com.google.firebase.messaging;

import N8.a;
import android.annotation.SuppressLint;
import android.app.Application;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import androidx.annotation.Keep;
import b7.C2878l;
import b7.InterfaceC2874h;
import b7.InterfaceC2877k;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import com.google.firebase.messaging.FirebaseMessaging;
import com.google.firebase.messaging.W;
import com.google.firebase.messaging.b0;
import h8.C4284b;
import h8.C4288f;
import java.io.IOException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import l8.InterfaceC4964a;
import r6.C5645a;
import v6.AbstractC6056k;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public class FirebaseMessaging {
    private static final String EXTRA_DUMMY_P_INTENT = "app";
    static final String GMS_PACKAGE = "com.google.android.gms";

    @Deprecated
    public static final String INSTANCE_ID_SCOPE = "FCM";
    private static final long MIN_DELAY_SEC = 30;
    private static final String SEND_INTENT_ACTION = "com.google.android.gcm.intent.SEND";
    private static final String SUBTYPE_DEFAULT = "";
    static final String TAG = "FirebaseMessaging";
    private static b0 store;
    static ScheduledExecutorService syncExecutor;
    private final a autoInit;
    private final Context context;
    private final Executor fileExecutor;
    private final C4288f firebaseApp;
    private final G gmsRpc;
    private final N8.a iid;
    private final Executor initExecutor;
    private final Application.ActivityLifecycleCallbacks lifecycleCallbacks;
    private final L metadata;
    private final W requestDeduplicator;
    private boolean syncScheduledOrRunning;
    private final Task<g0> topicsSubscriberTask;
    private static final long MAX_DELAY_SEC = TimeUnit.HOURS.toSeconds(8);
    static O8.b transportFactory = new O8.b() { // from class: com.google.firebase.messaging.v
        @Override // O8.b
        public final Object get() {
            return FirebaseMessaging.f();
        }
    };

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final L8.d f31606a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public boolean f31607b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public L8.b f31608c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public Boolean f31609d;

        public a(L8.d dVar) {
            this.f31606a = dVar;
        }

        public static /* synthetic */ void a(a aVar, L8.a aVar2) {
            if (aVar.c()) {
                FirebaseMessaging.this.startSyncIfNecessary();
            }
        }

        public synchronized void b() {
            try {
                if (this.f31607b) {
                    return;
                }
                Boolean boolD = d();
                this.f31609d = boolD;
                if (boolD == null) {
                    L8.b bVar = new L8.b() { // from class: com.google.firebase.messaging.D
                        @Override // L8.b
                        public final void a(L8.a aVar) {
                            FirebaseMessaging.a.a(this.f31603a, aVar);
                        }
                    };
                    this.f31608c = bVar;
                    this.f31606a.b(C4284b.class, bVar);
                }
                this.f31607b = true;
            } catch (Throwable th) {
                throw th;
            }
        }

        public synchronized boolean c() {
            Boolean bool;
            try {
                b();
                bool = this.f31609d;
            } catch (Throwable th) {
                throw th;
            }
            return bool != null ? bool.booleanValue() : FirebaseMessaging.this.firebaseApp.x();
        }

        public final Boolean d() {
            ApplicationInfo applicationInfo;
            Bundle bundle;
            Context contextM = FirebaseMessaging.this.firebaseApp.m();
            SharedPreferences sharedPreferences = contextM.getSharedPreferences("com.google.firebase.messaging", 0);
            if (sharedPreferences.contains("auto_init")) {
                return Boolean.valueOf(sharedPreferences.getBoolean("auto_init", false));
            }
            try {
                PackageManager packageManager = contextM.getPackageManager();
                if (packageManager == null || (applicationInfo = packageManager.getApplicationInfo(contextM.getPackageName(), 128)) == null || (bundle = applicationInfo.metaData) == null || !bundle.containsKey("firebase_messaging_auto_init_enabled")) {
                    return null;
                }
                return Boolean.valueOf(applicationInfo.metaData.getBoolean("firebase_messaging_auto_init_enabled"));
            } catch (PackageManager.NameNotFoundException unused) {
                return null;
            }
        }

        public synchronized void e(boolean z10) {
            try {
                b();
                L8.b bVar = this.f31608c;
                if (bVar != null) {
                    this.f31606a.c(C4284b.class, bVar);
                    this.f31608c = null;
                }
                SharedPreferences.Editor editorEdit = FirebaseMessaging.this.firebaseApp.m().getSharedPreferences("com.google.firebase.messaging", 0).edit();
                editorEdit.putBoolean("auto_init", z10);
                editorEdit.apply();
                if (z10) {
                    FirebaseMessaging.this.startSyncIfNecessary();
                }
                this.f31609d = Boolean.valueOf(z10);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public FirebaseMessaging(C4288f c4288f, N8.a aVar, O8.b bVar, O8.b bVar2, P8.h hVar, O8.b bVar3, L8.d dVar) {
        this(c4288f, aVar, bVar, bVar2, hVar, bVar3, dVar, new L(c4288f.m()));
    }

    public static /* synthetic */ Task b(FirebaseMessaging firebaseMessaging, String str, b0.a aVar, String str2) {
        getStore(firebaseMessaging.context).g(firebaseMessaging.getSubtype(), str, str2, firebaseMessaging.metadata.a());
        if (aVar == null || !str2.equals(aVar.f31707a)) {
            firebaseMessaging.lambda$new$1(str2);
        }
        return Tasks.e(str2);
    }

    public static /* synthetic */ void c(FirebaseMessaging firebaseMessaging) {
        if (firebaseMessaging.isAutoInitEnabled()) {
            firebaseMessaging.startSyncIfNecessary();
        }
    }

    public static synchronized void clearStoreForTest() {
        store = null;
    }

    public static void clearTransportFactoryForTest() {
        transportFactory = new O8.b() { // from class: com.google.firebase.messaging.u
            @Override // O8.b
            public final Object get() {
                return FirebaseMessaging.i();
            }
        };
    }

    public static /* synthetic */ void d(FirebaseMessaging firebaseMessaging, C2878l c2878l) {
        firebaseMessaging.getClass();
        try {
            c2878l.c(firebaseMessaging.blockingGetToken());
        } catch (Exception e10) {
            c2878l.b(e10);
        }
    }

    public static /* synthetic */ Y5.j f() {
        return null;
    }

    public static synchronized FirebaseMessaging getInstance() {
        return getInstance(C4288f.o());
    }

    private static synchronized b0 getStore(Context context) {
        try {
            if (store == null) {
                store = new b0(context);
            }
        } catch (Throwable th) {
            throw th;
        }
        return store;
    }

    private String getSubtype() {
        return "[DEFAULT]".equals(this.firebaseApp.q()) ? "" : this.firebaseApp.s();
    }

    public static Y5.j getTransportFactory() {
        return (Y5.j) transportFactory.get();
    }

    public static /* synthetic */ void h(FirebaseMessaging firebaseMessaging, C5645a c5645a) {
        firebaseMessaging.getClass();
        if (c5645a != null) {
            K.y(c5645a.d());
            firebaseMessaging.handleProxiedNotificationData();
        }
    }

    private void handleProxiedNotificationData() {
        this.gmsRpc.f().i(this.initExecutor, new InterfaceC2874h() { // from class: com.google.firebase.messaging.z
            @Override // b7.InterfaceC2874h
            public final void onSuccess(Object obj) {
                FirebaseMessaging.h(this.f31799a, (C5645a) obj);
            }
        });
    }

    public static /* synthetic */ Y5.j i() {
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void initializeProxyNotifications() {
        P.c(this.context);
        S.f(this.context, this.gmsRpc, shouldRetainProxyNotifications());
        if (shouldRetainProxyNotifications()) {
            handleProxiedNotificationData();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: invokeOnTokenRefresh, reason: merged with bridge method [inline-methods] */
    public void lambda$new$1(String str) {
        if ("[DEFAULT]".equals(this.firebaseApp.q())) {
            if (Log.isLoggable(TAG, 3)) {
                Log.d(TAG, "Invoking onNewToken for app: " + this.firebaseApp.q());
            }
            Intent intent = new Intent("com.google.firebase.messaging.NEW_TOKEN");
            intent.putExtra("token", str);
            new C3691m(this.context).g(intent);
        }
    }

    public static /* synthetic */ void k(FirebaseMessaging firebaseMessaging, g0 g0Var) {
        if (firebaseMessaging.isAutoInitEnabled()) {
            g0Var.p();
        }
    }

    public static /* synthetic */ void m(FirebaseMessaging firebaseMessaging, C2878l c2878l) {
        firebaseMessaging.getClass();
        try {
            Tasks.await(firebaseMessaging.gmsRpc.c());
            getStore(firebaseMessaging.context).d(firebaseMessaging.getSubtype(), L.c(firebaseMessaging.firebaseApp));
            c2878l.c(null);
        } catch (Exception e10) {
            c2878l.b(e10);
        }
    }

    private boolean shouldRetainProxyNotifications() {
        P.c(this.context);
        if (!P.d(this.context)) {
            return false;
        }
        if (this.firebaseApp.k(InterfaceC4964a.class) != null) {
            return true;
        }
        return K.a() && transportFactory != null;
    }

    private synchronized void startSync() {
        if (!this.syncScheduledOrRunning) {
            syncWithDelaySecondsInternal(0L);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void startSyncIfNecessary() {
        if (tokenNeedsRefresh(getTokenWithoutTriggeringSync())) {
            startSync();
        }
    }

    public String blockingGetToken() throws IOException {
        final b0.a tokenWithoutTriggeringSync = getTokenWithoutTriggeringSync();
        if (!tokenNeedsRefresh(tokenWithoutTriggeringSync)) {
            return tokenWithoutTriggeringSync.f31707a;
        }
        final String strC = L.c(this.firebaseApp);
        try {
            return (String) Tasks.await(this.requestDeduplicator.b(strC, new W.a() { // from class: com.google.firebase.messaging.B
                @Override // com.google.firebase.messaging.W.a
                public final Task start() {
                    FirebaseMessaging firebaseMessaging = this.f31598a;
                    return firebaseMessaging.gmsRpc.g().s(firebaseMessaging.fileExecutor, new InterfaceC2877k() { // from class: com.google.firebase.messaging.w
                        @Override // b7.InterfaceC2877k
                        public final Task a(Object obj) {
                            return FirebaseMessaging.b(firebaseMessaging, str, aVar, (String) obj);
                        }
                    });
                }
            }));
        } catch (InterruptedException | ExecutionException e10) {
            throw new IOException(e10);
        }
    }

    public Task<Void> deleteToken() {
        if (getTokenWithoutTriggeringSync() == null) {
            return Tasks.e(null);
        }
        final C2878l c2878l = new C2878l();
        AbstractC3692n.e().execute(new Runnable() { // from class: com.google.firebase.messaging.C
            @Override // java.lang.Runnable
            public final void run() {
                FirebaseMessaging.m(this.f31601a, c2878l);
            }
        });
        return c2878l.a();
    }

    public boolean deliveryMetricsExportToBigQueryEnabled() {
        return K.a();
    }

    @SuppressLint({"ThreadPoolCreation"})
    public void enqueueTaskWithDelaySeconds(Runnable runnable, long j10) {
        synchronized (FirebaseMessaging.class) {
            try {
                if (syncExecutor == null) {
                    syncExecutor = new ScheduledThreadPoolExecutor(1, new C6.b("TAG"));
                }
                syncExecutor.schedule(runnable, j10, TimeUnit.SECONDS);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public Context getApplicationContext() {
        return this.context;
    }

    public Task<String> getToken() {
        final C2878l c2878l = new C2878l();
        this.initExecutor.execute(new Runnable() { // from class: com.google.firebase.messaging.y
            @Override // java.lang.Runnable
            public final void run() {
                FirebaseMessaging.d(this.f31797a, c2878l);
            }
        });
        return c2878l.a();
    }

    public b0.a getTokenWithoutTriggeringSync() {
        return getStore(this.context).e(getSubtype(), L.c(this.firebaseApp));
    }

    public Task<g0> getTopicsSubscriberTask() {
        return this.topicsSubscriberTask;
    }

    public boolean isAutoInitEnabled() {
        return this.autoInit.c();
    }

    public boolean isGmsCorePresent() {
        return this.metadata.g();
    }

    public boolean isNotificationDelegationEnabled() {
        return P.d(this.context);
    }

    @Deprecated
    public void send(T t10) {
        if (TextUtils.isEmpty(t10.v())) {
            throw new IllegalArgumentException("Missing 'to'");
        }
        Intent intent = new Intent(SEND_INTENT_ACTION);
        Intent intent2 = new Intent();
        intent2.setPackage("com.google.example.invalidpackage");
        intent.putExtra("app", PendingIntent.getBroadcast(this.context, 0, intent2, 67108864));
        intent.setPackage(GMS_PACKAGE);
        t10.x(intent);
        this.context.sendOrderedBroadcast(intent, "com.google.android.gtalkservice.permission.GTALK_SERVICE");
    }

    public void setAutoInitEnabled(boolean z10) {
        this.autoInit.e(z10);
    }

    public void setDeliveryMetricsExportToBigQuery(boolean z10) {
        K.B(z10);
        S.f(this.context, this.gmsRpc, shouldRetainProxyNotifications());
    }

    public Task<Void> setNotificationDelegationEnabled(boolean z10) {
        return P.e(this.initExecutor, this.context, z10).i(new X2.g(), new InterfaceC2874h() { // from class: com.google.firebase.messaging.x
            @Override // b7.InterfaceC2874h
            public final void onSuccess(Object obj) {
                FirebaseMessaging firebaseMessaging = this.f31796a;
                S.f(firebaseMessaging.context, firebaseMessaging.gmsRpc, firebaseMessaging.shouldRetainProxyNotifications());
            }
        });
    }

    public synchronized void setSyncScheduledOrRunning(boolean z10) {
        this.syncScheduledOrRunning = z10;
    }

    @SuppressLint({"TaskMainThread"})
    public Task<Void> subscribeToTopic(final String str) {
        return this.topicsSubscriberTask.r(new InterfaceC2877k() { // from class: com.google.firebase.messaging.p
            @Override // b7.InterfaceC2877k
            public final Task a(Object obj) {
                return ((g0) obj).q(str);
            }
        });
    }

    public synchronized void syncWithDelaySecondsInternal(long j10) {
        enqueueTaskWithDelaySeconds(new c0(this, Math.min(Math.max(MIN_DELAY_SEC, 2 * j10), MAX_DELAY_SEC)), j10);
        this.syncScheduledOrRunning = true;
    }

    public boolean tokenNeedsRefresh(b0.a aVar) {
        return aVar == null || aVar.b(this.metadata.a());
    }

    @SuppressLint({"TaskMainThread"})
    public Task<Void> unsubscribeFromTopic(final String str) {
        return this.topicsSubscriberTask.r(new InterfaceC2877k() { // from class: com.google.firebase.messaging.A
            @Override // b7.InterfaceC2877k
            public final Task a(Object obj) {
                return ((g0) obj).t(str);
            }
        });
    }

    @Keep
    public static synchronized FirebaseMessaging getInstance(C4288f c4288f) {
        FirebaseMessaging firebaseMessaging;
        firebaseMessaging = (FirebaseMessaging) c4288f.k(FirebaseMessaging.class);
        AbstractC6056k.m(firebaseMessaging, "Firebase Messaging component is not present");
        return firebaseMessaging;
    }

    public FirebaseMessaging(C4288f c4288f, N8.a aVar, O8.b bVar, O8.b bVar2, P8.h hVar, O8.b bVar3, L8.d dVar, L l10) {
        this(c4288f, aVar, bVar3, dVar, l10, new G(c4288f, l10, bVar, bVar2, hVar), AbstractC3692n.f(), AbstractC3692n.c(), AbstractC3692n.b());
    }

    public FirebaseMessaging(C4288f c4288f, N8.a aVar, O8.b bVar, L8.d dVar, L l10, G g10, Executor executor, Executor executor2, Executor executor3) {
        this.syncScheduledOrRunning = false;
        transportFactory = bVar;
        this.firebaseApp = c4288f;
        this.autoInit = new a(dVar);
        Context contextM = c4288f.m();
        this.context = contextM;
        C3693o c3693o = new C3693o();
        this.lifecycleCallbacks = c3693o;
        this.metadata = l10;
        this.gmsRpc = g10;
        this.requestDeduplicator = new W(executor);
        this.initExecutor = executor2;
        this.fileExecutor = executor3;
        Context contextM2 = c4288f.m();
        if (contextM2 instanceof Application) {
            ((Application) contextM2).registerActivityLifecycleCallbacks(c3693o);
        } else {
            Log.w(TAG, "Context " + contextM2 + " was not an application, can't register for lifecycle callbacks. Some notification events may be dropped as a result.");
        }
        if (aVar != null) {
            aVar.a(new a.InterfaceC0153a() { // from class: com.google.firebase.messaging.q
            });
        }
        executor2.execute(new Runnable() { // from class: com.google.firebase.messaging.r
            @Override // java.lang.Runnable
            public final void run() {
                FirebaseMessaging.c(this.f31790a);
            }
        });
        Task<g0> taskF = g0.f(this, l10, g10, contextM, AbstractC3692n.g());
        this.topicsSubscriberTask = taskF;
        taskF.i(executor2, new InterfaceC2874h() { // from class: com.google.firebase.messaging.s
            @Override // b7.InterfaceC2874h
            public final void onSuccess(Object obj) {
                FirebaseMessaging.k(this.f31791a, (g0) obj);
            }
        });
        executor2.execute(new Runnable() { // from class: com.google.firebase.messaging.t
            @Override // java.lang.Runnable
            public final void run() {
                this.f31792a.initializeProxyNotifications();
            }
        });
    }
}
