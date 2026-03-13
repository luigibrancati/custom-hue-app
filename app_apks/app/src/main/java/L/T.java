package L;

import E.AbstractC0807p0;
import E.B0;
import L.AbstractC1091c0;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public final class T implements Z0 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final E.B0 f7940d;

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public class a implements E.B0 {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ long f7941d;

        public a(long j10) {
            this.f7941d = j10;
        }

        @Override // E.B0
        public long a() {
            return this.f7941d;
        }

        @Override // E.B0
        public B0.c d(B0.b bVar) {
            return bVar.getStatus() == 1 ? B0.c.f2715d : B0.c.f2716e;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class b implements Z0 {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final E.B0 f7943d;

        public b(long j10) {
            this.f7943d = new T(j10);
        }

        @Override // E.B0
        public long a() {
            return this.f7943d.a();
        }

        @Override // L.Z0
        public E.B0 b(long j10) {
            return new b(j10);
        }

        @Override // E.B0
        public B0.c d(B0.b bVar) {
            if (this.f7943d.d(bVar).d()) {
                return B0.c.f2716e;
            }
            Throwable thA = bVar.a();
            if (thA instanceof AbstractC1091c0.b) {
                AbstractC0807p0.c("CameraX", "The device might underreport the amount of the cameras. Finish the initialize task since we are already reaching the maximum number of retries.");
                if (((AbstractC1091c0.b) thA).a() > 0) {
                    return B0.c.f2718g;
                }
            }
            return B0.c.f2715d;
        }
    }

    public T(long j10) {
        this.f7940d = new l1(j10, new a(j10));
    }

    @Override // E.B0
    public long a() {
        return this.f7940d.a();
    }

    @Override // L.Z0
    public E.B0 b(long j10) {
        return new T(j10);
    }

    @Override // E.B0
    public B0.c d(B0.b bVar) {
        return this.f7940d.d(bVar);
    }
}
