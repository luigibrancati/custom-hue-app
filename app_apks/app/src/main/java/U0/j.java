package U0;

import android.os.LocaleList;
import java.util.Locale;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public final class j implements i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final LocaleList f16579a;

    public j(Object obj) {
        this.f16579a = (LocaleList) obj;
    }

    @Override // U0.i
    public String a() {
        return this.f16579a.toLanguageTags();
    }

    @Override // U0.i
    public Object b() {
        return this.f16579a;
    }

    public boolean equals(Object obj) {
        return this.f16579a.equals(((i) obj).b());
    }

    @Override // U0.i
    public Locale get(int i10) {
        return this.f16579a.get(i10);
    }

    public int hashCode() {
        return this.f16579a.hashCode();
    }

    @Override // U0.i
    public boolean isEmpty() {
        return this.f16579a.isEmpty();
    }

    @Override // U0.i
    public int size() {
        return this.f16579a.size();
    }

    public String toString() {
        return this.f16579a.toString();
    }
}
