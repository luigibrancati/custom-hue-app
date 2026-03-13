package d4;

import Od.C;
import Od.F;
import a4.InterfaceC2641a;
import android.webkit.MimeTypeMap;
import d4.InterfaceC3824g;
import j4.AbstractC4689h;
import kotlin.jvm.internal.AbstractC4854k;
import kotlin.jvm.internal.AbstractC4862t;
import lc.InterfaceC4988e;
import nc.AbstractC5160d;
import org.apache.tika.mime.MimeTypes;
import pe.C5468d;
import pe.D;
import pe.InterfaceC5469e;
import pe.v;
import pe.x;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public abstract class i implements InterfaceC3824g {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final a f33112b = new a(null);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final C5468d f33113c = new C5468d.a().k().l().a();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final C5468d f33114d = new C5468d.a().k().m().a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final InterfaceC5469e.a f33115a;

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class a {
        public /* synthetic */ a(AbstractC4854k abstractC4854k) {
            this();
        }

        public a() {
        }
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class b extends AbstractC5160d {

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public Object f33116j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public Object f33117k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public Object f33118l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public /* synthetic */ Object f33119m;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        public int f33121o;

        public b(InterfaceC4988e interfaceC4988e) {
            super(interfaceC4988e);
        }

        @Override // nc.AbstractC5157a
        public final Object invokeSuspend(Object obj) {
            this.f33119m = obj;
            this.f33121o |= Integer.MIN_VALUE;
            return i.d(i.this, null, null, null, null, this);
        }
    }

    public i(InterfaceC5469e.a callFactory) {
        AbstractC4862t.e(callFactory, "callFactory");
        this.f33115a = callFactory;
    }

    /* JADX WARN: Removed duplicated region for block: B:41:0x0101  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0116  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static /* synthetic */ java.lang.Object d(d4.i r3, a4.InterfaceC2641a r4, java.lang.Object r5, j4.AbstractC4689h r6, c4.i r7, lc.InterfaceC4988e r8) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 322
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: d4.i.d(d4.i, a4.a, java.lang.Object, j4.h, c4.i, lc.e):java.lang.Object");
    }

    @Override // d4.InterfaceC3824g
    public boolean a(Object obj) {
        return InterfaceC3824g.a.a(this, obj);
    }

    @Override // d4.InterfaceC3824g
    public Object c(InterfaceC2641a interfaceC2641a, Object obj, AbstractC4689h abstractC4689h, c4.i iVar, InterfaceC4988e interfaceC4988e) {
        return d(this, interfaceC2641a, obj, abstractC4689h, iVar, interfaceC4988e);
    }

    public final String e(v data, D body) {
        AbstractC4862t.e(data, "data");
        AbstractC4862t.e(body, "body");
        x xVarB = body.b();
        String string = xVarB == null ? null : xVarB.toString();
        if (string == null || C.P(string, MimeTypes.PLAIN_TEXT, false, 2, null)) {
            MimeTypeMap singleton = MimeTypeMap.getSingleton();
            AbstractC4862t.d(singleton, "getSingleton()");
            String strE = n4.e.e(singleton, data.toString());
            if (strE != null) {
                return strE;
            }
        }
        if (string == null) {
            return null;
        }
        return F.X0(string, ';', null, 2, null);
    }

    public abstract v f(Object obj);
}
