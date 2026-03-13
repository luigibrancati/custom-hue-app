package A;

import E.AbstractC0807p0;
import L.U0;
import L.V0;
import L.X0;
import androidx.camera.camera2.internal.compat.quirk.AbnormalStreamWhenImageAnalysisBindWithTemplateRecordQuirk;
import androidx.camera.camera2.internal.compat.quirk.AeFpsRangeLegacyQuirk;
import androidx.camera.camera2.internal.compat.quirk.AfRegionFlipHorizontallyQuirk;
import androidx.camera.camera2.internal.compat.quirk.AspectRatioLegacyApi21Quirk;
import androidx.camera.camera2.internal.compat.quirk.CamcorderProfileResolutionQuirk;
import androidx.camera.camera2.internal.compat.quirk.CameraNoResponseWhenEnablingFlashQuirk;
import androidx.camera.camera2.internal.compat.quirk.CaptureNoResponseQuirk;
import androidx.camera.camera2.internal.compat.quirk.CaptureSessionStuckQuirk;
import androidx.camera.camera2.internal.compat.quirk.CaptureSessionStuckWhenCreatingBeforeClosingCameraQuirk;
import androidx.camera.camera2.internal.compat.quirk.ConfigureSurfaceToSecondarySessionFailQuirk;
import androidx.camera.camera2.internal.compat.quirk.FlashTooSlowQuirk;
import androidx.camera.camera2.internal.compat.quirk.ImageCaptureFailWithAutoFlashQuirk;
import androidx.camera.camera2.internal.compat.quirk.ImageCaptureFailedForVideoSnapshotQuirk;
import androidx.camera.camera2.internal.compat.quirk.ImageCaptureFailedWhenVideoCaptureIsBoundQuirk;
import androidx.camera.camera2.internal.compat.quirk.ImageCaptureFlashNotFireQuirk;
import androidx.camera.camera2.internal.compat.quirk.ImageCaptureWashedOutImageQuirk;
import androidx.camera.camera2.internal.compat.quirk.ImageCaptureWithFlashUnderexposureQuirk;
import androidx.camera.camera2.internal.compat.quirk.IncorrectCaptureStateQuirk;
import androidx.camera.camera2.internal.compat.quirk.JpegCaptureDownsizingQuirk;
import androidx.camera.camera2.internal.compat.quirk.JpegHalCorruptImageQuirk;
import androidx.camera.camera2.internal.compat.quirk.LegacyCameraOutputConfigNullPointerQuirk;
import androidx.camera.camera2.internal.compat.quirk.LegacyCameraSurfaceCleanupQuirk;
import androidx.camera.camera2.internal.compat.quirk.PreviewDelayWhenVideoCaptureIsBoundQuirk;
import androidx.camera.camera2.internal.compat.quirk.PreviewOrientationIncorrectQuirk;
import androidx.camera.camera2.internal.compat.quirk.PreviewStretchWhenVideoCaptureIsBoundQuirk;
import androidx.camera.camera2.internal.compat.quirk.TemporalNoiseQuirk;
import androidx.camera.camera2.internal.compat.quirk.TorchFlashRequiredFor3aUpdateQuirk;
import androidx.camera.camera2.internal.compat.quirk.YuvImageOnePixelShiftQuirk;
import java.util.ArrayList;
import y.C6378n;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public abstract class a {
    public static X0 a(String str, C6378n c6378n) {
        U0 u0A = V0.b().a();
        ArrayList arrayList = new ArrayList();
        if (u0A.a(AeFpsRangeLegacyQuirk.class, AeFpsRangeLegacyQuirk.e(c6378n))) {
            arrayList.add(new AeFpsRangeLegacyQuirk(c6378n));
        }
        if (u0A.a(AspectRatioLegacyApi21Quirk.class, AspectRatioLegacyApi21Quirk.e(c6378n))) {
            arrayList.add(new AspectRatioLegacyApi21Quirk());
        }
        if (u0A.a(JpegHalCorruptImageQuirk.class, JpegHalCorruptImageQuirk.d(c6378n))) {
            arrayList.add(new JpegHalCorruptImageQuirk());
        }
        if (u0A.a(JpegCaptureDownsizingQuirk.class, JpegCaptureDownsizingQuirk.d(c6378n))) {
            arrayList.add(new JpegCaptureDownsizingQuirk());
        }
        if (u0A.a(CamcorderProfileResolutionQuirk.class, CamcorderProfileResolutionQuirk.d(c6378n))) {
            arrayList.add(new CamcorderProfileResolutionQuirk(c6378n));
        }
        if (u0A.a(CaptureNoResponseQuirk.class, CaptureNoResponseQuirk.d(c6378n))) {
            arrayList.add(new CaptureNoResponseQuirk());
        }
        if (u0A.a(LegacyCameraOutputConfigNullPointerQuirk.class, LegacyCameraOutputConfigNullPointerQuirk.d(c6378n))) {
            arrayList.add(new LegacyCameraOutputConfigNullPointerQuirk());
        }
        if (u0A.a(LegacyCameraSurfaceCleanupQuirk.class, LegacyCameraSurfaceCleanupQuirk.d(c6378n))) {
            arrayList.add(new LegacyCameraSurfaceCleanupQuirk());
        }
        if (u0A.a(ImageCaptureWashedOutImageQuirk.class, ImageCaptureWashedOutImageQuirk.d(c6378n))) {
            arrayList.add(new ImageCaptureWashedOutImageQuirk());
        }
        if (u0A.a(CameraNoResponseWhenEnablingFlashQuirk.class, CameraNoResponseWhenEnablingFlashQuirk.d(c6378n))) {
            arrayList.add(new CameraNoResponseWhenEnablingFlashQuirk());
        }
        if (u0A.a(YuvImageOnePixelShiftQuirk.class, YuvImageOnePixelShiftQuirk.j(c6378n))) {
            arrayList.add(new YuvImageOnePixelShiftQuirk());
        }
        if (u0A.a(FlashTooSlowQuirk.class, FlashTooSlowQuirk.e(c6378n))) {
            arrayList.add(new FlashTooSlowQuirk());
        }
        if (u0A.a(AfRegionFlipHorizontallyQuirk.class, AfRegionFlipHorizontallyQuirk.d(c6378n))) {
            arrayList.add(new AfRegionFlipHorizontallyQuirk());
        }
        if (u0A.a(ConfigureSurfaceToSecondarySessionFailQuirk.class, ConfigureSurfaceToSecondarySessionFailQuirk.d(c6378n))) {
            arrayList.add(new ConfigureSurfaceToSecondarySessionFailQuirk());
        }
        if (u0A.a(PreviewOrientationIncorrectQuirk.class, PreviewOrientationIncorrectQuirk.d(c6378n))) {
            arrayList.add(new PreviewOrientationIncorrectQuirk());
        }
        if (u0A.a(CaptureSessionStuckQuirk.class, CaptureSessionStuckQuirk.d(c6378n))) {
            arrayList.add(new CaptureSessionStuckQuirk());
        }
        if (u0A.a(ImageCaptureFlashNotFireQuirk.class, ImageCaptureFlashNotFireQuirk.d(c6378n))) {
            arrayList.add(new ImageCaptureFlashNotFireQuirk());
        }
        if (u0A.a(ImageCaptureWithFlashUnderexposureQuirk.class, ImageCaptureWithFlashUnderexposureQuirk.d(c6378n))) {
            arrayList.add(new ImageCaptureWithFlashUnderexposureQuirk());
        }
        if (u0A.a(ImageCaptureFailWithAutoFlashQuirk.class, ImageCaptureFailWithAutoFlashQuirk.d(c6378n))) {
            arrayList.add(new ImageCaptureFailWithAutoFlashQuirk());
        }
        if (u0A.a(IncorrectCaptureStateQuirk.class, IncorrectCaptureStateQuirk.d(c6378n))) {
            arrayList.add(new IncorrectCaptureStateQuirk());
        }
        if (u0A.a(TorchFlashRequiredFor3aUpdateQuirk.class, TorchFlashRequiredFor3aUpdateQuirk.i(c6378n))) {
            arrayList.add(new TorchFlashRequiredFor3aUpdateQuirk(c6378n));
        }
        if (u0A.a(PreviewStretchWhenVideoCaptureIsBoundQuirk.class, PreviewStretchWhenVideoCaptureIsBoundQuirk.j())) {
            arrayList.add(new PreviewStretchWhenVideoCaptureIsBoundQuirk());
        }
        if (u0A.a(PreviewDelayWhenVideoCaptureIsBoundQuirk.class, PreviewDelayWhenVideoCaptureIsBoundQuirk.d())) {
            arrayList.add(new PreviewDelayWhenVideoCaptureIsBoundQuirk());
        }
        if (u0A.a(ImageCaptureFailedWhenVideoCaptureIsBoundQuirk.class, ImageCaptureFailedWhenVideoCaptureIsBoundQuirk.k())) {
            arrayList.add(new ImageCaptureFailedWhenVideoCaptureIsBoundQuirk());
        }
        if (u0A.a(TemporalNoiseQuirk.class, TemporalNoiseQuirk.e(c6378n))) {
            arrayList.add(new TemporalNoiseQuirk());
        }
        if (u0A.a(ImageCaptureFailedForVideoSnapshotQuirk.class, ImageCaptureFailedForVideoSnapshotQuirk.f())) {
            arrayList.add(new ImageCaptureFailedForVideoSnapshotQuirk());
        }
        if (u0A.a(CaptureSessionStuckWhenCreatingBeforeClosingCameraQuirk.class, CaptureSessionStuckWhenCreatingBeforeClosingCameraQuirk.d(c6378n))) {
            arrayList.add(new CaptureSessionStuckWhenCreatingBeforeClosingCameraQuirk());
        }
        if (u0A.a(AbnormalStreamWhenImageAnalysisBindWithTemplateRecordQuirk.class, AbnormalStreamWhenImageAnalysisBindWithTemplateRecordQuirk.e())) {
            arrayList.add(new AbnormalStreamWhenImageAnalysisBindWithTemplateRecordQuirk());
        }
        X0 x02 = new X0(arrayList);
        AbstractC0807p0.a("CameraQuirks", "camera2 CameraQuirks = " + X0.d(x02));
        return x02;
    }
}
