package com.braze.storage;

import com.braze.storage.DataStoreProvider;
import com.braze.support.BrazeLogger;
import fc.AbstractC4036s;
import fc.C4015H;
import java.util.Map;
import java.util.Set;
import k1.AbstractC4788k;
import k1.C4781d;
import kotlin.jvm.internal.M;
import lc.InterfaceC4988e;
import mc.C5046c;
import vc.InterfaceC6082a;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public final class r extends nc.m implements vc.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f28550a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Set f28551b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Map f28552c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r(Set set, Map map, InterfaceC4988e interfaceC4988e) {
        super(2, interfaceC4988e);
        this.f28551b = set;
        this.f28552c = map;
    }

    public static final String a(String str) {
        return "Removing key: " + str + " from DataStore.";
    }

    public static final String b(String str, Object obj) {
        return "Unsupported value type for key '" + str + "': " + M.b(obj.getClass()).l();
    }

    @Override // nc.AbstractC5157a
    public final InterfaceC4988e create(Object obj, InterfaceC4988e interfaceC4988e) {
        r rVar = new r(this.f28551b, this.f28552c, interfaceC4988e);
        rVar.f28550a = obj;
        return rVar;
    }

    @Override // vc.p
    public final Object invoke(Object obj, Object obj2) {
        return ((r) create((C4781d) obj, (InterfaceC4988e) obj2)).invokeSuspend(C4015H.f34254a);
    }

    @Override // nc.AbstractC5157a
    public final Object invokeSuspend(Object obj) throws Throwable {
        C5046c.f();
        AbstractC4036s.b(obj);
        C4781d c4781d = (C4781d) this.f28550a;
        for (final String str : this.f28551b) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, DataStoreProvider.INSTANCE.getTAG(), BrazeLogger.Priority.f28627V, (Throwable) null, false, new InterfaceC6082a() { // from class: r5.R2
                @Override // vc.InterfaceC6082a
                public final Object invoke() {
                    return com.braze.storage.r.a(str);
                }
            }, 12, (Object) null);
            c4781d.k(AbstractC4788k.g(str));
            c4781d.k(AbstractC4788k.e(str));
            c4781d.k(AbstractC4788k.f(str));
            c4781d.k(AbstractC4788k.d(str));
            c4781d.k(AbstractC4788k.c(str));
            c4781d.k(AbstractC4788k.a(str));
        }
        for (Map.Entry entry : this.f28552c.entrySet()) {
            final String str2 = (String) entry.getKey();
            final Object value = entry.getValue();
            BrazeLogger brazeLogger = BrazeLogger.INSTANCE;
            DataStoreProvider.Companion companion = DataStoreProvider.INSTANCE;
            BrazeLogger.brazelog$default(brazeLogger, companion.getTAG(), BrazeLogger.Priority.f28627V, (Throwable) null, false, new InterfaceC6082a() { // from class: r5.S2
                @Override // vc.InterfaceC6082a
                public final Object invoke() {
                    return com.braze.storage.r.a(str2, value);
                }
            }, 12, (Object) null);
            if (value instanceof String) {
                c4781d.l(AbstractC4788k.g(str2), value);
            } else if (value instanceof Integer) {
                c4781d.l(AbstractC4788k.e(str2), value);
            } else if (value instanceof Long) {
                c4781d.l(AbstractC4788k.f(str2), value);
            } else if (value instanceof Float) {
                c4781d.l(AbstractC4788k.d(str2), value);
            } else if (value instanceof Double) {
                c4781d.l(AbstractC4788k.c(str2), value);
            } else if (value instanceof Boolean) {
                c4781d.l(AbstractC4788k.a(str2), value);
            } else {
                BrazeLogger.brazelog$default(brazeLogger, companion.getTAG(), BrazeLogger.Priority.f28625E, (Throwable) null, false, new InterfaceC6082a() { // from class: r5.T2
                    @Override // vc.InterfaceC6082a
                    public final Object invoke() {
                        return com.braze.storage.r.b(str2, value);
                    }
                }, 12, (Object) null);
            }
        }
        return C4015H.f34254a;
    }

    public static final String a(String str, Object obj) {
        return "Adding/updating key: " + str + " with value: " + obj + " in DataStore.";
    }
}
