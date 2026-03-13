package Bb;

import android.content.res.AssetManager;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import com.google.android.filament.Engine;
import com.google.android.filament.Texture;
import com.google.android.filament.utils.TextureType;
import fc.C4015H;
import fc.C4032o;
import java.io.IOException;
import java.nio.ByteBuffer;
import kotlin.jvm.internal.AbstractC4854k;
import kotlin.jvm.internal.AbstractC4862t;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final b f783a = new b(null);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final TextureType f784b = TextureType.COLOR;

    /* JADX INFO: renamed from: Bb.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class C0021a extends Texture.Builder {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public Bitmap f785a;

        /* JADX INFO: renamed from: Bb.a$a$a, reason: collision with other inner class name */
        /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
        public static final /* synthetic */ class C0022a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final /* synthetic */ int[] f786a;

            static {
                int[] iArr = new int[TextureType.values().length];
                try {
                    iArr[TextureType.COLOR.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[TextureType.NORMAL.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[TextureType.DATA.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                f786a = iArr;
            }
        }

        public C0021a() {
            sampler(Texture.Sampler.SAMPLER_2D);
            usage(536);
            levels(255);
        }

        public static /* synthetic */ C0021a c(C0021a c0021a, AssetManager assetManager, String str, TextureType textureType, int i10, Object obj) {
            if ((i10 & 4) != 0) {
                textureType = a.f783a.b();
            }
            return c0021a.a(assetManager, str, textureType);
        }

        public final C0021a a(AssetManager assets, String fileLocation, TextureType type) {
            AbstractC4862t.e(assets, "assets");
            AbstractC4862t.e(fileLocation, "fileLocation");
            AbstractC4862t.e(type, "type");
            return b(a.f783a.a(assets, fileLocation, type), type);
        }

        public final C0021a b(Bitmap bitmap, TextureType type) {
            AbstractC4862t.e(bitmap, "bitmap");
            AbstractC4862t.e(type, "type");
            width(bitmap.getWidth());
            height(bitmap.getHeight());
            d(type);
            this.f785a = bitmap;
            return this;
        }

        @Override // com.google.android.filament.Texture.Builder
        public Texture build(Engine engine) {
            AbstractC4862t.e(engine, "engine");
            Texture textureBuild = super.build(engine);
            AbstractC4862t.d(textureBuild, "build(...)");
            Bitmap bitmap = this.f785a;
            if (bitmap == null) {
                AbstractC4862t.p("bitmap");
                bitmap = null;
            }
            Bb.b.b(textureBuild, engine, bitmap, 0, 4, null);
            textureBuild.generateMipmaps(engine);
            return textureBuild;
        }

        public final C0021a d(TextureType type) {
            Texture.InternalFormat internalFormat;
            AbstractC4862t.e(type, "type");
            int i10 = C0022a.f786a[type.ordinal()];
            if (i10 == 1) {
                internalFormat = Texture.InternalFormat.SRGB8_A8;
            } else {
                if (i10 != 2 && i10 != 3) {
                    throw new C4032o();
                }
                internalFormat = Texture.InternalFormat.RGBA8;
            }
            format(internalFormat);
            return this;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class b {
        public /* synthetic */ b(AbstractC4854k abstractC4854k) {
            this();
        }

        public final Bitmap a(AssetManager assets, String fileLocation, TextureType type) throws IOException {
            AbstractC4862t.e(assets, "assets");
            AbstractC4862t.e(fileLocation, "fileLocation");
            AbstractC4862t.e(type, "type");
            ByteBuffer byteBufferB = Cb.c.b(assets, fileLocation);
            byte[] bArrArray = byteBufferB.array();
            int iCapacity = byteBufferB.capacity();
            BitmapFactory.Options options = new BitmapFactory.Options();
            options.inPremultiplied = type == TextureType.COLOR;
            C4015H c4015h = C4015H.f34254a;
            Bitmap bitmapDecodeByteArray = BitmapFactory.decodeByteArray(bArrArray, 0, iCapacity, options);
            AbstractC4862t.d(bitmapDecodeByteArray, "decodeByteArray(...)");
            return bitmapDecodeByteArray;
        }

        public final TextureType b() {
            return a.f784b;
        }

        public b() {
        }
    }
}
