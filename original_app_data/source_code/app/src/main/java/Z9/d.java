package Z9;

import android.graphics.Bitmap;
import android.graphics.Matrix;
import android.media.Image;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
import java.nio.ByteBuffer;
import v6.AbstractC6056k;
import v6.C6051f;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final C6051f f20413a = new C6051f("MLKitImageUtils", "");

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final d f20414b = new d();

    public static d b() {
        return f20414b;
    }

    public IObjectWrapper a(Y9.a aVar) throws N9.a {
        int iG = aVar.g();
        if (iG == -1) {
            return ObjectWrapper.wrap((Bitmap) AbstractC6056k.l(aVar.d()));
        }
        if (iG != 17) {
            if (iG == 35) {
                return ObjectWrapper.wrap(aVar.i());
            }
            if (iG != 842094169) {
                throw new N9.a("Unsupported image format: " + aVar.g(), 3);
            }
        }
        return ObjectWrapper.wrap((ByteBuffer) AbstractC6056k.l(aVar.e()));
    }

    public int c(Y9.a aVar) {
        if (aVar.g() == -1) {
            return ((Bitmap) AbstractC6056k.l(aVar.d())).getAllocationByteCount();
        }
        if (aVar.g() == 17 || aVar.g() == 842094169) {
            return ((ByteBuffer) AbstractC6056k.l(aVar.e())).limit();
        }
        if (aVar.g() != 35) {
            return 0;
        }
        return (((Image.Plane[]) AbstractC6056k.l(aVar.j()))[0].getBuffer().limit() * 3) / 2;
    }

    public Matrix d(int i10, int i11, int i12) {
        if (i12 == 0) {
            return null;
        }
        Matrix matrix = new Matrix();
        matrix.postTranslate((-i10) / 2.0f, (-i11) / 2.0f);
        matrix.postRotate(i12 * 90);
        int i13 = i12 % 2;
        int i14 = i13 != 0 ? i11 : i10;
        if (i13 == 0) {
            i10 = i11;
        }
        matrix.postTranslate(i14 / 2.0f, i10 / 2.0f);
        return matrix;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:35:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0070 A[Catch: FileNotFoundException -> 0x0025, TryCatch #2 {FileNotFoundException -> 0x0025, blocks: (B:3:0x0004, B:5:0x000a, B:7:0x0018, B:37:0x0077, B:38:0x008c, B:49:0x00bd, B:51:0x00c6, B:40:0x0091, B:41:0x0095, B:42:0x009c, B:43:0x00a0, B:44:0x00a7, B:45:0x00ab, B:47:0x00b2, B:36:0x0070, B:33:0x005e, B:53:0x00cb, B:54:0x00d2), top: B:62:0x0004 }] */
    /* JADX WARN: Removed duplicated region for block: B:39:0x008f A[PHI: r4
      0x008f: PHI (r4v3 android.graphics.Matrix) = (r4v0 android.graphics.Matrix), (r4v1 android.graphics.Matrix) binds: [B:38:0x008c, B:47:0x00b2] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0091 A[Catch: FileNotFoundException -> 0x0025, TryCatch #2 {FileNotFoundException -> 0x0025, blocks: (B:3:0x0004, B:5:0x000a, B:7:0x0018, B:37:0x0077, B:38:0x008c, B:49:0x00bd, B:51:0x00c6, B:40:0x0091, B:41:0x0095, B:42:0x009c, B:43:0x00a0, B:44:0x00a7, B:45:0x00ab, B:47:0x00b2, B:36:0x0070, B:33:0x005e, B:53:0x00cb, B:54:0x00d2), top: B:62:0x0004 }] */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0095 A[Catch: FileNotFoundException -> 0x0025, TryCatch #2 {FileNotFoundException -> 0x0025, blocks: (B:3:0x0004, B:5:0x000a, B:7:0x0018, B:37:0x0077, B:38:0x008c, B:49:0x00bd, B:51:0x00c6, B:40:0x0091, B:41:0x0095, B:42:0x009c, B:43:0x00a0, B:44:0x00a7, B:45:0x00ab, B:47:0x00b2, B:36:0x0070, B:33:0x005e, B:53:0x00cb, B:54:0x00d2), top: B:62:0x0004 }] */
    /* JADX WARN: Removed duplicated region for block: B:42:0x009c A[Catch: FileNotFoundException -> 0x0025, TryCatch #2 {FileNotFoundException -> 0x0025, blocks: (B:3:0x0004, B:5:0x000a, B:7:0x0018, B:37:0x0077, B:38:0x008c, B:49:0x00bd, B:51:0x00c6, B:40:0x0091, B:41:0x0095, B:42:0x009c, B:43:0x00a0, B:44:0x00a7, B:45:0x00ab, B:47:0x00b2, B:36:0x0070, B:33:0x005e, B:53:0x00cb, B:54:0x00d2), top: B:62:0x0004 }] */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00a0 A[Catch: FileNotFoundException -> 0x0025, TryCatch #2 {FileNotFoundException -> 0x0025, blocks: (B:3:0x0004, B:5:0x000a, B:7:0x0018, B:37:0x0077, B:38:0x008c, B:49:0x00bd, B:51:0x00c6, B:40:0x0091, B:41:0x0095, B:42:0x009c, B:43:0x00a0, B:44:0x00a7, B:45:0x00ab, B:47:0x00b2, B:36:0x0070, B:33:0x005e, B:53:0x00cb, B:54:0x00d2), top: B:62:0x0004 }] */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00a7 A[Catch: FileNotFoundException -> 0x0025, TryCatch #2 {FileNotFoundException -> 0x0025, blocks: (B:3:0x0004, B:5:0x000a, B:7:0x0018, B:37:0x0077, B:38:0x008c, B:49:0x00bd, B:51:0x00c6, B:40:0x0091, B:41:0x0095, B:42:0x009c, B:43:0x00a0, B:44:0x00a7, B:45:0x00ab, B:47:0x00b2, B:36:0x0070, B:33:0x005e, B:53:0x00cb, B:54:0x00d2), top: B:62:0x0004 }] */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00ab A[Catch: FileNotFoundException -> 0x0025, TryCatch #2 {FileNotFoundException -> 0x0025, blocks: (B:3:0x0004, B:5:0x000a, B:7:0x0018, B:37:0x0077, B:38:0x008c, B:49:0x00bd, B:51:0x00c6, B:40:0x0091, B:41:0x0095, B:42:0x009c, B:43:0x00a0, B:44:0x00a7, B:45:0x00ab, B:47:0x00b2, B:36:0x0070, B:33:0x005e, B:53:0x00cb, B:54:0x00d2), top: B:62:0x0004 }] */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00b2 A[Catch: FileNotFoundException -> 0x0025, TryCatch #2 {FileNotFoundException -> 0x0025, blocks: (B:3:0x0004, B:5:0x000a, B:7:0x0018, B:37:0x0077, B:38:0x008c, B:49:0x00bd, B:51:0x00c6, B:40:0x0091, B:41:0x0095, B:42:0x009c, B:43:0x00a0, B:44:0x00a7, B:45:0x00ab, B:47:0x00b2, B:36:0x0070, B:33:0x005e, B:53:0x00cb, B:54:0x00d2), top: B:62:0x0004 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final android.graphics.Bitmap e(android.content.ContentResolver r10, android.net.Uri r11) throws java.io.IOException {
        /*
            Method dump skipped, instruction units count: 246
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: Z9.d.e(android.content.ContentResolver, android.net.Uri):android.graphics.Bitmap");
    }
}
