package Rc;

import bd.InterfaceC2906B;
import java.lang.annotation.Annotation;
import java.util.List;
import kotlin.jvm.internal.AbstractC4862t;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public final class B extends p implements InterfaceC2906B {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final z f15046a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Annotation[] f15047b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f15048c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f15049d;

    public B(z type, Annotation[] reflectAnnotations, String str, boolean z10) {
        AbstractC4862t.e(type, "type");
        AbstractC4862t.e(reflectAnnotations, "reflectAnnotations");
        this.f15046a = type;
        this.f15047b = reflectAnnotations;
        this.f15048c = str;
        this.f15049d = z10;
    }

    @Override // bd.InterfaceC2912d
    public boolean D() {
        return false;
    }

    @Override // bd.InterfaceC2906B
    /* JADX INFO: renamed from: Q, reason: merged with bridge method [inline-methods] */
    public z getType() {
        return this.f15046a;
    }

    @Override // bd.InterfaceC2906B
    public kd.f getName() {
        String str = this.f15048c;
        if (str != null) {
            return kd.f.q(str);
        }
        return null;
    }

    @Override // bd.InterfaceC2906B
    public boolean k() {
        return this.f15049d;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(B.class.getName());
        sb2.append(": ");
        sb2.append(k() ? "vararg " : "");
        sb2.append(getName());
        sb2.append(": ");
        sb2.append(getType());
        return sb2.toString();
    }

    @Override // bd.InterfaceC2912d
    public List getAnnotations() {
        return i.b(this.f15047b);
    }

    @Override // bd.InterfaceC2912d
    public e j(kd.c fqName) {
        AbstractC4862t.e(fqName, "fqName");
        return i.a(this.f15047b, fqName);
    }
}
