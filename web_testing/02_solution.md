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

!SLIDE bullets incremental
# How many new concepts?

* *[1].* Scala syntax - this is constructor code
* *[2].* types come after a <code>:</code>
* *[3].* Functions/closures - <code>(page) => {</code> is a function literal
 
!SLIDE bullets incremental
# Reinforce familiar concepts

* Dots - x.y == method call - easy to grok
* <code>page</code> - has an obvious type, we can look up its methods

!SLIDE small bullets incremental
# Ground Rules for Implementation
* Had a weekend to build it
* Mixins
* Case Classes
* Collections
* All fair game

!SLIDE small bullets incremental
# Ground Rules for Implementation
* No implicits
* Imperative/OO design
* Minimze type parameters
* Lots of scaladoc
* "How" and "What" Comments
* No f!%$%ing underscore :)

!SLIDE  bullets incremental
# Couldn't this have been done in Java?
* Certainly, but...

!SLIDE 
# DSL implementation would've taken too long in Java

