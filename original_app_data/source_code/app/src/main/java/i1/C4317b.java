package i1;

import android.content.Context;
import android.content.SharedPreferences;
import fc.AbstractC4036s;
import fc.C4015H;
import fc.C4029l;
import fc.InterfaceC4028k;
import g1.InterfaceC4097g;
import gc.C4179C;
import java.io.IOException;
import java.util.Iterator;
import java.util.Set;
import kotlin.jvm.internal.AbstractC4854k;
import kotlin.jvm.internal.AbstractC4862t;
import lc.InterfaceC4988e;
import mc.C5046c;
import nc.AbstractC5158b;
import nc.AbstractC5160d;
import nc.m;
import vc.InterfaceC6082a;
import vc.p;
import vc.q;

/* JADX INFO: renamed from: i1.b, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public final class C4317b implements InterfaceC4097g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final p f36818a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final q f36819b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Context f36820c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f36821d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final InterfaceC4028k f36822e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Set f36823f;

    /* JADX INFO: renamed from: i1.b$a */
    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class a extends m implements p {

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public int f36824j;

        public a(InterfaceC4988e interfaceC4988e) {
            super(2, interfaceC4988e);
        }

        @Override // vc.p
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(Object obj, InterfaceC4988e interfaceC4988e) {
            return ((a) create(obj, interfaceC4988e)).invokeSuspend(C4015H.f34254a);
        }

        @Override // nc.AbstractC5157a
        public final InterfaceC4988e create(Object obj, InterfaceC4988e interfaceC4988e) {
            return new a(interfaceC4988e);
        }

        @Override // nc.AbstractC5157a
        public final Object invokeSuspend(Object obj) throws Throwable {
            C5046c.f();
            if (this.f36824j != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC4036s.b(obj);
            return AbstractC5158b.a(true);
        }
    }

    /* JADX INFO: renamed from: i1.b$b, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class C0480b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final C0480b f36825a = new C0480b();

        public static final boolean a(Context context, String name) {
            AbstractC4862t.e(context, "context");
            AbstractC4862t.e(name, "name");
            return context.deleteSharedPreferences(name);
        }
    }

    /* JADX INFO: renamed from: i1.b$c */
    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class c extends AbstractC5160d {

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public /* synthetic */ Object f36826j;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public int f36828l;

        public c(InterfaceC4988e interfaceC4988e) {
            super(interfaceC4988e);
        }

        @Override // nc.AbstractC5157a
        public final Object invokeSuspend(Object obj) {
            this.f36826j = obj;
            this.f36828l |= Integer.MIN_VALUE;
            return C4317b.this.b(null, this);
        }
    }

    public C4317b(InterfaceC6082a interfaceC6082a, Set set, p pVar, q qVar, Context context, String str) {
        this.f36818a = pVar;
        this.f36819b = qVar;
        this.f36820c = context;
        this.f36821d = str;
        this.f36822e = C4029l.b(interfaceC6082a);
        this.f36823f = set == AbstractC4318c.a() ? null : C4179C.Y0(set);
    }

    public static final SharedPreferences e(Context context, String str) {
        SharedPreferences sharedPreferences = context.getSharedPreferences(str, 0);
        AbstractC4862t.d(sharedPreferences, "getSharedPreferences(...)");
        return sharedPreferences;
    }

    @Override // g1.InterfaceC4097g
    public Object a(Object obj, InterfaceC4988e interfaceC4988e) {
        return this.f36819b.invoke(new C4319d(g(), this.f36823f), obj, interfaceC4988e);
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // g1.InterfaceC4097g
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.Object b(java.lang.Object r5, lc.InterfaceC4988e r6) throws java.lang.Throwable {
        /*
            r4 = this;
            boolean r0 = r6 instanceof i1.C4317b.c
            if (r0 == 0) goto L13
            r0 = r6
            i1.b$c r0 = (i1.C4317b.c) r0
            int r1 = r0.f36828l
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f36828l = r1
            goto L18
        L13:
            i1.b$c r0 = new i1.b$c
            r0.<init>(r6)
        L18:
            java.lang.Object r6 = r0.f36826j
            java.lang.Object r1 = mc.C5046c.f()
            int r2 = r0.f36828l
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            fc.AbstractC4036s.b(r6)
            goto L3f
        L29:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L31:
            fc.AbstractC4036s.b(r6)
            vc.p r6 = r4.f36818a
            r0.f36828l = r3
            java.lang.Object r6 = r6.invoke(r5, r0)
            if (r6 != r1) goto L3f
            return r1
        L3f:
            java.lang.Boolean r6 = (java.lang.Boolean) r6
            boolean r5 = r6.booleanValue()
            r6 = 0
            if (r5 != 0) goto L4d
            java.lang.Boolean r4 = nc.AbstractC5158b.a(r6)
            return r4
        L4d:
            java.util.Set r5 = r4.f36823f
            if (r5 != 0) goto L67
            android.content.SharedPreferences r4 = r4.g()
            java.util.Map r4 = r4.getAll()
            java.lang.String r5 = "getAll(...)"
            kotlin.jvm.internal.AbstractC4862t.d(r4, r5)
            boolean r4 = r4.isEmpty()
            if (r4 != 0) goto L65
            goto L8a
        L65:
            r3 = r6
            goto L8a
        L67:
            android.content.SharedPreferences r4 = r4.g()
            if (r5 == 0) goto L74
            boolean r0 = r5.isEmpty()
            if (r0 == 0) goto L74
            goto L65
        L74:
            java.util.Iterator r5 = r5.iterator()
        L78:
            boolean r0 = r5.hasNext()
            if (r0 == 0) goto L65
            java.lang.Object r0 = r5.next()
            java.lang.String r0 = (java.lang.String) r0
            boolean r0 = r4.contains(r0)
            if (r0 == 0) goto L78
        L8a:
            java.lang.Boolean r4 = nc.AbstractC5158b.a(r3)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: i1.C4317b.b(java.lang.Object, lc.e):java.lang.Object");
    }

    @Override // g1.InterfaceC4097g
    public Object c(InterfaceC4988e interfaceC4988e) throws IOException {
        Context context;
        String str;
        SharedPreferences.Editor editorEdit = g().edit();
        Set set = this.f36823f;
        if (set == null) {
            editorEdit.clear();
        } else {
            Iterator it = set.iterator();
            while (it.hasNext()) {
                editorEdit.remove((String) it.next());
            }
        }
        if (!editorEdit.commit()) {
            throw new IOException("Unable to delete migrated keys from SharedPreferences.");
        }
        if (g().getAll().isEmpty() && (context = this.f36820c) != null && (str = this.f36821d) != null) {
            f(context, str);
        }
        Set set2 = this.f36823f;
        if (set2 != null) {
            set2.clear();
        }
        return C4015H.f34254a;
    }

    public final void f(Context context, String str) {
        C0480b.a(context, str);
    }

    public final SharedPreferences g() {
        return (SharedPreferences) this.f36822e.getValue();
    }

    public /* synthetic */ C4317b(Context context, String str, Set set, p pVar, q qVar, int i10, AbstractC4854k abstractC4854k) {
        this(context, str, (i10 & 4) != 0 ? AbstractC4318c.a() : set, (i10 & 8) != 0 ? new a(null) : pVar, qVar);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C4317b(final Context context, final String sharedPreferencesName, Set keysToMigrate, p shouldRunMigration, q migrate) {
        this(new InterfaceC6082a() { // from class: i1.a
            @Override // vc.InterfaceC6082a
            public final Object invoke() {
                return C4317b.e(context, sharedPreferencesName);
            }
        }, keysToMigrate, shouldRunMigration, migrate, context, sharedPreferencesName);
        AbstractC4862t.e(context, "context");
        AbstractC4862t.e(sharedPreferencesName, "sharedPreferencesName");
        AbstractC4862t.e(keysToMigrate, "keysToMigrate");
        AbstractC4862t.e(shouldRunMigration, "shouldRunMigration");
        AbstractC4862t.e(migrate, "migrate");
    }
}
