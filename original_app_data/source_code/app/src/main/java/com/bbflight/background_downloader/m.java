package com.bbflight.background_downloader;

import Od.C1823c;
import Q4.Task;
import Rd.M;
import android.content.Context;
import android.content.SharedPreferences;
import com.bbflight.background_downloader.b;
import fc.AbstractC4036s;
import fc.C4015H;
import ge.w0;
import he.AbstractC4304b;
import java.util.Map;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import kotlin.jvm.internal.AbstractC4862t;
import kotlin.jvm.internal.L;
import lc.InterfaceC4988e;
import mc.C5046c;
import nc.AbstractC5160d;
import vc.p;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public abstract class m {

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class a extends AbstractC5160d {

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public Object f27421j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public Object f27422k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public Object f27423l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public Object f27424m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public Object f27425n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        public /* synthetic */ Object f27426o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        public int f27427p;

        public a(InterfaceC4988e interfaceC4988e) {
            super(interfaceC4988e);
        }

        @Override // nc.AbstractC5157a
        public final Object invokeSuspend(Object obj) {
            this.f27426o = obj;
            this.f27427p |= Integer.MIN_VALUE;
            return m.a(null, null, this);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class b extends nc.m implements p {

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public int f27428j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public final /* synthetic */ Context f27429k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public final /* synthetic */ Task f27430l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(Context context, Task task, InterfaceC4988e interfaceC4988e) {
            super(2, interfaceC4988e);
            this.f27429k = context;
            this.f27430l = task;
        }

        @Override // nc.AbstractC5157a
        public final InterfaceC4988e create(Object obj, InterfaceC4988e interfaceC4988e) {
            return new b(this.f27429k, this.f27430l, interfaceC4988e);
        }

        @Override // vc.p
        public final Object invoke(M m10, InterfaceC4988e interfaceC4988e) {
            return ((b) create(m10, interfaceC4988e)).invokeSuspend(C4015H.f34254a);
        }

        @Override // nc.AbstractC5157a
        public final Object invokeSuspend(Object obj) throws Throwable {
            Object objF = C5046c.f();
            int i10 = this.f27428j;
            if (i10 != 0) {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC4036s.b(obj);
                return obj;
            }
            AbstractC4036s.b(obj);
            b.a aVar = com.bbflight.background_downloader.b.f26973a;
            Context context = this.f27429k;
            Task task = this.f27430l;
            this.f27428j = 1;
            Object objK = aVar.k(context, task, this);
            return objK == objF ? objF : objK;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class c extends nc.m implements p {

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public int f27431j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public final /* synthetic */ Context f27432k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public final /* synthetic */ L f27433l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(Context context, L l10, InterfaceC4988e interfaceC4988e) {
            super(2, interfaceC4988e);
            this.f27432k = context;
            this.f27433l = l10;
        }

        @Override // nc.AbstractC5157a
        public final InterfaceC4988e create(Object obj, InterfaceC4988e interfaceC4988e) {
            return new c(this.f27432k, this.f27433l, interfaceC4988e);
        }

        @Override // vc.p
        public final Object invoke(M m10, InterfaceC4988e interfaceC4988e) {
            return ((c) create(m10, interfaceC4988e)).invokeSuspend(C4015H.f34254a);
        }

        @Override // nc.AbstractC5157a
        public final Object invokeSuspend(Object obj) throws Throwable {
            Object objF = C5046c.f();
            int i10 = this.f27431j;
            if (i10 != 0) {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC4036s.b(obj);
                return obj;
            }
            AbstractC4036s.b(obj);
            b.a aVar = com.bbflight.background_downloader.b.f26973a;
            Context context = this.f27432k;
            Task task = (Task) this.f27433l.f39776a;
            this.f27431j = 1;
            Object objM = aVar.m(context, task, this);
            return objM == objF ? objF : objM;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x00bc  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x013b  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x017b  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0180 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0019  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object a(android.content.Context r41, Q4.Task r42, lc.InterfaceC4988e r43) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 388
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bbflight.background_downloader.m.a(android.content.Context, Q4.X, lc.e):java.lang.Object");
    }

    public static final Map b(SharedPreferences prefs) {
        String str = "{}";
        AbstractC4862t.e(prefs, "prefs");
        ReentrantReadWriteLock.ReadLock lock = com.bbflight.background_downloader.a.INSTANCE.v().readLock();
        lock.lock();
        try {
            String string = prefs.getString("com.bbflight.background_downloader.taskMap.v2", "{}");
            if (string != null) {
                str = string;
            }
            AbstractC4304b.a aVar = AbstractC4304b.f36582d;
            aVar.d();
            return (Map) aVar.a(new ge.M(w0.f35762a, Task.INSTANCE.serializer()), str);
        } finally {
            lock.unlock();
        }
    }

    public static final int c(String string) {
        AbstractC4862t.e(string, "string");
        byte[] bytes = string.getBytes(C1823c.f12394b);
        AbstractC4862t.d(bytes, "getBytes(...)");
        return bytes.length;
    }
}
