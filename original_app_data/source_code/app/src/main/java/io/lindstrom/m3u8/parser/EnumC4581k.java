package io.lindstrom.m3u8.parser;

import Db.InterfaceC0765l;
import java.util.Map;
import java.util.function.Function;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: io.lindstrom.m3u8.parser.k, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public abstract class EnumC4581k implements S {
    public static final EnumC4581k EXT_X_VERSION = new a("EXT_X_VERSION", 0);
    public static final EnumC4581k EXT_X_INDEPENDENT_SEGMENTS = new EnumC4581k("EXT_X_INDEPENDENT_SEGMENTS", 1) { // from class: io.lindstrom.m3u8.parser.k.b
        {
            a aVar = null;
        }

        @Override // io.lindstrom.m3u8.parser.S
        /* JADX INFO: renamed from: j, reason: merged with bridge method [inline-methods] */
        public void a(InterfaceC0765l.a aVar, String str, C4589t c4589t) {
            aVar.v(true);
        }
    };
    public static final EnumC4581k EXT_X_START = new EnumC4581k("EXT_X_START", 2) { // from class: io.lindstrom.m3u8.parser.k.c
        {
            a aVar = null;
        }

        @Override // io.lindstrom.m3u8.parser.S
        /* JADX INFO: renamed from: j, reason: merged with bridge method [inline-methods] */
        public void a(InterfaceC0765l.a aVar, String str, C4589t c4589t) {
            aVar.x(Q.p(str, c4589t));
        }
    };
    public static final EnumC4581k EXT_X_DEFINE = new EnumC4581k("EXT_X_DEFINE", 3) { // from class: io.lindstrom.m3u8.parser.k.d
        {
            a aVar = null;
        }

        @Override // io.lindstrom.m3u8.parser.S
        /* JADX INFO: renamed from: j, reason: merged with bridge method [inline-methods] */
        public void a(InterfaceC0765l.a aVar, String str, C4589t c4589t) {
            aVar.r(A.p(str, c4589t));
        }
    };
    public static final EnumC4581k EXT_X_MEDIA = new EnumC4581k("EXT_X_MEDIA", 4) { // from class: io.lindstrom.m3u8.parser.k.e
        {
            a aVar = null;
        }

        @Override // io.lindstrom.m3u8.parser.S
        /* JADX INFO: renamed from: j, reason: merged with bridge method [inline-methods] */
        public void a(InterfaceC0765l.a aVar, String str, C4589t c4589t) {
            aVar.m(EnumC4573c.p(str, c4589t));
        }
    };
    public static final EnumC4581k EXT_X_STREAM_INF = new EnumC4581k("EXT_X_STREAM_INF", 5) { // from class: io.lindstrom.m3u8.parser.k.f
        {
            a aVar = null;
        }

        @Override // io.lindstrom.m3u8.parser.S
        /* JADX INFO: renamed from: j, reason: merged with bridge method [inline-methods] */
        public void a(InterfaceC0765l.a aVar, String str, C4589t c4589t) {
        }
    };
    public static final EnumC4581k EXT_X_I_FRAME_STREAM_INF = new EnumC4581k("EXT_X_I_FRAME_STREAM_INF", 6) { // from class: io.lindstrom.m3u8.parser.k.g
        {
            a aVar = null;
        }

        @Override // io.lindstrom.m3u8.parser.S
        /* JADX INFO: renamed from: j, reason: merged with bridge method [inline-methods] */
        public void a(InterfaceC0765l.a aVar, String str, C4589t c4589t) {
            aVar.o(EnumC4578h.p(str, c4589t));
        }
    };
    public static final EnumC4581k EXT_X_SESSION_DATA = new EnumC4581k("EXT_X_SESSION_DATA", 7) { // from class: io.lindstrom.m3u8.parser.k.h
        {
            a aVar = null;
        }

        @Override // io.lindstrom.m3u8.parser.S
        /* JADX INFO: renamed from: j, reason: merged with bridge method [inline-methods] */
        public void a(InterfaceC0765l.a aVar, String str, C4589t c4589t) {
            aVar.p(M.p(str, c4589t));
        }
    };
    public static final EnumC4581k EXT_X_SESSION_KEY = new EnumC4581k("EXT_X_SESSION_KEY", 8) { // from class: io.lindstrom.m3u8.parser.k.i
        {
            a aVar = null;
        }

        @Override // io.lindstrom.m3u8.parser.S
        /* JADX INFO: renamed from: j, reason: merged with bridge method [inline-methods] */
        public void a(InterfaceC0765l.a aVar, String str, C4589t c4589t) {
            aVar.q(G.p(str, c4589t));
        }
    };
    private static final /* synthetic */ EnumC4581k[] $VALUES = b();
    static final Map<String, EnumC4581k> tags = AbstractC4588s.f(values(), new Function() { // from class: io.lindstrom.m3u8.parser.j
        @Override // java.util.function.Function
        public final Object apply(Object obj) {
            return ((EnumC4581k) obj).tag();
        }
    });

    /* JADX INFO: renamed from: io.lindstrom.m3u8.parser.k$a */
    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public enum a extends EnumC4581k {
        public a(String str, int i10) {
            super(str, i10, null);
        }

        @Override // io.lindstrom.m3u8.parser.S
        /* JADX INFO: renamed from: j, reason: merged with bridge method [inline-methods] */
        public void a(InterfaceC0765l.a aVar, String str, C4589t c4589t) {
            aVar.y(Integer.parseInt(str));
        }
    }

    public EnumC4581k(String str, int i10) {
    }

    public static /* synthetic */ EnumC4581k[] b() {
        return new EnumC4581k[]{EXT_X_VERSION, EXT_X_INDEPENDENT_SEGMENTS, EXT_X_START, EXT_X_DEFINE, EXT_X_MEDIA, EXT_X_STREAM_INF, EXT_X_I_FRAME_STREAM_INF, EXT_X_SESSION_DATA, EXT_X_SESSION_KEY};
    }

    public static EnumC4581k valueOf(String str) {
        return (EnumC4581k) Enum.valueOf(EnumC4581k.class, str);
    }

    public static EnumC4581k[] values() {
        return (EnumC4581k[]) $VALUES.clone();
    }

    public /* synthetic */ EnumC4581k(String str, int i10, a aVar) {
        this(str, i10);
    }
}
