package Rc;

import Rc.z;
import bd.InterfaceC2914f;
import gc.C4206t;
import java.lang.reflect.GenericArrayType;
import java.lang.reflect.Type;
import java.util.Collection;
import kotlin.jvm.internal.AbstractC4862t;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public final class k extends z implements InterfaceC2914f {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Type f15078b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final z f15079c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Collection f15080d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final boolean f15081e;

    public k(Type reflectType) {
        z zVarA;
        AbstractC4862t.e(reflectType, "reflectType");
        this.f15078b = reflectType;
        Type typeQ = Q();
        if (!(typeQ instanceof GenericArrayType)) {
            if (typeQ instanceof Class) {
                Class cls = (Class) typeQ;
                if (cls.isArray()) {
                    z.a aVar = z.f15104a;
                    Class<?> componentType = cls.getComponentType();
                    AbstractC4862t.d(componentType, "getComponentType()");
                    zVarA = aVar.a(componentType);
                }
            }
            throw new IllegalArgumentException("Not an array type (" + Q().getClass() + "): " + Q());
        }
        z.a aVar2 = z.f15104a;
        Type genericComponentType = ((GenericArrayType) typeQ).getGenericComponentType();
        AbstractC4862t.d(genericComponentType, "genericComponentType");
        zVarA = aVar2.a(genericComponentType);
        this.f15079c = zVarA;
        this.f15080d = C4206t.k();
    }

    @Override // bd.InterfaceC2912d
    public boolean D() {
        return this.f15081e;
    }

    @Override // Rc.z
    public Type Q() {
        return this.f15078b;
    }

    @Override // bd.InterfaceC2914f
    /* JADX INFO: renamed from: R, reason: merged with bridge method [inline-methods] */
    public z h() {
        return this.f15079c;
    }

    @Override // bd.InterfaceC2912d
    public Collection getAnnotations() {
        return this.f15080d;
    }
}
