package com.braze.communication.dust;

import Rd.AbstractC2128g;
import Rd.C2123d0;
import Rd.I;
import Rd.N;
import Td.v;
import fc.AbstractC4036s;
import fc.C4015H;
import java.io.BufferedReader;
import lc.InterfaceC4988e;
import mc.C5046c;
import nc.m;
import vc.p;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public final class e extends m implements p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f27541a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f27542b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ BufferedReader f27543c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(BufferedReader bufferedReader, InterfaceC4988e interfaceC4988e) {
        super(2, interfaceC4988e);
        this.f27543c = bufferedReader;
    }

    @Override // nc.AbstractC5157a
    public final InterfaceC4988e create(Object obj, InterfaceC4988e interfaceC4988e) {
        e eVar = new e(this.f27543c, interfaceC4988e);
        eVar.f27542b = obj;
        return eVar;
    }

    @Override // vc.p
    public final Object invoke(Object obj, Object obj2) {
        e eVar = new e(this.f27543c, (InterfaceC4988e) obj2);
        eVar.f27542b = (v) obj;
        return eVar.invokeSuspend(C4015H.f34254a);
    }

    @Override // nc.AbstractC5157a
    public final Object invokeSuspend(Object obj) throws Throwable {
        v vVar;
        Object objF = C5046c.f();
        int i10 = this.f27541a;
        if (i10 == 0) {
            AbstractC4036s.b(obj);
            vVar = (v) this.f27542b;
        } else {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            vVar = (v) this.f27542b;
            AbstractC4036s.b(obj);
        }
        while (N.f(vVar)) {
            I iB = C2123d0.b();
            d dVar = new d(this.f27543c, vVar, null);
            this.f27542b = vVar;
            this.f27541a = 1;
            if (AbstractC2128g.g(iB, dVar, this) == objF) {
                return objF;
            }
        }
        return C4015H.f34254a;
    }
}
