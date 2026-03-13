package ka;

import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public class z {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f39524a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f39525b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final S f39526c;

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public boolean f39527a = false;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public boolean f39528b = false;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public S f39529c = new S(30, TimeUnit.SECONDS);

        public z a() {
            return new z(this.f39527a, this.f39528b, this.f39529c);
        }

        public a b(boolean z10) {
            this.f39527a = z10;
            return this;
        }

        public a c(boolean z10) {
            this.f39528b = z10;
            return this;
        }
    }

    public z(boolean z10, boolean z11, S s10) {
        this.f39524a = z10;
        this.f39525b = z11;
        this.f39526c = s10;
    }
}
