package X6;

import java.util.Objects;
import java.util.concurrent.Callable;
import v6.AbstractC6056k;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public final class J6 implements Callable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ c7 f18376a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ R6 f18377b;

    public J6(R6 r62, c7 c7Var) {
        this.f18376a = c7Var;
        Objects.requireNonNull(r62);
        this.f18377b = r62;
    }

    @Override // java.util.concurrent.Callable
    public final /* bridge */ /* synthetic */ Object call() {
        c7 c7Var = this.f18376a;
        String str = (String) AbstractC6056k.l(c7Var.f18743a);
        R6 r62 = this.f18377b;
        S3 s3G = r62.g(str);
        R3 r32 = R3.ANALYTICS_STORAGE;
        if (s3G.o(r32) && S3.f(c7Var.f18761s, 100).o(r32)) {
            return r62.o0(c7Var).p0();
        }
        r62.a().w().a("Analytics storage consent denied. Returning null app instance id");
        return null;
    }
}
