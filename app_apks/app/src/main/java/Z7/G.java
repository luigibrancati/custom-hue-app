package Z7;

import com.google.crypto.tink.shaded.protobuf.AbstractC3661h;
import e8.y;
import g8.C4160a;
import java.security.GeneralSecurityException;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public final class G implements K {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f20328a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final C4160a f20329b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final AbstractC3661h f20330c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final y.c f20331d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final e8.I f20332e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Integer f20333f;

    public G(String str, C4160a c4160a, AbstractC3661h abstractC3661h, y.c cVar, e8.I i10, Integer num) {
        this.f20328a = str;
        this.f20329b = c4160a;
        this.f20330c = abstractC3661h;
        this.f20331d = cVar;
        this.f20332e = i10;
        this.f20333f = num;
    }

    public static G b(String str, AbstractC3661h abstractC3661h, y.c cVar, e8.I i10, Integer num) throws GeneralSecurityException {
        if (i10 == e8.I.RAW) {
            if (num != null) {
                throw new GeneralSecurityException("Keys with output prefix type raw should not have an id requirement.");
            }
        } else if (num == null) {
            throw new GeneralSecurityException("Keys with output prefix type different from raw should have an id requirement.");
        }
        return new G(str, N.b(str), abstractC3661h, cVar, i10, num);
    }

    @Override // Z7.K
    public C4160a a() {
        return this.f20329b;
    }

    public Integer c() {
        return this.f20333f;
    }

    public y.c d() {
        return this.f20331d;
    }

    public e8.I e() {
        return this.f20332e;
    }

    public String f() {
        return this.f20328a;
    }

    public AbstractC3661h g() {
        return this.f20330c;
    }
}
