package d4;

import a4.InterfaceC2641a;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import d4.InterfaceC3824g;
import j4.AbstractC4689h;
import kotlin.jvm.internal.AbstractC4862t;
import lc.InterfaceC4988e;

/* JADX INFO: renamed from: d4.d, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public final class C3821d implements InterfaceC3824g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final c4.f f33107a;

    public C3821d(c4.f drawableDecoder) {
        AbstractC4862t.e(drawableDecoder, "drawableDecoder");
        this.f33107a = drawableDecoder;
    }

    @Override // d4.InterfaceC3824g
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public Object c(InterfaceC2641a interfaceC2641a, Drawable drawable, AbstractC4689h abstractC4689h, c4.i iVar, InterfaceC4988e interfaceC4988e) {
        boolean zK = n4.e.k(drawable);
        if (zK) {
            Bitmap bitmapA = this.f33107a.a(drawable, iVar.d(), abstractC4689h, iVar.j(), iVar.a());
            Resources resources = iVar.e().getResources();
            AbstractC4862t.d(resources, "context.resources");
            drawable = new BitmapDrawable(resources, bitmapA);
        }
        return new C3822e(drawable, zK, c4.b.MEMORY);
    }

    @Override // d4.InterfaceC3824g
    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
    public boolean a(Drawable drawable) {
        return InterfaceC3824g.a.a(this, drawable);
    }

    @Override // d4.InterfaceC3824g
    /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
    public String b(Drawable data) {
        AbstractC4862t.e(data, "data");
        return null;
    }
}
