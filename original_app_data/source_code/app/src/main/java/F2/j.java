package F2;

import G1.AbstractC0853a;
import com.google.android.libraries.barhopper.RecognitionOptions;
import java.nio.ByteBuffer;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public abstract class j extends J1.h implements l {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final String f3666o;

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public class a extends q {
        public a() {
        }

        @Override // J1.g
        public void C() {
            j.this.t(this);
        }
    }

    public j(String str) {
        super(new p[2], new q[2]);
        this.f3666o = str;
        w(RecognitionOptions.UPC_E);
    }

    @Override // J1.h
    /* JADX INFO: renamed from: A, reason: merged with bridge method [inline-methods] */
    public final m k(Throwable th) {
        return new m("Unexpected decode error", th);
    }

    public abstract k B(byte[] bArr, int i10, boolean z10);

    @Override // J1.h
    /* JADX INFO: renamed from: C, reason: merged with bridge method [inline-methods] */
    public final m l(p pVar, q qVar, boolean z10) {
        try {
            ByteBuffer byteBuffer = (ByteBuffer) AbstractC0853a.e(pVar.f5878d);
            qVar.D(pVar.f5880f, B(byteBuffer.array(), byteBuffer.limit(), z10), pVar.f3682j);
            qVar.f5888d = false;
            return null;
        } catch (m e10) {
            return e10;
        }
    }

    @Override // J1.h
    /* JADX INFO: renamed from: y, reason: merged with bridge method [inline-methods] */
    public final p i() {
        return new p();
    }

    @Override // J1.h
    /* JADX INFO: renamed from: z, reason: merged with bridge method [inline-methods] */
    public final q j() {
        return new a();
    }

    @Override // F2.l
    public void b(long j10) {
    }
}
