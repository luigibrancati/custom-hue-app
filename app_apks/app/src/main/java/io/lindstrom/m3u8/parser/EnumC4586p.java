package io.lindstrom.m3u8.parser;

import Db.InterfaceC0767n;
import java.util.Map;
import java.util.function.Function;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: io.lindstrom.m3u8.parser.p, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public abstract class EnumC4586p implements S {
    public static final EnumC4586p EXT_X_VERSION = new e("EXT_X_VERSION", 0);
    public static final EnumC4586p EXT_X_INDEPENDENT_SEGMENTS = new EnumC4586p("EXT_X_INDEPENDENT_SEGMENTS", 1) { // from class: io.lindstrom.m3u8.parser.p.f
        {
            e eVar = null;
        }

        @Override // io.lindstrom.m3u8.parser.S
        /* JADX INFO: renamed from: j, reason: merged with bridge method [inline-methods] */
        public void a(InterfaceC0767n.a aVar, String str, C4589t c4589t) {
            aVar.L(true);
        }
    };
    public static final EnumC4586p EXT_X_START = new EnumC4586p("EXT_X_START", 2) { // from class: io.lindstrom.m3u8.parser.p.g
        {
            e eVar = null;
        }

        @Override // io.lindstrom.m3u8.parser.S
        /* JADX INFO: renamed from: j, reason: merged with bridge method [inline-methods] */
        public void a(InterfaceC0767n.a aVar, String str, C4589t c4589t) {
            aVar.X(Q.p(str, c4589t));
        }
    };
    public static final EnumC4586p EXT_X_I_FRAMES_ONLY = new EnumC4586p("EXT_X_I_FRAMES_ONLY", 3) { // from class: io.lindstrom.m3u8.parser.p.h
        {
            e eVar = null;
        }

        @Override // io.lindstrom.m3u8.parser.S
        /* JADX INFO: renamed from: j, reason: merged with bridge method [inline-methods] */
        public void a(InterfaceC0767n.a aVar, String str, C4589t c4589t) {
            aVar.J(true);
        }
    };
    public static final EnumC4586p EXT_X_SERVER_CONTROL = new EnumC4586p("EXT_X_SERVER_CONTROL", 4) { // from class: io.lindstrom.m3u8.parser.p.i
        {
            e eVar = null;
        }

        @Override // io.lindstrom.m3u8.parser.S
        /* JADX INFO: renamed from: j, reason: merged with bridge method [inline-methods] */
        public void a(InterfaceC0767n.a aVar, String str, C4589t c4589t) {
            aVar.V(K.p(str, c4589t));
        }
    };
    public static final EnumC4586p EXT_X_ALLOW_CACHE = new EnumC4586p("EXT_X_ALLOW_CACHE", 5) { // from class: io.lindstrom.m3u8.parser.p.j
        {
            e eVar = null;
        }

        @Override // io.lindstrom.m3u8.parser.S
        /* JADX INFO: renamed from: j, reason: merged with bridge method [inline-methods] */
        public void a(InterfaceC0767n.a aVar, String str, C4589t c4589t) {
            aVar.D(AbstractC4588s.g(str));
        }
    };
    public static final EnumC4586p EXT_X_PLAYLIST_TYPE = new EnumC4586p("EXT_X_PLAYLIST_TYPE", 6) { // from class: io.lindstrom.m3u8.parser.p.k
        {
            e eVar = null;
        }

        @Override // io.lindstrom.m3u8.parser.S
        /* JADX INFO: renamed from: j, reason: merged with bridge method [inline-methods] */
        public void a(InterfaceC0767n.a aVar, String str, C4589t c4589t) {
            aVar.T(Db.x.valueOf(str));
        }
    };
    public static final EnumC4586p EXT_X_TARGETDURATION = new EnumC4586p("EXT_X_TARGETDURATION", 7) { // from class: io.lindstrom.m3u8.parser.p.l
        {
            e eVar = null;
        }

        @Override // io.lindstrom.m3u8.parser.S
        /* JADX INFO: renamed from: j, reason: merged with bridge method [inline-methods] */
        public void a(InterfaceC0767n.a aVar, String str, C4589t c4589t) {
            aVar.Y(Integer.parseInt(str));
        }
    };
    public static final EnumC4586p EXT_X_MEDIA_SEQUENCE = new EnumC4586p("EXT_X_MEDIA_SEQUENCE", 8) { // from class: io.lindstrom.m3u8.parser.p.m
        {
            e eVar = null;
        }

        @Override // io.lindstrom.m3u8.parser.S
        /* JADX INFO: renamed from: j, reason: merged with bridge method [inline-methods] */
        public void a(InterfaceC0767n.a aVar, String str, C4589t c4589t) {
            aVar.N(Long.parseLong(str));
        }
    };
    public static final EnumC4586p EXT_X_DISCONTINUITY_SEQUENCE = new EnumC4586p("EXT_X_DISCONTINUITY_SEQUENCE", 9) { // from class: io.lindstrom.m3u8.parser.p.a
        {
            e eVar = null;
        }

        @Override // io.lindstrom.m3u8.parser.S
        /* JADX INFO: renamed from: j, reason: merged with bridge method [inline-methods] */
        public void a(InterfaceC0767n.a aVar, String str, C4589t c4589t) {
            aVar.G(Long.parseLong(str));
        }
    };
    public static final EnumC4586p EXT_X_SKIP = new EnumC4586p("EXT_X_SKIP", 10) { // from class: io.lindstrom.m3u8.parser.p.b
        {
            e eVar = null;
        }

        @Override // io.lindstrom.m3u8.parser.S
        /* JADX INFO: renamed from: j, reason: merged with bridge method [inline-methods] */
        public void a(InterfaceC0767n.a aVar, String str, C4589t c4589t) {
            aVar.W(O.p(str, c4589t));
        }
    };
    public static final EnumC4586p EXT_X_PART_INF = new EnumC4586p("EXT_X_PART_INF", 11) { // from class: io.lindstrom.m3u8.parser.p.c
        {
            e eVar = null;
        }

        @Override // io.lindstrom.m3u8.parser.S
        /* JADX INFO: renamed from: j, reason: merged with bridge method [inline-methods] */
        public void a(InterfaceC0767n.a aVar, String str, C4589t c4589t) {
            aVar.R(x.p(str, c4589t));
        }
    };
    public static final EnumC4586p EXT_X_ENDLIST = new EnumC4586p("EXT_X_ENDLIST", 12) { // from class: io.lindstrom.m3u8.parser.p.d
        {
            e eVar = null;
        }

        @Override // io.lindstrom.m3u8.parser.S
        /* JADX INFO: renamed from: j, reason: merged with bridge method [inline-methods] */
        public void a(InterfaceC0767n.a aVar, String str, C4589t c4589t) {
            aVar.P(false);
        }
    };
    private static final /* synthetic */ EnumC4586p[] $VALUES = b();
    static final Map<String, EnumC4586p> tags = AbstractC4588s.f(values(), new Function() { // from class: io.lindstrom.m3u8.parser.o
        @Override // java.util.function.Function
        public final Object apply(Object obj) {
            return ((EnumC4586p) obj).tag();
        }
    });

    /* JADX INFO: renamed from: io.lindstrom.m3u8.parser.p$e */
    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public enum e extends EnumC4586p {
        public e(String str, int i10) {
            super(str, i10, null);
        }

        @Override // io.lindstrom.m3u8.parser.S
        /* JADX INFO: renamed from: j, reason: merged with bridge method [inline-methods] */
        public void a(InterfaceC0767n.a aVar, String str, C4589t c4589t) {
            aVar.Z(Integer.parseInt(str));
        }
    }

    public EnumC4586p(String str, int i10) {
    }

    public static /* synthetic */ EnumC4586p[] b() {
        return new EnumC4586p[]{EXT_X_VERSION, EXT_X_INDEPENDENT_SEGMENTS, EXT_X_START, EXT_X_I_FRAMES_ONLY, EXT_X_SERVER_CONTROL, EXT_X_ALLOW_CACHE, EXT_X_PLAYLIST_TYPE, EXT_X_TARGETDURATION, EXT_X_MEDIA_SEQUENCE, EXT_X_DISCONTINUITY_SEQUENCE, EXT_X_SKIP, EXT_X_PART_INF, EXT_X_ENDLIST};
    }

    public static EnumC4586p valueOf(String str) {
        return (EnumC4586p) Enum.valueOf(EnumC4586p.class, str);
    }

    public static EnumC4586p[] values() {
        return (EnumC4586p[]) $VALUES.clone();
    }

    public /* synthetic */ EnumC4586p(String str, int i10, e eVar) {
        this(str, i10);
    }
}
