package Ic;

import fc.C4029l;
import fc.EnumC4031n;
import fc.InterfaceC4028k;
import gc.U;
import java.util.Set;
import kotlin.jvm.internal.AbstractC4854k;
import kotlin.jvm.internal.AbstractC4862t;
import kotlin.jvm.internal.v;
import vc.InterfaceC6082a;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r4v0 Ic.h, still in use, count: 1, list:
  (r4v0 Ic.h) from 0x006e: FILLED_NEW_ARRAY (r4v0 Ic.h), (r5v0 Ic.h), (r6v0 Ic.h), (r7v0 Ic.h), (r8v0 Ic.h), (r9v0 Ic.h), (r10v0 Ic.h) A[WRAPPED] (LINE:111) elemType: Ic.h
	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:162)
	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:127)
	at jadx.core.utils.InsnRemover.lambda$unbindInsns$1(InsnRemover.java:99)
	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
	at jadx.core.utils.InsnRemover.unbindInsns(InsnRemover.java:98)
	at jadx.core.utils.InsnRemover.removeAllAndUnbind(InsnRemover.java:252)
	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:180)
	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:100)
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public final class h {
    BOOLEAN("Boolean"),
    CHAR("Char"),
    BYTE("Byte"),
    SHORT("Short"),
    INT("Int"),
    FLOAT("Float"),
    LONG("Long"),
    DOUBLE("Double");

    public static final Set<h> NUMBER_TYPES = U.h(new h("Char"), new h("Byte"), new h("Short"), new h("Int"), new h("Float"), new h("Long"), new h("Double"));
    private final InterfaceC4028k arrayTypeFqName$delegate;
    private final kd.f arrayTypeName;
    private final InterfaceC4028k typeFqName$delegate;
    private final kd.f typeName;
    public static final a Companion = new a(null);

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class a {
        public /* synthetic */ a(AbstractC4854k abstractC4854k) {
            this();
        }

        public a() {
        }
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class b extends v implements InterfaceC6082a {
        public b() {
            super(0);
        }

        @Override // vc.InterfaceC6082a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final kd.c invoke() {
            kd.c cVarC = j.f5739u.c(h.this.j());
            AbstractC4862t.d(cVarC, "BUILT_INS_PACKAGE_FQ_NAME.child(arrayTypeName)");
            return cVarC;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class c extends v implements InterfaceC6082a {
        public c() {
            super(0);
        }

        @Override // vc.InterfaceC6082a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final kd.c invoke() {
            kd.c cVarC = j.f5739u.c(h.this.q());
            AbstractC4862t.d(cVarC, "BUILT_INS_PACKAGE_FQ_NAME.child(this.typeName)");
            return cVarC;
        }
    }

    static {
    }

    public h(String str) {
        kd.f fVarS = kd.f.s(str);
        AbstractC4862t.d(fVarS, "identifier(typeName)");
        this.typeName = fVarS;
        kd.f fVarS2 = kd.f.s(str + "Array");
        AbstractC4862t.d(fVarS2, "identifier(\"${typeName}Array\")");
        this.arrayTypeName = fVarS2;
        EnumC4031n enumC4031n = EnumC4031n.PUBLICATION;
        this.typeFqName$delegate = C4029l.a(enumC4031n, new c());
        this.arrayTypeFqName$delegate = C4029l.a(enumC4031n, new b());
    }

    public static h valueOf(String str) {
        return (h) Enum.valueOf(h.class, str);
    }

    public static h[] values() {
        return (h[]) $VALUES.clone();
    }

    public final kd.c b() {
        return (kd.c) this.arrayTypeFqName$delegate.getValue();
    }

    public final kd.f j() {
        return this.arrayTypeName;
    }

    public final kd.c p() {
        return (kd.c) this.typeFqName$delegate.getValue();
    }

    public final kd.f q() {
        return this.typeName;
    }
}
