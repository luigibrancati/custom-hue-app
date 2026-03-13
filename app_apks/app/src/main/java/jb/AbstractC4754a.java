package jb;

import android.content.Context;
import android.util.Log;
import com.google.android.filament.Camera;
import com.google.android.filament.Engine;
import com.google.android.filament.IndexBuffer;
import com.google.android.filament.IndirectLight;
import com.google.android.filament.Material;
import com.google.android.filament.MaterialInstance;
import com.google.android.filament.Renderer;
import com.google.android.filament.Scene;
import com.google.android.filament.Skybox;
import com.google.android.filament.Texture;
import com.google.android.filament.VertexBuffer;
import com.google.android.filament.View;
import com.google.android.filament.gltfio.AssetLoader;
import com.google.android.filament.gltfio.FilamentAsset;
import fc.AbstractC4036s;
import fc.C4015H;
import fc.C4035r;
import kotlin.jvm.internal.AbstractC4862t;
import ub.AbstractC6014a;
import wb.C6183a;
import wb.k;
import wb.l;

/* JADX INFO: renamed from: jb.a, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC4754a {
    public static final C6183a a(Engine engine, Context context) {
        AbstractC4862t.e(engine, "<this>");
        AbstractC4862t.e(context, "context");
        return new C6183a(engine, context, null, 4, null);
    }

    public static final k b(Engine engine, Context context) {
        AbstractC4862t.e(engine, "<this>");
        AbstractC4862t.e(context, "context");
        return new k(engine, context, null, 4, null);
    }

    public static final l c(Engine engine, Context context) {
        AbstractC4862t.e(engine, "<this>");
        AbstractC4862t.e(context, "context");
        return new l(engine, context, null, 4, null);
    }

    public static final void d(Engine engine, int i10) {
        AbstractC4862t.e(engine, "<this>");
        engine.getRenderableManager().destroy(i10);
    }

    public static final void e(Engine engine, int i10) {
        AbstractC4862t.e(engine, "<this>");
        engine.getTransformManager().destroy(i10);
    }

    public static final Object f(Engine engine) {
        AbstractC4862t.e(engine, "<this>");
        try {
            C4035r.a aVar = C4035r.f34274b;
            engine.destroy();
            return C4035r.b(Integer.valueOf(Log.d("Sceneview", "Engine destroyed")));
        } catch (Throwable th) {
            C4035r.a aVar2 = C4035r.f34274b;
            return C4035r.b(AbstractC4036s.a(th));
        }
    }

    public static final Object g(Engine engine, Camera camera) {
        AbstractC4862t.e(engine, "<this>");
        AbstractC4862t.e(camera, "camera");
        try {
            C4035r.a aVar = C4035r.f34274b;
            engine.destroyCameraComponent(camera.getEntity());
            return C4035r.b(C4015H.f34254a);
        } catch (Throwable th) {
            C4035r.a aVar2 = C4035r.f34274b;
            return C4035r.b(AbstractC4036s.a(th));
        }
    }

    public static final Object h(Engine engine, int i10) {
        AbstractC4862t.e(engine, "<this>");
        try {
            C4035r.a aVar = C4035r.f34274b;
            engine.destroyEntity(i10);
            return C4035r.b(C4015H.f34254a);
        } catch (Throwable th) {
            C4035r.a aVar2 = C4035r.f34274b;
            return C4035r.b(AbstractC4036s.a(th));
        }
    }

    public static final void i(Engine engine, AbstractC6014a geometry) {
        AbstractC4862t.e(engine, "<this>");
        AbstractC4862t.e(geometry, "geometry");
        w(engine, geometry.e());
        j(engine, geometry.b());
    }

    public static final Object j(Engine engine, IndexBuffer indexBuffer) {
        AbstractC4862t.e(engine, "<this>");
        AbstractC4862t.e(indexBuffer, "indexBuffer");
        try {
            C4035r.a aVar = C4035r.f34274b;
            engine.destroyIndexBuffer(indexBuffer);
            return C4035r.b(C4015H.f34254a);
        } catch (Throwable th) {
            C4035r.a aVar2 = C4035r.f34274b;
            return C4035r.b(AbstractC4036s.a(th));
        }
    }

    public static final Object k(Engine engine, IndirectLight indirectLight) {
        AbstractC4862t.e(engine, "<this>");
        AbstractC4862t.e(indirectLight, "indirectLight");
        try {
            C4035r.a aVar = C4035r.f34274b;
            engine.destroyIndirectLight(indirectLight);
            return C4035r.b(C4015H.f34254a);
        } catch (Throwable th) {
            C4035r.a aVar2 = C4035r.f34274b;
            return C4035r.b(AbstractC4036s.a(th));
        }
    }

    public static final Object l(Engine engine, Material material) {
        AbstractC4862t.e(engine, "<this>");
        AbstractC4862t.e(material, "material");
        try {
            C4035r.a aVar = C4035r.f34274b;
            engine.destroyMaterial(material);
            return C4035r.b(C4015H.f34254a);
        } catch (Throwable th) {
            C4035r.a aVar2 = C4035r.f34274b;
            return C4035r.b(AbstractC4036s.a(th));
        }
    }

    public static final Object m(Engine engine, MaterialInstance materialInstance) {
        AbstractC4862t.e(engine, "<this>");
        AbstractC4862t.e(materialInstance, "materialInstance");
        try {
            C4035r.a aVar = C4035r.f34274b;
            engine.destroyMaterialInstance(materialInstance);
            return C4035r.b(C4015H.f34254a);
        } catch (Throwable th) {
            C4035r.a aVar2 = C4035r.f34274b;
            return C4035r.b(AbstractC4036s.a(th));
        }
    }

    public static final Object n(Engine engine, k materialLoader) {
        AbstractC4862t.e(engine, "<this>");
        AbstractC4862t.e(materialLoader, "materialLoader");
        try {
            C4035r.a aVar = C4035r.f34274b;
            materialLoader.p();
            return C4035r.b(C4015H.f34254a);
        } catch (Throwable th) {
            C4035r.a aVar2 = C4035r.f34274b;
            return C4035r.b(AbstractC4036s.a(th));
        }
    }

    public static final void o(AssetLoader assetLoader, FilamentAsset model) {
        AbstractC4862t.e(assetLoader, "<this>");
        AbstractC4862t.e(model, "model");
        try {
            C4035r.a aVar = C4035r.f34274b;
            model.releaseSourceData();
            C4035r.b(C4015H.f34254a);
        } catch (Throwable th) {
            C4035r.a aVar2 = C4035r.f34274b;
            C4035r.b(AbstractC4036s.a(th));
        }
        try {
            assetLoader.destroyAsset(model);
            C4035r.b(C4015H.f34254a);
        } catch (Throwable th2) {
            C4035r.a aVar3 = C4035r.f34274b;
            C4035r.b(AbstractC4036s.a(th2));
        }
    }

    public static final Object p(Engine engine, l modelLoader) {
        AbstractC4862t.e(engine, "<this>");
        AbstractC4862t.e(modelLoader, "modelLoader");
        try {
            C4035r.a aVar = C4035r.f34274b;
            modelLoader.b();
            return C4035r.b(C4015H.f34254a);
        } catch (Throwable th) {
            C4035r.a aVar2 = C4035r.f34274b;
            return C4035r.b(AbstractC4036s.a(th));
        }
    }

    public static final Object q(Engine engine, int i10) {
        AbstractC4862t.e(engine, "<this>");
        try {
            C4035r.a aVar = C4035r.f34274b;
            d(engine, i10);
            return C4035r.b(C4015H.f34254a);
        } catch (Throwable th) {
            C4035r.a aVar2 = C4035r.f34274b;
            return C4035r.b(AbstractC4036s.a(th));
        }
    }

    public static final Object r(Engine engine, Renderer renderer) {
        AbstractC4862t.e(engine, "<this>");
        AbstractC4862t.e(renderer, "renderer");
        try {
            C4035r.a aVar = C4035r.f34274b;
            engine.destroyRenderer(renderer);
            return C4035r.b(C4015H.f34254a);
        } catch (Throwable th) {
            C4035r.a aVar2 = C4035r.f34274b;
            return C4035r.b(AbstractC4036s.a(th));
        }
    }

    public static final Object s(Engine engine, Scene scene) {
        AbstractC4862t.e(engine, "<this>");
        AbstractC4862t.e(scene, "scene");
        try {
            C4035r.a aVar = C4035r.f34274b;
            engine.destroyScene(scene);
            return C4035r.b(C4015H.f34254a);
        } catch (Throwable th) {
            C4035r.a aVar2 = C4035r.f34274b;
            return C4035r.b(AbstractC4036s.a(th));
        }
    }

    public static final Object t(Engine engine, Skybox skybox) {
        AbstractC4862t.e(engine, "<this>");
        AbstractC4862t.e(skybox, "skybox");
        try {
            C4035r.a aVar = C4035r.f34274b;
            engine.destroySkybox(skybox);
            return C4035r.b(C4015H.f34254a);
        } catch (Throwable th) {
            C4035r.a aVar2 = C4035r.f34274b;
            return C4035r.b(AbstractC4036s.a(th));
        }
    }

    public static final Object u(Engine engine, Texture texture) {
        AbstractC4862t.e(engine, "<this>");
        AbstractC4862t.e(texture, "texture");
        try {
            C4035r.a aVar = C4035r.f34274b;
            engine.destroyTexture(texture);
            return C4035r.b(C4015H.f34254a);
        } catch (Throwable th) {
            C4035r.a aVar2 = C4035r.f34274b;
            return C4035r.b(AbstractC4036s.a(th));
        }
    }

    public static final Object v(Engine engine, int i10) {
        AbstractC4862t.e(engine, "<this>");
        try {
            C4035r.a aVar = C4035r.f34274b;
            e(engine, i10);
            return C4035r.b(C4015H.f34254a);
        } catch (Throwable th) {
            C4035r.a aVar2 = C4035r.f34274b;
            return C4035r.b(AbstractC4036s.a(th));
        }
    }

    public static final Object w(Engine engine, VertexBuffer vertexBuffer) {
        AbstractC4862t.e(engine, "<this>");
        AbstractC4862t.e(vertexBuffer, "vertexBuffer");
        try {
            C4035r.a aVar = C4035r.f34274b;
            engine.destroyVertexBuffer(vertexBuffer);
            return C4035r.b(C4015H.f34254a);
        } catch (Throwable th) {
            C4035r.a aVar2 = C4035r.f34274b;
            return C4035r.b(AbstractC4036s.a(th));
        }
    }

    public static final Object x(Engine engine, View view) {
        AbstractC4862t.e(engine, "<this>");
        AbstractC4862t.e(view, "view");
        try {
            C4035r.a aVar = C4035r.f34274b;
            engine.destroyView(view);
            return C4035r.b(C4015H.f34254a);
        } catch (Throwable th) {
            C4035r.a aVar2 = C4035r.f34274b;
            return C4035r.b(AbstractC4036s.a(th));
        }
    }
}
