package dd;

import Lc.b0;
import Od.F;
import com.fasterxml.jackson.core.JsonPointer;
import id.AbstractC4376a;
import io.sentry.protocol.SentryThread;
import kotlin.jvm.internal.AbstractC4862t;
import md.i;
import td.C5881d;

/* JADX INFO: renamed from: dd.l, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public final class C3907l implements Ad.f {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final C5881d f33433b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final C5881d f33434c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final yd.t f33435d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final boolean f33436e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Ad.e f33437f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final InterfaceC3913r f33438g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final String f33439h;

    public C3907l(C5881d className, C5881d c5881d, fd.l packageProto, hd.c nameResolver, yd.t tVar, boolean z10, Ad.e abiStability, InterfaceC3913r interfaceC3913r) {
        String string;
        AbstractC4862t.e(className, "className");
        AbstractC4862t.e(packageProto, "packageProto");
        AbstractC4862t.e(nameResolver, "nameResolver");
        AbstractC4862t.e(abiStability, "abiStability");
        this.f33433b = className;
        this.f33434c = c5881d;
        this.f33435d = tVar;
        this.f33436e = z10;
        this.f33437f = abiStability;
        this.f33438g = interfaceC3913r;
        i.f packageModuleName = AbstractC4376a.f37390m;
        AbstractC4862t.d(packageModuleName, "packageModuleName");
        Integer num = (Integer) hd.e.a(packageProto, packageModuleName);
        this.f33439h = (num == null || (string = nameResolver.getString(num.intValue())) == null) ? SentryThread.JsonKeys.MAIN : string;
    }

    @Override // Ad.f
    public String a() {
        return "Class '" + d().b().b() + '\'';
    }

    @Override // Lc.a0
    public b0 b() {
        b0 NO_SOURCE_FILE = b0.f8747a;
        AbstractC4862t.d(NO_SOURCE_FILE, "NO_SOURCE_FILE");
        return NO_SOURCE_FILE;
    }

    public final kd.b d() {
        return new kd.b(e().g(), h());
    }

    public C5881d e() {
        return this.f33433b;
    }

    public C5881d f() {
        return this.f33434c;
    }

    public final InterfaceC3913r g() {
        return this.f33438g;
    }

    public final kd.f h() {
        String strF = e().f();
        AbstractC4862t.d(strF, "className.internalName");
        kd.f fVarS = kd.f.s(F.U0(strF, JsonPointer.SEPARATOR, null, 2, null));
        AbstractC4862t.d(fVarS, "identifier(className.int….substringAfterLast('/'))");
        return fVarS;
    }

    public String toString() {
        return C3907l.class.getSimpleName() + ": " + e();
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public C3907l(InterfaceC3913r kotlinClass, fd.l packageProto, hd.c nameResolver, yd.t tVar, boolean z10, Ad.e abiStability) {
        AbstractC4862t.e(kotlinClass, "kotlinClass");
        AbstractC4862t.e(packageProto, "packageProto");
        AbstractC4862t.e(nameResolver, "nameResolver");
        AbstractC4862t.e(abiStability, "abiStability");
        C5881d c5881dB = C5881d.b(kotlinClass.c());
        AbstractC4862t.d(c5881dB, "byClassId(kotlinClass.classId)");
        String strE = kotlinClass.e().e();
        C5881d c5881dD = null;
        if (strE != null && strE.length() > 0) {
            c5881dD = C5881d.d(strE);
        }
        this(c5881dB, c5881dD, packageProto, nameResolver, tVar, z10, abiStability, kotlinClass);
    }
}
