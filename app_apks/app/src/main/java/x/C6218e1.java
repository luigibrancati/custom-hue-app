package x;

import B0.c;
import E.AbstractC0807p0;
import L.AbstractC1109l0;
import L.AbstractC1114o;
import L.C1095e0;
import L.a1;
import android.hardware.camera2.CameraAccessException;
import android.hardware.camera2.CameraCaptureSession;
import android.hardware.camera2.CameraDevice;
import android.hardware.camera2.CaptureRequest;
import android.hardware.camera2.TotalCaptureResult;
import android.hardware.camera2.params.DynamicRangeProfiles;
import android.hardware.camera2.params.MultiResolutionStreamInfo;
import android.hardware.camera2.params.OutputConfiguration;
import android.os.Build;
import android.view.Surface;
import androidx.camera.camera2.internal.compat.quirk.CaptureNoResponseQuirk;
import androidx.camera.core.impl.utils.SurfaceUtil;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.CancellationException;
import s3.AbstractC5712a;
import w.C6107a;
import x.Q0;
import x.U1;
import x.f2;
import z.AbstractC6483c;
import z.C6485e;

/* JADX INFO: renamed from: x.e1, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public final class C6218e1 implements InterfaceC6221f1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f46966a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f46967b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final d f46968c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public U1.a f46969d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public U1 f46970e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public L.a1 f46971f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Map f46972g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public List f46973h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public c f46974i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public c f46975j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public O7.e f46976k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public c.a f46977l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public Map f46978m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final B.v f46979n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final B.z f46980o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final B.s f46981p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final C6485e f46982q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final B.y f46983r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final boolean f46984s;

    /* JADX INFO: renamed from: x.e1$b */
    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public class b extends CameraCaptureSession.CaptureCallback {
        public b() {
        }

        @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
        public void onCaptureCompleted(CameraCaptureSession cameraCaptureSession, CaptureRequest captureRequest, TotalCaptureResult totalCaptureResult) {
            synchronized (C6218e1.this.f46966a) {
                try {
                    L.a1 a1Var = C6218e1.this.f46971f;
                    if (a1Var == null) {
                        return;
                    }
                    C1095e0 c1095e0K = a1Var.k();
                    AbstractC0807p0.a("CaptureSession", "Submit FLASH_MODE_OFF request");
                    C6218e1 c6218e1 = C6218e1.this;
                    c6218e1.b(Collections.singletonList(c6218e1.f46980o.a(c1095e0K)));
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    /* JADX INFO: renamed from: x.e1$c */
    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public enum c {
        UNINITIALIZED,
        RELEASED,
        INITIALIZED,
        GET_SURFACE,
        RELEASING,
        CLOSED,
        OPENING,
        OPENED
    }

    /* JADX INFO: renamed from: x.e1$d */
    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public final class d extends U1.c {
        public d() {
        }

        @Override // x.U1.c
        public void s(U1 u12) {
            synchronized (C6218e1.this.f46966a) {
                try {
                    switch (C6218e1.this.f46975j) {
                        case UNINITIALIZED:
                        case INITIALIZED:
                        case GET_SURFACE:
                        case OPENED:
                            throw new IllegalStateException("onConfigureFailed() should not be possible in state: " + C6218e1.this.f46975j);
                        case RELEASED:
                            AbstractC0807p0.a("CaptureSession", "ConfigureFailed callback after change to RELEASED state");
                            break;
                        case RELEASING:
                        case CLOSED:
                        case OPENING:
                            C6218e1.this.s();
                            break;
                    }
                    AbstractC0807p0.c("CaptureSession", "CameraCaptureSession.onConfigureFailed() " + C6218e1.this.f46975j);
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        @Override // x.U1.c
        public void t(U1 u12) {
            synchronized (C6218e1.this.f46966a) {
                try {
                    switch (C6218e1.this.f46975j) {
                        case UNINITIALIZED:
                        case RELEASED:
                        case INITIALIZED:
                        case GET_SURFACE:
                        case OPENED:
                            throw new IllegalStateException("onConfigured() should not be possible in state: " + C6218e1.this.f46975j);
                        case RELEASING:
                            u12.close();
                            break;
                        case CLOSED:
                            C6218e1.this.f46970e = u12;
                            break;
                        case OPENING:
                            C6218e1.this.A(c.OPENED);
                            C6218e1.this.f46970e = u12;
                            AbstractC0807p0.a("CaptureSession", "Attempting to send capture request onConfigured");
                            C6218e1 c6218e1 = C6218e1.this;
                            c6218e1.y(c6218e1.f46971f);
                            C6218e1.this.x();
                            break;
                    }
                    AbstractC0807p0.a("CaptureSession", "CameraCaptureSession.onConfigured() mState=" + C6218e1.this.f46975j);
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        @Override // x.U1.c
        public void u(U1 u12) {
            synchronized (C6218e1.this.f46966a) {
                try {
                    if (C6218e1.this.f46975j.ordinal() == 0) {
                        throw new IllegalStateException("onReady() should not be possible in state: " + C6218e1.this.f46975j);
                    }
                    AbstractC0807p0.a("CaptureSession", "CameraCaptureSession.onReady() " + C6218e1.this.f46975j);
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        @Override // x.U1.c
        public void v(U1 u12) {
            synchronized (C6218e1.this.f46966a) {
                try {
                    if (C6218e1.this.f46975j == c.UNINITIALIZED) {
                        throw new IllegalStateException("onSessionFinished() should not be possible in state: " + C6218e1.this.f46975j);
                    }
                    AbstractC0807p0.a("CaptureSession", "onSessionFinished()");
                    C6218e1.this.s();
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    public C6218e1(C6485e c6485e) {
        this(c6485e, false);
    }

    public static /* synthetic */ void j(C6218e1 c6218e1) {
        synchronized (c6218e1.f46966a) {
            if (c6218e1.f46967b.isEmpty()) {
                return;
            }
            try {
                c6218e1.w(c6218e1.f46967b);
            } finally {
                c6218e1.f46967b.clear();
            }
        }
    }

    public static /* synthetic */ Object k(C6218e1 c6218e1, c.a aVar) {
        String str;
        synchronized (c6218e1.f46966a) {
            X0.h.j(c6218e1.f46977l == null, "Release completer expected to be null");
            c6218e1.f46977l = aVar;
            str = "Release[session=" + c6218e1 + "]";
        }
        return str;
    }

    public static /* synthetic */ void m(C6218e1 c6218e1, CameraCaptureSession cameraCaptureSession, int i10, boolean z10) {
        synchronized (c6218e1.f46966a) {
            try {
                if (c6218e1.f46975j == c.OPENED) {
                    c6218e1.y(c6218e1.f46971f);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public static Map r(Map map, Map map2) {
        HashMap map3 = new HashMap();
        for (Integer num : map.keySet()) {
            num.intValue();
            ArrayList arrayList = new ArrayList();
            int i10 = 0;
            for (a1.f fVar : (List) map.get(num)) {
                SurfaceUtil.a aVarA = SurfaceUtil.a((Surface) map2.get(fVar.f()));
                if (i10 == 0) {
                    i10 = aVarA.f22013a;
                }
                int i11 = aVarA.f22014b;
                int i12 = aVarA.f22015c;
                String strD = fVar.d();
                Objects.requireNonNull(strD);
                arrayList.add(new MultiResolutionStreamInfo(i11, i12, strD));
            }
            if (i10 == 0 || arrayList.isEmpty()) {
                AbstractC0807p0.c("CaptureSession", "Skips to create instances for multi-resolution output. imageFormat: " + i10 + ", streamInfos size: " + arrayList.size());
            } else {
                List listCreateInstancesForMultiResolutionOutput = OutputConfiguration.createInstancesForMultiResolutionOutput(arrayList, i10);
                if (listCreateInstancesForMultiResolutionOutput != null) {
                    for (a1.f fVar2 : (List) map.get(num)) {
                        OutputConfiguration outputConfiguration = (OutputConfiguration) listCreateInstancesForMultiResolutionOutput.remove(0);
                        outputConfiguration.addSurface((Surface) map2.get(fVar2.f()));
                        map3.put(fVar2, new z.i(outputConfiguration));
                    }
                }
            }
        }
        return map3;
    }

    public static Map v(Collection collection) {
        HashMap map = new HashMap();
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            a1.f fVar = (a1.f) it.next();
            if (fVar.g() > 0 && fVar.e().isEmpty()) {
                List arrayList = (List) map.get(Integer.valueOf(fVar.g()));
                if (arrayList == null) {
                    arrayList = new ArrayList();
                    map.put(Integer.valueOf(fVar.g()), arrayList);
                }
                arrayList.add(fVar);
            }
        }
        HashMap map2 = new HashMap();
        for (Integer num : map.keySet()) {
            num.intValue();
            if (((List) map.get(num)).size() >= 2) {
                map2.put(num, (List) map.get(num));
            }
        }
        return map2;
    }

    public final void A(c cVar) {
        if (cVar.ordinal() > this.f46974i.ordinal()) {
            this.f46974i = cVar;
        }
        this.f46975j = cVar;
        if (!AbstractC5712a.e() || this.f46974i.ordinal() < c.GET_SURFACE.ordinal()) {
            return;
        }
        AbstractC5712a.f("CX:C2State[" + String.format("CaptureSession@%x", Integer.valueOf(hashCode())) + "]", cVar.ordinal());
    }

    @Override // x.InterfaceC6221f1
    public O7.e a(final L.a1 a1Var, final CameraDevice cameraDevice, U1.a aVar) {
        synchronized (this.f46966a) {
            try {
                if (this.f46975j.ordinal() == 2) {
                    A(c.GET_SURFACE);
                    ArrayList arrayList = new ArrayList(a1Var.o());
                    this.f46973h = arrayList;
                    this.f46969d = aVar;
                    O.d dVarG = O.d.c(aVar.h(arrayList, 5000L)).g(new O.a() { // from class: x.b1
                        @Override // O.a
                        public final O7.e apply(Object obj) {
                            return this.f46892a.z((List) obj, a1Var, cameraDevice);
                        }
                    }, this.f46969d.getExecutor());
                    O.n.j(dVarG, new a(), this.f46969d.getExecutor());
                    return O.n.s(dVarG);
                }
                AbstractC0807p0.c("CaptureSession", "Open not allowed in state: " + this.f46975j);
                return O.n.n(new IllegalStateException("open() should not allow the state: " + this.f46975j));
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // x.InterfaceC6221f1
    public void b(List list) {
        synchronized (this.f46966a) {
            try {
                switch (this.f46975j) {
                    case UNINITIALIZED:
                        throw new IllegalStateException("issueCaptureRequests() should not be possible in state: " + this.f46975j);
                    case RELEASED:
                    case RELEASING:
                    case CLOSED:
                        throw new IllegalStateException("Cannot issue capture request on a closed/released session.");
                    case INITIALIZED:
                    case GET_SURFACE:
                    case OPENING:
                        this.f46967b.addAll(list);
                        break;
                    case OPENED:
                        this.f46967b.addAll(list);
                        x();
                        break;
                }
            } finally {
            }
        }
    }

    @Override // x.InterfaceC6221f1
    public void c(L.a1 a1Var) {
        synchronized (this.f46966a) {
            try {
                switch (this.f46975j) {
                    case UNINITIALIZED:
                        throw new IllegalStateException("setSessionConfig() should not be possible in state: " + this.f46975j);
                    case RELEASED:
                    case RELEASING:
                    case CLOSED:
                        throw new IllegalStateException("Session configuration cannot be set on a closed/released session.");
                    case INITIALIZED:
                    case GET_SURFACE:
                    case OPENING:
                        this.f46971f = a1Var;
                        break;
                    case OPENED:
                        this.f46971f = a1Var;
                        if (a1Var == null) {
                            return;
                        }
                        if (!this.f46972g.keySet().containsAll(a1Var.o())) {
                            AbstractC0807p0.c("CaptureSession", "Does not have the proper configured lists");
                            return;
                        } else {
                            AbstractC0807p0.a("CaptureSession", "Attempting to submit CaptureRequest after setting");
                            y(this.f46971f);
                        }
                        break;
                }
            } finally {
            }
        }
    }

    @Override // x.InterfaceC6221f1
    public void close() {
        synchronized (this.f46966a) {
            try {
                int iOrdinal = this.f46975j.ordinal();
                if (iOrdinal == 0) {
                    throw new IllegalStateException("close() should not be possible in state: " + this.f46975j);
                }
                if (iOrdinal == 2) {
                    A(c.RELEASED);
                } else if (iOrdinal == 3) {
                    X0.h.h(this.f46969d, "The Opener shouldn't null in state:" + this.f46975j);
                    this.f46969d.stop();
                    A(c.RELEASED);
                } else if (iOrdinal == 6 || iOrdinal == 7) {
                    X0.h.h(this.f46969d, "The Opener shouldn't null in state:" + this.f46975j);
                    this.f46969d.stop();
                    A(c.CLOSED);
                    this.f46981p.g();
                    this.f46971f = null;
                }
            } finally {
            }
        }
    }

    @Override // x.InterfaceC6221f1
    public boolean d() {
        boolean z10;
        synchronized (this.f46966a) {
            try {
                c cVar = this.f46975j;
                z10 = cVar == c.OPENED || cVar == c.OPENING;
            } finally {
            }
        }
        return z10;
    }

    @Override // x.InterfaceC6221f1
    public void e() {
        ArrayList<C1095e0> arrayList;
        synchronized (this.f46966a) {
            try {
                if (this.f46967b.isEmpty()) {
                    arrayList = null;
                } else {
                    arrayList = new ArrayList(this.f46967b);
                    this.f46967b.clear();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (arrayList != null) {
            for (C1095e0 c1095e0 : arrayList) {
                Iterator it = c1095e0.c().iterator();
                while (it.hasNext()) {
                    ((AbstractC1114o) it.next()).a(c1095e0.f());
                }
            }
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0054 A[Catch: all -> 0x001a, TryCatch #1 {, blocks: (B:4:0x0003, B:6:0x000b, B:29:0x008d, B:8:0x0010, B:11:0x0016, B:17:0x0025, B:16:0x001e, B:18:0x002a, B:20:0x0054, B:21:0x0058, B:23:0x005c, B:24:0x0067, B:25:0x0069, B:27:0x006b, B:28:0x0088, B:32:0x0094, B:33:0x00ac), top: B:38:0x0003, inners: #0 }] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x005c A[Catch: all -> 0x001a, TryCatch #1 {, blocks: (B:4:0x0003, B:6:0x000b, B:29:0x008d, B:8:0x0010, B:11:0x0016, B:17:0x0025, B:16:0x001e, B:18:0x002a, B:20:0x0054, B:21:0x0058, B:23:0x005c, B:24:0x0067, B:25:0x0069, B:27:0x006b, B:28:0x0088, B:32:0x0094, B:33:0x00ac), top: B:38:0x0003, inners: #0 }] */
    @Override // x.InterfaceC6221f1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public O7.e f(boolean r4) {
        /*
            r3 = this;
            java.lang.Object r0 = r3.f46966a
            monitor-enter(r0)
            x.e1$c r1 = r3.f46975j     // Catch: java.lang.Throwable -> L1a
            int r1 = r1.ordinal()     // Catch: java.lang.Throwable -> L1a
            if (r1 == 0) goto L94
            switch(r1) {
                case 2: goto L88;
                case 3: goto L6b;
                case 4: goto L58;
                case 5: goto L10;
                case 6: goto L2a;
                case 7: goto L10;
                default: goto Le;
            }     // Catch: java.lang.Throwable -> L1a
        Le:
            goto L8d
        L10:
            x.U1 r1 = r3.f46970e     // Catch: java.lang.Throwable -> L1a
            if (r1 == 0) goto L2a
            if (r4 == 0) goto L25
            r1.d()     // Catch: java.lang.Throwable -> L1a android.hardware.camera2.CameraAccessException -> L1d
            goto L25
        L1a:
            r3 = move-exception
            goto Lad
        L1d:
            r4 = move-exception
            java.lang.String r1 = "CaptureSession"
            java.lang.String r2 = "Unable to abort captures."
            E.AbstractC0807p0.d(r1, r2, r4)     // Catch: java.lang.Throwable -> L1a
        L25:
            x.U1 r4 = r3.f46970e     // Catch: java.lang.Throwable -> L1a
            r4.close()     // Catch: java.lang.Throwable -> L1a
        L2a:
            x.e1$c r4 = x.C6218e1.c.RELEASING     // Catch: java.lang.Throwable -> L1a
            r3.A(r4)     // Catch: java.lang.Throwable -> L1a
            B.s r4 = r3.f46981p     // Catch: java.lang.Throwable -> L1a
            r4.g()     // Catch: java.lang.Throwable -> L1a
            x.U1$a r4 = r3.f46969d     // Catch: java.lang.Throwable -> L1a
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L1a
            r1.<init>()     // Catch: java.lang.Throwable -> L1a
            java.lang.String r2 = "The Opener shouldn't null in state:"
            r1.append(r2)     // Catch: java.lang.Throwable -> L1a
            x.e1$c r2 = r3.f46975j     // Catch: java.lang.Throwable -> L1a
            r1.append(r2)     // Catch: java.lang.Throwable -> L1a
            java.lang.String r1 = r1.toString()     // Catch: java.lang.Throwable -> L1a
            X0.h.h(r4, r1)     // Catch: java.lang.Throwable -> L1a
            x.U1$a r4 = r3.f46969d     // Catch: java.lang.Throwable -> L1a
            boolean r4 = r4.stop()     // Catch: java.lang.Throwable -> L1a
            if (r4 == 0) goto L58
            r3.s()     // Catch: java.lang.Throwable -> L1a
            goto L8d
        L58:
            O7.e r4 = r3.f46976k     // Catch: java.lang.Throwable -> L1a
            if (r4 != 0) goto L67
            x.a1 r4 = new x.a1     // Catch: java.lang.Throwable -> L1a
            r4.<init>()     // Catch: java.lang.Throwable -> L1a
            O7.e r4 = B0.c.a(r4)     // Catch: java.lang.Throwable -> L1a
            r3.f46976k = r4     // Catch: java.lang.Throwable -> L1a
        L67:
            O7.e r3 = r3.f46976k     // Catch: java.lang.Throwable -> L1a
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L1a
            return r3
        L6b:
            x.U1$a r4 = r3.f46969d     // Catch: java.lang.Throwable -> L1a
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L1a
            r1.<init>()     // Catch: java.lang.Throwable -> L1a
            java.lang.String r2 = "The Opener shouldn't null in state:"
            r1.append(r2)     // Catch: java.lang.Throwable -> L1a
            x.e1$c r2 = r3.f46975j     // Catch: java.lang.Throwable -> L1a
            r1.append(r2)     // Catch: java.lang.Throwable -> L1a
            java.lang.String r1 = r1.toString()     // Catch: java.lang.Throwable -> L1a
            X0.h.h(r4, r1)     // Catch: java.lang.Throwable -> L1a
            x.U1$a r4 = r3.f46969d     // Catch: java.lang.Throwable -> L1a
            r4.stop()     // Catch: java.lang.Throwable -> L1a
        L88:
            x.e1$c r4 = x.C6218e1.c.RELEASED     // Catch: java.lang.Throwable -> L1a
            r3.A(r4)     // Catch: java.lang.Throwable -> L1a
        L8d:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L1a
            r3 = 0
            O7.e r3 = O.n.p(r3)
            return r3
        L94:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> L1a
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L1a
            r1.<init>()     // Catch: java.lang.Throwable -> L1a
            java.lang.String r2 = "release() should not be possible in state: "
            r1.append(r2)     // Catch: java.lang.Throwable -> L1a
            x.e1$c r3 = r3.f46975j     // Catch: java.lang.Throwable -> L1a
            r1.append(r3)     // Catch: java.lang.Throwable -> L1a
            java.lang.String r3 = r1.toString()     // Catch: java.lang.Throwable -> L1a
            r4.<init>(r3)     // Catch: java.lang.Throwable -> L1a
            throw r4     // Catch: java.lang.Throwable -> L1a
        Lad:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L1a
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: x.C6218e1.f(boolean):O7.e");
    }

    @Override // x.InterfaceC6221f1
    public List g() {
        List listUnmodifiableList;
        synchronized (this.f46966a) {
            listUnmodifiableList = Collections.unmodifiableList(this.f46967b);
        }
        return listUnmodifiableList;
    }

    @Override // x.InterfaceC6221f1
    public L.a1 h() {
        L.a1 a1Var;
        synchronized (this.f46966a) {
            a1Var = this.f46971f;
        }
        return a1Var;
    }

    @Override // x.InterfaceC6221f1
    public void i(Map map) {
        synchronized (this.f46966a) {
            this.f46978m = map;
        }
    }

    public final int p(List list, Q0 q02) {
        Q0 q03 = new Q0();
        Iterator it = list.iterator();
        int iK = -1;
        while (it.hasNext()) {
            CaptureRequest captureRequest = (CaptureRequest) it.next();
            U1 u12 = this.f46970e;
            Objects.requireNonNull(u12);
            List listG = u12.g(captureRequest);
            Iterator it2 = listG.iterator();
            while (it2.hasNext()) {
                q03.a((CaptureRequest) it2.next(), Collections.singletonList(new O1(captureRequest, q02)));
            }
            iK = this.f46970e.k(listG, q03);
        }
        return iK;
    }

    public final CameraCaptureSession.CaptureCallback q(List list, CameraCaptureSession.CaptureCallback... captureCallbackArr) {
        ArrayList arrayList = new ArrayList(list.size() + captureCallbackArr.length);
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(Z0.a((AbstractC1114o) it.next()));
        }
        Collections.addAll(arrayList, captureCallbackArr);
        return Z.a(arrayList);
    }

    public void s() {
        c cVar = this.f46975j;
        c cVar2 = c.RELEASED;
        if (cVar == cVar2) {
            AbstractC0807p0.a("CaptureSession", "Skipping finishClose due to being state RELEASED.");
            return;
        }
        A(cVar2);
        this.f46970e = null;
        c.a aVar = this.f46977l;
        if (aVar != null) {
            aVar.c(null);
            this.f46977l = null;
        }
    }

    public final z.i t(a1.f fVar, Map map, String str) {
        long jLongValue;
        DynamicRangeProfiles dynamicRangeProfilesD;
        Surface surface = (Surface) map.get(fVar.f());
        X0.h.h(surface, "Surface in OutputConfig not found in configuredSurfaceMap.");
        z.i iVar = new z.i(fVar.g(), surface);
        if (str != null) {
            iVar.f(str);
        } else {
            iVar.f(fVar.d());
        }
        if (fVar.c() == 0) {
            iVar.e(1);
        } else if (fVar.c() == 1) {
            iVar.e(2);
        }
        if (!fVar.e().isEmpty()) {
            iVar.b();
            Iterator it = fVar.e().iterator();
            while (it.hasNext()) {
                Surface surface2 = (Surface) map.get((AbstractC1109l0) it.next());
                X0.h.h(surface2, "Surface in OutputConfig not found in configuredSurfaceMap.");
                iVar.a(surface2);
            }
        }
        if (Build.VERSION.SDK_INT < 33 || (dynamicRangeProfilesD = this.f46982q.d()) == null) {
            jLongValue = 1;
        } else {
            E.J jB = fVar.b();
            Long lA = AbstractC6483c.a(jB, dynamicRangeProfilesD);
            if (lA == null) {
                AbstractC0807p0.c("CaptureSession", "Requested dynamic range is not supported. Defaulting to STANDARD dynamic range profile.\nRequested dynamic range:\n  " + jB);
                jLongValue = 1;
            } else {
                jLongValue = lA.longValue();
            }
        }
        iVar.d(jLongValue);
        return iVar;
    }

    public final List u(List list) {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            z.i iVar = (z.i) it.next();
            if (!arrayList.contains(iVar.c())) {
                arrayList.add(iVar.c());
                arrayList2.add(iVar);
            }
        }
        return arrayList2;
    }

    public int w(List list) {
        Q0 q02;
        ArrayList arrayList;
        boolean z10;
        synchronized (this.f46966a) {
            try {
                if (this.f46975j != c.OPENED) {
                    AbstractC0807p0.a("CaptureSession", "Skipping issueBurstCaptureRequest due to session closed");
                    return -1;
                }
                if (list.isEmpty()) {
                    return -1;
                }
                try {
                    q02 = new Q0();
                    arrayList = new ArrayList();
                    AbstractC0807p0.a("CaptureSession", "Issuing capture request.");
                    Iterator it = list.iterator();
                    z10 = false;
                    while (it.hasNext()) {
                        C1095e0 c1095e0 = (C1095e0) it.next();
                        if (c1095e0.i().isEmpty()) {
                            AbstractC0807p0.a("CaptureSession", "Skipping issuing empty capture request.");
                        } else {
                            Iterator it2 = c1095e0.i().iterator();
                            while (true) {
                                if (it2.hasNext()) {
                                    AbstractC1109l0 abstractC1109l0 = (AbstractC1109l0) it2.next();
                                    if (!this.f46972g.containsKey(abstractC1109l0)) {
                                        AbstractC0807p0.a("CaptureSession", "Skipping capture request with invalid surface: " + abstractC1109l0);
                                        break;
                                    }
                                } else {
                                    if (c1095e0.k() == 2) {
                                        z10 = true;
                                    }
                                    C1095e0.a aVarJ = C1095e0.a.j(c1095e0);
                                    if (c1095e0.k() == 5 && c1095e0.d() != null) {
                                        aVarJ.n(c1095e0.d());
                                    }
                                    L.a1 a1Var = this.f46971f;
                                    if (a1Var != null) {
                                        aVarJ.e(a1Var.k().g());
                                    }
                                    aVarJ.e(c1095e0.g());
                                    CaptureRequest captureRequestE = I0.e(aVarJ.h(), this.f46970e.e(), this.f46972g, false, this.f46983r);
                                    if (captureRequestE == null) {
                                        AbstractC0807p0.a("CaptureSession", "Skipping issuing request without surface.");
                                        return -1;
                                    }
                                    ArrayList arrayList2 = new ArrayList();
                                    Iterator it3 = c1095e0.c().iterator();
                                    while (it3.hasNext()) {
                                        Z0.b((AbstractC1114o) it3.next(), arrayList2);
                                    }
                                    q02.a(captureRequestE, arrayList2);
                                    arrayList.add(captureRequestE);
                                }
                            }
                        }
                    }
                } catch (CameraAccessException e10) {
                    AbstractC0807p0.c("CaptureSession", "Unable to access camera: " + e10.getMessage());
                    Thread.dumpStack();
                }
                if (arrayList.isEmpty()) {
                    AbstractC0807p0.a("CaptureSession", "Skipping issuing burst request due to no valid request elements");
                    return -1;
                }
                if (this.f46979n.a(arrayList, z10)) {
                    this.f46970e.n();
                    q02.c(new Q0.a() { // from class: x.d1
                        @Override // x.Q0.a
                        public final void a(CameraCaptureSession cameraCaptureSession, int i10, boolean z11) {
                            C6218e1.m(this.f46914a, cameraCaptureSession, i10, z11);
                        }
                    });
                }
                if (this.f46980o.b(arrayList, z10)) {
                    q02.a((CaptureRequest) arrayList.get(arrayList.size() - 1), Collections.singletonList(new b()));
                }
                L.a1 a1Var2 = this.f46971f;
                if (a1Var2 == null || a1Var2.m() != 1) {
                    return this.f46970e.k(arrayList, q02);
                }
                return p(arrayList, q02);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void x() {
        this.f46981p.e().b(new Runnable() { // from class: x.c1
            @Override // java.lang.Runnable
            public final void run() {
                C6218e1.j(this.f46902a);
            }
        }, N.a.a());
    }

    public int y(L.a1 a1Var) {
        synchronized (this.f46966a) {
            try {
            } catch (Throwable th) {
                throw th;
            }
            if (a1Var == null) {
                AbstractC0807p0.a("CaptureSession", "Skipping issueRepeatingCaptureRequests for no configuration case.");
                return -1;
            }
            if (this.f46975j != c.OPENED) {
                AbstractC0807p0.a("CaptureSession", "Skipping issueRepeatingCaptureRequests due to session closed");
                return -1;
            }
            C1095e0 c1095e0K = a1Var.k();
            if (c1095e0K.i().isEmpty()) {
                AbstractC0807p0.a("CaptureSession", "Skipping issueRepeatingCaptureRequests for no surface.");
                try {
                    this.f46970e.n();
                } catch (CameraAccessException e10) {
                    AbstractC0807p0.c("CaptureSession", "Unable to access camera: " + e10.getMessage());
                    Thread.dumpStack();
                }
                return -1;
            }
            try {
                AbstractC0807p0.a("CaptureSession", "Issuing request for session.");
                CaptureRequest captureRequestE = I0.e(c1095e0K, this.f46970e.e(), this.f46972g, true, this.f46983r);
                if (captureRequestE == null) {
                    AbstractC0807p0.a("CaptureSession", "Skipping issuing empty request for session.");
                    return -1;
                }
                CameraCaptureSession.CaptureCallback captureCallbackD = this.f46981p.d(q(c1095e0K.c(), new CameraCaptureSession.CaptureCallback[0]));
                if (a1Var.m() != 1) {
                    return this.f46970e.f(captureRequestE, captureCallbackD);
                }
                return this.f46970e.j(this.f46970e.g(captureRequestE), captureCallbackD);
            } catch (CameraAccessException e11) {
                AbstractC0807p0.c("CaptureSession", "Unable to access camera: " + e11.getMessage());
                Thread.dumpStack();
                return -1;
            }
            throw th;
        }
    }

    public final O7.e z(List list, L.a1 a1Var, CameraDevice cameraDevice) {
        synchronized (this.f46966a) {
            try {
                int iOrdinal = this.f46975j.ordinal();
                if (iOrdinal == 0 || iOrdinal == 7 || iOrdinal == 2) {
                    return O.n.n(new IllegalStateException("openCaptureSession() should not be possible in state: " + this.f46975j));
                }
                if (iOrdinal != 3) {
                    return O.n.n(new CancellationException("openCaptureSession() not execute in state: " + this.f46975j));
                }
                this.f46972g.clear();
                for (int i10 = 0; i10 < list.size(); i10++) {
                    this.f46972g.put((AbstractC1109l0) this.f46973h.get(i10), (Surface) list.get(i10));
                }
                A(c.OPENING);
                AbstractC0807p0.a("CaptureSession", "Opening capture session.");
                U1.c cVarX = f2.x(this.f46968c, new f2.a(a1Var.l()));
                C6107a c6107a = new C6107a(a1Var.g());
                C1095e0.a aVarJ = C1095e0.a.j(a1Var.k());
                Map map = new HashMap();
                if (this.f46984s && Build.VERSION.SDK_INT >= 35) {
                    map = r(v(a1Var.i()), this.f46972g);
                }
                ArrayList arrayList = new ArrayList();
                String strH0 = c6107a.h0(null);
                for (a1.f fVar : a1Var.i()) {
                    z.i iVarT = (!this.f46984s || Build.VERSION.SDK_INT < 35) ? null : (z.i) map.get(fVar);
                    if (iVarT == null) {
                        iVarT = t(fVar, this.f46972g, strH0);
                        if (this.f46978m.containsKey(fVar.f())) {
                            iVarT.g(((Long) this.f46978m.get(fVar.f())).longValue());
                        }
                    }
                    arrayList.add(iVarT);
                }
                z.o oVarB = this.f46969d.b(a1Var.m(), u(arrayList), cVarX);
                if (a1Var.p() == 5 && a1Var.h() != null) {
                    oVarB.a(z.h.b(a1Var.h()));
                }
                try {
                    CaptureRequest captureRequestF = I0.f(aVarJ.h(), cameraDevice, this.f46983r);
                    if (captureRequestF != null) {
                        oVarB.b(captureRequestF);
                    }
                    return this.f46969d.i(cameraDevice, oVarB, this.f46973h);
                } catch (CameraAccessException e10) {
                    return O.n.n(e10);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public C6218e1(C6485e c6485e, boolean z10) {
        this(c6485e, new L.X0(Collections.EMPTY_LIST), z10, null);
    }

    public C6218e1(C6485e c6485e, L.X0 x02, D.i iVar) {
        this(c6485e, x02, false, iVar);
    }

    public C6218e1(C6485e c6485e, L.X0 x02, boolean z10, D.i iVar) {
        this.f46966a = new Object();
        this.f46967b = new ArrayList();
        this.f46972g = new HashMap();
        this.f46973h = Collections.EMPTY_LIST;
        c cVar = c.UNINITIALIZED;
        this.f46974i = cVar;
        this.f46975j = cVar;
        this.f46978m = new HashMap();
        this.f46979n = new B.v();
        this.f46980o = new B.z();
        A(c.INITIALIZED);
        this.f46982q = c6485e;
        this.f46968c = new d();
        this.f46981p = new B.s(x02.a(CaptureNoResponseQuirk.class));
        this.f46983r = new B.y(x02);
        this.f46984s = z10;
    }

    /* JADX INFO: renamed from: x.e1$a */
    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public class a implements O.c {
        public a() {
        }

        @Override // O.c
        public void a(Throwable th) {
            synchronized (C6218e1.this.f46966a) {
                try {
                    C6218e1.this.f46969d.stop();
                    int iOrdinal = C6218e1.this.f46975j.ordinal();
                    if ((iOrdinal == 4 || iOrdinal == 5 || iOrdinal == 6) && !(th instanceof CancellationException)) {
                        AbstractC0807p0.m("CaptureSession", "Opening session with fail " + C6218e1.this.f46975j, th);
                        C6218e1.this.s();
                    }
                } finally {
                }
            }
        }

        @Override // O.c
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void onSuccess(Void r12) {
        }
    }
}
