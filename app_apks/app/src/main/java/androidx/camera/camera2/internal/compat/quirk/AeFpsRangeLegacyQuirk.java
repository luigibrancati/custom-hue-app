package androidx.camera.camera2.internal.compat.quirk;

import L.e1;
import android.hardware.camera2.CameraCharacteristics;
import android.util.Range;
import androidx.camera.core.internal.compat.quirk.AeFpsRangeQuirk;
import y.C6378n;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public class AeFpsRangeLegacyQuirk implements AeFpsRangeQuirk {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Range f21934a;

    public AeFpsRangeLegacyQuirk(C6378n c6378n) {
        this.f21934a = f((Range[]) c6378n.a(CameraCharacteristics.CONTROL_AE_AVAILABLE_TARGET_FPS_RANGES));
    }

    public static boolean e(C6378n c6378n) {
        Integer num = (Integer) c6378n.a(CameraCharacteristics.INFO_SUPPORTED_HARDWARE_LEVEL);
        return num != null && num.intValue() == 2;
    }

    @Override // androidx.camera.core.internal.compat.quirk.AeFpsRangeQuirk
    public Range a() {
        Range range = this.f21934a;
        return range != null ? range : e1.f8057a;
    }

    public final Range d(Range range) {
        int iIntValue = ((Integer) range.getUpper()).intValue();
        int iIntValue2 = ((Integer) range.getLower()).intValue();
        if (((Integer) range.getUpper()).intValue() >= 1000) {
            iIntValue = ((Integer) range.getUpper()).intValue() / 1000;
        }
        if (((Integer) range.getLower()).intValue() >= 1000) {
            iIntValue2 = ((Integer) range.getLower()).intValue() / 1000;
        }
        return new Range(Integer.valueOf(iIntValue2), Integer.valueOf(iIntValue));
    }

    public final Range f(Range[] rangeArr) {
        Range range = null;
        if (rangeArr != null && rangeArr.length != 0) {
            for (Range range2 : rangeArr) {
                Range rangeD = d(range2);
                if (((Integer) rangeD.getUpper()).intValue() == 30 && (range == null || ((Integer) rangeD.getLower()).intValue() < ((Integer) range.getLower()).intValue())) {
                    range = rangeD;
                }
            }
        }
        return range;
    }
}
