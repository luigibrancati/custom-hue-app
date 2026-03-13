package c4;

import Fe.AbstractC0852n;
import Fe.C0843e;
import Fe.InterfaceC0845g;
import Fe.J;
import Rd.C2142n;
import a4.InterfaceC2641a;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.RectF;
import fc.C4035r;
import gc.C4204q;
import j4.AbstractC4689h;
import java.io.IOException;
import java.io.InputStream;
import java.io.InterruptedIOException;
import java.util.concurrent.CancellationException;
import kotlin.jvm.internal.AbstractC4854k;
import kotlin.jvm.internal.AbstractC4862t;
import lc.InterfaceC4988e;
import mc.C5045b;
import mc.C5046c;
import n4.AbstractC5085a;

/* JADX INFO: renamed from: c4.a, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public final class C2943a implements e {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final C0333a f25589c = new C0333a(null);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final String[] f25590d = {"image/jpeg", "image/webp", "image/heic", "image/heif"};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f25591a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Paint f25592b;

    /* JADX INFO: renamed from: c4.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class C0333a {
        public /* synthetic */ C0333a(AbstractC4854k abstractC4854k) {
            this();
        }

        public C0333a() {
        }
    }

    /* JADX INFO: renamed from: c4.a$b */
    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class b extends AbstractC0852n {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public Exception f25593b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(J delegate) {
            super(delegate);
            AbstractC4862t.e(delegate, "delegate");
        }

        @Override // Fe.AbstractC0852n, Fe.J
        public long V0(C0843e sink, long j10) throws Exception {
            AbstractC4862t.e(sink, "sink");
            try {
                return super.V0(sink, j10);
            } catch (Exception e10) {
                this.f25593b = e10;
                throw e10;
            }
        }

        public final Exception b() {
            return this.f25593b;
        }
    }

    /* JADX INFO: renamed from: c4.a$c */
    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class c extends InputStream {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final InputStream f25594a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public volatile int f25595b;

        public c(InputStream delegate) {
            AbstractC4862t.e(delegate, "delegate");
            this.f25594a = delegate;
            this.f25595b = 1073741824;
        }

        public final int a(int i10) {
            if (i10 == -1) {
                this.f25595b = 0;
            }
            return i10;
        }

        @Override // java.io.InputStream
        public int available() {
            return this.f25595b;
        }

        @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
        public void close() throws IOException {
            this.f25594a.close();
        }

        @Override // java.io.InputStream
        public int read() {
            return a(this.f25594a.read());
        }

        @Override // java.io.InputStream
        public long skip(long j10) {
            return this.f25594a.skip(j10);
        }

        @Override // java.io.InputStream
        public int read(byte[] b10) {
            AbstractC4862t.e(b10, "b");
            return a(this.f25594a.read(b10));
        }

        @Override // java.io.InputStream
        public int read(byte[] b10, int i10, int i11) {
            AbstractC4862t.e(b10, "b");
            return a(this.f25594a.read(b10, i10, i11));
        }
    }

    public C2943a(Context context) {
        AbstractC4862t.e(context, "context");
        this.f25591a = context;
        this.f25592b = new Paint(3);
    }

    @Override // c4.e
    public Object a(InterfaceC2641a interfaceC2641a, InterfaceC0845g interfaceC0845g, AbstractC4689h abstractC4689h, i iVar, InterfaceC4988e interfaceC4988e) throws Exception {
        C2142n c2142n = new C2142n(C5045b.c(interfaceC4988e), 1);
        c2142n.E();
        try {
            h hVar = new h(c2142n, interfaceC0845g);
            try {
                c2142n.resumeWith(C4035r.b(f(interfaceC2641a, hVar, abstractC4689h, iVar)));
                Object objW = c2142n.w();
                if (objW == C5046c.f()) {
                    nc.h.c(interfaceC4988e);
                }
                return objW;
            } finally {
                hVar.b();
            }
        } catch (Exception e10) {
            if (!(e10 instanceof InterruptedException) && !(e10 instanceof InterruptedIOException)) {
                throw e10;
            }
            Throwable thInitCause = new CancellationException("Blocking call was interrupted due to parent cancellation.").initCause(e10);
            AbstractC4862t.d(thInitCause, "CancellationException(\"B…n.\").initCause(exception)");
            throw thInitCause;
        }
    }

    @Override // c4.e
    public boolean b(InterfaceC0845g source, String str) {
        AbstractC4862t.e(source, "source");
        return true;
    }

    public final Bitmap d(InterfaceC2641a interfaceC2641a, Bitmap bitmap, Bitmap.Config config, boolean z10, int i10) {
        boolean z11 = i10 > 0;
        if (!z10 && !z11) {
            return bitmap;
        }
        Matrix matrix = new Matrix();
        float width = bitmap.getWidth() / 2.0f;
        float height = bitmap.getHeight() / 2.0f;
        if (z10) {
            matrix.postScale(-1.0f, 1.0f, width, height);
        }
        if (z11) {
            matrix.postRotate(i10, width, height);
        }
        RectF rectF = new RectF(0.0f, 0.0f, bitmap.getWidth(), bitmap.getHeight());
        matrix.mapRect(rectF);
        float f10 = rectF.left;
        if (f10 != 0.0f || rectF.top != 0.0f) {
            matrix.postTranslate(-f10, -rectF.top);
        }
        Bitmap bitmapC = (i10 == 90 || i10 == 270) ? interfaceC2641a.c(bitmap.getHeight(), bitmap.getWidth(), config) : interfaceC2641a.c(bitmap.getWidth(), bitmap.getHeight(), config);
        new Canvas(bitmapC).drawBitmap(bitmap, matrix, this.f25592b);
        interfaceC2641a.b(bitmap);
        return bitmapC;
    }

    public final Bitmap.Config e(BitmapFactory.Options options, i iVar, boolean z10, int i10) {
        Bitmap.Config configD = iVar.d();
        if (z10 || i10 > 0) {
            configD = AbstractC5085a.e(configD);
        }
        if (iVar.b() && configD == Bitmap.Config.ARGB_8888 && AbstractC4862t.a(options.outMimeType, "image/jpeg")) {
            configD = Bitmap.Config.RGB_565;
        }
        Bitmap.Config config = options.outConfig;
        Bitmap.Config config2 = Bitmap.Config.RGBA_F16;
        return (config != config2 || configD == Bitmap.Config.HARDWARE) ? configD : config2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0177  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x01be  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x01d8  */
    /* JADX WARN: Type inference failed for: r2v1, types: [android.graphics.Rect, java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r2v11 */
    /* JADX WARN: Type inference failed for: r2v19 */
    /* JADX WARN: Type inference failed for: r2v2, types: [android.graphics.Bitmap] */
    /* JADX WARN: Type inference failed for: r2v3 */
    /* JADX WARN: Type inference failed for: r2v30 */
    /* JADX WARN: Type inference failed for: r3v1 */
    /* JADX WARN: Type inference failed for: r3v2, types: [a4.a] */
    /* JADX WARN: Type inference failed for: r3v3 */
    /* JADX WARN: Type inference failed for: r3v4 */
    /* JADX WARN: Type inference failed for: r3v5 */
    /* JADX WARN: Type inference failed for: r3v6 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final c4.c f(a4.InterfaceC2641a r29, Fe.J r30, j4.AbstractC4689h r31, c4.i r32) throws java.lang.Exception {
        /*
            Method dump skipped, instruction units count: 485
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: c4.C2943a.f(a4.a, Fe.J, j4.h, c4.i):c4.c");
    }

    public final boolean g(String str) {
        return str != null && C4204q.P(f25590d, str);
    }
}
