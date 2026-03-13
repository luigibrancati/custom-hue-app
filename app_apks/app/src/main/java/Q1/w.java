package Q1;

import D1.o;
import F2.s;
import G1.AbstractC0853a;
import G1.C;
import G1.H;
import android.text.TextUtils;
import com.google.android.libraries.barhopper.RecognitionOptions;
import i2.I;
import i2.InterfaceC4336p;
import i2.InterfaceC4337q;
import i2.J;
import i2.O;
import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public final class w implements InterfaceC4336p {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final Pattern f13518i = Pattern.compile("LOCAL:([^,]+)");

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final Pattern f13519j = Pattern.compile("MPEGTS:(-?\\d+)");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f13520a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final H f13521b;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final s.a f13523d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final boolean f13524e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public i2.r f13525f;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f13527h;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final C f13522c = new C();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public byte[] f13526g = new byte[RecognitionOptions.UPC_E];

    public w(String str, H h10, s.a aVar, boolean z10) {
        this.f13520a = str;
        this.f13521b = h10;
        this.f13523d = aVar;
        this.f13524e = z10;
    }

    @Override // i2.InterfaceC4336p
    public void a(long j10, long j11) {
        throw new IllegalStateException();
    }

    public final O b(long j10) {
        O oF = this.f13525f.f(0, 3);
        oF.e(new o.b().y0("text/vtt").n0(this.f13520a).C0(j10).P());
        this.f13525f.n();
        return oF;
    }

    @Override // i2.InterfaceC4336p
    public void c(i2.r rVar) {
        if (this.f13524e) {
            rVar = new F2.t(rVar, this.f13523d);
        }
        this.f13525f = rVar;
        rVar.v(new J.b(-9223372036854775807L));
    }

    public final void d() throws D1.w {
        C c10 = new C(this.f13526g);
        O2.h.e(c10);
        long jH = 0;
        long jD = 0;
        for (String strW = c10.w(); !TextUtils.isEmpty(strW); strW = c10.w()) {
            if (strW.startsWith("X-TIMESTAMP-MAP")) {
                Matcher matcher = f13518i.matcher(strW);
                if (!matcher.find()) {
                    throw D1.w.a("X-TIMESTAMP-MAP doesn't contain local timestamp: " + strW, null);
                }
                Matcher matcher2 = f13519j.matcher(strW);
                if (!matcher2.find()) {
                    throw D1.w.a("X-TIMESTAMP-MAP doesn't contain media timestamp: " + strW, null);
                }
                jD = O2.h.d((String) AbstractC0853a.e(matcher.group(1)));
                jH = H.h(Long.parseLong((String) AbstractC0853a.e(matcher2.group(1))));
            }
        }
        Matcher matcherA = O2.h.a(c10);
        if (matcherA == null) {
            b(0L);
            return;
        }
        long jD2 = O2.h.d((String) AbstractC0853a.e(matcherA.group(1)));
        long jB = this.f13521b.b(H.l((jH + jD2) - jD));
        O oB = b(jB - jD2);
        this.f13522c.Y(this.f13526g, this.f13527h);
        oB.b(this.f13522c, this.f13527h);
        oB.d(jB, 1, this.f13527h, 0, null);
    }

    @Override // i2.InterfaceC4336p
    public int i(InterfaceC4337q interfaceC4337q, I i10) throws D1.w {
        AbstractC0853a.e(this.f13525f);
        int length = (int) interfaceC4337q.getLength();
        int i11 = this.f13527h;
        byte[] bArr = this.f13526g;
        if (i11 == bArr.length) {
            this.f13526g = Arrays.copyOf(bArr, ((length != -1 ? length : bArr.length) * 3) / 2);
        }
        byte[] bArr2 = this.f13526g;
        int i12 = this.f13527h;
        int i13 = interfaceC4337q.read(bArr2, i12, bArr2.length - i12);
        if (i13 != -1) {
            int i14 = this.f13527h + i13;
            this.f13527h = i14;
            if (length == -1 || i14 != length) {
                return 0;
            }
        }
        d();
        return -1;
    }

    @Override // i2.InterfaceC4336p
    public boolean j(InterfaceC4337q interfaceC4337q) {
        interfaceC4337q.e(this.f13526g, 0, 6, false);
        this.f13522c.Y(this.f13526g, 6);
        if (O2.h.b(this.f13522c)) {
            return true;
        }
        interfaceC4337q.e(this.f13526g, 6, 3, false);
        this.f13522c.Y(this.f13526g, 9);
        return O2.h.b(this.f13522c);
    }

    @Override // i2.InterfaceC4336p
    public void release() {
    }
}
