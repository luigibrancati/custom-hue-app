package M3;

import M3.b;
import O3.n;
import Q3.I;
import Ud.AbstractC2315g;
import Ud.InterfaceC2313e;
import Ud.InterfaceC2314f;
import Vd.l;
import fc.AbstractC4036s;
import fc.C4015H;
import gc.C4179C;
import gc.C4206t;
import gc.C4207u;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AbstractC4862t;
import lc.InterfaceC4988e;
import mc.C5046c;
import nc.m;
import vc.InterfaceC6082a;
import vc.q;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public final class j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f9254a;

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class a implements InterfaceC2313e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ InterfaceC2313e[] f9255a;

        /* JADX INFO: renamed from: M3.j$a$a, reason: collision with other inner class name */
        /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
        public static final class C0140a implements InterfaceC6082a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final /* synthetic */ InterfaceC2313e[] f9256a;

            public C0140a(InterfaceC2313e[] interfaceC2313eArr) {
                this.f9256a = interfaceC2313eArr;
            }

            @Override // vc.InterfaceC6082a
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Object[] invoke() {
                return new M3.b[this.f9256a.length];
            }
        }

        /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
        public static final class b extends m implements q {

            /* JADX INFO: renamed from: j, reason: collision with root package name */
            public int f9257j;

            /* JADX INFO: renamed from: k, reason: collision with root package name */
            public /* synthetic */ Object f9258k;

            /* JADX INFO: renamed from: l, reason: collision with root package name */
            public /* synthetic */ Object f9259l;

            public b(InterfaceC4988e interfaceC4988e) {
                super(3, interfaceC4988e);
            }

            @Override // vc.q
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Object invoke(InterfaceC2314f interfaceC2314f, Object[] objArr, InterfaceC4988e interfaceC4988e) {
                b bVar = new b(interfaceC4988e);
                bVar.f9258k = interfaceC2314f;
                bVar.f9259l = objArr;
                return bVar.invokeSuspend(C4015H.f34254a);
            }

            @Override // nc.AbstractC5157a
            public final Object invokeSuspend(Object obj) throws Throwable {
                M3.b bVar;
                Object objF = C5046c.f();
                int i10 = this.f9257j;
                if (i10 == 0) {
                    AbstractC4036s.b(obj);
                    InterfaceC2314f interfaceC2314f = (InterfaceC2314f) this.f9258k;
                    M3.b[] bVarArr = (M3.b[]) ((Object[]) this.f9259l);
                    int length = bVarArr.length;
                    int i11 = 0;
                    while (true) {
                        if (i11 >= length) {
                            bVar = null;
                            break;
                        }
                        bVar = bVarArr[i11];
                        if (!AbstractC4862t.a(bVar, b.a.f9229a)) {
                            break;
                        }
                        i11++;
                    }
                    if (bVar == null) {
                        bVar = b.a.f9229a;
                    }
                    this.f9257j = 1;
                    if (interfaceC2314f.emit(bVar, this) == objF) {
                        return objF;
                    }
                } else {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    AbstractC4036s.b(obj);
                }
                return C4015H.f34254a;
            }
        }

        public a(InterfaceC2313e[] interfaceC2313eArr) {
            this.f9255a = interfaceC2313eArr;
        }

        @Override // Ud.InterfaceC2313e
        public Object collect(InterfaceC2314f interfaceC2314f, InterfaceC4988e interfaceC4988e) {
            InterfaceC2313e[] interfaceC2313eArr = this.f9255a;
            Object objA = l.a(interfaceC2314f, interfaceC2313eArr, new C0140a(interfaceC2313eArr), new b(null), interfaceC4988e);
            return objA == C5046c.f() ? objA : C4015H.f34254a;
        }
    }

    public j(List controllers) {
        AbstractC4862t.e(controllers, "controllers");
        this.f9254a = controllers;
    }

    public final InterfaceC2313e a(I spec) {
        AbstractC4862t.e(spec, "spec");
        List list = this.f9254a;
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            if (((N3.e) obj).a(spec)) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList(C4207u.v(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add(((N3.e) it.next()).b(spec.f13597j));
        }
        return AbstractC2315g.l(new a((InterfaceC2313e[]) C4179C.V0(arrayList2).toArray(new InterfaceC2313e[0])));
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public j(n trackers) {
        this(C4206t.p(new N3.c(trackers.a()), new N3.d(trackers.b()), new N3.j(trackers.e()), new N3.f(trackers.d()), new N3.i(trackers.d()), new N3.h(trackers.d()), new N3.g(trackers.d()), k.a(trackers.c())));
        AbstractC4862t.e(trackers, "trackers");
    }
}
