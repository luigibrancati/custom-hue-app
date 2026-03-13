package M1;

import D1.C0744b;
import G1.AbstractC0853a;
import G1.M;
import android.content.BroadcastReceiver;
import android.content.ContentResolver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.database.ContentObserver;
import android.media.AudioDeviceCallback;
import android.media.AudioDeviceInfo;
import android.net.Uri;
import android.os.Handler;
import java.util.Objects;

/* JADX INFO: renamed from: M1.b, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public final class C1199b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f9090a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final f f9091b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Handler f9092c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final c f9093d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final BroadcastReceiver f9094e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final d f9095f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public C1198a f9096g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public C1200c f9097h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public C0744b f9098i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public boolean f9099j;

    /* JADX INFO: renamed from: M1.b$b, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class C0137b {
        public static void a(Context context, AudioDeviceCallback audioDeviceCallback, Handler handler) {
            E1.c.c(context).registerAudioDeviceCallback(audioDeviceCallback, handler);
        }

        public static void b(Context context, AudioDeviceCallback audioDeviceCallback) {
            E1.c.c(context).unregisterAudioDeviceCallback(audioDeviceCallback);
        }
    }

    /* JADX INFO: renamed from: M1.b$c */
    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public final class c extends AudioDeviceCallback {
        public c() {
        }

        @Override // android.media.AudioDeviceCallback
        public void onAudioDevicesAdded(AudioDeviceInfo[] audioDeviceInfoArr) {
            C1199b c1199b = C1199b.this;
            c1199b.f(C1198a.e(c1199b.f9090a, C1199b.this.f9098i, C1199b.this.f9097h));
        }

        @Override // android.media.AudioDeviceCallback
        public void onAudioDevicesRemoved(AudioDeviceInfo[] audioDeviceInfoArr) {
            if (M.r(audioDeviceInfoArr, C1199b.this.f9097h)) {
                C1199b.this.f9097h = null;
            }
            C1199b c1199b = C1199b.this;
            c1199b.f(C1198a.e(c1199b.f9090a, C1199b.this.f9098i, C1199b.this.f9097h));
        }
    }

    /* JADX INFO: renamed from: M1.b$d */
    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public final class d extends ContentObserver {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final ContentResolver f9101a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Uri f9102b;

        public d(Handler handler, ContentResolver contentResolver, Uri uri) {
            super(handler);
            this.f9101a = contentResolver;
            this.f9102b = uri;
        }

        public void a() {
            this.f9101a.registerContentObserver(this.f9102b, false, this);
        }

        public void b() {
            this.f9101a.unregisterContentObserver(this);
        }

        @Override // android.database.ContentObserver
        public void onChange(boolean z10) {
            C1199b c1199b = C1199b.this;
            c1199b.f(C1198a.e(c1199b.f9090a, C1199b.this.f9098i, C1199b.this.f9097h));
        }
    }

    /* JADX INFO: renamed from: M1.b$e */
    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public final class e extends BroadcastReceiver {
        public e() {
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            if (isInitialStickyBroadcast()) {
                return;
            }
            C1199b c1199b = C1199b.this;
            c1199b.f(C1198a.f(context, intent, c1199b.f9098i, C1199b.this.f9097h));
        }
    }

    /* JADX INFO: renamed from: M1.b$f */
    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public interface f {
        void a(C1198a c1198a);
    }

    public C1199b(Context context, f fVar, C0744b c0744b, C1200c c1200c) {
        Context applicationContext = context.getApplicationContext();
        this.f9090a = applicationContext;
        this.f9091b = (f) AbstractC0853a.e(fVar);
        this.f9098i = c0744b;
        this.f9097h = c1200c;
        Handler handlerB = M.B();
        this.f9092c = handlerB;
        this.f9093d = new c();
        this.f9094e = new e();
        Uri uriI = C1198a.i();
        this.f9095f = uriI != null ? new d(handlerB, applicationContext.getContentResolver(), uriI) : null;
    }

    public final void f(C1198a c1198a) {
        if (!this.f9099j || c1198a.equals(this.f9096g)) {
            return;
        }
        this.f9096g = c1198a;
        this.f9091b.a(c1198a);
    }

    public void g(C1198a c1198a) {
        f(c1198a);
    }

    public C1198a h() {
        if (this.f9099j) {
            return (C1198a) AbstractC0853a.e(this.f9096g);
        }
        this.f9099j = true;
        d dVar = this.f9095f;
        if (dVar != null) {
            dVar.a();
        }
        c cVar = this.f9093d;
        if (cVar != null) {
            C0137b.a(this.f9090a, cVar, this.f9092c);
        }
        C1198a c1198aF = C1198a.f(this.f9090a, this.f9090a.registerReceiver(this.f9094e, new IntentFilter("android.media.action.HDMI_AUDIO_PLUG"), null, this.f9092c), this.f9098i, this.f9097h);
        this.f9096g = c1198aF;
        return c1198aF;
    }

    public void i(C0744b c0744b) {
        this.f9098i = c0744b;
        f(C1198a.e(this.f9090a, c0744b, this.f9097h));
    }

    public void j(AudioDeviceInfo audioDeviceInfo) {
        C1200c c1200c = this.f9097h;
        if (Objects.equals(audioDeviceInfo, c1200c == null ? null : c1200c.f9105a)) {
            return;
        }
        C1200c c1200c2 = audioDeviceInfo != null ? new C1200c(audioDeviceInfo) : null;
        this.f9097h = c1200c2;
        f(C1198a.e(this.f9090a, this.f9098i, c1200c2));
    }

    public void k() {
        if (this.f9099j) {
            this.f9096g = null;
            c cVar = this.f9093d;
            if (cVar != null) {
                C0137b.b(this.f9090a, cVar);
            }
            this.f9090a.unregisterReceiver(this.f9094e);
            d dVar = this.f9095f;
            if (dVar != null) {
                dVar.b();
            }
            this.f9099j = false;
        }
    }
}
