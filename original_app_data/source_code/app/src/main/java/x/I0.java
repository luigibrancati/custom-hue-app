package x;

import D.l;
import E.AbstractC0807p0;
import L.AbstractC1109l0;
import L.C1095e0;
import L.InterfaceC1099g0;
import L.InterfaceC1133y;
import android.hardware.camera2.CameraAccessException;
import android.hardware.camera2.CameraDevice;
import android.hardware.camera2.CaptureRequest;
import android.hardware.camera2.TotalCaptureResult;
import android.util.Range;
import android.view.Surface;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public abstract class I0 {

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static class a {
        public static CaptureRequest.Builder a(CameraDevice cameraDevice, TotalCaptureResult totalCaptureResult) {
            return cameraDevice.createReprocessCaptureRequest(totalCaptureResult);
        }
    }

    public static void a(C1095e0 c1095e0, CaptureRequest.Builder builder) {
        Range rangeE = c1095e0.e();
        if (!rangeE.equals(L.e1.f8057a)) {
            builder.set(CaptureRequest.CONTROL_AE_TARGET_FPS_RANGE, rangeE);
        }
        AbstractC0807p0.a("Camera2CaptureRequestBuilder", "applyAeFpsRange: expectedFrameRateRange = " + rangeE);
    }

    public static void b(CaptureRequest.Builder builder, InterfaceC1099g0 interfaceC1099g0) {
        D.l lVarD = l.a.e(interfaceC1099g0).d();
        for (InterfaceC1099g0.a aVar : lVarD.b()) {
            CaptureRequest.Key key = (CaptureRequest.Key) aVar.d();
            try {
                builder.set(key, lVarD.a(aVar));
            } catch (IllegalArgumentException unused) {
                AbstractC0807p0.c("Camera2CaptureRequestBuilder", "CaptureRequest.Key is not supported: " + key);
            }
        }
    }

    public static void c(CaptureRequest.Builder builder, int i10, B.y yVar) {
        for (Map.Entry entry : yVar.a(i10).entrySet()) {
            builder.set((CaptureRequest.Key) entry.getKey(), entry.getValue());
        }
    }

    public static void d(C1095e0 c1095e0, CaptureRequest.Builder builder) {
        Integer numH = h(c1095e0);
        if (numH != null) {
            builder.set(CaptureRequest.CONTROL_VIDEO_STABILIZATION_MODE, numH);
        }
        AbstractC0807p0.a("Camera2CaptureRequestBuilder", "applyVideoStabilization: mode = " + numH);
    }

    public static CaptureRequest e(C1095e0 c1095e0, CameraDevice cameraDevice, Map map, boolean z10, B.y yVar) throws CameraAccessException {
        CaptureRequest.Builder builderCreateCaptureRequest;
        if (cameraDevice == null) {
            return null;
        }
        List listG = g(c1095e0.i(), map);
        if (listG.isEmpty()) {
            return null;
        }
        InterfaceC1133y interfaceC1133yD = c1095e0.d();
        if (c1095e0.k() == 5 && interfaceC1133yD != null && (interfaceC1133yD.e() instanceof TotalCaptureResult)) {
            AbstractC0807p0.a("Camera2CaptureRequestBuilder", "createReprocessCaptureRequest");
            builderCreateCaptureRequest = a.a(cameraDevice, (TotalCaptureResult) interfaceC1133yD.e());
        } else {
            AbstractC0807p0.a("Camera2CaptureRequestBuilder", "createCaptureRequest");
            if (c1095e0.k() == 5) {
                builderCreateCaptureRequest = cameraDevice.createCaptureRequest(z10 ? 1 : 2);
            } else {
                builderCreateCaptureRequest = cameraDevice.createCaptureRequest(c1095e0.k());
            }
        }
        c(builderCreateCaptureRequest, c1095e0.k(), yVar);
        a(c1095e0, builderCreateCaptureRequest);
        d(c1095e0, builderCreateCaptureRequest);
        InterfaceC1099g0 interfaceC1099g0G = c1095e0.g();
        InterfaceC1099g0.a aVar = C1095e0.f8038i;
        if (interfaceC1099g0G.d(aVar)) {
            builderCreateCaptureRequest.set(CaptureRequest.JPEG_ORIENTATION, (Integer) c1095e0.g().a(aVar));
        }
        InterfaceC1099g0 interfaceC1099g0G2 = c1095e0.g();
        InterfaceC1099g0.a aVar2 = C1095e0.f8039j;
        if (interfaceC1099g0G2.d(aVar2)) {
            builderCreateCaptureRequest.set(CaptureRequest.JPEG_QUALITY, Byte.valueOf(((Integer) c1095e0.g().a(aVar2)).byteValue()));
        }
        b(builderCreateCaptureRequest, c1095e0.g());
        Iterator it = listG.iterator();
        while (it.hasNext()) {
            builderCreateCaptureRequest.addTarget((Surface) it.next());
        }
        builderCreateCaptureRequest.setTag(c1095e0.j());
        return builderCreateCaptureRequest.build();
    }

    public static CaptureRequest f(C1095e0 c1095e0, CameraDevice cameraDevice, B.y yVar) throws CameraAccessException {
        if (cameraDevice == null) {
            return null;
        }
        AbstractC0807p0.a("Camera2CaptureRequestBuilder", "template type = " + c1095e0.k());
        CaptureRequest.Builder builderCreateCaptureRequest = cameraDevice.createCaptureRequest(c1095e0.k());
        c(builderCreateCaptureRequest, c1095e0.k(), yVar);
        a(c1095e0, builderCreateCaptureRequest);
        b(builderCreateCaptureRequest, c1095e0.g());
        return builderCreateCaptureRequest.build();
    }

    public static List g(List list, Map map) {
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            Surface surface = (Surface) map.get((AbstractC1109l0) it.next());
            if (surface == null) {
                throw new IllegalArgumentException("DeferrableSurface not in configuredSurfaceMap");
            }
            arrayList.add(surface);
        }
        return arrayList;
    }

    public static Integer h(C1095e0 c1095e0) {
        if (c1095e0.h() == 1 || c1095e0.l() == 1) {
            return 0;
        }
        if (c1095e0.h() == 2) {
            return 2;
        }
        return c1095e0.l() == 2 ? 1 : null;
    }
}
