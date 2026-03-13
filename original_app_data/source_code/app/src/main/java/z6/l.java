package z6;

import android.content.Context;
import b7.C2878l;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import java.util.Arrays;
import t6.AbstractC5846d;
import t6.C5843a;
import t6.InterfaceC5848f;
import u6.AbstractC5970p;
import u6.InterfaceC5968n;
import v6.AbstractC6056k;
import y6.C6440b;
import y6.InterfaceC6442d;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public final class l extends AbstractC5846d implements InterfaceC6442d {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final C5843a.g f48796l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final C5843a.AbstractC0606a f48797m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final C5843a f48798n;

    static {
        C5843a.g gVar = new C5843a.g();
        f48796l = gVar;
        C6524g c6524g = new C6524g();
        f48797m = c6524g;
        f48798n = new C5843a("ModuleInstall.API", c6524g, gVar);
    }

    public l(Context context) {
        super(context, f48798n, C5843a.d.f44753a, AbstractC5846d.a.f44766c);
    }

    public static final C6518a v(boolean z10, InterfaceC5848f... interfaceC5848fArr) {
        AbstractC6056k.m(interfaceC5848fArr, "Requested APIs must not be null.");
        AbstractC6056k.b(interfaceC5848fArr.length > 0, "Please provide at least one OptionalModuleApi.");
        for (InterfaceC5848f interfaceC5848f : interfaceC5848fArr) {
            AbstractC6056k.m(interfaceC5848f, "Requested API must not be null.");
        }
        return C6518a.f(Arrays.asList(interfaceC5848fArr), z10);
    }

    @Override // y6.InterfaceC6442d
    public final Task b(y6.f fVar) {
        final C6518a c6518aD = C6518a.d(fVar);
        fVar.b();
        fVar.c();
        if (c6518aD.e().isEmpty()) {
            return Tasks.e(new y6.g(0));
        }
        AbstractC5970p.a aVarA = AbstractC5970p.a();
        aVarA.d(H6.f.f5326a);
        aVarA.c(true);
        aVarA.e(27304);
        aVarA.b(new InterfaceC5968n() { // from class: z6.j
            @Override // u6.InterfaceC5968n
            public final /* synthetic */ void accept(Object obj, Object obj2) {
                ((C6522e) ((m) obj).C()).J6(new BinderC6526i(this.f48792a, (C2878l) obj2), c6518aD, null);
            }
        });
        return l(aVarA.a());
    }

    @Override // y6.InterfaceC6442d
    public final Task c(InterfaceC5848f... interfaceC5848fArr) {
        final C6518a c6518aV = v(false, interfaceC5848fArr);
        if (c6518aV.e().isEmpty()) {
            return Tasks.e(new C6440b(true, 0));
        }
        AbstractC5970p.a aVarA = AbstractC5970p.a();
        aVarA.d(H6.f.f5326a);
        aVarA.e(27301);
        aVarA.c(false);
        aVarA.b(new InterfaceC5968n() { // from class: z6.k
            @Override // u6.InterfaceC5968n
            public final /* synthetic */ void accept(Object obj, Object obj2) {
                ((C6522e) ((m) obj).C()).I6(new BinderC6525h(this.f48794a, (C2878l) obj2), c6518aV);
            }
        });
        return l(aVarA.a());
    }
}
