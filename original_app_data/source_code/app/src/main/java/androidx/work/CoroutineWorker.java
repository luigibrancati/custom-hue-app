package androidx.work;

import I3.AbstractC0889t;
import I3.C0880j;
import O7.e;
import Rd.C2123d0;
import Rd.D0;
import Rd.I;
import Rd.M;
import android.content.Context;
import fc.AbstractC4036s;
import fc.C4015H;
import io.sentry.protocol.Message;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC4862t;
import lc.InterfaceC4988e;
import lc.InterfaceC4992i;
import mc.C5046c;
import nc.m;
import vc.p;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\b\b&\u0018\u00002\u00020\u0001:\u0001\u001eB\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0013\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\tH¦@¢\u0006\u0004\b\f\u0010\rJ\u0018\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000f\u001a\u00020\u000eH\u0086@¢\u0006\u0004\b\u0011\u0010\u0012J\r\u0010\u0013\u001a\u00020\u0010¢\u0006\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R \u0010\u001d\u001a\u00020\u00178\u0016X\u0097\u0004¢\u0006\u0012\n\u0004\b\u0018\u0010\u0019\u0012\u0004\b\u001c\u0010\u0014\u001a\u0004\b\u001a\u0010\u001b¨\u0006\u001f"}, d2 = {"Landroidx/work/CoroutineWorker;", "Landroidx/work/c;", "Landroid/content/Context;", "appContext", "Landroidx/work/WorkerParameters;", Message.JsonKeys.PARAMS, "<init>", "(Landroid/content/Context;Landroidx/work/WorkerParameters;)V", "LO7/e;", "Landroidx/work/c$a;", "I", "()LO7/e;", "K", "(Llc/e;)Ljava/lang/Object;", "LI3/j;", "foregroundInfo", "Lfc/H;", "M", "(LI3/j;Llc/e;)Ljava/lang/Object;", "F", "()V", "e", "Landroidx/work/WorkerParameters;", "LRd/I;", "f", "LRd/I;", "L", "()LRd/I;", "getCoroutineContext$annotations", "coroutineContext", "a", "work-runtime_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public abstract class CoroutineWorker extends c {

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    public final WorkerParameters params;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    public final I coroutineContext;

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class a extends I {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final a f24706b = new a();

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final I f24707c = C2123d0.a();

        @Override // Rd.I
        public void k0(InterfaceC4992i context, Runnable block) {
            AbstractC4862t.e(context, "context");
            AbstractC4862t.e(block, "block");
            f24707c.k0(context, block);
        }

        @Override // Rd.I
        public boolean v0(InterfaceC4992i context) {
            AbstractC4862t.e(context, "context");
            return f24707c.v0(context);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class b extends m implements p {

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public int f24708j;

        public b(InterfaceC4988e interfaceC4988e) {
            super(2, interfaceC4988e);
        }

        @Override // nc.AbstractC5157a
        public final InterfaceC4988e create(Object obj, InterfaceC4988e interfaceC4988e) {
            return CoroutineWorker.this.new b(interfaceC4988e);
        }

        @Override // vc.p
        public final Object invoke(M m10, InterfaceC4988e interfaceC4988e) {
            return ((b) create(m10, interfaceC4988e)).invokeSuspend(C4015H.f34254a);
        }

        @Override // nc.AbstractC5157a
        public final Object invokeSuspend(Object obj) throws Throwable {
            Object objF = C5046c.f();
            int i10 = this.f24708j;
            if (i10 != 0) {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC4036s.b(obj);
                return obj;
            }
            AbstractC4036s.b(obj);
            CoroutineWorker coroutineWorker = CoroutineWorker.this;
            this.f24708j = 1;
            Object objK = coroutineWorker.K(this);
            return objK == objF ? objF : objK;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CoroutineWorker(Context appContext, WorkerParameters params) {
        super(appContext, params);
        AbstractC4862t.e(appContext, "appContext");
        AbstractC4862t.e(params, "params");
        this.params = params;
        this.coroutineContext = a.f24706b;
    }

    @Override // androidx.work.c
    public final void F() {
        super.F();
    }

    @Override // androidx.work.c
    public final e I() {
        InterfaceC4992i coroutineContext = !AbstractC4862t.a(getCoroutineContext(), a.f24706b) ? getCoroutineContext() : this.params.e();
        AbstractC4862t.b(coroutineContext);
        return AbstractC0889t.k(coroutineContext.plus(D0.b(null, 1, null)), null, new b(null), 2, null);
    }

    public abstract Object K(InterfaceC4988e interfaceC4988e);

    /* JADX INFO: renamed from: L, reason: from getter */
    public I getCoroutineContext() {
        return this.coroutineContext;
    }

    public final Object M(C0880j c0880j, InterfaceC4988e interfaceC4988e) {
        e eVarG = G(c0880j);
        AbstractC4862t.d(eVarG, "setForegroundAsync(...)");
        Object objA = B0.e.a(eVarG, interfaceC4988e);
        return objA == C5046c.f() ? objA : C4015H.f34254a;
    }
}
