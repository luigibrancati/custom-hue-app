package com.braze.coroutine;

import Rd.AbstractC2132i;
import Rd.C2123d0;
import Rd.D0;
import Rd.InterfaceC2166z0;
import Rd.J;
import Rd.M;
import Rd.U0;
import com.braze.coroutine.BrazeCoroutineScope;
import com.braze.support.BrazeLogger;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC4862t;
import lc.InterfaceC4992i;
import vc.InterfaceC6082a;
import vc.l;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0004\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0007\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0001¢\u0006\u0004\b\u0005\u0010\u0003J=\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\b2\u001c\u0010\r\u001a\u0018\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u000b\u0012\u0006\u0012\u0004\u0018\u00010\f0\n¢\u0006\u0004\b\u000f\u0010\u0010R\"\u0010\u0012\u001a\u00020\u00118\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017R\u0014\u0010\u0019\u001a\u00020\u00188\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u001a\u0010\u001b\u001a\u00020\b8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001e¨\u0006\u001f"}, d2 = {"Lcom/braze/coroutine/BrazeCoroutineScope;", "LRd/M;", "<init>", "()V", "Lfc/H;", "cancelChildren", "", "startDelayInMs", "Llc/i;", "specificContext", "Lkotlin/Function1;", "Llc/e;", "", "block", "LRd/z0;", "launchDelayed", "(Ljava/lang/Number;Llc/i;Lvc/l;)LRd/z0;", "", "shouldReRaiseExceptions", "Z", "getShouldReRaiseExceptions$android_sdk_base_release", "()Z", "setShouldReRaiseExceptions$android_sdk_base_release", "(Z)V", "LRd/J;", "exceptionHandler", "LRd/J;", "coroutineContext", "Llc/i;", "getCoroutineContext", "()Llc/i;", "android-sdk-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class BrazeCoroutineScope implements M {
    public static final BrazeCoroutineScope INSTANCE = new BrazeCoroutineScope();
    private static final InterfaceC4992i coroutineContext;
    private static final J exceptionHandler;
    private static boolean shouldReRaiseExceptions;

    static {
        c cVar = new c(J.f15138L);
        exceptionHandler = cVar;
        coroutineContext = C2123d0.b().plus(cVar).plus(U0.b(null, 1, null));
    }

    private BrazeCoroutineScope() {
    }

    public static final void cancelChildren() {
        BrazeLogger brazeLogger = BrazeLogger.INSTANCE;
        BrazeCoroutineScope brazeCoroutineScope = INSTANCE;
        BrazeLogger.brazelog$default(brazeLogger, (Object) brazeCoroutineScope, BrazeLogger.Priority.f28626I, (Throwable) null, false, new InterfaceC6082a() { // from class: W4.a
            @Override // vc.InterfaceC6082a
            public final Object invoke() {
                return BrazeCoroutineScope.cancelChildren$lambda$1();
            }
        }, 6, (Object) null);
        D0.h(brazeCoroutineScope.getCoroutineContext(), null, 1, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String cancelChildren$lambda$1() {
        return "Cancelling children of BrazeCoroutineScope";
    }

    public static /* synthetic */ InterfaceC2166z0 launchDelayed$default(BrazeCoroutineScope brazeCoroutineScope, Number number, InterfaceC4992i interfaceC4992i, l lVar, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            interfaceC4992i = brazeCoroutineScope.getCoroutineContext();
        }
        return brazeCoroutineScope.launchDelayed(number, interfaceC4992i, lVar);
    }

    @Override // Rd.M
    public InterfaceC4992i getCoroutineContext() {
        return coroutineContext;
    }

    public final boolean getShouldReRaiseExceptions$android_sdk_base_release() {
        return shouldReRaiseExceptions;
    }

    public final InterfaceC2166z0 launchDelayed(Number startDelayInMs, InterfaceC4992i specificContext, l block) {
        AbstractC4862t.e(startDelayInMs, "startDelayInMs");
        AbstractC4862t.e(specificContext, "specificContext");
        AbstractC4862t.e(block, "block");
        return AbstractC2132i.d(this, specificContext, null, new b(startDelayInMs, block, null), 2, null);
    }
}
