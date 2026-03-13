package u;

import android.app.ActivityOptions;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.IBinder;
import android.os.LocaleList;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.SparseArray;
import java.util.ArrayList;
import u.C5886a;

/* JADX INFO: renamed from: u.d, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public final class C5889d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Intent f45000a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Bundle f45001b;

    /* JADX INFO: renamed from: u.d$a */
    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static class a {
        public static ActivityOptions a() {
            return ActivityOptions.makeBasic();
        }
    }

    /* JADX INFO: renamed from: u.d$b */
    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static class b {
        public static String a() {
            LocaleList adjustedDefault = LocaleList.getAdjustedDefault();
            if (adjustedDefault.size() > 0) {
                return adjustedDefault.get(0).toLanguageTag();
            }
            return null;
        }
    }

    /* JADX INFO: renamed from: u.d$c */
    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static class c {
        public static void a(ActivityOptions activityOptions, boolean z10) {
            activityOptions.setShareIdentityEnabled(z10);
        }
    }

    /* JADX INFO: renamed from: u.d$d, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static class C0614d {
        public static void a(ActivityOptions activityOptions, boolean z10) {
            activityOptions.setAllowPassThroughOnTouchOutside(z10);
        }
    }

    public C5889d(Intent intent, Bundle bundle) {
        this.f45000a = intent;
        this.f45001b = bundle;
    }

    public static boolean a(Intent intent) {
        return !intent.getBooleanExtra("androidx.browser.customtabs.extra.DISABLE_BACKGROUND_INTERACTION", false);
    }

    public void b(Context context, Uri uri) {
        this.f45000a.setData(uri);
        L0.a.p(context, this.f45000a, this.f45001b);
    }

    /* JADX INFO: renamed from: u.d$e */
    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class e {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public ArrayList f45004c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public ActivityOptions f45005d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public ArrayList f45006e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public SparseArray f45007f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public Bundle f45008g;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public boolean f45011j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public ArrayList f45012k;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Intent f45002a = new Intent("android.intent.action.VIEW");

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final C5886a.C0611a f45003b = new C5886a.C0611a();

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public int f45009h = 0;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public boolean f45010i = true;

        public e() {
        }

        public C5889d a() {
            if (!this.f45002a.hasExtra("android.support.customtabs.extra.SESSION")) {
                e(null, null);
            }
            ArrayList<? extends Parcelable> arrayList = this.f45004c;
            if (arrayList != null) {
                this.f45002a.putParcelableArrayListExtra("android.support.customtabs.extra.MENU_ITEMS", arrayList);
            }
            ArrayList<? extends Parcelable> arrayList2 = this.f45006e;
            if (arrayList2 != null) {
                this.f45002a.putParcelableArrayListExtra("android.support.customtabs.extra.TOOLBAR_ITEMS", arrayList2);
            }
            this.f45002a.putExtra("android.support.customtabs.extra.EXTRA_ENABLE_INSTANT_APPS", this.f45010i);
            this.f45002a.putExtras(this.f45003b.a().a());
            Bundle bundle = this.f45008g;
            if (bundle != null) {
                this.f45002a.putExtras(bundle);
            }
            if (this.f45007f != null) {
                Bundle bundle2 = new Bundle();
                bundle2.putSparseParcelableArray("androidx.browser.customtabs.extra.COLOR_SCHEME_PARAMS", this.f45007f);
                this.f45002a.putExtras(bundle2);
            }
            this.f45002a.putExtra("androidx.browser.customtabs.extra.SHARE_STATE", this.f45009h);
            ArrayList arrayList3 = this.f45012k;
            if (arrayList3 != null && !arrayList3.isEmpty()) {
                this.f45002a.putParcelableArrayListExtra("androidx.browser.customtabs.extra.CUSTOM_CONTENT_ACTIONS", this.f45012k);
            }
            int i10 = Build.VERSION.SDK_INT;
            c();
            if (i10 >= 34) {
                f();
            }
            if (i10 >= 36) {
                b();
            }
            ActivityOptions activityOptions = this.f45005d;
            return new C5889d(this.f45002a, activityOptions != null ? activityOptions.toBundle() : null);
        }

        public final void b() {
            if (this.f45005d == null) {
                this.f45005d = a.a();
            }
            C0614d.a(this.f45005d, C5889d.a(this.f45002a));
        }

        public final void c() {
            String strA = b.a();
            if (TextUtils.isEmpty(strA)) {
                return;
            }
            Bundle bundleExtra = this.f45002a.hasExtra("com.android.browser.headers") ? this.f45002a.getBundleExtra("com.android.browser.headers") : new Bundle();
            if (bundleExtra.containsKey("Accept-Language")) {
                return;
            }
            bundleExtra.putString("Accept-Language", strA);
            this.f45002a.putExtra("com.android.browser.headers", bundleExtra);
        }

        public e d(C5891f c5891f) {
            this.f45002a.setPackage(c5891f.d().getPackageName());
            e(c5891f.c(), c5891f.e());
            return this;
        }

        public final void e(IBinder iBinder, PendingIntent pendingIntent) {
            Bundle bundle = new Bundle();
            bundle.putBinder("android.support.customtabs.extra.SESSION", iBinder);
            if (pendingIntent != null) {
                bundle.putParcelable("android.support.customtabs.extra.SESSION_ID", pendingIntent);
            }
            this.f45002a.putExtras(bundle);
        }

        public final void f() {
            if (this.f45005d == null) {
                this.f45005d = a.a();
            }
            c.a(this.f45005d, this.f45011j);
        }

        public e g(boolean z10) {
            this.f45002a.putExtra("android.support.customtabs.extra.TITLE_VISIBILITY", z10 ? 1 : 0);
            return this;
        }

        public e(C5891f c5891f) {
            if (c5891f != null) {
                d(c5891f);
            }
        }
    }
}
