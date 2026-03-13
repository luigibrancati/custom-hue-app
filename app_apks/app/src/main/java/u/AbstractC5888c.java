package u;

import android.app.PendingIntent;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.RemoteException;
import android.support.customtabs.ICustomTabsCallback;
import android.support.customtabs.ICustomTabsService;
import android.util.Log;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: u.c, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC5888c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ICustomTabsService f44961a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ComponentName f44962b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Context f44963c;

    /* JADX INFO: renamed from: u.c$a */
    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public class a extends ICustomTabsCallback.Stub {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public Handler f44964a = new Handler(Looper.getMainLooper());

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ C5887b f44965b;

        /* JADX INFO: renamed from: u.c$a$a, reason: collision with other inner class name */
        /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
        public class RunnableC0612a implements Runnable {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final /* synthetic */ Bundle f44967a;

            public RunnableC0612a(Bundle bundle) {
                this.f44967a = bundle;
            }

            @Override // java.lang.Runnable
            public void run() {
                a.this.f44965b.j(this.f44967a);
            }
        }

        /* JADX INFO: renamed from: u.c$a$b */
        /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
        public class b implements Runnable {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final /* synthetic */ int f44969a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ Bundle f44970b;

            public b(int i10, Bundle bundle) {
                this.f44969a = i10;
                this.f44970b = bundle;
            }

            @Override // java.lang.Runnable
            public void run() {
                a.this.f44965b.g(this.f44969a, this.f44970b);
            }
        }

        /* JADX INFO: renamed from: u.c$a$c, reason: collision with other inner class name */
        /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
        public class RunnableC0613c implements Runnable {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final /* synthetic */ String f44972a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ Bundle f44973b;

            public RunnableC0613c(String str, Bundle bundle) {
                this.f44972a = str;
                this.f44973b = bundle;
            }

            @Override // java.lang.Runnable
            public void run() {
                a.this.f44965b.a(this.f44972a, this.f44973b);
            }
        }

        /* JADX INFO: renamed from: u.c$a$d */
        /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
        public class d implements Runnable {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final /* synthetic */ Bundle f44975a;

            public d(Bundle bundle) {
                this.f44975a = bundle;
            }

            @Override // java.lang.Runnable
            public void run() {
                a.this.f44965b.e(this.f44975a);
            }
        }

        /* JADX INFO: renamed from: u.c$a$e */
        /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
        public class e implements Runnable {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final /* synthetic */ String f44977a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ Bundle f44978b;

            public e(String str, Bundle bundle) {
                this.f44977a = str;
                this.f44978b = bundle;
            }

            @Override // java.lang.Runnable
            public void run() {
                a.this.f44965b.h(this.f44977a, this.f44978b);
            }
        }

        /* JADX INFO: renamed from: u.c$a$f */
        /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
        public class f implements Runnable {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final /* synthetic */ int f44980a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ Uri f44981b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public final /* synthetic */ boolean f44982c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            public final /* synthetic */ Bundle f44983d;

            public f(int i10, Uri uri, boolean z10, Bundle bundle) {
                this.f44980a = i10;
                this.f44981b = uri;
                this.f44982c = z10;
                this.f44983d = bundle;
            }

            @Override // java.lang.Runnable
            public void run() {
                a.this.f44965b.i(this.f44980a, this.f44981b, this.f44982c, this.f44983d);
            }
        }

        /* JADX INFO: renamed from: u.c$a$g */
        /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
        public class g implements Runnable {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final /* synthetic */ int f44985a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ int f44986b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public final /* synthetic */ Bundle f44987c;

            public g(int i10, int i11, Bundle bundle) {
                this.f44985a = i10;
                this.f44986b = i11;
                this.f44987c = bundle;
            }

            @Override // java.lang.Runnable
            public void run() {
                a.this.f44965b.d(this.f44985a, this.f44986b, this.f44987c);
            }
        }

        /* JADX INFO: renamed from: u.c$a$h */
        /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
        public class h implements Runnable {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final /* synthetic */ Bundle f44989a;

            public h(Bundle bundle) {
                this.f44989a = bundle;
            }

            @Override // java.lang.Runnable
            public void run() {
                a.this.f44965b.k(this.f44989a);
            }
        }

        /* JADX INFO: renamed from: u.c$a$i */
        /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
        public class i implements Runnable {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final /* synthetic */ int f44991a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ int f44992b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public final /* synthetic */ int f44993c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            public final /* synthetic */ int f44994d;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            public final /* synthetic */ int f44995e;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            public final /* synthetic */ Bundle f44996f;

            public i(int i10, int i11, int i12, int i13, int i14, Bundle bundle) {
                this.f44991a = i10;
                this.f44992b = i11;
                this.f44993c = i12;
                this.f44994d = i13;
                this.f44995e = i14;
                this.f44996f = bundle;
            }

            @Override // java.lang.Runnable
            public void run() {
                a.this.f44965b.c(this.f44991a, this.f44992b, this.f44993c, this.f44994d, this.f44995e, this.f44996f);
            }
        }

        /* JADX INFO: renamed from: u.c$a$j */
        /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
        public class j implements Runnable {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final /* synthetic */ Bundle f44998a;

            public j(Bundle bundle) {
                this.f44998a = bundle;
            }

            @Override // java.lang.Runnable
            public void run() {
                a.this.f44965b.f(this.f44998a);
            }
        }

        public a(C5887b c5887b) {
            this.f44965b = c5887b;
        }

        @Override // android.support.customtabs.ICustomTabsCallback
        public void C(Bundle bundle) {
            if (this.f44965b == null) {
                return;
            }
            this.f44964a.post(new h(bundle));
        }

        @Override // android.support.customtabs.ICustomTabsCallback
        public void C2(String str, Bundle bundle) {
            if (this.f44965b == null) {
                return;
            }
            this.f44964a.post(new RunnableC0613c(str, bundle));
        }

        @Override // android.support.customtabs.ICustomTabsCallback
        public void S0(int i10, int i11, int i12, int i13, int i14, Bundle bundle) {
            if (this.f44965b == null) {
                return;
            }
            this.f44964a.post(new i(i10, i11, i12, i13, i14, bundle));
        }

        @Override // android.support.customtabs.ICustomTabsCallback
        public void c0(int i10, Bundle bundle) {
            if (this.f44965b == null) {
                return;
            }
            this.f44964a.post(new b(i10, bundle));
        }

        @Override // android.support.customtabs.ICustomTabsCallback
        public void e5(Bundle bundle) {
            if (this.f44965b == null) {
                return;
            }
            this.f44964a.post(new j(bundle));
        }

        @Override // android.support.customtabs.ICustomTabsCallback
        public void j5(Bundle bundle) {
            if (this.f44965b == null) {
                return;
            }
            this.f44964a.post(new RunnableC0612a(bundle));
        }

        @Override // android.support.customtabs.ICustomTabsCallback
        public void q6(String str, Bundle bundle) {
            if (this.f44965b == null) {
                return;
            }
            this.f44964a.post(new e(str, bundle));
        }

        @Override // android.support.customtabs.ICustomTabsCallback
        public Bundle r1(String str, Bundle bundle) {
            C5887b c5887b = this.f44965b;
            if (c5887b == null) {
                return null;
            }
            return c5887b.b(str, bundle);
        }

        @Override // android.support.customtabs.ICustomTabsCallback
        public void u5(int i10, int i11, Bundle bundle) {
            if (this.f44965b == null) {
                return;
            }
            this.f44964a.post(new g(i10, i11, bundle));
        }

        @Override // android.support.customtabs.ICustomTabsCallback
        public void u6(Bundle bundle) {
            if (this.f44965b == null) {
                return;
            }
            this.f44964a.post(new d(bundle));
        }

        @Override // android.support.customtabs.ICustomTabsCallback
        public void w6(int i10, Uri uri, boolean z10, Bundle bundle) {
            if (this.f44965b == null) {
                return;
            }
            this.f44964a.post(new f(i10, uri, z10, bundle));
        }
    }

    public AbstractC5888c(ICustomTabsService iCustomTabsService, ComponentName componentName, Context context) {
        this.f44961a = iCustomTabsService;
        this.f44962b = componentName;
        this.f44963c = context;
    }

    public static boolean a(Context context, String str, AbstractServiceConnectionC5890e abstractServiceConnectionC5890e) {
        abstractServiceConnectionC5890e.b(context.getApplicationContext());
        Intent intent = new Intent("android.support.customtabs.action.CustomTabsService");
        if (str.isEmpty()) {
            throw new IllegalArgumentException("Service Intents must be explicit");
        }
        intent.setPackage(str);
        return context.bindService(intent, abstractServiceConnectionC5890e, 33);
    }

    public static String c(Context context, List list) {
        return d(context, list, false);
    }

    public static String d(Context context, List list, boolean z10) {
        ResolveInfo resolveInfoResolveActivity;
        PackageManager packageManager = context.getPackageManager();
        List<String> arrayList = list == null ? new ArrayList() : list;
        Intent intent = new Intent("android.intent.action.VIEW", Uri.parse("http://"));
        if (!z10 && (resolveInfoResolveActivity = packageManager.resolveActivity(intent, 0)) != null) {
            String str = resolveInfoResolveActivity.activityInfo.packageName;
            ArrayList arrayList2 = new ArrayList(arrayList.size() + 1);
            arrayList2.add(str);
            if (list != null) {
                arrayList2.addAll(list);
            }
            arrayList = arrayList2;
        }
        Intent intent2 = new Intent("android.support.customtabs.action.CustomTabsService");
        for (String str2 : arrayList) {
            intent2.setPackage(str2);
            if (packageManager.resolveService(intent2, 0) != null) {
                return str2;
            }
        }
        Log.w("CustomTabsClient", "Unable to find any Custom Tabs packages, you may need to add a <queries> element to your manifest. See the docs for CustomTabsClient#getPackageName.");
        return null;
    }

    public final ICustomTabsCallback.Stub b(C5887b c5887b) {
        return new a(c5887b);
    }

    public C5891f e(C5887b c5887b) {
        return f(c5887b, null);
    }

    public final C5891f f(C5887b c5887b, PendingIntent pendingIntent) {
        boolean zI5;
        ICustomTabsCallback.Stub stubB = b(c5887b);
        try {
            if (pendingIntent != null) {
                Bundle bundle = new Bundle();
                bundle.putParcelable("android.support.customtabs.extra.SESSION_ID", pendingIntent);
                zI5 = this.f44961a.w2(stubB, bundle);
            } else {
                zI5 = this.f44961a.I5(stubB);
            }
            if (zI5) {
                return new C5891f(this.f44961a, stubB, this.f44962b, pendingIntent);
            }
            return null;
        } catch (RemoteException unused) {
            return null;
        }
    }

    public boolean g(long j10) {
        try {
            return this.f44961a.Z4(j10);
        } catch (RemoteException unused) {
            return false;
        }
    }
}
