package Ka;

import android.app.Activity;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.text.TextUtils;
import android.util.Log;
import com.spotify.sdk.android.auth.b;
import com.spotify.sdk.android.auth.c;
import u.AbstractC5888c;
import u.AbstractServiceConnectionC5890e;
import u.C5887b;
import u.C5889d;
import u.C5891f;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public class a implements com.spotify.sdk.android.auth.b {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final String f7777f = "a";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public C5891f f7778a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public AbstractServiceConnectionC5890e f7779b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f7780c = false;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Context f7781d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Uri f7782e;

    /* JADX INFO: renamed from: Ka.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public class C0122a extends AbstractServiceConnectionC5890e {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ c f7783b;

        public C0122a(c cVar) {
            this.f7783b = cVar;
        }

        @Override // u.AbstractServiceConnectionC5890e
        public void a(ComponentName componentName, AbstractC5888c abstractC5888c) {
            abstractC5888c.g(0L);
            a.this.f7778a = abstractC5888c.e(new C5887b());
            if (a.this.f7778a != null) {
                new C5889d.e().d(a.this.f7778a).a().b(a.this.f7781d, this.f7783b.h());
                a.this.f7780c = true;
            } else {
                a.this.m();
                Log.i(a.f7777f, "Auth using CustomTabs aborted, reason: CustomTabsSession is null.");
                a.this.l();
            }
        }

        @Override // android.content.ServiceConnection
        public void onServiceDisconnected(ComponentName componentName) {
            Log.i(a.f7777f, "Auth using CustomTabs aborted, reason: CustomTabsService disconnected.");
            a.this.f7778a = null;
            a.this.f7779b = null;
        }
    }

    @Override // com.spotify.sdk.android.auth.b
    public boolean a(Activity activity, c cVar) {
        String str = f7777f;
        Log.d(str, "start");
        this.f7781d = activity;
        this.f7782e = cVar.h();
        String strB = b.b(this.f7781d, cVar);
        boolean zIsEmpty = TextUtils.isEmpty(strB);
        if (k(this.f7781d)) {
            Log.e(str, "Missing INTERNET permission");
        }
        if (zIsEmpty) {
            Log.d(str, "Launching auth inside a web browser");
            l();
            return true;
        }
        Log.d(str, "Launching auth in a Custom Tab using package:" + strB);
        C0122a c0122a = new C0122a(cVar);
        this.f7779b = c0122a;
        AbstractC5888c.a(this.f7781d, strB, c0122a);
        return true;
    }

    @Override // com.spotify.sdk.android.auth.b
    public boolean b() {
        return this.f7780c;
    }

    public final boolean k(Context context) {
        return context.getPackageManager().checkPermission("android.permission.INTERNET", context.getPackageName()) != 0;
    }

    public final void l() {
        if (k(this.f7781d)) {
            Log.e(f7777f, "Missing INTERNET permission");
        }
        this.f7781d.startActivity(new Intent("android.intent.action.VIEW", this.f7782e));
        this.f7780c = true;
    }

    public void m() {
        AbstractServiceConnectionC5890e abstractServiceConnectionC5890e = this.f7779b;
        if (abstractServiceConnectionC5890e == null) {
            return;
        }
        this.f7781d.unbindService(abstractServiceConnectionC5890e);
        this.f7778a = null;
        this.f7779b = null;
    }

    @Override // com.spotify.sdk.android.auth.b
    public void stop() {
        Log.d(f7777f, "stop");
        m();
        this.f7781d = null;
        this.f7780c = false;
    }

    @Override // com.spotify.sdk.android.auth.b
    public void c(b.a aVar) {
    }
}
