package Q4;

import android.net.Uri;
import ce.InterfaceC3118a;
import de.AbstractC3918a;
import fc.C4029l;
import fc.EnumC4031n;
import fc.InterfaceC4028k;
import fe.InterfaceC4047c;
import fe.InterfaceC4048d;
import fe.InterfaceC4049e;
import fe.InterfaceC4050f;
import gc.C4207u;
import ge.C4240i0;
import ge.InterfaceC4215D;
import ge.w0;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC4854k;
import kotlin.jvm.internal.AbstractC4862t;
import vc.InterfaceC6082a;

/* JADX INFO: renamed from: Q4.e, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010$\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\b\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0015\b\u0007\u0018\u0000 :2\u00020\u0001:\u0002.0B\u009b\u0001\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0014\b\u0002\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u0004\u0012\u0014\b\u0002\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u0004\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0002\u0012\u0014\b\u0002\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u0004\u0012\u0014\b\u0002\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u0004\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\u000e\u0010\u000fB¥\u0001\b\u0010\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0014\u0010\u0005\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0004\u0012\u0014\u0010\u0006\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0004\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0002\u0012\u0014\u0010\n\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0004\u0012\u0014\u0010\u000b\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0004\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012¢\u0006\u0004\b\u000e\u0010\u0014J'\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u0015\u001a\u00020\u00002\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0019\u001a\u00020\u0018H\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u0019\u0010\u001d\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u0004¢\u0006\u0004\b\u001d\u0010\u001eJ\u0019\u0010\u001f\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u0004¢\u0006\u0004\b\u001f\u0010\u001eJ+\u0010#\u001a\u00020\"2\u0006\u0010 \u001a\u00020\u00022\u0014\b\u0002\u0010!\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u0004¢\u0006\u0004\b#\u0010$J\u0017\u0010'\u001a\u00020&2\b\b\u0002\u0010%\u001a\u00020\u0007¢\u0006\u0004\b'\u0010(J\r\u0010)\u001a\u00020&¢\u0006\u0004\b)\u0010*J/\u0010,\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u00042\u0012\u0010+\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u0004H\u0002¢\u0006\u0004\b,\u0010-R\u0018\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b.\u0010/R\"\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b0\u00101R\"\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b2\u00101R\u0018\u0010\b\u001a\u0004\u0018\u00010\u00078\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b3\u00104R\u0018\u0010\t\u001a\u0004\u0018\u00010\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b5\u0010/R\"\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b6\u00101R\"\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b7\u00101R\u0018\u0010\f\u001a\u0004\u0018\u00010\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b8\u0010/R\u0018\u0010\r\u001a\u0004\u0018\u00010\u00078\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b9\u00104¨\u0006;"}, d2 = {"LQ4/e;", "", "", "accessToken", "", "accessHeaders", "accessQueryParams", "", "accessTokenExpiryTime", "refreshToken", "refreshHeaders", "refreshQueryParams", "refreshUrl", "onAuthRawHandle", "<init>", "(Ljava/lang/String;Ljava/util/Map;Ljava/util/Map;Ljava/lang/Long;Ljava/lang/String;Ljava/util/Map;Ljava/util/Map;Ljava/lang/String;Ljava/lang/Long;)V", "", "seen0", "Lge/s0;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/util/Map;Ljava/util/Map;Ljava/lang/Long;Ljava/lang/String;Ljava/util/Map;Ljava/util/Map;Ljava/lang/String;Ljava/lang/Long;Lge/s0;)V", "self", "Lfe/d;", "output", "Lee/e;", "serialDesc", "Lfc/H;", "q", "(LQ4/e;Lfe/d;Lee/e;)V", "l", "()Ljava/util/Map;", "m", "url", "queryParams", "Landroid/net/Uri;", "j", "(Ljava/lang/String;Ljava/util/Map;)Landroid/net/Uri;", "bufferTime", "", "o", "(J)Z", "n", "()Z", "mapToExpand", "k", "(Ljava/util/Map;)Ljava/util/Map;", "a", "Ljava/lang/String;", "b", "Ljava/util/Map;", "c", "d", "Ljava/lang/Long;", "e", "f", "g", "h", "i", "Companion", "background_downloader_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class C1885e {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final InterfaceC4028k[] f13842j;

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    public String accessToken;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    public Map accessHeaders;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    public Map accessQueryParams;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    public Long accessTokenExpiryTime;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    public String refreshToken;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    public Map refreshHeaders;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    public Map refreshQueryParams;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    public String refreshUrl;

    /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata */
    public Long onAuthRawHandle;

    /* JADX INFO: renamed from: Q4.e$a */
    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final /* synthetic */ class a implements InterfaceC4215D {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f13852a;
        private static final ee.e descriptor;

        static {
            a aVar = new a();
            f13852a = aVar;
            C4240i0 c4240i0 = new C4240i0("com.bbflight.background_downloader.Auth", aVar, 9);
            c4240i0.o("accessToken", true);
            c4240i0.o("accessHeaders", true);
            c4240i0.o("accessQueryParams", true);
            c4240i0.o("accessTokenExpiryTime", true);
            c4240i0.o("refreshToken", true);
            c4240i0.o("refreshHeaders", true);
            c4240i0.o("refreshQueryParams", true);
            c4240i0.o("refreshUrl", true);
            c4240i0.o("onAuthRawHandle", true);
            descriptor = c4240i0;
        }

        @Override // ge.InterfaceC4215D
        public ce.b[] a() {
            return super.a();
        }

        @Override // ce.InterfaceC3118a
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public final C1885e deserialize(InterfaceC4049e decoder) {
            int i10;
            Map map;
            String str;
            Long l10;
            Map map2;
            String str2;
            Long l11;
            String str3;
            Map map3;
            Map map4;
            AbstractC4862t.e(decoder, "decoder");
            ee.e eVar = descriptor;
            InterfaceC4047c interfaceC4047cA = decoder.a(eVar);
            InterfaceC4028k[] interfaceC4028kArr = C1885e.f13842j;
            int i11 = 7;
            int i12 = 6;
            String str4 = null;
            if (interfaceC4047cA.q()) {
                w0 w0Var = w0.f35762a;
                String str5 = (String) interfaceC4047cA.A(eVar, 0, w0Var, null);
                Map map5 = (Map) interfaceC4047cA.H(eVar, 1, (InterfaceC3118a) interfaceC4028kArr[1].getValue(), null);
                Map map6 = (Map) interfaceC4047cA.H(eVar, 2, (InterfaceC3118a) interfaceC4028kArr[2].getValue(), null);
                ge.Q q10 = ge.Q.f35675a;
                Long l12 = (Long) interfaceC4047cA.A(eVar, 3, q10, null);
                String str6 = (String) interfaceC4047cA.A(eVar, 4, w0Var, null);
                Map map7 = (Map) interfaceC4047cA.H(eVar, 5, (InterfaceC3118a) interfaceC4028kArr[5].getValue(), null);
                map = (Map) interfaceC4047cA.H(eVar, 6, (InterfaceC3118a) interfaceC4028kArr[6].getValue(), null);
                str = (String) interfaceC4047cA.A(eVar, 7, w0Var, null);
                l10 = (Long) interfaceC4047cA.A(eVar, 8, q10, null);
                l11 = l12;
                i10 = 511;
                str2 = str6;
                map2 = map7;
                map4 = map6;
                map3 = map5;
                str3 = str5;
            } else {
                int i13 = 5;
                int i14 = 2;
                int i15 = 1;
                boolean z10 = true;
                int i16 = 0;
                Map map8 = null;
                String str7 = null;
                Long l13 = null;
                Map map9 = null;
                String str8 = null;
                Long l14 = null;
                Map map10 = null;
                Map map11 = null;
                while (z10) {
                    int i17 = i12;
                    int iJ = interfaceC4047cA.j(eVar);
                    switch (iJ) {
                        case -1:
                            z10 = false;
                            i15 = 1;
                            i11 = 7;
                            i12 = 6;
                            i14 = 2;
                            i13 = 5;
                            break;
                        case 0:
                            str4 = (String) interfaceC4047cA.A(eVar, 0, w0.f35762a, str4);
                            i16 |= 1;
                            i15 = 1;
                            i11 = 7;
                            i12 = 6;
                            i14 = 2;
                            i13 = 5;
                            break;
                        case 1:
                            map10 = (Map) interfaceC4047cA.H(eVar, i15, (InterfaceC3118a) interfaceC4028kArr[i15].getValue(), map10);
                            i16 |= 2;
                            i11 = 7;
                            i12 = 6;
                            i14 = 2;
                            i13 = 5;
                            break;
                        case 2:
                            map11 = (Map) interfaceC4047cA.H(eVar, i14, (InterfaceC3118a) interfaceC4028kArr[i14].getValue(), map11);
                            i16 |= 4;
                            i11 = 7;
                            i12 = 6;
                            i13 = 5;
                            break;
                        case 3:
                            l14 = (Long) interfaceC4047cA.A(eVar, 3, ge.Q.f35675a, l14);
                            i16 |= 8;
                            i11 = 7;
                            i12 = 6;
                            i13 = 5;
                            break;
                        case 4:
                            str8 = (String) interfaceC4047cA.A(eVar, 4, w0.f35762a, str8);
                            i16 |= 16;
                            i11 = 7;
                            i12 = 6;
                            i13 = 5;
                            break;
                        case 5:
                            map9 = (Map) interfaceC4047cA.H(eVar, i13, (InterfaceC3118a) interfaceC4028kArr[i13].getValue(), map9);
                            i16 |= 32;
                            i11 = 7;
                            i12 = 6;
                            break;
                        case 6:
                            map8 = (Map) interfaceC4047cA.H(eVar, i17, (InterfaceC3118a) interfaceC4028kArr[i17].getValue(), map8);
                            i16 |= 64;
                            i12 = i17;
                            i11 = 7;
                            break;
                        case 7:
                            str7 = (String) interfaceC4047cA.A(eVar, i11, w0.f35762a, str7);
                            i16 |= 128;
                            i12 = i17;
                            break;
                        case 8:
                            l13 = (Long) interfaceC4047cA.A(eVar, 8, ge.Q.f35675a, l13);
                            i16 |= 256;
                            i12 = i17;
                            break;
                        default:
                            throw new ce.h(iJ);
                    }
                }
                i10 = i16;
                map = map8;
                str = str7;
                l10 = l13;
                map2 = map9;
                str2 = str8;
                l11 = l14;
                str3 = str4;
                map3 = map10;
                map4 = map11;
            }
            interfaceC4047cA.c(eVar);
            return new C1885e(i10, str3, map3, map4, l11, str2, map2, map, str, l10, (ge.s0) null);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // ge.InterfaceC4215D
        public final ce.b[] childSerializers() {
            InterfaceC4028k[] interfaceC4028kArr = C1885e.f13842j;
            w0 w0Var = w0.f35762a;
            ge.Q q10 = ge.Q.f35675a;
            return new ce.b[]{AbstractC3918a.p(w0Var), interfaceC4028kArr[1].getValue(), interfaceC4028kArr[2].getValue(), AbstractC3918a.p(q10), AbstractC3918a.p(w0Var), interfaceC4028kArr[5].getValue(), interfaceC4028kArr[6].getValue(), AbstractC3918a.p(w0Var), AbstractC3918a.p(q10)};
        }

        @Override // ce.g
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public final void serialize(InterfaceC4050f encoder, C1885e value) {
            AbstractC4862t.e(encoder, "encoder");
            AbstractC4862t.e(value, "value");
            ee.e eVar = descriptor;
            InterfaceC4048d interfaceC4048dA = encoder.a(eVar);
            C1885e.q(value, interfaceC4048dA, eVar);
            interfaceC4048dA.c(eVar);
        }

        @Override // ce.b, ce.g, ce.InterfaceC3118a
        public final ee.e getDescriptor() {
            return descriptor;
        }
    }

    /* JADX INFO: renamed from: Q4.e$b, reason: from kotlin metadata */
    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class Companion {
        public Companion() {
        }

        public final ce.b serializer() {
            return a.f13852a;
        }

        public /* synthetic */ Companion(AbstractC4854k abstractC4854k) {
            this();
        }
    }

    static {
        EnumC4031n enumC4031n = EnumC4031n.PUBLICATION;
        f13842j = new InterfaceC4028k[]{null, C4029l.a(enumC4031n, new InterfaceC6082a() { // from class: Q4.a
            @Override // vc.InterfaceC6082a
            public final Object invoke() {
                return C1885e.e();
            }
        }), C4029l.a(enumC4031n, new InterfaceC6082a() { // from class: Q4.b
            @Override // vc.InterfaceC6082a
            public final Object invoke() {
                return C1885e.f();
            }
        }), null, null, C4029l.a(enumC4031n, new InterfaceC6082a() { // from class: Q4.c
            @Override // vc.InterfaceC6082a
            public final Object invoke() {
                return C1885e.g();
            }
        }), C4029l.a(enumC4031n, new InterfaceC6082a() { // from class: Q4.d
            @Override // vc.InterfaceC6082a
            public final Object invoke() {
                return C1885e.h();
            }
        }), null, null};
    }

    public C1885e() {
        this((String) null, (Map) null, (Map) null, (Long) null, (String) null, (Map) null, (Map) null, (String) null, (Long) null, 511, (AbstractC4854k) null);
    }

    public static final /* synthetic */ ce.b e() {
        w0 w0Var = w0.f35762a;
        return new ge.M(w0Var, w0Var);
    }

    public static final /* synthetic */ ce.b f() {
        w0 w0Var = w0.f35762a;
        return new ge.M(w0Var, w0Var);
    }

    public static final /* synthetic */ ce.b g() {
        w0 w0Var = w0.f35762a;
        return new ge.M(w0Var, w0Var);
    }

    public static final /* synthetic */ ce.b h() {
        w0 w0Var = w0.f35762a;
        return new ge.M(w0Var, w0Var);
    }

    public static /* synthetic */ boolean p(C1885e c1885e, long j10, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            j10 = 10000;
        }
        return c1885e.o(j10);
    }

    public static final /* synthetic */ void q(C1885e self, InterfaceC4048d output, ee.e serialDesc) {
        InterfaceC4028k[] interfaceC4028kArr = f13842j;
        if (output.i(serialDesc, 0) || self.accessToken != null) {
            output.l(serialDesc, 0, w0.f35762a, self.accessToken);
        }
        if (output.i(serialDesc, 1) || !AbstractC4862t.a(self.accessHeaders, gc.Q.i())) {
            output.E(serialDesc, 1, (ce.g) interfaceC4028kArr[1].getValue(), self.accessHeaders);
        }
        if (output.i(serialDesc, 2) || !AbstractC4862t.a(self.accessQueryParams, gc.Q.i())) {
            output.E(serialDesc, 2, (ce.g) interfaceC4028kArr[2].getValue(), self.accessQueryParams);
        }
        if (output.i(serialDesc, 3) || self.accessTokenExpiryTime != null) {
            output.l(serialDesc, 3, ge.Q.f35675a, self.accessTokenExpiryTime);
        }
        if (output.i(serialDesc, 4) || self.refreshToken != null) {
            output.l(serialDesc, 4, w0.f35762a, self.refreshToken);
        }
        if (output.i(serialDesc, 5) || !AbstractC4862t.a(self.refreshHeaders, gc.Q.i())) {
            output.E(serialDesc, 5, (ce.g) interfaceC4028kArr[5].getValue(), self.refreshHeaders);
        }
        if (output.i(serialDesc, 6) || !AbstractC4862t.a(self.refreshQueryParams, gc.Q.i())) {
            output.E(serialDesc, 6, (ce.g) interfaceC4028kArr[6].getValue(), self.refreshQueryParams);
        }
        if (output.i(serialDesc, 7) || self.refreshUrl != null) {
            output.l(serialDesc, 7, w0.f35762a, self.refreshUrl);
        }
        if (!output.i(serialDesc, 8) && self.onAuthRawHandle == null) {
            return;
        }
        output.l(serialDesc, 8, ge.Q.f35675a, self.onAuthRawHandle);
    }

    public final Uri j(String url, Map queryParams) {
        AbstractC4862t.e(url, "url");
        AbstractC4862t.e(queryParams, "queryParams");
        Uri uri = Uri.parse(url);
        if (queryParams.isEmpty()) {
            AbstractC4862t.b(uri);
            return uri;
        }
        Set<String> queryParameterNames = uri.getQueryParameterNames();
        AbstractC4862t.d(queryParameterNames, "getQueryParameterNames(...)");
        LinkedHashMap linkedHashMap = new LinkedHashMap(Bc.k.e(gc.P.e(C4207u.v(queryParameterNames, 10)), 16));
        for (Object obj : queryParameterNames) {
            linkedHashMap.put(obj, uri.getQueryParameter((String) obj));
        }
        Map mapW = gc.Q.w(linkedHashMap);
        mapW.putAll(queryParams);
        Uri.Builder builderClearQuery = uri.buildUpon().clearQuery();
        for (Map.Entry entry : mapW.entrySet()) {
            builderClearQuery.appendQueryParameter((String) entry.getKey(), (String) entry.getValue());
        }
        Uri uriBuild = builderClearQuery.build();
        AbstractC4862t.d(uriBuild, "build(...)");
        return uriBuild;
    }

    public final Map k(Map mapToExpand) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry entry : mapToExpand.entrySet()) {
            String str = (String) entry.getKey();
            String strL = (String) entry.getValue();
            String str2 = this.accessToken;
            if (str2 != null) {
                AbstractC4862t.b(str2);
                strL = Od.C.L(strL, "{accessToken}", str2, false, 4, null);
            }
            String strL2 = strL;
            String str3 = this.refreshToken;
            if (str3 != null) {
                AbstractC4862t.b(str3);
                strL2 = Od.C.L(strL2, "{refreshToken}", str3, false, 4, null);
            }
            linkedHashMap.put(str, strL2);
        }
        return linkedHashMap;
    }

    public final Map l() {
        return k(this.accessHeaders);
    }

    public final Map m() {
        return k(this.accessQueryParams);
    }

    public final boolean n() {
        return this.onAuthRawHandle != null;
    }

    public final boolean o(long bufferTime) {
        Long l10 = this.accessTokenExpiryTime;
        if (l10 != null) {
            if (System.currentTimeMillis() + bufferTime > l10.longValue()) {
                return true;
            }
        }
        return false;
    }

    public /* synthetic */ C1885e(int i10, String str, Map map, Map map2, Long l10, String str2, Map map3, Map map4, String str3, Long l11, ge.s0 s0Var) {
        if ((i10 & 1) == 0) {
            this.accessToken = null;
        } else {
            this.accessToken = str;
        }
        if ((i10 & 2) == 0) {
            this.accessHeaders = gc.Q.i();
        } else {
            this.accessHeaders = map;
        }
        if ((i10 & 4) == 0) {
            this.accessQueryParams = gc.Q.i();
        } else {
            this.accessQueryParams = map2;
        }
        if ((i10 & 8) == 0) {
            this.accessTokenExpiryTime = null;
        } else {
            this.accessTokenExpiryTime = l10;
        }
        if ((i10 & 16) == 0) {
            this.refreshToken = null;
        } else {
            this.refreshToken = str2;
        }
        if ((i10 & 32) == 0) {
            this.refreshHeaders = gc.Q.i();
        } else {
            this.refreshHeaders = map3;
        }
        if ((i10 & 64) == 0) {
            this.refreshQueryParams = gc.Q.i();
        } else {
            this.refreshQueryParams = map4;
        }
        if ((i10 & 128) == 0) {
            this.refreshUrl = null;
        } else {
            this.refreshUrl = str3;
        }
        if ((i10 & 256) == 0) {
            this.onAuthRawHandle = null;
        } else {
            this.onAuthRawHandle = l11;
        }
    }

    public C1885e(String str, Map accessHeaders, Map accessQueryParams, Long l10, String str2, Map refreshHeaders, Map refreshQueryParams, String str3, Long l11) {
        AbstractC4862t.e(accessHeaders, "accessHeaders");
        AbstractC4862t.e(accessQueryParams, "accessQueryParams");
        AbstractC4862t.e(refreshHeaders, "refreshHeaders");
        AbstractC4862t.e(refreshQueryParams, "refreshQueryParams");
        this.accessToken = str;
        this.accessHeaders = accessHeaders;
        this.accessQueryParams = accessQueryParams;
        this.accessTokenExpiryTime = l10;
        this.refreshToken = str2;
        this.refreshHeaders = refreshHeaders;
        this.refreshQueryParams = refreshQueryParams;
        this.refreshUrl = str3;
        this.onAuthRawHandle = l11;
    }

    public /* synthetic */ C1885e(String str, Map map, Map map2, Long l10, String str2, Map map3, Map map4, String str3, Long l11, int i10, AbstractC4854k abstractC4854k) {
        this((i10 & 1) != 0 ? null : str, (i10 & 2) != 0 ? gc.Q.i() : map, (i10 & 4) != 0 ? gc.Q.i() : map2, (i10 & 8) != 0 ? null : l10, (i10 & 16) != 0 ? null : str2, (i10 & 32) != 0 ? gc.Q.i() : map3, (i10 & 64) != 0 ? gc.Q.i() : map4, (i10 & 128) != 0 ? null : str3, (i10 & 256) != 0 ? null : l11);
    }
}
