package B;

import B.s;
import B0.c;
import android.hardware.camera2.CameraCaptureSession;
import android.hardware.camera2.CaptureFailure;
import android.hardware.camera2.CaptureRequest;
import android.hardware.camera2.TotalCaptureResult;
import android.util.Log;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Objects;
import s.InterfaceC5702a;
import x.Z;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public class s {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f519a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f520b = Collections.synchronizedList(new ArrayList());

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static class a extends CameraCaptureSession.CaptureCallback {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final O7.e f521a = B0.c.a(new c.InterfaceC0018c() { // from class: B.r
            @Override // B0.c.InterfaceC0018c
            public final Object a(c.a aVar) {
                return s.a.a(this.f518a, aVar);
            }
        });

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public c.a f522b;

        public static /* synthetic */ Object a(a aVar, c.a aVar2) {
            aVar.f522b = aVar2;
            return "RequestCompleteListener[" + aVar + "]";
        }

        public final void b() {
            c.a aVar = this.f522b;
            if (aVar != null) {
                aVar.c(null);
                this.f522b = null;
            }
        }

        @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
        public void onCaptureCompleted(CameraCaptureSession cameraCaptureSession, CaptureRequest captureRequest, TotalCaptureResult totalCaptureResult) {
            b();
        }

        @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
        public void onCaptureFailed(CameraCaptureSession cameraCaptureSession, CaptureRequest captureRequest, CaptureFailure captureFailure) {
            b();
        }

        @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
        public void onCaptureSequenceAborted(CameraCaptureSession cameraCaptureSession, int i10) {
            b();
        }

        @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
        public void onCaptureSequenceCompleted(CameraCaptureSession cameraCaptureSession, int i10, long j10) {
            b();
        }

        @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
        public void onCaptureStarted(CameraCaptureSession cameraCaptureSession, CaptureRequest captureRequest, long j10, long j11) {
            b();
        }
    }

    public s(boolean z10) {
        this.f519a = z10;
    }

    public static /* synthetic */ void a(s sVar, a aVar, O7.e eVar) {
        sVar.getClass();
        Log.d("RequestMonitor", "RequestListener " + aVar + " done " + sVar);
        sVar.f520b.remove(eVar);
    }

    public static /* synthetic */ Void b(List list) {
        return null;
    }

    public final CameraCaptureSession.CaptureCallback c() {
        final a aVar = new a();
        final O7.e eVar = aVar.f521a;
        this.f520b.add(eVar);
        Log.d("RequestMonitor", "RequestListener " + aVar + " monitoring " + this);
        eVar.b(new Runnable() { // from class: B.p
            @Override // java.lang.Runnable
            public final void run() {
                s.a(this.f515a, aVar, eVar);
            }
        }, N.a.a());
        return aVar;
    }

    public CameraCaptureSession.CaptureCallback d(CameraCaptureSession.CaptureCallback captureCallback) {
        return f() ? Z.b(c(), captureCallback) : captureCallback;
    }

    public O7.e e() {
        return this.f520b.isEmpty() ? O.n.p(null) : O.n.s(O.n.x(O.n.w(new ArrayList(this.f520b)), new InterfaceC5702a() { // from class: B.q
            @Override // s.InterfaceC5702a
            public final Object apply(Object obj) {
                return s.b((List) obj);
            }
        }, N.a.a()));
    }

    public boolean f() {
        return this.f519a;
    }

    public void g() {
        LinkedList linkedList = new LinkedList(this.f520b);
        while (!linkedList.isEmpty()) {
            O7.e eVar = (O7.e) linkedList.poll();
            Objects.requireNonNull(eVar);
            eVar.cancel(true);
        }
    }
}
