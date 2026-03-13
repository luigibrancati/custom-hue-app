package z;

import android.hardware.camera2.params.OutputConfiguration;
import android.view.Surface;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public class m extends l {
    public m(int i10, Surface surface) {
        this(new OutputConfiguration(i10, surface));
    }

    public static m i(OutputConfiguration outputConfiguration) {
        return new m(outputConfiguration);
    }

    @Override // z.n, z.i.a
    public void a(long j10) {
        if (j10 == -1) {
            return;
        }
        ((OutputConfiguration) g()).setStreamUseCase(j10);
    }

    @Override // z.k, z.i.a
    public /* bridge */ /* synthetic */ void b(Surface surface) {
        super.b(surface);
    }

    @Override // z.l, z.i.a
    public void c(long j10) {
        ((OutputConfiguration) g()).setDynamicRangeProfile(j10);
    }

    @Override // z.l, z.i.a
    public /* bridge */ /* synthetic */ void d(String str) {
        super.d(str);
    }

    @Override // z.k, z.i.a
    public /* bridge */ /* synthetic */ void e() {
        super.e();
    }

    @Override // z.n
    public /* bridge */ /* synthetic */ boolean equals(Object obj) {
        return super.equals(obj);
    }

    @Override // z.n, z.i.a
    public void f(int i10) {
        ((OutputConfiguration) g()).setMirrorMode(i10);
    }

    @Override // z.l, z.k, z.j, z.i.a
    public Object g() {
        X0.h.a(this.f48675a instanceof OutputConfiguration);
        return this.f48675a;
    }

    @Override // z.j, z.i.a
    public /* bridge */ /* synthetic */ Surface getSurface() {
        return super.getSurface();
    }

    @Override // z.n
    public /* bridge */ /* synthetic */ int hashCode() {
        return super.hashCode();
    }

    public m(Object obj) {
        super(obj);
    }
}
