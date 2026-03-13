package E;

import L.C1092d;
import L.t1;
import kotlin.jvm.internal.AbstractC4862t;

/* JADX INFO: renamed from: E.z, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public final class C0825z implements InterfaceC0823y {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final L.W f3051a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final F.a f3052b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final t1 f3053c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final P.m f3054d;

    public C0825z(L.W cameraRepository, F.a cameraCoordinator, t1 useCaseConfigFactory, P.m streamSpecsCalculator) {
        AbstractC4862t.e(cameraRepository, "cameraRepository");
        AbstractC4862t.e(cameraCoordinator, "cameraCoordinator");
        AbstractC4862t.e(useCaseConfigFactory, "useCaseConfigFactory");
        AbstractC4862t.e(streamSpecsCalculator, "streamSpecsCalculator");
        this.f3051a = cameraRepository;
        this.f3052b = cameraCoordinator;
        this.f3053c = useCaseConfigFactory;
        this.f3054d = streamSpecsCalculator;
    }

    public static /* synthetic */ P.f d(C0825z c0825z, L.J j10, L.J j11, C1092d c1092d, C1092d c1092d2, I i10, I i11, int i12, Object obj) {
        if ((i12 & 2) != 0) {
            j11 = null;
        }
        if ((i12 & 8) != 0) {
            c1092d2 = null;
        }
        if ((i12 & 16) != 0) {
            i10 = I.f2784d;
        }
        if ((i12 & 32) != 0) {
            i11 = I.f2784d;
        }
        return c0825z.c(j10, j11, c1092d, c1092d2, i10, i11);
    }

    @Override // E.InterfaceC0823y
    public P.f a(String cameraId) {
        AbstractC4862t.e(cameraId, "cameraId");
        L.J jL = this.f3051a.l(cameraId);
        AbstractC4862t.d(jL, "getCamera(...)");
        return d(this, jL, null, new C1092d(jL.i(), L.E.a()), null, null, null, 58, null);
    }

    @Override // E.InterfaceC0823y
    public P.f b(L.J camera, L.J j10, C1092d adapterCameraInfo, C1092d c1092d, I compositionSettings, I secondaryCompositionSettings) {
        AbstractC4862t.e(camera, "camera");
        AbstractC4862t.e(adapterCameraInfo, "adapterCameraInfo");
        AbstractC4862t.e(compositionSettings, "compositionSettings");
        AbstractC4862t.e(secondaryCompositionSettings, "secondaryCompositionSettings");
        return c(camera, j10, adapterCameraInfo, c1092d, compositionSettings, secondaryCompositionSettings);
    }

    public final P.f c(L.J j10, L.J j11, C1092d c1092d, C1092d c1092d2, I i10, I i11) {
        return new P.f(j10, j11, c1092d, c1092d2, i10, i11, this.f3052b, this.f3054d, this.f3053c);
    }
}
