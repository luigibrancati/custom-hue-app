package Rd;

import java.util.concurrent.CancellationException;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public final class Y0 extends CancellationException {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final transient InterfaceC2166z0 f15156a;

    public Y0(String str, InterfaceC2166z0 interfaceC2166z0) {
        super(str);
        this.f15156a = interfaceC2166z0;
    }

    public Y0(String str) {
        this(str, null);
    }
}
