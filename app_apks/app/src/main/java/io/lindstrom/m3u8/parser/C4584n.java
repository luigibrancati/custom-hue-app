package io.lindstrom.m3u8.parser;

import Db.InterfaceC0767n;
import Db.InterfaceC0769p;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: renamed from: io.lindstrom.m3u8.parser.n, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public class C4584n extends AbstractC4571a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C4589t f38391a;

    /* JADX INFO: renamed from: io.lindstrom.m3u8.parser.n$a */
    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final InterfaceC0767n.a f38392a = InterfaceC0767n.builder();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public InterfaceC0769p.a f38393b = InterfaceC0769p.builder();

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public List f38394c = new ArrayList();
    }

    public C4584n() {
        this(C4589t.f38398c);
    }

    @Override // io.lindstrom.m3u8.parser.AbstractC4571a
    /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
    public InterfaceC0767n a(a aVar) {
        return aVar.f38392a.S(aVar.f38394c).E();
    }

    @Override // io.lindstrom.m3u8.parser.AbstractC4571a
    /* JADX INFO: renamed from: j, reason: merged with bridge method [inline-methods] */
    public a b() {
        return new a();
    }

    @Override // io.lindstrom.m3u8.parser.AbstractC4571a
    /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
    public void c(a aVar, String str) {
        aVar.f38392a.A(str);
    }

    @Override // io.lindstrom.m3u8.parser.AbstractC4571a
    /* JADX INFO: renamed from: l, reason: merged with bridge method [inline-methods] */
    public void d(a aVar, String str, String str2, Iterator it) throws y {
        if (r.EXT_X_PART.tag().equals(str)) {
            aVar.f38394c.add(v.p(str2, this.f38391a));
            return;
        }
        Map<String, EnumC4586p> map = EnumC4586p.tags;
        if (map.containsKey(str)) {
            map.get(str).a(aVar.f38392a, str2, this.f38391a);
            return;
        }
        Map<String, r> map2 = r.tags;
        if (map2.containsKey(str)) {
            map2.get(str).a(aVar.f38393b, str2, this.f38391a);
            return;
        }
        Map<String, EnumC4583m> map3 = EnumC4583m.tags;
        if (map3.containsKey(str)) {
            map3.get(str).a(aVar.f38392a, str2, this.f38391a);
        } else if (this.f38391a.b()) {
            throw new y("Tag not implemented: " + str);
        }
    }

    @Override // io.lindstrom.m3u8.parser.AbstractC4571a
    /* JADX INFO: renamed from: m, reason: merged with bridge method [inline-methods] */
    public void e(a aVar, String str) {
        aVar.f38393b.N(str).I(aVar.f38394c);
        aVar.f38392a.B(aVar.f38393b.v());
        aVar.f38393b = InterfaceC0769p.builder();
        aVar.f38394c = new ArrayList();
    }

    public C4584n(C4589t c4589t) {
        this.f38391a = c4589t;
    }
}
