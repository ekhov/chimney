// Generated by the Scala Plugin for the Protocol Buffer Compiler.
// Do not edit!
//
// Protofile syntax: PROTO3

package io.scalaland.chimney.examples.pb.order

@SerialVersionUID(0L)
final case class Order(
    lines: _root_.scala.Seq[io.scalaland.chimney.examples.pb.order.OrderLine] = _root_.scala.Seq.empty,
    customer: _root_.scala.Option[io.scalaland.chimney.examples.pb.order.Customer] = _root_.scala.None
)
