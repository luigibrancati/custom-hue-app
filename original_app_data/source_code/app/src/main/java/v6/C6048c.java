package v6;

import android.accounts.Account;
import android.view.View;
import b0.C2778b;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* JADX INFO: renamed from: v6.c, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public final class C6048c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Account f45823a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Set f45824b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Set f45825c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Map f45826d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f45827e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final View f45828f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final String f45829g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final String f45830h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final Y6.a f45831i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public Integer f45832j;

    /* JADX INFO: renamed from: v6.c$a */
    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public Account f45833a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public C2778b f45834b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public String f45835c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public String f45836d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final Y6.a f45837e = Y6.a.f19786k;

        public C6048c a() {
            return new C6048c(this.f45833a, this.f45834b, null, 0, null, this.f45835c, this.f45836d, this.f45837e, false);
        }

        public a b(String str) {
            this.f45835c = str;
            return this;
        }

        public final a c(Account account) {
            this.f45833a = account;
            return this;
        }

        public final a d(Collection collection) {
            if (this.f45834b == null) {
                this.f45834b = new C2778b();
            }
            this.f45834b.addAll(collection);
            return this;
        }

        public final a e(String str) {
            this.f45836d = str;
            return this;
        }
    }

    public C6048c(Account account, Set set, Map map, int i10, View view, String str, String str2, Y6.a aVar, boolean z10) {
        this.f45823a = account;
        Set setUnmodifiableSet = set == null ? Collections.EMPTY_SET : Collections.unmodifiableSet(set);
        this.f45824b = setUnmodifiableSet;
        map = map == null ? Collections.EMPTY_MAP : map;
        this.f45826d = map;
        this.f45828f = view;
        this.f45827e = i10;
        this.f45829g = str;
        this.f45830h = str2;
        this.f45831i = aVar == null ? Y6.a.f19786k : aVar;
        HashSet hashSet = new HashSet(setUnmodifiableSet);
        Iterator it = map.values().iterator();
        if (it.hasNext()) {
            android.support.v4.media.session.a.a(it.next());
            throw null;
        }
        this.f45825c = Collections.unmodifiableSet(hashSet);
    }

    public Account a() {
        return this.f45823a;
    }

    public Account b() {
        Account account = this.f45823a;
        return account != null ? account : new Account("<<default account>>", "com.google");
    }

    public Set c() {
        return this.f45825c;
    }

    public String d() {
        return this.f45829g;
    }

    public Set e() {
        return this.f45824b;
    }

    public final String f() {
        return this.f45830h;
    }

    public final Y6.a g() {
        return this.f45831i;
    }

    public final Integer h() {
        return this.f45832j;
    }

    public final void i(Integer num) {
        this.f45832j = num;
    }
}
