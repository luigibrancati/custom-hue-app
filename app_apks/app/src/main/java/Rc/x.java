package Rc;

import gc.C4206t;
import java.util.Collection;
import kotlin.jvm.internal.AbstractC4862t;
import td.EnumC5882e;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public final class x extends z implements bd.v {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Class f15100b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Collection f15101c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f15102d;

    public x(Class reflectType) {
        AbstractC4862t.e(reflectType, "reflectType");
        this.f15100b = reflectType;
        this.f15101c = C4206t.k();
    }

    @Override // bd.InterfaceC2912d
    public boolean D() {
        return this.f15102d;
    }

    @Override // Rc.z
    /* JADX INFO: renamed from: R, reason: merged with bridge method [inline-methods] */
    public Class Q() {
        return this.f15100b;
    }

    @Override // bd.InterfaceC2912d
    public Collection getAnnotations() {
        return this.f15101c;
    }

    @Override // bd.v
    public Ic.h getType() {
        if (AbstractC4862t.a(Q(), Void.TYPE)) {
            return null;
        }
        return EnumC5882e.j(Q().getName()).s();
    }
}
