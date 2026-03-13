package com.hiennv.flutter_callkit_incoming;

import Y3.d;
import android.annotation.SuppressLint;
import android.content.Context;
import android.widget.ImageView;
import com.hiennv.flutter_callkit_incoming.widgets.CircleTransform;
import i4.i;
import java.util.HashMap;
import java.util.Map;
import k4.InterfaceC4797c;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC4862t;
import pe.C;
import pe.C5464A;
import pe.w;
import pe.y;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003JA\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u00042*\u0010\t\u001a&\u0012\u0004\u0012\u00020\u0007\u0012\u0006\u0012\u0004\u0018\u00010\u0001\u0018\u00010\u0006j\u0012\u0012\u0004\u0012\u00020\u0007\u0012\u0006\u0012\u0004\u0018\u00010\u0001\u0018\u0001`\b¢\u0006\u0004\b\u000b\u0010\fJS\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\r\u001a\u00020\u00072*\u0010\t\u001a&\u0012\u0004\u0012\u00020\u0007\u0012\u0006\u0012\u0004\u0018\u00010\u0001\u0018\u00010\u0006j\u0012\u0012\u0004\u0012\u00020\u0007\u0012\u0006\u0012\u0004\u0018\u00010\u0001\u0018\u0001`\b2\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e¢\u0006\u0004\b\u0011\u0010\u0012JY\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\r\u001a\u00020\u00072*\u0010\t\u001a&\u0012\u0004\u0012\u00020\u0007\u0012\u0006\u0012\u0004\u0018\u00010\u0001\u0018\u00010\u0006j\u0012\u0012\u0004\u0012\u00020\u0007\u0012\u0006\u0012\u0004\u0018\u00010\u0001\u0018\u0001`\b2\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u000f\u001a\u00020\u0015¢\u0006\u0004\b\u0011\u0010\u0016R\u0018\u0010\u0017\u001a\u0004\u0018\u00010\n8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018¨\u0006\u0019"}, d2 = {"Lcom/hiennv/flutter_callkit_incoming/ImageLoaderProvider;", "", "<init>", "()V", "Landroid/content/Context;", "context", "Ljava/util/HashMap;", "", "Lkotlin/collections/HashMap;", "headers", "LY3/d;", "get", "(Landroid/content/Context;Ljava/util/HashMap;)LY3/d;", "url", "Lk4/c;", "target", "Lfc/H;", "loadImage", "(Landroid/content/Context;Ljava/lang/String;Ljava/util/HashMap;Lk4/c;)V", "", "placeholder", "Landroid/widget/ImageView;", "(Landroid/content/Context;Ljava/lang/String;Ljava/util/HashMap;ILandroid/widget/ImageView;)V", "instance", "LY3/d;", "flutter_callkit_incoming_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class ImageLoaderProvider {
    public static final ImageLoaderProvider INSTANCE = new ImageLoaderProvider();

    @SuppressLint({"StaticFieldLeak"})
    private static Y3.d instance;

    private ImageLoaderProvider() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C get$lambda$0(HashMap map, w.a aVar) {
        C5464A.a aVarJ = aVar.d().j();
        AbstractC4862t.d(aVarJ, "newBuilder(...)");
        if (map != null) {
            for (Map.Entry entry : map.entrySet()) {
                aVarJ.a((String) entry.getKey(), String.valueOf(entry.getValue()));
            }
        }
        return aVar.a(aVarJ.b());
    }

    public final Y3.d get(Context context, final HashMap<String, Object> headers) {
        AbstractC4862t.e(context, "context");
        if (instance == null) {
            d.a aVar = new d.a(context);
            y yVarB = new y.a().d(true).e(true).a(new w() { // from class: com.hiennv.flutter_callkit_incoming.p
                @Override // pe.w
                public final C a(w.a aVar2) {
                    return ImageLoaderProvider.get$lambda$0(headers, aVar2);
                }
            }).b();
            AbstractC4862t.b(yVarB);
            instance = aVar.f(yVarB).b();
        }
        Y3.d dVar = instance;
        AbstractC4862t.b(dVar);
        return dVar;
    }

    public final void loadImage(Context context, String url, HashMap<String, Object> headers, InterfaceC4797c target) {
        String string;
        AbstractC4862t.e(context, "context");
        AbstractC4862t.e(url, "url");
        Y3.d dVar = get(context, headers);
        i.a aVar = new i.a(context);
        if (headers != null) {
            for (Map.Entry<String, Object> entry : headers.entrySet()) {
                String key = entry.getKey();
                Object value = entry.getValue();
                if (value != null && (string = value.toString()) != null) {
                    aVar.a(key, string);
                }
            }
        }
        aVar.d(url);
        aVar.b(false);
        aVar.p(new CircleTransform());
        aVar.n(target);
        dVar.a(aVar.c());
    }

    public final void loadImage(Context context, String url, HashMap<String, Object> headers, int placeholder, ImageView target) {
        String string;
        AbstractC4862t.e(context, "context");
        AbstractC4862t.e(url, "url");
        AbstractC4862t.e(target, "target");
        Y3.d dVar = get(context, headers);
        i.a aVar = new i.a(context);
        if (headers != null) {
            for (Map.Entry<String, Object> entry : headers.entrySet()) {
                String key = entry.getKey();
                Object value = entry.getValue();
                if (value != null && (string = value.toString()) != null) {
                    aVar.a(key, string);
                }
            }
        }
        aVar.d(url);
        aVar.b(false);
        aVar.g(placeholder);
        aVar.f(placeholder);
        aVar.m(target);
        dVar.a(aVar.c());
    }
}
