package com.google.protobuf;

import com.google.protobuf.DescriptorProtos$FileOptions;
import com.google.protobuf.DescriptorProtos$SourceCodeInfo;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.N;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public final class DescriptorProtos$FileDescriptorProto extends GeneratedMessageLite implements InterfaceC3740t {
    private static final DescriptorProtos$FileDescriptorProto DEFAULT_INSTANCE;
    public static final int DEPENDENCY_FIELD_NUMBER = 3;
    public static final int ENUM_TYPE_FIELD_NUMBER = 5;
    public static final int EXTENSION_FIELD_NUMBER = 7;
    public static final int MESSAGE_TYPE_FIELD_NUMBER = 4;
    public static final int NAME_FIELD_NUMBER = 1;
    public static final int OPTIONS_FIELD_NUMBER = 8;
    public static final int PACKAGE_FIELD_NUMBER = 2;
    private static volatile t0 PARSER = null;
    public static final int PUBLIC_DEPENDENCY_FIELD_NUMBER = 10;
    public static final int SERVICE_FIELD_NUMBER = 6;
    public static final int SOURCE_CODE_INFO_FIELD_NUMBER = 9;
    public static final int SYNTAX_FIELD_NUMBER = 12;
    public static final int WEAK_DEPENDENCY_FIELD_NUMBER = 11;
    private int bitField0_;
    private DescriptorProtos$FileOptions options_;
    private DescriptorProtos$SourceCodeInfo sourceCodeInfo_;
    private byte memoizedIsInitialized = 2;
    private String name_ = "";
    private String package_ = "";
    private N.j dependency_ = GeneratedMessageLite.emptyProtobufList();
    private N.g publicDependency_ = GeneratedMessageLite.emptyIntList();
    private N.g weakDependency_ = GeneratedMessageLite.emptyIntList();
    private N.j messageType_ = GeneratedMessageLite.emptyProtobufList();
    private N.j enumType_ = GeneratedMessageLite.emptyProtobufList();
    private N.j service_ = GeneratedMessageLite.emptyProtobufList();
    private N.j extension_ = GeneratedMessageLite.emptyProtobufList();
    private String syntax_ = "";

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class a extends GeneratedMessageLite.b implements InterfaceC3740t {
        public /* synthetic */ a(AbstractC3732o abstractC3732o) {
            this();
        }

        public a() {
            super(DescriptorProtos$FileDescriptorProto.DEFAULT_INSTANCE);
        }
    }

    static {
        DescriptorProtos$FileDescriptorProto descriptorProtos$FileDescriptorProto = new DescriptorProtos$FileDescriptorProto();
        DEFAULT_INSTANCE = descriptorProtos$FileDescriptorProto;
        GeneratedMessageLite.registerDefaultInstance(DescriptorProtos$FileDescriptorProto.class, descriptorProtos$FileDescriptorProto);
    }

    private DescriptorProtos$FileDescriptorProto() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllDependency(Iterable<String> iterable) {
        ensureDependencyIsMutable();
        AbstractC3704a.addAll((Iterable) iterable, (List) this.dependency_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllEnumType(Iterable<? extends DescriptorProtos$EnumDescriptorProto> iterable) {
        ensureEnumTypeIsMutable();
        AbstractC3704a.addAll((Iterable) iterable, (List) this.enumType_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllExtension(Iterable<? extends DescriptorProtos$FieldDescriptorProto> iterable) {
        ensureExtensionIsMutable();
        AbstractC3704a.addAll((Iterable) iterable, (List) this.extension_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllMessageType(Iterable<? extends DescriptorProtos$DescriptorProto> iterable) {
        ensureMessageTypeIsMutable();
        AbstractC3704a.addAll((Iterable) iterable, (List) this.messageType_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllPublicDependency(Iterable<? extends Integer> iterable) {
        ensurePublicDependencyIsMutable();
        AbstractC3704a.addAll((Iterable) iterable, (List) this.publicDependency_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllService(Iterable<? extends DescriptorProtos$ServiceDescriptorProto> iterable) {
        ensureServiceIsMutable();
        AbstractC3704a.addAll((Iterable) iterable, (List) this.service_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllWeakDependency(Iterable<? extends Integer> iterable) {
        ensureWeakDependencyIsMutable();
        AbstractC3704a.addAll((Iterable) iterable, (List) this.weakDependency_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addDependency(String str) {
        str.getClass();
        ensureDependencyIsMutable();
        this.dependency_.add(str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addDependencyBytes(AbstractC3722j abstractC3722j) {
        ensureDependencyIsMutable();
        this.dependency_.add(abstractC3722j.J());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addEnumType(DescriptorProtos$EnumDescriptorProto descriptorProtos$EnumDescriptorProto) {
        descriptorProtos$EnumDescriptorProto.getClass();
        ensureEnumTypeIsMutable();
        this.enumType_.add(descriptorProtos$EnumDescriptorProto);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addExtension(DescriptorProtos$FieldDescriptorProto descriptorProtos$FieldDescriptorProto) {
        descriptorProtos$FieldDescriptorProto.getClass();
        ensureExtensionIsMutable();
        this.extension_.add(descriptorProtos$FieldDescriptorProto);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addMessageType(DescriptorProtos$DescriptorProto descriptorProtos$DescriptorProto) {
        descriptorProtos$DescriptorProto.getClass();
        ensureMessageTypeIsMutable();
        this.messageType_.add(descriptorProtos$DescriptorProto);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addPublicDependency(int i10) {
        ensurePublicDependencyIsMutable();
        this.publicDependency_.x0(i10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addService(DescriptorProtos$ServiceDescriptorProto descriptorProtos$ServiceDescriptorProto) {
        descriptorProtos$ServiceDescriptorProto.getClass();
        ensureServiceIsMutable();
        this.service_.add(descriptorProtos$ServiceDescriptorProto);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addWeakDependency(int i10) {
        ensureWeakDependencyIsMutable();
        this.weakDependency_.x0(i10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearDependency() {
        this.dependency_ = GeneratedMessageLite.emptyProtobufList();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearEnumType() {
        this.enumType_ = GeneratedMessageLite.emptyProtobufList();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearExtension() {
        this.extension_ = GeneratedMessageLite.emptyProtobufList();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearMessageType() {
        this.messageType_ = GeneratedMessageLite.emptyProtobufList();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearName() {
        this.bitField0_ &= -2;
        this.name_ = getDefaultInstance().getName();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearOptions() {
        this.options_ = null;
        this.bitField0_ &= -5;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearPackage() {
        this.bitField0_ &= -3;
        this.package_ = getDefaultInstance().getPackage();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearPublicDependency() {
        this.publicDependency_ = GeneratedMessageLite.emptyIntList();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearService() {
        this.service_ = GeneratedMessageLite.emptyProtobufList();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearSourceCodeInfo() {
        this.sourceCodeInfo_ = null;
        this.bitField0_ &= -9;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearSyntax() {
        this.bitField0_ &= -17;
        this.syntax_ = getDefaultInstance().getSyntax();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearWeakDependency() {
        this.weakDependency_ = GeneratedMessageLite.emptyIntList();
    }

    private void ensureDependencyIsMutable() {
        N.j jVar = this.dependency_;
        if (jVar.m()) {
            return;
        }
        this.dependency_ = GeneratedMessageLite.mutableCopy(jVar);
    }

    private void ensureEnumTypeIsMutable() {
        N.j jVar = this.enumType_;
        if (jVar.m()) {
            return;
        }
        this.enumType_ = GeneratedMessageLite.mutableCopy(jVar);
    }

    private void ensureExtensionIsMutable() {
        N.j jVar = this.extension_;
        if (jVar.m()) {
            return;
        }
        this.extension_ = GeneratedMessageLite.mutableCopy(jVar);
    }

    private void ensureMessageTypeIsMutable() {
        N.j jVar = this.messageType_;
        if (jVar.m()) {
            return;
        }
        this.messageType_ = GeneratedMessageLite.mutableCopy(jVar);
    }

    private void ensurePublicDependencyIsMutable() {
        N.g gVar = this.publicDependency_;
        if (gVar.m()) {
            return;
        }
        this.publicDependency_ = GeneratedMessageLite.mutableCopy(gVar);
    }

    private void ensureServiceIsMutable() {
        N.j jVar = this.service_;
        if (jVar.m()) {
            return;
        }
        this.service_ = GeneratedMessageLite.mutableCopy(jVar);
    }

    private void ensureWeakDependencyIsMutable() {
        N.g gVar = this.weakDependency_;
        if (gVar.m()) {
            return;
        }
        this.weakDependency_ = GeneratedMessageLite.mutableCopy(gVar);
    }

    public static DescriptorProtos$FileDescriptorProto getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeOptions(DescriptorProtos$FileOptions descriptorProtos$FileOptions) {
        descriptorProtos$FileOptions.getClass();
        DescriptorProtos$FileOptions descriptorProtos$FileOptions2 = this.options_;
        if (descriptorProtos$FileOptions2 == null || descriptorProtos$FileOptions2 == DescriptorProtos$FileOptions.getDefaultInstance()) {
            this.options_ = descriptorProtos$FileOptions;
        } else {
            this.options_ = (DescriptorProtos$FileOptions) ((DescriptorProtos$FileOptions.a) DescriptorProtos$FileOptions.newBuilder(this.options_).mergeFrom((GeneratedMessageLite) descriptorProtos$FileOptions)).buildPartial();
        }
        this.bitField0_ |= 4;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeSourceCodeInfo(DescriptorProtos$SourceCodeInfo descriptorProtos$SourceCodeInfo) {
        descriptorProtos$SourceCodeInfo.getClass();
        DescriptorProtos$SourceCodeInfo descriptorProtos$SourceCodeInfo2 = this.sourceCodeInfo_;
        if (descriptorProtos$SourceCodeInfo2 == null || descriptorProtos$SourceCodeInfo2 == DescriptorProtos$SourceCodeInfo.getDefaultInstance()) {
            this.sourceCodeInfo_ = descriptorProtos$SourceCodeInfo;
        } else {
            this.sourceCodeInfo_ = (DescriptorProtos$SourceCodeInfo) ((DescriptorProtos$SourceCodeInfo.a) DescriptorProtos$SourceCodeInfo.newBuilder(this.sourceCodeInfo_).mergeFrom((GeneratedMessageLite) descriptorProtos$SourceCodeInfo)).buildPartial();
        }
        this.bitField0_ |= 8;
    }

    public static a newBuilder() {
        return (a) DEFAULT_INSTANCE.createBuilder();
    }

    public static DescriptorProtos$FileDescriptorProto parseDelimitedFrom(InputStream inputStream) {
        return (DescriptorProtos$FileDescriptorProto) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static DescriptorProtos$FileDescriptorProto parseFrom(ByteBuffer byteBuffer) {
        return (DescriptorProtos$FileDescriptorProto) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static t0 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void removeEnumType(int i10) {
        ensureEnumTypeIsMutable();
        this.enumType_.remove(i10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void removeExtension(int i10) {
        ensureExtensionIsMutable();
        this.extension_.remove(i10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void removeMessageType(int i10) {
        ensureMessageTypeIsMutable();
        this.messageType_.remove(i10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void removeService(int i10) {
        ensureServiceIsMutable();
        this.service_.remove(i10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setDependency(int i10, String str) {
        str.getClass();
        ensureDependencyIsMutable();
        this.dependency_.set(i10, str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setEnumType(int i10, DescriptorProtos$EnumDescriptorProto descriptorProtos$EnumDescriptorProto) {
        descriptorProtos$EnumDescriptorProto.getClass();
        ensureEnumTypeIsMutable();
        this.enumType_.set(i10, descriptorProtos$EnumDescriptorProto);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setExtension(int i10, DescriptorProtos$FieldDescriptorProto descriptorProtos$FieldDescriptorProto) {
        descriptorProtos$FieldDescriptorProto.getClass();
        ensureExtensionIsMutable();
        this.extension_.set(i10, descriptorProtos$FieldDescriptorProto);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setMessageType(int i10, DescriptorProtos$DescriptorProto descriptorProtos$DescriptorProto) {
        descriptorProtos$DescriptorProto.getClass();
        ensureMessageTypeIsMutable();
        this.messageType_.set(i10, descriptorProtos$DescriptorProto);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setName(String str) {
        str.getClass();
        this.bitField0_ |= 1;
        this.name_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setNameBytes(AbstractC3722j abstractC3722j) {
        this.name_ = abstractC3722j.J();
        this.bitField0_ |= 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setOptions(DescriptorProtos$FileOptions descriptorProtos$FileOptions) {
        descriptorProtos$FileOptions.getClass();
        this.options_ = descriptorProtos$FileOptions;
        this.bitField0_ |= 4;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setPackage(String str) {
        str.getClass();
        this.bitField0_ |= 2;
        this.package_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setPackageBytes(AbstractC3722j abstractC3722j) {
        this.package_ = abstractC3722j.J();
        this.bitField0_ |= 2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setPublicDependency(int i10, int i11) {
        ensurePublicDependencyIsMutable();
        this.publicDependency_.D(i10, i11);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setService(int i10, DescriptorProtos$ServiceDescriptorProto descriptorProtos$ServiceDescriptorProto) {
        descriptorProtos$ServiceDescriptorProto.getClass();
        ensureServiceIsMutable();
        this.service_.set(i10, descriptorProtos$ServiceDescriptorProto);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSourceCodeInfo(DescriptorProtos$SourceCodeInfo descriptorProtos$SourceCodeInfo) {
        descriptorProtos$SourceCodeInfo.getClass();
        this.sourceCodeInfo_ = descriptorProtos$SourceCodeInfo;
        this.bitField0_ |= 8;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSyntax(String str) {
        str.getClass();
        this.bitField0_ |= 16;
        this.syntax_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSyntaxBytes(AbstractC3722j abstractC3722j) {
        this.syntax_ = abstractC3722j.J();
        this.bitField0_ |= 16;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setWeakDependency(int i10, int i11) {
        ensureWeakDependencyIsMutable();
        this.weakDependency_.D(i10, i11);
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    public final Object dynamicMethod(GeneratedMessageLite.g gVar, Object obj, Object obj2) {
        t0 cVar;
        AbstractC3732o abstractC3732o = null;
        switch (AbstractC3732o.f32325a[gVar.ordinal()]) {
            case 1:
                return new DescriptorProtos$FileDescriptorProto();
            case 2:
                return new a(abstractC3732o);
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0001\f\u0000\u0001\u0001\f\f\u0000\u0007\u0005\u0001ဈ\u0000\u0002ဈ\u0001\u0003\u001a\u0004Л\u0005Л\u0006Л\u0007Л\bᐉ\u0002\tဉ\u0003\n\u0016\u000b\u0016\fဈ\u0004", new Object[]{"bitField0_", "name_", "package_", "dependency_", "messageType_", DescriptorProtos$DescriptorProto.class, "enumType_", DescriptorProtos$EnumDescriptorProto.class, "service_", DescriptorProtos$ServiceDescriptorProto.class, "extension_", DescriptorProtos$FieldDescriptorProto.class, "options_", "sourceCodeInfo_", "publicDependency_", "weakDependency_", "syntax_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                t0 t0Var = PARSER;
                if (t0Var != null) {
                    return t0Var;
                }
                synchronized (DescriptorProtos$FileDescriptorProto.class) {
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
                return Byte.valueOf(this.memoizedIsInitialized);
            case 7:
                this.memoizedIsInitialized = (byte) (obj == null ? 0 : 1);
                return null;
            default:
                throw new UnsupportedOperationException();
        }
    }

    public String getDependency(int i10) {
        return (String) this.dependency_.get(i10);
    }

    public AbstractC3722j getDependencyBytes(int i10) {
        return AbstractC3722j.n((String) this.dependency_.get(i10));
    }

    public int getDependencyCount() {
        return this.dependency_.size();
    }

    public List<String> getDependencyList() {
        return this.dependency_;
    }

    public DescriptorProtos$EnumDescriptorProto getEnumType(int i10) {
        return (DescriptorProtos$EnumDescriptorProto) this.enumType_.get(i10);
    }

    public int getEnumTypeCount() {
        return this.enumType_.size();
    }

    public List<DescriptorProtos$EnumDescriptorProto> getEnumTypeList() {
        return this.enumType_;
    }

    public InterfaceC3736q getEnumTypeOrBuilder(int i10) {
        return (InterfaceC3736q) this.enumType_.get(i10);
    }

    public List<? extends InterfaceC3736q> getEnumTypeOrBuilderList() {
        return this.enumType_;
    }

    public DescriptorProtos$FieldDescriptorProto getExtension(int i10) {
        return (DescriptorProtos$FieldDescriptorProto) this.extension_.get(i10);
    }

    public int getExtensionCount() {
        return this.extension_.size();
    }

    public List<DescriptorProtos$FieldDescriptorProto> getExtensionList() {
        return this.extension_;
    }

    public InterfaceC3739s getExtensionOrBuilder(int i10) {
        return (InterfaceC3739s) this.extension_.get(i10);
    }

    public List<? extends InterfaceC3739s> getExtensionOrBuilderList() {
        return this.extension_;
    }

    public DescriptorProtos$DescriptorProto getMessageType(int i10) {
        return (DescriptorProtos$DescriptorProto) this.messageType_.get(i10);
    }

    public int getMessageTypeCount() {
        return this.messageType_.size();
    }

    public List<DescriptorProtos$DescriptorProto> getMessageTypeList() {
        return this.messageType_;
    }

    public InterfaceC3734p getMessageTypeOrBuilder(int i10) {
        return (InterfaceC3734p) this.messageType_.get(i10);
    }

    public List<? extends InterfaceC3734p> getMessageTypeOrBuilderList() {
        return this.messageType_;
    }

    public String getName() {
        return this.name_;
    }

    public AbstractC3722j getNameBytes() {
        return AbstractC3722j.n(this.name_);
    }

    public DescriptorProtos$FileOptions getOptions() {
        DescriptorProtos$FileOptions descriptorProtos$FileOptions = this.options_;
        return descriptorProtos$FileOptions == null ? DescriptorProtos$FileOptions.getDefaultInstance() : descriptorProtos$FileOptions;
    }

    public String getPackage() {
        return this.package_;
    }

    public AbstractC3722j getPackageBytes() {
        return AbstractC3722j.n(this.package_);
    }

    public int getPublicDependency(int i10) {
        return this.publicDependency_.getInt(i10);
    }

    public int getPublicDependencyCount() {
        return this.publicDependency_.size();
    }

    public List<Integer> getPublicDependencyList() {
        return this.publicDependency_;
    }

    public DescriptorProtos$ServiceDescriptorProto getService(int i10) {
        return (DescriptorProtos$ServiceDescriptorProto) this.service_.get(i10);
    }

    public int getServiceCount() {
        return this.service_.size();
    }

    public List<DescriptorProtos$ServiceDescriptorProto> getServiceList() {
        return this.service_;
    }

    public InterfaceC3743w getServiceOrBuilder(int i10) {
        return (InterfaceC3743w) this.service_.get(i10);
    }

    public List<? extends InterfaceC3743w> getServiceOrBuilderList() {
        return this.service_;
    }

    public DescriptorProtos$SourceCodeInfo getSourceCodeInfo() {
        DescriptorProtos$SourceCodeInfo descriptorProtos$SourceCodeInfo = this.sourceCodeInfo_;
        return descriptorProtos$SourceCodeInfo == null ? DescriptorProtos$SourceCodeInfo.getDefaultInstance() : descriptorProtos$SourceCodeInfo;
    }

    public String getSyntax() {
        return this.syntax_;
    }

    public AbstractC3722j getSyntaxBytes() {
        return AbstractC3722j.n(this.syntax_);
    }

    public int getWeakDependency(int i10) {
        return this.weakDependency_.getInt(i10);
    }

    public int getWeakDependencyCount() {
        return this.weakDependency_.size();
    }

    public List<Integer> getWeakDependencyList() {
        return this.weakDependency_;
    }

    public boolean hasName() {
        return (this.bitField0_ & 1) != 0;
    }

    public boolean hasOptions() {
        return (this.bitField0_ & 4) != 0;
    }

    public boolean hasPackage() {
        return (this.bitField0_ & 2) != 0;
    }

    public boolean hasSourceCodeInfo() {
        return (this.bitField0_ & 8) != 0;
    }

    public boolean hasSyntax() {
        return (this.bitField0_ & 16) != 0;
    }

    public static a newBuilder(DescriptorProtos$FileDescriptorProto descriptorProtos$FileDescriptorProto) {
        return (a) DEFAULT_INSTANCE.createBuilder(descriptorProtos$FileDescriptorProto);
    }

    public static DescriptorProtos$FileDescriptorProto parseDelimitedFrom(InputStream inputStream, D d10) {
        return (DescriptorProtos$FileDescriptorProto) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, d10);
    }

    public static DescriptorProtos$FileDescriptorProto parseFrom(ByteBuffer byteBuffer, D d10) {
        return (DescriptorProtos$FileDescriptorProto) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, d10);
    }

    public static DescriptorProtos$FileDescriptorProto parseFrom(AbstractC3722j abstractC3722j) {
        return (DescriptorProtos$FileDescriptorProto) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, abstractC3722j);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addEnumType(int i10, DescriptorProtos$EnumDescriptorProto descriptorProtos$EnumDescriptorProto) {
        descriptorProtos$EnumDescriptorProto.getClass();
        ensureEnumTypeIsMutable();
        this.enumType_.add(i10, descriptorProtos$EnumDescriptorProto);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addExtension(int i10, DescriptorProtos$FieldDescriptorProto descriptorProtos$FieldDescriptorProto) {
        descriptorProtos$FieldDescriptorProto.getClass();
        ensureExtensionIsMutable();
        this.extension_.add(i10, descriptorProtos$FieldDescriptorProto);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addMessageType(int i10, DescriptorProtos$DescriptorProto descriptorProtos$DescriptorProto) {
        descriptorProtos$DescriptorProto.getClass();
        ensureMessageTypeIsMutable();
        this.messageType_.add(i10, descriptorProtos$DescriptorProto);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addService(int i10, DescriptorProtos$ServiceDescriptorProto descriptorProtos$ServiceDescriptorProto) {
        descriptorProtos$ServiceDescriptorProto.getClass();
        ensureServiceIsMutable();
        this.service_.add(i10, descriptorProtos$ServiceDescriptorProto);
    }

    public static DescriptorProtos$FileDescriptorProto parseFrom(AbstractC3722j abstractC3722j, D d10) {
        return (DescriptorProtos$FileDescriptorProto) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, abstractC3722j, d10);
    }

    public static DescriptorProtos$FileDescriptorProto parseFrom(byte[] bArr) {
        return (DescriptorProtos$FileDescriptorProto) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static DescriptorProtos$FileDescriptorProto parseFrom(byte[] bArr, D d10) {
        return (DescriptorProtos$FileDescriptorProto) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, d10);
    }

    public static DescriptorProtos$FileDescriptorProto parseFrom(InputStream inputStream) {
        return (DescriptorProtos$FileDescriptorProto) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static DescriptorProtos$FileDescriptorProto parseFrom(InputStream inputStream, D d10) {
        return (DescriptorProtos$FileDescriptorProto) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, d10);
    }

    public static DescriptorProtos$FileDescriptorProto parseFrom(AbstractC3724k abstractC3724k) {
        return (DescriptorProtos$FileDescriptorProto) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, abstractC3724k);
    }

    public static DescriptorProtos$FileDescriptorProto parseFrom(AbstractC3724k abstractC3724k, D d10) {
        return (DescriptorProtos$FileDescriptorProto) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, abstractC3724k, d10);
    }
}
