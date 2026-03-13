package com.braze;

import com.braze.enums.NotificationSubscriptionType;
import com.braze.storage.n3;
import fc.AbstractC4036s;
import fc.C4015H;
import lc.InterfaceC4988e;
import mc.C5046c;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public final class d0 extends nc.m implements vc.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ BrazeUser f27591a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ NotificationSubscriptionType f27592b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d0(BrazeUser brazeUser, NotificationSubscriptionType notificationSubscriptionType, InterfaceC4988e interfaceC4988e) {
        super(2, interfaceC4988e);
        this.f27591a = brazeUser;
        this.f27592b = notificationSubscriptionType;
    }

    @Override // nc.AbstractC5157a
    public final InterfaceC4988e create(Object obj, InterfaceC4988e interfaceC4988e) {
        return new d0(this.f27591a, this.f27592b, interfaceC4988e);
    }

    @Override // vc.p
    public final Object invoke(Object obj, Object obj2) {
        return new d0(this.f27591a, this.f27592b, (InterfaceC4988e) obj2).invokeSuspend(C4015H.f34254a);
    }

    @Override // nc.AbstractC5157a
    public final Object invokeSuspend(Object obj) throws Throwable {
        String key;
        C5046c.f();
        AbstractC4036s.b(obj);
        n3 n3Var = this.f27591a.userCache;
        NotificationSubscriptionType notificationSubscriptionType = this.f27592b;
        synchronized (n3Var) {
            if (notificationSubscriptionType != null) {
                try {
                    key = notificationSubscriptionType.getKey();
                } catch (Throwable th) {
                    throw th;
                }
            } else {
                key = null;
            }
            n3Var.c("email_subscribe", key);
        }
        return C4015H.f34254a;
    }
}
