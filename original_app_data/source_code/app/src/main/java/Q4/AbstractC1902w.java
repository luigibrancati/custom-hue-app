package Q4;

import ee.d;
import fe.InterfaceC4049e;
import fe.InterfaceC4050f;
import kotlin.jvm.internal.AbstractC4862t;

/* JADX INFO: renamed from: Q4.w, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1902w implements ce.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final vc.l f13912a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final vc.l f13913b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ee.e f13914c;

    public AbstractC1902w(String serialName, vc.l serialize, vc.l deserialize) {
        AbstractC4862t.e(serialName, "serialName");
        AbstractC4862t.e(serialize, "serialize");
        AbstractC4862t.e(deserialize, "deserialize");
        this.f13912a = serialize;
        this.f13913b = deserialize;
        this.f13914c = ee.j.b(serialName, d.f.f33946a);
    }

    @Override // ce.InterfaceC3118a
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public Enum deserialize(InterfaceC4049e decoder) {
        AbstractC4862t.e(decoder, "decoder");
        return (Enum) this.f13913b.invoke(Integer.valueOf(decoder.h()));
    }

    @Override // ce.g
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public void serialize(InterfaceC4050f encoder, Enum value) {
        AbstractC4862t.e(encoder, "encoder");
        AbstractC4862t.e(value, "value");
        encoder.D(((Number) this.f13912a.invoke(value)).intValue());
    }

    @Override // ce.b, ce.g, ce.InterfaceC3118a
    public ee.e getDescriptor() {
        return this.f13914c;
    }
}
