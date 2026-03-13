package Rc;

import bd.InterfaceC2916h;
import kotlin.jvm.internal.AbstractC4862t;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public final class m extends f implements InterfaceC2916h {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Class f15091c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(kd.f fVar, Class klass) {
        super(fVar, null);
        AbstractC4862t.e(klass, "klass");
        this.f15091c = klass;
    }

    @Override // bd.InterfaceC2916h
    public bd.x b() {
        return z.f15104a.a(this.f15091c);
    }
}
