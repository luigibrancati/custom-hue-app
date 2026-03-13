package b3;

import java.util.Set;
import kotlin.jvm.internal.AbstractC4862t;
import lc.InterfaceC4988e;
import nc.AbstractC5160d;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public final class l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Ud.w f25188a;

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class a extends AbstractC5160d {

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public /* synthetic */ Object f25189j;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public int f25191l;

        public a(InterfaceC4988e interfaceC4988e) {
            super(interfaceC4988e);
        }

        @Override // nc.AbstractC5157a
        public final Object invokeSuspend(Object obj) {
            this.f25189j = obj;
            this.f25191l |= Integer.MIN_VALUE;
            return l.this.a(null, this);
        }
    }

    public l(int i10) {
        this.f25188a = Ud.G.a(new int[i10]);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object a(Ud.InterfaceC2314f r5, lc.InterfaceC4988e r6) throws java.lang.Throwable {
        /*
            r4 = this;
            boolean r0 = r6 instanceof b3.l.a
            if (r0 == 0) goto L13
            r0 = r6
            b3.l$a r0 = (b3.l.a) r0
            int r1 = r0.f25191l
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f25191l = r1
            goto L18
        L13:
            b3.l$a r0 = new b3.l$a
            r0.<init>(r6)
        L18:
            java.lang.Object r6 = r0.f25189j
            java.lang.Object r1 = mc.C5046c.f()
            int r2 = r0.f25191l
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 == r3) goto L2d
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L2d:
            fc.AbstractC4036s.b(r6)
            goto L3f
        L31:
            fc.AbstractC4036s.b(r6)
            Ud.w r4 = r4.f25188a
            r0.f25191l = r3
            java.lang.Object r4 = r4.collect(r5, r0)
            if (r4 != r1) goto L3f
            return r1
        L3f:
            fc.h r4 = new fc.h
            r4.<init>()
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: b3.l.a(Ud.f, lc.e):java.lang.Object");
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$ArrayArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public final void b(Set tableIds) {
        Object value;
        int[] iArr;
        AbstractC4862t.e(tableIds, "tableIds");
        if (tableIds.isEmpty()) {
            return;
        }
        Ud.w wVar = this.f25188a;
        do {
            value = wVar.getValue();
            int[] iArr2 = (int[]) value;
            int length = iArr2.length;
            iArr = new int[length];
            for (int i10 = 0; i10 < length; i10++) {
                iArr[i10] = tableIds.contains(Integer.valueOf(i10)) ? iArr2[i10] + 1 : iArr2[i10];
            }
        } while (!wVar.c(value, iArr));
    }
}
