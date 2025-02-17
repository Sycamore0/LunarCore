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
import us.hebi.quickbuf.RepeatedMessage;

public final class TakeChallengeRewardScRspOuterClass {
  /**
   * Protobuf type {@code TakeChallengeRewardScRsp}
   */
  public static final class TakeChallengeRewardScRsp extends ProtoMessage<TakeChallengeRewardScRsp> implements Cloneable {
    private static final long serialVersionUID = 0L;

    /**
     * <code>optional uint32 group_id = 10;</code>
     */
    private int groupId;

    /**
     * <code>optional uint32 retcode = 11;</code>
     */
    private int retcode;

    /**
     * <code>repeated .TakenChallengeRewardInfo taken_reward_list = 5;</code>
     */
    private final RepeatedMessage<TakenChallengeRewardInfoOuterClass.TakenChallengeRewardInfo> takenRewardList = RepeatedMessage.newEmptyInstance(TakenChallengeRewardInfoOuterClass.TakenChallengeRewardInfo.getFactory());

    private TakeChallengeRewardScRsp() {
    }

    /**
     * @return a new empty instance of {@code TakeChallengeRewardScRsp}
     */
    public static TakeChallengeRewardScRsp newInstance() {
      return new TakeChallengeRewardScRsp();
    }

    /**
     * <code>optional uint32 group_id = 10;</code>
     * @return whether the groupId field is set
     */
    public boolean hasGroupId() {
      return (bitField0_ & 0x00000001) != 0;
    }

    /**
     * <code>optional uint32 group_id = 10;</code>
     * @return this
     */
    public TakeChallengeRewardScRsp clearGroupId() {
      bitField0_ &= ~0x00000001;
      groupId = 0;
      return this;
    }

    /**
     * <code>optional uint32 group_id = 10;</code>
     * @return the groupId
     */
    public int getGroupId() {
      return groupId;
    }

    /**
     * <code>optional uint32 group_id = 10;</code>
     * @param value the groupId to set
     * @return this
     */
    public TakeChallengeRewardScRsp setGroupId(final int value) {
      bitField0_ |= 0x00000001;
      groupId = value;
      return this;
    }

    /**
     * <code>optional uint32 retcode = 11;</code>
     * @return whether the retcode field is set
     */
    public boolean hasRetcode() {
      return (bitField0_ & 0x00000002) != 0;
    }

    /**
     * <code>optional uint32 retcode = 11;</code>
     * @return this
     */
    public TakeChallengeRewardScRsp clearRetcode() {
      bitField0_ &= ~0x00000002;
      retcode = 0;
      return this;
    }

    /**
     * <code>optional uint32 retcode = 11;</code>
     * @return the retcode
     */
    public int getRetcode() {
      return retcode;
    }

    /**
     * <code>optional uint32 retcode = 11;</code>
     * @param value the retcode to set
     * @return this
     */
    public TakeChallengeRewardScRsp setRetcode(final int value) {
      bitField0_ |= 0x00000002;
      retcode = value;
      return this;
    }

    /**
     * <code>repeated .TakenChallengeRewardInfo taken_reward_list = 5;</code>
     * @return whether the takenRewardList field is set
     */
    public boolean hasTakenRewardList() {
      return (bitField0_ & 0x00000004) != 0;
    }

    /**
     * <code>repeated .TakenChallengeRewardInfo taken_reward_list = 5;</code>
     * @return this
     */
    public TakeChallengeRewardScRsp clearTakenRewardList() {
      bitField0_ &= ~0x00000004;
      takenRewardList.clear();
      return this;
    }

    /**
     * <code>repeated .TakenChallengeRewardInfo taken_reward_list = 5;</code>
     *
     * This method returns the internal storage object without modifying any has state.
     * The returned object should not be modified and be treated as read-only.
     *
     * Use {@link #getMutableTakenRewardList()} if you want to modify it.
     *
     * @return internal storage object for reading
     */
    public RepeatedMessage<TakenChallengeRewardInfoOuterClass.TakenChallengeRewardInfo> getTakenRewardList(
        ) {
      return takenRewardList;
    }

    /**
     * <code>repeated .TakenChallengeRewardInfo taken_reward_list = 5;</code>
     *
     * This method returns the internal storage object and sets the corresponding
     * has state. The returned object will become part of this message and its
     * contents may be modified as long as the has state is not cleared.
     *
     * @return internal storage object for modifications
     */
    public RepeatedMessage<TakenChallengeRewardInfoOuterClass.TakenChallengeRewardInfo> getMutableTakenRewardList(
        ) {
      bitField0_ |= 0x00000004;
      return takenRewardList;
    }

    /**
     * <code>repeated .TakenChallengeRewardInfo taken_reward_list = 5;</code>
     * @param value the takenRewardList to add
     * @return this
     */
    public TakeChallengeRewardScRsp addTakenRewardList(
        final TakenChallengeRewardInfoOuterClass.TakenChallengeRewardInfo value) {
      bitField0_ |= 0x00000004;
      takenRewardList.add(value);
      return this;
    }

    /**
     * <code>repeated .TakenChallengeRewardInfo taken_reward_list = 5;</code>
     * @param values the takenRewardList to add
     * @return this
     */
    public TakeChallengeRewardScRsp addAllTakenRewardList(
        final TakenChallengeRewardInfoOuterClass.TakenChallengeRewardInfo... values) {
      bitField0_ |= 0x00000004;
      takenRewardList.addAll(values);
      return this;
    }

    @Override
    public TakeChallengeRewardScRsp copyFrom(final TakeChallengeRewardScRsp other) {
      cachedSize = other.cachedSize;
      if ((bitField0_ | other.bitField0_) != 0) {
        bitField0_ = other.bitField0_;
        groupId = other.groupId;
        retcode = other.retcode;
        takenRewardList.copyFrom(other.takenRewardList);
      }
      return this;
    }

    @Override
    public TakeChallengeRewardScRsp mergeFrom(final TakeChallengeRewardScRsp other) {
      if (other.isEmpty()) {
        return this;
      }
      cachedSize = -1;
      if (other.hasGroupId()) {
        setGroupId(other.groupId);
      }
      if (other.hasRetcode()) {
        setRetcode(other.retcode);
      }
      if (other.hasTakenRewardList()) {
        getMutableTakenRewardList().addAll(other.takenRewardList);
      }
      return this;
    }

    @Override
    public TakeChallengeRewardScRsp clear() {
      if (isEmpty()) {
        return this;
      }
      cachedSize = -1;
      bitField0_ = 0;
      groupId = 0;
      retcode = 0;
      takenRewardList.clear();
      return this;
    }

    @Override
    public TakeChallengeRewardScRsp clearQuick() {
      if (isEmpty()) {
        return this;
      }
      cachedSize = -1;
      bitField0_ = 0;
      takenRewardList.clearQuick();
      return this;
    }

    @Override
    public boolean equals(Object o) {
      if (o == this) {
        return true;
      }
      if (!(o instanceof TakeChallengeRewardScRsp)) {
        return false;
      }
      TakeChallengeRewardScRsp other = (TakeChallengeRewardScRsp) o;
      return bitField0_ == other.bitField0_
        && (!hasGroupId() || groupId == other.groupId)
        && (!hasRetcode() || retcode == other.retcode)
        && (!hasTakenRewardList() || takenRewardList.equals(other.takenRewardList));
    }

    @Override
    public void writeTo(final ProtoSink output) throws IOException {
      if ((bitField0_ & 0x00000001) != 0) {
        output.writeRawByte((byte) 80);
        output.writeUInt32NoTag(groupId);
      }
      if ((bitField0_ & 0x00000002) != 0) {
        output.writeRawByte((byte) 88);
        output.writeUInt32NoTag(retcode);
      }
      if ((bitField0_ & 0x00000004) != 0) {
        for (int i = 0; i < takenRewardList.length(); i++) {
          output.writeRawByte((byte) 42);
          output.writeMessageNoTag(takenRewardList.get(i));
        }
      }
    }

    @Override
    protected int computeSerializedSize() {
      int size = 0;
      if ((bitField0_ & 0x00000001) != 0) {
        size += 1 + ProtoSink.computeUInt32SizeNoTag(groupId);
      }
      if ((bitField0_ & 0x00000002) != 0) {
        size += 1 + ProtoSink.computeUInt32SizeNoTag(retcode);
      }
      if ((bitField0_ & 0x00000004) != 0) {
        size += (1 * takenRewardList.length()) + ProtoSink.computeRepeatedMessageSizeNoTag(takenRewardList);
      }
      return size;
    }

    @Override
    @SuppressWarnings("fallthrough")
    public TakeChallengeRewardScRsp mergeFrom(final ProtoSource input) throws IOException {
      // Enabled Fall-Through Optimization (QuickBuffers)
      int tag = input.readTag();
      while (true) {
        switch (tag) {
          case 80: {
            // groupId
            groupId = input.readUInt32();
            bitField0_ |= 0x00000001;
            tag = input.readTag();
            if (tag != 88) {
              break;
            }
          }
          case 88: {
            // retcode
            retcode = input.readUInt32();
            bitField0_ |= 0x00000002;
            tag = input.readTag();
            if (tag != 42) {
              break;
            }
          }
          case 42: {
            // takenRewardList
            tag = input.readRepeatedMessage(takenRewardList, tag);
            bitField0_ |= 0x00000004;
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
        output.writeUInt32(FieldNames.groupId, groupId);
      }
      if ((bitField0_ & 0x00000002) != 0) {
        output.writeUInt32(FieldNames.retcode, retcode);
      }
      if ((bitField0_ & 0x00000004) != 0) {
        output.writeRepeatedMessage(FieldNames.takenRewardList, takenRewardList);
      }
      output.endObject();
    }

    @Override
    public TakeChallengeRewardScRsp mergeFrom(final JsonSource input) throws IOException {
      if (!input.beginObject()) {
        return this;
      }
      while (!input.isAtEnd()) {
        switch (input.readFieldHash()) {
          case 293428218:
          case 506361563: {
            if (input.isAtField(FieldNames.groupId)) {
              if (!input.trySkipNullValue()) {
                groupId = input.readUInt32();
                bitField0_ |= 0x00000001;
              }
            } else {
              input.skipUnknownField();
            }
            break;
          }
          case 1097936398: {
            if (input.isAtField(FieldNames.retcode)) {
              if (!input.trySkipNullValue()) {
                retcode = input.readUInt32();
                bitField0_ |= 0x00000002;
              }
            } else {
              input.skipUnknownField();
            }
            break;
          }
          case -600805228:
          case 1027082294: {
            if (input.isAtField(FieldNames.takenRewardList)) {
              if (!input.trySkipNullValue()) {
                input.readRepeatedMessage(takenRewardList);
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
    public TakeChallengeRewardScRsp clone() {
      return new TakeChallengeRewardScRsp().copyFrom(this);
    }

    @Override
    public boolean isEmpty() {
      return ((bitField0_) == 0);
    }

    public static TakeChallengeRewardScRsp parseFrom(final byte[] data) throws
        InvalidProtocolBufferException {
      return ProtoMessage.mergeFrom(new TakeChallengeRewardScRsp(), data).checkInitialized();
    }

    public static TakeChallengeRewardScRsp parseFrom(final ProtoSource input) throws IOException {
      return ProtoMessage.mergeFrom(new TakeChallengeRewardScRsp(), input).checkInitialized();
    }

    public static TakeChallengeRewardScRsp parseFrom(final JsonSource input) throws IOException {
      return ProtoMessage.mergeFrom(new TakeChallengeRewardScRsp(), input).checkInitialized();
    }

    /**
     * @return factory for creating TakeChallengeRewardScRsp messages
     */
    public static MessageFactory<TakeChallengeRewardScRsp> getFactory() {
      return TakeChallengeRewardScRspFactory.INSTANCE;
    }

    private enum TakeChallengeRewardScRspFactory implements MessageFactory<TakeChallengeRewardScRsp> {
      INSTANCE;

      @Override
      public TakeChallengeRewardScRsp create() {
        return TakeChallengeRewardScRsp.newInstance();
      }
    }

    /**
     * Contains name constants used for serializing JSON
     */
    static class FieldNames {
      static final FieldName groupId = FieldName.forField("groupId", "group_id");

      static final FieldName retcode = FieldName.forField("retcode");

      static final FieldName takenRewardList = FieldName.forField("takenRewardList", "taken_reward_list");
    }
  }
}
