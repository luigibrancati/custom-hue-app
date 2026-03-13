package G1;

import android.content.Context;
import android.opengl.EGL14;
import android.opengl.EGLDisplay;
import android.opengl.GLES20;
import android.opengl.GLU;
import android.os.Build;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public abstract class o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final int[] f4313a = {12352, 4, 12324, 8, 12323, 8, 12322, 8, 12321, 8, 12325, 0, 12326, 0, 12344};

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int[] f4314b = {12352, 4, 12324, 10, 12323, 10, 12322, 10, 12321, 2, 12325, 0, 12326, 0, 12344};

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int[] f4315c = {12445, 13120, 12344, 12344};

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final int[] f4316d = {12445, 13632, 12344, 12344};

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final int[] f4317e = {12344};

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class a extends Exception {
        public a(String str) {
            super(str);
        }
    }

    public static void a() throws a {
        StringBuilder sb2 = new StringBuilder();
        boolean z10 = false;
        while (true) {
            int iGlGetError = GLES20.glGetError();
            if (iGlGetError == 0) {
                break;
            }
            if (z10) {
                sb2.append('\n');
            }
            String strGluErrorString = GLU.gluErrorString(iGlGetError);
            if (strGluErrorString == null) {
                strGluErrorString = "error code: 0x" + Integer.toHexString(iGlGetError);
            }
            sb2.append("glError: ");
            sb2.append(strGluErrorString);
            z10 = true;
        }
        if (z10) {
            throw new a(sb2.toString());
        }
    }

    public static void b(boolean z10, String str) throws a {
        if (!z10) {
            throw new a(str);
        }
    }

    public static EGLDisplay c() throws a {
        EGLDisplay eGLDisplayEglGetDisplay = EGL14.eglGetDisplay(0);
        b(!eGLDisplayEglGetDisplay.equals(EGL14.EGL_NO_DISPLAY), "No EGL display.");
        b(EGL14.eglInitialize(eGLDisplayEglGetDisplay, new int[1], 0, new int[1], 0), "Error in eglInitialize.");
        a();
        return eGLDisplayEglGetDisplay;
    }

    public static boolean d() {
        return g("EGL_EXT_gl_colorspace_bt2020_hlg");
    }

    public static boolean e() {
        return Build.VERSION.SDK_INT >= 33 && g("EGL_EXT_gl_colorspace_bt2020_pq");
    }

    public static boolean f(int i10) {
        if (i10 == 6) {
            return e();
        }
        if (i10 == 7) {
            return d();
        }
        return true;
    }

    public static boolean g(String str) {
        String strEglQueryString = EGL14.eglQueryString(c(), 12373);
        return strEglQueryString != null && strEglQueryString.contains(str);
    }

    public static boolean h(Context context) {
        return g("EGL_EXT_protected_content");
    }

    public static boolean i() {
        return g("EGL_KHR_surfaceless_context");
    }
}
