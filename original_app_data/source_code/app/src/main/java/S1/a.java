package S1;

import D1.o;
import D1.v;
import D1.w;
import G1.AbstractC0853a;
import G1.M;
import J1.h;
import K1.f1;
import S1.b;
import android.content.Context;
import android.graphics.Point;
import com.google.android.libraries.barhopper.RecognitionOptions;
import java.io.IOException;
import java.nio.ByteBuffer;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public final class a extends h implements S1.b {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final Context f15227o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final int f15228p;

    /* JADX INFO: renamed from: S1.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public class C0185a extends e {
        public C0185a() {
        }

        @Override // J1.g
        public void C() {
            a.this.t(this);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public interface b {
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class c implements b.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Context f15230a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f15231b;

        @Deprecated
        public c() {
            this(null, null);
        }

        @Override // S1.b.a
        public int a(o oVar) {
            String str = oVar.f1805o;
            return (str == null || !v.q(str)) ? f1.u(0) : M.B0(oVar.f1805o) ? f1.u(4) : f1.u(1);
        }

        @Override // S1.b.a
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public a b() {
            return new a(this.f15230a, null, this.f15231b, 0 == true ? 1 : 0);
        }

        public c(Context context) {
            this(context, null);
        }

        public c(Context context, b bVar) {
            this.f15230a = context;
            this.f15231b = -1;
        }
    }

    public /* synthetic */ a(Context context, b bVar, int i10, C0185a c0185a) {
        this(context, bVar, i10);
    }

    @Override // J1.h
    /* JADX INFO: renamed from: A, reason: merged with bridge method [inline-methods] */
    public S1.c l(J1.f fVar, e eVar, boolean z10) {
        ByteBuffer byteBuffer = (ByteBuffer) AbstractC0853a.e(fVar.f5878d);
        AbstractC0853a.g(byteBuffer.hasArray());
        AbstractC0853a.a(byteBuffer.arrayOffset() == 0);
        try {
            int iMax = this.f15228p;
            if (iMax == -1) {
                Context context = this.f15227o;
                if (context != null) {
                    Point pointW = M.W(context);
                    int i10 = pointW.x;
                    int i11 = pointW.y;
                    o oVar = fVar.f5876b;
                    if (oVar != null) {
                        int i12 = oVar.f1787N;
                        if (i12 != -1) {
                            i10 *= i12;
                        }
                        int i13 = oVar.f1788O;
                        if (i13 != -1) {
                            i11 *= i13;
                        }
                    }
                    iMax = (Math.max(i10, i11) * 2) - 1;
                } else {
                    iMax = RecognitionOptions.AZTEC;
                }
            }
            eVar.f15233e = I1.c.a(byteBuffer.array(), byteBuffer.remaining(), null, iMax);
            eVar.f5886b = fVar.f5880f;
            return null;
        } catch (w e10) {
            return new S1.c("Could not decode image data with BitmapFactory.", e10);
        } catch (IOException e11) {
            return new S1.c(e11);
        }
    }

    @Override // J1.h, J1.d
    public /* bridge */ /* synthetic */ e a() {
        return (e) super.a();
    }

    @Override // J1.h
    public J1.f i() {
        return new J1.f(1);
    }

    @Override // J1.h
    /* JADX INFO: renamed from: y, reason: merged with bridge method [inline-methods] */
    public e j() {
        return new C0185a();
    }

    @Override // J1.h
    /* JADX INFO: renamed from: z, reason: merged with bridge method [inline-methods] */
    public S1.c k(Throwable th) {
        return new S1.c("Unexpected decode error", th);
    }

    public a(Context context, b bVar, int i10) {
        super(new J1.f[1], new e[1]);
        this.f15227o = context;
        this.f15228p = i10;
    }
}
