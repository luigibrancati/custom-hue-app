package Ec;

import Cc.g;
import Cc.h;
import Fc.C0831f;
import Fc.L;
import Fc.o;
import Lc.Z;
import fc.C4034q;
import fc.InterfaceC4023f;
import fd.i;
import fd.t;
import jd.C4764e;
import jd.C4765f;
import jd.C4768i;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC4859p;
import kotlin.jvm.internal.AbstractC4862t;
import kotlin.jvm.internal.M;
import vc.p;
import yd.w;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public abstract class d {

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public /* synthetic */ class a extends AbstractC4859p implements p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f3393a = new a();

        public a() {
            super(2);
        }

        @Override // kotlin.jvm.internal.AbstractC4849f, Cc.c
        public final String getName() {
            return "loadFunction";
        }

        @Override // kotlin.jvm.internal.AbstractC4849f
        public final g getOwner() {
            return M.b(w.class);
        }

        @Override // kotlin.jvm.internal.AbstractC4849f
        public final String getSignature() {
            return "loadFunction(Lorg/jetbrains/kotlin/metadata/ProtoBuf$Function;)Lorg/jetbrains/kotlin/descriptors/SimpleFunctionDescriptor;";
        }

        @Override // vc.p
        /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
        public final Z invoke(w p02, i p12) {
            AbstractC4862t.e(p02, "p0");
            AbstractC4862t.e(p12, "p1");
            return p02.j(p12);
        }
    }

    public static final h a(InterfaceC4023f interfaceC4023f) {
        AbstractC4862t.e(interfaceC4023f, "<this>");
        Metadata metadata = (Metadata) interfaceC4023f.getClass().getAnnotation(Metadata.class);
        if (metadata == null) {
            return null;
        }
        String[] strArrD1 = metadata.d1();
        if (strArrD1.length == 0) {
            strArrD1 = null;
        }
        if (strArrD1 == null) {
            return null;
        }
        C4034q c4034qJ = C4768i.j(strArrD1, metadata.d2());
        C4765f c4765f = (C4765f) c4034qJ.a();
        i iVar = (i) c4034qJ.b();
        C4764e c4764e = new C4764e(metadata.mv(), (metadata.xi() & 8) != 0);
        Class<?> cls = interfaceC4023f.getClass();
        t tVarH0 = iVar.h0();
        AbstractC4862t.d(tVarH0, "proto.typeTable");
        return new o(C0831f.f3869d, (Z) L.h(cls, iVar, c4765f, new hd.g(tVarH0), c4764e, a.f3393a));
    }
}
