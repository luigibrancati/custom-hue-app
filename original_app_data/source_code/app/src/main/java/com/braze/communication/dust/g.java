package com.braze.communication.dust;

import com.google.firebase.perf.network.FirebasePerfUrlConnection;
import fc.AbstractC4036s;
import fc.C4015H;
import java.net.URL;
import java.net.URLConnection;
import lc.InterfaceC4988e;
import mc.C5046c;
import nc.m;
import vc.p;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public final class g extends m implements p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ String f27546a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(String str, InterfaceC4988e interfaceC4988e) {
        super(2, interfaceC4988e);
        this.f27546a = str;
    }

    @Override // nc.AbstractC5157a
    public final InterfaceC4988e create(Object obj, InterfaceC4988e interfaceC4988e) {
        return new g(this.f27546a, interfaceC4988e);
    }

    @Override // vc.p
    public final Object invoke(Object obj, Object obj2) {
        return new g(this.f27546a, (InterfaceC4988e) obj2).invokeSuspend(C4015H.f34254a);
    }

    @Override // nc.AbstractC5157a
    public final Object invokeSuspend(Object obj) throws Throwable {
        C5046c.f();
        AbstractC4036s.b(obj);
        URLConnection uRLConnection = (URLConnection) FirebasePerfUrlConnection.instrument(new URL(this.f27546a).openConnection());
        uRLConnection.setRequestProperty("Accept", "text/event-stream");
        uRLConnection.setDoInput(true);
        uRLConnection.connect();
        return uRLConnection;
    }
}
