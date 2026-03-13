package Mc;

import Cd.E;
import Lc.a0;
import Mc.c;
import java.util.Map;
import nd.AbstractC5164c;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public class d implements c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final E f9426a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Map f9427b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final a0 f9428c;

    public d(E e10, Map map, a0 a0Var) {
        if (e10 == null) {
            b(0);
        }
        if (map == null) {
            b(1);
        }
        if (a0Var == null) {
            b(2);
        }
        this.f9426a = e10;
        this.f9427b = map;
        this.f9428c = a0Var;
    }

    public static /* synthetic */ void b(int i10) {
        String str = (i10 == 3 || i10 == 4 || i10 == 5) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        Object[] objArr = new Object[(i10 == 3 || i10 == 4 || i10 == 5) ? 2 : 3];
        if (i10 == 1) {
            objArr[0] = "valueArguments";
        } else if (i10 == 2) {
            objArr[0] = "source";
        } else if (i10 == 3 || i10 == 4 || i10 == 5) {
            objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/annotations/AnnotationDescriptorImpl";
        } else {
            objArr[0] = "annotationType";
        }
        if (i10 == 3) {
            objArr[1] = "getType";
        } else if (i10 == 4) {
            objArr[1] = "getAllValueArguments";
        } else if (i10 != 5) {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/annotations/AnnotationDescriptorImpl";
        } else {
            objArr[1] = "getSource";
        }
        if (i10 != 3 && i10 != 4 && i10 != 5) {
            objArr[2] = "<init>";
        }
        String str2 = String.format(str, objArr);
        if (i10 != 3 && i10 != 4 && i10 != 5) {
            throw new IllegalArgumentException(str2);
        }
        throw new IllegalStateException(str2);
    }

    @Override // Mc.c
    public Map a() {
        Map map = this.f9427b;
        if (map == null) {
            b(4);
        }
        return map;
    }

    @Override // Mc.c
    public kd.c e() {
        return c.a.a(this);
    }

    @Override // Mc.c
    public E getType() {
        E e10 = this.f9426a;
        if (e10 == null) {
            b(3);
        }
        return e10;
    }

    @Override // Mc.c
    public a0 j() {
        a0 a0Var = this.f9428c;
        if (a0Var == null) {
            b(5);
        }
        return a0Var;
    }

    public String toString() {
        return AbstractC5164c.f40783g.r(this, null);
    }
}
