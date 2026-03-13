package x;

import android.hardware.camera2.CameraCaptureSession;
import android.view.Surface;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import x.U1;
import y.AbstractC6366b;
import y.AbstractC6368d;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public final class f2 extends U1.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f47000a;

    public f2(List list) {
        ArrayList arrayList = new ArrayList();
        this.f47000a = arrayList;
        arrayList.addAll(list);
    }

    public static U1.c x(U1.c... cVarArr) {
        return new f2(Arrays.asList(cVarArr));
    }

    @Override // x.U1.c
    public void p(U1 u12) {
        Iterator it = this.f47000a.iterator();
        while (it.hasNext()) {
            ((U1.c) it.next()).p(u12);
        }
    }

    @Override // x.U1.c
    public void q(U1 u12) {
        Iterator it = this.f47000a.iterator();
        while (it.hasNext()) {
            ((U1.c) it.next()).q(u12);
        }
    }

    @Override // x.U1.c
    public void r(U1 u12) {
        Iterator it = this.f47000a.iterator();
        while (it.hasNext()) {
            ((U1.c) it.next()).r(u12);
        }
    }

    @Override // x.U1.c
    public void s(U1 u12) {
        Iterator it = this.f47000a.iterator();
        while (it.hasNext()) {
            ((U1.c) it.next()).s(u12);
        }
    }

    @Override // x.U1.c
    public void t(U1 u12) {
        Iterator it = this.f47000a.iterator();
        while (it.hasNext()) {
            ((U1.c) it.next()).t(u12);
        }
    }

    @Override // x.U1.c
    public void u(U1 u12) {
        Iterator it = this.f47000a.iterator();
        while (it.hasNext()) {
            ((U1.c) it.next()).u(u12);
        }
    }

    @Override // x.U1.c
    public void v(U1 u12) {
        Iterator it = this.f47000a.iterator();
        while (it.hasNext()) {
            ((U1.c) it.next()).v(u12);
        }
    }

    @Override // x.U1.c
    public void w(U1 u12, Surface surface) {
        Iterator it = this.f47000a.iterator();
        while (it.hasNext()) {
            ((U1.c) it.next()).w(u12, surface);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static class a extends U1.c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final CameraCaptureSession.StateCallback f47001a;

        public a(CameraCaptureSession.StateCallback stateCallback) {
            this.f47001a = stateCallback;
        }

        @Override // x.U1.c
        public void p(U1 u12) {
            this.f47001a.onActive(u12.l().d());
        }

        @Override // x.U1.c
        public void q(U1 u12) {
            AbstractC6368d.a(this.f47001a, u12.l().d());
        }

        @Override // x.U1.c
        public void r(U1 u12) {
            this.f47001a.onClosed(u12.l().d());
        }

        @Override // x.U1.c
        public void s(U1 u12) {
            this.f47001a.onConfigureFailed(u12.l().d());
        }

        @Override // x.U1.c
        public void t(U1 u12) {
            this.f47001a.onConfigured(u12.l().d());
        }

        @Override // x.U1.c
        public void u(U1 u12) {
            this.f47001a.onReady(u12.l().d());
        }

        @Override // x.U1.c
        public void w(U1 u12, Surface surface) {
            AbstractC6366b.a(this.f47001a, u12.l().d(), surface);
        }

        public a(List list) {
            this(R0.a(list));
        }

        @Override // x.U1.c
        public void v(U1 u12) {
        }
    }
}
