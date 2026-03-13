package mc;

import fc.AbstractC4036s;
import kotlin.jvm.internal.AbstractC4862t;
import kotlin.jvm.internal.T;
import lc.C4993j;
import lc.InterfaceC4988e;
import lc.InterfaceC4992i;
import nc.AbstractC5157a;
import nc.AbstractC5160d;
import nc.h;
import nc.j;
import vc.p;
import vc.q;

/* JADX INFO: renamed from: mc.b, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public class C5045b {

    /* JADX INFO: renamed from: mc.b$a */
    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class a extends j {

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public int f40280j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public final /* synthetic */ p f40281k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public final /* synthetic */ Object f40282l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(InterfaceC4988e interfaceC4988e, p pVar, Object obj) {
            super(interfaceC4988e);
            this.f40281k = pVar;
            this.f40282l = obj;
            AbstractC4862t.c(interfaceC4988e, "null cannot be cast to non-null type kotlin.coroutines.Continuation<kotlin.Any?>");
        }

        @Override // nc.AbstractC5157a
        public Object invokeSuspend(Object obj) throws Throwable {
            int i10 = this.f40280j;
            if (i10 == 0) {
                this.f40280j = 1;
                AbstractC4036s.b(obj);
                AbstractC4862t.c(this.f40281k, "null cannot be cast to non-null type kotlin.Function2<R of kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt.createCoroutineUnintercepted, kotlin.coroutines.Continuation<T of kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt.createCoroutineUnintercepted>, kotlin.Any?>");
                return ((p) T.f(this.f40281k, 2)).invoke(this.f40282l, this);
            }
            if (i10 != 1) {
                throw new IllegalStateException("This coroutine had already completed");
            }
            this.f40280j = 2;
            AbstractC4036s.b(obj);
            return obj;
        }
    }

    /* JADX INFO: renamed from: mc.b$b, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class C0529b extends AbstractC5160d {

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public int f40283j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public final /* synthetic */ p f40284k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public final /* synthetic */ Object f40285l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C0529b(InterfaceC4988e interfaceC4988e, InterfaceC4992i interfaceC4992i, p pVar, Object obj) {
            super(interfaceC4988e, interfaceC4992i);
            this.f40284k = pVar;
            this.f40285l = obj;
            AbstractC4862t.c(interfaceC4988e, "null cannot be cast to non-null type kotlin.coroutines.Continuation<kotlin.Any?>");
        }

        @Override // nc.AbstractC5157a
        public Object invokeSuspend(Object obj) throws Throwable {
            int i10 = this.f40283j;
            if (i10 == 0) {
                this.f40283j = 1;
                AbstractC4036s.b(obj);
                AbstractC4862t.c(this.f40284k, "null cannot be cast to non-null type kotlin.Function2<R of kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt.createCoroutineUnintercepted, kotlin.coroutines.Continuation<T of kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt.createCoroutineUnintercepted>, kotlin.Any?>");
                return ((p) T.f(this.f40284k, 2)).invoke(this.f40285l, this);
            }
            if (i10 != 1) {
                throw new IllegalStateException("This coroutine had already completed");
            }
            this.f40283j = 2;
            AbstractC4036s.b(obj);
            return obj;
        }
    }

    /* JADX INFO: renamed from: mc.b$c */
    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class c extends j {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(InterfaceC4988e interfaceC4988e) {
            super(interfaceC4988e);
            AbstractC4862t.c(interfaceC4988e, "null cannot be cast to non-null type kotlin.coroutines.Continuation<kotlin.Any?>");
        }

        @Override // nc.AbstractC5157a
        public Object invokeSuspend(Object obj) throws Throwable {
            AbstractC4036s.b(obj);
            return obj;
        }
    }

    /* JADX INFO: renamed from: mc.b$d */
    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class d extends AbstractC5160d {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(InterfaceC4988e interfaceC4988e, InterfaceC4992i interfaceC4992i) {
            super(interfaceC4988e, interfaceC4992i);
            AbstractC4862t.c(interfaceC4988e, "null cannot be cast to non-null type kotlin.coroutines.Continuation<kotlin.Any?>");
        }

        @Override // nc.AbstractC5157a
        public Object invokeSuspend(Object obj) throws Throwable {
            AbstractC4036s.b(obj);
            return obj;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static InterfaceC4988e a(p pVar, Object obj, InterfaceC4988e completion) {
        AbstractC4862t.e(pVar, "<this>");
        AbstractC4862t.e(completion, "completion");
        InterfaceC4988e interfaceC4988eA = h.a(completion);
        if (pVar instanceof AbstractC5157a) {
            return ((AbstractC5157a) pVar).create(obj, interfaceC4988eA);
        }
        InterfaceC4992i context = interfaceC4988eA.getContext();
        return context == C4993j.f40088a ? new a(interfaceC4988eA, pVar, obj) : new C0529b(interfaceC4988eA, context, pVar, obj);
    }

    public static final InterfaceC4988e b(InterfaceC4988e interfaceC4988e) {
        InterfaceC4992i context = interfaceC4988e.getContext();
        return context == C4993j.f40088a ? new c(interfaceC4988e) : new d(interfaceC4988e, context);
    }

    public static InterfaceC4988e c(InterfaceC4988e interfaceC4988e) {
        InterfaceC4988e interfaceC4988eIntercepted;
        AbstractC4862t.e(interfaceC4988e, "<this>");
        AbstractC5160d abstractC5160d = interfaceC4988e instanceof AbstractC5160d ? (AbstractC5160d) interfaceC4988e : null;
        return (abstractC5160d == null || (interfaceC4988eIntercepted = abstractC5160d.intercepted()) == null) ? interfaceC4988e : interfaceC4988eIntercepted;
    }

    public static Object d(p pVar, Object obj, InterfaceC4988e completion) {
        AbstractC4862t.e(pVar, "<this>");
        AbstractC4862t.e(completion, "completion");
        return ((p) T.f(pVar, 2)).invoke(obj, b(h.a(completion)));
    }

    public static Object e(q qVar, Object obj, Object obj2, InterfaceC4988e completion) {
        AbstractC4862t.e(qVar, "<this>");
        AbstractC4862t.e(completion, "completion");
        return ((q) T.f(qVar, 3)).invoke(obj, obj2, b(h.a(completion)));
    }
}
