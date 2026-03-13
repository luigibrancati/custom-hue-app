package Rc;

import Rc.z;
import bd.InterfaceC2922n;
import java.lang.reflect.Field;
import java.lang.reflect.Type;
import kotlin.jvm.internal.AbstractC4862t;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public final class r extends t implements InterfaceC2922n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Field f15096a;

    public r(Field member) {
        AbstractC4862t.e(member, "member");
        this.f15096a = member;
    }

    @Override // bd.InterfaceC2922n
    public boolean I() {
        return R().isEnumConstant();
    }

    @Override // bd.InterfaceC2922n
    public boolean N() {
        return false;
    }

    @Override // Rc.t
    /* JADX INFO: renamed from: T, reason: merged with bridge method [inline-methods] */
    public Field R() {
        return this.f15096a;
    }

    @Override // bd.InterfaceC2922n
    /* JADX INFO: renamed from: U, reason: merged with bridge method [inline-methods] */
    public z getType() {
        z.a aVar = z.f15104a;
        Type genericType = R().getGenericType();
        AbstractC4862t.d(genericType, "member.genericType");
        return aVar.a(genericType);
    }
}
