package com.google.firebase.remoteconfig.internal;

import B6.j;
import P8.h;
import P8.m;
import android.content.Context;
import android.content.pm.PackageManager;
import android.util.Log;
import b7.InterfaceC2869c;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import h8.C4288f;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Random;
import java.util.Set;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import k9.AbstractC4814b;
import k9.p;
import k9.q;
import org.apache.tika.metadata.HttpHeaders;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public class d {

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final int[] f31943t = {2, 4, 8, 16, 32, 64, 128, 256};

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public static final Pattern f31944u = Pattern.compile("^[^:]+:([0-9]+):(android|ios|web):([0-9a-f]+)");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Set f31945a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f31947c;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public HttpURLConnection f31950f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public com.google.firebase.remoteconfig.internal.a f31951g;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final ScheduledExecutorService f31953i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final c f31954j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final C4288f f31955k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final h f31956l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public l9.e f31957m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final Context f31958n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final String f31959o;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final e f31962r;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final int f31952h = 8;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f31946b = false;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final Random f31960p = new Random();

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final B6.e f31961q = B6.h.d();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f31948d = false;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f31949e = false;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final Object f31963s = new Object();

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public class a implements Runnable {
        public a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            d.this.e();
        }
    }

    public d(C4288f c4288f, h hVar, c cVar, l9.e eVar, Context context, String str, Set set, e eVar2, ScheduledExecutorService scheduledExecutorService) {
        this.f31945a = set;
        this.f31953i = scheduledExecutorService;
        this.f31947c = Math.max(8 - eVar2.i().b(), 1);
        this.f31955k = c4288f;
        this.f31954j = cVar;
        this.f31956l = hVar;
        this.f31957m = eVar;
        this.f31958n = context;
        this.f31959o = str;
        this.f31962r = eVar2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00c1 A[Catch: all -> 0x0044, TryCatch #1 {all -> 0x0044, blocks: (B:9:0x0030, B:47:0x00bd, B:49:0x00c1, B:50:0x00c5), top: B:88:0x0030 }] */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00c5 A[Catch: all -> 0x0044, TRY_LEAVE, TryCatch #1 {all -> 0x0044, blocks: (B:9:0x0030, B:47:0x00bd, B:49:0x00c1, B:50:0x00c5), top: B:88:0x0030 }] */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00e3  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00e6  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x010b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static /* synthetic */ com.google.android.gms.tasks.Task a(com.google.firebase.remoteconfig.internal.d r10, com.google.android.gms.tasks.Task r11, com.google.android.gms.tasks.Task r12) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 390
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.remoteconfig.internal.d.a(com.google.firebase.remoteconfig.internal.d, com.google.android.gms.tasks.Task, com.google.android.gms.tasks.Task):com.google.android.gms.tasks.Task");
    }

    public static /* synthetic */ Task b(d dVar, Task task, Task task2, Task task3) {
        dVar.getClass();
        if (!task.q()) {
            return Tasks.d(new p("Firebase Installations failed to get installation auth token for config update listener connection.", task.l()));
        }
        if (!task2.q()) {
            return Tasks.d(new p("Firebase Installations failed to get installation ID for config update listener connection.", task2.l()));
        }
        try {
            HttpURLConnection httpURLConnection = (HttpURLConnection) dVar.q().openConnection();
            dVar.A(httpURLConnection, (String) task2.m(), ((m) task.m()).b());
            return Tasks.e(httpURLConnection);
        } catch (IOException e10) {
            return Tasks.d(new p("Failed to open HTTP stream connection", e10));
        }
    }

    public static String m(String str) {
        Matcher matcher = f31944u.matcher(str);
        if (matcher.matches()) {
            return matcher.group(1);
        }
        return null;
    }

    public void A(HttpURLConnection httpURLConnection, String str, String str2) throws IOException {
        httpURLConnection.setRequestMethod("POST");
        x(httpURLConnection, str2);
        byte[] bytes = k(str).toString().getBytes("utf-8");
        BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(httpURLConnection.getOutputStream());
        bufferedOutputStream.write(bytes);
        bufferedOutputStream.flush();
        bufferedOutputStream.close();
    }

    public synchronized com.google.firebase.remoteconfig.internal.a B(HttpURLConnection httpURLConnection) {
        return new com.google.firebase.remoteconfig.internal.a(httpURLConnection, this.f31954j, this.f31957m, this.f31945a, new b(), this.f31953i, this.f31962r);
    }

    public void C() {
        s(0L);
    }

    public final void D(Date date) {
        int iB = this.f31962r.i().b() + 1;
        this.f31962r.r(iB, new Date(date.getTime() + o(iB)));
    }

    public void e() {
        if (g()) {
            if (new Date(this.f31961q.a()).before(this.f31962r.i().a())) {
                w();
            } else {
                final Task taskJ = j();
                Tasks.j(taskJ).j(this.f31953i, new InterfaceC2869c() { // from class: l9.n
                    @Override // b7.InterfaceC2869c
                    public final Object a(Task task) {
                        return com.google.firebase.remoteconfig.internal.d.a(this.f39979a, taskJ, task);
                    }
                });
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0019  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final synchronized boolean f() {
        /*
            r1 = this;
            monitor-enter(r1)
            java.util.Set r0 = r1.f31945a     // Catch: java.lang.Throwable -> L17
            boolean r0 = r0.isEmpty()     // Catch: java.lang.Throwable -> L17
            if (r0 != 0) goto L19
            boolean r0 = r1.f31946b     // Catch: java.lang.Throwable -> L17
            if (r0 != 0) goto L19
            boolean r0 = r1.f31948d     // Catch: java.lang.Throwable -> L17
            if (r0 != 0) goto L19
            boolean r0 = r1.f31949e     // Catch: java.lang.Throwable -> L17
            if (r0 != 0) goto L19
            r0 = 1
            goto L1a
        L17:
            r0 = move-exception
            goto L1c
        L19:
            r0 = 0
        L1a:
            monitor-exit(r1)
            return r0
        L1c:
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L17
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.remoteconfig.internal.d.f():boolean");
    }

    public final synchronized boolean g() {
        boolean zF;
        zF = f();
        if (zF) {
            y(true);
        }
        return zF;
    }

    public final void h(InputStream inputStream) {
        if (inputStream != null) {
            try {
                inputStream.close();
            } catch (IOException e10) {
                Log.d("FirebaseRemoteConfig", "Error closing connection stream.", e10);
            }
        }
    }

    public void i(InputStream inputStream, InputStream inputStream2) {
        HttpURLConnection httpURLConnection = this.f31950f;
        if (httpURLConnection != null && !this.f31949e) {
            httpURLConnection.disconnect();
        }
        h(inputStream);
        h(inputStream2);
    }

    public Task j() {
        final Task taskA = this.f31956l.a(false);
        final Task id2 = this.f31956l.getId();
        return Tasks.j(taskA, id2).k(this.f31953i, new InterfaceC2869c() { // from class: l9.o
            @Override // b7.InterfaceC2869c
            public final Object a(Task task) {
                return com.google.firebase.remoteconfig.internal.d.b(this.f39981a, taskA, id2, task);
            }
        });
    }

    public final JSONObject k(String str) {
        HashMap map = new HashMap();
        map.put("project", m(this.f31955k.r().c()));
        map.put("namespace", this.f31959o);
        map.put("lastKnownVersionNumber", Long.toString(this.f31954j.r()));
        map.put("appId", this.f31955k.r().c());
        map.put("sdkVersion", "23.0.1");
        map.put("appInstanceId", str);
        return new JSONObject(map);
    }

    public final synchronized void l() {
        this.f31948d = true;
    }

    public final String n() {
        try {
            Context context = this.f31958n;
            byte[] bArrA = B6.a.a(context, context.getPackageName());
            if (bArrA != null) {
                return j.b(bArrA, false);
            }
            Log.e("FirebaseRemoteConfig", "Could not get fingerprint hash for package: " + this.f31958n.getPackageName());
            return null;
        } catch (PackageManager.NameNotFoundException unused) {
            Log.i("FirebaseRemoteConfig", "No such package: " + this.f31958n.getPackageName());
            return null;
        }
    }

    public final long o(int i10) {
        int length = f31943t.length;
        if (i10 >= length) {
            i10 = length;
        }
        long millis = TimeUnit.MINUTES.toMillis(r0[i10 - 1]);
        return (millis / 2) + ((long) this.f31960p.nextInt((int) millis));
    }

    public final String p(String str) {
        return String.format("https://firebaseremoteconfigrealtime.googleapis.com/v1/projects/%s/namespaces/%s:streamFetchInvalidations", m(this.f31955k.r().c()), str);
    }

    public final URL q() {
        try {
            return new URL(p(this.f31959o));
        } catch (MalformedURLException unused) {
            Log.e("FirebaseRemoteConfig", "URL is malformed");
            return null;
        }
    }

    public final boolean r(int i10) {
        return i10 == 408 || i10 == 429 || i10 == 502 || i10 == 503 || i10 == 504;
    }

    public final synchronized void s(long j10) {
        try {
            if (f()) {
                int i10 = this.f31947c;
                if (i10 > 0) {
                    this.f31947c = i10 - 1;
                    this.f31953i.schedule(new a(), j10, TimeUnit.MILLISECONDS);
                } else if (!this.f31949e) {
                    u(new p("Unable to connect to the server. Check your connection and try again.", q.a.CONFIG_UPDATE_STREAM_ERROR));
                }
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public final String t(InputStream inputStream) {
        StringBuilder sb2 = new StringBuilder();
        try {
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream));
            while (true) {
                String line = bufferedReader.readLine();
                if (line == null) {
                    break;
                }
                sb2.append(line);
            }
        } catch (IOException unused) {
            if (sb2.length() == 0) {
                return "Unable to connect to the server, access is forbidden. HTTP status code: 403";
            }
        }
        return sb2.toString();
    }

    public final synchronized void u(q qVar) {
        Iterator it = this.f31945a.iterator();
        while (it.hasNext()) {
            ((k9.c) it.next()).onError(qVar);
        }
    }

    public final synchronized void v() {
        this.f31947c = 8;
    }

    public synchronized void w() {
        s(Math.max(0L, this.f31962r.i().a().getTime() - new Date(this.f31961q.a()).getTime()));
    }

    public final void x(HttpURLConnection httpURLConnection, String str) {
        httpURLConnection.setRequestProperty("X-Goog-Firebase-Installations-Auth", str);
        httpURLConnection.setRequestProperty("X-Goog-Api-Key", this.f31955k.r().b());
        httpURLConnection.setRequestProperty("X-Android-Package", this.f31958n.getPackageName());
        httpURLConnection.setRequestProperty("X-Android-Cert", n());
        httpURLConnection.setRequestProperty("X-Google-GFE-Can-Retry", "yes");
        httpURLConnection.setRequestProperty("X-Accept-Response-Streaming", "true");
        httpURLConnection.setRequestProperty(HttpHeaders.CONTENT_TYPE, "application/json");
        httpURLConnection.setRequestProperty("Accept", "application/json");
    }

    public final synchronized void y(boolean z10) {
        this.f31946b = z10;
    }

    public void z(boolean z10) {
        HttpURLConnection httpURLConnection;
        synchronized (this.f31963s) {
            try {
                this.f31949e = z10;
                com.google.firebase.remoteconfig.internal.a aVar = this.f31951g;
                if (aVar != null) {
                    aVar.k(z10);
                }
                if (z10 && (httpURLConnection = this.f31950f) != null) {
                    httpURLConnection.disconnect();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public class b implements k9.c {
        public b() {
        }

        @Override // k9.c
        public void onError(q qVar) {
            d.this.l();
            d.this.u(qVar);
        }

        @Override // k9.c
        public void onUpdate(AbstractC4814b abstractC4814b) {
        }
    }
}
