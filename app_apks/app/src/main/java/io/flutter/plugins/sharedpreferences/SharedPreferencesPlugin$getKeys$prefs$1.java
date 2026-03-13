package io.flutter.plugins.sharedpreferences;

import Rd.M;
import fc.AbstractC4036s;
import fc.C4015H;
import java.util.List;
import kotlin.Metadata;
import lc.InterfaceC4988e;
import mc.C5046c;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"LRd/M;", "", "", "", "<anonymous>", "(LRd/M;)Ljava/util/Map;"}, k = 3, mv = {2, 2, 0})
@nc.f(c = "io.flutter.plugins.sharedpreferences.SharedPreferencesPlugin$getKeys$prefs$1", f = "SharedPreferencesPlugin.kt", l = {248}, m = "invokeSuspend")
public final class SharedPreferencesPlugin$getKeys$prefs$1 extends nc.m implements vc.p {
    final /* synthetic */ List<String> $allowList;
    int label;
    final /* synthetic */ SharedPreferencesPlugin this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SharedPreferencesPlugin$getKeys$prefs$1(SharedPreferencesPlugin sharedPreferencesPlugin, List<String> list, InterfaceC4988e interfaceC4988e) {
        super(2, interfaceC4988e);
        this.this$0 = sharedPreferencesPlugin;
        this.$allowList = list;
    }

    @Override // nc.AbstractC5157a
    public final InterfaceC4988e create(Object obj, InterfaceC4988e interfaceC4988e) {
        return new SharedPreferencesPlugin$getKeys$prefs$1(this.this$0, this.$allowList, interfaceC4988e);
    }

    @Override // vc.p
    public final Object invoke(M m10, InterfaceC4988e interfaceC4988e) {
        return ((SharedPreferencesPlugin$getKeys$prefs$1) create(m10, interfaceC4988e)).invokeSuspend(C4015H.f34254a);
    }

    @Override // nc.AbstractC5157a
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objF = C5046c.f();
        int i10 = this.label;
        if (i10 != 0) {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC4036s.b(obj);
            return obj;
        }
        AbstractC4036s.b(obj);
        SharedPreferencesPlugin sharedPreferencesPlugin = this.this$0;
        List<String> list = this.$allowList;
        this.label = 1;
        Object prefs = sharedPreferencesPlugin.getPrefs(list, this);
        return prefs == objF ? objF : prefs;
    }
}
