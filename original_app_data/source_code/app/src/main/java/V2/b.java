package V2;

import B0.c;
import O7.e;
import Rd.U;
import fc.C4015H;
import java.util.concurrent.CancellationException;
import kotlin.jvm.internal.AbstractC4862t;
import kotlin.jvm.internal.v;
import vc.l;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public abstract class b {

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class a extends v implements l {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ c.a f17249a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ U f17250b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(c.a aVar, U u10) {
            super(1);
            this.f17249a = aVar;
            this.f17250b = u10;
        }

        public final void a(Throwable th) {
            if (th == null) {
                this.f17249a.c(this.f17250b.f());
            } else if (th instanceof CancellationException) {
                this.f17249a.d();
            } else {
                this.f17249a.f(th);
            }
        }

        @Override // vc.l
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((Throwable) obj);
            return C4015H.f34254a;
        }
    }

    public static final e b(final U u10, final Object obj) {
        AbstractC4862t.e(u10, "<this>");
        e eVarA = c.a(new c.InterfaceC0018c() { // from class: V2.a
            @Override // B0.c.InterfaceC0018c
            public final Object a(c.a aVar) {
                return b.d(u10, obj, aVar);
            }
        });
        AbstractC4862t.d(eVarA, "getFuture { completer ->…      }\n        tag\n    }");
        return eVarA;
    }

    public static /* synthetic */ e c(U u10, Object obj, int i10, Object obj2) {
        if ((i10 & 1) != 0) {
            obj = "Deferred.asListenableFuture";
        }
        return b(u10, obj);
    }

    public static final Object d(U this_asListenableFuture, Object obj, c.a completer) {
        AbstractC4862t.e(this_asListenableFuture, "$this_asListenableFuture");
        AbstractC4862t.e(completer, "completer");
        this_asListenableFuture.u(new a(completer, this_asListenableFuture));
        return obj;
    }
}
