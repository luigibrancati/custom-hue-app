package K1;

import G1.AbstractC0853a;
import G1.C0858f;
import G1.InterfaceC0860h;
import K1.C1015p;
import K1.u1;
import K7.AbstractC1081v;
import android.content.Context;
import android.media.AudioDeviceCallback;
import android.media.AudioDeviceInfo;
import android.media.AudioManager;
import android.media.MediaRoute2Info;
import android.media.MediaRouter2;
import android.media.RouteDiscoveryPreference;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import java.util.Iterator;
import java.util.Objects;
import java.util.concurrent.Executor;
import org.webrtc.MediaStreamTrack;

/* JADX INFO: renamed from: K1.p, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public final class C1015p implements u1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final u1 f7293a;

    /* JADX INFO: renamed from: K1.p$b */
    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class b implements u1 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public AudioManager f7294a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public AudioDeviceCallback f7295b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public C0858f f7296c;

        /* JADX INFO: renamed from: K1.p$b$a */
        /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
        public class a extends AudioDeviceCallback {
            public a() {
            }

            @Override // android.media.AudioDeviceCallback
            public void onAudioDevicesAdded(AudioDeviceInfo[] audioDeviceInfoArr) {
                b.this.f7296c.g(Boolean.valueOf(b.this.i()));
            }

            @Override // android.media.AudioDeviceCallback
            public void onAudioDevicesRemoved(AudioDeviceInfo[] audioDeviceInfoArr) {
                b.this.f7296c.g(Boolean.valueOf(b.this.i()));
            }
        }

        public b() {
        }

        public static /* synthetic */ void e(b bVar, Context context) {
            AudioManager audioManager;
            AbstractC0853a.e(bVar.f7296c);
            if (G1.M.I0(context) && (audioManager = (AudioManager) context.getSystemService(MediaStreamTrack.AUDIO_TRACK_KIND)) != null) {
                bVar.f7294a = audioManager;
                a aVar = bVar.new a();
                bVar.f7295b = aVar;
                audioManager.registerAudioDeviceCallback(aVar, new Handler((Looper) AbstractC0853a.e(Looper.myLooper())));
                bVar.f7296c.g(Boolean.valueOf(bVar.i()));
            }
        }

        public static /* synthetic */ void f(b bVar) {
            AudioManager audioManager = bVar.f7294a;
            if (audioManager != null) {
                audioManager.unregisterAudioDeviceCallback((AudioDeviceCallback) AbstractC0853a.e(bVar.f7295b));
            }
        }

        @Override // K1.u1
        public void a(final u1.a aVar, final Context context, Looper looper, Looper looper2, InterfaceC0860h interfaceC0860h) {
            C0858f c0858f = new C0858f(Boolean.TRUE, looper2, looper, interfaceC0860h, new C0858f.a() { // from class: K1.r
                @Override // G1.C0858f.a
                public final void a(Object obj, Object obj2) {
                    aVar.a(((Boolean) obj2).booleanValue());
                }
            });
            this.f7296c = c0858f;
            c0858f.e(new Runnable() { // from class: K1.s
                @Override // java.lang.Runnable
                public final void run() {
                    C1015p.b.e(this.f7313a, context);
                }
            });
        }

        @Override // K1.u1
        public boolean b() {
            C0858f c0858f = this.f7296c;
            if (c0858f == null) {
                return true;
            }
            return ((Boolean) c0858f.d()).booleanValue();
        }

        @Override // K1.u1
        public void c() {
            ((C0858f) AbstractC0853a.e(this.f7296c)).e(new Runnable() { // from class: K1.q
                @Override // java.lang.Runnable
                public final void run() {
                    C1015p.b.f(this.f7308a);
                }
            });
        }

        public final boolean i() {
            for (AudioDeviceInfo audioDeviceInfo : ((AudioManager) AbstractC0853a.i(this.f7294a)).getDevices(2)) {
                if (audioDeviceInfo.getType() != 8 && audioDeviceInfo.getType() != 5 && audioDeviceInfo.getType() != 6 && audioDeviceInfo.getType() != 11 && audioDeviceInfo.getType() != 4 && audioDeviceInfo.getType() != 3) {
                    int i10 = Build.VERSION.SDK_INT;
                    if (audioDeviceInfo.getType() != 22 && audioDeviceInfo.getType() != 23 && audioDeviceInfo.getType() != 26 && audioDeviceInfo.getType() != 27) {
                        if (i10 >= 33 && audioDeviceInfo.getType() == 30) {
                            return true;
                        }
                    }
                }
                return true;
            }
            return false;
        }
    }

    /* JADX INFO: renamed from: K1.p$c */
    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class c implements u1 {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public static final RouteDiscoveryPreference f7298e = new RouteDiscoveryPreference.Builder(AbstractC1081v.z(), false).build();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public MediaRouter2 f7299a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public MediaRouter2.RouteCallback f7300b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public MediaRouter2.ControllerCallback f7301c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public C0858f f7302d;

        /* JADX INFO: renamed from: K1.p$c$a */
        /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
        public class a extends MediaRouter2.RouteCallback {
            public a() {
            }
        }

        /* JADX INFO: renamed from: K1.p$c$b */
        /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
        public class b extends MediaRouter2.ControllerCallback {
            public b() {
            }

            @Override // android.media.MediaRouter2.ControllerCallback
            public void onControllerUpdated(MediaRouter2.RoutingController routingController) {
                c.this.f7302d.g(Boolean.valueOf(c.k(c.this.f7299a)));
            }
        }

        public c() {
        }

        public static /* synthetic */ void d(c cVar) {
            ((MediaRouter2) AbstractC0853a.e(cVar.f7299a)).unregisterControllerCallback((MediaRouter2.ControllerCallback) AbstractC0853a.e(cVar.f7301c));
            cVar.f7301c = null;
            cVar.f7299a.unregisterRouteCallback((MediaRouter2.RouteCallback) AbstractC0853a.e(cVar.f7300b));
        }

        public static /* synthetic */ void f(c cVar, Context context) {
            AbstractC0853a.e(cVar.f7302d);
            cVar.f7299a = MediaRouter2.getInstance(context);
            cVar.f7300b = cVar.new a();
            final C0858f c0858f = cVar.f7302d;
            Objects.requireNonNull(c0858f);
            Executor executor = new Executor() { // from class: K1.w
                @Override // java.util.concurrent.Executor
                public final void execute(Runnable runnable) {
                    c0858f.e(runnable);
                }
            };
            cVar.f7299a.registerRouteCallback(executor, cVar.f7300b, f7298e);
            b bVar = cVar.new b();
            cVar.f7301c = bVar;
            cVar.f7299a.registerControllerCallback(executor, bVar);
            cVar.f7302d.g(Boolean.valueOf(k(cVar.f7299a)));
        }

        public static boolean j(MediaRoute2Info mediaRoute2Info, int i10, boolean z10) {
            int suitabilityStatus = mediaRoute2Info.getSuitabilityStatus();
            return suitabilityStatus == 1 ? (i10 == 1 || i10 == 2) && z10 : suitabilityStatus == 0;
        }

        public static boolean k(MediaRouter2 mediaRouter2) {
            int transferReason = ((MediaRouter2) AbstractC0853a.e(mediaRouter2)).getSystemController().getRoutingSessionInfo().getTransferReason();
            boolean zWasTransferInitiatedBySelf = mediaRouter2.getSystemController().wasTransferInitiatedBySelf();
            Iterator<MediaRoute2Info> it = mediaRouter2.getSystemController().getSelectedRoutes().iterator();
            while (it.hasNext()) {
                if (j(it.next(), transferReason, zWasTransferInitiatedBySelf)) {
                    return true;
                }
            }
            return false;
        }

        @Override // K1.u1
        public void a(final u1.a aVar, final Context context, Looper looper, Looper looper2, InterfaceC0860h interfaceC0860h) {
            C0858f c0858f = new C0858f(Boolean.TRUE, looper2, looper, interfaceC0860h, new C0858f.a() { // from class: K1.u
                @Override // G1.C0858f.a
                public final void a(Object obj, Object obj2) {
                    aVar.a(((Boolean) obj2).booleanValue());
                }
            });
            this.f7302d = c0858f;
            c0858f.e(new Runnable() { // from class: K1.v
                @Override // java.lang.Runnable
                public final void run() {
                    C1015p.c.f(this.f7333a, context);
                }
            });
        }

        @Override // K1.u1
        public boolean b() {
            C0858f c0858f = this.f7302d;
            if (c0858f == null) {
                return true;
            }
            return ((Boolean) c0858f.d()).booleanValue();
        }

        @Override // K1.u1
        public void c() {
            ((C0858f) AbstractC0853a.i(this.f7302d)).e(new Runnable() { // from class: K1.t
                @Override // java.lang.Runnable
                public final void run() {
                    C1015p.c.d(this.f7329a);
                }
            });
        }
    }

    public C1015p() {
        if (Build.VERSION.SDK_INT >= 35) {
            this.f7293a = new c();
        } else {
            this.f7293a = new b();
        }
    }

    @Override // K1.u1
    public void a(u1.a aVar, Context context, Looper looper, Looper looper2, InterfaceC0860h interfaceC0860h) {
        u1 u1Var = this.f7293a;
        if (u1Var != null) {
            u1Var.a(aVar, context, looper, looper2, interfaceC0860h);
        }
    }

    @Override // K1.u1
    public boolean b() {
        u1 u1Var = this.f7293a;
        return u1Var == null || u1Var.b();
    }

    @Override // K1.u1
    public void c() {
        u1 u1Var = this.f7293a;
        if (u1Var != null) {
            u1Var.c();
        }
    }
}
