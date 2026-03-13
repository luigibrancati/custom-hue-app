package W;

import E.AbstractC0807p0;
import E.J;
import U.A;
import X0.h;
import android.opengl.EGL14;
import android.opengl.EGLConfig;
import android.opengl.EGLDisplay;
import android.opengl.EGLSurface;
import android.opengl.GLES20;
import android.opengl.Matrix;
import android.util.Log;
import android.util.Size;
import android.view.Surface;
import java.nio.Buffer;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.FloatBuffer;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.apache.tika.metadata.TikaCoreProperties;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public abstract class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final int[] f17614a = {12344};

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int[] f17615b = {12445, 13632, 12344};

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final String f17616c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final String f17617d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final A f17618e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final A f17619f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final A f17620g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final float[] f17621h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final FloatBuffer f17622i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final float[] f17623j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final FloatBuffer f17624k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final W.g f17625l;

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public class a implements A {
        @Override // U.A
        public String a(String str, String str2) {
            return String.format(Locale.US, "#extension GL_OES_EGL_image_external : require\nprecision mediump float;\nvarying vec2 %s;\nuniform samplerExternalOES %s;\nuniform float uAlphaScale;\nvoid main() {\n    vec4 src = texture2D(%s, %s);\n    gl_FragColor = vec4(src.rgb, src.a * uAlphaScale);\n}\n", str2, str, str, str2);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public class b implements A {
        @Override // U.A
        public String a(String str, String str2) {
            return String.format(Locale.US, "#version 300 es\n#extension GL_OES_EGL_image_external_essl3 : require\nprecision mediump float;\nuniform samplerExternalOES %s;\nuniform float uAlphaScale;\nin vec2 %s;\nout vec4 outColor;\n\nvoid main() {\n  vec4 src = texture(%s, %s);\n  outColor = vec4(src.rgb, src.a * uAlphaScale);\n}", str, str2, str, str2);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public class c implements A {
        @Override // U.A
        public String a(String str, String str2) {
            return String.format(Locale.US, "#version 300 es\n#extension GL_EXT_YUV_target : require\nprecision mediump float;\nuniform __samplerExternal2DY2YEXT %s;\nuniform float uAlphaScale;\nin vec2 %s;\nout vec4 outColor;\n\nvec3 yuvToRgb(vec3 yuv) {\n  const vec3 yuvOffset = vec3(0.0625, 0.5, 0.5);\n  const mat3 yuvToRgbColorMat = mat3(\n    1.1689f, 1.1689f, 1.1689f,\n    0.0000f, -0.1881f, 2.1502f,\n    1.6853f, -0.6530f, 0.0000f\n  );\n  return clamp(yuvToRgbColorMat * (yuv - yuvOffset), 0.0, 1.0);\n}\n\nvoid main() {\n  vec3 srcYuv = texture(%s, %s).xyz;\n  vec3 srcRgb = yuvToRgb(srcYuv);\n  outColor = vec4(srcRgb, uAlphaScale);\n}", str, str2, str, str2);
        }
    }

    /* JADX INFO: renamed from: W.d$d, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static class C0233d extends f {
        public C0233d() {
            super("uniform mat4 uTransMatrix;\nattribute vec4 aPosition;\nvoid main() {\n    gl_Position = uTransMatrix * aPosition;\n}\n", "precision mediump float;\nuniform float uAlphaScale;\nvoid main() {\n    gl_FragColor = vec4(0.0, 0.0, 0.0, uAlphaScale);\n}\n");
        }
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public enum e {
        UNKNOWN,
        DEFAULT,
        YUV
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static abstract class f {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f17626a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f17627b = -1;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f17628c = -1;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public int f17629d = -1;

        /* JADX WARN: Removed duplicated region for block: B:24:0x0070  */
        /* JADX WARN: Removed duplicated region for block: B:26:0x0075  */
        /* JADX WARN: Removed duplicated region for block: B:28:0x007a  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public f(java.lang.String r7, java.lang.String r8) throws java.lang.Throwable {
            /*
                r6 = this;
                java.lang.String r0 = "glAttachShader"
                r6.<init>()
                r1 = -1
                r6.f17627b = r1
                r6.f17628c = r1
                r6.f17629d = r1
                r2 = 35633(0x8b31, float:4.9932E-41)
                int r7 = W.d.y(r2, r7)     // Catch: java.lang.Throwable -> L6a
                r2 = 35632(0x8b30, float:4.9931E-41)
                int r8 = W.d.y(r2, r8)     // Catch: java.lang.Throwable -> L66
                int r2 = android.opengl.GLES20.glCreateProgram()     // Catch: java.lang.Throwable -> L63
                java.lang.String r3 = "glCreateProgram"
                W.d.g(r3)     // Catch: java.lang.Throwable -> L46
                android.opengl.GLES20.glAttachShader(r2, r7)     // Catch: java.lang.Throwable -> L46
                W.d.g(r0)     // Catch: java.lang.Throwable -> L46
                android.opengl.GLES20.glAttachShader(r2, r8)     // Catch: java.lang.Throwable -> L46
                W.d.g(r0)     // Catch: java.lang.Throwable -> L46
                android.opengl.GLES20.glLinkProgram(r2)     // Catch: java.lang.Throwable -> L46
                r0 = 1
                int[] r3 = new int[r0]     // Catch: java.lang.Throwable -> L46
                r4 = 35714(0x8b82, float:5.0046E-41)
                r5 = 0
                android.opengl.GLES20.glGetProgramiv(r2, r4, r3, r5)     // Catch: java.lang.Throwable -> L46
                r3 = r3[r5]     // Catch: java.lang.Throwable -> L46
                if (r3 != r0) goto L48
                r6.f17626a = r2     // Catch: java.lang.Throwable -> L46
                r6.c()
                return
            L46:
                r6 = move-exception
                goto L6e
            L48:
                java.lang.IllegalStateException r6 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> L46 java.lang.Throwable -> L46
                java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L46 java.lang.Throwable -> L46
                r0.<init>()     // Catch: java.lang.Throwable -> L46 java.lang.Throwable -> L46
                java.lang.String r3 = "Could not link program: "
                r0.append(r3)     // Catch: java.lang.Throwable -> L46 java.lang.Throwable -> L46
                java.lang.String r3 = android.opengl.GLES20.glGetProgramInfoLog(r2)     // Catch: java.lang.Throwable -> L46 java.lang.Throwable -> L46
                r0.append(r3)     // Catch: java.lang.Throwable -> L46 java.lang.Throwable -> L46
                java.lang.String r0 = r0.toString()     // Catch: java.lang.Throwable -> L46 java.lang.Throwable -> L46
                r6.<init>(r0)     // Catch: java.lang.Throwable -> L46 java.lang.Throwable -> L46
                throw r6     // Catch: java.lang.Throwable -> L46 java.lang.Throwable -> L46
            L63:
                r6 = move-exception
                r2 = r1
                goto L6e
            L66:
                r6 = move-exception
                r8 = r1
            L68:
                r2 = r8
                goto L6e
            L6a:
                r6 = move-exception
                r7 = r1
                r8 = r7
                goto L68
            L6e:
                if (r7 == r1) goto L73
                android.opengl.GLES20.glDeleteShader(r7)
            L73:
                if (r8 == r1) goto L78
                android.opengl.GLES20.glDeleteShader(r8)
            L78:
                if (r2 == r1) goto L7d
                android.opengl.GLES20.glDeleteProgram(r2)
            L7d:
                throw r6
            */
            throw new UnsupportedOperationException("Method not decompiled: W.d.f.<init>(java.lang.String, java.lang.String):void");
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void c() {
            int iGlGetAttribLocation = GLES20.glGetAttribLocation(this.f17626a, "aPosition");
            this.f17629d = iGlGetAttribLocation;
            d.j(iGlGetAttribLocation, "aPosition");
            int iGlGetUniformLocation = GLES20.glGetUniformLocation(this.f17626a, "uTransMatrix");
            this.f17627b = iGlGetUniformLocation;
            d.j(iGlGetUniformLocation, "uTransMatrix");
            int iGlGetUniformLocation2 = GLES20.glGetUniformLocation(this.f17626a, "uAlphaScale");
            this.f17628c = iGlGetUniformLocation2;
            d.j(iGlGetUniformLocation2, "uAlphaScale");
        }

        public void b() {
            GLES20.glDeleteProgram(this.f17626a);
        }

        public void d(float f10) {
            GLES20.glUniform1f(this.f17628c, f10);
            d.g("glUniform1f");
        }

        public void e(float[] fArr) {
            GLES20.glUniformMatrix4fv(this.f17627b, 1, false, fArr, 0);
            d.g("glUniformMatrix4fv");
        }

        public void f() {
            GLES20.glUseProgram(this.f17626a);
            d.g("glUseProgram");
            GLES20.glEnableVertexAttribArray(this.f17629d);
            d.g("glEnableVertexAttribArray");
            GLES20.glVertexAttribPointer(this.f17629d, 2, 5126, false, 0, (Buffer) d.f17622i);
            d.g("glVertexAttribPointer");
            e(d.l());
            d(1.0f);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static class g extends f {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public int f17630e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public int f17631f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public int f17632g;

        public g(J j10, e eVar) {
            this(j10, g(j10, eVar));
        }

        public static A g(J j10, e eVar) {
            if (!j10.d()) {
                return d.f17618e;
            }
            h.b(eVar != e.UNKNOWN, "No default sampler shader available for" + eVar);
            return eVar == e.YUV ? d.f17620g : d.f17619f;
        }

        public final void c() {
            c();
            int iGlGetUniformLocation = GLES20.glGetUniformLocation(this.f17626a, "sTexture");
            this.f17630e = iGlGetUniformLocation;
            d.j(iGlGetUniformLocation, "sTexture");
            int iGlGetAttribLocation = GLES20.glGetAttribLocation(this.f17626a, "aTextureCoord");
            this.f17632g = iGlGetAttribLocation;
            d.j(iGlGetAttribLocation, "aTextureCoord");
            int iGlGetUniformLocation2 = GLES20.glGetUniformLocation(this.f17626a, "uTexMatrix");
            this.f17631f = iGlGetUniformLocation2;
            d.j(iGlGetUniformLocation2, "uTexMatrix");
        }

        @Override // W.d.f
        public void f() {
            super.f();
            GLES20.glUniform1i(this.f17630e, 0);
            GLES20.glEnableVertexAttribArray(this.f17632g);
            d.g("glEnableVertexAttribArray");
            GLES20.glVertexAttribPointer(this.f17632g, 2, 5126, false, 0, (Buffer) d.f17624k);
            d.g("glVertexAttribPointer");
        }

        public void h(float[] fArr) {
            GLES20.glUniformMatrix4fv(this.f17631f, 1, false, fArr, 0);
            d.g("glUniformMatrix4fv");
        }

        public g(J j10, A a10) {
            super(j10.d() ? d.f17617d : d.f17616c, d.v(a10));
            this.f17630e = -1;
            this.f17631f = -1;
            this.f17632g = -1;
            c();
        }
    }

    static {
        Locale locale = Locale.US;
        f17616c = String.format(locale, "uniform mat4 uTexMatrix;\nuniform mat4 uTransMatrix;\nattribute vec4 aPosition;\nattribute vec4 aTextureCoord;\nvarying vec2 %s;\nvoid main() {\n    gl_Position = uTransMatrix * aPosition;\n    %s = (uTexMatrix * aTextureCoord).xy;\n}\n", "vTextureCoord", "vTextureCoord");
        f17617d = String.format(locale, "#version 300 es\nin vec4 aPosition;\nin vec4 aTextureCoord;\nuniform mat4 uTexMatrix;\nuniform mat4 uTransMatrix;\nout vec2 %s;\nvoid main() {\n  gl_Position = uTransMatrix * aPosition;\n  %s = (uTexMatrix * aTextureCoord).xy;\n}\n", "vTextureCoord", "vTextureCoord");
        f17618e = new a();
        f17619f = new b();
        f17620g = new c();
        float[] fArr = {-1.0f, -1.0f, 1.0f, -1.0f, -1.0f, 1.0f, 1.0f, 1.0f};
        f17621h = fArr;
        f17622i = m(fArr);
        float[] fArr2 = {0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 1.0f, 1.0f, 1.0f};
        f17623j = fArr2;
        f17624k = m(fArr2);
        f17625l = W.g.d(EGL14.EGL_NO_SURFACE, 0, 0);
    }

    public static void e(String str) {
        try {
            f(str);
        } catch (IllegalStateException e10) {
            AbstractC0807p0.d("GLUtils", e10.toString(), e10);
        }
    }

    public static void f(String str) {
        int iEglGetError = EGL14.eglGetError();
        if (iEglGetError == 12288) {
            return;
        }
        throw new IllegalStateException(str + ": EGL error: 0x" + Integer.toHexString(iEglGetError));
    }

    public static void g(String str) {
        int iGlGetError = GLES20.glGetError();
        if (iGlGetError == 0) {
            return;
        }
        throw new IllegalStateException(str + ": GL error 0x" + Integer.toHexString(iGlGetError));
    }

    public static void h(Thread thread) {
        h.j(thread == Thread.currentThread(), "Method call must be called on the GL thread.");
    }

    public static void i(AtomicBoolean atomicBoolean, boolean z10) {
        h.j(z10 == atomicBoolean.get(), z10 ? "OpenGlRenderer is not initialized" : "OpenGlRenderer is already initialized");
    }

    public static void j(int i10, String str) {
        if (i10 >= 0) {
            return;
        }
        throw new IllegalStateException("Unable to locate '" + str + "' in program");
    }

    public static int[] k(String str, J j10) {
        int[] iArr = f17614a;
        if (j10.b() == 3) {
            if (str.contains("EGL_EXT_gl_colorspace_bt2020_hlg")) {
                return f17615b;
            }
            AbstractC0807p0.l("GLUtils", "Dynamic range uses HLG encoding, but device does not support EGL_EXT_gl_colorspace_bt2020_hlg.Fallback to default colorspace.");
        }
        return iArr;
    }

    public static float[] l() {
        float[] fArr = new float[16];
        Matrix.setIdentityM(fArr, 0);
        return fArr;
    }

    public static FloatBuffer m(float[] fArr) {
        ByteBuffer byteBufferAllocateDirect = ByteBuffer.allocateDirect(fArr.length * 4);
        byteBufferAllocateDirect.order(ByteOrder.nativeOrder());
        FloatBuffer floatBufferAsFloatBuffer = byteBufferAllocateDirect.asFloatBuffer();
        floatBufferAsFloatBuffer.put(fArr);
        floatBufferAsFloatBuffer.position(0);
        return floatBufferAsFloatBuffer;
    }

    public static EGLSurface n(EGLDisplay eGLDisplay, EGLConfig eGLConfig, int i10, int i11) {
        EGLSurface eGLSurfaceEglCreatePbufferSurface = EGL14.eglCreatePbufferSurface(eGLDisplay, eGLConfig, new int[]{12375, i10, 12374, i11, 12344}, 0);
        f("eglCreatePbufferSurface");
        if (eGLSurfaceEglCreatePbufferSurface != null) {
            return eGLSurfaceEglCreatePbufferSurface;
        }
        throw new IllegalStateException("surface was null");
    }

    public static Map o(J j10, Map map) {
        Object gVar;
        e eVar;
        HashMap map2 = new HashMap();
        e[] eVarArrValues = e.values();
        int length = eVarArrValues.length;
        for (int i10 = 0; i10 < length; i10++) {
            e eVar2 = eVarArrValues[i10];
            A a10 = (A) map.get(eVar2);
            if (a10 != null) {
                gVar = new g(j10, a10);
            } else if (eVar2 == e.YUV || eVar2 == (eVar = e.DEFAULT)) {
                gVar = new g(j10, eVar2);
            } else {
                h.j(eVar2 == e.UNKNOWN, "Unhandled input format: " + eVar2);
                if (j10.d()) {
                    gVar = new C0233d();
                } else {
                    A a11 = (A) map.get(eVar);
                    gVar = a11 != null ? new g(j10, a11) : new g(j10, eVar);
                }
            }
            Log.d("GLUtils", "Shader program for input format " + eVar2 + " created: " + gVar);
            map2.put(eVar2, gVar);
        }
        return map2;
    }

    public static int p() {
        int[] iArr = new int[1];
        GLES20.glGenTextures(1, iArr, 0);
        g("glGenTextures");
        int i10 = iArr[0];
        GLES20.glBindTexture(36197, i10);
        g("glBindTexture " + i10);
        GLES20.glTexParameteri(36197, 10241, 9729);
        GLES20.glTexParameteri(36197, 10240, 9729);
        GLES20.glTexParameteri(36197, 10242, 33071);
        GLES20.glTexParameteri(36197, 10243, 33071);
        g("glTexParameter");
        return i10;
    }

    public static EGLSurface q(EGLDisplay eGLDisplay, EGLConfig eGLConfig, Surface surface, int[] iArr) {
        EGLSurface eGLSurfaceEglCreateWindowSurface = EGL14.eglCreateWindowSurface(eGLDisplay, eGLConfig, surface, iArr, 0);
        f("eglCreateWindowSurface");
        if (eGLSurfaceEglCreateWindowSurface != null) {
            return eGLSurfaceEglCreateWindowSurface;
        }
        throw new IllegalStateException("surface was null");
    }

    public static void r(int i10) {
        GLES20.glDeleteFramebuffers(1, new int[]{i10}, 0);
        g("glDeleteFramebuffers");
    }

    public static void s(int i10) {
        GLES20.glDeleteTextures(1, new int[]{i10}, 0);
        g("glDeleteTextures");
    }

    public static int t() {
        int[] iArr = new int[1];
        GLES20.glGenFramebuffers(1, iArr, 0);
        g("glGenFramebuffers");
        return iArr[0];
    }

    public static int u() {
        int[] iArr = new int[1];
        GLES20.glGenTextures(1, iArr, 0);
        g("glGenTextures");
        return iArr[0];
    }

    public static String v(A a10) {
        try {
            String strA = a10.a("sTexture", "vTextureCoord");
            if (strA != null && strA.contains("vTextureCoord") && strA.contains("sTexture")) {
                return strA;
            }
            throw new IllegalArgumentException("Invalid fragment shader");
        } catch (Throwable th) {
            if (th instanceof IllegalArgumentException) {
                throw th;
            }
            throw new IllegalArgumentException("Unable retrieve fragment shader source", th);
        }
    }

    public static String w() {
        Matcher matcher = Pattern.compile("OpenGL ES ([0-9]+)\\.([0-9]+).*").matcher(GLES20.glGetString(7938));
        if (!matcher.find()) {
            return "0.0";
        }
        return ((String) h.g(matcher.group(1))) + "." + ((String) h.g(matcher.group(2)));
    }

    public static Size x(EGLDisplay eGLDisplay, EGLSurface eGLSurface) {
        return new Size(z(eGLDisplay, eGLSurface, 12375), z(eGLDisplay, eGLSurface, 12374));
    }

    public static int y(int i10, String str) {
        int iGlCreateShader = GLES20.glCreateShader(i10);
        g("glCreateShader type=" + i10);
        GLES20.glShaderSource(iGlCreateShader, str);
        GLES20.glCompileShader(iGlCreateShader);
        int[] iArr = new int[1];
        GLES20.glGetShaderiv(iGlCreateShader, 35713, iArr, 0);
        if (iArr[0] != 0) {
            return iGlCreateShader;
        }
        AbstractC0807p0.l("GLUtils", "Could not compile shader: " + str);
        String strGlGetShaderInfoLog = GLES20.glGetShaderInfoLog(iGlCreateShader);
        GLES20.glDeleteShader(iGlCreateShader);
        throw new IllegalStateException("Could not compile shader type " + i10 + TikaCoreProperties.NAMESPACE_PREFIX_DELIMITER + strGlGetShaderInfoLog);
    }

    public static int z(EGLDisplay eGLDisplay, EGLSurface eGLSurface, int i10) {
        int[] iArr = new int[1];
        EGL14.eglQuerySurface(eGLDisplay, eGLSurface, i10, iArr, 0);
        return iArr[0];
    }
}
