package com.braze.coroutine;

import Rd.AbstractC2152s0;
import Rd.D0;
import Rd.J;
import Rd.M;
import Rd.U0;
import com.braze.coroutine.f;
import com.braze.support.BrazeLogger;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import kotlin.jvm.internal.AbstractC4862t;
import lc.InterfaceC4992i;
import vc.InterfaceC6082a;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public final class f implements M {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final f f27586a = new f();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static com.braze.events.d f27587b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final InterfaceC4992i f27588c;

    static {
        e eVar = new e(J.f15138L);
        ExecutorService executorServiceNewSingleThreadExecutor = Executors.newSingleThreadExecutor();
        AbstractC4862t.d(executorServiceNewSingleThreadExecutor, "newSingleThreadExecutor(...)");
        f27588c = AbstractC2152s0.c(executorServiceNewSingleThreadExecutor).plus(eVar).plus(U0.b(null, 1, null));
    }

    public static final String b() {
        return "Cancelling children of SerialCoroutineScope";
    }

    public final void a() {
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.f28626I, (Throwable) null, false, new InterfaceC6082a() { // from class: W4.b
            @Override // vc.InterfaceC6082a
            public final Object invoke() {
                return f.b();
            }
        }, 6, (Object) null);
        D0.h(f27588c, null, 1, null);
    }

    @Override // Rd.M
    public final InterfaceC4992i getCoroutineContext() {
        return f27588c;
    }
}
