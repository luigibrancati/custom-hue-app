package La;

import android.content.Context;
import android.os.Build;
import android.util.Log;
import io.flutter.embedding.engine.plugins.FlutterPlugin;
import io.flutter.plugin.common.BinaryMessenger;
import io.flutter.plugin.common.MethodCall;
import io.flutter.plugin.common.MethodChannel;
import io.flutter.plugin.common.StandardMethodCodec;
import io.sentry.protocol.Device;
import java.util.HashMap;
import java.util.Map;
import org.apache.tika.utils.StringUtils;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public class B implements FlutterPlugin, MethodChannel.MethodCallHandler {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static String f8602h;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static n f8606l;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Context f8607a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public MethodChannel f8608b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Map f8597c = new HashMap();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final Map f8598d = new HashMap();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final Object f8599e = new Object();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final Object f8600f = new Object();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static int f8601g = 0;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static int f8603i = 0;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static int f8604j = 1;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static int f8605k = 0;

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public class a implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ i f8609a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ MethodChannel.Result f8610b;

        public a(i iVar, MethodChannel.Result result) {
            this.f8609a = iVar;
            this.f8610b = result;
        }

        @Override // java.lang.Runnable
        public void run() {
            synchronized (B.f8600f) {
                B.this.l(this.f8609a);
            }
            this.f8610b.success(null);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public class b implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ i f8612a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ String f8613b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ MethodChannel.Result f8614c;

        public b(i iVar, String str, MethodChannel.Result result) {
            this.f8612a = iVar;
            this.f8613b = str;
            this.f8614c = result;
        }

        @Override // java.lang.Runnable
        public void run() {
            synchronized (B.f8600f) {
                i iVar = this.f8612a;
                if (iVar != null) {
                    B.this.l(iVar);
                }
                try {
                    if (q.c(B.f8601g)) {
                        Log.d("Sqflite", "delete database " + this.f8613b);
                    }
                    i.o(this.f8613b);
                } catch (Exception e10) {
                    Log.e("Sqflite", "error " + e10 + " while closing database " + B.f8605k);
                }
            }
            this.f8614c.success(null);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0048 A[Catch: all -> 0x003e, Exception -> 0x004c, TryCatch #1 {Exception -> 0x004c, blocks: (B:16:0x0040, B:18:0x0048, B:21:0x004e), top: B:45:0x0040, outer: #2 }] */
    /* JADX WARN: Removed duplicated region for block: B:21:0x004e A[Catch: all -> 0x003e, Exception -> 0x004c, TRY_LEAVE, TryCatch #1 {Exception -> 0x004c, blocks: (B:16:0x0040, B:18:0x0048, B:21:0x004e), top: B:45:0x0040, outer: #2 }] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0054  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static /* synthetic */ void d(boolean r2, java.lang.String r3, io.flutter.plugin.common.MethodChannel.Result r4, java.lang.Boolean r5, La.i r6, io.flutter.plugin.common.MethodCall r7, boolean r8, int r9) {
        /*
            java.lang.Object r0 = La.B.f8600f
            monitor-enter(r0)
            if (r2 != 0) goto L40
            java.io.File r2 = new java.io.File     // Catch: java.lang.Throwable -> L3e
            r2.<init>(r3)     // Catch: java.lang.Throwable -> L3e
            java.io.File r1 = new java.io.File     // Catch: java.lang.Throwable -> L3e
            java.lang.String r2 = r2.getParent()     // Catch: java.lang.Throwable -> L3e
            r1.<init>(r2)     // Catch: java.lang.Throwable -> L3e
            boolean r2 = r1.exists()     // Catch: java.lang.Throwable -> L3e
            if (r2 != 0) goto L40
            boolean r2 = r1.mkdirs()     // Catch: java.lang.Throwable -> L3e
            if (r2 != 0) goto L40
            boolean r2 = r1.exists()     // Catch: java.lang.Throwable -> L3e
            if (r2 != 0) goto L40
            java.lang.String r2 = "sqlite_error"
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L3e
            r5.<init>()     // Catch: java.lang.Throwable -> L3e
            java.lang.String r6 = "open_failed "
            r5.append(r6)     // Catch: java.lang.Throwable -> L3e
            r5.append(r3)     // Catch: java.lang.Throwable -> L3e
            java.lang.String r3 = r5.toString()     // Catch: java.lang.Throwable -> L3e
            r5 = 0
            r4.error(r2, r3, r5)     // Catch: java.lang.Throwable -> L3e
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L3e
            return
        L3e:
            r2 = move-exception
            goto Laf
        L40:
            java.lang.Boolean r2 = java.lang.Boolean.TRUE     // Catch: java.lang.Throwable -> L3e java.lang.Exception -> L4c
            boolean r2 = r2.equals(r5)     // Catch: java.lang.Throwable -> L3e java.lang.Exception -> L4c
            if (r2 == 0) goto L4e
            r6.M()     // Catch: java.lang.Throwable -> L3e java.lang.Exception -> L4c
            goto L51
        L4c:
            r2 = move-exception
            goto La5
        L4e:
            r6.L()     // Catch: java.lang.Throwable -> L3e java.lang.Exception -> L4c
        L51:
            java.lang.Object r2 = La.B.f8599e     // Catch: java.lang.Throwable -> L3e
            monitor-enter(r2)     // Catch: java.lang.Throwable -> L3e
            if (r8 == 0) goto L62
            java.util.Map r5 = La.B.f8597c     // Catch: java.lang.Throwable -> L60
            java.lang.Integer r7 = java.lang.Integer.valueOf(r9)     // Catch: java.lang.Throwable -> L60
            r5.put(r3, r7)     // Catch: java.lang.Throwable -> L60
            goto L62
        L60:
            r3 = move-exception
            goto La3
        L62:
            java.util.Map r5 = La.B.f8598d     // Catch: java.lang.Throwable -> L60
            java.lang.Integer r7 = java.lang.Integer.valueOf(r9)     // Catch: java.lang.Throwable -> L60
            r5.put(r7, r6)     // Catch: java.lang.Throwable -> L60
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L60
            int r2 = r6.f8635d     // Catch: java.lang.Throwable -> L3e
            boolean r2 = La.q.b(r2)     // Catch: java.lang.Throwable -> L3e
            if (r2 == 0) goto L99
            java.lang.String r2 = "Sqflite"
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L3e
            r5.<init>()     // Catch: java.lang.Throwable -> L3e
            java.lang.String r6 = r6.A()     // Catch: java.lang.Throwable -> L3e
            r5.append(r6)     // Catch: java.lang.Throwable -> L3e
            java.lang.String r6 = "opened "
            r5.append(r6)     // Catch: java.lang.Throwable -> L3e
            r5.append(r9)     // Catch: java.lang.Throwable -> L3e
            java.lang.String r6 = " "
            r5.append(r6)     // Catch: java.lang.Throwable -> L3e
            r5.append(r3)     // Catch: java.lang.Throwable -> L3e
            java.lang.String r3 = r5.toString()     // Catch: java.lang.Throwable -> L3e
            android.util.Log.d(r2, r3)     // Catch: java.lang.Throwable -> L3e
        L99:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L3e
            r2 = 0
            java.util.Map r2 = p(r9, r2, r2)
            r4.success(r2)
            return
        La3:
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L60
            throw r3     // Catch: java.lang.Throwable -> L3e
        La5:
            Na.d r3 = new Na.d     // Catch: java.lang.Throwable -> L3e
            r3.<init>(r7, r4)     // Catch: java.lang.Throwable -> L3e
            r6.D(r2, r3)     // Catch: java.lang.Throwable -> L3e
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L3e
            return
        Laf:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L3e
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: La.B.d(boolean, java.lang.String, io.flutter.plugin.common.MethodChannel$Result, java.lang.Boolean, La.i, io.flutter.plugin.common.MethodCall, boolean, int):void");
    }

    public static /* synthetic */ void g(MethodCall methodCall, i iVar, MethodChannel.Result result) {
        try {
            iVar.f8640i.setLocale(D.e((String) methodCall.argument(Device.JsonKeys.LOCALE)));
            result.success(null);
        } catch (Exception e10) {
            result.error("sqlite_error", "Error calling setLocale: " + e10.getMessage(), null);
        }
    }

    public static boolean o(String str) {
        return str == null || str.equals(":memory:");
    }

    public static Map p(int i10, boolean z10, boolean z11) {
        HashMap map = new HashMap();
        map.put("id", Integer.valueOf(i10));
        if (z10) {
            map.put("recovered", Boolean.TRUE);
        }
        if (z11) {
            map.put("recoveredInTransaction", Boolean.TRUE);
        }
        return map;
    }

    private void q(Context context, BinaryMessenger binaryMessenger) {
        this.f8607a = context;
        MethodChannel methodChannel = new MethodChannel(binaryMessenger, "com.tekartik.sqflite", StandardMethodCodec.INSTANCE, binaryMessenger.makeBackgroundTaskQueue());
        this.f8608b = methodChannel;
        methodChannel.setMethodCallHandler(this);
    }

    public final void A(final MethodCall methodCall, final MethodChannel.Result result) {
        final int i10;
        i iVar;
        final String str = (String) methodCall.argument("path");
        final Boolean bool = (Boolean) methodCall.argument("readOnly");
        final boolean zO = o(str);
        boolean z10 = (Boolean.FALSE.equals(methodCall.argument("singleInstance")) || zO) ? false : true;
        if (z10) {
            synchronized (f8599e) {
                try {
                    if (q.c(f8601g)) {
                        Log.d("Sqflite", "Look for " + str + " in " + f8597c.keySet());
                    }
                    Integer num = (Integer) f8597c.get(str);
                    if (num != null && (iVar = (i) f8598d.get(num)) != null) {
                        if (iVar.f8640i.isOpen()) {
                            if (q.c(f8601g)) {
                                StringBuilder sb2 = new StringBuilder();
                                sb2.append(iVar.A());
                                sb2.append("re-opened single instance ");
                                sb2.append(iVar.F() ? "(in transaction) " : "");
                                sb2.append(num);
                                sb2.append(StringUtils.SPACE);
                                sb2.append(str);
                                Log.d("Sqflite", sb2.toString());
                            }
                            result.success(p(num.intValue(), true, iVar.F()));
                            return;
                        }
                        if (q.c(f8601g)) {
                            Log.d("Sqflite", iVar.A() + "single instance database of " + str + " not opened");
                        }
                    }
                } finally {
                }
            }
        }
        Object obj = f8599e;
        synchronized (obj) {
            i10 = f8605k + 1;
            f8605k = i10;
        }
        final i iVar2 = new i(this.f8607a, str, i10, z10, f8601g);
        synchronized (obj) {
            try {
                if (f8606l == null) {
                    n nVarB = n.b("Sqflite", f8604j, f8603i);
                    f8606l = nVarB;
                    nVarB.start();
                    if (q.b(iVar2.f8635d)) {
                        Log.d("Sqflite", iVar2.A() + "starting worker pool with priority " + f8603i);
                    }
                }
                iVar2.f8639h = f8606l;
                if (q.b(iVar2.f8635d)) {
                    Log.d("Sqflite", iVar2.A() + "opened " + i10 + StringUtils.SPACE + str);
                }
                final boolean z11 = z10;
                f8606l.a(iVar2, new Runnable() { // from class: La.x
                    @Override // java.lang.Runnable
                    public final void run() {
                        B.d(zO, str, result, bool, iVar2, methodCall, z11, i10);
                    }
                });
            } finally {
            }
        }
    }

    public void B(MethodCall methodCall, MethodChannel.Result result) {
        Object objArgument = methodCall.argument("androidThreadPriority");
        if (objArgument != null) {
            f8603i = ((Integer) objArgument).intValue();
        }
        Object objArgument2 = methodCall.argument("androidThreadCount");
        if (objArgument2 != null && !objArgument2.equals(Integer.valueOf(f8604j))) {
            f8604j = ((Integer) objArgument2).intValue();
            n nVar = f8606l;
            if (nVar != null) {
                nVar.c();
                f8606l = null;
            }
        }
        Integer numA = q.a(methodCall);
        if (numA != null) {
            f8601g = numA.intValue();
        }
        result.success(null);
    }

    public final void C(final MethodCall methodCall, final MethodChannel.Result result) {
        final i iVarN = n(methodCall, result);
        if (iVarN == null) {
            return;
        }
        f8606l.a(iVarN, new Runnable() { // from class: La.v
            @Override // java.lang.Runnable
            public final void run() {
                iVarN.N(new Na.d(methodCall, result));
            }
        });
    }

    public final void D(final MethodCall methodCall, final MethodChannel.Result result) {
        final i iVarN = n(methodCall, result);
        if (iVarN == null) {
            return;
        }
        f8606l.a(iVarN, new Runnable() { // from class: La.t
            @Override // java.lang.Runnable
            public final void run() {
                iVarN.O(new Na.d(methodCall, result));
            }
        });
    }

    public final void E(final MethodCall methodCall, final MethodChannel.Result result) {
        final i iVarN = n(methodCall, result);
        if (iVarN == null) {
            return;
        }
        f8606l.a(iVarN, new Runnable() { // from class: La.w
            @Override // java.lang.Runnable
            public final void run() {
                B.g(methodCall, iVarN, result);
            }
        });
    }

    public final void F(final MethodCall methodCall, final MethodChannel.Result result) {
        final i iVarN = n(methodCall, result);
        if (iVarN == null) {
            return;
        }
        f8606l.a(iVarN, new Runnable() { // from class: La.z
            @Override // java.lang.Runnable
            public final void run() {
                iVarN.Q(new Na.d(methodCall, result));
            }
        });
    }

    public final void l(i iVar) {
        try {
            if (q.b(iVar.f8635d)) {
                Log.d("Sqflite", iVar.A() + "closing database ");
            }
            iVar.k();
        } catch (Exception e10) {
            Log.e("Sqflite", "error " + e10 + " while closing database " + f8605k);
        }
        synchronized (f8599e) {
            try {
                if (f8598d.isEmpty() && f8606l != null) {
                    if (q.b(iVar.f8635d)) {
                        Log.d("Sqflite", iVar.A() + "stopping thread");
                    }
                    f8606l.c();
                    f8606l = null;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final i m(int i10) {
        return (i) f8598d.get(Integer.valueOf(i10));
    }

    public final i n(MethodCall methodCall, MethodChannel.Result result) {
        int iIntValue = ((Integer) methodCall.argument("id")).intValue();
        i iVarM = m(iIntValue);
        if (iVarM != null) {
            return iVarM;
        }
        result.error("sqlite_error", "database_closed " + iIntValue, null);
        return null;
    }

    @Override // io.flutter.embedding.engine.plugins.FlutterPlugin
    public void onAttachedToEngine(FlutterPlugin.FlutterPluginBinding flutterPluginBinding) {
        q(flutterPluginBinding.getApplicationContext(), flutterPluginBinding.getBinaryMessenger());
    }

    @Override // io.flutter.embedding.engine.plugins.FlutterPlugin
    public void onDetachedFromEngine(FlutterPlugin.FlutterPluginBinding flutterPluginBinding) {
        this.f8607a = null;
        this.f8608b.setMethodCallHandler(null);
        this.f8608b = null;
    }

    @Override // io.flutter.plugin.common.MethodChannel.MethodCallHandler
    public void onMethodCall(MethodCall methodCall, MethodChannel.Result result) {
        String str = methodCall.method;
        str.getClass();
        switch (str) {
            case "execute":
                x(methodCall, result);
                break;
            case "closeDatabase":
                s(methodCall, result);
                break;
            case "options":
                B(methodCall, result);
                break;
            case "insert":
                z(methodCall, result);
                break;
            case "update":
                F(methodCall, result);
                break;
            case "androidSetLocale":
                E(methodCall, result);
                break;
            case "deleteDatabase":
                w(methodCall, result);
                break;
            case "debugMode":
                v(methodCall, result);
                break;
            case "openDatabase":
                A(methodCall, result);
                break;
            case "batch":
                r(methodCall, result);
                break;
            case "debug":
                u(methodCall, result);
                break;
            case "query":
                C(methodCall, result);
                break;
            case "databaseExists":
                t(methodCall, result);
                break;
            case "queryCursorNext":
                D(methodCall, result);
                break;
            case "getPlatformVersion":
                result.success("Android " + Build.VERSION.RELEASE);
                break;
            case "getDatabasesPath":
                y(methodCall, result);
                break;
            default:
                result.notImplemented();
                break;
        }
    }

    public final void r(final MethodCall methodCall, final MethodChannel.Result result) {
        final i iVarN = n(methodCall, result);
        if (iVarN == null) {
            return;
        }
        f8606l.a(iVarN, new Runnable() { // from class: La.A
            @Override // java.lang.Runnable
            public final void run() {
                iVarN.h(methodCall, result);
            }
        });
    }

    public final void s(MethodCall methodCall, MethodChannel.Result result) {
        Integer num = (Integer) methodCall.argument("id");
        int iIntValue = num.intValue();
        i iVarN = n(methodCall, result);
        if (iVarN == null) {
            return;
        }
        if (q.b(iVarN.f8635d)) {
            Log.d("Sqflite", iVarN.A() + "closing " + iIntValue + StringUtils.SPACE + iVarN.f8633b);
        }
        String str = iVarN.f8633b;
        synchronized (f8599e) {
            try {
                f8598d.remove(num);
                if (iVarN.f8632a) {
                    f8597c.remove(str);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        f8606l.a(iVarN, new a(iVarN, result));
    }

    public final void t(MethodCall methodCall, MethodChannel.Result result) {
        result.success(Boolean.valueOf(i.x((String) methodCall.argument("path"))));
    }

    public final void u(MethodCall methodCall, MethodChannel.Result result) {
        String str = (String) methodCall.argument("cmd");
        HashMap map = new HashMap();
        if ("get".equals(str)) {
            int i10 = f8601g;
            if (i10 > 0) {
                map.put("logLevel", Integer.valueOf(i10));
            }
            Map map2 = f8598d;
            if (!map2.isEmpty()) {
                HashMap map3 = new HashMap();
                for (Map.Entry entry : map2.entrySet()) {
                    i iVar = (i) entry.getValue();
                    HashMap map4 = new HashMap();
                    map4.put("path", iVar.f8633b);
                    map4.put("singleInstance", Boolean.valueOf(iVar.f8632a));
                    int i11 = iVar.f8635d;
                    if (i11 > 0) {
                        map4.put("logLevel", Integer.valueOf(i11));
                    }
                    map3.put(((Integer) entry.getKey()).toString(), map4);
                }
                map.put("databases", map3);
            }
        }
        result.success(map);
    }

    public final void v(MethodCall methodCall, MethodChannel.Result result) {
        Ma.a.f9422a = Boolean.TRUE.equals(methodCall.arguments());
        Ma.a.f9424c = Ma.a.f9423b && Ma.a.f9422a;
        if (!Ma.a.f9422a) {
            f8601g = 0;
        } else if (Ma.a.f9424c) {
            f8601g = 2;
        } else if (Ma.a.f9422a) {
            f8601g = 1;
        }
        result.success(null);
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x0098  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void w(io.flutter.plugin.common.MethodCall r9, io.flutter.plugin.common.MethodChannel.Result r10) {
        /*
            r8 = this;
            java.lang.String r0 = "path"
            java.lang.Object r9 = r9.argument(r0)
            java.lang.String r9 = (java.lang.String) r9
            java.lang.Object r0 = La.B.f8599e
            monitor-enter(r0)
            int r1 = La.B.f8601g     // Catch: java.lang.Throwable -> L38
            boolean r1 = La.q.c(r1)     // Catch: java.lang.Throwable -> L38
            if (r1 == 0) goto L3a
            java.lang.String r1 = "Sqflite"
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L38
            r2.<init>()     // Catch: java.lang.Throwable -> L38
            java.lang.String r3 = "Look for "
            r2.append(r3)     // Catch: java.lang.Throwable -> L38
            r2.append(r9)     // Catch: java.lang.Throwable -> L38
            java.lang.String r3 = " in "
            r2.append(r3)     // Catch: java.lang.Throwable -> L38
            java.util.Map r3 = La.B.f8597c     // Catch: java.lang.Throwable -> L38
            java.util.Set r3 = r3.keySet()     // Catch: java.lang.Throwable -> L38
            r2.append(r3)     // Catch: java.lang.Throwable -> L38
            java.lang.String r2 = r2.toString()     // Catch: java.lang.Throwable -> L38
            android.util.Log.d(r1, r2)     // Catch: java.lang.Throwable -> L38
            goto L3a
        L38:
            r8 = move-exception
            goto Lab
        L3a:
            java.util.Map r1 = La.B.f8597c     // Catch: java.lang.Throwable -> L38
            java.lang.Object r2 = r1.get(r9)     // Catch: java.lang.Throwable -> L38
            java.lang.Integer r2 = (java.lang.Integer) r2     // Catch: java.lang.Throwable -> L38
            if (r2 == 0) goto L98
            java.util.Map r3 = La.B.f8598d     // Catch: java.lang.Throwable -> L38
            java.lang.Object r4 = r3.get(r2)     // Catch: java.lang.Throwable -> L38
            La.i r4 = (La.i) r4     // Catch: java.lang.Throwable -> L38
            if (r4 == 0) goto L98
            android.database.sqlite.SQLiteDatabase r5 = r4.f8640i     // Catch: java.lang.Throwable -> L38
            boolean r5 = r5.isOpen()     // Catch: java.lang.Throwable -> L38
            if (r5 == 0) goto L98
            int r5 = La.B.f8601g     // Catch: java.lang.Throwable -> L38
            boolean r5 = La.q.c(r5)     // Catch: java.lang.Throwable -> L38
            if (r5 == 0) goto L91
            java.lang.String r5 = "Sqflite"
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L38
            r6.<init>()     // Catch: java.lang.Throwable -> L38
            java.lang.String r7 = r4.A()     // Catch: java.lang.Throwable -> L38
            r6.append(r7)     // Catch: java.lang.Throwable -> L38
            java.lang.String r7 = "found single instance "
            r6.append(r7)     // Catch: java.lang.Throwable -> L38
            boolean r7 = r4.F()     // Catch: java.lang.Throwable -> L38
            if (r7 == 0) goto L7a
            java.lang.String r7 = "(in transaction) "
            goto L7c
        L7a:
            java.lang.String r7 = ""
        L7c:
            r6.append(r7)     // Catch: java.lang.Throwable -> L38
            r6.append(r2)     // Catch: java.lang.Throwable -> L38
            java.lang.String r7 = " "
            r6.append(r7)     // Catch: java.lang.Throwable -> L38
            r6.append(r9)     // Catch: java.lang.Throwable -> L38
            java.lang.String r6 = r6.toString()     // Catch: java.lang.Throwable -> L38
            android.util.Log.d(r5, r6)     // Catch: java.lang.Throwable -> L38
        L91:
            r3.remove(r2)     // Catch: java.lang.Throwable -> L38
            r1.remove(r9)     // Catch: java.lang.Throwable -> L38
            goto L99
        L98:
            r4 = 0
        L99:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L38
            La.B$b r0 = new La.B$b
            r0.<init>(r4, r9, r10)
            La.n r8 = La.B.f8606l
            if (r8 == 0) goto La7
            r8.a(r4, r0)
            return
        La7:
            r0.run()
            return
        Lab:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L38
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: La.B.w(io.flutter.plugin.common.MethodCall, io.flutter.plugin.common.MethodChannel$Result):void");
    }

    public final void x(final MethodCall methodCall, final MethodChannel.Result result) {
        final i iVarN = n(methodCall, result);
        if (iVarN == null) {
            return;
        }
        f8606l.a(iVarN, new Runnable() { // from class: La.y
            @Override // java.lang.Runnable
            public final void run() {
                iVarN.v(new Na.d(methodCall, result));
            }
        });
    }

    public void y(MethodCall methodCall, MethodChannel.Result result) {
        if (f8602h == null) {
            f8602h = this.f8607a.getDatabasePath("tekartik_sqflite.db").getParent();
        }
        result.success(f8602h);
    }

    public final void z(final MethodCall methodCall, final MethodChannel.Result result) {
        final i iVarN = n(methodCall, result);
        if (iVarN == null) {
            return;
        }
        f8606l.a(iVarN, new Runnable() { // from class: La.u
            @Override // java.lang.Runnable
            public final void run() {
                iVarN.E(new Na.d(methodCall, result));
            }
        });
    }
}
