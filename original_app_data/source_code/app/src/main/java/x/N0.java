package x;

import B0.c;
import E.C0813t;
import E.C0821x;
import L.AbstractC1088b;
import android.hardware.camera2.CameraManager;
import android.util.Log;
import fc.C4015H;
import gc.C4179C;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Executor;
import kotlin.jvm.internal.AbstractC4854k;
import kotlin.jvm.internal.AbstractC4862t;
import y.C6369e;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public final class N0 extends AbstractC1088b {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final a f46667i = new a(null);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final y.t f46668f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Executor f46669g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public CameraManager.AvailabilityCallback f46670h;

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class a {
        public /* synthetic */ a(AbstractC4854k abstractC4854k) {
            this();
        }

        public a() {
        }
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class b extends CameraManager.AvailabilityCallback {
        public b() {
        }

        @Override // android.hardware.camera2.CameraManager.AvailabilityCallback
        public void onCameraAccessPrioritiesChanged() {
            Log.d("Camera2PresenceSrc", "System onCameraAccessPrioritiesChanged.");
            N0 n02 = N0.this;
            n02.p(n02.b());
        }

        @Override // android.hardware.camera2.CameraManager.AvailabilityCallback
        public void onCameraAvailable(String cameraId) {
            AbstractC4862t.e(cameraId, "cameraId");
            Log.d("Camera2PresenceSrc", "System onCameraAvailable: " + cameraId);
            N0 n02 = N0.this;
            n02.p(n02.b());
        }

        @Override // android.hardware.camera2.CameraManager.AvailabilityCallback
        public void onCameraUnavailable(String cameraId) {
            AbstractC4862t.e(cameraId, "cameraId");
            Log.d("Camera2PresenceSrc", "System onCameraUnavailable: " + cameraId);
            N0 n02 = N0.this;
            n02.p(n02.b());
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public N0(List initialCameraIds, y.t cameraManager, Executor systemCallbackExecutor) {
        super(initialCameraIds);
        AbstractC4862t.e(initialCameraIds, "initialCameraIds");
        AbstractC4862t.e(cameraManager, "cameraManager");
        AbstractC4862t.e(systemCallbackExecutor, "systemCallbackExecutor");
        this.f46668f = cameraManager;
        this.f46669g = systemCallbackExecutor;
    }

    public static final Object n(final N0 n02, final c.a completer) {
        AbstractC4862t.e(completer, "completer");
        n02.f46669g.execute(new Runnable() { // from class: x.M0
            @Override // java.lang.Runnable
            public final void run() {
                N0.o(this.f46663a, completer);
            }
        });
        return "FetchData for CameraAvailability";
    }

    public static final void o(N0 n02, c.a aVar) {
        try {
            String[] strArrD = n02.f46668f.d();
            AbstractC4862t.d(strArrD, "getCameraIdList(...)");
            ArrayList arrayList = new ArrayList(strArrD.length);
            for (String str : strArrD) {
                C0813t.a aVar2 = C0813t.f3022c;
                AbstractC4862t.b(str);
                arrayList.add(C0813t.a.d(aVar2, str, null, null, 6, null));
            }
            Log.d("Camera2PresenceSrc", "[FetchData] Refreshed camera list: " + C4179C.q0(arrayList, null, null, null, 0, null, null, 63, null));
            n02.h(arrayList);
            aVar.c(arrayList);
        } catch (C6369e e10) {
            Log.e("Camera2PresenceSrc", "[FetchData] Failed to get camera list for refresh.", e10);
            C0821x c0821xA = W0.a(e10);
            AbstractC4862t.d(c0821xA, "createFrom(...)");
            n02.i(c0821xA);
            aVar.f(c0821xA);
        }
    }

    @Override // L.P0
    public O7.e b() {
        O7.e eVarA = B0.c.a(new c.InterfaceC0018c() { // from class: x.L0
            @Override // B0.c.InterfaceC0018c
            public final Object a(c.a aVar) {
                return N0.n(this.f46660a, aVar);
            }
        });
        AbstractC4862t.d(eVarA, "getFuture(...)");
        return eVarA;
    }

    @Override // L.AbstractC1088b
    public void f() {
        if (this.f46670h != null) {
            Log.w("Camera2PresenceSrc", "Monitoring already started. Unregistering existing callback.");
            g();
        }
        Log.i("Camera2PresenceSrc", "Starting system availability monitoring.");
        b bVar = new b();
        this.f46670h = bVar;
        y.t tVar = this.f46668f;
        Executor executor = this.f46669g;
        AbstractC4862t.b(bVar);
        tVar.g(executor, bVar);
        p(b());
    }

    @Override // L.AbstractC1088b
    public void g() {
        Log.i("Camera2PresenceSrc", "Stopping system availability monitoring.");
        CameraManager.AvailabilityCallback availabilityCallback = this.f46670h;
        if (availabilityCallback != null) {
            try {
                try {
                    this.f46668f.h(availabilityCallback);
                    C4015H c4015h = C4015H.f34254a;
                } catch (Exception e10) {
                    Log.w("Camera2PresenceSrc", "Failed to unregister system availability callback.", e10);
                }
            } finally {
                this.f46670h = null;
            }
        }
    }

    public final void p(O7.e eVar) {
        O.n.z(eVar);
    }
}
