package nb;

import Cb.c;
import Cb.d;
import android.media.Image;
import android.util.Log;
import com.google.android.filament.Engine;
import com.google.android.filament.EntityManager;
import com.google.android.filament.IndexBuffer;
import com.google.android.filament.Material;
import com.google.android.filament.MaterialInstance;
import com.google.android.filament.RenderableManager;
import com.google.android.filament.Texture;
import com.google.android.filament.VertexBuffer;
import com.google.ar.core.Config;
import com.google.ar.core.Coordinates2d;
import com.google.ar.core.Frame;
import com.google.ar.core.Session;
import fc.AbstractC4036s;
import fc.C4015H;
import fc.C4035r;
import gc.P;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.FloatBuffer;
import java.nio.ShortBuffer;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import jb.AbstractC4754a;
import kotlin.jvm.internal.AbstractC4854k;
import kotlin.jvm.internal.AbstractC4862t;
import sb.InterfaceC5819d;
import wb.k;
import xb.AbstractC6356b;
import yb.AbstractC6458a;
import zb.AbstractC6555a;

/* JADX INFO: renamed from: nb.b, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public class C5156b implements InterfaceC5819d {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final a f40747n = new a(null);

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final int f40748o = 8;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final float[] f40749p = {-1.0f, 1.0f, 1.0f, -1.0f, -3.0f, 1.0f, 3.0f, 1.0f, 1.0f};

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final float[] f40750q = {0.0f, 0.0f, 0.0f, 2.0f, 2.0f, 0.0f};

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final short[] f40751r = {0, 1, 2};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final k f40752a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Engine f40753b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f40754c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int[] f40755d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Map f40756e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public Texture f40757f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Texture f40758g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final Material f40759h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public Material f40760i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public boolean f40761j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final VertexBuffer f40762k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final FloatBuffer f40763l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public FloatBuffer f40764m;

    /* JADX INFO: renamed from: nb.b$a */
    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class a {
        public /* synthetic */ a(AbstractC4854k abstractC4854k) {
            this();
        }

        public a() {
        }
    }

    /* JADX INFO: renamed from: nb.b$b, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final /* synthetic */ class C0538b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f40765a;

        static {
            int[] iArr = new int[Config.DepthMode.values().length];
            try {
                iArr[Config.DepthMode.AUTOMATIC.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[Config.DepthMode.RAW_DEPTH_ONLY.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f40765a = iArr;
        }
    }

    public C5156b(k materialLoader, String standardMaterialFile, String depthOcclusionMaterialFile) {
        AbstractC4862t.e(materialLoader, "materialLoader");
        AbstractC4862t.e(standardMaterialFile, "standardMaterialFile");
        AbstractC4862t.e(depthOcclusionMaterialFile, "depthOcclusionMaterialFile");
        this.f40752a = materialLoader;
        this.f40753b = materialLoader.t();
        this.f40754c = EntityManager.get().create();
        int[] iArr = new int[6];
        for (int i10 = 0; i10 < 6; i10++) {
            iArr[i10] = d.f1235a.c();
        }
        this.f40755d = iArr;
        LinkedHashMap linkedHashMap = new LinkedHashMap(Bc.k.e(P.e(iArr.length), 16));
        for (int i11 : iArr) {
            linkedHashMap.put(Integer.valueOf(i11), new Texture.Builder().sampler(Texture.Sampler.SAMPLER_EXTERNAL).usage(536).format(Texture.InternalFormat.RGB16F).importTexture(i11).build(this.f40753b));
        }
        this.f40756e = linkedHashMap;
        Object obj = linkedHashMap.get(Integer.valueOf(this.f40755d[0]));
        AbstractC4862t.b(obj);
        this.f40757f = (Texture) obj;
        Texture textureBuild = new Texture.Builder().sampler(Texture.Sampler.SAMPLER_2D).usage(536).format(Texture.InternalFormat.RG8).levels(1).build(this.f40753b);
        AbstractC4862t.d(textureBuild, "build(...)");
        this.f40758g = textureBuild;
        Material materialN = this.f40752a.n(standardMaterialFile);
        MaterialInstance defaultInstance = materialN.getDefaultInstance();
        AbstractC4862t.b(defaultInstance);
        AbstractC6458a.g(defaultInstance, "uvTransform", AbstractC6555a.c(null, null, null, 7, null));
        AbstractC6458a.d(defaultInstance, "cameraTexture", this.f40757f);
        this.f40759h = materialN;
        Material materialN2 = this.f40752a.n(depthOcclusionMaterialFile);
        MaterialInstance defaultInstance2 = materialN2.getDefaultInstance();
        AbstractC4862t.b(defaultInstance2);
        AbstractC6458a.g(defaultInstance2, "uvTransform", AbstractC6555a.c(null, null, null, 7, null));
        AbstractC6458a.d(defaultInstance2, "cameraTexture", this.f40757f);
        AbstractC6458a.k(defaultInstance2, "depthTexture", textureBuild, null, 4, null);
        this.f40760i = materialN2;
        VertexBuffer.Builder builderBufferCount = new VertexBuffer.Builder().vertexCount(3).bufferCount(2);
        VertexBuffer.VertexAttribute vertexAttribute = VertexBuffer.VertexAttribute.POSITION;
        VertexBuffer.AttributeType attributeType = VertexBuffer.AttributeType.FLOAT3;
        float[] fArr = f40749p;
        VertexBuffer.Builder builderAttribute = builderBufferCount.attribute(vertexAttribute, 0, attributeType, 0, (fArr.length / 3) * 4);
        VertexBuffer.VertexAttribute vertexAttribute2 = VertexBuffer.VertexAttribute.UV0;
        VertexBuffer.AttributeType attributeType2 = VertexBuffer.AttributeType.FLOAT2;
        float[] fArr2 = f40750q;
        VertexBuffer vertexBufferBuild = builderAttribute.attribute(vertexAttribute2, 1, attributeType2, 0, (fArr2.length / 3) * 4).build(this.f40753b);
        AbstractC4862t.d(vertexBufferBuild, "build(...)");
        vertexBufferBuild.setBufferAt(this.f40753b, 0, FloatBuffer.wrap(fArr));
        this.f40762k = vertexBufferBuild;
        FloatBuffer floatBufferAsFloatBuffer = ByteBuffer.allocateDirect(fArr2.length * 4).order(ByteOrder.nativeOrder()).asFloatBuffer();
        floatBufferAsFloatBuffer.put(fArr2);
        floatBufferAsFloatBuffer.rewind();
        AbstractC4862t.d(floatBufferAsFloatBuffer, "apply(...)");
        this.f40763l = floatBufferAsFloatBuffer;
        RenderableManager.Builder builderPriority = new RenderableManager.Builder(4).castShadows(false).receiveShadows(false).culling(false).priority(7);
        RenderableManager.PrimitiveType primitiveType = RenderableManager.PrimitiveType.TRIANGLES;
        IndexBuffer.Builder builder = new IndexBuffer.Builder();
        short[] sArr = f40751r;
        IndexBuffer indexBufferBuild = builder.indexCount(sArr.length).bufferType(IndexBuffer.Builder.IndexType.USHORT).build(this.f40753b);
        indexBufferBuild.setBuffer(this.f40753b, ShortBuffer.wrap(sArr));
        C4015H c4015h = C4015H.f34254a;
        builderPriority.geometry(0, primitiveType, vertexBufferBuild, indexBufferBuild).material(0, materialN.getDefaultInstance()).build(this.f40753b, this.f40754c);
    }

    public static final void f(Image image, ByteBuffer byteBuffer) {
        image.close();
        byteBuffer.clear();
    }

    @Override // sb.InterfaceC5819d
    public /* bridge */ MaterialInstance B() {
        return super.B();
    }

    public final void b() {
        AbstractC6356b.b(v(), this.f40754c);
        k kVar = this.f40752a;
        MaterialInstance defaultInstance = this.f40759h.getDefaultInstance();
        AbstractC4862t.d(defaultInstance, "getDefaultInstance(...)");
        kVar.r(defaultInstance);
        this.f40752a.q(this.f40759h);
        k kVar2 = this.f40752a;
        MaterialInstance defaultInstance2 = this.f40760i.getDefaultInstance();
        AbstractC4862t.d(defaultInstance2, "getDefaultInstance(...)");
        kVar2.r(defaultInstance2);
        this.f40752a.q(this.f40760i);
        AbstractC4754a.w(this.f40753b, this.f40762k);
        Iterator it = this.f40756e.values().iterator();
        while (it.hasNext()) {
            AbstractC4754a.u(this.f40753b, (Texture) it.next());
        }
        AbstractC4754a.u(this.f40753b, this.f40758g);
        this.f40763l.clear();
        FloatBuffer floatBuffer = this.f40764m;
        if (floatBuffer != null) {
            floatBuffer.clear();
        }
        Log.d("Sceneview", "CameraStream destroyed");
    }

    public final int[] c() {
        return this.f40755d;
    }

    public final void d(Texture value) {
        AbstractC4862t.e(value, "value");
        if (AbstractC4862t.a(this.f40757f, value)) {
            return;
        }
        this.f40757f = value;
        AbstractC6458a.d(B(), "cameraTexture", value);
    }

    public final void e(Session session, Frame frame) {
        Object objB;
        Object objB2;
        AbstractC4862t.e(session, "session");
        AbstractC4862t.e(frame, "frame");
        Texture texture = (Texture) this.f40756e.get(Integer.valueOf(frame.getCameraTextureName()));
        if (texture != null) {
            d(texture);
        }
        if (this.f40764m == null || frame.hasDisplayGeometryChanged()) {
            FloatBuffer floatBufferA = this.f40764m;
            if (floatBufferA == null) {
                floatBufferA = c.a(this.f40763l);
                this.f40764m = floatBufferA;
            }
            frame.transformCoordinates2d(Coordinates2d.VIEW_NORMALIZED, this.f40763l, Coordinates2d.TEXTURE_NORMALIZED, floatBufferA);
            Bc.d dVarN = Bc.k.n(Bc.k.p(1, 6), 2);
            int iC = dVarN.c();
            int iD = dVarN.d();
            int iE = dVarN.e();
            if ((iE > 0 && iC <= iD) || (iE < 0 && iD <= iC)) {
                while (true) {
                    floatBufferA.put(iC, 1.0f - floatBufferA.get(iC));
                    if (iC == iD) {
                        break;
                    } else {
                        iC += iE;
                    }
                }
            }
            this.f40762k.setBufferAt(this.f40753b, 1, floatBufferA);
        }
        if (this.f40761j) {
            int i10 = C0538b.f40765a[session.getConfig().getDepthMode().ordinal()];
            final Image image = null;
            if (i10 == 1) {
                try {
                    C4035r.a aVar = C4035r.f34274b;
                    objB = C4035r.b(frame.acquireDepthImage16Bits());
                } catch (Throwable th) {
                    C4035r.a aVar2 = C4035r.f34274b;
                    objB = C4035r.b(AbstractC4036s.a(th));
                }
                image = (Image) (C4035r.g(objB) ? null : objB);
            } else if (i10 == 2) {
                try {
                    C4035r.a aVar3 = C4035r.f34274b;
                    objB2 = C4035r.b(frame.acquireRawDepthImage16Bits());
                } catch (Throwable th2) {
                    C4035r.a aVar4 = C4035r.f34274b;
                    objB2 = C4035r.b(AbstractC4036s.a(th2));
                }
                image = (Image) (C4035r.g(objB2) ? null : objB2);
            }
            if (image != null) {
                final ByteBuffer buffer = image.getPlanes()[0].getBuffer();
                this.f40758g.setImage(this.f40753b, 0, new Texture.PixelBufferDescriptor(buffer, Texture.Format.RG, Texture.Type.UBYTE, 1, 0, 0, 0, null, new Runnable() { // from class: nb.a
                    @Override // java.lang.Runnable
                    public final void run() {
                        C5156b.f(image, buffer);
                    }
                }));
            }
        }
    }

    @Override // sb.InterfaceC5817b
    public final int getEntity() {
        return this.f40754c;
    }

    @Override // sb.InterfaceC5819d
    public /* bridge */ int m() {
        return super.m();
    }

    @Override // sb.InterfaceC5819d
    public /* bridge */ void n(int i10, int i11) {
        super.n(i10, i11);
    }

    @Override // sb.InterfaceC5819d
    public /* bridge */ MaterialInstance t(int i10) {
        return super.t(i10);
    }

    @Override // sb.InterfaceC5819d
    public /* bridge */ RenderableManager v() {
        return super.v();
    }

    @Override // sb.InterfaceC5817b
    public final Engine x() {
        return this.f40753b;
    }

    public /* synthetic */ C5156b(k kVar, String str, String str2, int i10, AbstractC4854k abstractC4854k) {
        this(kVar, (i10 & 2) != 0 ? "materials/camera_stream_flat.filamat" : str, (i10 & 4) != 0 ? "materials/camera_stream_depth.filamat" : str2);
    }
}
