package androidx.work.impl;

import I3.InterfaceC0872b;
import J3.C0895c;
import J3.C0898f;
import J3.C0899g;
import J3.C0900h;
import J3.C0901i;
import J3.C0902j;
import J3.C0903k;
import J3.C0904l;
import J3.C0905m;
import J3.C0906n;
import J3.C0907o;
import J3.C0911t;
import J3.h0;
import Q3.D;
import Q3.InterfaceC1857b;
import Q3.InterfaceC1864i;
import Q3.InterfaceC1871p;
import Q3.InterfaceC1879y;
import Q3.J;
import Q3.s0;
import android.content.Context;
import androidx.work.impl.WorkDatabase;
import b3.n;
import b3.t;
import java.util.concurrent.Executor;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC4854k;
import kotlin.jvm.internal.AbstractC4862t;
import l3.InterfaceC4878d;
import m3.C5017i;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b'\u0018\u0000 \u00192\u00020\u0001:\u0001\u001aB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H&¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H&¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\u000b\u001a\u00020\nH&¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\u000e\u001a\u00020\rH&¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0011\u001a\u00020\u0010H&¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0014\u001a\u00020\u0013H&¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0017\u001a\u00020\u0016H&¢\u0006\u0004\b\u0017\u0010\u0018¨\u0006\u001b"}, d2 = {"Landroidx/work/impl/WorkDatabase;", "Lb3/t;", "<init>", "()V", "LQ3/J;", "W", "()LQ3/J;", "LQ3/b;", "R", "()LQ3/b;", "LQ3/s0;", "X", "()LQ3/s0;", "LQ3/p;", "T", "()LQ3/p;", "LQ3/y;", "U", "()LQ3/y;", "LQ3/D;", "V", "()LQ3/D;", "LQ3/i;", "S", "()LQ3/i;", "n", "a", "work-runtime_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public abstract class WorkDatabase extends t {

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: androidx.work.impl.WorkDatabase$a, reason: from kotlin metadata */
    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class Companion {
        public /* synthetic */ Companion(AbstractC4854k abstractC4854k) {
            this();
        }

        public static final InterfaceC4878d c(Context context, InterfaceC4878d.b configuration) {
            AbstractC4862t.e(configuration, "configuration");
            InterfaceC4878d.b.a aVarA = InterfaceC4878d.b.f39842f.a(context);
            aVarA.d(configuration.f39844b).c(configuration.f39845c).e(true).a(true);
            return new C5017i().a(aVarA.b());
        }

        public final WorkDatabase b(final Context context, Executor queryExecutor, InterfaceC0872b clock, boolean z10) {
            AbstractC4862t.e(context, "context");
            AbstractC4862t.e(queryExecutor, "queryExecutor");
            AbstractC4862t.e(clock, "clock");
            return (WorkDatabase) (z10 ? n.b(context, WorkDatabase.class).c() : n.a(context, WorkDatabase.class, "androidx.work.workdb").f(new InterfaceC4878d.c() { // from class: J3.G
                @Override // l3.InterfaceC4878d.c
                public final InterfaceC4878d a(InterfaceC4878d.b bVar) {
                    return WorkDatabase.Companion.c(context, bVar);
                }
            })).g(queryExecutor).a(new C0895c(clock)).b(C0902j.f6012c).b(new C0911t(context, 2, 3)).b(C0903k.f6014c).b(C0904l.f6019c).b(new C0911t(context, 5, 6)).b(C0905m.f6021c).b(C0906n.f6061c).b(C0907o.f6064c).b(new h0(context)).b(new C0911t(context, 10, 11)).b(C0898f.f5990c).b(C0899g.f5992c).b(C0900h.f6008c).b(C0901i.f6010c).b(new C0911t(context, 21, 22)).e(true).d();
        }

        public Companion() {
        }
    }

    public abstract InterfaceC1857b R();

    public abstract InterfaceC1864i S();

    public abstract InterfaceC1871p T();

    public abstract InterfaceC1879y U();

    public abstract D V();

    public abstract J W();

    public abstract s0 X();
}
