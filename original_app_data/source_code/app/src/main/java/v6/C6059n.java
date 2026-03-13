package v6;

import android.content.Context;
import android.content.res.Resources;
import s6.AbstractC5790i;

/* JADX INFO: renamed from: v6.n, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public class C6059n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Resources f45874a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f45875b;

    public C6059n(Context context) {
        AbstractC6056k.l(context);
        Resources resources = context.getResources();
        this.f45874a = resources;
        this.f45875b = resources.getResourcePackageName(AbstractC5790i.f44168a);
    }

    public String a(String str) {
        String str2 = this.f45875b;
        Resources resources = this.f45874a;
        int identifier = resources.getIdentifier(str, "string", str2);
        if (identifier == 0) {
            return null;
        }
        return resources.getString(identifier);
    }
}
