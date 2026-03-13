package ge;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.AbstractC4862t;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public final class M extends T {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ee.e f35665c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public M(ce.b kSerializer, ce.b vSerializer) {
        super(kSerializer, vSerializer, null);
        AbstractC4862t.e(kSerializer, "kSerializer");
        AbstractC4862t.e(vSerializer, "vSerializer");
        this.f35665c = new L(kSerializer.getDescriptor(), vSerializer.getDescriptor());
    }

    @Override // ge.T, ce.b, ce.g, ce.InterfaceC3118a
    public ee.e getDescriptor() {
        return this.f35665c;
    }

    @Override // ge.AbstractC4223a
    /* JADX INFO: renamed from: s, reason: merged with bridge method [inline-methods] */
    public LinkedHashMap c() {
        return new LinkedHashMap();
    }

    @Override // ge.AbstractC4223a
    /* JADX INFO: renamed from: t, reason: merged with bridge method [inline-methods] */
    public int d(LinkedHashMap linkedHashMap) {
        AbstractC4862t.e(linkedHashMap, "<this>");
        return linkedHashMap.size() * 2;
    }

    @Override // ge.AbstractC4223a
    /* JADX INFO: renamed from: u, reason: merged with bridge method [inline-methods] */
    public void e(LinkedHashMap linkedHashMap, int i10) {
        AbstractC4862t.e(linkedHashMap, "<this>");
    }

    @Override // ge.AbstractC4223a
    /* JADX INFO: renamed from: v, reason: merged with bridge method [inline-methods] */
    public Iterator f(Map map) {
        AbstractC4862t.e(map, "<this>");
        return map.entrySet().iterator();
    }

    @Override // ge.AbstractC4223a
    /* JADX INFO: renamed from: w, reason: merged with bridge method [inline-methods] */
    public int g(Map map) {
        AbstractC4862t.e(map, "<this>");
        return map.size();
    }

    @Override // ge.AbstractC4223a
    /* JADX INFO: renamed from: x, reason: merged with bridge method [inline-methods] */
    public LinkedHashMap m(Map map) {
        AbstractC4862t.e(map, "<this>");
        LinkedHashMap linkedHashMap = map instanceof LinkedHashMap ? (LinkedHashMap) map : null;
        return linkedHashMap == null ? new LinkedHashMap(map) : linkedHashMap;
    }

    @Override // ge.AbstractC4223a
    /* JADX INFO: renamed from: y, reason: merged with bridge method [inline-methods] */
    public Map n(LinkedHashMap linkedHashMap) {
        AbstractC4862t.e(linkedHashMap, "<this>");
        return linkedHashMap;
    }
}
