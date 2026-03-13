package Ab;

import cb.C3091b;
import cb.C3092c;
import com.google.android.filament.Engine;
import com.google.android.filament.EntityManager;
import com.google.android.filament.LightManager;
import kotlin.jvm.internal.AbstractC4854k;
import kotlin.jvm.internal.AbstractC4862t;
import sb.InterfaceC5818c;
import vc.l;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public abstract class e extends f implements InterfaceC5818c {

    /* JADX INFO: renamed from: T, reason: collision with root package name */
    public boolean f274T;

    /* JADX INFO: renamed from: U, reason: collision with root package name */
    public boolean f275U;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(Engine engine, int i10) {
        super(engine, i10);
        AbstractC4862t.e(engine, "engine");
    }

    @Override // sb.InterfaceC5818c
    public /* bridge */ float F() {
        return super.F();
    }

    @Override // Ab.f
    public void H() {
        w().destroy(getEntity());
        super.H();
    }

    @Override // Ab.f
    public boolean b0() {
        return this.f275U;
    }

    @Override // Ab.f
    public boolean g0() {
        return this.f274T;
    }

    @Override // sb.InterfaceC5818c
    public /* bridge */ int j() {
        return super.j();
    }

    @Override // sb.InterfaceC5818c
    public /* bridge */ void o(float f10) {
        super.o(f10);
    }

    @Override // sb.InterfaceC5818c
    public /* bridge */ void q(C3091b c3091b) {
        super.q(c3091b);
    }

    @Override // sb.InterfaceC5818c
    public /* bridge */ C3092c s() {
        return super.s();
    }

    @Override // sb.InterfaceC5818c
    public /* bridge */ LightManager w() {
        return super.w();
    }

    @Override // sb.InterfaceC5818c
    public /* bridge */ void y(C3092c c3092c) {
        super.y(c3092c);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public e(Engine engine, int i10, LightManager.Builder builder) {
        this(engine, i10);
        AbstractC4862t.e(engine, "engine");
        AbstractC4862t.e(builder, "builder");
        builder.build(engine, i10);
    }

    public /* synthetic */ e(Engine engine, LightManager.Type type, int i10, l lVar, int i11, AbstractC4854k abstractC4854k) {
        this(engine, type, (i11 & 4) != 0 ? EntityManager.get().create() : i10, lVar);
    }

    public e(Engine engine, LightManager.Type type, int i10, l apply) {
        AbstractC4862t.e(engine, "engine");
        AbstractC4862t.e(type, "type");
        AbstractC4862t.e(apply, "apply");
        LightManager.Builder builder = new LightManager.Builder(type);
        apply.invoke(builder);
        this(engine, i10, builder);
    }
}
