package y;

import android.hardware.camera2.params.StreamConfigurationMap;
import android.util.Size;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public class z extends AbstractC6364A {
    public z(StreamConfigurationMap streamConfigurationMap) {
        super(streamConfigurationMap);
    }

    @Override // y.y.a
    public long b(int i10, Size size) {
        return this.f48307a.getOutputMinFrameDuration(i10, size);
    }

    @Override // y.y.a
    public Size[] c(int i10) {
        return this.f48307a.getOutputSizes(i10);
    }
}
