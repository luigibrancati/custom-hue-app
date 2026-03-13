package androidx.room;

import Rd.AbstractC2132i;
import Rd.M;
import Ud.C;
import Ud.InterfaceC2313e;
import Ud.InterfaceC2314f;
import Ud.v;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.os.RemoteException;
import android.util.Log;
import androidx.room.IMultiInstanceInvalidationCallback;
import androidx.room.IMultiInstanceInvalidationService;
import androidx.room.a;
import fc.AbstractC4036s;
import fc.C4015H;
import gc.U;
import java.util.Arrays;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.jvm.internal.AbstractC4862t;
import lc.InterfaceC4988e;
import mc.C5046c;
import nc.AbstractC5160d;
import nc.m;
import vc.p;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public final class MultiInstanceInvalidationClient {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f24563a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final androidx.room.a f24564b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Context f24565c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final M f24566d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final AtomicBoolean f24567e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f24568f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public IMultiInstanceInvalidationService f24569g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final v f24570h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final b f24571i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final IMultiInstanceInvalidationCallback f24572j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final ServiceConnection f24573k;

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class a implements InterfaceC2313e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ InterfaceC2313e f24574a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ String[] f24575b;

        /* JADX INFO: renamed from: androidx.room.MultiInstanceInvalidationClient$a$a, reason: collision with other inner class name */
        /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
        public static final class C0313a implements InterfaceC2314f {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final /* synthetic */ InterfaceC2314f f24576a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ String[] f24577b;

            /* JADX INFO: renamed from: androidx.room.MultiInstanceInvalidationClient$a$a$a, reason: collision with other inner class name */
            /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
            public static final class C0314a extends AbstractC5160d {

                /* JADX INFO: renamed from: j, reason: collision with root package name */
                public /* synthetic */ Object f24578j;

                /* JADX INFO: renamed from: k, reason: collision with root package name */
                public int f24579k;

                public C0314a(InterfaceC4988e interfaceC4988e) {
                    super(interfaceC4988e);
                }

                @Override // nc.AbstractC5157a
                public final Object invokeSuspend(Object obj) {
                    this.f24578j = obj;
                    this.f24579k |= Integer.MIN_VALUE;
                    return C0313a.this.emit(null, this);
                }
            }

            public C0313a(InterfaceC2314f interfaceC2314f, String[] strArr) {
                this.f24576a = interfaceC2314f;
                this.f24577b = strArr;
            }

            /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
            @Override // Ud.InterfaceC2314f
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            public final java.lang.Object emit(java.lang.Object r10, lc.InterfaceC4988e r11) throws java.lang.Throwable {
                /*
                    r9 = this;
                    boolean r0 = r11 instanceof androidx.room.MultiInstanceInvalidationClient.a.C0313a.C0314a
                    if (r0 == 0) goto L13
                    r0 = r11
                    androidx.room.MultiInstanceInvalidationClient$a$a$a r0 = (androidx.room.MultiInstanceInvalidationClient.a.C0313a.C0314a) r0
                    int r1 = r0.f24579k
                    r2 = -2147483648(0xffffffff80000000, float:-0.0)
                    r3 = r1 & r2
                    if (r3 == 0) goto L13
                    int r1 = r1 - r2
                    r0.f24579k = r1
                    goto L18
                L13:
                    androidx.room.MultiInstanceInvalidationClient$a$a$a r0 = new androidx.room.MultiInstanceInvalidationClient$a$a$a
                    r0.<init>(r11)
                L18:
                    java.lang.Object r11 = r0.f24578j
                    java.lang.Object r1 = mc.C5046c.f()
                    int r2 = r0.f24579k
                    r3 = 1
                    if (r2 == 0) goto L31
                    if (r2 != r3) goto L29
                    fc.AbstractC4036s.b(r11)
                    goto L77
                L29:
                    java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
                    java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
                    r9.<init>(r10)
                    throw r9
                L31:
                    fc.AbstractC4036s.b(r11)
                    Ud.f r11 = r9.f24576a
                    java.util.Set r10 = (java.util.Set) r10
                    java.util.Set r2 = gc.T.b()
                    java.lang.String[] r9 = r9.f24577b
                    int r4 = r9.length
                    r5 = 0
                L40:
                    if (r5 >= r4) goto L61
                    r6 = r9[r5]
                    java.util.Iterator r7 = r10.iterator()
                L48:
                    boolean r8 = r7.hasNext()
                    if (r8 == 0) goto L5e
                    java.lang.Object r8 = r7.next()
                    java.lang.String r8 = (java.lang.String) r8
                    boolean r8 = Od.C.E(r6, r8, r3)
                    if (r8 == 0) goto L48
                    r2.add(r6)
                    goto L48
                L5e:
                    int r5 = r5 + 1
                    goto L40
                L61:
                    java.util.Set r9 = gc.T.a(r2)
                    boolean r10 = r9.isEmpty()
                    if (r10 == 0) goto L6c
                    r9 = 0
                L6c:
                    if (r9 == 0) goto L77
                    r0.f24579k = r3
                    java.lang.Object r9 = r11.emit(r9, r0)
                    if (r9 != r1) goto L77
                    return r1
                L77:
                    fc.H r9 = fc.C4015H.f34254a
                    return r9
                */
                throw new UnsupportedOperationException("Method not decompiled: androidx.room.MultiInstanceInvalidationClient.a.C0313a.emit(java.lang.Object, lc.e):java.lang.Object");
            }
        }

        public a(InterfaceC2313e interfaceC2313e, String[] strArr) {
            this.f24574a = interfaceC2313e;
            this.f24575b = strArr;
        }

        @Override // Ud.InterfaceC2313e
        public Object collect(InterfaceC2314f interfaceC2314f, InterfaceC4988e interfaceC4988e) {
            Object objCollect = this.f24574a.collect(new C0313a(interfaceC2314f, this.f24575b), interfaceC4988e);
            return objCollect == C5046c.f() ? objCollect : C4015H.f34254a;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class b extends a.b {
        public b(String[] strArr) {
            super(strArr);
        }

        @Override // androidx.room.a.b
        public boolean b() {
            return true;
        }

        @Override // androidx.room.a.b
        public void c(Set tables) {
            AbstractC4862t.e(tables, "tables");
            if (MultiInstanceInvalidationClient.this.f24567e.get()) {
                return;
            }
            try {
                IMultiInstanceInvalidationService iMultiInstanceInvalidationService = MultiInstanceInvalidationClient.this.f24569g;
                if (iMultiInstanceInvalidationService != null) {
                    iMultiInstanceInvalidationService.z3(MultiInstanceInvalidationClient.this.f24568f, (String[]) tables.toArray(new String[0]));
                }
            } catch (RemoteException e10) {
                Log.w("ROOM", "Cannot broadcast invalidation", e10);
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class c implements ServiceConnection {
        public c() {
        }

        @Override // android.content.ServiceConnection
        public void onServiceConnected(ComponentName name, IBinder service) {
            AbstractC4862t.e(name, "name");
            AbstractC4862t.e(service, "service");
            MultiInstanceInvalidationClient.this.f24569g = IMultiInstanceInvalidationService.Stub.asInterface(service);
            MultiInstanceInvalidationClient.this.j();
        }

        @Override // android.content.ServiceConnection
        public void onServiceDisconnected(ComponentName name) {
            AbstractC4862t.e(name, "name");
            MultiInstanceInvalidationClient.this.f24569g = null;
        }
    }

    public MultiInstanceInvalidationClient(Context context, String name, androidx.room.a invalidationTracker) {
        AbstractC4862t.e(context, "context");
        AbstractC4862t.e(name, "name");
        AbstractC4862t.e(invalidationTracker, "invalidationTracker");
        this.f24563a = name;
        this.f24564b = invalidationTracker;
        this.f24565c = context.getApplicationContext();
        this.f24566d = invalidationTracker.l().t();
        this.f24567e = new AtomicBoolean(true);
        this.f24570h = C.a(0, 0, Td.a.SUSPEND);
        this.f24571i = new b(invalidationTracker.m());
        this.f24572j = new IMultiInstanceInvalidationCallback.Stub() { // from class: androidx.room.MultiInstanceInvalidationClient$invalidationCallback$1

            /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
            public static final class a extends m implements p {

                /* JADX INFO: renamed from: j, reason: collision with root package name */
                public Object f24584j;

                /* JADX INFO: renamed from: k, reason: collision with root package name */
                public int f24585k;

                /* JADX INFO: renamed from: l, reason: collision with root package name */
                public final /* synthetic */ String[] f24586l;

                /* JADX INFO: renamed from: m, reason: collision with root package name */
                public final /* synthetic */ MultiInstanceInvalidationClient f24587m;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public a(String[] strArr, MultiInstanceInvalidationClient multiInstanceInvalidationClient, InterfaceC4988e interfaceC4988e) {
                    super(2, interfaceC4988e);
                    this.f24586l = strArr;
                    this.f24587m = multiInstanceInvalidationClient;
                }

                @Override // nc.AbstractC5157a
                public final InterfaceC4988e create(Object obj, InterfaceC4988e interfaceC4988e) {
                    return new a(this.f24586l, this.f24587m, interfaceC4988e);
                }

                @Override // vc.p
                public final Object invoke(M m10, InterfaceC4988e interfaceC4988e) {
                    return ((a) create(m10, interfaceC4988e)).invokeSuspend(C4015H.f34254a);
                }

                @Override // nc.AbstractC5157a
                public final Object invokeSuspend(Object obj) throws Throwable {
                    Set set;
                    Object objF = C5046c.f();
                    int i10 = this.f24585k;
                    if (i10 == 0) {
                        AbstractC4036s.b(obj);
                        String[] strArr = this.f24586l;
                        Set setH = U.h(Arrays.copyOf(strArr, strArr.length));
                        v vVar = this.f24587m.f24570h;
                        this.f24584j = setH;
                        this.f24585k = 1;
                        if (vVar.emit(setH, this) == objF) {
                            return objF;
                        }
                        set = setH;
                    } else {
                        if (i10 != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        set = (Set) this.f24584j;
                        AbstractC4036s.b(obj);
                    }
                    this.f24587m.i().q(set);
                    return C4015H.f34254a;
                }
            }

            @Override // androidx.room.IMultiInstanceInvalidationCallback
            public void V0(String[] tables) {
                AbstractC4862t.e(tables, "tables");
                AbstractC2132i.d(this.f24583a.f24566d, null, null, new a(tables, this.f24583a, null), 3, null);
            }
        };
        this.f24573k = new c();
    }

    public final InterfaceC2313e h(String[] resolvedTableNames) {
        AbstractC4862t.e(resolvedTableNames, "resolvedTableNames");
        return new a(this.f24570h, resolvedTableNames);
    }

    public final androidx.room.a i() {
        return this.f24564b;
    }

    public final void j() {
        try {
            IMultiInstanceInvalidationService iMultiInstanceInvalidationService = this.f24569g;
            if (iMultiInstanceInvalidationService != null) {
                this.f24568f = iMultiInstanceInvalidationService.A4(this.f24572j, this.f24563a);
            }
        } catch (RemoteException e10) {
            Log.w("ROOM", "Cannot register multi-instance invalidation callback", e10);
        }
    }

    public final void k(Intent serviceIntent) {
        AbstractC4862t.e(serviceIntent, "serviceIntent");
        if (this.f24567e.compareAndSet(true, false)) {
            this.f24565c.bindService(serviceIntent, this.f24573k, 1);
            this.f24564b.i(this.f24571i);
        }
    }

    public final void l() {
        if (this.f24567e.compareAndSet(false, true)) {
            this.f24564b.w(this.f24571i);
            try {
                IMultiInstanceInvalidationService iMultiInstanceInvalidationService = this.f24569g;
                if (iMultiInstanceInvalidationService != null) {
                    iMultiInstanceInvalidationService.z6(this.f24572j, this.f24568f);
                }
            } catch (RemoteException e10) {
                Log.w("ROOM", "Cannot unregister multi-instance invalidation callback", e10);
            }
            this.f24565c.unbindService(this.f24573k);
        }
    }
}
