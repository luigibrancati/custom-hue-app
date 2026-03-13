package k1;

import androidx.datastore.preferences.protobuf.AbstractC2700f;
import androidx.datastore.preferences.protobuf.AbstractC2713t;
import fc.C4015H;
import fc.C4032o;
import g1.C4094d;
import g1.InterfaceC4087W;
import gc.C4179C;
import j1.C4674f;
import j1.C4676h;
import j1.i;
import j1.j;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.List;
import java.util.Map;
import java.util.Set;
import k1.AbstractC4785h;
import kotlin.jvm.internal.AbstractC4862t;
import lc.InterfaceC4988e;

/* JADX INFO: renamed from: k1.j, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public final class C4787j implements InterfaceC4087W {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final C4787j f39199a = new C4787j();

    /* JADX INFO: renamed from: k1.j$a */
    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f39200a;

        static {
            int[] iArr = new int[j.b.values().length];
            try {
                iArr[j.b.BOOLEAN.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[j.b.FLOAT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[j.b.DOUBLE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[j.b.INTEGER.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[j.b.LONG.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[j.b.STRING.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[j.b.STRING_SET.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[j.b.BYTES.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr[j.b.VALUE_NOT_SET.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            f39200a = iArr;
        }
    }

    @Override // g1.InterfaceC4087W
    public Object a(InputStream inputStream, InterfaceC4988e interfaceC4988e) throws C4094d {
        C4676h c4676hA = C4674f.f38932a.a(inputStream);
        C4781d c4781dB = AbstractC4786i.b(new AbstractC4785h.b[0]);
        Map mapN = c4676hA.N();
        AbstractC4862t.d(mapN, "getPreferencesMap(...)");
        for (Map.Entry entry : mapN.entrySet()) {
            String str = (String) entry.getKey();
            j1.j jVar = (j1.j) entry.getValue();
            C4787j c4787j = f39199a;
            AbstractC4862t.b(str);
            AbstractC4862t.b(jVar);
            c4787j.d(str, jVar, c4781dB);
        }
        return c4781dB.e();
    }

    public final void d(String str, j1.j jVar, C4781d c4781d) throws C4094d {
        j.b bVarC0 = jVar.c0();
        switch (bVarC0 == null ? -1 : a.f39200a[bVarC0.ordinal()]) {
            case -1:
                throw new C4094d("Value case is null.", null, 2, null);
            case 0:
            default:
                throw new C4032o();
            case 1:
                c4781d.l(AbstractC4788k.a(str), Boolean.valueOf(jVar.T()));
                return;
            case 2:
                c4781d.l(AbstractC4788k.d(str), Float.valueOf(jVar.X()));
                return;
            case 3:
                c4781d.l(AbstractC4788k.c(str), Double.valueOf(jVar.W()));
                return;
            case 4:
                c4781d.l(AbstractC4788k.e(str), Integer.valueOf(jVar.Y()));
                return;
            case 5:
                c4781d.l(AbstractC4788k.f(str), Long.valueOf(jVar.Z()));
                return;
            case 6:
                c4781d.l(AbstractC4788k.g(str), jVar.a0());
                return;
            case 7:
                AbstractC4785h.a aVarH = AbstractC4788k.h(str);
                List listP = jVar.b0().P();
                AbstractC4862t.d(listP, "getStringsList(...)");
                c4781d.l(aVarH, C4179C.Z0(listP));
                return;
            case 8:
                c4781d.l(AbstractC4788k.b(str), jVar.U().y());
                return;
            case 9:
                throw new C4094d("Value not set.", null, 2, null);
        }
    }

    @Override // g1.InterfaceC4087W
    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
    public AbstractC4785h b() {
        return AbstractC4786i.a();
    }

    public final j1.j f(Object obj) {
        if (obj instanceof Boolean) {
            AbstractC2713t abstractC2713tM = j1.j.d0().u(((Boolean) obj).booleanValue()).m();
            AbstractC4862t.d(abstractC2713tM, "build(...)");
            return (j1.j) abstractC2713tM;
        }
        if (obj instanceof Float) {
            AbstractC2713t abstractC2713tM2 = j1.j.d0().x(((Number) obj).floatValue()).m();
            AbstractC4862t.d(abstractC2713tM2, "build(...)");
            return (j1.j) abstractC2713tM2;
        }
        if (obj instanceof Double) {
            AbstractC2713t abstractC2713tM3 = j1.j.d0().w(((Number) obj).doubleValue()).m();
            AbstractC4862t.d(abstractC2713tM3, "build(...)");
            return (j1.j) abstractC2713tM3;
        }
        if (obj instanceof Integer) {
            AbstractC2713t abstractC2713tM4 = j1.j.d0().y(((Number) obj).intValue()).m();
            AbstractC4862t.d(abstractC2713tM4, "build(...)");
            return (j1.j) abstractC2713tM4;
        }
        if (obj instanceof Long) {
            AbstractC2713t abstractC2713tM5 = j1.j.d0().z(((Number) obj).longValue()).m();
            AbstractC4862t.d(abstractC2713tM5, "build(...)");
            return (j1.j) abstractC2713tM5;
        }
        if (obj instanceof String) {
            AbstractC2713t abstractC2713tM6 = j1.j.d0().A((String) obj).m();
            AbstractC4862t.d(abstractC2713tM6, "build(...)");
            return (j1.j) abstractC2713tM6;
        }
        if (obj instanceof Set) {
            j.a aVarD0 = j1.j.d0();
            i.a aVarQ = j1.i.Q();
            AbstractC4862t.c(obj, "null cannot be cast to non-null type kotlin.collections.Set<kotlin.String>");
            AbstractC2713t abstractC2713tM7 = aVarD0.B(aVarQ.u((Set) obj)).m();
            AbstractC4862t.d(abstractC2713tM7, "build(...)");
            return (j1.j) abstractC2713tM7;
        }
        if (obj instanceof byte[]) {
            AbstractC2713t abstractC2713tM8 = j1.j.d0().v(AbstractC2700f.h((byte[]) obj)).m();
            AbstractC4862t.d(abstractC2713tM8, "build(...)");
            return (j1.j) abstractC2713tM8;
        }
        throw new IllegalStateException("PreferencesSerializer does not support type: " + obj.getClass().getName());
    }

    @Override // g1.InterfaceC4087W
    /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
    public Object c(AbstractC4785h abstractC4785h, OutputStream outputStream, InterfaceC4988e interfaceC4988e) {
        Map mapA = abstractC4785h.a();
        C4676h.a aVarQ = C4676h.Q();
        for (Map.Entry entry : mapA.entrySet()) {
            aVarQ.u(((AbstractC4785h.a) entry.getKey()).a(), f(entry.getValue()));
        }
        ((C4676h) aVarQ.m()).h(outputStream);
        return C4015H.f34254a;
    }
}
