package com.google.ar.sceneform.rendering;

import android.content.Context;
import android.net.Uri;
import java.net.URI;
import java.nio.ByteBuffer;
import java.util.concurrent.Callable;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.CompletionException;
import java.util.function.Function;
import java.util.function.Supplier;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public class h {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final String f31288c = "h";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final m f31289a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final r f31290b;

    public h(m mVar, Context context, final Uri uri, final Function function) {
        this.f31289a = mVar;
        d dVarI = mVar.i();
        if (!(dVarI instanceof r)) {
            throw new IllegalStateException("Expected task type " + f31288c);
        }
        r rVar = (r) dVarI;
        this.f31290b = rVar;
        rVar.f31362d = new Function() { // from class: com.google.ar.sceneform.rendering.e
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return h.e(uri, (String) obj, function);
            }
        };
        rVar.f31359a = context.getApplicationContext();
        mVar.e().d();
    }

    public static /* synthetic */ byte[] a(Callable callable) {
        try {
            return G7.h.b(callable);
        } catch (Exception e10) {
            throw new CompletionException(e10);
        }
    }

    public static Uri e(Uri uri, String str, Function function) {
        if (function != null) {
            return (Uri) function.apply(str);
        }
        if (str.startsWith("/")) {
            str = str.substring(1);
        }
        Uri uri2 = Uri.parse(Uri.decode(str));
        if (uri2.getScheme() != null) {
            throw new AssertionError(String.format("Resource path contains a scheme but should be relative, uri: (%s)", uri2));
        }
        return Uri.parse(Uri.decode(URI.create(Uri.parse(Uri.decode(uri.toString())).buildUpon().appendPath("..").appendPath((String) rb.k.c(uri2.getPath())).build().toString()).normalize().toString()));
    }

    public CompletableFuture d(final Callable callable) {
        return CompletableFuture.supplyAsync(new Supplier() { // from class: com.google.ar.sceneform.rendering.f
            @Override // java.util.function.Supplier
            public final Object get() {
                return h.a(callable);
            }
        }, t.b()).thenApplyAsync(new Function() { // from class: com.google.ar.sceneform.rendering.g
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return this.f31287a.f((byte[]) obj);
            }
        }, t.a());
    }

    public final /* synthetic */ m f(byte[] bArr) {
        r rVar = this.f31290b;
        boolean z10 = false;
        if (bArr[0] == 103 && bArr[1] == 108 && bArr[2] == 84 && bArr[3] == 70) {
            z10 = true;
        }
        rVar.f31361c = z10;
        rVar.f31360b = ByteBuffer.wrap(bArr);
        return this.f31289a;
    }
}
