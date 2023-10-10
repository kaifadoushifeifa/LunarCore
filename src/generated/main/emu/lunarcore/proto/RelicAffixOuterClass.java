// Code generated by protocol buffer compiler. Do not edit!
package emu.lunarcore.proto;

import java.io.IOException;
import us.hebi.quickbuf.FieldName;
import us.hebi.quickbuf.InvalidProtocolBufferException;
import us.hebi.quickbuf.JsonSink;
import us.hebi.quickbuf.JsonSource;
import us.hebi.quickbuf.MessageFactory;
import us.hebi.quickbuf.ProtoMessage;
import us.hebi.quickbuf.ProtoSink;
import us.hebi.quickbuf.ProtoSource;

public final class RelicAffixOuterClass {
  /**
   * Protobuf type {@code RelicAffix}
   */
  public static final class RelicAffix extends ProtoMessage<RelicAffix> implements Cloneable {
    private static final long serialVersionUID = 0L;

    /**
     * <code>optional uint32 affix_id = 1;</code>
     */
    private int affixId;

    /**
     * <code>optional uint32 cnt = 2;</code>
     */
    private int cnt;

    /**
     * <code>optional uint32 step = 3;</code>
     */
    private int step;

    private RelicAffix() {
    }

    /**
     * @return a new empty instance of {@code RelicAffix}
     */
    public static RelicAffix newInstance() {
      return new RelicAffix();
    }

    /**
     * <code>optional uint32 affix_id = 1;</code>
     * @return whether the affixId field is set
     */
    public boolean hasAffixId() {
      return (bitField0_ & 0x00000001) != 0;
    }

    /**
     * <code>optional uint32 affix_id = 1;</code>
     * @return this
     */
    public RelicAffix clearAffixId() {
      bitField0_ &= ~0x00000001;
      affixId = 0;
      return this;
    }

    /**
     * <code>optional uint32 affix_id = 1;</code>
     * @return the affixId
     */
    public int getAffixId() {
      return affixId;
    }

    /**
     * <code>optional uint32 affix_id = 1;</code>
     * @param value the affixId to set
     * @return this
     */
    public RelicAffix setAffixId(final int value) {
      bitField0_ |= 0x00000001;
      affixId = value;
      return this;
    }

    /**
     * <code>optional uint32 cnt = 2;</code>
     * @return whether the cnt field is set
     */
    public boolean hasCnt() {
      return (bitField0_ & 0x00000002) != 0;
    }

    /**
     * <code>optional uint32 cnt = 2;</code>
     * @return this
     */
    public RelicAffix clearCnt() {
      bitField0_ &= ~0x00000002;
      cnt = 0;
      return this;
    }

    /**
     * <code>optional uint32 cnt = 2;</code>
     * @return the cnt
     */
    public int getCnt() {
      return cnt;
    }

    /**
     * <code>optional uint32 cnt = 2;</code>
     * @param value the cnt to set
     * @return this
     */
    public RelicAffix setCnt(final int value) {
      bitField0_ |= 0x00000002;
      cnt = value;
      return this;
    }

    /**
     * <code>optional uint32 step = 3;</code>
     * @return whether the step field is set
     */
    public boolean hasStep() {
      return (bitField0_ & 0x00000004) != 0;
    }

    /**
     * <code>optional uint32 step = 3;</code>
     * @return this
     */
    public RelicAffix clearStep() {
      bitField0_ &= ~0x00000004;
      step = 0;
      return this;
    }

    /**
     * <code>optional uint32 step = 3;</code>
     * @return the step
     */
    public int getStep() {
      return step;
    }

    /**
     * <code>optional uint32 step = 3;</code>
     * @param value the step to set
     * @return this
     */
    public RelicAffix setStep(final int value) {
      bitField0_ |= 0x00000004;
      step = value;
      return this;
    }

    @Override
    public RelicAffix copyFrom(final RelicAffix other) {
      cachedSize = other.cachedSize;
      if ((bitField0_ | other.bitField0_) != 0) {
        bitField0_ = other.bitField0_;
        affixId = other.affixId;
        cnt = other.cnt;
        step = other.step;
      }
      return this;
    }

    @Override
    public RelicAffix mergeFrom(final RelicAffix other) {
      if (other.isEmpty()) {
        return this;
      }
      cachedSize = -1;
      if (other.hasAffixId()) {
        setAffixId(other.affixId);
      }
      if (other.hasCnt()) {
        setCnt(other.cnt);
      }
      if (other.hasStep()) {
        setStep(other.step);
      }
      return this;
    }

    @Override
    public RelicAffix clear() {
      if (isEmpty()) {
        return this;
      }
      cachedSize = -1;
      bitField0_ = 0;
      affixId = 0;
      cnt = 0;
      step = 0;
      return this;
    }

    @Override
    public RelicAffix clearQuick() {
      if (isEmpty()) {
        return this;
      }
      cachedSize = -1;
      bitField0_ = 0;
      return this;
    }

    @Override
    public boolean equals(Object o) {
      if (o == this) {
        return true;
      }
      if (!(o instanceof RelicAffix)) {
        return false;
      }
      RelicAffix other = (RelicAffix) o;
      return bitField0_ == other.bitField0_
        && (!hasAffixId() || affixId == other.affixId)
        && (!hasCnt() || cnt == other.cnt)
        && (!hasStep() || step == other.step);
    }

    @Override
    public void writeTo(final ProtoSink output) throws IOException {
      if ((bitField0_ & 0x00000001) != 0) {
        output.writeRawByte((byte) 8);
        output.writeUInt32NoTag(affixId);
      }
      if ((bitField0_ & 0x00000002) != 0) {
        output.writeRawByte((byte) 16);
        output.writeUInt32NoTag(cnt);
      }
      if ((bitField0_ & 0x00000004) != 0) {
        output.writeRawByte((byte) 24);
        output.writeUInt32NoTag(step);
      }
    }

    @Override
    protected int computeSerializedSize() {
      int size = 0;
      if ((bitField0_ & 0x00000001) != 0) {
        size += 1 + ProtoSink.computeUInt32SizeNoTag(affixId);
      }
      if ((bitField0_ & 0x00000002) != 0) {
        size += 1 + ProtoSink.computeUInt32SizeNoTag(cnt);
      }
      if ((bitField0_ & 0x00000004) != 0) {
        size += 1 + ProtoSink.computeUInt32SizeNoTag(step);
      }
      return size;
    }

    @Override
    @SuppressWarnings("fallthrough")
    public RelicAffix mergeFrom(final ProtoSource input) throws IOException {
      // Enabled Fall-Through Optimization (QuickBuffers)
      int tag = input.readTag();
      while (true) {
        switch (tag) {
          case 8: {
            // affixId
            affixId = input.readUInt32();
            bitField0_ |= 0x00000001;
            tag = input.readTag();
            if (tag != 16) {
              break;
            }
          }
          case 16: {
            // cnt
            cnt = input.readUInt32();
            bitField0_ |= 0x00000002;
            tag = input.readTag();
            if (tag != 24) {
              break;
            }
          }
          case 24: {
            // step
            step = input.readUInt32();
            bitField0_ |= 0x00000004;
            tag = input.readTag();
            if (tag != 0) {
              break;
            }
          }
          case 0: {
            return this;
          }
          default: {
            if (!input.skipField(tag)) {
              return this;
            }
            tag = input.readTag();
            break;
          }
        }
      }
    }

    @Override
    public void writeTo(final JsonSink output) throws IOException {
      output.beginObject();
      if ((bitField0_ & 0x00000001) != 0) {
        output.writeUInt32(FieldNames.affixId, affixId);
      }
      if ((bitField0_ & 0x00000002) != 0) {
        output.writeUInt32(FieldNames.cnt, cnt);
      }
      if ((bitField0_ & 0x00000004) != 0) {
        output.writeUInt32(FieldNames.step, step);
      }
      output.endObject();
    }

    @Override
    public RelicAffix mergeFrom(final JsonSource input) throws IOException {
      if (!input.beginObject()) {
        return this;
      }
      while (!input.isAtEnd()) {
        switch (input.readFieldHash()) {
          case -1088837877:
          case 605785578: {
            if (input.isAtField(FieldNames.affixId)) {
              if (!input.trySkipNullValue()) {
                affixId = input.readUInt32();
                bitField0_ |= 0x00000001;
              }
            } else {
              input.skipUnknownField();
            }
            break;
          }
          case 98665: {
            if (input.isAtField(FieldNames.cnt)) {
              if (!input.trySkipNullValue()) {
                cnt = input.readUInt32();
                bitField0_ |= 0x00000002;
              }
            } else {
              input.skipUnknownField();
            }
            break;
          }
          case 3540684: {
            if (input.isAtField(FieldNames.step)) {
              if (!input.trySkipNullValue()) {
                step = input.readUInt32();
                bitField0_ |= 0x00000004;
              }
            } else {
              input.skipUnknownField();
            }
            break;
          }
          default: {
            input.skipUnknownField();
            break;
          }
        }
      }
      input.endObject();
      return this;
    }

    @Override
    public RelicAffix clone() {
      return new RelicAffix().copyFrom(this);
    }

    @Override
    public boolean isEmpty() {
      return ((bitField0_) == 0);
    }

    public static RelicAffix parseFrom(final byte[] data) throws InvalidProtocolBufferException {
      return ProtoMessage.mergeFrom(new RelicAffix(), data).checkInitialized();
    }

    public static RelicAffix parseFrom(final ProtoSource input) throws IOException {
      return ProtoMessage.mergeFrom(new RelicAffix(), input).checkInitialized();
    }

    public static RelicAffix parseFrom(final JsonSource input) throws IOException {
      return ProtoMessage.mergeFrom(new RelicAffix(), input).checkInitialized();
    }

    /**
     * @return factory for creating RelicAffix messages
     */
    public static MessageFactory<RelicAffix> getFactory() {
      return RelicAffixFactory.INSTANCE;
    }

    private enum RelicAffixFactory implements MessageFactory<RelicAffix> {
      INSTANCE;

      @Override
      public RelicAffix create() {
        return RelicAffix.newInstance();
      }
    }

    /**
     * Contains name constants used for serializing JSON
     */
    static class FieldNames {
      static final FieldName affixId = FieldName.forField("affixId", "affix_id");

      static final FieldName cnt = FieldName.forField("cnt");

      static final FieldName step = FieldName.forField("step");
    }
  }
}