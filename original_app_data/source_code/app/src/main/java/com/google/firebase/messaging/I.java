package com.google.firebase.messaging;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.text.TextUtils;
import android.util.Log;
import b7.C2878l;
import com.google.android.gms.tasks.Task;
import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;
import v6.AbstractC6056k;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public class I implements Closeable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final URL f31619a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public volatile Future f31620b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Task f31621c;

    public I(URL url) {
        this.f31619a = url;
    }

    public static /* synthetic */ void a(I i10, C2878l c2878l) {
        i10.getClass();
        try {
            c2878l.c(i10.b());
        } catch (Exception e10) {
            c2878l.b(e10);
        }
    }

    public static I d(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        try {
            return new I(new URL(str));
        } catch (MalformedURLException unused) {
            Log.w("FirebaseMessaging", "Not downloading image, bad URL: " + str);
            return null;
        }
    }

    public Bitmap b() throws IOException {
        if (Log.isLoggable("FirebaseMessaging", 4)) {
            Log.i("FirebaseMessaging", "Starting download of: " + this.f31619a);
        }
        byte[] bArrC = c();
        Bitmap bitmapDecodeByteArray = BitmapFactory.decodeByteArray(bArrC, 0, bArrC.length);
        if (bitmapDecodeByteArray == null) {
            throw new IOException("Failed to decode image: " + this.f31619a);
        }
        if (Log.isLoggable("FirebaseMessaging", 3)) {
            Log.d("FirebaseMessaging", "Successfully downloaded image: " + this.f31619a);
        }
        return bitmapDecodeByteArray;
    }

    public final byte[] c() throws IOException {
        URLConnection uRLConnectionOpenConnection = this.f31619a.openConnection();
        if (uRLConnectionOpenConnection.getContentLength() > 1048576) {
            throw new IOException("Content-Length exceeds max size of 1048576");
        }
        InputStream inputStream = uRLConnectionOpenConnection.getInputStream();
        try {
            byte[] bArrD = AbstractC3680b.d(AbstractC3680b.b(inputStream, 1048577L));
            if (inputStream != null) {
                inputStream.close();
            }
            if (Log.isLoggable("FirebaseMessaging", 2)) {
                Log.v("FirebaseMessaging", "Downloaded " + bArrD.length + " bytes from " + this.f31619a);
            }
            if (bArrD.length <= 1048576) {
                return bArrD;
            }
            throw new IOException("Image exceeds max size of 1048576");
        } catch (Throwable th) {
            if (inputStream != null) {
                try {
                    inputStream.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
            }
            throw th;
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.f31620b.cancel(true);
    }

    public Task f() {
        return (Task) AbstractC6056k.l(this.f31621c);
    }

    public void g(ExecutorService executorService) {
        final C2878l c2878l = new C2878l();
        this.f31620b = executorService.submit(new Runnable() { // from class: com.google.firebase.messaging.H
            @Override // java.lang.Runnable
            public final void run() {
                I.a(this.f31617a, c2878l);
            }
        });
        this.f31621c = c2878l.a();
    }
}
