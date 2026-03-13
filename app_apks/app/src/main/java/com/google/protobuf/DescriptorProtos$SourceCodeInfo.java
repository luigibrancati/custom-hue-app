package com.google.protobuf;

import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.N;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public final class DescriptorProtos$SourceCodeInfo extends GeneratedMessageLite implements InterfaceC3719h0 {
    private static final DescriptorProtos$SourceCodeInfo DEFAULT_INSTANCE;
    public static final int LOCATION_FIELD_NUMBER = 1;
    private static volatile t0 PARSER;
    private N.j location_ = GeneratedMessageLite.emptyProtobufList();

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class Location extends GeneratedMessageLite implements b {
        private static final Location DEFAULT_INSTANCE;
        public static final int LEADING_COMMENTS_FIELD_NUMBER = 3;
        public static final int LEADING_DETACHED_COMMENTS_FIELD_NUMBER = 6;
        private static volatile t0 PARSER = null;
        public static final int PATH_FIELD_NUMBER = 1;
        public static final int SPAN_FIELD_NUMBER = 2;
        public static final int TRAILING_COMMENTS_FIELD_NUMBER = 4;
        private int bitField0_;
        private int pathMemoizedSerializedSize = -1;
        private int spanMemoizedSerializedSize = -1;
        private N.g path_ = GeneratedMessageLite.emptyIntList();
        private N.g span_ = GeneratedMessageLite.emptyIntList();
        private String leadingComments_ = "";
        private String trailingComments_ = "";
        private N.j leadingDetachedComments_ = GeneratedMessageLite.emptyProtobufList();

        /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
        public static final class a extends GeneratedMessageLite.b implements b {
            public /* synthetic */ a(AbstractC3732o abstractC3732o) {
                this();
            }

            public a() {
                super(Location.DEFAULT_INSTANCE);
            }
        }

        static {
            Location location = new Location();
            DEFAULT_INSTANCE = location;
            GeneratedMessageLite.registerDefaultInstance(Location.class, location);
        }

        private Location() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addAllLeadingDetachedComments(Iterable<String> iterable) {
            ensureLeadingDetachedCommentsIsMutable();
            AbstractC3704a.addAll((Iterable) iterable, (List) this.leadingDetachedComments_);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addAllPath(Iterable<? extends Integer> iterable) {
            ensurePathIsMutable();
            AbstractC3704a.addAll((Iterable) iterable, (List) this.path_);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addAllSpan(Iterable<? extends Integer> iterable) {
            ensureSpanIsMutable();
            AbstractC3704a.addAll((Iterable) iterable, (List) this.span_);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addLeadingDetachedComments(String str) {
            str.getClass();
            ensureLeadingDetachedCommentsIsMutable();
            this.leadingDetachedComments_.add(str);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addLeadingDetachedCommentsBytes(AbstractC3722j abstractC3722j) {
            ensureLeadingDetachedCommentsIsMutable();
            this.leadingDetachedComments_.add(abstractC3722j.J());
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addPath(int i10) {
            ensurePathIsMutable();
            this.path_.x0(i10);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addSpan(int i10) {
            ensureSpanIsMutable();
            this.span_.x0(i10);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearLeadingComments() {
            this.bitField0_ &= -2;
            this.leadingComments_ = getDefaultInstance().getLeadingComments();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearLeadingDetachedComments() {
            this.leadingDetachedComments_ = GeneratedMessageLite.emptyProtobufList();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearPath() {
            this.path_ = GeneratedMessageLite.emptyIntList();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearSpan() {
            this.span_ = GeneratedMessageLite.emptyIntList();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearTrailingComments() {
            this.bitField0_ &= -3;
            this.trailingComments_ = getDefaultInstance().getTrailingComments();
        }

        private void ensureLeadingDetachedCommentsIsMutable() {
            N.j jVar = this.leadingDetachedComments_;
            if (jVar.m()) {
                return;
            }
            this.leadingDetachedComments_ = GeneratedMessageLite.mutableCopy(jVar);
        }

        private void ensurePathIsMutable() {
            N.g gVar = this.path_;
            if (gVar.m()) {
                return;
            }
            this.path_ = GeneratedMessageLite.mutableCopy(gVar);
        }

        private void ensureSpanIsMutable() {
            N.g gVar = this.span_;
            if (gVar.m()) {
                return;
            }
            this.span_ = GeneratedMessageLite.mutableCopy(gVar);
        }

        public static Location getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static a newBuilder() {
            return (a) DEFAULT_INSTANCE.createBuilder();
        }

        public static Location parseDelimitedFrom(InputStream inputStream) {
            return (Location) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static Location parseFrom(ByteBuffer byteBuffer) {
            return (Location) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static t0 parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setLeadingComments(String str) {
            str.getClass();
            this.bitField0_ |= 1;
            this.leadingComments_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setLeadingCommentsBytes(AbstractC3722j abstractC3722j) {
            this.leadingComments_ = abstractC3722j.J();
            this.bitField0_ |= 1;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setLeadingDetachedComments(int i10, String str) {
            str.getClass();
            ensureLeadingDetachedCommentsIsMutable();
            this.leadingDetachedComments_.set(i10, str);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setPath(int i10, int i11) {
            ensurePathIsMutable();
            this.path_.D(i10, i11);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setSpan(int i10, int i11) {
            ensureSpanIsMutable();
            this.span_.D(i10, i11);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setTrailingComments(String str) {
            str.getClass();
            this.bitField0_ |= 2;
            this.trailingComments_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setTrailingCommentsBytes(AbstractC3722j abstractC3722j) {
            this.trailingComments_ = abstractC3722j.J();
            this.bitField0_ |= 2;
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        public final Object dynamicMethod(GeneratedMessageLite.g gVar, Object obj, Object obj2) {
            t0 cVar;
            int i10 = AbstractC3732o.f32325a[gVar.ordinal()];
            AbstractC3732o abstractC3732o = null;
            switch (i10) {
                case 1:
                    return new Location();
                case 2:
                    return new a(abstractC3732o);
                case 3:
                    return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0005\u0000\u0001\u0001\u0006\u0005\u0000\u0003\u0000\u0001'\u0002'\u0003ဈ\u0000\u0004ဈ\u0001\u0006\u001a", new Object[]{"bitField0_", "path_", "span_", "leadingComments_", "trailingComments_", "leadingDetachedComments_"});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    t0 t0Var = PARSER;
                    if (t0Var != null) {
                        return t0Var;
                    }
                    synchronized (Location.class) {
                        try {
                            cVar = PARSER;
                            if (cVar == null) {
                                cVar = new GeneratedMessageLite.c(DEFAULT_INSTANCE);
                                PARSER = cVar;
                            }
                        } catch (Throwable th) {
                            throw th;
                        }
                        break;
                    }
                    return cVar;
                case 6:
                    return (byte) 1;
                case 7:
                    return null;
                default:
                    throw new UnsupportedOperationException();
            }
        }

        public String getLeadingComments() {
            return this.leadingComments_;
        }

        public AbstractC3722j getLeadingCommentsBytes() {
            return AbstractC3722j.n(this.leadingComments_);
        }

        public String getLeadingDetachedComments(int i10) {
            return (String) this.leadingDetachedComments_.get(i10);
        }

        public AbstractC3722j getLeadingDetachedCommentsBytes(int i10) {
            return AbstractC3722j.n((String) this.leadingDetachedComments_.get(i10));
        }

        public int getLeadingDetachedCommentsCount() {
            return this.leadingDetachedComments_.size();
        }

        public List<String> getLeadingDetachedCommentsList() {
            return this.leadingDetachedComments_;
        }

        public int getPath(int i10) {
            return this.path_.getInt(i10);
        }

        public int getPathCount() {
            return this.path_.size();
        }

        public List<Integer> getPathList() {
            return this.path_;
        }

        public int getSpan(int i10) {
            return this.span_.getInt(i10);
        }

        public int getSpanCount() {
            return this.span_.size();
        }

        public List<Integer> getSpanList() {
            return this.span_;
        }

        public String getTrailingComments() {
            return this.trailingComments_;
        }

        public AbstractC3722j getTrailingCommentsBytes() {
            return AbstractC3722j.n(this.trailingComments_);
        }

        public boolean hasLeadingComments() {
            return (this.bitField0_ & 1) != 0;
        }

        public boolean hasTrailingComments() {
            return (this.bitField0_ & 2) != 0;
        }

        public static a newBuilder(Location location) {
            return (a) DEFAULT_INSTANCE.createBuilder(location);
        }

        public static Location parseDelimitedFrom(InputStream inputStream, D d10) {
            return (Location) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, d10);
        }

        public static Location parseFrom(ByteBuffer byteBuffer, D d10) {
            return (Location) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, d10);
        }

        public static Location parseFrom(AbstractC3722j abstractC3722j) {
            return (Location) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, abstractC3722j);
        }

        public static Location parseFrom(AbstractC3722j abstractC3722j, D d10) {
            return (Location) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, abstractC3722j, d10);
        }

        public static Location parseFrom(byte[] bArr) {
            return (Location) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static Location parseFrom(byte[] bArr, D d10) {
            return (Location) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, d10);
        }

        public static Location parseFrom(InputStream inputStream) {
            return (Location) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static Location parseFrom(InputStream inputStream, D d10) {
            return (Location) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, d10);
        }

        public static Location parseFrom(AbstractC3724k abstractC3724k) {
            return (Location) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, abstractC3724k);
        }

        public static Location parseFrom(AbstractC3724k abstractC3724k, D d10) {
            return (Location) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, abstractC3724k, d10);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class a extends GeneratedMessageLite.b implements InterfaceC3719h0 {
        public /* synthetic */ a(AbstractC3732o abstractC3732o) {
            this();
        }

        public a() {
            super(DescriptorProtos$SourceCodeInfo.DEFAULT_INSTANCE);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public interface b extends InterfaceC3719h0 {
    }

    static {
        DescriptorProtos$SourceCodeInfo descriptorProtos$SourceCodeInfo = new DescriptorProtos$SourceCodeInfo();
        DEFAULT_INSTANCE = descriptorProtos$SourceCodeInfo;
        GeneratedMessageLite.registerDefaultInstance(DescriptorProtos$SourceCodeInfo.class, descriptorProtos$SourceCodeInfo);
    }

    private DescriptorProtos$SourceCodeInfo() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllLocation(Iterable<? extends Location> iterable) {
        ensureLocationIsMutable();
        AbstractC3704a.addAll((Iterable) iterable, (List) this.location_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addLocation(Location location) {
        location.getClass();
        ensureLocationIsMutable();
        this.location_.add(location);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearLocation() {
        this.location_ = GeneratedMessageLite.emptyProtobufList();
    }

    private void ensureLocationIsMutable() {
        N.j jVar = this.location_;
        if (jVar.m()) {
            return;
        }
        this.location_ = GeneratedMessageLite.mutableCopy(jVar);
    }

    public static DescriptorProtos$SourceCodeInfo getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static a newBuilder() {
        return (a) DEFAULT_INSTANCE.createBuilder();
    }

    public static DescriptorProtos$SourceCodeInfo parseDelimitedFrom(InputStream inputStream) {
        return (DescriptorProtos$SourceCodeInfo) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static DescriptorProtos$SourceCodeInfo parseFrom(ByteBuffer byteBuffer) {
        return (DescriptorProtos$SourceCodeInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static t0 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void removeLocation(int i10) {
        ensureLocationIsMutable();
        this.location_.remove(i10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setLocation(int i10, Location location) {
        location.getClass();
        ensureLocationIsMutable();
        this.location_.set(i10, location);
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    public final Object dynamicMethod(GeneratedMessageLite.g gVar, Object obj, Object obj2) {
        t0 cVar;
        int i10 = AbstractC3732o.f32325a[gVar.ordinal()];
        AbstractC3732o abstractC3732o = null;
        switch (i10) {
            case 1:
                return new DescriptorProtos$SourceCodeInfo();
            case 2:
                return new a(abstractC3732o);
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"location_", Location.class});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                t0 t0Var = PARSER;
                if (t0Var != null) {
                    return t0Var;
                }
                synchronized (DescriptorProtos$SourceCodeInfo.class) {
                    try {
                        cVar = PARSER;
                        if (cVar == null) {
                            cVar = new GeneratedMessageLite.c(DEFAULT_INSTANCE);
                            PARSER = cVar;
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                    break;
                }
                return cVar;
            case 6:
                return (byte) 1;
            case 7:
                return null;
            default:
                throw new UnsupportedOperationException();
        }
    }

    public Location getLocation(int i10) {
        return (Location) this.location_.get(i10);
    }

    public int getLocationCount() {
        return this.location_.size();
    }

    public List<Location> getLocationList() {
        return this.location_;
    }

    public b getLocationOrBuilder(int i10) {
        return (b) this.location_.get(i10);
    }

    public List<? extends b> getLocationOrBuilderList() {
        return this.location_;
    }

    public static a newBuilder(DescriptorProtos$SourceCodeInfo descriptorProtos$SourceCodeInfo) {
        return (a) DEFAULT_INSTANCE.createBuilder(descriptorProtos$SourceCodeInfo);
    }

    public static DescriptorProtos$SourceCodeInfo parseDelimitedFrom(InputStream inputStream, D d10) {
        return (DescriptorProtos$SourceCodeInfo) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, d10);
    }

    public static DescriptorProtos$SourceCodeInfo parseFrom(ByteBuffer byteBuffer, D d10) {
        return (DescriptorProtos$SourceCodeInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, d10);
    }

    public static DescriptorProtos$SourceCodeInfo parseFrom(AbstractC3722j abstractC3722j) {
        return (DescriptorProtos$SourceCodeInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, abstractC3722j);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addLocation(int i10, Location location) {
        location.getClass();
        ensureLocationIsMutable();
        this.location_.add(i10, location);
    }

    public static DescriptorProtos$SourceCodeInfo parseFrom(AbstractC3722j abstractC3722j, D d10) {
        return (DescriptorProtos$SourceCodeInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, abstractC3722j, d10);
    }

    public static DescriptorProtos$SourceCodeInfo parseFrom(byte[] bArr) {
        return (DescriptorProtos$SourceCodeInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static DescriptorProtos$SourceCodeInfo parseFrom(byte[] bArr, D d10) {
        return (DescriptorProtos$SourceCodeInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, d10);
    }

    public static DescriptorProtos$SourceCodeInfo parseFrom(InputStream inputStream) {
        return (DescriptorProtos$SourceCodeInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static DescriptorProtos$SourceCodeInfo parseFrom(InputStream inputStream, D d10) {
        return (DescriptorProtos$SourceCodeInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, d10);
    }

    public static DescriptorProtos$SourceCodeInfo parseFrom(AbstractC3724k abstractC3724k) {
        return (DescriptorProtos$SourceCodeInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, abstractC3724k);
    }

    public static DescriptorProtos$SourceCodeInfo parseFrom(AbstractC3724k abstractC3724k, D d10) {
        return (DescriptorProtos$SourceCodeInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, abstractC3724k, d10);
    }
}
