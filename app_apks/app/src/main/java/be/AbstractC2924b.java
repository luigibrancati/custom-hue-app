package be;

import Rd.C2142n;
import Rd.InterfaceC2138l;
import b7.C2868b;
import b7.InterfaceC2872f;
import com.google.android.gms.tasks.Task;
import fc.AbstractC4036s;
import fc.C4015H;
import fc.C4035r;
import java.util.concurrent.CancellationException;
import lc.InterfaceC4988e;
import mc.C5045b;
import mc.C5046c;
import nc.h;
import vc.l;

/* JADX INFO: renamed from: be.b, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC2924b {

    /* JADX INFO: renamed from: be.b$a */
    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class a implements InterfaceC2872f {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ InterfaceC2138l f25502a;

        public a(InterfaceC2138l interfaceC2138l) {
            this.f25502a = interfaceC2138l;
        }

        @Override // b7.InterfaceC2872f
        public final void a(Task task) {
            Exception excL = task.l();
            if (excL != null) {
                InterfaceC2138l interfaceC2138l = this.f25502a;
                C4035r.a aVar = C4035r.f34274b;
                interfaceC2138l.resumeWith(C4035r.b(AbstractC4036s.a(excL)));
                return;
            }
            boolean zO = task.o();
            InterfaceC2138l interfaceC2138l2 = this.f25502a;
            if (zO) {
                InterfaceC2138l.a.a(interfaceC2138l2, null, 1, null);
            } else {
                C4035r.a aVar2 = C4035r.f34274b;
                interfaceC2138l2.resumeWith(C4035r.b(task.m()));
            }
        }
    }

    /* JADX INFO: renamed from: be.b$b, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class C0331b implements l {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ C2868b f25503a;

        public C0331b(C2868b c2868b) {
            this.f25503a = c2868b;
        }

        public final void a(Throwable th) {
            this.f25503a.a();
        }

        @Override // vc.l
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((Throwable) obj);
            return C4015H.f34254a;
        }
    }

    public static final Object a(Task task, InterfaceC4988e interfaceC4988e) {
        return b(task, null, interfaceC4988e);
    }

    public static final Object b(Task task, C2868b c2868b, InterfaceC4988e interfaceC4988e) throws Exception {
        if (!task.p()) {
            C2142n c2142n = new C2142n(C5045b.c(interfaceC4988e), 1);
            c2142n.E();
            task.c(ExecutorC2923a.f25501a, new a(c2142n));
            if (c2868b != null) {
                c2142n.b(new C0331b(c2868b));
            }
            Object objW = c2142n.w();
            if (objW == C5046c.f()) {
                h.c(interfaceC4988e);
            }
            return objW;
        }
        Exception excL = task.l();
        if (excL != null) {
            throw excL;
        }
        if (!task.o()) {
            return task.m();
        }
        throw new CancellationException("Task " + task + " was cancelled normally.");
    }
}
