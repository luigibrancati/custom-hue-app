package wd;

import Cd.E;
import Lc.InterfaceC1177e;
import kotlin.jvm.internal.AbstractC4862t;

/* JADX INFO: renamed from: wd.b, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public final class C6190b extends AbstractC6189a implements InterfaceC6194f {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final InterfaceC1177e f46530c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final kd.f f46531d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C6190b(InterfaceC1177e classDescriptor, E receiverType, kd.f fVar, InterfaceC6195g interfaceC6195g) {
        super(receiverType, interfaceC6195g);
        AbstractC4862t.e(classDescriptor, "classDescriptor");
        AbstractC4862t.e(receiverType, "receiverType");
        this.f46530c = classDescriptor;
        this.f46531d = fVar;
    }

    @Override // wd.InterfaceC6194f
    public kd.f a() {
        return this.f46531d;
    }

    public String toString() {
        return getType() + ": Ctx { " + this.f46530c + " }";
    }
}
