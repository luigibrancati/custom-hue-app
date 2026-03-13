package androidx.appcompat.view.menu;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.view.menu.i;
import androidx.appcompat.view.menu.j;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public abstract class a implements i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Context f21496a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Context f21497b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public e f21498c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public LayoutInflater f21499d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public LayoutInflater f21500e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public i.a f21501f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f21502g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f21503h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public j f21504i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f21505j;

    public a(Context context, int i10, int i11) {
        this.f21496a = context;
        this.f21499d = LayoutInflater.from(context);
        this.f21502g = i10;
        this.f21503h = i11;
    }

    public void a(View view, int i10) {
        ViewGroup viewGroup = (ViewGroup) view.getParent();
        if (viewGroup != null) {
            viewGroup.removeView(view);
        }
        ((ViewGroup) this.f21504i).addView(view, i10);
    }

    @Override // androidx.appcompat.view.menu.i
    public void b(e eVar, boolean z10) {
        i.a aVar = this.f21501f;
        if (aVar != null) {
            aVar.b(eVar, z10);
        }
    }

    @Override // androidx.appcompat.view.menu.i
    public boolean c(e eVar, g gVar) {
        return false;
    }

    @Override // androidx.appcompat.view.menu.i
    public void d(i.a aVar) {
        this.f21501f = aVar;
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // androidx.appcompat.view.menu.i
    public boolean e(l lVar) {
        i.a aVar = this.f21501f;
        e eVar = lVar;
        if (aVar == null) {
            return false;
        }
        if (lVar == null) {
            eVar = this.f21498c;
        }
        return aVar.c(eVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.appcompat.view.menu.i
    public void f(boolean z10) {
        ViewGroup viewGroup = (ViewGroup) this.f21504i;
        if (viewGroup == null) {
            return;
        }
        e eVar = this.f21498c;
        int i10 = 0;
        if (eVar != null) {
            eVar.r();
            ArrayList arrayListE = this.f21498c.E();
            int size = arrayListE.size();
            int i11 = 0;
            for (int i12 = 0; i12 < size; i12++) {
                g gVar = (g) arrayListE.get(i12);
                if (q(i11, gVar)) {
                    View childAt = viewGroup.getChildAt(i11);
                    g itemData = childAt instanceof j.a ? ((j.a) childAt).getItemData() : null;
                    View viewN = n(gVar, childAt, viewGroup);
                    if (gVar != itemData) {
                        viewN.setPressed(false);
                        viewN.jumpDrawablesToCurrentState();
                    }
                    if (viewN != childAt) {
                        a(viewN, i11);
                    }
                    i11++;
                }
            }
            i10 = i11;
        }
        while (i10 < viewGroup.getChildCount()) {
            if (!l(viewGroup, i10)) {
                i10++;
            }
        }
    }

    @Override // androidx.appcompat.view.menu.i
    public boolean h(e eVar, g gVar) {
        return false;
    }

    @Override // androidx.appcompat.view.menu.i
    public void i(Context context, e eVar) {
        this.f21497b = context;
        this.f21500e = LayoutInflater.from(context);
        this.f21498c = eVar;
    }

    public abstract void j(g gVar, j.a aVar);

    public j.a k(ViewGroup viewGroup) {
        return (j.a) this.f21499d.inflate(this.f21503h, viewGroup, false);
    }

    public boolean l(ViewGroup viewGroup, int i10) {
        viewGroup.removeViewAt(i10);
        return true;
    }

    public i.a m() {
        return this.f21501f;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public View n(g gVar, View view, ViewGroup viewGroup) {
        j.a aVarK = view instanceof j.a ? (j.a) view : k(viewGroup);
        j(gVar, aVarK);
        return (View) aVarK;
    }

    public j o(ViewGroup viewGroup) {
        if (this.f21504i == null) {
            j jVar = (j) this.f21499d.inflate(this.f21502g, viewGroup, false);
            this.f21504i = jVar;
            jVar.a(this.f21498c);
            f(true);
        }
        return this.f21504i;
    }

    public void p(int i10) {
        this.f21505j = i10;
    }

    public abstract boolean q(int i10, g gVar);
}
