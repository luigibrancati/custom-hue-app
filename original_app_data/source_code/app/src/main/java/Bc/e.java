package Bc;

import gc.M;
import java.util.NoSuchElementException;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public final class e extends M {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f795a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f796b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f797c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f798d;

    public e(int i10, int i11, int i12) {
        this.f795a = i12;
        this.f796b = i11;
        boolean z10 = false;
        if (i12 <= 0 ? i10 >= i11 : i10 <= i11) {
            z10 = true;
        }
        this.f797c = z10;
        this.f798d = z10 ? i10 : i11;
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f797c;
    }

    @Override // gc.M
    public int nextInt() {
        int i10 = this.f798d;
        if (i10 != this.f796b) {
            this.f798d = this.f795a + i10;
            return i10;
        }
        if (!this.f797c) {
            throw new NoSuchElementException();
        }
        this.f797c = false;
        return i10;
    }
}
