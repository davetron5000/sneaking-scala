!SLIDE
# Not so fast

    @@@ Scala
    class WebTestLogin extends WebTestSpec { 
      page("protected",
           (page:PageSpecification) => {

        page.requiresLogin
        page.shouldContain(
          "Hello Dave").inElement("h1")
      })
    }

!SLIDE 
# Smooth the learning curve

!SLIDE bullets incremental
# Ground Rules for DSL
* Consistent syntax
* Minimize new concepts
* No new operators

!SLIDE small
# How many new concepts?

    @@@ Scala
    class WebTestLogin extends WebTestSpec { 
      page("protected", // *1*
           (page:PageSpecification) => { // *2,3*

        page.requiresLogin
        page.shouldContain(
          "Hello Dave").inElement("h1")
      })
    }

!SLIDE bullets incremental
# How many new concepts?

* *[1].* Scala syntax - this is constructor code
* *[2].* types come after a <code>:</code>
* *[3].* Functions/closures - <code>(page) => {</code> is a function literal
 
!SLIDE bullets incremental
# Familiar concepts

* Dots - x.y == method call - easy to grok
* <code>page</code> - has an obvious type, we can look up its methods
* Braces - they define a scope

!SLIDE small bullets incremental
# Ground Rules for Implementation
* Mixins
* Case Classes
* Collections
* All fair game

!SLIDE small bullets incremental
# Ground Rules for Implementation
* No implicits
* Imperative/OO design
* Minimze type parameters
* No f!%$%ing underscore
* Lots of scaladoc
* "How" and "What" Comments

!SLIDE small
# Comments

    @@@ Scala
    class Foo {
      // Scala tip: this means that we require
      // that instances of Foo be "mixed in" with
      // Bar; it's called self-type
      this: Bar => 
      ...
    }

!SLIDE 
# Couldn't this have been done in Java?

!SLIDE 
# Certainly, but...

!SLIDE 
# Implementation would've been rough

!SLIDE 
# Scala's good at wrapping APIs

!SLIDE 
# Mixins are better for re-use than single inheritance

!SLIDE 
# Collections + Closures simplify many things

!SLIDE
# DSL implementation would've taken too long in Java
