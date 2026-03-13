package Vd;

import Rd.AbstractC2132i;
import Rd.M;
import Ud.InterfaceC2313e;
import fc.AbstractC4036s;
import fc.C4015H;
import java.util.Iterator;
import kotlin.jvm.internal.AbstractC4854k;
import lc.C4993j;
import lc.InterfaceC4988e;
import lc.InterfaceC4992i;
import mc.C5046c;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public final class j extends e {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Iterable f17554d;

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class a extends nc.m implements vc.p {

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public int f17555j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public final /* synthetic */ InterfaceC2313e f17556k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public final /* synthetic */ z f17557l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(InterfaceC2313e interfaceC2313e, z zVar, InterfaceC4988e interfaceC4988e) {
            super(2, interfaceC4988e);
            this.f17556k = interfaceC2313e;
            this.f17557l = zVar;
        }

        @Override // nc.AbstractC5157a
        public final InterfaceC4988e create(Object obj, InterfaceC4988e interfaceC4988e) {
            return new a(this.f17556k, this.f17557l, interfaceC4988e);
        }

        @Override // vc.p
        public final Object invoke(M m10, InterfaceC4988e interfaceC4988e) {
            return ((a) create(m10, interfaceC4988e)).invokeSuspend(C4015H.f34254a);
        }

        @Override // nc.AbstractC5157a
        public final Object invokeSuspend(Object obj) throws Throwable {
            Object objF = C5046c.f();
            int i10 = this.f17555j;
            if (i10 == 0) {
                AbstractC4036s.b(obj);
                InterfaceC2313e interfaceC2313e = this.f17556k;
                z zVar = this.f17557l;
                this.f17555j = 1;
                if (interfaceC2313e.collect(zVar, this) == objF) {
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

    public /* synthetic */ j(Iterable iterable, InterfaceC4992i interfaceC4992i, int i10, Td.a aVar, int i11, AbstractC4854k abstractC4854k) {
        this(iterable, (i11 & 2) != 0 ? C4993j.f40088a : interfaceC4992i, (i11 & 4) != 0 ? -2 : i10, (i11 & 8) != 0 ? Td.a.SUSPEND : aVar);
    }

    @Override // Vd.e
    public Object e(Td.v vVar, InterfaceC4988e interfaceC4988e) {
        z zVar = new z(vVar);
        Iterator it = this.f17554d.iterator();
        while (it.hasNext()) {
            AbstractC2132i.d(vVar, null, null, new a((InterfaceC2313e) it.next(), zVar, null), 3, null);
        }
        return C4015H.f34254a;
    }

    @Override // Vd.e
    public e f(InterfaceC4992i interfaceC4992i, int i10, Td.a aVar) {
        return new j(this.f17554d, interfaceC4992i, i10, aVar);
    }

    @Override // Vd.e
    public Td.x i(M m10) {
        return Td.t.c(m10, this.f17521a, this.f17522b, g());
    }

    public j(Iterable iterable, InterfaceC4992i interfaceC4992i, int i10, Td.a aVar) {
        super(interfaceC4992i, i10, aVar);
        this.f17554d = iterable;
    }
}
