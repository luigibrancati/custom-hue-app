package com.braze;

import com.braze.models.outgoing.AttributionData;
import com.braze.storage.n3;
import fc.AbstractC4036s;
import fc.C4015H;
import lc.InterfaceC4988e;
import mc.C5046c;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public final class y extends nc.m implements vc.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ BrazeUser f28765a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ AttributionData f28766b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y(BrazeUser brazeUser, AttributionData attributionData, InterfaceC4988e interfaceC4988e) {
        super(2, interfaceC4988e);
        this.f28765a = brazeUser;
        this.f28766b = attributionData;
    }

    @Override // nc.AbstractC5157a
    public final InterfaceC4988e create(Object obj, InterfaceC4988e interfaceC4988e) {
        return new y(this.f28765a, this.f28766b, interfaceC4988e);
    }

    @Override // vc.p
    public final Object invoke(Object obj, Object obj2) {
        return new y(this.f28765a, this.f28766b, (InterfaceC4988e) obj2).invokeSuspend(C4015H.f34254a);
    }

    @Override // nc.AbstractC5157a
    public final Object invokeSuspend(Object obj) throws Throwable {
        JSONObject key;
        C5046c.f();
        AbstractC4036s.b(obj);
        n3 n3Var = this.f28765a.userCache;
        AttributionData attributionData = this.f28766b;
        synchronized (n3Var) {
            if (attributionData != null) {
                try {
                    key = attributionData.getKey();
                } catch (Throwable th) {
                    throw th;
                }
            } else {
                key = null;
            }
            n3Var.b(key);
        }
        return C4015H.f34254a;
    }
}
