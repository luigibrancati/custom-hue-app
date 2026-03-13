package dd;

import kotlin.jvm.internal.AbstractC4862t;
import yd.C6474g;
import yd.InterfaceC6475h;

/* JADX INFO: renamed from: dd.i, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public final class C3904i implements InterfaceC6475h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final InterfaceC3911p f33430a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final C3903h f33431b;

    public C3904i(InterfaceC3911p kotlinClassFinder, C3903h deserializedDescriptorResolver) {
        AbstractC4862t.e(kotlinClassFinder, "kotlinClassFinder");
        AbstractC4862t.e(deserializedDescriptorResolver, "deserializedDescriptorResolver");
        this.f33430a = kotlinClassFinder;
        this.f33431b = deserializedDescriptorResolver;
    }

    @Override // yd.InterfaceC6475h
    public C6474g a(kd.b classId) {
        AbstractC4862t.e(classId, "classId");
        InterfaceC3913r interfaceC3913rB = AbstractC3912q.b(this.f33430a, classId);
        if (interfaceC3913rB == null) {
            return null;
        }
        AbstractC4862t.a(interfaceC3913rB.c(), classId);
        return this.f33431b.i(interfaceC3913rB);
    }
}
