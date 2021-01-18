/**
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
/**
 * Autogenerated by Thrift Compiler (0.13.0)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package org.apache.zeppelin.interpreter.thrift;

@SuppressWarnings({"cast", "rawtypes", "serial", "unchecked", "unused"})
@javax.annotation.Generated(value = "Autogenerated by Thrift Compiler (0.13.0)", date = "2020-09-22")
public class OutputUpdateAllEvent implements org.apache.thrift.TBase<OutputUpdateAllEvent, OutputUpdateAllEvent._Fields>, java.io.Serializable, Cloneable, Comparable<OutputUpdateAllEvent> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("OutputUpdateAllEvent");

  private static final org.apache.thrift.protocol.TField NOTE_ID_FIELD_DESC = new org.apache.thrift.protocol.TField("noteId", org.apache.thrift.protocol.TType.STRING, (short)1);
  private static final org.apache.thrift.protocol.TField PARAGRAPH_ID_FIELD_DESC = new org.apache.thrift.protocol.TField("paragraphId", org.apache.thrift.protocol.TType.STRING, (short)2);
  private static final org.apache.thrift.protocol.TField MSG_FIELD_DESC = new org.apache.thrift.protocol.TField("msg", org.apache.thrift.protocol.TType.LIST, (short)3);

  private static final org.apache.thrift.scheme.SchemeFactory STANDARD_SCHEME_FACTORY = new OutputUpdateAllEventStandardSchemeFactory();
  private static final org.apache.thrift.scheme.SchemeFactory TUPLE_SCHEME_FACTORY = new OutputUpdateAllEventTupleSchemeFactory();

  public @org.apache.thrift.annotation.Nullable java.lang.String noteId; // required
  public @org.apache.thrift.annotation.Nullable java.lang.String paragraphId; // required
  public @org.apache.thrift.annotation.Nullable java.util.List<org.apache.zeppelin.interpreter.thrift.RemoteInterpreterResultMessage> msg; // required

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    NOTE_ID((short)1, "noteId"),
    PARAGRAPH_ID((short)2, "paragraphId"),
    MSG((short)3, "msg");

    private static final java.util.Map<java.lang.String, _Fields> byName = new java.util.HashMap<java.lang.String, _Fields>();

    static {
      for (_Fields field : java.util.EnumSet.allOf(_Fields.class)) {
        byName.put(field.getFieldName(), field);
      }
    }

    /**
     * Find the _Fields constant that matches fieldId, or null if its not found.
     */
    @org.apache.thrift.annotation.Nullable
    public static _Fields findByThriftId(int fieldId) {
      switch(fieldId) {
        case 1: // NOTE_ID
          return NOTE_ID;
        case 2: // PARAGRAPH_ID
          return PARAGRAPH_ID;
        case 3: // MSG
          return MSG;
        default:
          return null;
      }
    }

    /**
     * Find the _Fields constant that matches fieldId, throwing an exception
     * if it is not found.
     */
    public static _Fields findByThriftIdOrThrow(int fieldId) {
      _Fields fields = findByThriftId(fieldId);
      if (fields == null) throw new java.lang.IllegalArgumentException("Field " + fieldId + " doesn't exist!");
      return fields;
    }

    /**
     * Find the _Fields constant that matches name, or null if its not found.
     */
    @org.apache.thrift.annotation.Nullable
    public static _Fields findByName(java.lang.String name) {
      return byName.get(name);
    }

    private final short _thriftId;
    private final java.lang.String _fieldName;

    _Fields(short thriftId, java.lang.String fieldName) {
      _thriftId = thriftId;
      _fieldName = fieldName;
    }

    public short getThriftFieldId() {
      return _thriftId;
    }

    public java.lang.String getFieldName() {
      return _fieldName;
    }
  }

  // isset id assignments
  public static final java.util.Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    java.util.Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new java.util.EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.NOTE_ID, new org.apache.thrift.meta_data.FieldMetaData("noteId", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.PARAGRAPH_ID, new org.apache.thrift.meta_data.FieldMetaData("paragraphId", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.MSG, new org.apache.thrift.meta_data.FieldMetaData("msg", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.ListMetaData(org.apache.thrift.protocol.TType.LIST, 
            new org.apache.thrift.meta_data.StructMetaData(org.apache.thrift.protocol.TType.STRUCT, org.apache.zeppelin.interpreter.thrift.RemoteInterpreterResultMessage.class))));
    metaDataMap = java.util.Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(OutputUpdateAllEvent.class, metaDataMap);
  }

  public OutputUpdateAllEvent() {
  }

  public OutputUpdateAllEvent(
    java.lang.String noteId,
    java.lang.String paragraphId,
    java.util.List<org.apache.zeppelin.interpreter.thrift.RemoteInterpreterResultMessage> msg)
  {
    this();
    this.noteId = noteId;
    this.paragraphId = paragraphId;
    this.msg = msg;
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public OutputUpdateAllEvent(OutputUpdateAllEvent other) {
    if (other.isSetNoteId()) {
      this.noteId = other.noteId;
    }
    if (other.isSetParagraphId()) {
      this.paragraphId = other.paragraphId;
    }
    if (other.isSetMsg()) {
      java.util.List<org.apache.zeppelin.interpreter.thrift.RemoteInterpreterResultMessage> __this__msg = new java.util.ArrayList<org.apache.zeppelin.interpreter.thrift.RemoteInterpreterResultMessage>(other.msg.size());
      for (org.apache.zeppelin.interpreter.thrift.RemoteInterpreterResultMessage other_element : other.msg) {
        __this__msg.add(new org.apache.zeppelin.interpreter.thrift.RemoteInterpreterResultMessage(other_element));
      }
      this.msg = __this__msg;
    }
  }

  public OutputUpdateAllEvent deepCopy() {
    return new OutputUpdateAllEvent(this);
  }

  @Override
  public void clear() {
    this.noteId = null;
    this.paragraphId = null;
    this.msg = null;
  }

  @org.apache.thrift.annotation.Nullable
  public java.lang.String getNoteId() {
    return this.noteId;
  }

  public OutputUpdateAllEvent setNoteId(@org.apache.thrift.annotation.Nullable java.lang.String noteId) {
    this.noteId = noteId;
    return this;
  }

  public void unsetNoteId() {
    this.noteId = null;
  }

  /** Returns true if field noteId is set (has been assigned a value) and false otherwise */
  public boolean isSetNoteId() {
    return this.noteId != null;
  }

  public void setNoteIdIsSet(boolean value) {
    if (!value) {
      this.noteId = null;
    }
  }

  @org.apache.thrift.annotation.Nullable
  public java.lang.String getParagraphId() {
    return this.paragraphId;
  }

  public OutputUpdateAllEvent setParagraphId(@org.apache.thrift.annotation.Nullable java.lang.String paragraphId) {
    this.paragraphId = paragraphId;
    return this;
  }

  public void unsetParagraphId() {
    this.paragraphId = null;
  }

  /** Returns true if field paragraphId is set (has been assigned a value) and false otherwise */
  public boolean isSetParagraphId() {
    return this.paragraphId != null;
  }

  public void setParagraphIdIsSet(boolean value) {
    if (!value) {
      this.paragraphId = null;
    }
  }

  public int getMsgSize() {
    return (this.msg == null) ? 0 : this.msg.size();
  }

  @org.apache.thrift.annotation.Nullable
  public java.util.Iterator<org.apache.zeppelin.interpreter.thrift.RemoteInterpreterResultMessage> getMsgIterator() {
    return (this.msg == null) ? null : this.msg.iterator();
  }

  public void addToMsg(org.apache.zeppelin.interpreter.thrift.RemoteInterpreterResultMessage elem) {
    if (this.msg == null) {
      this.msg = new java.util.ArrayList<org.apache.zeppelin.interpreter.thrift.RemoteInterpreterResultMessage>();
    }
    this.msg.add(elem);
  }

  @org.apache.thrift.annotation.Nullable
  public java.util.List<org.apache.zeppelin.interpreter.thrift.RemoteInterpreterResultMessage> getMsg() {
    return this.msg;
  }

  public OutputUpdateAllEvent setMsg(@org.apache.thrift.annotation.Nullable java.util.List<org.apache.zeppelin.interpreter.thrift.RemoteInterpreterResultMessage> msg) {
    this.msg = msg;
    return this;
  }

  public void unsetMsg() {
    this.msg = null;
  }

  /** Returns true if field msg is set (has been assigned a value) and false otherwise */
  public boolean isSetMsg() {
    return this.msg != null;
  }

  public void setMsgIsSet(boolean value) {
    if (!value) {
      this.msg = null;
    }
  }

  public void setFieldValue(_Fields field, @org.apache.thrift.annotation.Nullable java.lang.Object value) {
    switch (field) {
    case NOTE_ID:
      if (value == null) {
        unsetNoteId();
      } else {
        setNoteId((java.lang.String)value);
      }
      break;

    case PARAGRAPH_ID:
      if (value == null) {
        unsetParagraphId();
      } else {
        setParagraphId((java.lang.String)value);
      }
      break;

    case MSG:
      if (value == null) {
        unsetMsg();
      } else {
        setMsg((java.util.List<org.apache.zeppelin.interpreter.thrift.RemoteInterpreterResultMessage>)value);
      }
      break;

    }
  }

  @org.apache.thrift.annotation.Nullable
  public java.lang.Object getFieldValue(_Fields field) {
    switch (field) {
    case NOTE_ID:
      return getNoteId();

    case PARAGRAPH_ID:
      return getParagraphId();

    case MSG:
      return getMsg();

    }
    throw new java.lang.IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new java.lang.IllegalArgumentException();
    }

    switch (field) {
    case NOTE_ID:
      return isSetNoteId();
    case PARAGRAPH_ID:
      return isSetParagraphId();
    case MSG:
      return isSetMsg();
    }
    throw new java.lang.IllegalStateException();
  }

  @Override
  public boolean equals(java.lang.Object that) {
    if (that == null)
      return false;
    if (that instanceof OutputUpdateAllEvent)
      return this.equals((OutputUpdateAllEvent)that);
    return false;
  }

  public boolean equals(OutputUpdateAllEvent that) {
    if (that == null)
      return false;
    if (this == that)
      return true;

    boolean this_present_noteId = true && this.isSetNoteId();
    boolean that_present_noteId = true && that.isSetNoteId();
    if (this_present_noteId || that_present_noteId) {
      if (!(this_present_noteId && that_present_noteId))
        return false;
      if (!this.noteId.equals(that.noteId))
        return false;
    }

    boolean this_present_paragraphId = true && this.isSetParagraphId();
    boolean that_present_paragraphId = true && that.isSetParagraphId();
    if (this_present_paragraphId || that_present_paragraphId) {
      if (!(this_present_paragraphId && that_present_paragraphId))
        return false;
      if (!this.paragraphId.equals(that.paragraphId))
        return false;
    }

    boolean this_present_msg = true && this.isSetMsg();
    boolean that_present_msg = true && that.isSetMsg();
    if (this_present_msg || that_present_msg) {
      if (!(this_present_msg && that_present_msg))
        return false;
      if (!this.msg.equals(that.msg))
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    int hashCode = 1;

    hashCode = hashCode * 8191 + ((isSetNoteId()) ? 131071 : 524287);
    if (isSetNoteId())
      hashCode = hashCode * 8191 + noteId.hashCode();

    hashCode = hashCode * 8191 + ((isSetParagraphId()) ? 131071 : 524287);
    if (isSetParagraphId())
      hashCode = hashCode * 8191 + paragraphId.hashCode();

    hashCode = hashCode * 8191 + ((isSetMsg()) ? 131071 : 524287);
    if (isSetMsg())
      hashCode = hashCode * 8191 + msg.hashCode();

    return hashCode;
  }

  @Override
  public int compareTo(OutputUpdateAllEvent other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;

    lastComparison = java.lang.Boolean.valueOf(isSetNoteId()).compareTo(other.isSetNoteId());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetNoteId()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.noteId, other.noteId);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = java.lang.Boolean.valueOf(isSetParagraphId()).compareTo(other.isSetParagraphId());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetParagraphId()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.paragraphId, other.paragraphId);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = java.lang.Boolean.valueOf(isSetMsg()).compareTo(other.isSetMsg());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetMsg()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.msg, other.msg);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    return 0;
  }

  @org.apache.thrift.annotation.Nullable
  public _Fields fieldForId(int fieldId) {
    return _Fields.findByThriftId(fieldId);
  }

  public void read(org.apache.thrift.protocol.TProtocol iprot) throws org.apache.thrift.TException {
    scheme(iprot).read(iprot, this);
  }

  public void write(org.apache.thrift.protocol.TProtocol oprot) throws org.apache.thrift.TException {
    scheme(oprot).write(oprot, this);
  }

  @Override
  public java.lang.String toString() {
    java.lang.StringBuilder sb = new java.lang.StringBuilder("OutputUpdateAllEvent(");
    boolean first = true;

    sb.append("noteId:");
    if (this.noteId == null) {
      sb.append("null");
    } else {
      sb.append(this.noteId);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("paragraphId:");
    if (this.paragraphId == null) {
      sb.append("null");
    } else {
      sb.append(this.paragraphId);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("msg:");
    if (this.msg == null) {
      sb.append("null");
    } else {
      sb.append(this.msg);
    }
    first = false;
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws org.apache.thrift.TException {
    // check for required fields
    // check for sub-struct validity
  }

  private void writeObject(java.io.ObjectOutputStream out) throws java.io.IOException {
    try {
      write(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(out)));
    } catch (org.apache.thrift.TException te) {
      throw new java.io.IOException(te);
    }
  }

  private void readObject(java.io.ObjectInputStream in) throws java.io.IOException, java.lang.ClassNotFoundException {
    try {
      read(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(in)));
    } catch (org.apache.thrift.TException te) {
      throw new java.io.IOException(te);
    }
  }

  private static class OutputUpdateAllEventStandardSchemeFactory implements org.apache.thrift.scheme.SchemeFactory {
    public OutputUpdateAllEventStandardScheme getScheme() {
      return new OutputUpdateAllEventStandardScheme();
    }
  }

  private static class OutputUpdateAllEventStandardScheme extends org.apache.thrift.scheme.StandardScheme<OutputUpdateAllEvent> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, OutputUpdateAllEvent struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // NOTE_ID
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.noteId = iprot.readString();
              struct.setNoteIdIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 2: // PARAGRAPH_ID
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.paragraphId = iprot.readString();
              struct.setParagraphIdIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 3: // MSG
            if (schemeField.type == org.apache.thrift.protocol.TType.LIST) {
              {
                org.apache.thrift.protocol.TList _list0 = iprot.readListBegin();
                struct.msg = new java.util.ArrayList<org.apache.zeppelin.interpreter.thrift.RemoteInterpreterResultMessage>(_list0.size);
                @org.apache.thrift.annotation.Nullable org.apache.zeppelin.interpreter.thrift.RemoteInterpreterResultMessage _elem1;
                for (int _i2 = 0; _i2 < _list0.size; ++_i2)
                {
                  _elem1 = new org.apache.zeppelin.interpreter.thrift.RemoteInterpreterResultMessage();
                  _elem1.read(iprot);
                  struct.msg.add(_elem1);
                }
                iprot.readListEnd();
              }
              struct.setMsgIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          default:
            org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
        }
        iprot.readFieldEnd();
      }
      iprot.readStructEnd();

      // check for required fields of primitive type, which can't be checked in the validate method
      struct.validate();
    }

    public void write(org.apache.thrift.protocol.TProtocol oprot, OutputUpdateAllEvent struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      if (struct.noteId != null) {
        oprot.writeFieldBegin(NOTE_ID_FIELD_DESC);
        oprot.writeString(struct.noteId);
        oprot.writeFieldEnd();
      }
      if (struct.paragraphId != null) {
        oprot.writeFieldBegin(PARAGRAPH_ID_FIELD_DESC);
        oprot.writeString(struct.paragraphId);
        oprot.writeFieldEnd();
      }
      if (struct.msg != null) {
        oprot.writeFieldBegin(MSG_FIELD_DESC);
        {
          oprot.writeListBegin(new org.apache.thrift.protocol.TList(org.apache.thrift.protocol.TType.STRUCT, struct.msg.size()));
          for (org.apache.zeppelin.interpreter.thrift.RemoteInterpreterResultMessage _iter3 : struct.msg)
          {
            _iter3.write(oprot);
          }
          oprot.writeListEnd();
        }
        oprot.writeFieldEnd();
      }
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class OutputUpdateAllEventTupleSchemeFactory implements org.apache.thrift.scheme.SchemeFactory {
    public OutputUpdateAllEventTupleScheme getScheme() {
      return new OutputUpdateAllEventTupleScheme();
    }
  }

  private static class OutputUpdateAllEventTupleScheme extends org.apache.thrift.scheme.TupleScheme<OutputUpdateAllEvent> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, OutputUpdateAllEvent struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TTupleProtocol oprot = (org.apache.thrift.protocol.TTupleProtocol) prot;
      java.util.BitSet optionals = new java.util.BitSet();
      if (struct.isSetNoteId()) {
        optionals.set(0);
      }
      if (struct.isSetParagraphId()) {
        optionals.set(1);
      }
      if (struct.isSetMsg()) {
        optionals.set(2);
      }
      oprot.writeBitSet(optionals, 3);
      if (struct.isSetNoteId()) {
        oprot.writeString(struct.noteId);
      }
      if (struct.isSetParagraphId()) {
        oprot.writeString(struct.paragraphId);
      }
      if (struct.isSetMsg()) {
        {
          oprot.writeI32(struct.msg.size());
          for (org.apache.zeppelin.interpreter.thrift.RemoteInterpreterResultMessage _iter4 : struct.msg)
          {
            _iter4.write(oprot);
          }
        }
      }
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, OutputUpdateAllEvent struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TTupleProtocol iprot = (org.apache.thrift.protocol.TTupleProtocol) prot;
      java.util.BitSet incoming = iprot.readBitSet(3);
      if (incoming.get(0)) {
        struct.noteId = iprot.readString();
        struct.setNoteIdIsSet(true);
      }
      if (incoming.get(1)) {
        struct.paragraphId = iprot.readString();
        struct.setParagraphIdIsSet(true);
      }
      if (incoming.get(2)) {
        {
          org.apache.thrift.protocol.TList _list5 = new org.apache.thrift.protocol.TList(org.apache.thrift.protocol.TType.STRUCT, iprot.readI32());
          struct.msg = new java.util.ArrayList<org.apache.zeppelin.interpreter.thrift.RemoteInterpreterResultMessage>(_list5.size);
          @org.apache.thrift.annotation.Nullable org.apache.zeppelin.interpreter.thrift.RemoteInterpreterResultMessage _elem6;
          for (int _i7 = 0; _i7 < _list5.size; ++_i7)
          {
            _elem6 = new org.apache.zeppelin.interpreter.thrift.RemoteInterpreterResultMessage();
            _elem6.read(iprot);
            struct.msg.add(_elem6);
          }
        }
        struct.setMsgIsSet(true);
      }
    }
  }

  private static <S extends org.apache.thrift.scheme.IScheme> S scheme(org.apache.thrift.protocol.TProtocol proto) {
    return (org.apache.thrift.scheme.StandardScheme.class.equals(proto.getScheme()) ? STANDARD_SCHEME_FACTORY : TUPLE_SCHEME_FACTORY).getScheme();
  }
}

