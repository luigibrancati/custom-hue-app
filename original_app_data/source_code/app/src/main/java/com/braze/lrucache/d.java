package com.braze.lrucache;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.OutputStream;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final g f27798a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean[] f27799b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f27800c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ f f27801d;

    public d(f fVar, g gVar) {
        this.f27801d = fVar;
        this.f27798a = gVar;
        this.f27799b = gVar.f27822c ? null : new boolean[fVar.f27812g];
    }

    public final OutputStream a() {
        FileOutputStream fileOutputStream;
        c cVar;
        f fVar = this.f27801d;
        if (fVar.f27812g <= 0) {
            throw new IllegalArgumentException("Expected index 0 to be greater than 0 and less than the maximum value count of " + this.f27801d.f27812g);
        }
        synchronized (fVar) {
            try {
                g gVar = this.f27798a;
                if (gVar.f27823d != this) {
                    throw new IllegalStateException();
                }
                if (!gVar.f27822c) {
                    this.f27799b[0] = true;
                }
                File fileA = gVar.a(0);
                try {
                    fileOutputStream = new FileOutputStream(fileA);
                } catch (FileNotFoundException unused) {
                    this.f27801d.f27806a.mkdirs();
                    try {
                        fileOutputStream = new FileOutputStream(fileA);
                    } catch (FileNotFoundException unused2) {
                        return f.f27805q;
                    }
                }
                cVar = new c(this, fileOutputStream);
            } catch (Throwable th) {
                throw th;
            }
        }
        return cVar;
    }
}
