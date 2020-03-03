package com.baeldung.scala

import org.scalatest.{Matchers, WordSpec}

class TuplesUnitTest extends WordSpec with Matchers {
  val tuple = ("Joe", 34)

  "Tuples" should {
    "accessing values use _.1, _.2 syntax" in {
      tuple._1 shouldBe "Joe"
      tuple._2 shouldBe 34
    }
    "accessing values using pattern matching" in {
      val (name, age) = tuple
      name shouldBe "Joe"
      age shouldBe 34
    }
    "not contain more then 22 elements" in {
      "(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23)" shouldNot compile
    }
  }

  "Tuples2" should {
    "return product arity" in {
      tuple.productArity shouldBe 2
    }
    "return product prefix" in {
      tuple.productPrefix shouldBe "Tuple2"
    }
    "return product iterator" in {
      val iterator = tuple.productIterator
      iterator.map(_.toString).toList shouldBe List("Joe", "34")
    }
    "swap elements" in {
      tuple.swap shouldBe (34, "Joe")
    }
  }
}
