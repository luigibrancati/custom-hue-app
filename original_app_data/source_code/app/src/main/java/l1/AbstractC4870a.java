package l1;

import android.content.Context;
import android.net.Uri;
import android.provider.DocumentsContract;

/* JADX INFO: renamed from: l1.a, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC4870a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final AbstractC4870a f39831a;

    public AbstractC4870a(AbstractC4870a abstractC4870a) {
        this.f39831a = abstractC4870a;
    }

    public static AbstractC4870a f(Context context, Uri uri) {
        return new C4872c(null, context, uri);
    }

    public static AbstractC4870a g(Context context, Uri uri) {
        return new C4873d(null, context, DocumentsContract.buildDocumentUriUsingTree(uri, DocumentsContract.getTreeDocumentId(uri)));
    }

    public abstract AbstractC4870a a(String str);

    public abstract AbstractC4870a b(String str, String str2);

    public abstract boolean c();

    public abstract boolean d();

    public AbstractC4870a e(String str) {
        for (AbstractC4870a abstractC4870a : l()) {
            if (str.equals(abstractC4870a.h())) {
                return abstractC4870a;
            }
        }
        return null;
    }

    public abstract String h();

    public AbstractC4870a i() {
        return this.f39831a;
    }

    public abstract Uri j();

    public abstract boolean k();

    public abstract AbstractC4870a[] l();
}
