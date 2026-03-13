package j8;

import android.content.Context;
import i8.c;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: renamed from: j8.a, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public class C4747a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Map f39094a = new HashMap();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Context f39095b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final O8.b f39096c;

    public C4747a(Context context, O8.b bVar) {
        this.f39095b = context;
        this.f39096c = bVar;
    }

    public c a(String str) {
        return new c(this.f39095b, this.f39096c, str);
    }

    public synchronized c b(String str) {
        try {
            if (!this.f39094a.containsKey(str)) {
                this.f39094a.put(str, a(str));
            }
        } catch (Throwable th) {
            throw th;
        }
        return (c) this.f39094a.get(str);
    }
}
