package j1;

import android.content.Context;
import fc.AbstractC4036s;
import fc.C4015H;
import gc.C4207u;
import i1.C4317b;
import i1.C4319d;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;
import k1.AbstractC4785h;
import k1.AbstractC4788k;
import k1.C4781d;
import kotlin.jvm.internal.AbstractC4862t;
import lc.InterfaceC4988e;
import mc.C5046c;
import nc.AbstractC5158b;
import nc.m;
import vc.p;
import vc.q;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public abstract class k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Set f38935a = new LinkedHashSet();

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class a extends m implements q {

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public int f38936j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public /* synthetic */ Object f38937k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public /* synthetic */ Object f38938l;

        public a(InterfaceC4988e interfaceC4988e) {
            super(3, interfaceC4988e);
        }

        @Override // vc.q
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(C4319d c4319d, AbstractC4785h abstractC4785h, InterfaceC4988e interfaceC4988e) {
            a aVar = new a(interfaceC4988e);
            aVar.f38937k = c4319d;
            aVar.f38938l = abstractC4785h;
            return aVar.invokeSuspend(C4015H.f34254a);
        }

        @Override // nc.AbstractC5157a
        public final Object invokeSuspend(Object obj) throws Throwable {
            C5046c.f();
            if (this.f38936j != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC4036s.b(obj);
            C4319d c4319d = (C4319d) this.f38937k;
            AbstractC4785h abstractC4785h = (AbstractC4785h) this.f38938l;
            Set setKeySet = abstractC4785h.a().keySet();
            ArrayList arrayList = new ArrayList(C4207u.v(setKeySet, 10));
            Iterator it = setKeySet.iterator();
            while (it.hasNext()) {
                arrayList.add(((AbstractC4785h.a) it.next()).a());
            }
            Map mapB = c4319d.b();
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            for (Map.Entry entry : mapB.entrySet()) {
                if (!arrayList.contains((String) entry.getKey())) {
                    linkedHashMap.put(entry.getKey(), entry.getValue());
                }
            }
            C4781d c4781dD = abstractC4785h.d();
            for (Map.Entry entry2 : linkedHashMap.entrySet()) {
                String str = (String) entry2.getKey();
                Object value = entry2.getValue();
                if (value instanceof Boolean) {
                    c4781dD.l(AbstractC4788k.a(str), value);
                } else if (value instanceof Float) {
                    c4781dD.l(AbstractC4788k.d(str), value);
                } else if (value instanceof Integer) {
                    c4781dD.l(AbstractC4788k.e(str), value);
                } else if (value instanceof Long) {
                    c4781dD.l(AbstractC4788k.f(str), value);
                } else if (value instanceof String) {
                    c4781dD.l(AbstractC4788k.g(str), value);
                } else if (value instanceof Set) {
                    AbstractC4785h.a aVarH = AbstractC4788k.h(str);
                    AbstractC4862t.c(value, "null cannot be cast to non-null type kotlin.collections.Set<kotlin.String>");
                    c4781dD.l(aVarH, (Set) value);
                }
            }
            return c4781dD.e();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class b extends m implements p {

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public int f38939j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public /* synthetic */ Object f38940k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public final /* synthetic */ Set f38941l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(Set set, InterfaceC4988e interfaceC4988e) {
            super(2, interfaceC4988e);
            this.f38941l = set;
        }

        @Override // vc.p
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(AbstractC4785h abstractC4785h, InterfaceC4988e interfaceC4988e) {
            return ((b) create(abstractC4785h, interfaceC4988e)).invokeSuspend(C4015H.f34254a);
        }

        @Override // nc.AbstractC5157a
        public final InterfaceC4988e create(Object obj, InterfaceC4988e interfaceC4988e) {
            b bVar = new b(this.f38941l, interfaceC4988e);
            bVar.f38940k = obj;
            return bVar;
        }

        @Override // nc.AbstractC5157a
        public final Object invokeSuspend(Object obj) throws Throwable {
            C5046c.f();
            if (this.f38939j != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC4036s.b(obj);
            Set setKeySet = ((AbstractC4785h) this.f38940k).a().keySet();
            ArrayList arrayList = new ArrayList(C4207u.v(setKeySet, 10));
            Iterator it = setKeySet.iterator();
            while (it.hasNext()) {
                arrayList.add(((AbstractC4785h.a) it.next()).a());
            }
            boolean z10 = true;
            if (this.f38941l != k.c()) {
                Set set = this.f38941l;
                if (set == null || !set.isEmpty()) {
                    Iterator it2 = set.iterator();
                    while (it2.hasNext()) {
                        if (!arrayList.contains((String) it2.next())) {
                            break;
                        }
                    }
                    z10 = false;
                } else {
                    z10 = false;
                }
            }
            return AbstractC5158b.a(z10);
        }
    }

    public static final C4317b a(Context context, String sharedPreferencesName, Set keysToMigrate) {
        AbstractC4862t.e(context, "context");
        AbstractC4862t.e(sharedPreferencesName, "sharedPreferencesName");
        AbstractC4862t.e(keysToMigrate, "keysToMigrate");
        if (keysToMigrate != f38935a) {
            return new C4317b(context, sharedPreferencesName, keysToMigrate, e(keysToMigrate), d());
        }
        return new C4317b(context, sharedPreferencesName, null, e(keysToMigrate), d(), 4, null);
    }

    public static /* synthetic */ C4317b b(Context context, String str, Set set, int i10, Object obj) {
        if ((i10 & 4) != 0) {
            set = f38935a;
        }
        return a(context, str, set);
    }

    public static final Set c() {
        return f38935a;
    }

    public static final q d() {
        return new a(null);
    }

    public static final p e(Set set) {
        return new b(set, null);
    }
}
