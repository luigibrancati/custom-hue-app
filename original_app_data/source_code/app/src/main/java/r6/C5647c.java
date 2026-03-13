package r6;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Looper;
import android.os.Message;
import android.os.Messenger;
import android.os.Parcelable;
import android.util.Log;
import b0.J;
import b7.C2878l;
import b7.InterfaceC2869c;
import b7.InterfaceC2877k;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import io.sentry.protocol.App;
import java.io.IOException;
import java.util.Objects;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.apache.tika.metadata.TikaCoreProperties;

/* JADX INFO: renamed from: r6.c, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public class C5647c {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static int f43756h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static PendingIntent f43757i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final Executor f43758j = new Executor() { // from class: r6.F
        @Override // java.util.concurrent.Executor
        public final void execute(Runnable runnable) {
            runnable.run();
        }
    };

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final Pattern f43759k = Pattern.compile("\\|ID\\|([^|]+)\\|:?+(.*)");

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Context f43761b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final C5641D f43762c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final ScheduledExecutorService f43763d;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public Messenger f43765f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public com.google.android.gms.cloudmessaging.a f43766g;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final J f43760a = new J();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Messenger f43764e = new Messenger(new HandlerC5653i(this, Looper.getMainLooper()));

    public C5647c(Context context) {
        this.f43761b = context;
        this.f43762c = new C5641D(context);
        ScheduledThreadPoolExecutor scheduledThreadPoolExecutor = new ScheduledThreadPoolExecutor(1);
        scheduledThreadPoolExecutor.setKeepAliveTime(60L, TimeUnit.SECONDS);
        scheduledThreadPoolExecutor.allowCoreThreadTimeOut(true);
        this.f43763d = scheduledThreadPoolExecutor;
    }

    public static /* synthetic */ Task e(Bundle bundle) {
        return m(bundle) ? Tasks.e(null) : Tasks.e(bundle);
    }

    public static /* bridge */ /* synthetic */ void g(C5647c c5647c, Message message) {
        if (message != null) {
            Object obj = message.obj;
            if (obj instanceof Intent) {
                Intent intent = (Intent) obj;
                intent.setExtrasClassLoader(new C5655k());
                if (intent.hasExtra("google.messenger")) {
                    Parcelable parcelableExtra = intent.getParcelableExtra("google.messenger");
                    if (parcelableExtra instanceof com.google.android.gms.cloudmessaging.a) {
                        c5647c.f43766g = (com.google.android.gms.cloudmessaging.a) parcelableExtra;
                    }
                    if (parcelableExtra instanceof Messenger) {
                        c5647c.f43765f = (Messenger) parcelableExtra;
                    }
                }
                Intent intent2 = (Intent) message.obj;
                String action = intent2.getAction();
                if (!Objects.equals(action, "com.google.android.c2dm.intent.REGISTRATION")) {
                    if (Log.isLoggable("Rpc", 3)) {
                        Log.d("Rpc", "Unexpected response action: ".concat(String.valueOf(action)));
                        return;
                    }
                    return;
                }
                String stringExtra = intent2.getStringExtra("registration_id");
                if (stringExtra == null) {
                    stringExtra = intent2.getStringExtra("unregistered");
                }
                if (stringExtra != null) {
                    Matcher matcher = f43759k.matcher(stringExtra);
                    if (!matcher.matches()) {
                        if (Log.isLoggable("Rpc", 3)) {
                            Log.d("Rpc", "Unexpected response string: ".concat(stringExtra));
                            return;
                        }
                        return;
                    }
                    String strGroup = matcher.group(1);
                    String strGroup2 = matcher.group(2);
                    if (strGroup != null) {
                        Bundle extras = intent2.getExtras();
                        extras.putString("registration_id", strGroup2);
                        c5647c.l(strGroup, extras);
                        return;
                    }
                    return;
                }
                String stringExtra2 = intent2.getStringExtra("error");
                if (stringExtra2 == null) {
                    Log.w("Rpc", "Unexpected response, no error or registration id ".concat(String.valueOf(intent2.getExtras())));
                    return;
                }
                if (Log.isLoggable("Rpc", 3)) {
                    Log.d("Rpc", "Received InstanceID error ".concat(stringExtra2));
                }
                if (!stringExtra2.startsWith("|")) {
                    synchronized (c5647c.f43760a) {
                        for (int i10 = 0; i10 < c5647c.f43760a.size(); i10++) {
                            try {
                                c5647c.l((String) c5647c.f43760a.f(i10), intent2.getExtras());
                            } catch (Throwable th) {
                                throw th;
                            }
                        }
                    }
                    return;
                }
                String[] strArrSplit = stringExtra2.split("\\|");
                if (strArrSplit.length <= 2 || !Objects.equals(strArrSplit[1], "ID")) {
                    Log.w("Rpc", "Unexpected structured response ".concat(stringExtra2));
                    return;
                }
                String str = strArrSplit[2];
                String strSubstring = strArrSplit[3];
                if (strSubstring.startsWith(TikaCoreProperties.NAMESPACE_PREFIX_DELIMITER)) {
                    strSubstring = strSubstring.substring(1);
                }
                c5647c.l(str, intent2.putExtra("error", strSubstring).getExtras());
                return;
            }
        }
        Log.w("Rpc", "Dropping invalid message");
    }

    public static synchronized String j() {
        int i10;
        i10 = f43756h;
        f43756h = i10 + 1;
        return Integer.toString(i10);
    }

    public static synchronized void k(Context context, Intent intent) {
        try {
            if (f43757i == null) {
                Intent intent2 = new Intent();
                intent2.setPackage("com.google.example.invalidpackage");
                f43757i = PendingIntent.getBroadcast(context, 0, intent2, I6.a.f5661a);
            }
            intent.putExtra(App.TYPE, f43757i);
        } catch (Throwable th) {
            throw th;
        }
    }

    public static boolean m(Bundle bundle) {
        return bundle != null && bundle.containsKey("google.messenger");
    }

    public Task a() {
        return this.f43762c.a() >= 241100000 ? C5640C.b(this.f43761b).d(5, Bundle.EMPTY).j(f43758j, new InterfaceC2869c() { // from class: r6.f
            @Override // b7.InterfaceC2869c
            public final Object a(Task task) {
                Intent intent = (Intent) ((Bundle) task.m()).getParcelable("notification_data");
                if (intent != null) {
                    return new C5645a(intent);
                }
                return null;
            }
        }) : Tasks.d(new IOException("SERVICE_NOT_AVAILABLE"));
    }

    public Task b(C5645a c5645a) {
        if (this.f43762c.a() < 233700000) {
            return Tasks.d(new IOException("SERVICE_NOT_AVAILABLE"));
        }
        Bundle bundle = new Bundle();
        bundle.putString("google.message_id", c5645a.e());
        Integer numF = c5645a.f();
        if (numF != null) {
            bundle.putInt("google.product_id", numF.intValue());
        }
        return C5640C.b(this.f43761b).c(3, bundle);
    }

    public Task c(final Bundle bundle) {
        return this.f43762c.a() < 12000000 ? this.f43762c.b() != 0 ? i(bundle).k(f43758j, new InterfaceC2869c() { // from class: r6.G
            @Override // b7.InterfaceC2869c
            public final Object a(Task task) {
                return this.f43751a.f(bundle, task);
            }
        }) : Tasks.d(new IOException("MISSING_INSTANCEID_SERVICE")) : C5640C.b(this.f43761b).d(1, bundle).j(f43758j, new InterfaceC2869c() { // from class: r6.e
            @Override // b7.InterfaceC2869c
            public final Object a(Task task) throws IOException {
                if (task.q()) {
                    return (Bundle) task.m();
                }
                if (Log.isLoggable("Rpc", 3)) {
                    Log.d("Rpc", "Error making request: ".concat(String.valueOf(task.l())));
                }
                throw new IOException("SERVICE_NOT_AVAILABLE", task.l());
            }
        });
    }

    public Task d(boolean z10) {
        if (this.f43762c.a() < 241100000) {
            return Tasks.d(new IOException("SERVICE_NOT_AVAILABLE"));
        }
        Bundle bundle = new Bundle();
        bundle.putBoolean("proxy_retention", z10);
        return C5640C.b(this.f43761b).c(4, bundle);
    }

    public final /* synthetic */ Task f(Bundle bundle, Task task) {
        return (task.q() && m((Bundle) task.m())) ? i(bundle).s(f43758j, new InterfaceC2877k() { // from class: r6.E
            @Override // b7.InterfaceC2877k
            public final Task a(Object obj) {
                return C5647c.e((Bundle) obj);
            }
        }) : task;
    }

    public final /* synthetic */ void h(String str, ScheduledFuture scheduledFuture, Task task) {
        synchronized (this.f43760a) {
            this.f43760a.remove(str);
        }
        scheduledFuture.cancel(false);
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x00a9  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00af  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final com.google.android.gms.tasks.Task i(android.os.Bundle r8) {
        /*
            Method dump skipped, instruction units count: 217
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: r6.C5647c.i(android.os.Bundle):com.google.android.gms.tasks.Task");
    }

    public final void l(String str, Bundle bundle) {
        synchronized (this.f43760a) {
            try {
                C2878l c2878l = (C2878l) this.f43760a.remove(str);
                if (c2878l != null) {
                    c2878l.c(bundle);
                    return;
                }
                Log.w("Rpc", "Missing callback for " + str);
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
