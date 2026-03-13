package nc;

import fc.AbstractC4036s;
import fc.C4035r;
import java.io.Serializable;
import kotlin.jvm.internal.AbstractC4862t;
import lc.InterfaceC4988e;
import mc.C5046c;

/* JADX INFO: renamed from: nc.a, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC5157a implements InterfaceC4988e, InterfaceC5161e, Serializable {
    private final InterfaceC4988e completion;

    public AbstractC5157a(InterfaceC4988e interfaceC4988e) {
        this.completion = interfaceC4988e;
    }

    public InterfaceC4988e create(InterfaceC4988e completion) {
        AbstractC4862t.e(completion, "completion");
        throw new UnsupportedOperationException("create(Continuation) has not been overridden");
    }

    public InterfaceC5161e getCallerFrame() {
        InterfaceC4988e interfaceC4988e = this.completion;
        if (interfaceC4988e instanceof InterfaceC5161e) {
            return (InterfaceC5161e) interfaceC4988e;
        }
        return null;
    }

    public final InterfaceC4988e getCompletion() {
        return this.completion;
    }

    public StackTraceElement getStackTraceElement() {
        return g.c(this);
    }

    public abstract Object invokeSuspend(Object obj);

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v1, types: [lc.e] */
    /* JADX WARN: Type inference failed for: r2v4 */
    /* JADX WARN: Type inference failed for: r2v5 */
    @Override // lc.InterfaceC4988e
    public final void resumeWith(Object obj) {
        Object objInvokeSuspend;
        ?? r22 = this;
        while (true) {
            h.b(r22);
            AbstractC5157a abstractC5157a = (AbstractC5157a) r22;
            InterfaceC4988e interfaceC4988e = abstractC5157a.completion;
            AbstractC4862t.b(interfaceC4988e);
            try {
                objInvokeSuspend = abstractC5157a.invokeSuspend(obj);
            } catch (Throwable th) {
                C4035r.a aVar = C4035r.f34274b;
                obj = C4035r.b(AbstractC4036s.a(th));
            }
            if (objInvokeSuspend == C5046c.f()) {
                return;
            }
            obj = C4035r.b(objInvokeSuspend);
            abstractC5157a.releaseIntercepted();
            if (!(interfaceC4988e instanceof AbstractC5157a)) {
                interfaceC4988e.resumeWith(obj);
                return;
            }
            r22 = interfaceC4988e;
        }
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append("Continuation at ");
        Object stackTraceElement = getStackTraceElement();
        if (stackTraceElement == null) {
            stackTraceElement = getClass().getName();
        }
        sb2.append(stackTraceElement);
        return sb2.toString();
    }

    public InterfaceC4988e create(Object obj, InterfaceC4988e completion) {
        AbstractC4862t.e(completion, "completion");
        throw new UnsupportedOperationException("create(Any?;Continuation) has not been overridden");
    }

    public void releaseIntercepted() {
    }
}
