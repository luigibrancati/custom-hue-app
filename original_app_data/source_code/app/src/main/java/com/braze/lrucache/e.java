package com.braze.lrucache;

import java.io.Closeable;
import java.io.InputStream;
import java.nio.charset.Charset;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public final class e implements Closeable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final InputStream[] f27802a;

    public e(InputStream[] inputStreamArr) {
        this.f27802a = inputStreamArr;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        for (InputStream inputStream : this.f27802a) {
            Charset charset = j.f27832a;
            if (inputStream != null) {
                try {
                    inputStream.close();
                } catch (RuntimeException e10) {
                    throw e10;
                } catch (Exception unused) {
                }
            }
        }
    }
}
