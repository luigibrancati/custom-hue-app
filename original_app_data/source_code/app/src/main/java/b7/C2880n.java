package b7;

import java.util.Objects;

/* JADX INFO: renamed from: b7.n, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public final class C2880n implements InterfaceC2874h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ InterfaceC2875i f25417a;

    public C2880n(C2884r c2884r, InterfaceC2875i interfaceC2875i) {
        this.f25417a = interfaceC2875i;
        Objects.requireNonNull(c2884r);
    }

    @Override // b7.InterfaceC2874h
    public final /* bridge */ /* synthetic */ void onSuccess(Object obj) {
        this.f25417a.a();
    }
}
