// Generated by the Scala Plugin for the Protocol Buffer Compiler.
// Do not edit!
//
// Protofile syntax: PROTO3

package io.scalaland.chimney.examples.pb.addressbook

/** @param id
  *   Unique ID number for this person.
  */
@SerialVersionUID(0L)
final case class Person(
    name: _root_.scala.Predef.String = "",
    id: _root_.scala.Int = 0,
    email: _root_.scala.Predef.String = "",
    phones: _root_.scala.collection.Seq[io.scalaland.chimney.examples.pb.addressbook.PhoneNumber] =
      _root_.scala.collection.Seq.empty
)
