package l1;

import android.content.ContentResolver;
import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.provider.DocumentsContract;
import android.util.Log;
import d.AbstractC3782A;
import java.util.ArrayList;

/* JADX INFO: renamed from: l1.d, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public class C4873d extends AbstractC4870a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Context f39834b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Uri f39835c;

    public C4873d(AbstractC4870a abstractC4870a, Context context, Uri uri) {
        super(abstractC4870a);
        this.f39834b = context;
        this.f39835c = uri;
    }

    public static void m(AutoCloseable autoCloseable) {
        if (autoCloseable != null) {
            try {
                AbstractC3782A.a(autoCloseable);
            } catch (RuntimeException e10) {
                throw e10;
            } catch (Exception unused) {
            }
        }
    }

    public static Uri n(Context context, Uri uri, String str, String str2) {
        try {
            return DocumentsContract.createDocument(context.getContentResolver(), uri, str, str2);
        } catch (Exception unused) {
            return null;
        }
    }

    @Override // l1.AbstractC4870a
    public AbstractC4870a a(String str) {
        Uri uriN = n(this.f39834b, this.f39835c, "vnd.android.document/directory", str);
        if (uriN != null) {
            return new C4873d(this, this.f39834b, uriN);
        }
        return null;
    }

    @Override // l1.AbstractC4870a
    public AbstractC4870a b(String str, String str2) {
        Uri uriN = n(this.f39834b, this.f39835c, str, str2);
        if (uriN != null) {
            return new C4873d(this, this.f39834b, uriN);
        }
        return null;
    }

    @Override // l1.AbstractC4870a
    public boolean c() {
        try {
            return DocumentsContract.deleteDocument(this.f39834b.getContentResolver(), this.f39835c);
        } catch (Exception unused) {
            return false;
        }
    }

    @Override // l1.AbstractC4870a
    public boolean d() {
        return AbstractC4871b.b(this.f39834b, this.f39835c);
    }

    @Override // l1.AbstractC4870a
    public String h() {
        return AbstractC4871b.c(this.f39834b, this.f39835c);
    }

    @Override // l1.AbstractC4870a
    public Uri j() {
        return this.f39835c;
    }

    @Override // l1.AbstractC4870a
    public boolean k() {
        return AbstractC4871b.e(this.f39834b, this.f39835c);
    }

    @Override // l1.AbstractC4870a
    public AbstractC4870a[] l() {
        ContentResolver contentResolver = this.f39834b.getContentResolver();
        Uri uri = this.f39835c;
        Uri uriBuildChildDocumentsUriUsingTree = DocumentsContract.buildChildDocumentsUriUsingTree(uri, DocumentsContract.getDocumentId(uri));
        ArrayList arrayList = new ArrayList();
        Cursor cursorQuery = null;
        try {
            try {
                cursorQuery = contentResolver.query(uriBuildChildDocumentsUriUsingTree, new String[]{"document_id"}, null, null, null);
                while (cursorQuery.moveToNext()) {
                    arrayList.add(DocumentsContract.buildDocumentUriUsingTree(this.f39835c, cursorQuery.getString(0)));
                }
            } catch (Exception e10) {
                Log.w("DocumentFile", "Failed query: " + e10);
            }
            Uri[] uriArr = (Uri[]) arrayList.toArray(new Uri[arrayList.size()]);
            AbstractC4870a[] abstractC4870aArr = new AbstractC4870a[uriArr.length];
            for (int i10 = 0; i10 < uriArr.length; i10++) {
                abstractC4870aArr[i10] = new C4873d(this, this.f39834b, uriArr[i10]);
            }
            return abstractC4870aArr;
        } finally {
            m(cursorQuery);
        }
    }
}
