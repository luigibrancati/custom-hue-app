package e2;

import G1.AbstractC0853a;
import a2.C2609B;
import a2.C2638y;
import java.io.IOException;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public interface k {

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f33622a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f33623b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final int f33624c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final int f33625d;

        public a(int i10, int i11, int i12, int i13) {
            this.f33622a = i10;
            this.f33623b = i11;
            this.f33624c = i12;
            this.f33625d = i13;
        }

        public boolean a(int i10) {
            return i10 == 1 ? this.f33622a - this.f33623b > 1 : this.f33624c - this.f33625d > 1;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f33626a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final long f33627b;

        public b(int i10, long j10) {
            AbstractC0853a.a(j10 >= 0);
            this.f33626a = i10;
            this.f33627b = j10;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final C2638y f33628a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final C2609B f33629b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final IOException f33630c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final int f33631d;

        public c(C2638y c2638y, C2609B c2609b, IOException iOException, int i10) {
            this.f33628a = c2638y;
            this.f33629b = c2609b;
            this.f33630c = iOException;
            this.f33631d = i10;
        }
    }

    long a(c cVar);

    int b(int i10);

    b c(a aVar, c cVar);

    default void d(long j10) {
    }
}
