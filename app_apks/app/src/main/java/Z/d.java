package Z;

import android.hardware.camera2.params.SessionConfiguration;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public interface d {

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f20079a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f20080b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final long f20081c;

        public a(int i10, int i11, long j10) {
            this.f20079a = i10;
            this.f20080b = i11;
            this.f20081c = j10;
        }

        public int a() {
            return this.f20079a;
        }
    }

    a a(SessionConfiguration sessionConfiguration);
}
