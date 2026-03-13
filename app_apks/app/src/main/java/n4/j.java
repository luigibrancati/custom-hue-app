package n4;

import Rd.InterfaceC2138l;
import fc.AbstractC4036s;
import fc.C4015H;
import fc.C4035r;
import java.io.IOException;
import kotlin.jvm.internal.AbstractC4862t;
import pe.C;
import pe.InterfaceC5469e;
import pe.InterfaceC5470f;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public final class j implements InterfaceC5470f, vc.l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final InterfaceC5469e f40563a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final InterfaceC2138l f40564b;

    public j(InterfaceC5469e call, InterfaceC2138l continuation) {
        AbstractC4862t.e(call, "call");
        AbstractC4862t.e(continuation, "continuation");
        this.f40563a = call;
        this.f40564b = continuation;
    }

    @Override // pe.InterfaceC5470f
    public void a(InterfaceC5469e call, IOException e10) {
        AbstractC4862t.e(call, "call");
        AbstractC4862t.e(e10, "e");
        if (call.c()) {
            return;
        }
        InterfaceC2138l interfaceC2138l = this.f40564b;
        C4035r.a aVar = C4035r.f34274b;
        interfaceC2138l.resumeWith(C4035r.b(AbstractC4036s.a(e10)));
    }

    @Override // pe.InterfaceC5470f
    public void b(InterfaceC5469e call, C response) {
        AbstractC4862t.e(call, "call");
        AbstractC4862t.e(response, "response");
        this.f40564b.resumeWith(C4035r.b(response));
    }

    public void c(Throwable th) {
        try {
            this.f40563a.cancel();
        } catch (Throwable unused) {
        }
    }

    @Override // vc.l
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        c((Throwable) obj);
        return C4015H.f34254a;
    }
}
