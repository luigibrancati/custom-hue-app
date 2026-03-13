package z;

import android.hardware.camera2.params.OutputConfiguration;
import android.view.Surface;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public class l extends k {

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final OutputConfiguration f48673a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public long f48674b = 1;

        public a(OutputConfiguration outputConfiguration) {
            this.f48673a = outputConfiguration;
        }

        public boolean equals(Object obj) {
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return Objects.equals(this.f48673a, aVar.f48673a) && this.f48674b == aVar.f48674b;
        }

        public int hashCode() {
            int iHashCode = this.f48673a.hashCode() ^ 31;
            return Long.hashCode(this.f48674b) ^ ((iHashCode << 5) - iHashCode);
        }
    }

    public l(int i10, Surface surface) {
        this(new a(new OutputConfiguration(i10, surface)));
    }

    public static l h(OutputConfiguration outputConfiguration) {
        return new l(new a(outputConfiguration));
    }

    @Override // z.i.a
    public void c(long j10) {
        ((a) this.f48675a).f48674b = j10;
    }

    @Override // z.i.a
    public void d(String str) {
        ((OutputConfiguration) g()).setPhysicalCameraId(str);
    }

    @Override // z.k, z.j, z.i.a
    public Object g() {
        X0.h.a(this.f48675a instanceof a);
        return ((a) this.f48675a).f48673a;
    }

    public l(Object obj) {
        super(obj);
    }
}
