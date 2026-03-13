package e3;

import k3.InterfaceC4793c;
import kotlin.jvm.internal.AbstractC4862t;
import l3.InterfaceC4878d;

/* JADX INFO: renamed from: e3.c, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public final class C3929c implements InterfaceC4793c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final InterfaceC4878d f33672a;

    public C3929c(InterfaceC4878d openHelper) {
        AbstractC4862t.e(openHelper, "openHelper");
        this.f33672a = openHelper;
    }

    public final InterfaceC4878d b() {
        return this.f33672a;
    }

    @Override // k3.InterfaceC4793c
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public C3927a a(String fileName) {
        AbstractC4862t.e(fileName, "fileName");
        return new C3927a(this.f33672a.F0());
    }
}
