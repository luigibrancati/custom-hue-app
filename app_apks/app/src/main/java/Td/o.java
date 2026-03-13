package Td;

import Rd.AbstractC2130h;
import Rd.M;
import Td.k;
import fc.AbstractC4036s;
import fc.C4015H;
import fc.C4035r;
import lc.InterfaceC4988e;
import mc.C5046c;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public abstract /* synthetic */ class o {

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class a extends nc.m implements vc.p {

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public int f16415j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public /* synthetic */ Object f16416k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public final /* synthetic */ y f16417l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public final /* synthetic */ Object f16418m;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(y yVar, Object obj, InterfaceC4988e interfaceC4988e) {
            super(2, interfaceC4988e);
            this.f16417l = yVar;
            this.f16418m = obj;
        }

        @Override // nc.AbstractC5157a
        public final InterfaceC4988e create(Object obj, InterfaceC4988e interfaceC4988e) {
            a aVar = new a(this.f16417l, this.f16418m, interfaceC4988e);
            aVar.f16416k = obj;
            return aVar;
        }

        @Override // vc.p
        public final Object invoke(M m10, InterfaceC4988e interfaceC4988e) {
            return ((a) create(m10, interfaceC4988e)).invokeSuspend(C4015H.f34254a);
        }

        @Override // nc.AbstractC5157a
        public final Object invokeSuspend(Object obj) throws Throwable {
            Object objB;
            Object objF = C5046c.f();
            int i10 = this.f16415j;
            try {
                if (i10 == 0) {
                    AbstractC4036s.b(obj);
                    y yVar = this.f16417l;
                    Object obj2 = this.f16418m;
                    C4035r.a aVar = C4035r.f34274b;
                    this.f16415j = 1;
                    if (yVar.p(obj2, this) == objF) {
                        return objF;
                    }
                } else {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    AbstractC4036s.b(obj);
                }
                objB = C4035r.b(C4015H.f34254a);
            } catch (Throwable th) {
                C4035r.a aVar2 = C4035r.f34274b;
                objB = C4035r.b(AbstractC4036s.a(th));
            }
            return k.b(C4035r.h(objB) ? k.f16409b.c(C4015H.f34254a) : k.f16409b.a(C4035r.e(objB)));
        }
    }

    public static final Object a(y yVar, Object obj) {
        Object objN = yVar.n(obj);
        if (objN instanceof k.c) {
            return ((k) AbstractC2130h.b(null, new a(yVar, obj, null), 1, null)).l();
        }
        return k.f16409b.c(C4015H.f34254a);
    }
}
