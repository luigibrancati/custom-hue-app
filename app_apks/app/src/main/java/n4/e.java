package n4;

import Od.F;
import android.content.res.Configuration;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.VectorDrawable;
import android.net.Uri;
import android.os.Looper;
import android.view.View;
import android.webkit.MimeTypeMap;
import android.widget.ImageView;
import com.fasterxml.jackson.core.JsonPointer;
import fc.C4029l;
import fc.InterfaceC4028k;
import g4.w;
import gc.C4179C;
import i4.j;
import j4.EnumC4688g;
import java.io.Closeable;
import java.util.List;
import k4.InterfaceC4797c;
import k4.InterfaceC4798d;
import kotlin.jvm.internal.AbstractC4862t;
import pe.C5464A;
import pe.InterfaceC5469e;
import pe.u;
import u3.AbstractC5912b;
import vc.InterfaceC6082a;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public abstract class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final u f40553a = new u.a().d();

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f40554a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ int[] f40555b;

        static {
            int[] iArr = new int[c4.b.values().length];
            iArr[c4.b.MEMORY_CACHE.ordinal()] = 1;
            iArr[c4.b.MEMORY.ordinal()] = 2;
            iArr[c4.b.DISK.ordinal()] = 3;
            iArr[c4.b.NETWORK.ordinal()] = 4;
            f40554a = iArr;
            int[] iArr2 = new int[ImageView.ScaleType.values().length];
            iArr2[ImageView.ScaleType.FIT_START.ordinal()] = 1;
            iArr2[ImageView.ScaleType.FIT_CENTER.ordinal()] = 2;
            iArr2[ImageView.ScaleType.FIT_END.ordinal()] = 3;
            iArr2[ImageView.ScaleType.CENTER_INSIDE.ordinal()] = 4;
            f40555b = iArr2;
        }
    }

    public static final void b(Closeable closeable) {
        AbstractC4862t.e(closeable, "<this>");
        try {
            closeable.close();
        } catch (RuntimeException e10) {
            throw e10;
        } catch (Exception unused) {
        }
    }

    public static final String c(Uri uri) {
        AbstractC4862t.e(uri, "<this>");
        List<String> pathSegments = uri.getPathSegments();
        AbstractC4862t.d(pathSegments, "pathSegments");
        return (String) C4179C.j0(pathSegments);
    }

    public static final int d(Drawable drawable) {
        Bitmap bitmap;
        AbstractC4862t.e(drawable, "<this>");
        Integer numValueOf = null;
        BitmapDrawable bitmapDrawable = drawable instanceof BitmapDrawable ? (BitmapDrawable) drawable : null;
        if (bitmapDrawable != null && (bitmap = bitmapDrawable.getBitmap()) != null) {
            numValueOf = Integer.valueOf(bitmap.getHeight());
        }
        return numValueOf == null ? drawable.getIntrinsicHeight() : numValueOf.intValue();
    }

    public static final String e(MimeTypeMap mimeTypeMap, String str) {
        AbstractC4862t.e(mimeTypeMap, "<this>");
        if (str == null || F.k0(str)) {
            return null;
        }
        return mimeTypeMap.getMimeTypeFromExtension(F.S0(F.U0(F.b1(F.b1(str, '#', null, 2, null), '?', null, 2, null), JsonPointer.SEPARATOR, null, 2, null), '.', ""));
    }

    public static final int f(Configuration configuration) {
        AbstractC4862t.e(configuration, "<this>");
        return configuration.uiMode & 48;
    }

    public static final w g(View view) {
        w wVar;
        AbstractC4862t.e(view, "<this>");
        Object tag = view.getTag(Z3.a.f20230a);
        w wVar2 = tag instanceof w ? (w) tag : null;
        if (wVar2 != null) {
            return wVar2;
        }
        synchronized (view) {
            try {
                Object tag2 = view.getTag(Z3.a.f20230a);
                wVar = tag2 instanceof w ? (w) tag2 : null;
                if (wVar == null) {
                    wVar = new w();
                    view.addOnAttachStateChangeListener(wVar);
                    view.setTag(Z3.a.f20230a, wVar);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return wVar;
    }

    public static final EnumC4688g h(ImageView imageView) {
        AbstractC4862t.e(imageView, "<this>");
        ImageView.ScaleType scaleType = imageView.getScaleType();
        int i10 = scaleType == null ? -1 : a.f40555b[scaleType.ordinal()];
        return (i10 == 1 || i10 == 2 || i10 == 3 || i10 == 4) ? EnumC4688g.FIT : EnumC4688g.FILL;
    }

    public static final int i(Drawable drawable) {
        Bitmap bitmap;
        AbstractC4862t.e(drawable, "<this>");
        Integer numValueOf = null;
        BitmapDrawable bitmapDrawable = drawable instanceof BitmapDrawable ? (BitmapDrawable) drawable : null;
        if (bitmapDrawable != null && (bitmap = bitmapDrawable.getBitmap()) != null) {
            numValueOf = Integer.valueOf(bitmap.getWidth());
        }
        return numValueOf == null ? drawable.getIntrinsicWidth() : numValueOf.intValue();
    }

    public static final boolean j() {
        return AbstractC4862t.a(Looper.myLooper(), Looper.getMainLooper());
    }

    public static final boolean k(Drawable drawable) {
        AbstractC4862t.e(drawable, "<this>");
        return (drawable instanceof AbstractC5912b) || (drawable instanceof VectorDrawable);
    }

    public static final InterfaceC5469e.a l(InterfaceC6082a initializer) {
        AbstractC4862t.e(initializer, "initializer");
        final InterfaceC4028k interfaceC4028kB = C4029l.b(initializer);
        return new InterfaceC5469e.a() { // from class: n4.d
            @Override // pe.InterfaceC5469e.a
            public final InterfaceC5469e a(C5464A c5464a) {
                return e.m(interfaceC4028kB, c5464a);
            }
        };
    }

    public static final InterfaceC5469e m(InterfaceC4028k lazy, C5464A c5464a) {
        AbstractC4862t.e(lazy, "$lazy");
        return ((InterfaceC5469e.a) lazy.getValue()).a(c5464a);
    }

    public static final i4.m n(i4.m mVar) {
        return mVar == null ? i4.m.f37185c : mVar;
    }

    public static final u o(u uVar) {
        return uVar == null ? f40553a : uVar;
    }

    public static final void p(g4.u uVar, j.a aVar) {
        AbstractC4862t.e(uVar, "<this>");
        InterfaceC4797c interfaceC4797cD = uVar.d();
        InterfaceC4798d interfaceC4798d = interfaceC4797cD instanceof InterfaceC4798d ? (InterfaceC4798d) interfaceC4797cD : null;
        View view = interfaceC4798d != null ? interfaceC4798d.getView() : null;
        if (view == null) {
            return;
        }
        g(view).e(aVar);
    }
}
