package Lc;

import gc.C4179C;
import java.util.List;
import kotlin.jvm.internal.AbstractC4859p;
import kotlin.jvm.internal.AbstractC4862t;
import od.AbstractC5292n;
import vd.InterfaceC6099h;

/* JADX INFO: renamed from: Lc.x, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC1195x {

    /* JADX INFO: renamed from: Lc.x$a */
    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public /* synthetic */ class a extends AbstractC4859p implements vc.l {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f8789a = new a();

        public a() {
            super(1);
        }

        @Override // kotlin.jvm.internal.AbstractC4849f, Cc.c
        public final String getName() {
            return "getOuterClassId";
        }

        @Override // kotlin.jvm.internal.AbstractC4849f
        public final Cc.g getOwner() {
            return kotlin.jvm.internal.M.b(kd.b.class);
        }

        @Override // kotlin.jvm.internal.AbstractC4849f
        public final String getSignature() {
            return "getOuterClassId()Lorg/jetbrains/kotlin/name/ClassId;";
        }

        @Override // vc.l
        /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
        public final kd.b invoke(kd.b p02) {
            AbstractC4862t.e(p02, "p0");
            return p02.g();
        }
    }

    /* JADX INFO: renamed from: Lc.x$b */
    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class b extends kotlin.jvm.internal.v implements vc.l {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final b f8790a = new b();

        public b() {
            super(1);
        }

        @Override // vc.l
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Integer invoke(kd.b it) {
            AbstractC4862t.e(it, "it");
            return 0;
        }
    }

    public static final InterfaceC1177e a(G g10, kd.b classId) {
        AbstractC4862t.e(g10, "<this>");
        AbstractC4862t.e(classId, "classId");
        InterfaceC1180h interfaceC1180hB = b(g10, classId);
        if (interfaceC1180hB instanceof InterfaceC1177e) {
            return (InterfaceC1177e) interfaceC1180hB;
        }
        return null;
    }

    public static final InterfaceC1180h b(G g10, kd.b classId) {
        AbstractC4862t.e(g10, "<this>");
        AbstractC4862t.e(classId, "classId");
        G gA = AbstractC5292n.a(g10);
        if (gA == null) {
            kd.c cVarH = classId.h();
            AbstractC4862t.d(cVarH, "classId.packageFqName");
            P pZ0 = g10.z0(cVarH);
            List listF = classId.i().f();
            AbstractC4862t.d(listF, "classId.relativeClassName.pathSegments()");
            InterfaceC6099h interfaceC6099hO = pZ0.o();
            Object objH0 = C4179C.h0(listF);
            AbstractC4862t.d(objH0, "segments.first()");
            InterfaceC1180h interfaceC1180hE = interfaceC6099hO.e((kd.f) objH0, Tc.d.FROM_DESERIALIZATION);
            if (interfaceC1180hE == null) {
                return null;
            }
            for (kd.f name : listF.subList(1, listF.size())) {
                if (!(interfaceC1180hE instanceof InterfaceC1177e)) {
                    return null;
                }
                InterfaceC6099h interfaceC6099hR = ((InterfaceC1177e) interfaceC1180hE).R();
                AbstractC4862t.d(name, "name");
                InterfaceC1180h interfaceC1180hE2 = interfaceC6099hR.e(name, Tc.d.FROM_DESERIALIZATION);
                interfaceC1180hE = interfaceC1180hE2 instanceof InterfaceC1177e ? (InterfaceC1177e) interfaceC1180hE2 : null;
                if (interfaceC1180hE == null) {
                    return null;
                }
            }
            return interfaceC1180hE;
        }
        kd.c cVarH2 = classId.h();
        AbstractC4862t.d(cVarH2, "classId.packageFqName");
        P pZ02 = gA.z0(cVarH2);
        List listF2 = classId.i().f();
        AbstractC4862t.d(listF2, "classId.relativeClassName.pathSegments()");
        InterfaceC6099h interfaceC6099hO2 = pZ02.o();
        Object objH02 = C4179C.h0(listF2);
        AbstractC4862t.d(objH02, "segments.first()");
        InterfaceC1180h interfaceC1180hE3 = interfaceC6099hO2.e((kd.f) objH02, Tc.d.FROM_DESERIALIZATION);
        if (interfaceC1180hE3 == null) {
            interfaceC1180hE3 = null;
            break;
        }
        for (kd.f name2 : listF2.subList(1, listF2.size())) {
            if (interfaceC1180hE3 instanceof InterfaceC1177e) {
                InterfaceC6099h interfaceC6099hR2 = ((InterfaceC1177e) interfaceC1180hE3).R();
                AbstractC4862t.d(name2, "name");
                InterfaceC1180h interfaceC1180hE4 = interfaceC6099hR2.e(name2, Tc.d.FROM_DESERIALIZATION);
                interfaceC1180hE3 = interfaceC1180hE4 instanceof InterfaceC1177e ? (InterfaceC1177e) interfaceC1180hE4 : null;
                if (interfaceC1180hE3 != null) {
                }
            }
            interfaceC1180hE3 = null;
        }
        if (interfaceC1180hE3 != null) {
            return interfaceC1180hE3;
        }
        kd.c cVarH3 = classId.h();
        AbstractC4862t.d(cVarH3, "classId.packageFqName");
        P pZ03 = g10.z0(cVarH3);
        List listF3 = classId.i().f();
        AbstractC4862t.d(listF3, "classId.relativeClassName.pathSegments()");
        InterfaceC6099h interfaceC6099hO3 = pZ03.o();
        Object objH03 = C4179C.h0(listF3);
        AbstractC4862t.d(objH03, "segments.first()");
        InterfaceC1180h interfaceC1180hE5 = interfaceC6099hO3.e((kd.f) objH03, Tc.d.FROM_DESERIALIZATION);
        if (interfaceC1180hE5 == null) {
            return null;
        }
        for (kd.f name3 : listF3.subList(1, listF3.size())) {
            if (!(interfaceC1180hE5 instanceof InterfaceC1177e)) {
                return null;
            }
            InterfaceC6099h interfaceC6099hR3 = ((InterfaceC1177e) interfaceC1180hE5).R();
            AbstractC4862t.d(name3, "name");
            InterfaceC1180h interfaceC1180hE6 = interfaceC6099hR3.e(name3, Tc.d.FROM_DESERIALIZATION);
            interfaceC1180hE5 = interfaceC1180hE6 instanceof InterfaceC1177e ? (InterfaceC1177e) interfaceC1180hE6 : null;
            if (interfaceC1180hE5 == null) {
                return null;
            }
        }
        return interfaceC1180hE5;
    }

    public static final InterfaceC1177e c(G g10, kd.b classId, J notFoundClasses) {
        AbstractC4862t.e(g10, "<this>");
        AbstractC4862t.e(classId, "classId");
        AbstractC4862t.e(notFoundClasses, "notFoundClasses");
        InterfaceC1177e interfaceC1177eA = a(g10, classId);
        return interfaceC1177eA != null ? interfaceC1177eA : notFoundClasses.d(classId, Nd.t.O(Nd.t.I(Nd.q.n(classId, a.f8789a), b.f8790a)));
    }

    public static final e0 d(G g10, kd.b classId) {
        AbstractC4862t.e(g10, "<this>");
        AbstractC4862t.e(classId, "classId");
        InterfaceC1180h interfaceC1180hB = b(g10, classId);
        if (interfaceC1180hB instanceof e0) {
            return (e0) interfaceC1180hB;
        }
        return null;
    }
}
