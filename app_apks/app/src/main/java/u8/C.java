package u8;

import java.io.File;
import java.io.IOException;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public class C {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f45251a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final A8.g f45252b;

    public C(String str, A8.g gVar) {
        this.f45251a = str;
        this.f45252b = gVar;
    }

    public boolean a() {
        try {
            return b().createNewFile();
        } catch (IOException e10) {
            r8.g.f().e("Error creating marker: " + this.f45251a, e10);
            return false;
        }
    }

    public final File b() {
        return this.f45252b.g(this.f45251a);
    }

    public boolean c() {
        return b().exists();
    }

    public boolean d() {
        return b().delete();
    }
}
