package com.google.ar.sceneform.rendering;

import android.util.Log;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.CompletionException;
import java.util.function.Function;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public abstract class c {
    public static /* synthetic */ Object a(String str, String str2, Throwable th) {
        Log.e(str, str2, th);
        throw new CompletionException(th);
    }

    public static CompletableFuture b(final String str, CompletableFuture completableFuture, final String str2) {
        completableFuture.exceptionally(new Function() { // from class: com.google.ar.sceneform.rendering.b
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return c.a(str, str2, (Throwable) obj);
            }
        });
        return completableFuture;
    }
}
