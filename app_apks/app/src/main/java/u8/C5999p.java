package u8;

import android.app.ActivityManager;
import android.app.ApplicationExitInfo;
import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.os.Environment;
import android.os.StatFs;
import android.util.Base64;
import b7.C2878l;
import b7.InterfaceC2877k;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import com.google.android.libraries.barhopper.RecognitionOptions;
import io.flutter.plugins.firebase.crashlytics.Constants;
import io.sentry.SentryBaseEvent;
import io.sentry.cache.EnvelopeCache;
import io.sentry.protocol.App;
import io.sentry.protocol.Device;
import io.sentry.protocol.OperatingSystem;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FilenameFilter;
import java.io.IOException;
import java.io.InputStream;
import java.lang.Thread;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.SortedSet;
import java.util.concurrent.Callable;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicBoolean;
import org.apache.tika.parser.external.ExternalParsersConfigReaderMetKeys;
import q9.C5508a;
import r8.InterfaceC5672a;
import s8.InterfaceC5810a;
import u8.F;
import v8.AbstractC6073b;
import w8.C6166c;
import w8.C6169f;
import x8.F;
import x8.G;

/* JADX INFO: renamed from: u8.p, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public class C5999p {

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final FilenameFilter f45348t = new FilenameFilter() { // from class: u8.o
        @Override // java.io.FilenameFilter
        public final boolean accept(File file, String str) {
            return str.startsWith(".ae");
        }
    };

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public static final Charset f45349u = Charset.forName("UTF-8");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f45350a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final H f45351b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final C f45352c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final w8.p f45353d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final v8.i f45354e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final M f45355f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final A8.g f45356g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final C5984a f45357h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final C6169f f45358i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final InterfaceC5672a f45359j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final InterfaceC5810a f45360k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final C5996m f45361l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final W f45362m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public F f45363n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public C8.j f45364o = null;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final C2878l f45365p = new C2878l();

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final C2878l f45366q = new C2878l();

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final C2878l f45367r = new C2878l();

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final AtomicBoolean f45368s = new AtomicBoolean(false);

    /* JADX INFO: renamed from: u8.p$a */
    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public class a implements F.a {
        public a() {
        }

        @Override // u8.F.a
        public void a(C8.j jVar, Thread thread, Throwable th) throws Throwable {
            C5999p.this.I(jVar, thread, th);
        }
    }

    /* JADX INFO: renamed from: u8.p$b */
    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public class b implements Callable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ long f45370a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Throwable f45371b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ Thread f45372c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ C8.j f45373d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final /* synthetic */ boolean f45374e;

        /* JADX INFO: renamed from: u8.p$b$a */
        /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
        public class a implements InterfaceC2877k {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final /* synthetic */ String f45376a;

            public a(String str) {
                this.f45376a = str;
            }

            @Override // b7.InterfaceC2877k
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public Task a(C8.d dVar) {
                if (dVar != null) {
                    return Tasks.g(C5999p.this.N(), C5999p.this.f45362m.z(C5999p.this.f45354e.f45901a, b.this.f45374e ? this.f45376a : null));
                }
                r8.g.f().k("Received null app settings, cannot send reports at crash time.");
                return Tasks.e(null);
            }
        }

        public b(long j10, Throwable th, Thread thread, C8.j jVar, boolean z10) {
            this.f45370a = j10;
            this.f45371b = th;
            this.f45372c = thread;
            this.f45373d = jVar;
            this.f45374e = z10;
        }

        @Override // java.util.concurrent.Callable
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Task call() {
            long jG = C5999p.G(this.f45370a);
            String strC = C5999p.this.C();
            if (strC == null) {
                r8.g.f().d("Tried to write a fatal exception while no session was open.");
                return Tasks.e(null);
            }
            C5999p.this.f45352c.a();
            C5999p.this.f45362m.u(this.f45371b, this.f45372c, strC, jG);
            C5999p.this.x(this.f45370a);
            C5999p.this.u(this.f45373d);
            C5999p.this.w(new C5991h().c(), Boolean.valueOf(this.f45374e));
            return !C5999p.this.f45351b.d() ? Tasks.e(null) : this.f45373d.a().s(C5999p.this.f45354e.f45901a, new a(strC));
        }
    }

    /* JADX INFO: renamed from: u8.p$c */
    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public class c implements InterfaceC2877k {
        public c() {
        }

        @Override // b7.InterfaceC2877k
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public Task a(Void r12) {
            return Tasks.e(Boolean.TRUE);
        }
    }

    /* JADX INFO: renamed from: u8.p$d */
    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public class d implements InterfaceC2877k {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Task f45379a;

        /* JADX INFO: renamed from: u8.p$d$a */
        /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
        public class a implements InterfaceC2877k {
            public a() {
            }

            @Override // b7.InterfaceC2877k
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public Task a(C8.d dVar) {
                if (dVar == null) {
                    r8.g.f().k("Received null app settings at app startup. Cannot send cached reports");
                    return Tasks.e(null);
                }
                C5999p.this.N();
                C5999p.this.f45362m.y(C5999p.this.f45354e.f45901a);
                C5999p.this.f45367r.e(null);
                return Tasks.e(null);
            }
        }

        public d(Task task) {
            this.f45379a = task;
        }

        @Override // b7.InterfaceC2877k
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public Task a(Boolean bool) {
            if (bool.booleanValue()) {
                r8.g.f().b("Sending cached crash reports...");
                C5999p.this.f45351b.c(bool.booleanValue());
                return this.f45379a.s(C5999p.this.f45354e.f45901a, new a());
            }
            r8.g.f().i("Deleting cached crash reports...");
            C5999p.r(C5999p.this.L());
            C5999p.this.f45362m.x();
            C5999p.this.f45367r.e(null);
            return Tasks.e(null);
        }
    }

    /* JADX INFO: renamed from: u8.p$e */
    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public class e implements Callable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ long f45382a;

        public e(long j10) {
            this.f45382a = j10;
        }

        @Override // java.util.concurrent.Callable
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Void call() {
            Bundle bundle = new Bundle();
            bundle.putInt(Constants.FATAL, 1);
            bundle.putLong("timestamp", this.f45382a);
            C5999p.this.f45360k.a(Constants.FIREBASE_APPLICATION_EXCEPTION, bundle);
            return null;
        }
    }

    public C5999p(Context context, M m10, H h10, A8.g gVar, C c10, C5984a c5984a, w8.p pVar, C6169f c6169f, W w10, InterfaceC5672a interfaceC5672a, InterfaceC5810a interfaceC5810a, C5996m c5996m, v8.i iVar) {
        this.f45350a = context;
        this.f45355f = m10;
        this.f45351b = h10;
        this.f45356g = gVar;
        this.f45352c = c10;
        this.f45357h = c5984a;
        this.f45353d = pVar;
        this.f45358i = c6169f;
        this.f45359j = interfaceC5672a;
        this.f45360k = interfaceC5810a;
        this.f45361l = c5996m;
        this.f45362m = w10;
        this.f45354e = iVar;
    }

    public static boolean B() {
        try {
            Class.forName("com.google.firebase.crash.FirebaseCrash");
            return true;
        } catch (ClassNotFoundException unused) {
            return false;
        }
    }

    public static long D() {
        return G(System.currentTimeMillis());
    }

    public static List E(r8.h hVar, String str, A8.g gVar, byte[] bArr) {
        File fileQ = gVar.q(str, "user-data");
        File fileQ2 = gVar.q(str, "keys");
        File fileQ3 = gVar.q(str, "rollouts-state");
        ArrayList arrayList = new ArrayList();
        arrayList.add(new C5990g("logs_file", "logs", bArr));
        arrayList.add(new K("crash_meta_file", ExternalParsersConfigReaderMetKeys.METADATA_TAG, hVar.d()));
        arrayList.add(new K("session_meta_file", EnvelopeCache.PREFIX_CURRENT_SESSION_FILE, hVar.g()));
        arrayList.add(new K("app_meta_file", App.TYPE, hVar.e()));
        arrayList.add(new K("device_meta_file", Device.TYPE, hVar.a()));
        arrayList.add(new K("os_meta_file", OperatingSystem.TYPE, hVar.f()));
        arrayList.add(Q(hVar));
        arrayList.add(new K("user_meta_file", SentryBaseEvent.JsonKeys.USER, fileQ));
        arrayList.add(new K("keys_file", "keys", fileQ2));
        arrayList.add(new K("rollouts_file", "rollouts", fileQ3));
        return arrayList;
    }

    public static long G(long j10) {
        return j10 / 1000;
    }

    public static boolean P(String str, File file, F.a aVar) {
        if (file == null || !file.exists()) {
            r8.g.f().k("No minidump data found for session " + str);
        }
        if (aVar == null) {
            r8.g.f().g("No Tombstones data found for session " + str);
        }
        return (file == null || !file.exists()) && aVar == null;
    }

    public static P Q(r8.h hVar) {
        File fileC = hVar.c();
        return (fileC == null || !fileC.exists()) ? new C5990g("minidump_file", "minidump", new byte[]{0}) : new K("minidump_file", "minidump", fileC);
    }

    public static byte[] S(InputStream inputStream) throws IOException {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            byte[] bArr = new byte[RecognitionOptions.UPC_E];
            while (true) {
                int i10 = inputStream.read(bArr);
                if (i10 == -1) {
                    byte[] byteArray = byteArrayOutputStream.toByteArray();
                    byteArrayOutputStream.close();
                    return byteArray;
                }
                byteArrayOutputStream.write(bArr, 0, i10);
            }
        } catch (Throwable th) {
            try {
                byteArrayOutputStream.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    public static G.a o(M m10, C5984a c5984a) {
        return G.a.b(m10.f(), c5984a.f45318f, c5984a.f45319g, m10.a().c(), I.b(c5984a.f45316d).j(), c5984a.f45320h);
    }

    public static G.b p(Context context) {
        StatFs statFs = new StatFs(Environment.getDataDirectory().getPath());
        return G.b.c(C5992i.k(), Build.MODEL, Runtime.getRuntime().availableProcessors(), C5992i.b(context), ((long) statFs.getBlockCount()) * ((long) statFs.getBlockSize()), C5992i.x(), C5992i.l(), Build.MANUFACTURER, Build.PRODUCT);
    }

    public static G.c q() {
        return G.c.a(Build.VERSION.RELEASE, Build.VERSION.CODENAME, C5992i.y());
    }

    public static void r(List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            ((File) it.next()).delete();
        }
    }

    public boolean A(C8.j jVar) {
        v8.i.c();
        if (K()) {
            r8.g.f().k("Skipping session finalization because a crash has already occurred.");
            return false;
        }
        r8.g.f().i("Finalizing previously open sessions.");
        try {
            v(true, jVar, true);
            r8.g.f().i("Closed all previously open sessions.");
            return true;
        } catch (Exception e10) {
            r8.g.f().e("Unable to finalize previously open sessions.", e10);
            return false;
        }
    }

    public final String C() {
        SortedSet sortedSetQ = this.f45362m.q();
        if (sortedSetQ.isEmpty()) {
            return null;
        }
        return (String) sortedSetQ.first();
    }

    public final InputStream F(String str) {
        ClassLoader classLoader = getClass().getClassLoader();
        if (classLoader != null) {
            return classLoader.getResourceAsStream(str);
        }
        r8.g.f().k("Couldn't get Class Loader");
        return null;
    }

    public String H() throws IOException {
        String strR = C5992i.r(this.f45350a);
        if (strR != null) {
            r8.g.f().b("Read version control info from string resource");
            return Base64.encodeToString(strR.getBytes(f45349u), 0);
        }
        InputStream inputStreamF = F("META-INF/version-control-info.textproto");
        if (inputStreamF == null) {
            if (inputStreamF != null) {
                inputStreamF.close();
            }
            r8.g.f().g("No version control information found");
            return null;
        }
        try {
            r8.g.f().b("Read version control info from file");
            String strEncodeToString = Base64.encodeToString(S(inputStreamF), 0);
            inputStreamF.close();
            return strEncodeToString;
        } catch (Throwable th) {
            try {
                inputStreamF.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    public void I(C8.j jVar, Thread thread, Throwable th) throws Throwable {
        J(jVar, thread, th, false);
    }

    public synchronized void J(C8.j jVar, Thread thread, Throwable th, boolean z10) throws Throwable {
        C5999p c5999p;
        Throwable th2;
        try {
        } catch (Throwable th3) {
            th = th3;
        }
        try {
            r8.g.f().b("Handling uncaught exception \"" + th + "\" from thread " + thread.getName());
            if (!z10) {
                try {
                    C5508a.b();
                } catch (Throwable th4) {
                    th2 = th4;
                    c5999p = this;
                    throw th2;
                }
            }
            c5999p = this;
            Task taskF = this.f45354e.f45901a.f(c5999p.new b(System.currentTimeMillis(), th, thread, jVar, z10));
            if (!z10) {
                try {
                    Z.b(taskF);
                } catch (TimeoutException unused) {
                    r8.g.f().d("Cannot send reports. Timed out while fetching settings.");
                } catch (Exception e10) {
                    r8.g.f().e("Error handling uncaught exception", e10);
                }
            }
        } catch (Throwable th5) {
            th = th5;
            c5999p = this;
            th2 = th;
            throw th2;
        }
    }

    public boolean K() {
        F f10 = this.f45363n;
        return f10 != null && f10.a();
    }

    public List L() {
        return this.f45356g.h(f45348t);
    }

    public final Task M(long j10) {
        if (B()) {
            r8.g.f().k("Skipping logging Crashlytics event to Firebase, FirebaseCrash exists");
            return Tasks.e(null);
        }
        r8.g.f().b("Logging app exception event to Firebase Analytics");
        return Tasks.b(new ScheduledThreadPoolExecutor(1), new e(j10));
    }

    public final Task N() {
        ArrayList arrayList = new ArrayList();
        for (File file : L()) {
            try {
                arrayList.add(M(Long.parseLong(file.getName().substring(3))));
            } catch (NumberFormatException unused) {
                r8.g.f().k("Could not parse app exception timestamp from file " + file.getName());
            }
            file.delete();
        }
        return Tasks.f(arrayList);
    }

    public void O(Thread thread, Throwable th) {
        C8.j jVar = this.f45364o;
        if (jVar == null) {
            r8.g.f().k("settingsProvider not set");
        } else {
            J(jVar, thread, th, true);
        }
    }

    public void R(final String str) {
        this.f45354e.f45901a.e(new Runnable() { // from class: u8.n
            @Override // java.lang.Runnable
            public final void run() {
                this.f45346a.w(str, Boolean.FALSE);
            }
        });
    }

    public void T() {
        try {
            String strH = H();
            if (strH != null) {
                W("com.crashlytics.version-control-info", strH);
                r8.g.f().g("Saved version control info");
            }
        } catch (IOException e10) {
            r8.g.f().l("Unable to save version control info", e10);
        }
    }

    public Task U() {
        this.f45366q.e(Boolean.TRUE);
        return this.f45367r.a();
    }

    public void V(String str, String str2) {
        try {
            this.f45353d.n(str, str2);
        } catch (IllegalArgumentException e10) {
            Context context = this.f45350a;
            if (context != null && C5992i.v(context)) {
                throw e10;
            }
            r8.g.f().d("Attempting to set custom attribute with null key, ignoring.");
        }
    }

    public void W(String str, String str2) {
        try {
            this.f45353d.o(str, str2);
        } catch (IllegalArgumentException e10) {
            Context context = this.f45350a;
            if (context != null && C5992i.v(context)) {
                throw e10;
            }
            r8.g.f().d("Attempting to set custom attribute with null key, ignoring.");
        }
    }

    public void X(String str) {
        this.f45353d.q(str);
    }

    public void Y(Task task) {
        if (this.f45362m.p()) {
            r8.g.f().i("Crash reports are available to be sent.");
            Z().s(this.f45354e.f45901a, new d(task));
        } else {
            r8.g.f().i("No crash reports are available to be sent.");
            this.f45365p.e(Boolean.FALSE);
        }
    }

    public final Task Z() {
        if (this.f45351b.d()) {
            r8.g.f().b("Automatic data collection is enabled. Allowing upload.");
            this.f45365p.e(Boolean.FALSE);
            return Tasks.e(Boolean.TRUE);
        }
        r8.g.f().b("Automatic data collection is disabled.");
        r8.g.f().i("Notifying that unsent reports are available.");
        this.f45365p.e(Boolean.TRUE);
        Task taskR = this.f45351b.j().r(new c());
        r8.g.f().b("Waiting for send/deleteUnsentReports to be called.");
        return AbstractC6073b.b(taskR, this.f45366q.a());
    }

    public final void a0(String str) {
        List<ApplicationExitInfo> historicalProcessExitReasons = ((ActivityManager) this.f45350a.getSystemService("activity")).getHistoricalProcessExitReasons(null, 0, 0);
        if (historicalProcessExitReasons.size() != 0) {
            this.f45362m.w(str, historicalProcessExitReasons, new C6169f(this.f45356g, str), w8.p.k(str, this.f45356g, this.f45354e));
        } else {
            r8.g.f().i("No ApplicationExitInfo available. Session: " + str);
        }
    }

    public void b0(Thread thread, Throwable th, Map map) {
        long jCurrentTimeMillis = System.currentTimeMillis();
        if (K()) {
            return;
        }
        long jG = G(jCurrentTimeMillis);
        String strC = C();
        if (strC == null) {
            r8.g.f().k("Tried to write a non-fatal exception while no session was open.");
        } else {
            this.f45362m.v(th, thread, new C6166c(strC, jG, map));
        }
    }

    public void c0(long j10, String str) {
        if (K()) {
            return;
        }
        this.f45358i.g(j10, str);
    }

    public Task n() {
        if (this.f45368s.compareAndSet(false, true)) {
            return this.f45365p.a();
        }
        r8.g.f().k("checkForUnsentReports should only be called once per execution.");
        return Tasks.e(Boolean.FALSE);
    }

    public Task s() {
        this.f45366q.e(Boolean.FALSE);
        return this.f45367r.a();
    }

    public boolean t() {
        v8.i.c();
        if (!this.f45352c.c()) {
            String strC = C();
            return strC != null && this.f45359j.c(strC);
        }
        r8.g.f().i("Found previous crash marker.");
        this.f45352c.d();
        return true;
    }

    public void u(C8.j jVar) {
        v(false, jVar, false);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void v(boolean z10, C8.j jVar, boolean z11) {
        String str;
        v8.i.c();
        ArrayList arrayList = new ArrayList(this.f45362m.q());
        if (arrayList.size() <= z10) {
            r8.g.f().i("No open sessions to be closed.");
            return;
        }
        String str2 = (String) arrayList.get(z10 ? 1 : 0);
        if (z11 && jVar.b().f1171b.f1179b) {
            a0(str2);
        } else {
            r8.g.f().i("ANR feature disabled.");
        }
        if (z11 && this.f45359j.c(str2)) {
            z(str2);
        }
        if (z10 != 0) {
            str = (String) arrayList.get(0);
        } else {
            this.f45361l.e(null);
            str = null;
        }
        this.f45362m.m(D(), str);
    }

    public final void w(String str, Boolean bool) {
        long jD = D();
        r8.g.f().b("Opening a new session with ID " + str);
        this.f45359j.d(str, String.format(Locale.US, "Crashlytics Android SDK/%s", C5983B.s()), jD, x8.G.b(o(this.f45355f, this.f45357h), q(), p(this.f45350a)));
        if (bool.booleanValue() && str != null) {
            this.f45353d.p(str);
        }
        this.f45358i.e(str);
        this.f45361l.e(str);
        this.f45362m.r(str, jD);
    }

    public final void x(long j10) {
        try {
            if (this.f45356g.g(".ae" + j10).createNewFile()) {
            } else {
                throw new IOException("Create new file failed.");
            }
        } catch (IOException e10) {
            r8.g.f().l("Could not create app exception marker file.", e10);
        }
    }

    public void y(String str, Thread.UncaughtExceptionHandler uncaughtExceptionHandler, C8.j jVar) {
        this.f45364o = jVar;
        R(str);
        F f10 = new F(new a(), jVar, uncaughtExceptionHandler, this.f45359j);
        this.f45363n = f10;
        Thread.setDefaultUncaughtExceptionHandler(f10);
    }

    public final void z(String str) {
        r8.g.f().i("Finalizing native report for session " + str);
        r8.h hVarA = this.f45359j.a(str);
        File fileC = hVarA.c();
        F.a aVarB = hVarA.b();
        if (P(str, fileC, aVarB)) {
            r8.g.f().k("No native core present");
            return;
        }
        long jLastModified = fileC.lastModified();
        C6169f c6169f = new C6169f(this.f45356g, str);
        File fileK = this.f45356g.k(str);
        if (!fileK.isDirectory()) {
            r8.g.f().k("Couldn't create directory to store native session files, aborting.");
            return;
        }
        x(jLastModified);
        List listE = E(hVarA, str, this.f45356g, c6169f.b());
        Q.b(fileK, listE);
        r8.g.f().b("CrashlyticsController#finalizePreviousNativeSession");
        this.f45362m.l(str, listE, aVarB);
        c6169f.a();
    }
}
