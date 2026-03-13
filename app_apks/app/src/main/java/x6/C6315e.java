package x6;

import android.content.Context;
import b7.C2878l;
import com.google.android.gms.tasks.Task;
import t6.AbstractC5846d;
import t6.C5843a;
import u6.AbstractC5970p;
import u6.InterfaceC5968n;
import v6.C6060o;
import v6.InterfaceC6062q;
import v6.r;

/* JADX INFO: renamed from: x6.e, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public final class C6315e extends AbstractC5846d implements InterfaceC6062q {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final C5843a.g f47480l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final C5843a.AbstractC0606a f47481m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final C5843a f47482n;

    static {
        C5843a.g gVar = new C5843a.g();
        f47480l = gVar;
        C6313c c6313c = new C6313c();
        f47481m = c6313c;
        f47482n = new C5843a("ClientTelemetry.API", c6313c, gVar);
    }

    public C6315e(Context context, r rVar) {
        super(context, f47482n, rVar, AbstractC5846d.a.f44766c);
    }

    @Override // v6.InterfaceC6062q
    public final Task e(final C6060o c6060o) {
        AbstractC5970p.a aVarA = AbstractC5970p.a();
        aVarA.d(H6.c.f5322a);
        aVarA.c(false);
        aVarA.b(new InterfaceC5968n() { // from class: x6.d
            @Override // u6.InterfaceC5968n
            public final /* synthetic */ void accept(Object obj, Object obj2) {
                C5843a.g gVar = C6315e.f47480l;
                ((C6311a) ((C6316f) obj).C()).I6(c6060o);
                ((C2878l) obj2).c(null);
            }
        });
        return k(aVarA.a());
    }
}
