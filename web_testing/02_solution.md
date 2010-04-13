!SLIDE
# DSL for web testing *our* app

    @@@ Scala
    class WebTestLogin extends WebTestSpec { 
      page("protected",
           (page:PageSpecification) => {

        page.requiresLogin()
        page.shouldContain(
          "Hello Dave").inElement("h1")
      })
    }

!SLIDE 
# Smooth the learning curve

!SLIDE bullets incremental
# Ground Rules for DSL
* Consistent syntax
* No new operators
* Minimize new concepts

!SLIDE small
# How many new concepts?

    @@@ Scala
    class WebTestLogin extends WebTestSpec { 
      page("protected", // *1*
           (page:PageSpecification) => { // *2,3*

        page.requiresLogin()
        page.shouldContain(
          "Hello Dave").inElement("h1")
      })
    }

!SLIDE 
# [1] Basic Syntax - constructor code

    @@@ Scala
    class WebTestLogin extends WebTestSpec {
      page("protected", // *1* ...

!SLIDE
# [2] types come after a <code>:</code>

    @@@ Scala
    class WebTestLogin extends WebTestSpec { 
      page("protected", // *1*
           (page:PageSpecification) => { // *2*

!SLIDE
# [3] Anonymous functions/closures

    @@@ Scala
    class WebTestLogin extends WebTestSpec { 
      page("protected",
           (page:PageSpecification) => { // *3*
            ^^^^param               ^^^^function

!SLIDE bullets incremental
# Reinforces familiar concepts

* Dots - x.y == method call - easy to understand
* <code>page</code> - has an obvious type, we can look up its methods

!SLIDE small bullets incremental
# Ground Rules for Implementation
* Had a weekend to build it
* Mixins, Case Classes, Collections &mdash; All fair game
* Imperative/OO design

!SLIDE small bullets incremental
# Ground Rules for Implementation
* Avoid (initially) confusing features
* No implicits
* Minimize type parameters

!SLIDE small bullets incremental
# Ground Rules for Implementation
* Tutorial, scaffolds, documentation
* Lots of scaladoc
* "How" and "What" Comments

!SLIDE  bullets incremental
# Couldn't this have been done in Java?
* Certainly, but...

!SLIDE 
# DSL implementation would've taken too long in Java

