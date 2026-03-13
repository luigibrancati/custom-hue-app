package A;

import L.U0;
import androidx.camera.camera2.internal.compat.quirk.CaptureSessionOnClosedNotCalledQuirk;
import androidx.camera.camera2.internal.compat.quirk.CaptureSessionShouldUseMrirQuirk;
import androidx.camera.camera2.internal.compat.quirk.CrashWhenTakingPhotoWithAutoFlashAEModeQuirk;
import androidx.camera.camera2.internal.compat.quirk.ExcludedSupportedSizesQuirk;
import androidx.camera.camera2.internal.compat.quirk.ExtraCroppingQuirk;
import androidx.camera.camera2.internal.compat.quirk.ExtraSupportedOutputSizeQuirk;
import androidx.camera.camera2.internal.compat.quirk.ExtraSupportedSurfaceCombinationsQuirk;
import androidx.camera.camera2.internal.compat.quirk.FlashAvailabilityBufferUnderflowQuirk;
import androidx.camera.camera2.internal.compat.quirk.ImageCapturePixelHDRPlusQuirk;
import androidx.camera.camera2.internal.compat.quirk.InvalidVideoProfilesQuirk;
import androidx.camera.camera2.internal.compat.quirk.Nexus4AndroidLTargetAspectRatioQuirk;
import androidx.camera.camera2.internal.compat.quirk.Preview3AThreadCrashQuirk;
import androidx.camera.camera2.internal.compat.quirk.PreviewPixelHDRnetQuirk;
import androidx.camera.camera2.internal.compat.quirk.PreviewUnderExposureQuirk;
import androidx.camera.camera2.internal.compat.quirk.RepeatingStreamConstraintForVideoRecordingQuirk;
import androidx.camera.camera2.internal.compat.quirk.SmallDisplaySizeQuirk;
import androidx.camera.camera2.internal.compat.quirk.StillCaptureFlashStopRepeatingQuirk;
import androidx.camera.camera2.internal.compat.quirk.TextureViewIsClosedQuirk;
import androidx.camera.camera2.internal.compat.quirk.TorchIsClosedAfterImageCapturingQuirk;
import androidx.camera.camera2.internal.compat.quirk.ZslDisablerQuirk;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public abstract class e {
    public static List a(U0 u02) {
        ArrayList arrayList = new ArrayList();
        if (u02.a(ImageCapturePixelHDRPlusQuirk.class, ImageCapturePixelHDRPlusQuirk.d())) {
            arrayList.add(new ImageCapturePixelHDRPlusQuirk());
        }
        if (u02.a(ExtraCroppingQuirk.class, ExtraCroppingQuirk.f())) {
            arrayList.add(new ExtraCroppingQuirk());
        }
        if (u02.a(Nexus4AndroidLTargetAspectRatioQuirk.class, Nexus4AndroidLTargetAspectRatioQuirk.e())) {
            arrayList.add(new Nexus4AndroidLTargetAspectRatioQuirk());
        }
        if (u02.a(ExcludedSupportedSizesQuirk.class, ExcludedSupportedSizesQuirk.u())) {
            arrayList.add(new ExcludedSupportedSizesQuirk());
        }
        if (u02.a(CrashWhenTakingPhotoWithAutoFlashAEModeQuirk.class, CrashWhenTakingPhotoWithAutoFlashAEModeQuirk.d())) {
            arrayList.add(new CrashWhenTakingPhotoWithAutoFlashAEModeQuirk());
        }
        if (u02.a(PreviewPixelHDRnetQuirk.class, PreviewPixelHDRnetQuirk.d())) {
            arrayList.add(new PreviewPixelHDRnetQuirk());
        }
        if (u02.a(StillCaptureFlashStopRepeatingQuirk.class, StillCaptureFlashStopRepeatingQuirk.d())) {
            arrayList.add(new StillCaptureFlashStopRepeatingQuirk());
        }
        if (u02.a(ExtraSupportedSurfaceCombinationsQuirk.class, ExtraSupportedSurfaceCombinationsQuirk.i())) {
            arrayList.add(new ExtraSupportedSurfaceCombinationsQuirk());
        }
        if (u02.a(FlashAvailabilityBufferUnderflowQuirk.class, FlashAvailabilityBufferUnderflowQuirk.e())) {
            arrayList.add(new FlashAvailabilityBufferUnderflowQuirk());
        }
        if (u02.a(RepeatingStreamConstraintForVideoRecordingQuirk.class, RepeatingStreamConstraintForVideoRecordingQuirk.e())) {
            arrayList.add(new RepeatingStreamConstraintForVideoRecordingQuirk());
        }
        if (u02.a(TextureViewIsClosedQuirk.class, TextureViewIsClosedQuirk.d())) {
            arrayList.add(new TextureViewIsClosedQuirk());
        }
        if (u02.a(CaptureSessionOnClosedNotCalledQuirk.class, CaptureSessionOnClosedNotCalledQuirk.d())) {
            arrayList.add(new CaptureSessionOnClosedNotCalledQuirk());
        }
        if (u02.a(TorchIsClosedAfterImageCapturingQuirk.class, TorchIsClosedAfterImageCapturingQuirk.d())) {
            arrayList.add(new TorchIsClosedAfterImageCapturingQuirk());
        }
        if (u02.a(ZslDisablerQuirk.class, ZslDisablerQuirk.g())) {
            arrayList.add(new ZslDisablerQuirk());
        }
        if (u02.a(ExtraSupportedOutputSizeQuirk.class, ExtraSupportedOutputSizeQuirk.g())) {
            arrayList.add(new ExtraSupportedOutputSizeQuirk());
        }
        if (u02.a(InvalidVideoProfilesQuirk.class, InvalidVideoProfilesQuirk.q())) {
            arrayList.add(new InvalidVideoProfilesQuirk());
        }
        if (u02.a(Preview3AThreadCrashQuirk.class, Preview3AThreadCrashQuirk.d())) {
            arrayList.add(new Preview3AThreadCrashQuirk());
        }
        if (u02.a(SmallDisplaySizeQuirk.class, SmallDisplaySizeQuirk.e())) {
            arrayList.add(new SmallDisplaySizeQuirk());
        }
        if (u02.a(PreviewUnderExposureQuirk.class, PreviewUnderExposureQuirk.d())) {
            arrayList.add(PreviewUnderExposureQuirk.f21961a);
        }
        if (u02.a(CaptureSessionShouldUseMrirQuirk.class, CaptureSessionShouldUseMrirQuirk.d())) {
            arrayList.add(new CaptureSessionShouldUseMrirQuirk());
        }
        return arrayList;
    }
}
