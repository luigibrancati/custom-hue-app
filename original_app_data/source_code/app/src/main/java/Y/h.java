package Y;

import L.InterfaceC1099g0;
import L.InterfaceC1132x0;
import L.R0;
import L.s1;
import P.r;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public class h implements s1, InterfaceC1132x0, r {

    /* JADX INFO: renamed from: Q, reason: collision with root package name */
    public static final InterfaceC1099g0.a f19546Q = InterfaceC1099g0.a.a("camerax.core.streamSharing.captureTypes", List.class);

    /* JADX INFO: renamed from: P, reason: collision with root package name */
    public final R0 f19547P;

    public h(R0 r02) {
        this.f19547P = r02;
    }

    public List d0() {
        return (List) a(f19546Q);
    }

    @Override // L.Y0
    public InterfaceC1099g0 getConfig() {
        return this.f19547P;
    }
}
