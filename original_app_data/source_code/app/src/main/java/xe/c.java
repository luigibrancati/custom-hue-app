package xe;

import kotlin.jvm.internal.AbstractC4862t;
import ye.C6480a;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public interface c {

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class a implements c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f48121a = new a();

        @Override // xe.c
        public void a(C6480a windowCounter) {
            AbstractC4862t.e(windowCounter, "windowCounter");
        }

        @Override // xe.c
        public void b(int i10, C6480a windowCounter, long j10) {
            AbstractC4862t.e(windowCounter, "windowCounter");
        }
    }

    void a(C6480a c6480a);

    void b(int i10, C6480a c6480a, long j10);
}
