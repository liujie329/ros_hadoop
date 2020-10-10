// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: src/main/proto/RosbagIdx.proto

package io.autovia.foss.proto;

public final class RosbagIdxOuterClass {
  private RosbagIdxOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface RosbagIdxOrBuilder extends
      // @@protoc_insertion_point(interface_extends:io.autovia.foss.proto.RosbagIdx)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>repeated int64 array = 1 [packed = true];</code>
     */
    java.util.List<java.lang.Long> getArrayList();
    /**
     * <code>repeated int64 array = 1 [packed = true];</code>
     */
    int getArrayCount();
    /**
     * <code>repeated int64 array = 1 [packed = true];</code>
     */
    long getArray(int index);
  }
  /**
   * Protobuf type {@code io.autovia.foss.proto.RosbagIdx}
   */
  public  static final class RosbagIdx extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:io.autovia.foss.proto.RosbagIdx)
      RosbagIdxOrBuilder {
    // Use RosbagIdx.newBuilder() to construct.
    private RosbagIdx(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private RosbagIdx() {
      array_ = java.util.Collections.emptyList();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return com.google.protobuf.UnknownFieldSet.getDefaultInstance();
    }
    private RosbagIdx(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      this();
      int mutable_bitField0_ = 0;
      try {
        boolean done = false;
        while (!done) {
          int tag = input.readTag();
          switch (tag) {
            case 0:
              done = true;
              break;
            default: {
              if (!input.skipField(tag)) {
                done = true;
              }
              break;
            }
            case 8: {
              if (!((mutable_bitField0_ & 0x00000001) == 0x00000001)) {
                array_ = new java.util.ArrayList<java.lang.Long>();
                mutable_bitField0_ |= 0x00000001;
              }
              array_.add(input.readInt64());
              break;
            }
            case 10: {
              int length = input.readRawVarint32();
              int limit = input.pushLimit(length);
              if (!((mutable_bitField0_ & 0x00000001) == 0x00000001) && input.getBytesUntilLimit() > 0) {
                array_ = new java.util.ArrayList<java.lang.Long>();
                mutable_bitField0_ |= 0x00000001;
              }
              while (input.getBytesUntilLimit() > 0) {
                array_.add(input.readInt64());
              }
              input.popLimit(limit);
              break;
            }
          }
        }
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        throw e.setUnfinishedMessage(this);
      } catch (java.io.IOException e) {
        throw new com.google.protobuf.InvalidProtocolBufferException(
            e).setUnfinishedMessage(this);
      } finally {
        if (((mutable_bitField0_ & 0x00000001) == 0x00000001)) {
          array_ = java.util.Collections.unmodifiableList(array_);
        }
        makeExtensionsImmutable();
      }
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return io.autovia.foss.proto.RosbagIdxOuterClass.internal_static_io_autovia_foss_proto_RosbagIdx_descriptor;
    }

    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return io.autovia.foss.proto.RosbagIdxOuterClass.internal_static_io_autovia_foss_proto_RosbagIdx_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              io.autovia.foss.proto.RosbagIdxOuterClass.RosbagIdx.class, io.autovia.foss.proto.RosbagIdxOuterClass.RosbagIdx.Builder.class);
    }

    public static final int ARRAY_FIELD_NUMBER = 1;
    private java.util.List<java.lang.Long> array_;
    /**
     * <code>repeated int64 array = 1 [packed = true];</code>
     */
    public java.util.List<java.lang.Long>
        getArrayList() {
      return array_;
    }
    /**
     * <code>repeated int64 array = 1 [packed = true];</code>
     */
    public int getArrayCount() {
      return array_.size();
    }
    /**
     * <code>repeated int64 array = 1 [packed = true];</code>
     */
    public long getArray(int index) {
      return array_.get(index);
    }
    private int arrayMemoizedSerializedSize = -1;

    private byte memoizedIsInitialized = -1;
    public final boolean isInitialized() {
      byte isInitialized = memoizedIsInitialized;
      if (isInitialized == 1) return true;
      if (isInitialized == 0) return false;

      memoizedIsInitialized = 1;
      return true;
    }

    public void writeTo(com.google.protobuf.CodedOutputStream output)
                        throws java.io.IOException {
      getSerializedSize();
      if (getArrayList().size() > 0) {
        output.writeUInt32NoTag(10);
        output.writeUInt32NoTag(arrayMemoizedSerializedSize);
      }
      for (int i = 0; i < array_.size(); i++) {
        output.writeInt64NoTag(array_.get(i));
      }
    }

    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      {
        int dataSize = 0;
        for (int i = 0; i < array_.size(); i++) {
          dataSize += com.google.protobuf.CodedOutputStream
            .computeInt64SizeNoTag(array_.get(i));
        }
        size += dataSize;
        if (!getArrayList().isEmpty()) {
          size += 1;
          size += com.google.protobuf.CodedOutputStream
              .computeInt32SizeNoTag(dataSize);
        }
        arrayMemoizedSerializedSize = dataSize;
      }
      memoizedSize = size;
      return size;
    }

    private static final long serialVersionUID = 0L;
    @java.lang.Override
    public boolean equals(final java.lang.Object obj) {
      if (obj == this) {
       return true;
      }
      if (!(obj instanceof io.autovia.foss.proto.RosbagIdxOuterClass.RosbagIdx)) {
        return super.equals(obj);
      }
      io.autovia.foss.proto.RosbagIdxOuterClass.RosbagIdx other = (io.autovia.foss.proto.RosbagIdxOuterClass.RosbagIdx) obj;

      boolean result = true;
      result = result && getArrayList()
          .equals(other.getArrayList());
      return result;
    }

    @java.lang.Override
    public int hashCode() {
      if (memoizedHashCode != 0) {
        return memoizedHashCode;
      }
      int hash = 41;
      hash = (19 * hash) + getDescriptor().hashCode();
      if (getArrayCount() > 0) {
        hash = (37 * hash) + ARRAY_FIELD_NUMBER;
        hash = (53 * hash) + getArrayList().hashCode();
      }
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static io.autovia.foss.proto.RosbagIdxOuterClass.RosbagIdx parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static io.autovia.foss.proto.RosbagIdxOuterClass.RosbagIdx parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static io.autovia.foss.proto.RosbagIdxOuterClass.RosbagIdx parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static io.autovia.foss.proto.RosbagIdxOuterClass.RosbagIdx parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static io.autovia.foss.proto.RosbagIdxOuterClass.RosbagIdx parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static io.autovia.foss.proto.RosbagIdxOuterClass.RosbagIdx parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static io.autovia.foss.proto.RosbagIdxOuterClass.RosbagIdx parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static io.autovia.foss.proto.RosbagIdxOuterClass.RosbagIdx parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static io.autovia.foss.proto.RosbagIdxOuterClass.RosbagIdx parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static io.autovia.foss.proto.RosbagIdxOuterClass.RosbagIdx parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static io.autovia.foss.proto.RosbagIdxOuterClass.RosbagIdx parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static io.autovia.foss.proto.RosbagIdxOuterClass.RosbagIdx parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }

    public Builder newBuilderForType() { return newBuilder(); }
    public static Builder newBuilder() {
      return DEFAULT_INSTANCE.toBuilder();
    }
    public static Builder newBuilder(io.autovia.foss.proto.RosbagIdxOuterClass.RosbagIdx prototype) {
      return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
    }
    public Builder toBuilder() {
      return this == DEFAULT_INSTANCE
          ? new Builder() : new Builder().mergeFrom(this);
    }

    @java.lang.Override
    protected Builder newBuilderForType(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      Builder builder = new Builder(parent);
      return builder;
    }
    /**
     * Protobuf type {@code io.autovia.foss.proto.RosbagIdx}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:io.autovia.foss.proto.RosbagIdx)
        io.autovia.foss.proto.RosbagIdxOuterClass.RosbagIdxOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return io.autovia.foss.proto.RosbagIdxOuterClass.internal_static_io_autovia_foss_proto_RosbagIdx_descriptor;
      }

      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return io.autovia.foss.proto.RosbagIdxOuterClass.internal_static_io_autovia_foss_proto_RosbagIdx_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                io.autovia.foss.proto.RosbagIdxOuterClass.RosbagIdx.class, io.autovia.foss.proto.RosbagIdxOuterClass.RosbagIdx.Builder.class);
      }

      // Construct using io.autovia.foss.proto.RosbagIdxOuterClass.RosbagIdx.newBuilder()
      private Builder() {
        maybeForceBuilderInitialization();
      }

      private Builder(
          com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
        super(parent);
        maybeForceBuilderInitialization();
      }
      private void maybeForceBuilderInitialization() {
        if (com.google.protobuf.GeneratedMessageV3
                .alwaysUseFieldBuilders) {
        }
      }
      public Builder clear() {
        super.clear();
        array_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
        return this;
      }

      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return io.autovia.foss.proto.RosbagIdxOuterClass.internal_static_io_autovia_foss_proto_RosbagIdx_descriptor;
      }

      public io.autovia.foss.proto.RosbagIdxOuterClass.RosbagIdx getDefaultInstanceForType() {
        return io.autovia.foss.proto.RosbagIdxOuterClass.RosbagIdx.getDefaultInstance();
      }

      public io.autovia.foss.proto.RosbagIdxOuterClass.RosbagIdx build() {
        io.autovia.foss.proto.RosbagIdxOuterClass.RosbagIdx result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      public io.autovia.foss.proto.RosbagIdxOuterClass.RosbagIdx buildPartial() {
        io.autovia.foss.proto.RosbagIdxOuterClass.RosbagIdx result = new io.autovia.foss.proto.RosbagIdxOuterClass.RosbagIdx(this);
        int from_bitField0_ = bitField0_;
        if (((bitField0_ & 0x00000001) == 0x00000001)) {
          array_ = java.util.Collections.unmodifiableList(array_);
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.array_ = array_;
        onBuilt();
        return result;
      }

      public Builder clone() {
        return (Builder) super.clone();
      }
      public Builder setField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          Object value) {
        return (Builder) super.setField(field, value);
      }
      public Builder clearField(
          com.google.protobuf.Descriptors.FieldDescriptor field) {
        return (Builder) super.clearField(field);
      }
      public Builder clearOneof(
          com.google.protobuf.Descriptors.OneofDescriptor oneof) {
        return (Builder) super.clearOneof(oneof);
      }
      public Builder setRepeatedField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          int index, Object value) {
        return (Builder) super.setRepeatedField(field, index, value);
      }
      public Builder addRepeatedField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          Object value) {
        return (Builder) super.addRepeatedField(field, value);
      }
      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof io.autovia.foss.proto.RosbagIdxOuterClass.RosbagIdx) {
          return mergeFrom((io.autovia.foss.proto.RosbagIdxOuterClass.RosbagIdx)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(io.autovia.foss.proto.RosbagIdxOuterClass.RosbagIdx other) {
        if (other == io.autovia.foss.proto.RosbagIdxOuterClass.RosbagIdx.getDefaultInstance()) return this;
        if (!other.array_.isEmpty()) {
          if (array_.isEmpty()) {
            array_ = other.array_;
            bitField0_ = (bitField0_ & ~0x00000001);
          } else {
            ensureArrayIsMutable();
            array_.addAll(other.array_);
          }
          onChanged();
        }
        onChanged();
        return this;
      }

      public final boolean isInitialized() {
        return true;
      }

      public Builder mergeFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
        io.autovia.foss.proto.RosbagIdxOuterClass.RosbagIdx parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (io.autovia.foss.proto.RosbagIdxOuterClass.RosbagIdx) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }
      private int bitField0_;

      private java.util.List<java.lang.Long> array_ = java.util.Collections.emptyList();
      private void ensureArrayIsMutable() {
        if (!((bitField0_ & 0x00000001) == 0x00000001)) {
          array_ = new java.util.ArrayList<java.lang.Long>(array_);
          bitField0_ |= 0x00000001;
         }
      }
      /**
       * <code>repeated int64 array = 1 [packed = true];</code>
       */
      public java.util.List<java.lang.Long>
          getArrayList() {
        return java.util.Collections.unmodifiableList(array_);
      }
      /**
       * <code>repeated int64 array = 1 [packed = true];</code>
       */
      public int getArrayCount() {
        return array_.size();
      }
      /**
       * <code>repeated int64 array = 1 [packed = true];</code>
       */
      public long getArray(int index) {
        return array_.get(index);
      }
      /**
       * <code>repeated int64 array = 1 [packed = true];</code>
       */
      public Builder setArray(
          int index, long value) {
        ensureArrayIsMutable();
        array_.set(index, value);
        onChanged();
        return this;
      }
      /**
       * <code>repeated int64 array = 1 [packed = true];</code>
       */
      public Builder addArray(long value) {
        ensureArrayIsMutable();
        array_.add(value);
        onChanged();
        return this;
      }
      /**
       * <code>repeated int64 array = 1 [packed = true];</code>
       */
      public Builder addAllArray(
          java.lang.Iterable<? extends java.lang.Long> values) {
        ensureArrayIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, array_);
        onChanged();
        return this;
      }
      /**
       * <code>repeated int64 array = 1 [packed = true];</code>
       */
      public Builder clearArray() {
        array_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
        return this;
      }
      public final Builder setUnknownFields(
          final com.google.protobuf.UnknownFieldSet unknownFields) {
        return this;
      }

      public final Builder mergeUnknownFields(
          final com.google.protobuf.UnknownFieldSet unknownFields) {
        return this;
      }


      // @@protoc_insertion_point(builder_scope:io.autovia.foss.proto.RosbagIdx)
    }

    // @@protoc_insertion_point(class_scope:io.autovia.foss.proto.RosbagIdx)
    private static final io.autovia.foss.proto.RosbagIdxOuterClass.RosbagIdx DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new io.autovia.foss.proto.RosbagIdxOuterClass.RosbagIdx();
    }

    public static io.autovia.foss.proto.RosbagIdxOuterClass.RosbagIdx getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<RosbagIdx>
        PARSER = new com.google.protobuf.AbstractParser<RosbagIdx>() {
      public RosbagIdx parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
          return new RosbagIdx(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<RosbagIdx> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<RosbagIdx> getParserForType() {
      return PARSER;
    }

    public io.autovia.foss.proto.RosbagIdxOuterClass.RosbagIdx getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_io_autovia_foss_proto_RosbagIdx_descriptor;
  private static final
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_io_autovia_foss_proto_RosbagIdx_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\036src/main/proto/RosbagIdx.proto\022\025de.val" +
      "tech.foss.proto\"\036\n\tRosbagIdx\022\021\n\005array\030\001 " +
      "\003(\003B\002\020\001b\006proto3"
    };
    com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner assigner =
        new com.google.protobuf.Descriptors.FileDescriptor.    InternalDescriptorAssigner() {
          public com.google.protobuf.ExtensionRegistry assignDescriptors(
              com.google.protobuf.Descriptors.FileDescriptor root) {
            descriptor = root;
            return null;
          }
        };
    com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        }, assigner);
    internal_static_io_autovia_foss_proto_RosbagIdx_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_io_autovia_foss_proto_RosbagIdx_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_io_autovia_foss_proto_RosbagIdx_descriptor,
        new java.lang.String[] { "Array", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}