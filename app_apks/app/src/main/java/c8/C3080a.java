package c8;

import java.security.GeneralSecurityException;

/* JADX INFO: renamed from: c8.a, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public final class C3080a extends AbstractC3083d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C3081b f26370a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final g8.b f26371b;

    public C3080a(C3081b c3081b, g8.b bVar) {
        this.f26370a = c3081b;
        this.f26371b = bVar;
    }

    public static C3080a d(C3081b c3081b, g8.b bVar) throws GeneralSecurityException {
        if (c3081b.c() == bVar.c()) {
            return new C3080a(c3081b, bVar);
        }
        throw new GeneralSecurityException("Key size mismatch");
    }

    @Override // P7.g
    public Integer a() {
        return null;
    }

    public g8.b e() {
        return this.f26371b;
    }

    @Override // c8.AbstractC3083d
    /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
    public C3081b b() {
        return this.f26370a;
    }
}
