package Rc;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Member;
import java.lang.reflect.Method;
import kotlin.jvm.internal.AbstractC4862t;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public final class y extends t implements bd.w {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f15103a;

    public y(Object recordComponent) {
        AbstractC4862t.e(recordComponent, "recordComponent");
        this.f15103a = recordComponent;
    }

    @Override // Rc.t
    public Member R() throws IllegalAccessException, InvocationTargetException {
        Method methodC = C2113a.f15053a.c(this.f15103a);
        if (methodC != null) {
            return methodC;
        }
        throw new NoSuchMethodError("Can't find `getAccessor` method");
    }

    @Override // bd.w
    public bd.x getType() throws IllegalAccessException, InvocationTargetException {
        Class clsD = C2113a.f15053a.d(this.f15103a);
        if (clsD != null) {
            return new n(clsD);
        }
        throw new NoSuchMethodError("Can't find `getType` method");
    }

    @Override // bd.w
    public boolean k() {
        return false;
    }
}
