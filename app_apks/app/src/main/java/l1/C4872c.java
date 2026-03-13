package l1;

import android.content.Context;
import android.net.Uri;
import android.provider.DocumentsContract;

/* JADX INFO: renamed from: l1.c, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public class C4872c extends AbstractC4870a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Context f39832b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Uri f39833c;

    public C4872c(AbstractC4870a abstractC4870a, Context context, Uri uri) {
        super(abstractC4870a);
        this.f39832b = context;
        this.f39833c = uri;
    }

    @Override // l1.AbstractC4870a
    public AbstractC4870a a(String str) {
        throw new UnsupportedOperationException();
    }

    @Override // l1.AbstractC4870a
    public AbstractC4870a b(String str, String str2) {
        throw new UnsupportedOperationException();
    }

    @Override // l1.AbstractC4870a
    public boolean c() {
        try {
            return DocumentsContract.deleteDocument(this.f39832b.getContentResolver(), this.f39833c);
        } catch (Exception unused) {
            return false;
        }
    }

    @Override // l1.AbstractC4870a
    public boolean d() {
        return AbstractC4871b.b(this.f39832b, this.f39833c);
    }

    @Override // l1.AbstractC4870a
    public String h() {
        return AbstractC4871b.c(this.f39832b, this.f39833c);
    }

    @Override // l1.AbstractC4870a
    public Uri j() {
        return this.f39833c;
    }

    @Override // l1.AbstractC4870a
    public boolean k() {
        return AbstractC4871b.e(this.f39832b, this.f39833c);
    }

    @Override // l1.AbstractC4870a
    public AbstractC4870a[] l() {
        throw new UnsupportedOperationException();
    }
}
