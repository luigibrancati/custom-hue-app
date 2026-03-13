package io.lindstrom.m3u8.parser;

import Db.InterfaceC0765l;
import java.util.Iterator;

/* JADX INFO: renamed from: io.lindstrom.m3u8.parser.i, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public class C4579i extends AbstractC4571a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C4589t f38390a;

    public C4579i() {
        this(C4589t.f38398c);
    }

    @Override // io.lindstrom.m3u8.parser.AbstractC4571a
    /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
    public InterfaceC0765l a(InterfaceC0765l.a aVar) {
        return aVar.t();
    }

    @Override // io.lindstrom.m3u8.parser.AbstractC4571a
    /* JADX INFO: renamed from: j, reason: merged with bridge method [inline-methods] */
    public InterfaceC0765l.a b() {
        return InterfaceC0765l.builder();
    }

    @Override // io.lindstrom.m3u8.parser.AbstractC4571a
    /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
    public void c(InterfaceC0765l.a aVar, String str) {
        aVar.n(str);
    }

    @Override // io.lindstrom.m3u8.parser.AbstractC4571a
    /* JADX INFO: renamed from: l, reason: merged with bridge method [inline-methods] */
    public void d(InterfaceC0765l.a aVar, String str, String str2, Iterator it) throws y {
        EnumC4581k enumC4581k = EnumC4581k.tags.get(str);
        if (enumC4581k == EnumC4581k.EXT_X_STREAM_INF) {
            String str3 = (String) it.next();
            if (str3 != null && !str3.startsWith("#")) {
                aVar.s(U.p(str2, str3, this.f38390a));
                return;
            }
            throw new y("Expected URI, got " + str3);
        }
        if (enumC4581k != null) {
            enumC4581k.a(aVar, str2, this.f38390a);
        } else if (this.f38390a.b()) {
            throw new y("Tag not implemented: " + str);
        }
    }

    public C4579i(C4589t c4589t) {
        this.f38390a = c4589t;
    }
}
