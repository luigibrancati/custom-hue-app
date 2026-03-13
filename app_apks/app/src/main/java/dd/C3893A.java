package dd;

import Cd.E;
import Lc.InterfaceC1177e;
import gc.C4179C;
import java.util.Collection;
import kotlin.jvm.internal.AbstractC4862t;

/* JADX INFO: renamed from: dd.A, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public final class C3893A implements z {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final C3893A f33353a = new C3893A();

    @Override // dd.z
    public void a(E kotlinType, InterfaceC1177e descriptor) {
        AbstractC4862t.e(kotlinType, "kotlinType");
        AbstractC4862t.e(descriptor, "descriptor");
    }

    @Override // dd.z
    public String c(InterfaceC1177e classDescriptor) {
        AbstractC4862t.e(classDescriptor, "classDescriptor");
        return null;
    }

    @Override // dd.z
    public String d(InterfaceC1177e classDescriptor) {
        AbstractC4862t.e(classDescriptor, "classDescriptor");
        return null;
    }

    @Override // dd.z
    public E e(Collection types) {
        AbstractC4862t.e(types, "types");
        throw new AssertionError("There should be no intersection type in existing descriptors, but found: " + C4179C.q0(types, null, null, null, 0, null, null, 63, null));
    }

    @Override // dd.z
    public E f(E kotlinType) {
        AbstractC4862t.e(kotlinType, "kotlinType");
        return null;
    }

    @Override // dd.z
    /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
    public AbstractC3908m b(InterfaceC1177e classDescriptor) {
        AbstractC4862t.e(classDescriptor, "classDescriptor");
        return null;
    }
}
