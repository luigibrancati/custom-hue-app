package Rc;

import bd.InterfaceC2921m;
import kotlin.jvm.internal.AbstractC4862t;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public final class q extends f implements InterfaceC2921m {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Enum f15095c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q(kd.f fVar, Enum value) {
        super(fVar, null);
        AbstractC4862t.e(value, "value");
        this.f15095c = value;
    }

    @Override // bd.InterfaceC2921m
    public kd.b c() {
        Class<?> enumClass = this.f15095c.getClass();
        if (!enumClass.isEnum()) {
            enumClass = enumClass.getEnclosingClass();
        }
        AbstractC4862t.d(enumClass, "enumClass");
        return d.a(enumClass);
    }

    @Override // bd.InterfaceC2921m
    public kd.f d() {
        return kd.f.s(this.f15095c.name());
    }
}
