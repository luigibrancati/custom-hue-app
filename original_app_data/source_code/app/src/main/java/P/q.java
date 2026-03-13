package P;

import L.InterfaceC1099g0;
import L.Y0;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public interface q extends Y0 {

    /* JADX INFO: renamed from: M, reason: collision with root package name */
    public static final InterfaceC1099g0.a f12541M = InterfaceC1099g0.a.a("camerax.core.target.name", String.class);

    /* JADX INFO: renamed from: N, reason: collision with root package name */
    public static final InterfaceC1099g0.a f12542N = InterfaceC1099g0.a.a("camerax.core.target.class", Class.class);

    default String U() {
        return (String) a(f12541M);
    }

    default String s(String str) {
        return (String) c(f12541M, str);
    }
}
