package com.braze;

import Rd.M;
import com.braze.managers.j1;
import com.braze.support.BrazeLogger;
import fc.AbstractC4036s;
import fc.C4015H;
import kotlin.jvm.internal.AbstractC4862t;
import lc.InterfaceC4988e;
import mc.C5046c;
import org.json.JSONObject;
import vc.InterfaceC6082a;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public final class c extends nc.m implements vc.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f27513a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Braze f27514b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ JSONObject f27515c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(Braze braze, JSONObject jSONObject, InterfaceC4988e interfaceC4988e) {
        super(2, interfaceC4988e);
        this.f27514b = braze;
        this.f27515c = jSONObject;
    }

    public static final String a() {
        return "Content Cards are disabled. Not deserializing json. Returning null.";
    }

    public static final String b() {
        return "Cannot deserialize null content card json. Returning null.";
    }

    @Override // nc.AbstractC5157a
    public final InterfaceC4988e create(Object obj, InterfaceC4988e interfaceC4988e) {
        c cVar = new c(this.f27514b, this.f27515c, interfaceC4988e);
        cVar.f27513a = obj;
        return cVar;
    }

    @Override // vc.p
    public final Object invoke(Object obj, Object obj2) {
        return ((c) create((M) obj, (InterfaceC4988e) obj2)).invokeSuspend(C4015H.f34254a);
    }

    @Override // nc.AbstractC5157a
    public final Object invokeSuspend(Object obj) throws Throwable {
        C5046c.f();
        AbstractC4036s.b(obj);
        M m10 = (M) this.f27513a;
        if (!((j1) this.f27514b.getUdm$android_sdk_base_release()).f27926o.E()) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) m10, BrazeLogger.Priority.f28628W, (Throwable) null, false, new InterfaceC6082a() { // from class: R4.n4
                @Override // vc.InterfaceC6082a
                public final Object invoke() {
                    return com.braze.c.a();
                }
            }, 6, (Object) null);
            return null;
        }
        if (this.f27515c == null) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) m10, BrazeLogger.Priority.f28628W, (Throwable) null, false, new InterfaceC6082a() { // from class: R4.o4
                @Override // vc.InterfaceC6082a
                public final Object invoke() {
                    return com.braze.c.b();
                }
            }, 6, (Object) null);
            return null;
        }
        com.braze.storage.p pVar = ((j1) this.f27514b.getUdm$android_sdk_base_release()).f27908D;
        JSONObject cardJson = this.f27515c;
        pVar.getClass();
        AbstractC4862t.e(cardJson, "cardJson");
        return com.braze.models.h.a(cardJson, pVar.f28524b, pVar, pVar.f28532j);
    }
}
