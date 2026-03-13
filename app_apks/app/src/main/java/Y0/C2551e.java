package Y0;

import android.content.Context;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.ViewConfiguration;

/* JADX INFO: renamed from: Y0.e, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public class C2551e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f19642a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final InterfaceC2552f f19643b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final b f19644c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final a f19645d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public VelocityTracker f19646e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public float f19647f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f19648g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f19649h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f19650i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final int[] f19651j;

    /* JADX INFO: renamed from: Y0.e$a */
    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public interface a {
        float a(VelocityTracker velocityTracker, MotionEvent motionEvent, int i10);
    }

    /* JADX INFO: renamed from: Y0.e$b */
    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public interface b {
        void a(Context context, int[] iArr, MotionEvent motionEvent, int i10);
    }

    public C2551e(Context context, InterfaceC2552f interfaceC2552f) {
        this(context, interfaceC2552f, new b() { // from class: Y0.c
            @Override // Y0.C2551e.b
            public final void a(Context context2, int[] iArr, MotionEvent motionEvent, int i10) {
                C2551e.c(context2, iArr, motionEvent, i10);
            }
        }, new a() { // from class: Y0.d
            @Override // Y0.C2551e.a
            public final float a(VelocityTracker velocityTracker, MotionEvent motionEvent, int i10) {
                return C2551e.f(velocityTracker, motionEvent, i10);
            }
        });
    }

    public static void c(Context context, int[] iArr, MotionEvent motionEvent, int i10) {
        ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
        iArr[0] = H.g(context, viewConfiguration, motionEvent.getDeviceId(), i10, motionEvent.getSource());
        iArr[1] = H.f(context, viewConfiguration, motionEvent.getDeviceId(), i10, motionEvent.getSource());
    }

    public static float f(VelocityTracker velocityTracker, MotionEvent motionEvent, int i10) {
        B.a(velocityTracker, motionEvent);
        B.b(velocityTracker, 1000);
        return B.d(velocityTracker, i10);
    }

    public final boolean d(MotionEvent motionEvent, int i10) {
        int source = motionEvent.getSource();
        int deviceId = motionEvent.getDeviceId();
        if (this.f19649h == source && this.f19650i == deviceId && this.f19648g == i10) {
            return false;
        }
        this.f19644c.a(this.f19642a, this.f19651j, motionEvent, i10);
        this.f19649h = source;
        this.f19650i = deviceId;
        this.f19648g = i10;
        return true;
    }

    public final float e(MotionEvent motionEvent, int i10) {
        if (this.f19646e == null) {
            this.f19646e = VelocityTracker.obtain();
        }
        return this.f19645d.a(this.f19646e, motionEvent, i10);
    }

    public void g(MotionEvent motionEvent, int i10) {
        boolean zD = d(motionEvent, i10);
        if (this.f19651j[0] == Integer.MAX_VALUE) {
            VelocityTracker velocityTracker = this.f19646e;
            if (velocityTracker != null) {
                velocityTracker.recycle();
                this.f19646e = null;
                return;
            }
            return;
        }
        float fE = e(motionEvent, i10) * this.f19643b.b();
        float fSignum = Math.signum(fE);
        if (zD || (fSignum != Math.signum(this.f19647f) && fSignum != 0.0f)) {
            this.f19643b.c();
        }
        float fAbs = Math.abs(fE);
        int[] iArr = this.f19651j;
        if (fAbs < iArr[0]) {
            return;
        }
        float fMax = Math.max(-r6, Math.min(fE, iArr[1]));
        this.f19647f = this.f19643b.a(fMax) ? fMax : 0.0f;
    }

    public C2551e(Context context, InterfaceC2552f interfaceC2552f, b bVar, a aVar) {
        this.f19648g = -1;
        this.f19649h = -1;
        this.f19650i = -1;
        this.f19651j = new int[]{Integer.MAX_VALUE, 0};
        this.f19642a = context;
        this.f19643b = interfaceC2552f;
        this.f19644c = bVar;
        this.f19645d = aVar;
    }
}
