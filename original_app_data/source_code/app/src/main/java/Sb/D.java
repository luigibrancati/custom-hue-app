package Sb;

import Eb.q;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public final class D extends Eb.k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Eb.q f15460a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f15461b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f15462c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final TimeUnit f15463d;

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class a extends AtomicReference implements Hb.c, Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Eb.p f15464a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public long f15465b;

        public a(Eb.p pVar) {
            this.f15464a = pVar;
        }

        public void a(Hb.c cVar) {
            Kb.c.u(this, cVar);
        }

        @Override // Hb.c
        public void dispose() {
            Kb.c.a(this);
        }

        @Override // Hb.c
        public boolean j() {
            return get() == Kb.c.DISPOSED;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (get() != Kb.c.DISPOSED) {
                Eb.p pVar = this.f15464a;
                long j10 = this.f15465b;
                this.f15465b = 1 + j10;
                pVar.c(Long.valueOf(j10));
            }
        }
    }

    public D(long j10, long j11, TimeUnit timeUnit, Eb.q qVar) {
        this.f15461b = j10;
        this.f15462c = j11;
        this.f15463d = timeUnit;
        this.f15460a = qVar;
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // Eb.k
    public void v0(Eb.p pVar) {
        a aVar = new a(pVar);
        pVar.b(aVar);
        Eb.q qVar = this.f15460a;
        if (!(qVar instanceof Vb.o)) {
            aVar.a(qVar.e(aVar, this.f15461b, this.f15462c, this.f15463d));
            return;
        }
        q.c cVarA = qVar.a();
        aVar.a(cVarA);
        cVarA.d(aVar, this.f15461b, this.f15462c, this.f15463d);
    }
}
