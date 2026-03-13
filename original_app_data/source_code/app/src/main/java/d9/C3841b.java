package d9;

import com.google.firebase.perf.v1.GaugeMetric;

/* JADX INFO: renamed from: d9.b, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public final class C3841b extends e {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final GaugeMetric f33168b;

    public C3841b(GaugeMetric gaugeMetric) {
        this.f33168b = gaugeMetric;
    }

    @Override // d9.e
    public boolean c() {
        if (!this.f33168b.hasSessionId()) {
            return false;
        }
        if (this.f33168b.getCpuMetricReadingsCount() > 0 || this.f33168b.getAndroidMemoryReadingsCount() > 0) {
            return true;
        }
        return this.f33168b.hasGaugeMetadata() && this.f33168b.getGaugeMetadata().hasMaxAppJavaHeapMemoryKb();
    }
}
