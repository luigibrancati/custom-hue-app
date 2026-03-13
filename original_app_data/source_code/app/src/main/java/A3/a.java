package A3;

import Rd.AbstractC2132i;
import Rd.AbstractC2152s0;
import Rd.InterfaceC2166z0;
import Rd.M;
import Rd.N;
import Ud.InterfaceC2313e;
import Ud.InterfaceC2314f;
import fc.AbstractC4036s;
import fc.C4015H;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.Executor;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.jvm.internal.AbstractC4862t;
import lc.InterfaceC4988e;
import mc.C5046c;
import nc.m;
import vc.p;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ReentrantLock f141a = new ReentrantLock();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Map f142b = new LinkedHashMap();

    /* JADX INFO: renamed from: A3.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class C0002a extends m implements p {

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public int f143j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public final /* synthetic */ InterfaceC2313e f144k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public final /* synthetic */ X0.a f145l;

        /* JADX INFO: renamed from: A3.a$a$a, reason: collision with other inner class name */
        /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
        public static final class C0003a implements InterfaceC2314f {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final /* synthetic */ X0.a f146a;

            public C0003a(X0.a aVar) {
                this.f146a = aVar;
            }

            @Override // Ud.InterfaceC2314f
            public final Object emit(Object obj, InterfaceC4988e interfaceC4988e) {
                this.f146a.accept(obj);
                return C4015H.f34254a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C0002a(InterfaceC2313e interfaceC2313e, X0.a aVar, InterfaceC4988e interfaceC4988e) {
            super(2, interfaceC4988e);
            this.f144k = interfaceC2313e;
            this.f145l = aVar;
        }

        @Override // nc.AbstractC5157a
        public final InterfaceC4988e create(Object obj, InterfaceC4988e interfaceC4988e) {
            return new C0002a(this.f144k, this.f145l, interfaceC4988e);
        }

        @Override // vc.p
        public final Object invoke(M m10, InterfaceC4988e interfaceC4988e) {
            return ((C0002a) create(m10, interfaceC4988e)).invokeSuspend(C4015H.f34254a);
        }

        @Override // nc.AbstractC5157a
        public final Object invokeSuspend(Object obj) throws Throwable {
            Object objF = C5046c.f();
            int i10 = this.f143j;
            if (i10 == 0) {
                AbstractC4036s.b(obj);
                InterfaceC2313e interfaceC2313e = this.f144k;
                C0003a c0003a = new C0003a(this.f145l);
                this.f143j = 1;
                if (interfaceC2313e.collect(c0003a, this) == objF) {
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

    public final void a(Executor executor, X0.a consumer, InterfaceC2313e flow) {
        AbstractC4862t.e(executor, "executor");
        AbstractC4862t.e(consumer, "consumer");
        AbstractC4862t.e(flow, "flow");
        ReentrantLock reentrantLock = this.f141a;
        reentrantLock.lock();
        try {
            if (this.f142b.get(consumer) == null) {
                this.f142b.put(consumer, AbstractC2132i.d(N.a(AbstractC2152s0.b(executor)), null, null, new C0002a(flow, consumer, null), 3, null));
            }
            C4015H c4015h = C4015H.f34254a;
            reentrantLock.unlock();
        } catch (Throwable th) {
            reentrantLock.unlock();
            throw th;
        }
    }

    public final void b(X0.a consumer) {
        AbstractC4862t.e(consumer, "consumer");
        ReentrantLock reentrantLock = this.f141a;
        reentrantLock.lock();
        try {
            InterfaceC2166z0 interfaceC2166z0 = (InterfaceC2166z0) this.f142b.get(consumer);
            if (interfaceC2166z0 != null) {
                InterfaceC2166z0.a.a(interfaceC2166z0, null, 1, null);
            }
            reentrantLock.unlock();
        } catch (Throwable th) {
            reentrantLock.unlock();
            throw th;
        }
    }
}
