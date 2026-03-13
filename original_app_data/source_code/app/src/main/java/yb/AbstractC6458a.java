package yb;

import Bb.c;
import Bb.d;
import cb.C3092c;
import cb.C3093d;
import com.google.android.filament.Colors;
import com.google.android.filament.MaterialInstance;
import com.google.android.filament.Texture;
import com.google.android.filament.TextureSampler;
import kotlin.jvm.internal.AbstractC4862t;
import zb.AbstractC6555a;

/* JADX INFO: renamed from: yb.a, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC6458a {
    public static final void a(MaterialInstance materialInstance, C3092c color, Colors.RgbaType type) {
        AbstractC4862t.e(materialInstance, "<this>");
        AbstractC4862t.e(color, "color");
        AbstractC4862t.e(type, "type");
        b(materialInstance, "color", color, type);
    }

    public static final void b(MaterialInstance materialInstance, String name, C3092c color, Colors.RgbaType type) {
        AbstractC4862t.e(materialInstance, "<this>");
        AbstractC4862t.e(name, "name");
        AbstractC4862t.e(color, "color");
        AbstractC4862t.e(type, "type");
        materialInstance.setParameter(name, type, color.b(), color.c(), color.d(), color.a());
    }

    public static /* synthetic */ void c(MaterialInstance materialInstance, C3092c c3092c, Colors.RgbaType rgbaType, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            rgbaType = Colors.RgbaType.SRGB;
        }
        a(materialInstance, c3092c, rgbaType);
    }

    public static final void d(MaterialInstance materialInstance, String name, Texture texture) {
        AbstractC4862t.e(materialInstance, "<this>");
        AbstractC4862t.e(name, "name");
        AbstractC4862t.e(texture, "texture");
        materialInstance.setParameter(name, texture, new d());
    }

    public static final void e(MaterialInstance materialInstance, float f10) {
        AbstractC4862t.e(materialInstance, "<this>");
        materialInstance.setParameter("metallic", f10);
    }

    public static final void f(MaterialInstance materialInstance, String name, C3092c value) {
        AbstractC4862t.e(materialInstance, "<this>");
        AbstractC4862t.e(name, "name");
        AbstractC4862t.e(value, "value");
        materialInstance.setParameter(name, value.b(), value.c(), value.d(), value.a());
    }

    public static final void g(MaterialInstance materialInstance, String name, C3093d value) {
        AbstractC4862t.e(materialInstance, "<this>");
        AbstractC4862t.e(name, "name");
        AbstractC4862t.e(value, "value");
        materialInstance.setParameter(name, MaterialInstance.FloatElement.FLOAT4, AbstractC6555a.r(value), 0, 4);
    }

    public static final void h(MaterialInstance materialInstance, float f10) {
        AbstractC4862t.e(materialInstance, "<this>");
        materialInstance.setParameter("reflectance", f10);
    }

    public static final void i(MaterialInstance materialInstance, float f10) {
        AbstractC4862t.e(materialInstance, "<this>");
        materialInstance.setParameter("roughness", f10);
    }

    public static final void j(MaterialInstance materialInstance, String name, Texture texture, TextureSampler sampler) {
        AbstractC4862t.e(materialInstance, "<this>");
        AbstractC4862t.e(name, "name");
        AbstractC4862t.e(texture, "texture");
        AbstractC4862t.e(sampler, "sampler");
        materialInstance.setParameter(name, texture, sampler);
    }

    public static /* synthetic */ void k(MaterialInstance materialInstance, String str, Texture texture, TextureSampler textureSampler, int i10, Object obj) {
        if ((i10 & 4) != 0) {
            textureSampler = new c();
        }
        j(materialInstance, str, texture, textureSampler);
    }
}
