package n1;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Typeface;
import o1.C5192a;
import org.apache.tika.utils.StringUtils;

/* JADX INFO: renamed from: n1.j, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public class C5079j {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final ThreadLocal f40511d = new ThreadLocal();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f40512a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final androidx.emoji2.text.f f40513b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public volatile int f40514c = 0;

    public C5079j(androidx.emoji2.text.f fVar, int i10) {
        this.f40513b = fVar;
        this.f40512a = i10;
    }

    public void a(Canvas canvas, float f10, float f11, Paint paint) {
        Typeface typefaceG = this.f40513b.g();
        Typeface typeface = paint.getTypeface();
        paint.setTypeface(typefaceG);
        canvas.drawText(this.f40513b.c(), this.f40512a * 2, 2, f10, f11, paint);
        paint.setTypeface(typeface);
    }

    public int b(int i10) {
        return g().h(i10);
    }

    public int c() {
        return g().i();
    }

    public int d() {
        return this.f40514c & 3;
    }

    public int e() {
        return g().k();
    }

    public int f() {
        return g().l();
    }

    public final C5192a g() {
        ThreadLocal threadLocal = f40511d;
        C5192a c5192a = (C5192a) threadLocal.get();
        if (c5192a == null) {
            c5192a = new C5192a();
            threadLocal.set(c5192a);
        }
        this.f40513b.d().j(c5192a, this.f40512a);
        return c5192a;
    }

    public short h() {
        return g().m();
    }

    public int i() {
        return g().n();
    }

    public boolean j() {
        return g().j();
    }

    public boolean k() {
        return (this.f40514c & 4) > 0;
    }

    public void l(boolean z10) {
        int iD = d();
        if (z10) {
            this.f40514c = iD | 4;
        } else {
            this.f40514c = iD;
        }
    }

    public void m(boolean z10) {
        int i10 = this.f40514c & 4;
        this.f40514c = z10 ? i10 | 2 : i10 | 1;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(super.toString());
        sb2.append(", id:");
        sb2.append(Integer.toHexString(f()));
        sb2.append(", codepoints:");
        int iC = c();
        for (int i10 = 0; i10 < iC; i10++) {
            sb2.append(Integer.toHexString(b(i10)));
            sb2.append(StringUtils.SPACE);
        }
        return sb2.toString();
    }
}
