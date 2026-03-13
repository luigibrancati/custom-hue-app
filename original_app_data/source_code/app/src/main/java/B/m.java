package B;

import E.AbstractC0807p0;
import android.util.Size;
import androidx.camera.camera2.internal.compat.quirk.ExtraSupportedOutputSizeQuirk;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public class m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f509a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ExtraSupportedOutputSizeQuirk f510b = (ExtraSupportedOutputSizeQuirk) A.d.b(ExtraSupportedOutputSizeQuirk.class);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e f511c;

    public m(String str) {
        this.f509a = str;
        this.f511c = new e(str);
    }

    public final void a(List list, int i10) {
        ExtraSupportedOutputSizeQuirk extraSupportedOutputSizeQuirk = this.f510b;
        if (extraSupportedOutputSizeQuirk == null) {
            return;
        }
        Size[] sizeArrD = extraSupportedOutputSizeQuirk.d(i10);
        if (sizeArrD.length > 0) {
            list.addAll(Arrays.asList(sizeArrD));
        }
    }

    public Size[] b(Size[] sizeArr, int i10) {
        ArrayList arrayList = new ArrayList(Arrays.asList(sizeArr));
        a(arrayList, i10);
        c(arrayList, i10);
        if (arrayList.isEmpty()) {
            AbstractC0807p0.l("OutputSizesCorrector", "Sizes array becomes empty after excluding problematic output sizes.");
        }
        return (Size[]) arrayList.toArray(new Size[0]);
    }

    public final void c(List list, int i10) {
        List listA = this.f511c.a(i10);
        if (listA.isEmpty()) {
            return;
        }
        list.removeAll(listA);
    }
}
