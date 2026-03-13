package w;

import E.AbstractC0807p0;
import E.C0821x;
import L.a1;
import android.content.Context;
import android.content.pm.PackageManager;
import android.content.pm.ServiceInfo;
import android.graphics.SurfaceTexture;
import android.hardware.camera2.CameraCaptureSession;
import android.hardware.camera2.CameraDevice;
import android.hardware.camera2.CaptureRequest;
import android.hardware.camera2.params.DynamicRangeProfiles;
import android.hardware.camera2.params.OutputConfiguration;
import android.hardware.camera2.params.SessionConfiguration;
import android.media.ImageReader;
import android.media.MediaCodec;
import android.os.Bundle;
import android.util.Size;
import android.view.SurfaceHolder;
import d.AbstractC3782A;
import fc.C4029l;
import fc.InterfaceC4028k;
import gc.C4206t;
import gc.C4207u;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AbstractC4846c;
import kotlin.jvm.internal.AbstractC4854k;
import kotlin.jvm.internal.AbstractC4862t;
import vc.InterfaceC6082a;
import x.W0;
import y.C6369e;
import y.C6378n;
import y.t;
import z.AbstractC6483c;
import z.C6485e;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public final class k implements H.a {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final c f46075k = new c(null);

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final b f46076l = new b();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Context f46077c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f46078d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final t f46079e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final InterfaceC4028k f46080f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final InterfaceC4028k f46081g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final InterfaceC4028k f46082h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final InterfaceC4028k f46083i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final InterfaceC4028k f46084j;

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class b extends CameraCaptureSession.StateCallback {
        @Override // android.hardware.camera2.CameraCaptureSession.StateCallback
        public void onConfigureFailed(CameraCaptureSession p02) {
            AbstractC4862t.e(p02, "p0");
        }

        @Override // android.hardware.camera2.CameraCaptureSession.StateCallback
        public void onConfigured(CameraCaptureSession p02) {
            AbstractC4862t.e(p02, "p0");
        }
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class c {
        public /* synthetic */ c(AbstractC4854k abstractC4854k) {
            this();
        }

        public c() {
        }
    }

    public k(Context context, String cameraId, t cameraManagerCompat) {
        AbstractC4862t.e(context, "context");
        AbstractC4862t.e(cameraId, "cameraId");
        AbstractC4862t.e(cameraManagerCompat, "cameraManagerCompat");
        this.f46077c = context;
        this.f46078d = cameraId;
        this.f46079e = cameraManagerCompat;
        this.f46080f = C4029l.b(new InterfaceC6082a() { // from class: w.f
            @Override // vc.InterfaceC6082a
            public final Object invoke() {
                return k.j(this.f46070a);
            }
        });
        this.f46081g = C4029l.b(new InterfaceC6082a() { // from class: w.g
            @Override // vc.InterfaceC6082a
            public final Object invoke() {
                return k.k(this.f46071a);
            }
        });
        this.f46082h = C4029l.b(new InterfaceC6082a() { // from class: w.h
            @Override // vc.InterfaceC6082a
            public final Object invoke() {
                return k.i(this.f46072a);
            }
        });
        this.f46083i = C4029l.b(new InterfaceC6082a() { // from class: w.i
            @Override // vc.InterfaceC6082a
            public final Object invoke() {
                return k.m(this.f46073a);
            }
        });
        this.f46084j = C4029l.b(new InterfaceC6082a() { // from class: w.j
            @Override // vc.InterfaceC6082a
            public final Object invoke() {
                return Boolean.valueOf(k.u(this.f46074a));
            }
        });
    }

    public static final C6378n i(k kVar) throws C0821x {
        try {
            C6378n c6378nC = kVar.f46079e.c(kVar.f46078d);
            AbstractC4862t.b(c6378nC);
            return c6378nC;
        } catch (C6369e e10) {
            throw W0.a(e10);
        }
    }

    public static final Z.d j(k kVar) {
        return new Z.e(kVar.f46077c).a(kVar.f46078d);
    }

    public static final CameraDevice.CameraDeviceSetup k(k kVar) {
        if (kVar.f46079e.i().isCameraDeviceSetupSupported(kVar.f46078d)) {
            return kVar.f46079e.i().getCameraDeviceSetup(kVar.f46078d);
        }
        return null;
    }

    public static final DynamicRangeProfiles m(k kVar) {
        return C6485e.a(kVar.o()).d();
    }

    public static final boolean u(k kVar) {
        return AbstractC4862t.a(kVar.s(), Boolean.FALSE);
    }

    @Override // H.a
    public boolean b(a1 sessionConfig) throws Exception {
        AbstractC4862t.e(sessionConfig, "sessionConfig");
        List listL = l(sessionConfig);
        ArrayList arrayList = new ArrayList(C4207u.v(listL, 10));
        Iterator it = listL.iterator();
        while (it.hasNext()) {
            arrayList.add(((a) it.next()).a());
        }
        SessionConfiguration sessionConfigurationN = n(arrayList, sessionConfig);
        if (sessionConfigurationN == null) {
            return false;
        }
        int iA = q().a(sessionConfigurationN).a();
        AbstractC0807p0.a("FeatureCombinationQueryImpl", "isSupported: supported = " + iA + " for session config with " + x(sessionConfig));
        boolean z10 = iA == 1;
        Iterator it2 = listL.iterator();
        while (it2.hasNext()) {
            AbstractC3782A.a((AutoCloseable) it2.next());
        }
        return z10;
    }

    public final void h(OutputConfiguration outputConfiguration, a1.f fVar) {
        DynamicRangeProfiles dynamicRangeProfilesR = r();
        if (dynamicRangeProfilesR == null) {
            return;
        }
        Long lA = AbstractC6483c.a(fVar.b(), dynamicRangeProfilesR);
        if (lA == null) {
            throw new IllegalArgumentException("Required value was null.");
        }
        outputConfiguration.setDynamicRangeProfile(lA.longValue());
    }

    public final List l(a1 a1Var) {
        a aVarV;
        List<a1.f> listI = a1Var.i();
        AbstractC4862t.d(listI, "getOutputConfigs(...)");
        ArrayList arrayList = new ArrayList(C4207u.v(listI, 10));
        for (a1.f fVar : listI) {
            if (t()) {
                AbstractC4862t.b(fVar);
                aVarV = w(fVar);
            } else {
                AbstractC4862t.b(fVar);
                aVarV = v(fVar);
            }
            if (fVar.f().g() != null) {
                h(aVarV.a(), fVar);
            }
            arrayList.add(aVarV);
        }
        return arrayList;
    }

    public final SessionConfiguration n(List list, a1 a1Var) {
        SessionConfiguration sessionConfiguration = new SessionConfiguration(0, list, N.a.a(), f46076l);
        CameraDevice.CameraDeviceSetup cameraDeviceSetupP = p();
        if (cameraDeviceSetupP == null) {
            return null;
        }
        CaptureRequest.Builder builderCreateCaptureRequest = cameraDeviceSetupP.createCaptureRequest(a1Var.p());
        builderCreateCaptureRequest.set(CaptureRequest.CONTROL_AE_TARGET_FPS_RANGE, a1Var.e());
        if (a1Var.k().h() == 2) {
            builderCreateCaptureRequest.set(CaptureRequest.CONTROL_VIDEO_STABILIZATION_MODE, 2);
        }
        sessionConfiguration.setSessionParameters(builderCreateCaptureRequest.build());
        return sessionConfiguration;
    }

    public final C6378n o() {
        return (C6378n) this.f46082h.getValue();
    }

    public final CameraDevice.CameraDeviceSetup p() {
        return C6111e.a(this.f46081g.getValue());
    }

    public final Z.d q() {
        return (Z.d) this.f46080f.getValue();
    }

    public final DynamicRangeProfiles r() {
        return C6110d.a(this.f46083i.getValue());
    }

    public final Boolean s() {
        try {
            ServiceInfo[] serviceInfoArr = this.f46077c.getPackageManager().getPackageInfo(this.f46077c.getPackageName(), 132).services;
            if (serviceInfoArr == null) {
                return Boolean.FALSE;
            }
            Iterator itA = AbstractC4846c.a(serviceInfoArr);
            while (itA.hasNext()) {
                Bundle bundle = ((ServiceInfo) itA.next()).metaData;
                if (bundle != null && bundle.getString("androidx.camera.featurecombinationquery.PLAY_SERVICES_IMPL_PROVIDER_KEY") != null) {
                    return Boolean.TRUE;
                }
            }
            return Boolean.FALSE;
        } catch (PackageManager.NameNotFoundException unused) {
            return null;
        }
    }

    public final boolean t() {
        return ((Boolean) this.f46084j.getValue()).booleanValue();
    }

    public final a v(a1.f fVar) {
        Class clsG = fVar.f().g();
        long j10 = AbstractC4862t.a(clsG, MediaCodec.class) ? 65536L : AbstractC4862t.a(clsG, SurfaceHolder.class) ? 2048L : AbstractC4862t.a(clsG, SurfaceTexture.class) ? 256L : 0L;
        AbstractC0807p0.a("FeatureCombinationQueryImpl", "toConcreteOutputConfiguration: surface containerClass = " + fVar.f().g() + ", usageFlag = " + j10);
        ImageReader imageReaderNewInstance = ImageReader.newInstance(fVar.f().h().getWidth(), fVar.f().h().getHeight(), fVar.f().i(), 1, j10);
        AbstractC4862t.d(imageReaderNewInstance, "newInstance(...)");
        return new a(new OutputConfiguration(imageReaderNewInstance.getSurface()), imageReaderNewInstance);
    }

    public final a w(a1.f fVar) {
        OutputConfiguration outputConfigurationA;
        Class clsG = fVar.f().g();
        AbstractC0807p0.a("FeatureCombinationQueryImpl", "toDeferredOutputConfiguration: surface containerClass = " + fVar.f().g());
        if (clsG != null) {
            Size sizeH = fVar.f().h();
            if (sizeH == null) {
                throw new IllegalArgumentException("Required value was null.");
            }
            outputConfigurationA = new OutputConfiguration(sizeH, clsG);
        } else {
            AbstractC6109c.a();
            outputConfigurationA = AbstractC6108b.a(fVar.f().i(), fVar.f().h());
        }
        return new a(outputConfigurationA, null, 2, 0 == true ? 1 : 0);
    }

    public final String x(a1 a1Var) {
        StringBuilder sb2 = new StringBuilder();
        sb2.append("sessionParameters=[");
        sb2.append("fpsRange=" + a1Var.e());
        sb2.append(", previewStabilizationMode=" + a1Var.k().h());
        sb2.append("], ");
        sb2.append("outputConfigurations=[");
        List listI = a1Var.i();
        AbstractC4862t.d(listI, "getOutputConfigs(...)");
        int i10 = 0;
        for (Object obj : listI) {
            int i11 = i10 + 1;
            if (i10 < 0) {
                C4206t.u();
            }
            a1.f fVar = (a1.f) obj;
            if (i10 != 0) {
                sb2.append(",");
            }
            sb2.append("{format=" + fVar.f().i() + ", size=" + fVar.f().h() + ", dynamicRange=" + fVar.b() + ", class=" + fVar.f().g() + '}');
            i10 = i11;
        }
        sb2.append("]");
        String string = sb2.toString();
        AbstractC4862t.d(string, "toString(...)");
        return string;
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class a implements AutoCloseable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final OutputConfiguration f46085a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final ImageReader f46086b;

        public a(OutputConfiguration value, ImageReader imageReader) {
            AbstractC4862t.e(value, "value");
            this.f46085a = value;
            this.f46086b = imageReader;
        }

        public final OutputConfiguration a() {
            return this.f46085a;
        }

        @Override // java.lang.AutoCloseable
        public void close() {
            ImageReader imageReader = this.f46086b;
            if (imageReader != null) {
                imageReader.close();
            }
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return AbstractC4862t.a(this.f46085a, aVar.f46085a) && AbstractC4862t.a(this.f46086b, aVar.f46086b);
        }

        public int hashCode() {
            int iHashCode = this.f46085a.hashCode() * 31;
            ImageReader imageReader = this.f46086b;
            return iHashCode + (imageReader == null ? 0 : imageReader.hashCode());
        }

        public String toString() {
            return "CloseableOutputConfiguration(value=" + this.f46085a + ", backingImageReader=" + this.f46086b + ')';
        }

        public /* synthetic */ a(OutputConfiguration outputConfiguration, ImageReader imageReader, int i10, AbstractC4854k abstractC4854k) {
            this(outputConfiguration, (i10 & 2) != 0 ? null : imageReader);
        }
    }
}
