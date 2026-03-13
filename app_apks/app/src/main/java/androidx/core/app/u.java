package androidx.core.app;

import android.app.Person;
import android.os.Bundle;
import androidx.core.graphics.drawable.IconCompat;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public class u {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public CharSequence f22630a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public IconCompat f22631b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public String f22632c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public String f22633d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f22634e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f22635f;

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static class a {
        public static u a(Person person) {
            return new b().f(person.getName()).c(person.getIcon() != null ? IconCompat.c(person.getIcon()) : null).g(person.getUri()).e(person.getKey()).b(person.isBot()).d(person.isImportant()).a();
        }

        public static Person b(u uVar) {
            return new Person.Builder().setName(uVar.e()).setIcon(uVar.c() != null ? uVar.c().s() : null).setUri(uVar.f()).setKey(uVar.d()).setBot(uVar.g()).setImportant(uVar.h()).build();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public CharSequence f22636a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public IconCompat f22637b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public String f22638c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public String f22639d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public boolean f22640e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public boolean f22641f;

        public u a() {
            return new u(this);
        }

        public b b(boolean z10) {
            this.f22640e = z10;
            return this;
        }

        public b c(IconCompat iconCompat) {
            this.f22637b = iconCompat;
            return this;
        }

        public b d(boolean z10) {
            this.f22641f = z10;
            return this;
        }

        public b e(String str) {
            this.f22639d = str;
            return this;
        }

        public b f(CharSequence charSequence) {
            this.f22636a = charSequence;
            return this;
        }

        public b g(String str) {
            this.f22638c = str;
            return this;
        }
    }

    public u(b bVar) {
        this.f22630a = bVar.f22636a;
        this.f22631b = bVar.f22637b;
        this.f22632c = bVar.f22638c;
        this.f22633d = bVar.f22639d;
        this.f22634e = bVar.f22640e;
        this.f22635f = bVar.f22641f;
    }

    public static u a(Person person) {
        return a.a(person);
    }

    public static u b(Bundle bundle) {
        Bundle bundle2 = bundle.getBundle("icon");
        return new b().f(bundle.getCharSequence("name")).c(bundle2 != null ? IconCompat.b(bundle2) : null).g(bundle.getString("uri")).e(bundle.getString("key")).b(bundle.getBoolean("isBot")).d(bundle.getBoolean("isImportant")).a();
    }

    public IconCompat c() {
        return this.f22631b;
    }

    public String d() {
        return this.f22633d;
    }

    public CharSequence e() {
        return this.f22630a;
    }

    public boolean equals(Object obj) {
        if (obj == null || !(obj instanceof u)) {
            return false;
        }
        u uVar = (u) obj;
        String strD = d();
        String strD2 = uVar.d();
        return (strD == null && strD2 == null) ? Objects.equals(Objects.toString(e()), Objects.toString(uVar.e())) && Objects.equals(f(), uVar.f()) && Boolean.valueOf(g()).equals(Boolean.valueOf(uVar.g())) && Boolean.valueOf(h()).equals(Boolean.valueOf(uVar.h())) : Objects.equals(strD, strD2);
    }

    public String f() {
        return this.f22632c;
    }

    public boolean g() {
        return this.f22634e;
    }

    public boolean h() {
        return this.f22635f;
    }

    public int hashCode() {
        String strD = d();
        return strD != null ? strD.hashCode() : Objects.hash(e(), f(), Boolean.valueOf(g()), Boolean.valueOf(h()));
    }

    public Person i() {
        return a.b(this);
    }

    public Bundle j() {
        Bundle bundle = new Bundle();
        bundle.putCharSequence("name", this.f22630a);
        IconCompat iconCompat = this.f22631b;
        bundle.putBundle("icon", iconCompat != null ? iconCompat.r() : null);
        bundle.putString("uri", this.f22632c);
        bundle.putString("key", this.f22633d);
        bundle.putBoolean("isBot", this.f22634e);
        bundle.putBoolean("isImportant", this.f22635f);
        return bundle;
    }
}
