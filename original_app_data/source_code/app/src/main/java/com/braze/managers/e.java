package com.braze.managers;

import Rd.M;
import android.content.Context;
import android.view.View;
import com.braze.Braze;
import fc.AbstractC4036s;
import fc.C4015H;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.jvm.internal.AbstractC4862t;
import lc.InterfaceC4988e;
import mc.C5046c;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public final class e extends nc.m implements vc.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ View f27856a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f27857b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ d f27858c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(View view, String str, d dVar, InterfaceC4988e interfaceC4988e) {
        super(2, interfaceC4988e);
        this.f27856a = view;
        this.f27857b = str;
        this.f27858c = dVar;
    }

    @Override // nc.AbstractC5157a
    public final InterfaceC4988e create(Object obj, InterfaceC4988e interfaceC4988e) {
        return new e(this.f27856a, this.f27857b, this.f27858c, interfaceC4988e);
    }

    @Override // vc.p
    public final Object invoke(Object obj, Object obj2) {
        return ((e) create((M) obj, (InterfaceC4988e) obj2)).invokeSuspend(C4015H.f34254a);
    }

    @Override // nc.AbstractC5157a
    public final Object invokeSuspend(Object obj) throws Throwable {
        C5046c.f();
        AbstractC4036s.b(obj);
        Braze.Companion companion = Braze.INSTANCE;
        Context context = this.f27856a.getContext();
        AbstractC4862t.d(context, "getContext(...)");
        companion.getInstance(context).logBannerImpression(this.f27857b);
        ReentrantLock reentrantLock = j.f27893k;
        d dVar = this.f27858c;
        reentrantLock.lock();
        try {
            dVar.f27849c = true;
            return C4015H.f34254a;
        } finally {
            reentrantLock.unlock();
        }
    }
}
